// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package roles

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func GetInstance(ctx *pulumi.Context, args *GetInstanceArgs, opts ...pulumi.InvokeOption) (*GetInstanceResult, error) {
	var rv GetInstanceResult
	err := ctx.Invoke("onelogin:roles/getInstance:getInstance", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getInstance.
type GetInstanceArgs struct {
	Admins []int   `pulumi:"admins"`
	Apps   []int   `pulumi:"apps"`
	Id     string  `pulumi:"id"`
	Name   *string `pulumi:"name"`
	Users  []int   `pulumi:"users"`
}

// A collection of values returned by getInstance.
type GetInstanceResult struct {
	Admins []int  `pulumi:"admins"`
	Apps   []int  `pulumi:"apps"`
	Id     string `pulumi:"id"`
	Name   string `pulumi:"name"`
	Users  []int  `pulumi:"users"`
}

func GetInstanceOutput(ctx *pulumi.Context, args GetInstanceOutputArgs, opts ...pulumi.InvokeOption) GetInstanceResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetInstanceResult, error) {
			args := v.(GetInstanceArgs)
			r, err := GetInstance(ctx, &args, opts...)
			var s GetInstanceResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetInstanceResultOutput)
}

// A collection of arguments for invoking getInstance.
type GetInstanceOutputArgs struct {
	Admins pulumi.IntArrayInput  `pulumi:"admins"`
	Apps   pulumi.IntArrayInput  `pulumi:"apps"`
	Id     pulumi.StringInput    `pulumi:"id"`
	Name   pulumi.StringPtrInput `pulumi:"name"`
	Users  pulumi.IntArrayInput  `pulumi:"users"`
}

func (GetInstanceOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetInstanceArgs)(nil)).Elem()
}

// A collection of values returned by getInstance.
type GetInstanceResultOutput struct{ *pulumi.OutputState }

func (GetInstanceResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetInstanceResult)(nil)).Elem()
}

func (o GetInstanceResultOutput) ToGetInstanceResultOutput() GetInstanceResultOutput {
	return o
}

func (o GetInstanceResultOutput) ToGetInstanceResultOutputWithContext(ctx context.Context) GetInstanceResultOutput {
	return o
}

func (o GetInstanceResultOutput) Admins() pulumi.IntArrayOutput {
	return o.ApplyT(func(v GetInstanceResult) []int { return v.Admins }).(pulumi.IntArrayOutput)
}

func (o GetInstanceResultOutput) Apps() pulumi.IntArrayOutput {
	return o.ApplyT(func(v GetInstanceResult) []int { return v.Apps }).(pulumi.IntArrayOutput)
}

func (o GetInstanceResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetInstanceResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetInstanceResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v GetInstanceResult) string { return v.Name }).(pulumi.StringOutput)
}

func (o GetInstanceResultOutput) Users() pulumi.IntArrayOutput {
	return o.ApplyT(func(v GetInstanceResult) []int { return v.Users }).(pulumi.IntArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(GetInstanceResultOutput{})
}