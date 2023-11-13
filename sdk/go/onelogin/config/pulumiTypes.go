// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package config

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-onelogin/sdk/go/onelogin/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

var _ = internal.GetEnvOrDefault

type Endpoints struct {
	Apps        *string `pulumi:"apps"`
	AppsRules   *string `pulumi:"appsRules"`
	AuthServers *string `pulumi:"authServers"`
	Privileges  *string `pulumi:"privileges"`
	RiskRules   *string `pulumi:"riskRules"`
	Roles       *string `pulumi:"roles"`
	Users       *string `pulumi:"users"`
	UsersV1     *string `pulumi:"usersV1"`
}

// EndpointsInput is an input type that accepts EndpointsArgs and EndpointsOutput values.
// You can construct a concrete instance of `EndpointsInput` via:
//
//	EndpointsArgs{...}
type EndpointsInput interface {
	pulumi.Input

	ToEndpointsOutput() EndpointsOutput
	ToEndpointsOutputWithContext(context.Context) EndpointsOutput
}

type EndpointsArgs struct {
	Apps        pulumi.StringPtrInput `pulumi:"apps"`
	AppsRules   pulumi.StringPtrInput `pulumi:"appsRules"`
	AuthServers pulumi.StringPtrInput `pulumi:"authServers"`
	Privileges  pulumi.StringPtrInput `pulumi:"privileges"`
	RiskRules   pulumi.StringPtrInput `pulumi:"riskRules"`
	Roles       pulumi.StringPtrInput `pulumi:"roles"`
	Users       pulumi.StringPtrInput `pulumi:"users"`
	UsersV1     pulumi.StringPtrInput `pulumi:"usersV1"`
}

func (EndpointsArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*Endpoints)(nil)).Elem()
}

func (i EndpointsArgs) ToEndpointsOutput() EndpointsOutput {
	return i.ToEndpointsOutputWithContext(context.Background())
}

func (i EndpointsArgs) ToEndpointsOutputWithContext(ctx context.Context) EndpointsOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EndpointsOutput)
}

// EndpointsArrayInput is an input type that accepts EndpointsArray and EndpointsArrayOutput values.
// You can construct a concrete instance of `EndpointsArrayInput` via:
//
//	EndpointsArray{ EndpointsArgs{...} }
type EndpointsArrayInput interface {
	pulumi.Input

	ToEndpointsArrayOutput() EndpointsArrayOutput
	ToEndpointsArrayOutputWithContext(context.Context) EndpointsArrayOutput
}

type EndpointsArray []EndpointsInput

func (EndpointsArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]Endpoints)(nil)).Elem()
}

func (i EndpointsArray) ToEndpointsArrayOutput() EndpointsArrayOutput {
	return i.ToEndpointsArrayOutputWithContext(context.Background())
}

func (i EndpointsArray) ToEndpointsArrayOutputWithContext(ctx context.Context) EndpointsArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EndpointsArrayOutput)
}

type EndpointsOutput struct{ *pulumi.OutputState }

func (EndpointsOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*Endpoints)(nil)).Elem()
}

func (o EndpointsOutput) ToEndpointsOutput() EndpointsOutput {
	return o
}

func (o EndpointsOutput) ToEndpointsOutputWithContext(ctx context.Context) EndpointsOutput {
	return o
}

func (o EndpointsOutput) Apps() pulumi.StringPtrOutput {
	return o.ApplyT(func(v Endpoints) *string { return v.Apps }).(pulumi.StringPtrOutput)
}

func (o EndpointsOutput) AppsRules() pulumi.StringPtrOutput {
	return o.ApplyT(func(v Endpoints) *string { return v.AppsRules }).(pulumi.StringPtrOutput)
}

func (o EndpointsOutput) AuthServers() pulumi.StringPtrOutput {
	return o.ApplyT(func(v Endpoints) *string { return v.AuthServers }).(pulumi.StringPtrOutput)
}

func (o EndpointsOutput) Privileges() pulumi.StringPtrOutput {
	return o.ApplyT(func(v Endpoints) *string { return v.Privileges }).(pulumi.StringPtrOutput)
}

func (o EndpointsOutput) RiskRules() pulumi.StringPtrOutput {
	return o.ApplyT(func(v Endpoints) *string { return v.RiskRules }).(pulumi.StringPtrOutput)
}

func (o EndpointsOutput) Roles() pulumi.StringPtrOutput {
	return o.ApplyT(func(v Endpoints) *string { return v.Roles }).(pulumi.StringPtrOutput)
}

func (o EndpointsOutput) Users() pulumi.StringPtrOutput {
	return o.ApplyT(func(v Endpoints) *string { return v.Users }).(pulumi.StringPtrOutput)
}

func (o EndpointsOutput) UsersV1() pulumi.StringPtrOutput {
	return o.ApplyT(func(v Endpoints) *string { return v.UsersV1 }).(pulumi.StringPtrOutput)
}

type EndpointsArrayOutput struct{ *pulumi.OutputState }

func (EndpointsArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]Endpoints)(nil)).Elem()
}

func (o EndpointsArrayOutput) ToEndpointsArrayOutput() EndpointsArrayOutput {
	return o
}

func (o EndpointsArrayOutput) ToEndpointsArrayOutputWithContext(ctx context.Context) EndpointsArrayOutput {
	return o
}

func (o EndpointsArrayOutput) Index(i pulumi.IntInput) EndpointsOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) Endpoints {
		return vs[0].([]Endpoints)[vs[1].(int)]
	}).(EndpointsOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*EndpointsInput)(nil)).Elem(), EndpointsArgs{})
	pulumi.RegisterInputType(reflect.TypeOf((*EndpointsArrayInput)(nil)).Elem(), EndpointsArray{})
	pulumi.RegisterOutputType(EndpointsOutput{})
	pulumi.RegisterOutputType(EndpointsArrayOutput{})
}
