// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package users

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-onelogin/sdk/go/onelogin/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func GetV1Apps(ctx *pulumi.Context, args *GetV1AppsArgs, opts ...pulumi.InvokeOption) (*GetV1AppsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetV1AppsResult
	err := ctx.Invoke("onelogin:users/getV1Apps:getV1Apps", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getV1Apps.
type GetV1AppsArgs struct {
	Extension           *bool             `pulumi:"extension"`
	Filters             []GetV1AppsFilter `pulumi:"filters"`
	IconUrl             *string           `pulumi:"iconUrl"`
	LoginId             *int              `pulumi:"loginId"`
	Name                *string           `pulumi:"name"`
	ProvisioningEnabled *bool             `pulumi:"provisioningEnabled"`
	ProvisioningState   *string           `pulumi:"provisioningState"`
	ProvisioningStatus  *string           `pulumi:"provisioningStatus"`
	UsersV1Id           string            `pulumi:"usersV1Id"`
}

// A collection of values returned by getV1Apps.
type GetV1AppsResult struct {
	Extension bool              `pulumi:"extension"`
	Filters   []GetV1AppsFilter `pulumi:"filters"`
	IconUrl   string            `pulumi:"iconUrl"`
	// The provider-assigned unique ID for this managed resource.
	Id                  string `pulumi:"id"`
	LoginId             int    `pulumi:"loginId"`
	Name                string `pulumi:"name"`
	ProvisioningEnabled bool   `pulumi:"provisioningEnabled"`
	ProvisioningState   string `pulumi:"provisioningState"`
	ProvisioningStatus  string `pulumi:"provisioningStatus"`
	UsersV1Id           string `pulumi:"usersV1Id"`
}

func GetV1AppsOutput(ctx *pulumi.Context, args GetV1AppsOutputArgs, opts ...pulumi.InvokeOption) GetV1AppsResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetV1AppsResultOutput, error) {
			args := v.(GetV1AppsArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("onelogin:users/getV1Apps:getV1Apps", args, GetV1AppsResultOutput{}, options).(GetV1AppsResultOutput), nil
		}).(GetV1AppsResultOutput)
}

// A collection of arguments for invoking getV1Apps.
type GetV1AppsOutputArgs struct {
	Extension           pulumi.BoolPtrInput       `pulumi:"extension"`
	Filters             GetV1AppsFilterArrayInput `pulumi:"filters"`
	IconUrl             pulumi.StringPtrInput     `pulumi:"iconUrl"`
	LoginId             pulumi.IntPtrInput        `pulumi:"loginId"`
	Name                pulumi.StringPtrInput     `pulumi:"name"`
	ProvisioningEnabled pulumi.BoolPtrInput       `pulumi:"provisioningEnabled"`
	ProvisioningState   pulumi.StringPtrInput     `pulumi:"provisioningState"`
	ProvisioningStatus  pulumi.StringPtrInput     `pulumi:"provisioningStatus"`
	UsersV1Id           pulumi.StringInput        `pulumi:"usersV1Id"`
}

func (GetV1AppsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetV1AppsArgs)(nil)).Elem()
}

// A collection of values returned by getV1Apps.
type GetV1AppsResultOutput struct{ *pulumi.OutputState }

func (GetV1AppsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetV1AppsResult)(nil)).Elem()
}

func (o GetV1AppsResultOutput) ToGetV1AppsResultOutput() GetV1AppsResultOutput {
	return o
}

func (o GetV1AppsResultOutput) ToGetV1AppsResultOutputWithContext(ctx context.Context) GetV1AppsResultOutput {
	return o
}

func (o GetV1AppsResultOutput) Extension() pulumi.BoolOutput {
	return o.ApplyT(func(v GetV1AppsResult) bool { return v.Extension }).(pulumi.BoolOutput)
}

func (o GetV1AppsResultOutput) Filters() GetV1AppsFilterArrayOutput {
	return o.ApplyT(func(v GetV1AppsResult) []GetV1AppsFilter { return v.Filters }).(GetV1AppsFilterArrayOutput)
}

func (o GetV1AppsResultOutput) IconUrl() pulumi.StringOutput {
	return o.ApplyT(func(v GetV1AppsResult) string { return v.IconUrl }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetV1AppsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetV1AppsResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetV1AppsResultOutput) LoginId() pulumi.IntOutput {
	return o.ApplyT(func(v GetV1AppsResult) int { return v.LoginId }).(pulumi.IntOutput)
}

func (o GetV1AppsResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v GetV1AppsResult) string { return v.Name }).(pulumi.StringOutput)
}

func (o GetV1AppsResultOutput) ProvisioningEnabled() pulumi.BoolOutput {
	return o.ApplyT(func(v GetV1AppsResult) bool { return v.ProvisioningEnabled }).(pulumi.BoolOutput)
}

func (o GetV1AppsResultOutput) ProvisioningState() pulumi.StringOutput {
	return o.ApplyT(func(v GetV1AppsResult) string { return v.ProvisioningState }).(pulumi.StringOutput)
}

func (o GetV1AppsResultOutput) ProvisioningStatus() pulumi.StringOutput {
	return o.ApplyT(func(v GetV1AppsResult) string { return v.ProvisioningStatus }).(pulumi.StringOutput)
}

func (o GetV1AppsResultOutput) UsersV1Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetV1AppsResult) string { return v.UsersV1Id }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetV1AppsResultOutput{})
}
