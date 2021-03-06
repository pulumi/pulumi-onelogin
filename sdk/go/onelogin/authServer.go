// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package onelogin

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Creates an Authentication Server Resource.
//
// This resource allows you to create and configure an Authentication Server.
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
// 		_, err := onelogin.NewAuthServer(ctx, "example", &onelogin.AuthServerArgs{
// 			Configuration: &AuthServerConfigurationArgs{
// 				AccessTokenExpirationMinutes: pulumi.Int(10),
// 				Audiences: pulumi.StringArray{
// 					pulumi.String("https://example.com/contacts"),
// 				},
// 				RefreshTokenExpirationMinutes: pulumi.Int(30),
// 				ResourceIdentifier:            pulumi.String("https://example.com/contacts"),
// 			},
// 			Description: pulumi.String("This is an api"),
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
// An Auth Server can be imported via the OneLogin Auth Server ID.
//
// ```sh
//  $ pulumi import onelogin:index/authServer:AuthServer example <auth_server_id>
// ```
type AuthServer struct {
	pulumi.CustomResourceState

	// Configuration parameters
	Configuration AuthServerConfigurationOutput `pulumi:"configuration"`
	// A brief description about the resource.
	Description pulumi.StringOutput `pulumi:"description"`
	// The resource's name.
	Name pulumi.StringOutput `pulumi:"name"`
}

// NewAuthServer registers a new resource with the given unique name, arguments, and options.
func NewAuthServer(ctx *pulumi.Context,
	name string, args *AuthServerArgs, opts ...pulumi.ResourceOption) (*AuthServer, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Configuration == nil {
		return nil, errors.New("invalid value for required argument 'Configuration'")
	}
	if args.Description == nil {
		return nil, errors.New("invalid value for required argument 'Description'")
	}
	var resource AuthServer
	err := ctx.RegisterResource("onelogin:index/authServer:AuthServer", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetAuthServer gets an existing AuthServer resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAuthServer(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AuthServerState, opts ...pulumi.ResourceOption) (*AuthServer, error) {
	var resource AuthServer
	err := ctx.ReadResource("onelogin:index/authServer:AuthServer", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering AuthServer resources.
type authServerState struct {
	// Configuration parameters
	Configuration *AuthServerConfiguration `pulumi:"configuration"`
	// A brief description about the resource.
	Description *string `pulumi:"description"`
	// The resource's name.
	Name *string `pulumi:"name"`
}

type AuthServerState struct {
	// Configuration parameters
	Configuration AuthServerConfigurationPtrInput
	// A brief description about the resource.
	Description pulumi.StringPtrInput
	// The resource's name.
	Name pulumi.StringPtrInput
}

func (AuthServerState) ElementType() reflect.Type {
	return reflect.TypeOf((*authServerState)(nil)).Elem()
}

type authServerArgs struct {
	// Configuration parameters
	Configuration AuthServerConfiguration `pulumi:"configuration"`
	// A brief description about the resource.
	Description string `pulumi:"description"`
	// The resource's name.
	Name *string `pulumi:"name"`
}

// The set of arguments for constructing a AuthServer resource.
type AuthServerArgs struct {
	// Configuration parameters
	Configuration AuthServerConfigurationInput
	// A brief description about the resource.
	Description pulumi.StringInput
	// The resource's name.
	Name pulumi.StringPtrInput
}

func (AuthServerArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*authServerArgs)(nil)).Elem()
}

type AuthServerInput interface {
	pulumi.Input

	ToAuthServerOutput() AuthServerOutput
	ToAuthServerOutputWithContext(ctx context.Context) AuthServerOutput
}

func (*AuthServer) ElementType() reflect.Type {
	return reflect.TypeOf((**AuthServer)(nil)).Elem()
}

func (i *AuthServer) ToAuthServerOutput() AuthServerOutput {
	return i.ToAuthServerOutputWithContext(context.Background())
}

func (i *AuthServer) ToAuthServerOutputWithContext(ctx context.Context) AuthServerOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AuthServerOutput)
}

// AuthServerArrayInput is an input type that accepts AuthServerArray and AuthServerArrayOutput values.
// You can construct a concrete instance of `AuthServerArrayInput` via:
//
//          AuthServerArray{ AuthServerArgs{...} }
type AuthServerArrayInput interface {
	pulumi.Input

	ToAuthServerArrayOutput() AuthServerArrayOutput
	ToAuthServerArrayOutputWithContext(context.Context) AuthServerArrayOutput
}

type AuthServerArray []AuthServerInput

func (AuthServerArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AuthServer)(nil)).Elem()
}

func (i AuthServerArray) ToAuthServerArrayOutput() AuthServerArrayOutput {
	return i.ToAuthServerArrayOutputWithContext(context.Background())
}

func (i AuthServerArray) ToAuthServerArrayOutputWithContext(ctx context.Context) AuthServerArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AuthServerArrayOutput)
}

// AuthServerMapInput is an input type that accepts AuthServerMap and AuthServerMapOutput values.
// You can construct a concrete instance of `AuthServerMapInput` via:
//
//          AuthServerMap{ "key": AuthServerArgs{...} }
type AuthServerMapInput interface {
	pulumi.Input

	ToAuthServerMapOutput() AuthServerMapOutput
	ToAuthServerMapOutputWithContext(context.Context) AuthServerMapOutput
}

type AuthServerMap map[string]AuthServerInput

func (AuthServerMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AuthServer)(nil)).Elem()
}

func (i AuthServerMap) ToAuthServerMapOutput() AuthServerMapOutput {
	return i.ToAuthServerMapOutputWithContext(context.Background())
}

func (i AuthServerMap) ToAuthServerMapOutputWithContext(ctx context.Context) AuthServerMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AuthServerMapOutput)
}

type AuthServerOutput struct{ *pulumi.OutputState }

func (AuthServerOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**AuthServer)(nil)).Elem()
}

func (o AuthServerOutput) ToAuthServerOutput() AuthServerOutput {
	return o
}

func (o AuthServerOutput) ToAuthServerOutputWithContext(ctx context.Context) AuthServerOutput {
	return o
}

type AuthServerArrayOutput struct{ *pulumi.OutputState }

func (AuthServerArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AuthServer)(nil)).Elem()
}

func (o AuthServerArrayOutput) ToAuthServerArrayOutput() AuthServerArrayOutput {
	return o
}

func (o AuthServerArrayOutput) ToAuthServerArrayOutputWithContext(ctx context.Context) AuthServerArrayOutput {
	return o
}

func (o AuthServerArrayOutput) Index(i pulumi.IntInput) AuthServerOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *AuthServer {
		return vs[0].([]*AuthServer)[vs[1].(int)]
	}).(AuthServerOutput)
}

type AuthServerMapOutput struct{ *pulumi.OutputState }

func (AuthServerMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AuthServer)(nil)).Elem()
}

func (o AuthServerMapOutput) ToAuthServerMapOutput() AuthServerMapOutput {
	return o
}

func (o AuthServerMapOutput) ToAuthServerMapOutputWithContext(ctx context.Context) AuthServerMapOutput {
	return o
}

func (o AuthServerMapOutput) MapIndex(k pulumi.StringInput) AuthServerOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *AuthServer {
		return vs[0].(map[string]*AuthServer)[vs[1].(string)]
	}).(AuthServerOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*AuthServerInput)(nil)).Elem(), &AuthServer{})
	pulumi.RegisterInputType(reflect.TypeOf((*AuthServerArrayInput)(nil)).Elem(), AuthServerArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*AuthServerMapInput)(nil)).Elem(), AuthServerMap{})
	pulumi.RegisterOutputType(AuthServerOutput{})
	pulumi.RegisterOutputType(AuthServerArrayOutput{})
	pulumi.RegisterOutputType(AuthServerMapOutput{})
}
