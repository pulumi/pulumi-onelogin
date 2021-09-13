// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package onelogin

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

type AuthServer struct {
	pulumi.CustomResourceState

	Configuration AuthServerConfigurationOutput `pulumi:"configuration"`
	Description   pulumi.StringOutput           `pulumi:"description"`
	Name          pulumi.StringOutput           `pulumi:"name"`
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
	Configuration *AuthServerConfiguration `pulumi:"configuration"`
	Description   *string                  `pulumi:"description"`
	Name          *string                  `pulumi:"name"`
}

type AuthServerState struct {
	Configuration AuthServerConfigurationPtrInput
	Description   pulumi.StringPtrInput
	Name          pulumi.StringPtrInput
}

func (AuthServerState) ElementType() reflect.Type {
	return reflect.TypeOf((*authServerState)(nil)).Elem()
}

type authServerArgs struct {
	Configuration AuthServerConfiguration `pulumi:"configuration"`
	Description   string                  `pulumi:"description"`
	Name          *string                 `pulumi:"name"`
}

// The set of arguments for constructing a AuthServer resource.
type AuthServerArgs struct {
	Configuration AuthServerConfigurationInput
	Description   pulumi.StringInput
	Name          pulumi.StringPtrInput
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
	return reflect.TypeOf((*AuthServer)(nil))
}

func (i *AuthServer) ToAuthServerOutput() AuthServerOutput {
	return i.ToAuthServerOutputWithContext(context.Background())
}

func (i *AuthServer) ToAuthServerOutputWithContext(ctx context.Context) AuthServerOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AuthServerOutput)
}

func (i *AuthServer) ToAuthServerPtrOutput() AuthServerPtrOutput {
	return i.ToAuthServerPtrOutputWithContext(context.Background())
}

func (i *AuthServer) ToAuthServerPtrOutputWithContext(ctx context.Context) AuthServerPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AuthServerPtrOutput)
}

type AuthServerPtrInput interface {
	pulumi.Input

	ToAuthServerPtrOutput() AuthServerPtrOutput
	ToAuthServerPtrOutputWithContext(ctx context.Context) AuthServerPtrOutput
}

type authServerPtrType AuthServerArgs

func (*authServerPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**AuthServer)(nil))
}

func (i *authServerPtrType) ToAuthServerPtrOutput() AuthServerPtrOutput {
	return i.ToAuthServerPtrOutputWithContext(context.Background())
}

func (i *authServerPtrType) ToAuthServerPtrOutputWithContext(ctx context.Context) AuthServerPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AuthServerPtrOutput)
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
	return reflect.TypeOf(([]*AuthServer)(nil))
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
	return reflect.TypeOf((map[string]*AuthServer)(nil))
}

func (i AuthServerMap) ToAuthServerMapOutput() AuthServerMapOutput {
	return i.ToAuthServerMapOutputWithContext(context.Background())
}

func (i AuthServerMap) ToAuthServerMapOutputWithContext(ctx context.Context) AuthServerMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AuthServerMapOutput)
}

type AuthServerOutput struct {
	*pulumi.OutputState
}

func (AuthServerOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*AuthServer)(nil))
}

func (o AuthServerOutput) ToAuthServerOutput() AuthServerOutput {
	return o
}

func (o AuthServerOutput) ToAuthServerOutputWithContext(ctx context.Context) AuthServerOutput {
	return o
}

func (o AuthServerOutput) ToAuthServerPtrOutput() AuthServerPtrOutput {
	return o.ToAuthServerPtrOutputWithContext(context.Background())
}

func (o AuthServerOutput) ToAuthServerPtrOutputWithContext(ctx context.Context) AuthServerPtrOutput {
	return o.ApplyT(func(v AuthServer) *AuthServer {
		return &v
	}).(AuthServerPtrOutput)
}

type AuthServerPtrOutput struct {
	*pulumi.OutputState
}

func (AuthServerPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**AuthServer)(nil))
}

func (o AuthServerPtrOutput) ToAuthServerPtrOutput() AuthServerPtrOutput {
	return o
}

func (o AuthServerPtrOutput) ToAuthServerPtrOutputWithContext(ctx context.Context) AuthServerPtrOutput {
	return o
}

type AuthServerArrayOutput struct{ *pulumi.OutputState }

func (AuthServerArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]AuthServer)(nil))
}

func (o AuthServerArrayOutput) ToAuthServerArrayOutput() AuthServerArrayOutput {
	return o
}

func (o AuthServerArrayOutput) ToAuthServerArrayOutputWithContext(ctx context.Context) AuthServerArrayOutput {
	return o
}

func (o AuthServerArrayOutput) Index(i pulumi.IntInput) AuthServerOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) AuthServer {
		return vs[0].([]AuthServer)[vs[1].(int)]
	}).(AuthServerOutput)
}

type AuthServerMapOutput struct{ *pulumi.OutputState }

func (AuthServerMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]AuthServer)(nil))
}

func (o AuthServerMapOutput) ToAuthServerMapOutput() AuthServerMapOutput {
	return o
}

func (o AuthServerMapOutput) ToAuthServerMapOutputWithContext(ctx context.Context) AuthServerMapOutput {
	return o
}

func (o AuthServerMapOutput) MapIndex(k pulumi.StringInput) AuthServerOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) AuthServer {
		return vs[0].(map[string]AuthServer)[vs[1].(string)]
	}).(AuthServerOutput)
}

func init() {
	pulumi.RegisterOutputType(AuthServerOutput{})
	pulumi.RegisterOutputType(AuthServerPtrOutput{})
	pulumi.RegisterOutputType(AuthServerArrayOutput{})
	pulumi.RegisterOutputType(AuthServerMapOutput{})
}
