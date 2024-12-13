// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package onelogin

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-onelogin/sdk/go/onelogin/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func GetRiskRulesInstance(ctx *pulumi.Context, args *GetRiskRulesInstanceArgs, opts ...pulumi.InvokeOption) (*GetRiskRulesInstanceResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetRiskRulesInstanceResult
	err := ctx.Invoke("onelogin:index/getRiskRulesInstance:getRiskRulesInstance", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getRiskRulesInstance.
type GetRiskRulesInstanceArgs struct {
	Description *string                     `pulumi:"description"`
	Filters     []string                    `pulumi:"filters"`
	Id          string                      `pulumi:"id"`
	Name        *string                     `pulumi:"name"`
	Source      *GetRiskRulesInstanceSource `pulumi:"source"`
	Target      *string                     `pulumi:"target"`
	Type        *string                     `pulumi:"type"`
}

// A collection of values returned by getRiskRulesInstance.
type GetRiskRulesInstanceResult struct {
	Description string                     `pulumi:"description"`
	Filters     []string                   `pulumi:"filters"`
	Id          string                     `pulumi:"id"`
	Name        string                     `pulumi:"name"`
	Source      GetRiskRulesInstanceSource `pulumi:"source"`
	Target      string                     `pulumi:"target"`
	Type        string                     `pulumi:"type"`
}

func GetRiskRulesInstanceOutput(ctx *pulumi.Context, args GetRiskRulesInstanceOutputArgs, opts ...pulumi.InvokeOption) GetRiskRulesInstanceResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetRiskRulesInstanceResultOutput, error) {
			args := v.(GetRiskRulesInstanceArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("onelogin:index/getRiskRulesInstance:getRiskRulesInstance", args, GetRiskRulesInstanceResultOutput{}, options).(GetRiskRulesInstanceResultOutput), nil
		}).(GetRiskRulesInstanceResultOutput)
}

// A collection of arguments for invoking getRiskRulesInstance.
type GetRiskRulesInstanceOutputArgs struct {
	Description pulumi.StringPtrInput              `pulumi:"description"`
	Filters     pulumi.StringArrayInput            `pulumi:"filters"`
	Id          pulumi.StringInput                 `pulumi:"id"`
	Name        pulumi.StringPtrInput              `pulumi:"name"`
	Source      GetRiskRulesInstanceSourcePtrInput `pulumi:"source"`
	Target      pulumi.StringPtrInput              `pulumi:"target"`
	Type        pulumi.StringPtrInput              `pulumi:"type"`
}

func (GetRiskRulesInstanceOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetRiskRulesInstanceArgs)(nil)).Elem()
}

// A collection of values returned by getRiskRulesInstance.
type GetRiskRulesInstanceResultOutput struct{ *pulumi.OutputState }

func (GetRiskRulesInstanceResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetRiskRulesInstanceResult)(nil)).Elem()
}

func (o GetRiskRulesInstanceResultOutput) ToGetRiskRulesInstanceResultOutput() GetRiskRulesInstanceResultOutput {
	return o
}

func (o GetRiskRulesInstanceResultOutput) ToGetRiskRulesInstanceResultOutputWithContext(ctx context.Context) GetRiskRulesInstanceResultOutput {
	return o
}

func (o GetRiskRulesInstanceResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v GetRiskRulesInstanceResult) string { return v.Description }).(pulumi.StringOutput)
}

func (o GetRiskRulesInstanceResultOutput) Filters() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetRiskRulesInstanceResult) []string { return v.Filters }).(pulumi.StringArrayOutput)
}

func (o GetRiskRulesInstanceResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetRiskRulesInstanceResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetRiskRulesInstanceResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v GetRiskRulesInstanceResult) string { return v.Name }).(pulumi.StringOutput)
}

func (o GetRiskRulesInstanceResultOutput) Source() GetRiskRulesInstanceSourceOutput {
	return o.ApplyT(func(v GetRiskRulesInstanceResult) GetRiskRulesInstanceSource { return v.Source }).(GetRiskRulesInstanceSourceOutput)
}

func (o GetRiskRulesInstanceResultOutput) Target() pulumi.StringOutput {
	return o.ApplyT(func(v GetRiskRulesInstanceResult) string { return v.Target }).(pulumi.StringOutput)
}

func (o GetRiskRulesInstanceResultOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v GetRiskRulesInstanceResult) string { return v.Type }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetRiskRulesInstanceResultOutput{})
}
