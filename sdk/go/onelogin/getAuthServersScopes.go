// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package onelogin

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-onelogin/sdk/go/onelogin/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func GetAuthServersScopes(ctx *pulumi.Context, args *GetAuthServersScopesArgs, opts ...pulumi.InvokeOption) (*GetAuthServersScopesResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetAuthServersScopesResult
	err := ctx.Invoke("onelogin:index/getAuthServersScopes:getAuthServersScopes", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getAuthServersScopes.
type GetAuthServersScopesArgs struct {
	AuthServersId string                       `pulumi:"authServersId"`
	Description   *string                      `pulumi:"description"`
	Filters       []GetAuthServersScopesFilter `pulumi:"filters"`
	Value         *string                      `pulumi:"value"`
}

// A collection of values returned by getAuthServersScopes.
type GetAuthServersScopesResult struct {
	AuthServersId string                       `pulumi:"authServersId"`
	Description   string                       `pulumi:"description"`
	Filters       []GetAuthServersScopesFilter `pulumi:"filters"`
	// The provider-assigned unique ID for this managed resource.
	Id    string `pulumi:"id"`
	Value string `pulumi:"value"`
}

func GetAuthServersScopesOutput(ctx *pulumi.Context, args GetAuthServersScopesOutputArgs, opts ...pulumi.InvokeOption) GetAuthServersScopesResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetAuthServersScopesResult, error) {
			args := v.(GetAuthServersScopesArgs)
			r, err := GetAuthServersScopes(ctx, &args, opts...)
			var s GetAuthServersScopesResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetAuthServersScopesResultOutput)
}

// A collection of arguments for invoking getAuthServersScopes.
type GetAuthServersScopesOutputArgs struct {
	AuthServersId pulumi.StringInput                   `pulumi:"authServersId"`
	Description   pulumi.StringPtrInput                `pulumi:"description"`
	Filters       GetAuthServersScopesFilterArrayInput `pulumi:"filters"`
	Value         pulumi.StringPtrInput                `pulumi:"value"`
}

func (GetAuthServersScopesOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetAuthServersScopesArgs)(nil)).Elem()
}

// A collection of values returned by getAuthServersScopes.
type GetAuthServersScopesResultOutput struct{ *pulumi.OutputState }

func (GetAuthServersScopesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetAuthServersScopesResult)(nil)).Elem()
}

func (o GetAuthServersScopesResultOutput) ToGetAuthServersScopesResultOutput() GetAuthServersScopesResultOutput {
	return o
}

func (o GetAuthServersScopesResultOutput) ToGetAuthServersScopesResultOutputWithContext(ctx context.Context) GetAuthServersScopesResultOutput {
	return o
}

func (o GetAuthServersScopesResultOutput) AuthServersId() pulumi.StringOutput {
	return o.ApplyT(func(v GetAuthServersScopesResult) string { return v.AuthServersId }).(pulumi.StringOutput)
}

func (o GetAuthServersScopesResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v GetAuthServersScopesResult) string { return v.Description }).(pulumi.StringOutput)
}

func (o GetAuthServersScopesResultOutput) Filters() GetAuthServersScopesFilterArrayOutput {
	return o.ApplyT(func(v GetAuthServersScopesResult) []GetAuthServersScopesFilter { return v.Filters }).(GetAuthServersScopesFilterArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetAuthServersScopesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetAuthServersScopesResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetAuthServersScopesResultOutput) Value() pulumi.StringOutput {
	return o.ApplyT(func(v GetAuthServersScopesResult) string { return v.Value }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetAuthServersScopesResultOutput{})
}
