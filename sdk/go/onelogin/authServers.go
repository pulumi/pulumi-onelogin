// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package onelogin

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

type AuthServers struct {
	pulumi.CustomResourceState

	// Authorization server configuration
	Configuration AuthServersConfigurationOutput `pulumi:"configuration"`
	// Description of what the API does.
	Description pulumi.StringOutput `pulumi:"description"`
	// Name of the API.
	Name pulumi.StringOutput `pulumi:"name"`
}

// NewAuthServers registers a new resource with the given unique name, arguments, and options.
func NewAuthServers(ctx *pulumi.Context,
	name string, args *AuthServersArgs, opts ...pulumi.ResourceOption) (*AuthServers, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Configuration == nil {
		return nil, errors.New("invalid value for required argument 'Configuration'")
	}
	if args.Description == nil {
		return nil, errors.New("invalid value for required argument 'Description'")
	}
	var resource AuthServers
	err := ctx.RegisterResource("onelogin:index/authServers:AuthServers", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetAuthServers gets an existing AuthServers resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAuthServers(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AuthServersState, opts ...pulumi.ResourceOption) (*AuthServers, error) {
	var resource AuthServers
	err := ctx.ReadResource("onelogin:index/authServers:AuthServers", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering AuthServers resources.
type authServersState struct {
	// Authorization server configuration
	Configuration *AuthServersConfiguration `pulumi:"configuration"`
	// Description of what the API does.
	Description *string `pulumi:"description"`
	// Name of the API.
	Name *string `pulumi:"name"`
}

type AuthServersState struct {
	// Authorization server configuration
	Configuration AuthServersConfigurationPtrInput
	// Description of what the API does.
	Description pulumi.StringPtrInput
	// Name of the API.
	Name pulumi.StringPtrInput
}

func (AuthServersState) ElementType() reflect.Type {
	return reflect.TypeOf((*authServersState)(nil)).Elem()
}

type authServersArgs struct {
	// Authorization server configuration
	Configuration AuthServersConfiguration `pulumi:"configuration"`
	// Description of what the API does.
	Description string `pulumi:"description"`
	// Name of the API.
	Name *string `pulumi:"name"`
}

// The set of arguments for constructing a AuthServers resource.
type AuthServersArgs struct {
	// Authorization server configuration
	Configuration AuthServersConfigurationInput
	// Description of what the API does.
	Description pulumi.StringInput
	// Name of the API.
	Name pulumi.StringPtrInput
}

func (AuthServersArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*authServersArgs)(nil)).Elem()
}

type AuthServersInput interface {
	pulumi.Input

	ToAuthServersOutput() AuthServersOutput
	ToAuthServersOutputWithContext(ctx context.Context) AuthServersOutput
}

func (*AuthServers) ElementType() reflect.Type {
	return reflect.TypeOf((**AuthServers)(nil)).Elem()
}

func (i *AuthServers) ToAuthServersOutput() AuthServersOutput {
	return i.ToAuthServersOutputWithContext(context.Background())
}

func (i *AuthServers) ToAuthServersOutputWithContext(ctx context.Context) AuthServersOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AuthServersOutput)
}

// AuthServersArrayInput is an input type that accepts AuthServersArray and AuthServersArrayOutput values.
// You can construct a concrete instance of `AuthServersArrayInput` via:
//
//	AuthServersArray{ AuthServersArgs{...} }
type AuthServersArrayInput interface {
	pulumi.Input

	ToAuthServersArrayOutput() AuthServersArrayOutput
	ToAuthServersArrayOutputWithContext(context.Context) AuthServersArrayOutput
}

type AuthServersArray []AuthServersInput

func (AuthServersArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AuthServers)(nil)).Elem()
}

func (i AuthServersArray) ToAuthServersArrayOutput() AuthServersArrayOutput {
	return i.ToAuthServersArrayOutputWithContext(context.Background())
}

func (i AuthServersArray) ToAuthServersArrayOutputWithContext(ctx context.Context) AuthServersArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AuthServersArrayOutput)
}

// AuthServersMapInput is an input type that accepts AuthServersMap and AuthServersMapOutput values.
// You can construct a concrete instance of `AuthServersMapInput` via:
//
//	AuthServersMap{ "key": AuthServersArgs{...} }
type AuthServersMapInput interface {
	pulumi.Input

	ToAuthServersMapOutput() AuthServersMapOutput
	ToAuthServersMapOutputWithContext(context.Context) AuthServersMapOutput
}

type AuthServersMap map[string]AuthServersInput

func (AuthServersMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AuthServers)(nil)).Elem()
}

func (i AuthServersMap) ToAuthServersMapOutput() AuthServersMapOutput {
	return i.ToAuthServersMapOutputWithContext(context.Background())
}

func (i AuthServersMap) ToAuthServersMapOutputWithContext(ctx context.Context) AuthServersMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AuthServersMapOutput)
}

type AuthServersOutput struct{ *pulumi.OutputState }

func (AuthServersOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**AuthServers)(nil)).Elem()
}

func (o AuthServersOutput) ToAuthServersOutput() AuthServersOutput {
	return o
}

func (o AuthServersOutput) ToAuthServersOutputWithContext(ctx context.Context) AuthServersOutput {
	return o
}

// Authorization server configuration
func (o AuthServersOutput) Configuration() AuthServersConfigurationOutput {
	return o.ApplyT(func(v *AuthServers) AuthServersConfigurationOutput { return v.Configuration }).(AuthServersConfigurationOutput)
}

// Description of what the API does.
func (o AuthServersOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v *AuthServers) pulumi.StringOutput { return v.Description }).(pulumi.StringOutput)
}

// Name of the API.
func (o AuthServersOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *AuthServers) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

type AuthServersArrayOutput struct{ *pulumi.OutputState }

func (AuthServersArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AuthServers)(nil)).Elem()
}

func (o AuthServersArrayOutput) ToAuthServersArrayOutput() AuthServersArrayOutput {
	return o
}

func (o AuthServersArrayOutput) ToAuthServersArrayOutputWithContext(ctx context.Context) AuthServersArrayOutput {
	return o
}

func (o AuthServersArrayOutput) Index(i pulumi.IntInput) AuthServersOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *AuthServers {
		return vs[0].([]*AuthServers)[vs[1].(int)]
	}).(AuthServersOutput)
}

type AuthServersMapOutput struct{ *pulumi.OutputState }

func (AuthServersMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AuthServers)(nil)).Elem()
}

func (o AuthServersMapOutput) ToAuthServersMapOutput() AuthServersMapOutput {
	return o
}

func (o AuthServersMapOutput) ToAuthServersMapOutputWithContext(ctx context.Context) AuthServersMapOutput {
	return o
}

func (o AuthServersMapOutput) MapIndex(k pulumi.StringInput) AuthServersOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *AuthServers {
		return vs[0].(map[string]*AuthServers)[vs[1].(string)]
	}).(AuthServersOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*AuthServersInput)(nil)).Elem(), &AuthServers{})
	pulumi.RegisterInputType(reflect.TypeOf((*AuthServersArrayInput)(nil)).Elem(), AuthServersArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*AuthServersMapInput)(nil)).Elem(), AuthServersMap{})
	pulumi.RegisterOutputType(AuthServersOutput{})
	pulumi.RegisterOutputType(AuthServersArrayOutput{})
	pulumi.RegisterOutputType(AuthServersMapOutput{})
}
