// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package onelogin

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-onelogin/sdk/go/onelogin/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

func GetAuthServersInstance(ctx *pulumi.Context, args *GetAuthServersInstanceArgs, opts ...pulumi.InvokeOption) (*GetAuthServersInstanceResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetAuthServersInstanceResult
	err := ctx.Invoke("onelogin:index/getAuthServersInstance:getAuthServersInstance", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getAuthServersInstance.
type GetAuthServersInstanceArgs struct {
	Configuration *GetAuthServersInstanceConfiguration `pulumi:"configuration"`
	Description   *string                              `pulumi:"description"`
	Id            string                               `pulumi:"id"`
	Name          *string                              `pulumi:"name"`
}

// A collection of values returned by getAuthServersInstance.
type GetAuthServersInstanceResult struct {
	Configuration GetAuthServersInstanceConfiguration `pulumi:"configuration"`
	Description   string                              `pulumi:"description"`
	Id            string                              `pulumi:"id"`
	Name          string                              `pulumi:"name"`
}

func GetAuthServersInstanceOutput(ctx *pulumi.Context, args GetAuthServersInstanceOutputArgs, opts ...pulumi.InvokeOption) GetAuthServersInstanceResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetAuthServersInstanceResult, error) {
			args := v.(GetAuthServersInstanceArgs)
			r, err := GetAuthServersInstance(ctx, &args, opts...)
			var s GetAuthServersInstanceResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetAuthServersInstanceResultOutput)
}

// A collection of arguments for invoking getAuthServersInstance.
type GetAuthServersInstanceOutputArgs struct {
	Configuration GetAuthServersInstanceConfigurationPtrInput `pulumi:"configuration"`
	Description   pulumi.StringPtrInput                       `pulumi:"description"`
	Id            pulumi.StringInput                          `pulumi:"id"`
	Name          pulumi.StringPtrInput                       `pulumi:"name"`
}

func (GetAuthServersInstanceOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetAuthServersInstanceArgs)(nil)).Elem()
}

// A collection of values returned by getAuthServersInstance.
type GetAuthServersInstanceResultOutput struct{ *pulumi.OutputState }

func (GetAuthServersInstanceResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetAuthServersInstanceResult)(nil)).Elem()
}

func (o GetAuthServersInstanceResultOutput) ToGetAuthServersInstanceResultOutput() GetAuthServersInstanceResultOutput {
	return o
}

func (o GetAuthServersInstanceResultOutput) ToGetAuthServersInstanceResultOutputWithContext(ctx context.Context) GetAuthServersInstanceResultOutput {
	return o
}

func (o GetAuthServersInstanceResultOutput) ToOutput(ctx context.Context) pulumix.Output[GetAuthServersInstanceResult] {
	return pulumix.Output[GetAuthServersInstanceResult]{
		OutputState: o.OutputState,
	}
}

func (o GetAuthServersInstanceResultOutput) Configuration() GetAuthServersInstanceConfigurationOutput {
	return o.ApplyT(func(v GetAuthServersInstanceResult) GetAuthServersInstanceConfiguration { return v.Configuration }).(GetAuthServersInstanceConfigurationOutput)
}

func (o GetAuthServersInstanceResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v GetAuthServersInstanceResult) string { return v.Description }).(pulumi.StringOutput)
}

func (o GetAuthServersInstanceResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetAuthServersInstanceResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetAuthServersInstanceResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v GetAuthServersInstanceResult) string { return v.Name }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetAuthServersInstanceResultOutput{})
}
