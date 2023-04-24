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
	// embed is used to store bridge-metadata.json in the compiled binary
	_ "embed"
	"path/filepath"
	"unicode"

	onelogin "github.com/onelogin/terraform-provider-onelogin/shim"
	"github.com/pulumi/pulumi-onelogin/provider/pkg/version"
	"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge"
	"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge/x"
	shim "github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfshim"
	shimv2 "github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfshim/sdk-v2"
	"github.com/pulumi/pulumi/sdk/v3/go/common/resource"
	"github.com/pulumi/pulumi/sdk/v3/go/common/tokens"
	"github.com/pulumi/pulumi/sdk/v3/go/common/util/contract"
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

// preConfigureCallback is called before the providerConfigure function of the underlying provider.
// It should validate that the provider can be configured, and provide actionable errors in the case
// it cannot be. Configuration variables can be read from `vars` using the `stringValue` function -
// for example `stringValue(vars, "accessKey")`.
func preConfigureCallback(vars resource.PropertyMap, c shim.ResourceConfig) error {
	return nil
}

// Provider returns additional overlaid schema and metadata associated with the provider..
func Provider() tfbridge.ProviderInfo {
	// Instantiate the Terraform provider

	provider, err := onelogin.Provider()
	contract.AssertNoErrorf(err, "Failed to create provider")
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

		Config: map[string]*tfbridge.SchemaInfo{
			// Add any required configuration here, or remove the example below if
			// no additional points are required.
			// "region": {
			// 	Type: makeType("region", "Region"),
			// 	Default: &tfbridge.DefaultInfo{
			// 		EnvVars: []string{"AWS_REGION", "AWS_DEFAULT_REGION"},
			// 	},
			// },
		},
		PreConfigureCallback: preConfigureCallback,
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
		},
		DataSources: map[string]*tfbridge.DataSourceInfo{
			"onelogin_mappings":   {Tok: makeDataSource(mainMod, "getMappings")},
			"onelogin_privileges": {Tok: makeDataSource(mainMod, "getPrivileges")},
			"onelogin_roles":      {Tok: makeDataSource("roles", "getRoles")},
			"onelogin_rules":      {Tok: makeDataSource("rules", "getRules")},
			"onelogin_users":      {Tok: makeDataSource("users", "getUsers")},
		},
		JavaScript: &tfbridge.JavaScriptInfo{
			// List any npm dependencies and their versions
			Dependencies: map[string]string{
				"@pulumi/pulumi": "^3.0.0",
			},
			DevDependencies: map[string]string{
				"@types/node": "^10.0.0", // so we can access strongly typed node definitions.
				"@types/mime": "^2.0.0",
			},
			// See the documentation for tfbridge.OverlayInfo for how to lay out this
			// section, or refer to the AWS provider. Delete this section if there are
			// no overlay files.
			//Overlay: &tfbridge.OverlayInfo{},
		},
		Python: &tfbridge.PythonInfo{
			// List any Python dependencies and their version ranges
			Requires: map[string]string{
				"pulumi": ">=3.0.0,<4.0.0",
			},
		},
		Golang: &tfbridge.GolangInfo{
			ImportBasePath: filepath.Join(
				fmt.Sprintf("github.com/pulumi/pulumi-%[1]s/sdk/", mainPkg),
				tfbridge.GetModuleMajorVersion(version.Version),
				"go",
				mainPkg,
			),
			GenerateResourceContainerTypes: true,
		},
		CSharp: &tfbridge.CSharpInfo{
			PackageReferences: map[string]string{
				"Pulumi":                       "3.*",
				"System.Collections.Immutable": "5.0.0",
			},
		},
	}

	err = x.ComputeDefaults(&prov, x.TokensKnownModules("onelogin_",
		mainMod, []string{
			"api_",
			"apps_",
			"roles_",
			"rules_",
			"users_",
		}, x.MakeStandardToken(mainPkg)))
	contract.AssertNoErrorf(err, "failed to compute default mappings")
	err = x.AutoAliasing(&prov, prov.GetMetadata())
	contract.AssertNoErrorf(err, "auto aliasing apply failed")

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
