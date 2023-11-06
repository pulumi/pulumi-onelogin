// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package apps

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-onelogin/sdk/go/onelogin/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func GetConditionsOperators(ctx *pulumi.Context, args *GetConditionsOperatorsArgs, opts ...pulumi.InvokeOption) (*GetConditionsOperatorsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetConditionsOperatorsResult
	err := ctx.Invoke("onelogin:apps/getConditionsOperators:getConditionsOperators", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getConditionsOperators.
type GetConditionsOperatorsArgs struct {
	AppsId       string                         `pulumi:"appsId"`
	ConditionsId string                         `pulumi:"conditionsId"`
	Filters      []GetConditionsOperatorsFilter `pulumi:"filters"`
	Name         *string                        `pulumi:"name"`
	Value        *string                        `pulumi:"value"`
}

// A collection of values returned by getConditionsOperators.
type GetConditionsOperatorsResult struct {
	AppsId       string                         `pulumi:"appsId"`
	ConditionsId string                         `pulumi:"conditionsId"`
	Filters      []GetConditionsOperatorsFilter `pulumi:"filters"`
	// The provider-assigned unique ID for this managed resource.
	Id    string `pulumi:"id"`
	Name  string `pulumi:"name"`
	Value string `pulumi:"value"`
}

func GetConditionsOperatorsOutput(ctx *pulumi.Context, args GetConditionsOperatorsOutputArgs, opts ...pulumi.InvokeOption) GetConditionsOperatorsResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetConditionsOperatorsResult, error) {
			args := v.(GetConditionsOperatorsArgs)
			r, err := GetConditionsOperators(ctx, &args, opts...)
			var s GetConditionsOperatorsResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetConditionsOperatorsResultOutput)
}

// A collection of arguments for invoking getConditionsOperators.
type GetConditionsOperatorsOutputArgs struct {
	AppsId       pulumi.StringInput                     `pulumi:"appsId"`
	ConditionsId pulumi.StringInput                     `pulumi:"conditionsId"`
	Filters      GetConditionsOperatorsFilterArrayInput `pulumi:"filters"`
	Name         pulumi.StringPtrInput                  `pulumi:"name"`
	Value        pulumi.StringPtrInput                  `pulumi:"value"`
}

func (GetConditionsOperatorsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetConditionsOperatorsArgs)(nil)).Elem()
}

// A collection of values returned by getConditionsOperators.
type GetConditionsOperatorsResultOutput struct{ *pulumi.OutputState }

func (GetConditionsOperatorsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetConditionsOperatorsResult)(nil)).Elem()
}

func (o GetConditionsOperatorsResultOutput) ToGetConditionsOperatorsResultOutput() GetConditionsOperatorsResultOutput {
	return o
}

func (o GetConditionsOperatorsResultOutput) ToGetConditionsOperatorsResultOutputWithContext(ctx context.Context) GetConditionsOperatorsResultOutput {
	return o
}

func (o GetConditionsOperatorsResultOutput) AppsId() pulumi.StringOutput {
	return o.ApplyT(func(v GetConditionsOperatorsResult) string { return v.AppsId }).(pulumi.StringOutput)
}

func (o GetConditionsOperatorsResultOutput) ConditionsId() pulumi.StringOutput {
	return o.ApplyT(func(v GetConditionsOperatorsResult) string { return v.ConditionsId }).(pulumi.StringOutput)
}

func (o GetConditionsOperatorsResultOutput) Filters() GetConditionsOperatorsFilterArrayOutput {
	return o.ApplyT(func(v GetConditionsOperatorsResult) []GetConditionsOperatorsFilter { return v.Filters }).(GetConditionsOperatorsFilterArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetConditionsOperatorsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetConditionsOperatorsResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetConditionsOperatorsResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v GetConditionsOperatorsResult) string { return v.Name }).(pulumi.StringOutput)
}

func (o GetConditionsOperatorsResultOutput) Value() pulumi.StringOutput {
	return o.ApplyT(func(v GetConditionsOperatorsResult) string { return v.Value }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetConditionsOperatorsResultOutput{})
}
