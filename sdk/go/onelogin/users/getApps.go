// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package users

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-onelogin/sdk/go/onelogin/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func GetApps(ctx *pulumi.Context, args *GetAppsArgs, opts ...pulumi.InvokeOption) (*GetAppsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetAppsResult
	err := ctx.Invoke("onelogin:users/getApps:getApps", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getApps.
type GetAppsArgs struct {
	Extension           *bool           `pulumi:"extension"`
	Filters             []GetAppsFilter `pulumi:"filters"`
	IconUrl             *string         `pulumi:"iconUrl"`
	LoginId             *int            `pulumi:"loginId"`
	Name                *string         `pulumi:"name"`
	ProvisioningEnabled *bool           `pulumi:"provisioningEnabled"`
	ProvisioningState   *string         `pulumi:"provisioningState"`
	ProvisioningStatus  *string         `pulumi:"provisioningStatus"`
	UsersId             string          `pulumi:"usersId"`
}

// A collection of values returned by getApps.
type GetAppsResult struct {
	Extension bool            `pulumi:"extension"`
	Filters   []GetAppsFilter `pulumi:"filters"`
	IconUrl   string          `pulumi:"iconUrl"`
	// The provider-assigned unique ID for this managed resource.
	Id                  string `pulumi:"id"`
	LoginId             int    `pulumi:"loginId"`
	Name                string `pulumi:"name"`
	ProvisioningEnabled bool   `pulumi:"provisioningEnabled"`
	ProvisioningState   string `pulumi:"provisioningState"`
	ProvisioningStatus  string `pulumi:"provisioningStatus"`
	UsersId             string `pulumi:"usersId"`
}

func GetAppsOutput(ctx *pulumi.Context, args GetAppsOutputArgs, opts ...pulumi.InvokeOption) GetAppsResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetAppsResultOutput, error) {
			args := v.(GetAppsArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("onelogin:users/getApps:getApps", args, GetAppsResultOutput{}, options).(GetAppsResultOutput), nil
		}).(GetAppsResultOutput)
}

// A collection of arguments for invoking getApps.
type GetAppsOutputArgs struct {
	Extension           pulumi.BoolPtrInput     `pulumi:"extension"`
	Filters             GetAppsFilterArrayInput `pulumi:"filters"`
	IconUrl             pulumi.StringPtrInput   `pulumi:"iconUrl"`
	LoginId             pulumi.IntPtrInput      `pulumi:"loginId"`
	Name                pulumi.StringPtrInput   `pulumi:"name"`
	ProvisioningEnabled pulumi.BoolPtrInput     `pulumi:"provisioningEnabled"`
	ProvisioningState   pulumi.StringPtrInput   `pulumi:"provisioningState"`
	ProvisioningStatus  pulumi.StringPtrInput   `pulumi:"provisioningStatus"`
	UsersId             pulumi.StringInput      `pulumi:"usersId"`
}

func (GetAppsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetAppsArgs)(nil)).Elem()
}

// A collection of values returned by getApps.
type GetAppsResultOutput struct{ *pulumi.OutputState }

func (GetAppsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetAppsResult)(nil)).Elem()
}

func (o GetAppsResultOutput) ToGetAppsResultOutput() GetAppsResultOutput {
	return o
}

func (o GetAppsResultOutput) ToGetAppsResultOutputWithContext(ctx context.Context) GetAppsResultOutput {
	return o
}

func (o GetAppsResultOutput) Extension() pulumi.BoolOutput {
	return o.ApplyT(func(v GetAppsResult) bool { return v.Extension }).(pulumi.BoolOutput)
}

func (o GetAppsResultOutput) Filters() GetAppsFilterArrayOutput {
	return o.ApplyT(func(v GetAppsResult) []GetAppsFilter { return v.Filters }).(GetAppsFilterArrayOutput)
}

func (o GetAppsResultOutput) IconUrl() pulumi.StringOutput {
	return o.ApplyT(func(v GetAppsResult) string { return v.IconUrl }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetAppsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetAppsResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetAppsResultOutput) LoginId() pulumi.IntOutput {
	return o.ApplyT(func(v GetAppsResult) int { return v.LoginId }).(pulumi.IntOutput)
}

func (o GetAppsResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v GetAppsResult) string { return v.Name }).(pulumi.StringOutput)
}

func (o GetAppsResultOutput) ProvisioningEnabled() pulumi.BoolOutput {
	return o.ApplyT(func(v GetAppsResult) bool { return v.ProvisioningEnabled }).(pulumi.BoolOutput)
}

func (o GetAppsResultOutput) ProvisioningState() pulumi.StringOutput {
	return o.ApplyT(func(v GetAppsResult) string { return v.ProvisioningState }).(pulumi.StringOutput)
}

func (o GetAppsResultOutput) ProvisioningStatus() pulumi.StringOutput {
	return o.ApplyT(func(v GetAppsResult) string { return v.ProvisioningStatus }).(pulumi.StringOutput)
}

func (o GetAppsResultOutput) UsersId() pulumi.StringOutput {
	return o.ApplyT(func(v GetAppsResult) string { return v.UsersId }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetAppsResultOutput{})
}
