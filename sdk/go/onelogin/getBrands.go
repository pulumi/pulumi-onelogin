// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package onelogin

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func GetBrands(ctx *pulumi.Context, args *GetBrandsArgs, opts ...pulumi.InvokeOption) (*GetBrandsResult, error) {
	var rv GetBrandsResult
	err := ctx.Invoke("onelogin:index/getBrands:getBrands", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getBrands.
type GetBrandsArgs struct {
	Enabled *bool             `pulumi:"enabled"`
	Filters []GetBrandsFilter `pulumi:"filters"`
	Name    *string           `pulumi:"name"`
}

// A collection of values returned by getBrands.
type GetBrandsResult struct {
	Enabled bool              `pulumi:"enabled"`
	Filters []GetBrandsFilter `pulumi:"filters"`
	// The provider-assigned unique ID for this managed resource.
	Id   string `pulumi:"id"`
	Name string `pulumi:"name"`
}

func GetBrandsOutput(ctx *pulumi.Context, args GetBrandsOutputArgs, opts ...pulumi.InvokeOption) GetBrandsResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetBrandsResult, error) {
			args := v.(GetBrandsArgs)
			r, err := GetBrands(ctx, &args, opts...)
			var s GetBrandsResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetBrandsResultOutput)
}

// A collection of arguments for invoking getBrands.
type GetBrandsOutputArgs struct {
	Enabled pulumi.BoolPtrInput       `pulumi:"enabled"`
	Filters GetBrandsFilterArrayInput `pulumi:"filters"`
	Name    pulumi.StringPtrInput     `pulumi:"name"`
}

func (GetBrandsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetBrandsArgs)(nil)).Elem()
}

// A collection of values returned by getBrands.
type GetBrandsResultOutput struct{ *pulumi.OutputState }

func (GetBrandsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetBrandsResult)(nil)).Elem()
}

func (o GetBrandsResultOutput) ToGetBrandsResultOutput() GetBrandsResultOutput {
	return o
}

func (o GetBrandsResultOutput) ToGetBrandsResultOutputWithContext(ctx context.Context) GetBrandsResultOutput {
	return o
}

func (o GetBrandsResultOutput) Enabled() pulumi.BoolOutput {
	return o.ApplyT(func(v GetBrandsResult) bool { return v.Enabled }).(pulumi.BoolOutput)
}

func (o GetBrandsResultOutput) Filters() GetBrandsFilterArrayOutput {
	return o.ApplyT(func(v GetBrandsResult) []GetBrandsFilter { return v.Filters }).(GetBrandsFilterArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetBrandsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetBrandsResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetBrandsResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v GetBrandsResult) string { return v.Name }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetBrandsResultOutput{})
}
