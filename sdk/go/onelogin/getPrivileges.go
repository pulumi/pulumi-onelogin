// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package onelogin

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-onelogin/sdk/go/onelogin/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func LookupPrivileges(ctx *pulumi.Context, args *LookupPrivilegesArgs, opts ...pulumi.InvokeOption) (*LookupPrivilegesResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupPrivilegesResult
	err := ctx.Invoke("onelogin:index/getPrivileges:getPrivileges", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getPrivileges.
type LookupPrivilegesArgs struct {
	Description *string                 `pulumi:"description"`
	Filters     []GetPrivilegesFilter   `pulumi:"filters"`
	Name        *string                 `pulumi:"name"`
	Privilege   *GetPrivilegesPrivilege `pulumi:"privilege"`
}

// A collection of values returned by getPrivileges.
type LookupPrivilegesResult struct {
	Description string                `pulumi:"description"`
	Filters     []GetPrivilegesFilter `pulumi:"filters"`
	// The provider-assigned unique ID for this managed resource.
	Id        string                 `pulumi:"id"`
	Name      string                 `pulumi:"name"`
	Privilege GetPrivilegesPrivilege `pulumi:"privilege"`
}

func LookupPrivilegesOutput(ctx *pulumi.Context, args LookupPrivilegesOutputArgs, opts ...pulumi.InvokeOption) LookupPrivilegesResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupPrivilegesResultOutput, error) {
			args := v.(LookupPrivilegesArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("onelogin:index/getPrivileges:getPrivileges", args, LookupPrivilegesResultOutput{}, options).(LookupPrivilegesResultOutput), nil
		}).(LookupPrivilegesResultOutput)
}

// A collection of arguments for invoking getPrivileges.
type LookupPrivilegesOutputArgs struct {
	Description pulumi.StringPtrInput          `pulumi:"description"`
	Filters     GetPrivilegesFilterArrayInput  `pulumi:"filters"`
	Name        pulumi.StringPtrInput          `pulumi:"name"`
	Privilege   GetPrivilegesPrivilegePtrInput `pulumi:"privilege"`
}

func (LookupPrivilegesOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupPrivilegesArgs)(nil)).Elem()
}

// A collection of values returned by getPrivileges.
type LookupPrivilegesResultOutput struct{ *pulumi.OutputState }

func (LookupPrivilegesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupPrivilegesResult)(nil)).Elem()
}

func (o LookupPrivilegesResultOutput) ToLookupPrivilegesResultOutput() LookupPrivilegesResultOutput {
	return o
}

func (o LookupPrivilegesResultOutput) ToLookupPrivilegesResultOutputWithContext(ctx context.Context) LookupPrivilegesResultOutput {
	return o
}

func (o LookupPrivilegesResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v LookupPrivilegesResult) string { return v.Description }).(pulumi.StringOutput)
}

func (o LookupPrivilegesResultOutput) Filters() GetPrivilegesFilterArrayOutput {
	return o.ApplyT(func(v LookupPrivilegesResult) []GetPrivilegesFilter { return v.Filters }).(GetPrivilegesFilterArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupPrivilegesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupPrivilegesResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupPrivilegesResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupPrivilegesResult) string { return v.Name }).(pulumi.StringOutput)
}

func (o LookupPrivilegesResultOutput) Privilege() GetPrivilegesPrivilegeOutput {
	return o.ApplyT(func(v LookupPrivilegesResult) GetPrivilegesPrivilege { return v.Privilege }).(GetPrivilegesPrivilegeOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupPrivilegesResultOutput{})
}
