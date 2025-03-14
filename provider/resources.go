// Copyright 2016-2018, Pulumi Corporation.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package onelogin

import (
	"fmt"
	"path/filepath"
	"unicode"

	// embed is used to store bridge-metadata.json in the compiled binary
	_ "embed"

	onelogin "github.com/onelogin/terraform-provider-onelogin/onelogin"
	"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge"
	tfbridgetokens "github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge/tokens"
	shimv2 "github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfshim/sdk-v2"
	"github.com/pulumi/pulumi/sdk/v3/go/common/tokens"

	"github.com/pulumi/pulumi-onelogin/provider/pkg/version"
)

// all of the token components used below.
const (
	// packages:
	mainPkg = "onelogin"
	// modules:
	mainMod = "index" // the y module
)

// makeMember manufactures a type token for the package and the given module and type.
func makeMember(mod string, mem string) tokens.ModuleMember {
	return tokens.ModuleMember(mainPkg + ":" + mod + ":" + mem)
}

// makeType manufactures a type token for the package and the given module and type.
func makeType(mod string, typ string) tokens.Type {
	return tokens.Type(makeMember(mod, typ))
}

// makeDataSource manufactures a standard resource token given a module and resource name.  It
// automatically uses the main package and names the file by simply lower casing the data source's
// first character.
func makeDataSource(mod string, res string) tokens.ModuleMember {
	fn := string(unicode.ToLower(rune(res[0]))) + res[1:]
	return makeMember(mod+"/"+fn, res)
}

// makeResource manufactures a standard resource token given a module and resource name.  It
// automatically uses the main package and names the file by simply lower casing the resource's
// first character.
func makeResource(mod string, res string) tokens.Type {
	fn := string(unicode.ToLower(rune(res[0]))) + res[1:]
	return makeType(mod+"/"+fn, res)
}

// Provider returns additional overlaid schema and metadata associated with the provider..
func Provider() tfbridge.ProviderInfo {
	// Instantiate the Terraform provider

	provider := onelogin.Provider()
	p := shimv2.NewProvider(provider)

	// Create a Pulumi provider mapping
	prov := tfbridge.ProviderInfo{
		P:                p,
		Name:             "onelogin",
		Description:      "A Pulumi package for creating and managing OneLogin cloud resources.",
		Keywords:         []string{"pulumi", "onelogin"},
		License:          "Apache-2.0",
		Homepage:         "https://pulumi.io",
		Repository:       "https://github.com/pulumi/pulumi-onelogin",
		GitHubOrg:        "onelogin",
		UpstreamRepoPath: "../upstream",
		MetadataInfo:     tfbridge.NewProviderMetadata(metadata),
		Resources: map[string]*tfbridge.ResourceInfo{
			"onelogin_apps": {
				Tok: makeResource(mainMod, "App"),
				Docs: &tfbridge.DocInfo{
					Source: "onelogin_app.md",
				},
			},
			"onelogin_users": {
				Tok: makeResource(mainMod, "User"),
				Docs: &tfbridge.DocInfo{
					Source: "onelogin_user.md",
				},
			},
			"onelogin_roles": {
				Tok: makeResource(mainMod, "Role"),
			},
			"onelogin_smarthooks": {
				Tok: makeResource(mainMod, "SmartHook"),
			},
		},
		DataSources: map[string]*tfbridge.DataSourceInfo{
			"onelogin_users": {Tok: makeDataSource("users", "getUsers")},
			"onelogin_user":  {Tok: makeDataSource("users", "getUser")},
		},
		JavaScript: &tfbridge.JavaScriptInfo{
			// List any npm dependencies and their versions

			DevDependencies: map[string]string{
				"@types/node": "^10.0.0", // so we can access strongly typed node definitions.
				"@types/mime": "^2.0.0",
			},
			// See the documentation for tfbridge.OverlayInfo for how to lay out this
			// section, or refer to the AWS provider. Delete this section if there are
			// no overlay files.
			// Overlay: &tfbridge.OverlayInfo{},
			RespectSchemaVersion: true,
		},
		Python: (func() *tfbridge.PythonInfo {
			i := &tfbridge.PythonInfo{
				RespectSchemaVersion: true,
			}
			i.PyProject.Enabled = true
			return i
		})(),

		Golang: &tfbridge.GolangInfo{
			ImportBasePath: filepath.Join(
				fmt.Sprintf("github.com/pulumi/pulumi-%[1]s/sdk/", mainPkg),
				tfbridge.GetModuleMajorVersion(version.Version),
				"go",
				mainPkg,
			),
			GenerateResourceContainerTypes: true,
			RespectSchemaVersion:           true,
		},
		CSharp: &tfbridge.CSharpInfo{
			RespectSchemaVersion: true,
			PackageReferences: map[string]string{
				"Pulumi":                       "3.*",
				"System.Collections.Immutable": "5.0.0",
			},
		},
	}

	prov.MustComputeTokens(tfbridgetokens.KnownModules(
		"onelogin_",
		mainMod,
		[]string{
			"api_",
			"apps_",
			"roles_",
			"rules_",
			"users_",
		}, tfbridgetokens.MakeStandard(mainPkg),
	))

	prov.MustApplyAutoAliases()

	prov.SetAutonaming(255, "-")

	for _, r := range prov.Resources {
		r.Docs = &tfbridge.DocInfo{
			Markdown: []byte(" "),
		}
	}
	for _, d := range prov.DataSources {
		d.Docs = &tfbridge.DocInfo{
			Markdown: []byte(" "),
		}
	}

	return prov
}

//go:embed cmd/pulumi-resource-onelogin/bridge-metadata.json
var metadata []byte
