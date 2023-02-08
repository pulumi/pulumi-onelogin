// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package api

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func GetAuthorizationsClaims(ctx *pulumi.Context, args *GetAuthorizationsClaimsArgs, opts ...pulumi.InvokeOption) (*GetAuthorizationsClaimsResult, error) {
	var rv GetAuthorizationsClaimsResult
	err := ctx.Invoke("onelogin:api/getAuthorizationsClaims:getAuthorizationsClaims", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getAuthorizationsClaims.
type GetAuthorizationsClaimsArgs struct {
	ApiAuthorizationsId      string                          `pulumi:"apiAuthorizationsId"`
	AttributeTransformations *string                         `pulumi:"attributeTransformations"`
	DefaultValues            *string                         `pulumi:"defaultValues"`
	Filters                  []GetAuthorizationsClaimsFilter `pulumi:"filters"`
	Label                    *string                         `pulumi:"label"`
	ProvisionedEntitlements  *bool                           `pulumi:"provisionedEntitlements"`
	SkipIfBlank              *bool                           `pulumi:"skipIfBlank"`
	UserAttributeMacros      *string                         `pulumi:"userAttributeMacros"`
	UserAttributeMappings    *string                         `pulumi:"userAttributeMappings"`
	Values                   []string                        `pulumi:"values"`
}

// A collection of values returned by getAuthorizationsClaims.
type GetAuthorizationsClaimsResult struct {
	ApiAuthorizationsId      string                          `pulumi:"apiAuthorizationsId"`
	AttributeTransformations string                          `pulumi:"attributeTransformations"`
	DefaultValues            string                          `pulumi:"defaultValues"`
	Filters                  []GetAuthorizationsClaimsFilter `pulumi:"filters"`
	// The provider-assigned unique ID for this managed resource.
	Id                      string   `pulumi:"id"`
	Label                   string   `pulumi:"label"`
	ProvisionedEntitlements bool     `pulumi:"provisionedEntitlements"`
	SkipIfBlank             bool     `pulumi:"skipIfBlank"`
	UserAttributeMacros     string   `pulumi:"userAttributeMacros"`
	UserAttributeMappings   string   `pulumi:"userAttributeMappings"`
	Values                  []string `pulumi:"values"`
}

func GetAuthorizationsClaimsOutput(ctx *pulumi.Context, args GetAuthorizationsClaimsOutputArgs, opts ...pulumi.InvokeOption) GetAuthorizationsClaimsResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetAuthorizationsClaimsResult, error) {
			args := v.(GetAuthorizationsClaimsArgs)
			r, err := GetAuthorizationsClaims(ctx, &args, opts...)
			var s GetAuthorizationsClaimsResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetAuthorizationsClaimsResultOutput)
}

// A collection of arguments for invoking getAuthorizationsClaims.
type GetAuthorizationsClaimsOutputArgs struct {
	ApiAuthorizationsId      pulumi.StringInput                      `pulumi:"apiAuthorizationsId"`
	AttributeTransformations pulumi.StringPtrInput                   `pulumi:"attributeTransformations"`
	DefaultValues            pulumi.StringPtrInput                   `pulumi:"defaultValues"`
	Filters                  GetAuthorizationsClaimsFilterArrayInput `pulumi:"filters"`
	Label                    pulumi.StringPtrInput                   `pulumi:"label"`
	ProvisionedEntitlements  pulumi.BoolPtrInput                     `pulumi:"provisionedEntitlements"`
	SkipIfBlank              pulumi.BoolPtrInput                     `pulumi:"skipIfBlank"`
	UserAttributeMacros      pulumi.StringPtrInput                   `pulumi:"userAttributeMacros"`
	UserAttributeMappings    pulumi.StringPtrInput                   `pulumi:"userAttributeMappings"`
	Values                   pulumi.StringArrayInput                 `pulumi:"values"`
}

func (GetAuthorizationsClaimsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetAuthorizationsClaimsArgs)(nil)).Elem()
}

// A collection of values returned by getAuthorizationsClaims.
type GetAuthorizationsClaimsResultOutput struct{ *pulumi.OutputState }

func (GetAuthorizationsClaimsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetAuthorizationsClaimsResult)(nil)).Elem()
}

func (o GetAuthorizationsClaimsResultOutput) ToGetAuthorizationsClaimsResultOutput() GetAuthorizationsClaimsResultOutput {
	return o
}

func (o GetAuthorizationsClaimsResultOutput) ToGetAuthorizationsClaimsResultOutputWithContext(ctx context.Context) GetAuthorizationsClaimsResultOutput {
	return o
}

func (o GetAuthorizationsClaimsResultOutput) ApiAuthorizationsId() pulumi.StringOutput {
	return o.ApplyT(func(v GetAuthorizationsClaimsResult) string { return v.ApiAuthorizationsId }).(pulumi.StringOutput)
}

func (o GetAuthorizationsClaimsResultOutput) AttributeTransformations() pulumi.StringOutput {
	return o.ApplyT(func(v GetAuthorizationsClaimsResult) string { return v.AttributeTransformations }).(pulumi.StringOutput)
}

func (o GetAuthorizationsClaimsResultOutput) DefaultValues() pulumi.StringOutput {
	return o.ApplyT(func(v GetAuthorizationsClaimsResult) string { return v.DefaultValues }).(pulumi.StringOutput)
}

func (o GetAuthorizationsClaimsResultOutput) Filters() GetAuthorizationsClaimsFilterArrayOutput {
	return o.ApplyT(func(v GetAuthorizationsClaimsResult) []GetAuthorizationsClaimsFilter { return v.Filters }).(GetAuthorizationsClaimsFilterArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetAuthorizationsClaimsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetAuthorizationsClaimsResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetAuthorizationsClaimsResultOutput) Label() pulumi.StringOutput {
	return o.ApplyT(func(v GetAuthorizationsClaimsResult) string { return v.Label }).(pulumi.StringOutput)
}

func (o GetAuthorizationsClaimsResultOutput) ProvisionedEntitlements() pulumi.BoolOutput {
	return o.ApplyT(func(v GetAuthorizationsClaimsResult) bool { return v.ProvisionedEntitlements }).(pulumi.BoolOutput)
}

func (o GetAuthorizationsClaimsResultOutput) SkipIfBlank() pulumi.BoolOutput {
	return o.ApplyT(func(v GetAuthorizationsClaimsResult) bool { return v.SkipIfBlank }).(pulumi.BoolOutput)
}

func (o GetAuthorizationsClaimsResultOutput) UserAttributeMacros() pulumi.StringOutput {
	return o.ApplyT(func(v GetAuthorizationsClaimsResult) string { return v.UserAttributeMacros }).(pulumi.StringOutput)
}

func (o GetAuthorizationsClaimsResultOutput) UserAttributeMappings() pulumi.StringOutput {
	return o.ApplyT(func(v GetAuthorizationsClaimsResult) string { return v.UserAttributeMappings }).(pulumi.StringOutput)
}

func (o GetAuthorizationsClaimsResultOutput) Values() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetAuthorizationsClaimsResult) []string { return v.Values }).(pulumi.StringArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(GetAuthorizationsClaimsResultOutput{})
}
