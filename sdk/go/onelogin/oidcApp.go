// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package onelogin

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Creates an OIDC Application.
//
// This resource allows you to create and configure an OIDC Application.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-onelogin/sdk/go/onelogin"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := onelogin.NewOidcApp(ctx, "myOidcApp", &onelogin.OidcAppArgs{
// 			AllowAssumedSignin: pulumi.Bool(false),
// 			Configuration: pulumi.StringMap{
// 				"access_token_expiration_minutes":  pulumi.String("1"),
// 				"login_url":                        pulumi.String("https://www.example.com"),
// 				"oidc_application_type":            pulumi.String("0"),
// 				"post_logout_redirect_uri":         pulumi.String(""),
// 				"redirect_uri":                     pulumi.String("https://example.com/example"),
// 				"refresh_token_expiration_minutes": pulumi.String("1"),
// 				"token_endpoint_auth_method":       pulumi.String("1"),
// 			},
// 			ConnectorId: pulumi.Int(123456),
// 			Description: pulumi.String("example OIDC app"),
// 			Notes:       pulumi.String("example"),
// 			Parameters: OidcAppParameterArray{
// 				&OidcAppParameterArgs{
// 					AttributesTransformations: pulumi.String(""),
// 					DefaultValues:             pulumi.String(""),
// 					IncludeInSamlAssertion:    pulumi.Bool(false),
// 					Label:                     pulumi.String("example app parameter "),
// 					ParamKeyName:              pulumi.String("example"),
// 					ProvisionedEntitlements:   pulumi.Bool(false),
// 					SafeEntitlementsEnabled:   pulumi.Bool(false),
// 					SkipIfBlank:               pulumi.Bool(false),
// 					UserAttributeMacros:       pulumi.String(""),
// 					UserAttributeMappings:     pulumi.String(""),
// 					Values:                    pulumi.String(""),
// 				},
// 			},
// 			Provisioning: pulumi.BoolMap{
// 				"enabled": pulumi.Bool(false),
// 			},
// 			Visible: pulumi.Bool(true),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
//
// ## Import
//
// A OIDC App can be imported via the OneLogin App ID.
//
// ```sh
//  $ pulumi import onelogin:index/oidcApp:OidcApp my_oidc_app <app id>
// ```
type OidcApp struct {
	pulumi.CustomResourceState

	// Enable sign in when user has been assumed by the account owner. Defaults to `false`.
	AllowAssumedSignin pulumi.BoolPtrOutput `pulumi:"allowAssumedSignin"`
	// The apps auth method. Refer to the [OneLogin Apps Documentation](https://developers.onelogin.com/api-docs/2/apps/app-resource) for a comprehensive list of available auth methods.
	AuthMethod pulumi.IntOutput    `pulumi:"authMethod"`
	BrandId    pulumi.IntPtrOutput `pulumi:"brandId"`
	// OIDC settings that control the authentication flow e.g. redirect urls and token settings.
	Configuration pulumi.StringMapOutput `pulumi:"configuration"`
	// The ID for the app connector, dictates the type of app (e.g. AWS Multi-Role App).
	ConnectorId pulumi.IntOutput `pulumi:"connectorId"`
	// Timestamp for app's creation.
	CreatedAt pulumi.StringOutput `pulumi:"createdAt"`
	// App description.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// The url for the app's icon.
	IconUrl pulumi.StringOutput `pulumi:"iconUrl"`
	// The app's name.
	Name pulumi.StringOutput `pulumi:"name"`
	// Notes about the app.
	Notes pulumi.StringPtrOutput `pulumi:"notes"`
	// a list of custom parameters for this app.
	Parameters OidcAppParameterArrayOutput `pulumi:"parameters"`
	// The security policy assigned to the app.
	PolicyId pulumi.IntOutput `pulumi:"policyId"`
	// Settings regarding the app's provisioning ability.
	Provisioning pulumi.BoolMapOutput   `pulumi:"provisioning"`
	Sso          pulumi.StringMapOutput `pulumi:"sso"`
	// The tab in which to display in OneLogin portal.
	TabId pulumi.IntOutput `pulumi:"tabId"`
	// Timestamp for app's last update.
	UpdatedAt pulumi.StringOutput `pulumi:"updatedAt"`
	// Determine if app should be visible in OneLogin portal. Defaults to `true`.
	Visible pulumi.BoolPtrOutput `pulumi:"visible"`
}

// NewOidcApp registers a new resource with the given unique name, arguments, and options.
func NewOidcApp(ctx *pulumi.Context,
	name string, args *OidcAppArgs, opts ...pulumi.ResourceOption) (*OidcApp, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ConnectorId == nil {
		return nil, errors.New("invalid value for required argument 'ConnectorId'")
	}
	var resource OidcApp
	err := ctx.RegisterResource("onelogin:index/oidcApp:OidcApp", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetOidcApp gets an existing OidcApp resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetOidcApp(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *OidcAppState, opts ...pulumi.ResourceOption) (*OidcApp, error) {
	var resource OidcApp
	err := ctx.ReadResource("onelogin:index/oidcApp:OidcApp", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering OidcApp resources.
type oidcAppState struct {
	// Enable sign in when user has been assumed by the account owner. Defaults to `false`.
	AllowAssumedSignin *bool `pulumi:"allowAssumedSignin"`
	// The apps auth method. Refer to the [OneLogin Apps Documentation](https://developers.onelogin.com/api-docs/2/apps/app-resource) for a comprehensive list of available auth methods.
	AuthMethod *int `pulumi:"authMethod"`
	BrandId    *int `pulumi:"brandId"`
	// OIDC settings that control the authentication flow e.g. redirect urls and token settings.
	Configuration map[string]string `pulumi:"configuration"`
	// The ID for the app connector, dictates the type of app (e.g. AWS Multi-Role App).
	ConnectorId *int `pulumi:"connectorId"`
	// Timestamp for app's creation.
	CreatedAt *string `pulumi:"createdAt"`
	// App description.
	Description *string `pulumi:"description"`
	// The url for the app's icon.
	IconUrl *string `pulumi:"iconUrl"`
	// The app's name.
	Name *string `pulumi:"name"`
	// Notes about the app.
	Notes *string `pulumi:"notes"`
	// a list of custom parameters for this app.
	Parameters []OidcAppParameter `pulumi:"parameters"`
	// The security policy assigned to the app.
	PolicyId *int `pulumi:"policyId"`
	// Settings regarding the app's provisioning ability.
	Provisioning map[string]bool   `pulumi:"provisioning"`
	Sso          map[string]string `pulumi:"sso"`
	// The tab in which to display in OneLogin portal.
	TabId *int `pulumi:"tabId"`
	// Timestamp for app's last update.
	UpdatedAt *string `pulumi:"updatedAt"`
	// Determine if app should be visible in OneLogin portal. Defaults to `true`.
	Visible *bool `pulumi:"visible"`
}

type OidcAppState struct {
	// Enable sign in when user has been assumed by the account owner. Defaults to `false`.
	AllowAssumedSignin pulumi.BoolPtrInput
	// The apps auth method. Refer to the [OneLogin Apps Documentation](https://developers.onelogin.com/api-docs/2/apps/app-resource) for a comprehensive list of available auth methods.
	AuthMethod pulumi.IntPtrInput
	BrandId    pulumi.IntPtrInput
	// OIDC settings that control the authentication flow e.g. redirect urls and token settings.
	Configuration pulumi.StringMapInput
	// The ID for the app connector, dictates the type of app (e.g. AWS Multi-Role App).
	ConnectorId pulumi.IntPtrInput
	// Timestamp for app's creation.
	CreatedAt pulumi.StringPtrInput
	// App description.
	Description pulumi.StringPtrInput
	// The url for the app's icon.
	IconUrl pulumi.StringPtrInput
	// The app's name.
	Name pulumi.StringPtrInput
	// Notes about the app.
	Notes pulumi.StringPtrInput
	// a list of custom parameters for this app.
	Parameters OidcAppParameterArrayInput
	// The security policy assigned to the app.
	PolicyId pulumi.IntPtrInput
	// Settings regarding the app's provisioning ability.
	Provisioning pulumi.BoolMapInput
	Sso          pulumi.StringMapInput
	// The tab in which to display in OneLogin portal.
	TabId pulumi.IntPtrInput
	// Timestamp for app's last update.
	UpdatedAt pulumi.StringPtrInput
	// Determine if app should be visible in OneLogin portal. Defaults to `true`.
	Visible pulumi.BoolPtrInput
}

func (OidcAppState) ElementType() reflect.Type {
	return reflect.TypeOf((*oidcAppState)(nil)).Elem()
}

type oidcAppArgs struct {
	// Enable sign in when user has been assumed by the account owner. Defaults to `false`.
	AllowAssumedSignin *bool `pulumi:"allowAssumedSignin"`
	BrandId            *int  `pulumi:"brandId"`
	// OIDC settings that control the authentication flow e.g. redirect urls and token settings.
	Configuration map[string]string `pulumi:"configuration"`
	// The ID for the app connector, dictates the type of app (e.g. AWS Multi-Role App).
	ConnectorId int `pulumi:"connectorId"`
	// App description.
	Description *string `pulumi:"description"`
	// The app's name.
	Name *string `pulumi:"name"`
	// Notes about the app.
	Notes *string `pulumi:"notes"`
	// a list of custom parameters for this app.
	Parameters []OidcAppParameter `pulumi:"parameters"`
	// Settings regarding the app's provisioning ability.
	Provisioning map[string]bool `pulumi:"provisioning"`
	// Determine if app should be visible in OneLogin portal. Defaults to `true`.
	Visible *bool `pulumi:"visible"`
}

// The set of arguments for constructing a OidcApp resource.
type OidcAppArgs struct {
	// Enable sign in when user has been assumed by the account owner. Defaults to `false`.
	AllowAssumedSignin pulumi.BoolPtrInput
	BrandId            pulumi.IntPtrInput
	// OIDC settings that control the authentication flow e.g. redirect urls and token settings.
	Configuration pulumi.StringMapInput
	// The ID for the app connector, dictates the type of app (e.g. AWS Multi-Role App).
	ConnectorId pulumi.IntInput
	// App description.
	Description pulumi.StringPtrInput
	// The app's name.
	Name pulumi.StringPtrInput
	// Notes about the app.
	Notes pulumi.StringPtrInput
	// a list of custom parameters for this app.
	Parameters OidcAppParameterArrayInput
	// Settings regarding the app's provisioning ability.
	Provisioning pulumi.BoolMapInput
	// Determine if app should be visible in OneLogin portal. Defaults to `true`.
	Visible pulumi.BoolPtrInput
}

func (OidcAppArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*oidcAppArgs)(nil)).Elem()
}

type OidcAppInput interface {
	pulumi.Input

	ToOidcAppOutput() OidcAppOutput
	ToOidcAppOutputWithContext(ctx context.Context) OidcAppOutput
}

func (*OidcApp) ElementType() reflect.Type {
	return reflect.TypeOf((**OidcApp)(nil)).Elem()
}

func (i *OidcApp) ToOidcAppOutput() OidcAppOutput {
	return i.ToOidcAppOutputWithContext(context.Background())
}

func (i *OidcApp) ToOidcAppOutputWithContext(ctx context.Context) OidcAppOutput {
	return pulumi.ToOutputWithContext(ctx, i).(OidcAppOutput)
}

// OidcAppArrayInput is an input type that accepts OidcAppArray and OidcAppArrayOutput values.
// You can construct a concrete instance of `OidcAppArrayInput` via:
//
//          OidcAppArray{ OidcAppArgs{...} }
type OidcAppArrayInput interface {
	pulumi.Input

	ToOidcAppArrayOutput() OidcAppArrayOutput
	ToOidcAppArrayOutputWithContext(context.Context) OidcAppArrayOutput
}

type OidcAppArray []OidcAppInput

func (OidcAppArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*OidcApp)(nil)).Elem()
}

func (i OidcAppArray) ToOidcAppArrayOutput() OidcAppArrayOutput {
	return i.ToOidcAppArrayOutputWithContext(context.Background())
}

func (i OidcAppArray) ToOidcAppArrayOutputWithContext(ctx context.Context) OidcAppArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(OidcAppArrayOutput)
}

// OidcAppMapInput is an input type that accepts OidcAppMap and OidcAppMapOutput values.
// You can construct a concrete instance of `OidcAppMapInput` via:
//
//          OidcAppMap{ "key": OidcAppArgs{...} }
type OidcAppMapInput interface {
	pulumi.Input

	ToOidcAppMapOutput() OidcAppMapOutput
	ToOidcAppMapOutputWithContext(context.Context) OidcAppMapOutput
}

type OidcAppMap map[string]OidcAppInput

func (OidcAppMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*OidcApp)(nil)).Elem()
}

func (i OidcAppMap) ToOidcAppMapOutput() OidcAppMapOutput {
	return i.ToOidcAppMapOutputWithContext(context.Background())
}

func (i OidcAppMap) ToOidcAppMapOutputWithContext(ctx context.Context) OidcAppMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(OidcAppMapOutput)
}

type OidcAppOutput struct{ *pulumi.OutputState }

func (OidcAppOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**OidcApp)(nil)).Elem()
}

func (o OidcAppOutput) ToOidcAppOutput() OidcAppOutput {
	return o
}

func (o OidcAppOutput) ToOidcAppOutputWithContext(ctx context.Context) OidcAppOutput {
	return o
}

type OidcAppArrayOutput struct{ *pulumi.OutputState }

func (OidcAppArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*OidcApp)(nil)).Elem()
}

func (o OidcAppArrayOutput) ToOidcAppArrayOutput() OidcAppArrayOutput {
	return o
}

func (o OidcAppArrayOutput) ToOidcAppArrayOutputWithContext(ctx context.Context) OidcAppArrayOutput {
	return o
}

func (o OidcAppArrayOutput) Index(i pulumi.IntInput) OidcAppOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *OidcApp {
		return vs[0].([]*OidcApp)[vs[1].(int)]
	}).(OidcAppOutput)
}

type OidcAppMapOutput struct{ *pulumi.OutputState }

func (OidcAppMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*OidcApp)(nil)).Elem()
}

func (o OidcAppMapOutput) ToOidcAppMapOutput() OidcAppMapOutput {
	return o
}

func (o OidcAppMapOutput) ToOidcAppMapOutputWithContext(ctx context.Context) OidcAppMapOutput {
	return o
}

func (o OidcAppMapOutput) MapIndex(k pulumi.StringInput) OidcAppOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *OidcApp {
		return vs[0].(map[string]*OidcApp)[vs[1].(string)]
	}).(OidcAppOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*OidcAppInput)(nil)).Elem(), &OidcApp{})
	pulumi.RegisterInputType(reflect.TypeOf((*OidcAppArrayInput)(nil)).Elem(), OidcAppArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*OidcAppMapInput)(nil)).Elem(), OidcAppMap{})
	pulumi.RegisterOutputType(OidcAppOutput{})
	pulumi.RegisterOutputType(OidcAppArrayOutput{})
	pulumi.RegisterOutputType(OidcAppMapOutput{})
}
