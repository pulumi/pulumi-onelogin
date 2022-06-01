// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package onelogin

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Creates an SAML Application.
//
// This resource allows you to create and configure an SAML Application.
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
// 		_, err := onelogin.NewSamlApp(ctx, "exampleSamlApp", &onelogin.SamlAppArgs{
// 			AllowAssumedSignin: pulumi.Bool(false),
// 			Configuration: pulumi.StringMap{
// 				"provider_arn":        pulumi.String("example_arn"),
// 				"signature_algorithm": pulumi.String("SHA-1"),
// 			},
// 			ConnectorId: pulumi.Int(12345),
// 			Description: pulumi.String("example saml app"),
// 			Notes:       pulumi.String("example saml app"),
// 			Parameters: SamlAppParameterArray{
// 				&SamlAppParameterArgs{
// 					AttributesTransformations: pulumi.String(""),
// 					DefaultValues:             pulumi.String(""),
// 					IncludeInSamlAssertion:    pulumi.Bool(false),
// 					Label:                     pulumi.String("I done reset it"),
// 					ParamKeyName:              pulumi.String("tmp"),
// 					ProvisionedEntitlements:   pulumi.Bool(false),
// 					SafeEntitlementsEnabled:   pulumi.Bool(false),
// 					SkipIfBlank:               pulumi.Bool(false),
// 					UserAttributeMacros:       pulumi.String(""),
// 					UserAttributeMappings:     pulumi.String("email"),
// 					Values:                    pulumi.String(""),
// 				},
// 			},
// 			Provisioning: pulumi.BoolMap{
// 				"enabled": pulumi.Bool(false),
// 			},
// 			Visible: pulumi.Bool(false),
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
// A SAML App can be imported via the OneLogin App ID.
//
// ```sh
//  $ pulumi import onelogin:index/samlApp:SamlApp example_saml_app <app id>
// ```
type SamlApp struct {
	pulumi.CustomResourceState

	// Enable sign in when user has been assumed by the account owner. Defaults to `false`.
	AllowAssumedSignin pulumi.BoolPtrOutput `pulumi:"allowAssumedSignin"`
	// The apps auth method. Refer to the [OneLogin Apps Documentation](https://developers.onelogin.com/api-docs/2/apps/app-resource) for a comprehensive list of available auth methods.
	AuthMethod pulumi.IntOutput    `pulumi:"authMethod"`
	BrandId    pulumi.IntPtrOutput `pulumi:"brandId"`
	// The SSO certificate generated by OneLogin.
	Certificate pulumi.StringMapOutput `pulumi:"certificate"`
	// SAML settings that control the authentication e.g. signature hashing algorithm or provider
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
	Parameters SamlAppParameterArrayOutput `pulumi:"parameters"`
	// The security policy assigned to the app.
	PolicyId pulumi.IntOutput `pulumi:"policyId"`
	// Settings regarding the app's provisioning ability.
	Provisioning pulumi.BoolMapOutput `pulumi:"provisioning"`
	// The attributes included in the sso section are determined by the type of app. `sso` attributes are read only.
	Sso pulumi.StringMapOutput `pulumi:"sso"`
	// The tab in which to display in OneLogin portal.
	TabId pulumi.IntOutput `pulumi:"tabId"`
	// Timestamp for app's last update.
	UpdatedAt pulumi.StringOutput `pulumi:"updatedAt"`
	// Determine if app should be visible in OneLogin portal. Defaults to `true`.
	Visible pulumi.BoolPtrOutput `pulumi:"visible"`
}

// NewSamlApp registers a new resource with the given unique name, arguments, and options.
func NewSamlApp(ctx *pulumi.Context,
	name string, args *SamlAppArgs, opts ...pulumi.ResourceOption) (*SamlApp, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ConnectorId == nil {
		return nil, errors.New("invalid value for required argument 'ConnectorId'")
	}
	var resource SamlApp
	err := ctx.RegisterResource("onelogin:index/samlApp:SamlApp", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetSamlApp gets an existing SamlApp resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetSamlApp(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *SamlAppState, opts ...pulumi.ResourceOption) (*SamlApp, error) {
	var resource SamlApp
	err := ctx.ReadResource("onelogin:index/samlApp:SamlApp", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering SamlApp resources.
type samlAppState struct {
	// Enable sign in when user has been assumed by the account owner. Defaults to `false`.
	AllowAssumedSignin *bool `pulumi:"allowAssumedSignin"`
	// The apps auth method. Refer to the [OneLogin Apps Documentation](https://developers.onelogin.com/api-docs/2/apps/app-resource) for a comprehensive list of available auth methods.
	AuthMethod *int `pulumi:"authMethod"`
	BrandId    *int `pulumi:"brandId"`
	// The SSO certificate generated by OneLogin.
	Certificate map[string]string `pulumi:"certificate"`
	// SAML settings that control the authentication e.g. signature hashing algorithm or provider
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
	Parameters []SamlAppParameter `pulumi:"parameters"`
	// The security policy assigned to the app.
	PolicyId *int `pulumi:"policyId"`
	// Settings regarding the app's provisioning ability.
	Provisioning map[string]bool `pulumi:"provisioning"`
	// The attributes included in the sso section are determined by the type of app. `sso` attributes are read only.
	Sso map[string]string `pulumi:"sso"`
	// The tab in which to display in OneLogin portal.
	TabId *int `pulumi:"tabId"`
	// Timestamp for app's last update.
	UpdatedAt *string `pulumi:"updatedAt"`
	// Determine if app should be visible in OneLogin portal. Defaults to `true`.
	Visible *bool `pulumi:"visible"`
}

type SamlAppState struct {
	// Enable sign in when user has been assumed by the account owner. Defaults to `false`.
	AllowAssumedSignin pulumi.BoolPtrInput
	// The apps auth method. Refer to the [OneLogin Apps Documentation](https://developers.onelogin.com/api-docs/2/apps/app-resource) for a comprehensive list of available auth methods.
	AuthMethod pulumi.IntPtrInput
	BrandId    pulumi.IntPtrInput
	// The SSO certificate generated by OneLogin.
	Certificate pulumi.StringMapInput
	// SAML settings that control the authentication e.g. signature hashing algorithm or provider
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
	Parameters SamlAppParameterArrayInput
	// The security policy assigned to the app.
	PolicyId pulumi.IntPtrInput
	// Settings regarding the app's provisioning ability.
	Provisioning pulumi.BoolMapInput
	// The attributes included in the sso section are determined by the type of app. `sso` attributes are read only.
	Sso pulumi.StringMapInput
	// The tab in which to display in OneLogin portal.
	TabId pulumi.IntPtrInput
	// Timestamp for app's last update.
	UpdatedAt pulumi.StringPtrInput
	// Determine if app should be visible in OneLogin portal. Defaults to `true`.
	Visible pulumi.BoolPtrInput
}

func (SamlAppState) ElementType() reflect.Type {
	return reflect.TypeOf((*samlAppState)(nil)).Elem()
}

type samlAppArgs struct {
	// Enable sign in when user has been assumed by the account owner. Defaults to `false`.
	AllowAssumedSignin *bool `pulumi:"allowAssumedSignin"`
	BrandId            *int  `pulumi:"brandId"`
	// SAML settings that control the authentication e.g. signature hashing algorithm or provider
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
	Parameters []SamlAppParameter `pulumi:"parameters"`
	// Settings regarding the app's provisioning ability.
	Provisioning map[string]bool `pulumi:"provisioning"`
	// Determine if app should be visible in OneLogin portal. Defaults to `true`.
	Visible *bool `pulumi:"visible"`
}

// The set of arguments for constructing a SamlApp resource.
type SamlAppArgs struct {
	// Enable sign in when user has been assumed by the account owner. Defaults to `false`.
	AllowAssumedSignin pulumi.BoolPtrInput
	BrandId            pulumi.IntPtrInput
	// SAML settings that control the authentication e.g. signature hashing algorithm or provider
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
	Parameters SamlAppParameterArrayInput
	// Settings regarding the app's provisioning ability.
	Provisioning pulumi.BoolMapInput
	// Determine if app should be visible in OneLogin portal. Defaults to `true`.
	Visible pulumi.BoolPtrInput
}

func (SamlAppArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*samlAppArgs)(nil)).Elem()
}

type SamlAppInput interface {
	pulumi.Input

	ToSamlAppOutput() SamlAppOutput
	ToSamlAppOutputWithContext(ctx context.Context) SamlAppOutput
}

func (*SamlApp) ElementType() reflect.Type {
	return reflect.TypeOf((**SamlApp)(nil)).Elem()
}

func (i *SamlApp) ToSamlAppOutput() SamlAppOutput {
	return i.ToSamlAppOutputWithContext(context.Background())
}

func (i *SamlApp) ToSamlAppOutputWithContext(ctx context.Context) SamlAppOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SamlAppOutput)
}

// SamlAppArrayInput is an input type that accepts SamlAppArray and SamlAppArrayOutput values.
// You can construct a concrete instance of `SamlAppArrayInput` via:
//
//          SamlAppArray{ SamlAppArgs{...} }
type SamlAppArrayInput interface {
	pulumi.Input

	ToSamlAppArrayOutput() SamlAppArrayOutput
	ToSamlAppArrayOutputWithContext(context.Context) SamlAppArrayOutput
}

type SamlAppArray []SamlAppInput

func (SamlAppArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SamlApp)(nil)).Elem()
}

func (i SamlAppArray) ToSamlAppArrayOutput() SamlAppArrayOutput {
	return i.ToSamlAppArrayOutputWithContext(context.Background())
}

func (i SamlAppArray) ToSamlAppArrayOutputWithContext(ctx context.Context) SamlAppArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SamlAppArrayOutput)
}

// SamlAppMapInput is an input type that accepts SamlAppMap and SamlAppMapOutput values.
// You can construct a concrete instance of `SamlAppMapInput` via:
//
//          SamlAppMap{ "key": SamlAppArgs{...} }
type SamlAppMapInput interface {
	pulumi.Input

	ToSamlAppMapOutput() SamlAppMapOutput
	ToSamlAppMapOutputWithContext(context.Context) SamlAppMapOutput
}

type SamlAppMap map[string]SamlAppInput

func (SamlAppMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SamlApp)(nil)).Elem()
}

func (i SamlAppMap) ToSamlAppMapOutput() SamlAppMapOutput {
	return i.ToSamlAppMapOutputWithContext(context.Background())
}

func (i SamlAppMap) ToSamlAppMapOutputWithContext(ctx context.Context) SamlAppMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SamlAppMapOutput)
}

type SamlAppOutput struct{ *pulumi.OutputState }

func (SamlAppOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**SamlApp)(nil)).Elem()
}

func (o SamlAppOutput) ToSamlAppOutput() SamlAppOutput {
	return o
}

func (o SamlAppOutput) ToSamlAppOutputWithContext(ctx context.Context) SamlAppOutput {
	return o
}

type SamlAppArrayOutput struct{ *pulumi.OutputState }

func (SamlAppArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SamlApp)(nil)).Elem()
}

func (o SamlAppArrayOutput) ToSamlAppArrayOutput() SamlAppArrayOutput {
	return o
}

func (o SamlAppArrayOutput) ToSamlAppArrayOutputWithContext(ctx context.Context) SamlAppArrayOutput {
	return o
}

func (o SamlAppArrayOutput) Index(i pulumi.IntInput) SamlAppOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *SamlApp {
		return vs[0].([]*SamlApp)[vs[1].(int)]
	}).(SamlAppOutput)
}

type SamlAppMapOutput struct{ *pulumi.OutputState }

func (SamlAppMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SamlApp)(nil)).Elem()
}

func (o SamlAppMapOutput) ToSamlAppMapOutput() SamlAppMapOutput {
	return o
}

func (o SamlAppMapOutput) ToSamlAppMapOutputWithContext(ctx context.Context) SamlAppMapOutput {
	return o
}

func (o SamlAppMapOutput) MapIndex(k pulumi.StringInput) SamlAppOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *SamlApp {
		return vs[0].(map[string]*SamlApp)[vs[1].(string)]
	}).(SamlAppOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*SamlAppInput)(nil)).Elem(), &SamlApp{})
	pulumi.RegisterInputType(reflect.TypeOf((*SamlAppArrayInput)(nil)).Elem(), SamlAppArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*SamlAppMapInput)(nil)).Elem(), SamlAppMap{})
	pulumi.RegisterOutputType(SamlAppOutput{})
	pulumi.RegisterOutputType(SamlAppArrayOutput{})
	pulumi.RegisterOutputType(SamlAppMapOutput{})
}
