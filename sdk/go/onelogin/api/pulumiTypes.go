// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package api

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

type GetAuthorizationsClaimsFilter struct {
	Name   string   `pulumi:"name"`
	Values []string `pulumi:"values"`
}

// GetAuthorizationsClaimsFilterInput is an input type that accepts GetAuthorizationsClaimsFilterArgs and GetAuthorizationsClaimsFilterOutput values.
// You can construct a concrete instance of `GetAuthorizationsClaimsFilterInput` via:
//
//	GetAuthorizationsClaimsFilterArgs{...}
type GetAuthorizationsClaimsFilterInput interface {
	pulumi.Input

	ToGetAuthorizationsClaimsFilterOutput() GetAuthorizationsClaimsFilterOutput
	ToGetAuthorizationsClaimsFilterOutputWithContext(context.Context) GetAuthorizationsClaimsFilterOutput
}

type GetAuthorizationsClaimsFilterArgs struct {
	Name   pulumi.StringInput      `pulumi:"name"`
	Values pulumi.StringArrayInput `pulumi:"values"`
}

func (GetAuthorizationsClaimsFilterArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetAuthorizationsClaimsFilter)(nil)).Elem()
}

func (i GetAuthorizationsClaimsFilterArgs) ToGetAuthorizationsClaimsFilterOutput() GetAuthorizationsClaimsFilterOutput {
	return i.ToGetAuthorizationsClaimsFilterOutputWithContext(context.Background())
}

func (i GetAuthorizationsClaimsFilterArgs) ToGetAuthorizationsClaimsFilterOutputWithContext(ctx context.Context) GetAuthorizationsClaimsFilterOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GetAuthorizationsClaimsFilterOutput)
}

// GetAuthorizationsClaimsFilterArrayInput is an input type that accepts GetAuthorizationsClaimsFilterArray and GetAuthorizationsClaimsFilterArrayOutput values.
// You can construct a concrete instance of `GetAuthorizationsClaimsFilterArrayInput` via:
//
//	GetAuthorizationsClaimsFilterArray{ GetAuthorizationsClaimsFilterArgs{...} }
type GetAuthorizationsClaimsFilterArrayInput interface {
	pulumi.Input

	ToGetAuthorizationsClaimsFilterArrayOutput() GetAuthorizationsClaimsFilterArrayOutput
	ToGetAuthorizationsClaimsFilterArrayOutputWithContext(context.Context) GetAuthorizationsClaimsFilterArrayOutput
}

type GetAuthorizationsClaimsFilterArray []GetAuthorizationsClaimsFilterInput

func (GetAuthorizationsClaimsFilterArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]GetAuthorizationsClaimsFilter)(nil)).Elem()
}

func (i GetAuthorizationsClaimsFilterArray) ToGetAuthorizationsClaimsFilterArrayOutput() GetAuthorizationsClaimsFilterArrayOutput {
	return i.ToGetAuthorizationsClaimsFilterArrayOutputWithContext(context.Background())
}

func (i GetAuthorizationsClaimsFilterArray) ToGetAuthorizationsClaimsFilterArrayOutputWithContext(ctx context.Context) GetAuthorizationsClaimsFilterArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GetAuthorizationsClaimsFilterArrayOutput)
}

type GetAuthorizationsClaimsFilterOutput struct{ *pulumi.OutputState }

func (GetAuthorizationsClaimsFilterOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetAuthorizationsClaimsFilter)(nil)).Elem()
}

func (o GetAuthorizationsClaimsFilterOutput) ToGetAuthorizationsClaimsFilterOutput() GetAuthorizationsClaimsFilterOutput {
	return o
}

func (o GetAuthorizationsClaimsFilterOutput) ToGetAuthorizationsClaimsFilterOutputWithContext(ctx context.Context) GetAuthorizationsClaimsFilterOutput {
	return o
}

func (o GetAuthorizationsClaimsFilterOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v GetAuthorizationsClaimsFilter) string { return v.Name }).(pulumi.StringOutput)
}

func (o GetAuthorizationsClaimsFilterOutput) Values() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetAuthorizationsClaimsFilter) []string { return v.Values }).(pulumi.StringArrayOutput)
}

type GetAuthorizationsClaimsFilterArrayOutput struct{ *pulumi.OutputState }

func (GetAuthorizationsClaimsFilterArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]GetAuthorizationsClaimsFilter)(nil)).Elem()
}

func (o GetAuthorizationsClaimsFilterArrayOutput) ToGetAuthorizationsClaimsFilterArrayOutput() GetAuthorizationsClaimsFilterArrayOutput {
	return o
}

func (o GetAuthorizationsClaimsFilterArrayOutput) ToGetAuthorizationsClaimsFilterArrayOutputWithContext(ctx context.Context) GetAuthorizationsClaimsFilterArrayOutput {
	return o
}

func (o GetAuthorizationsClaimsFilterArrayOutput) Index(i pulumi.IntInput) GetAuthorizationsClaimsFilterOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) GetAuthorizationsClaimsFilter {
		return vs[0].([]GetAuthorizationsClaimsFilter)[vs[1].(int)]
	}).(GetAuthorizationsClaimsFilterOutput)
}

type GetAuthorizationsConfiguration struct {
	AccessTokenExpirationMinutes  int      `pulumi:"accessTokenExpirationMinutes"`
	Audiences                     []string `pulumi:"audiences"`
	RefreshTokenExpirationMinutes int      `pulumi:"refreshTokenExpirationMinutes"`
	ResourceIdentifier            string   `pulumi:"resourceIdentifier"`
}

// GetAuthorizationsConfigurationInput is an input type that accepts GetAuthorizationsConfigurationArgs and GetAuthorizationsConfigurationOutput values.
// You can construct a concrete instance of `GetAuthorizationsConfigurationInput` via:
//
//	GetAuthorizationsConfigurationArgs{...}
type GetAuthorizationsConfigurationInput interface {
	pulumi.Input

	ToGetAuthorizationsConfigurationOutput() GetAuthorizationsConfigurationOutput
	ToGetAuthorizationsConfigurationOutputWithContext(context.Context) GetAuthorizationsConfigurationOutput
}

type GetAuthorizationsConfigurationArgs struct {
	AccessTokenExpirationMinutes  pulumi.IntInput         `pulumi:"accessTokenExpirationMinutes"`
	Audiences                     pulumi.StringArrayInput `pulumi:"audiences"`
	RefreshTokenExpirationMinutes pulumi.IntInput         `pulumi:"refreshTokenExpirationMinutes"`
	ResourceIdentifier            pulumi.StringInput      `pulumi:"resourceIdentifier"`
}

func (GetAuthorizationsConfigurationArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetAuthorizationsConfiguration)(nil)).Elem()
}

func (i GetAuthorizationsConfigurationArgs) ToGetAuthorizationsConfigurationOutput() GetAuthorizationsConfigurationOutput {
	return i.ToGetAuthorizationsConfigurationOutputWithContext(context.Background())
}

func (i GetAuthorizationsConfigurationArgs) ToGetAuthorizationsConfigurationOutputWithContext(ctx context.Context) GetAuthorizationsConfigurationOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GetAuthorizationsConfigurationOutput)
}

func (i GetAuthorizationsConfigurationArgs) ToGetAuthorizationsConfigurationPtrOutput() GetAuthorizationsConfigurationPtrOutput {
	return i.ToGetAuthorizationsConfigurationPtrOutputWithContext(context.Background())
}

func (i GetAuthorizationsConfigurationArgs) ToGetAuthorizationsConfigurationPtrOutputWithContext(ctx context.Context) GetAuthorizationsConfigurationPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GetAuthorizationsConfigurationOutput).ToGetAuthorizationsConfigurationPtrOutputWithContext(ctx)
}

// GetAuthorizationsConfigurationPtrInput is an input type that accepts GetAuthorizationsConfigurationArgs, GetAuthorizationsConfigurationPtr and GetAuthorizationsConfigurationPtrOutput values.
// You can construct a concrete instance of `GetAuthorizationsConfigurationPtrInput` via:
//
//	        GetAuthorizationsConfigurationArgs{...}
//
//	or:
//
//	        nil
type GetAuthorizationsConfigurationPtrInput interface {
	pulumi.Input

	ToGetAuthorizationsConfigurationPtrOutput() GetAuthorizationsConfigurationPtrOutput
	ToGetAuthorizationsConfigurationPtrOutputWithContext(context.Context) GetAuthorizationsConfigurationPtrOutput
}

type getAuthorizationsConfigurationPtrType GetAuthorizationsConfigurationArgs

func GetAuthorizationsConfigurationPtr(v *GetAuthorizationsConfigurationArgs) GetAuthorizationsConfigurationPtrInput {
	return (*getAuthorizationsConfigurationPtrType)(v)
}

func (*getAuthorizationsConfigurationPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**GetAuthorizationsConfiguration)(nil)).Elem()
}

func (i *getAuthorizationsConfigurationPtrType) ToGetAuthorizationsConfigurationPtrOutput() GetAuthorizationsConfigurationPtrOutput {
	return i.ToGetAuthorizationsConfigurationPtrOutputWithContext(context.Background())
}

func (i *getAuthorizationsConfigurationPtrType) ToGetAuthorizationsConfigurationPtrOutputWithContext(ctx context.Context) GetAuthorizationsConfigurationPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GetAuthorizationsConfigurationPtrOutput)
}

type GetAuthorizationsConfigurationOutput struct{ *pulumi.OutputState }

func (GetAuthorizationsConfigurationOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetAuthorizationsConfiguration)(nil)).Elem()
}

func (o GetAuthorizationsConfigurationOutput) ToGetAuthorizationsConfigurationOutput() GetAuthorizationsConfigurationOutput {
	return o
}

func (o GetAuthorizationsConfigurationOutput) ToGetAuthorizationsConfigurationOutputWithContext(ctx context.Context) GetAuthorizationsConfigurationOutput {
	return o
}

func (o GetAuthorizationsConfigurationOutput) ToGetAuthorizationsConfigurationPtrOutput() GetAuthorizationsConfigurationPtrOutput {
	return o.ToGetAuthorizationsConfigurationPtrOutputWithContext(context.Background())
}

func (o GetAuthorizationsConfigurationOutput) ToGetAuthorizationsConfigurationPtrOutputWithContext(ctx context.Context) GetAuthorizationsConfigurationPtrOutput {
	return o.ApplyTWithContext(ctx, func(_ context.Context, v GetAuthorizationsConfiguration) *GetAuthorizationsConfiguration {
		return &v
	}).(GetAuthorizationsConfigurationPtrOutput)
}

func (o GetAuthorizationsConfigurationOutput) AccessTokenExpirationMinutes() pulumi.IntOutput {
	return o.ApplyT(func(v GetAuthorizationsConfiguration) int { return v.AccessTokenExpirationMinutes }).(pulumi.IntOutput)
}

func (o GetAuthorizationsConfigurationOutput) Audiences() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetAuthorizationsConfiguration) []string { return v.Audiences }).(pulumi.StringArrayOutput)
}

func (o GetAuthorizationsConfigurationOutput) RefreshTokenExpirationMinutes() pulumi.IntOutput {
	return o.ApplyT(func(v GetAuthorizationsConfiguration) int { return v.RefreshTokenExpirationMinutes }).(pulumi.IntOutput)
}

func (o GetAuthorizationsConfigurationOutput) ResourceIdentifier() pulumi.StringOutput {
	return o.ApplyT(func(v GetAuthorizationsConfiguration) string { return v.ResourceIdentifier }).(pulumi.StringOutput)
}

type GetAuthorizationsConfigurationPtrOutput struct{ *pulumi.OutputState }

func (GetAuthorizationsConfigurationPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**GetAuthorizationsConfiguration)(nil)).Elem()
}

func (o GetAuthorizationsConfigurationPtrOutput) ToGetAuthorizationsConfigurationPtrOutput() GetAuthorizationsConfigurationPtrOutput {
	return o
}

func (o GetAuthorizationsConfigurationPtrOutput) ToGetAuthorizationsConfigurationPtrOutputWithContext(ctx context.Context) GetAuthorizationsConfigurationPtrOutput {
	return o
}

func (o GetAuthorizationsConfigurationPtrOutput) Elem() GetAuthorizationsConfigurationOutput {
	return o.ApplyT(func(v *GetAuthorizationsConfiguration) GetAuthorizationsConfiguration {
		if v != nil {
			return *v
		}
		var ret GetAuthorizationsConfiguration
		return ret
	}).(GetAuthorizationsConfigurationOutput)
}

func (o GetAuthorizationsConfigurationPtrOutput) AccessTokenExpirationMinutes() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *GetAuthorizationsConfiguration) *int {
		if v == nil {
			return nil
		}
		return &v.AccessTokenExpirationMinutes
	}).(pulumi.IntPtrOutput)
}

func (o GetAuthorizationsConfigurationPtrOutput) Audiences() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *GetAuthorizationsConfiguration) []string {
		if v == nil {
			return nil
		}
		return v.Audiences
	}).(pulumi.StringArrayOutput)
}

func (o GetAuthorizationsConfigurationPtrOutput) RefreshTokenExpirationMinutes() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *GetAuthorizationsConfiguration) *int {
		if v == nil {
			return nil
		}
		return &v.RefreshTokenExpirationMinutes
	}).(pulumi.IntPtrOutput)
}

func (o GetAuthorizationsConfigurationPtrOutput) ResourceIdentifier() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *GetAuthorizationsConfiguration) *string {
		if v == nil {
			return nil
		}
		return &v.ResourceIdentifier
	}).(pulumi.StringPtrOutput)
}

type GetAuthorizationsFilter struct {
	Name   string   `pulumi:"name"`
	Values []string `pulumi:"values"`
}

// GetAuthorizationsFilterInput is an input type that accepts GetAuthorizationsFilterArgs and GetAuthorizationsFilterOutput values.
// You can construct a concrete instance of `GetAuthorizationsFilterInput` via:
//
//	GetAuthorizationsFilterArgs{...}
type GetAuthorizationsFilterInput interface {
	pulumi.Input

	ToGetAuthorizationsFilterOutput() GetAuthorizationsFilterOutput
	ToGetAuthorizationsFilterOutputWithContext(context.Context) GetAuthorizationsFilterOutput
}

type GetAuthorizationsFilterArgs struct {
	Name   pulumi.StringInput      `pulumi:"name"`
	Values pulumi.StringArrayInput `pulumi:"values"`
}

func (GetAuthorizationsFilterArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetAuthorizationsFilter)(nil)).Elem()
}

func (i GetAuthorizationsFilterArgs) ToGetAuthorizationsFilterOutput() GetAuthorizationsFilterOutput {
	return i.ToGetAuthorizationsFilterOutputWithContext(context.Background())
}

func (i GetAuthorizationsFilterArgs) ToGetAuthorizationsFilterOutputWithContext(ctx context.Context) GetAuthorizationsFilterOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GetAuthorizationsFilterOutput)
}

// GetAuthorizationsFilterArrayInput is an input type that accepts GetAuthorizationsFilterArray and GetAuthorizationsFilterArrayOutput values.
// You can construct a concrete instance of `GetAuthorizationsFilterArrayInput` via:
//
//	GetAuthorizationsFilterArray{ GetAuthorizationsFilterArgs{...} }
type GetAuthorizationsFilterArrayInput interface {
	pulumi.Input

	ToGetAuthorizationsFilterArrayOutput() GetAuthorizationsFilterArrayOutput
	ToGetAuthorizationsFilterArrayOutputWithContext(context.Context) GetAuthorizationsFilterArrayOutput
}

type GetAuthorizationsFilterArray []GetAuthorizationsFilterInput

func (GetAuthorizationsFilterArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]GetAuthorizationsFilter)(nil)).Elem()
}

func (i GetAuthorizationsFilterArray) ToGetAuthorizationsFilterArrayOutput() GetAuthorizationsFilterArrayOutput {
	return i.ToGetAuthorizationsFilterArrayOutputWithContext(context.Background())
}

func (i GetAuthorizationsFilterArray) ToGetAuthorizationsFilterArrayOutputWithContext(ctx context.Context) GetAuthorizationsFilterArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GetAuthorizationsFilterArrayOutput)
}

type GetAuthorizationsFilterOutput struct{ *pulumi.OutputState }

func (GetAuthorizationsFilterOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetAuthorizationsFilter)(nil)).Elem()
}

func (o GetAuthorizationsFilterOutput) ToGetAuthorizationsFilterOutput() GetAuthorizationsFilterOutput {
	return o
}

func (o GetAuthorizationsFilterOutput) ToGetAuthorizationsFilterOutputWithContext(ctx context.Context) GetAuthorizationsFilterOutput {
	return o
}

func (o GetAuthorizationsFilterOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v GetAuthorizationsFilter) string { return v.Name }).(pulumi.StringOutput)
}

func (o GetAuthorizationsFilterOutput) Values() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetAuthorizationsFilter) []string { return v.Values }).(pulumi.StringArrayOutput)
}

type GetAuthorizationsFilterArrayOutput struct{ *pulumi.OutputState }

func (GetAuthorizationsFilterArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]GetAuthorizationsFilter)(nil)).Elem()
}

func (o GetAuthorizationsFilterArrayOutput) ToGetAuthorizationsFilterArrayOutput() GetAuthorizationsFilterArrayOutput {
	return o
}

func (o GetAuthorizationsFilterArrayOutput) ToGetAuthorizationsFilterArrayOutputWithContext(ctx context.Context) GetAuthorizationsFilterArrayOutput {
	return o
}

func (o GetAuthorizationsFilterArrayOutput) Index(i pulumi.IntInput) GetAuthorizationsFilterOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) GetAuthorizationsFilter {
		return vs[0].([]GetAuthorizationsFilter)[vs[1].(int)]
	}).(GetAuthorizationsFilterOutput)
}

type GetAuthorizationsScopesConfiguration struct {
	AccessTokenExpirationMinutes  int      `pulumi:"accessTokenExpirationMinutes"`
	Audiences                     []string `pulumi:"audiences"`
	RefreshTokenExpirationMinutes int      `pulumi:"refreshTokenExpirationMinutes"`
	ResourceIdentifier            string   `pulumi:"resourceIdentifier"`
}

// GetAuthorizationsScopesConfigurationInput is an input type that accepts GetAuthorizationsScopesConfigurationArgs and GetAuthorizationsScopesConfigurationOutput values.
// You can construct a concrete instance of `GetAuthorizationsScopesConfigurationInput` via:
//
//	GetAuthorizationsScopesConfigurationArgs{...}
type GetAuthorizationsScopesConfigurationInput interface {
	pulumi.Input

	ToGetAuthorizationsScopesConfigurationOutput() GetAuthorizationsScopesConfigurationOutput
	ToGetAuthorizationsScopesConfigurationOutputWithContext(context.Context) GetAuthorizationsScopesConfigurationOutput
}

type GetAuthorizationsScopesConfigurationArgs struct {
	AccessTokenExpirationMinutes  pulumi.IntInput         `pulumi:"accessTokenExpirationMinutes"`
	Audiences                     pulumi.StringArrayInput `pulumi:"audiences"`
	RefreshTokenExpirationMinutes pulumi.IntInput         `pulumi:"refreshTokenExpirationMinutes"`
	ResourceIdentifier            pulumi.StringInput      `pulumi:"resourceIdentifier"`
}

func (GetAuthorizationsScopesConfigurationArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetAuthorizationsScopesConfiguration)(nil)).Elem()
}

func (i GetAuthorizationsScopesConfigurationArgs) ToGetAuthorizationsScopesConfigurationOutput() GetAuthorizationsScopesConfigurationOutput {
	return i.ToGetAuthorizationsScopesConfigurationOutputWithContext(context.Background())
}

func (i GetAuthorizationsScopesConfigurationArgs) ToGetAuthorizationsScopesConfigurationOutputWithContext(ctx context.Context) GetAuthorizationsScopesConfigurationOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GetAuthorizationsScopesConfigurationOutput)
}

func (i GetAuthorizationsScopesConfigurationArgs) ToGetAuthorizationsScopesConfigurationPtrOutput() GetAuthorizationsScopesConfigurationPtrOutput {
	return i.ToGetAuthorizationsScopesConfigurationPtrOutputWithContext(context.Background())
}

func (i GetAuthorizationsScopesConfigurationArgs) ToGetAuthorizationsScopesConfigurationPtrOutputWithContext(ctx context.Context) GetAuthorizationsScopesConfigurationPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GetAuthorizationsScopesConfigurationOutput).ToGetAuthorizationsScopesConfigurationPtrOutputWithContext(ctx)
}

// GetAuthorizationsScopesConfigurationPtrInput is an input type that accepts GetAuthorizationsScopesConfigurationArgs, GetAuthorizationsScopesConfigurationPtr and GetAuthorizationsScopesConfigurationPtrOutput values.
// You can construct a concrete instance of `GetAuthorizationsScopesConfigurationPtrInput` via:
//
//	        GetAuthorizationsScopesConfigurationArgs{...}
//
//	or:
//
//	        nil
type GetAuthorizationsScopesConfigurationPtrInput interface {
	pulumi.Input

	ToGetAuthorizationsScopesConfigurationPtrOutput() GetAuthorizationsScopesConfigurationPtrOutput
	ToGetAuthorizationsScopesConfigurationPtrOutputWithContext(context.Context) GetAuthorizationsScopesConfigurationPtrOutput
}

type getAuthorizationsScopesConfigurationPtrType GetAuthorizationsScopesConfigurationArgs

func GetAuthorizationsScopesConfigurationPtr(v *GetAuthorizationsScopesConfigurationArgs) GetAuthorizationsScopesConfigurationPtrInput {
	return (*getAuthorizationsScopesConfigurationPtrType)(v)
}

func (*getAuthorizationsScopesConfigurationPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**GetAuthorizationsScopesConfiguration)(nil)).Elem()
}

func (i *getAuthorizationsScopesConfigurationPtrType) ToGetAuthorizationsScopesConfigurationPtrOutput() GetAuthorizationsScopesConfigurationPtrOutput {
	return i.ToGetAuthorizationsScopesConfigurationPtrOutputWithContext(context.Background())
}

func (i *getAuthorizationsScopesConfigurationPtrType) ToGetAuthorizationsScopesConfigurationPtrOutputWithContext(ctx context.Context) GetAuthorizationsScopesConfigurationPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GetAuthorizationsScopesConfigurationPtrOutput)
}

type GetAuthorizationsScopesConfigurationOutput struct{ *pulumi.OutputState }

func (GetAuthorizationsScopesConfigurationOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetAuthorizationsScopesConfiguration)(nil)).Elem()
}

func (o GetAuthorizationsScopesConfigurationOutput) ToGetAuthorizationsScopesConfigurationOutput() GetAuthorizationsScopesConfigurationOutput {
	return o
}

func (o GetAuthorizationsScopesConfigurationOutput) ToGetAuthorizationsScopesConfigurationOutputWithContext(ctx context.Context) GetAuthorizationsScopesConfigurationOutput {
	return o
}

func (o GetAuthorizationsScopesConfigurationOutput) ToGetAuthorizationsScopesConfigurationPtrOutput() GetAuthorizationsScopesConfigurationPtrOutput {
	return o.ToGetAuthorizationsScopesConfigurationPtrOutputWithContext(context.Background())
}

func (o GetAuthorizationsScopesConfigurationOutput) ToGetAuthorizationsScopesConfigurationPtrOutputWithContext(ctx context.Context) GetAuthorizationsScopesConfigurationPtrOutput {
	return o.ApplyTWithContext(ctx, func(_ context.Context, v GetAuthorizationsScopesConfiguration) *GetAuthorizationsScopesConfiguration {
		return &v
	}).(GetAuthorizationsScopesConfigurationPtrOutput)
}

func (o GetAuthorizationsScopesConfigurationOutput) AccessTokenExpirationMinutes() pulumi.IntOutput {
	return o.ApplyT(func(v GetAuthorizationsScopesConfiguration) int { return v.AccessTokenExpirationMinutes }).(pulumi.IntOutput)
}

func (o GetAuthorizationsScopesConfigurationOutput) Audiences() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetAuthorizationsScopesConfiguration) []string { return v.Audiences }).(pulumi.StringArrayOutput)
}

func (o GetAuthorizationsScopesConfigurationOutput) RefreshTokenExpirationMinutes() pulumi.IntOutput {
	return o.ApplyT(func(v GetAuthorizationsScopesConfiguration) int { return v.RefreshTokenExpirationMinutes }).(pulumi.IntOutput)
}

func (o GetAuthorizationsScopesConfigurationOutput) ResourceIdentifier() pulumi.StringOutput {
	return o.ApplyT(func(v GetAuthorizationsScopesConfiguration) string { return v.ResourceIdentifier }).(pulumi.StringOutput)
}

type GetAuthorizationsScopesConfigurationPtrOutput struct{ *pulumi.OutputState }

func (GetAuthorizationsScopesConfigurationPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**GetAuthorizationsScopesConfiguration)(nil)).Elem()
}

func (o GetAuthorizationsScopesConfigurationPtrOutput) ToGetAuthorizationsScopesConfigurationPtrOutput() GetAuthorizationsScopesConfigurationPtrOutput {
	return o
}

func (o GetAuthorizationsScopesConfigurationPtrOutput) ToGetAuthorizationsScopesConfigurationPtrOutputWithContext(ctx context.Context) GetAuthorizationsScopesConfigurationPtrOutput {
	return o
}

func (o GetAuthorizationsScopesConfigurationPtrOutput) Elem() GetAuthorizationsScopesConfigurationOutput {
	return o.ApplyT(func(v *GetAuthorizationsScopesConfiguration) GetAuthorizationsScopesConfiguration {
		if v != nil {
			return *v
		}
		var ret GetAuthorizationsScopesConfiguration
		return ret
	}).(GetAuthorizationsScopesConfigurationOutput)
}

func (o GetAuthorizationsScopesConfigurationPtrOutput) AccessTokenExpirationMinutes() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *GetAuthorizationsScopesConfiguration) *int {
		if v == nil {
			return nil
		}
		return &v.AccessTokenExpirationMinutes
	}).(pulumi.IntPtrOutput)
}

func (o GetAuthorizationsScopesConfigurationPtrOutput) Audiences() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *GetAuthorizationsScopesConfiguration) []string {
		if v == nil {
			return nil
		}
		return v.Audiences
	}).(pulumi.StringArrayOutput)
}

func (o GetAuthorizationsScopesConfigurationPtrOutput) RefreshTokenExpirationMinutes() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *GetAuthorizationsScopesConfiguration) *int {
		if v == nil {
			return nil
		}
		return &v.RefreshTokenExpirationMinutes
	}).(pulumi.IntPtrOutput)
}

func (o GetAuthorizationsScopesConfigurationPtrOutput) ResourceIdentifier() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *GetAuthorizationsScopesConfiguration) *string {
		if v == nil {
			return nil
		}
		return &v.ResourceIdentifier
	}).(pulumi.StringPtrOutput)
}

type GetAuthorizationsScopesFilter struct {
	Name   string   `pulumi:"name"`
	Values []string `pulumi:"values"`
}

// GetAuthorizationsScopesFilterInput is an input type that accepts GetAuthorizationsScopesFilterArgs and GetAuthorizationsScopesFilterOutput values.
// You can construct a concrete instance of `GetAuthorizationsScopesFilterInput` via:
//
//	GetAuthorizationsScopesFilterArgs{...}
type GetAuthorizationsScopesFilterInput interface {
	pulumi.Input

	ToGetAuthorizationsScopesFilterOutput() GetAuthorizationsScopesFilterOutput
	ToGetAuthorizationsScopesFilterOutputWithContext(context.Context) GetAuthorizationsScopesFilterOutput
}

type GetAuthorizationsScopesFilterArgs struct {
	Name   pulumi.StringInput      `pulumi:"name"`
	Values pulumi.StringArrayInput `pulumi:"values"`
}

func (GetAuthorizationsScopesFilterArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetAuthorizationsScopesFilter)(nil)).Elem()
}

func (i GetAuthorizationsScopesFilterArgs) ToGetAuthorizationsScopesFilterOutput() GetAuthorizationsScopesFilterOutput {
	return i.ToGetAuthorizationsScopesFilterOutputWithContext(context.Background())
}

func (i GetAuthorizationsScopesFilterArgs) ToGetAuthorizationsScopesFilterOutputWithContext(ctx context.Context) GetAuthorizationsScopesFilterOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GetAuthorizationsScopesFilterOutput)
}

// GetAuthorizationsScopesFilterArrayInput is an input type that accepts GetAuthorizationsScopesFilterArray and GetAuthorizationsScopesFilterArrayOutput values.
// You can construct a concrete instance of `GetAuthorizationsScopesFilterArrayInput` via:
//
//	GetAuthorizationsScopesFilterArray{ GetAuthorizationsScopesFilterArgs{...} }
type GetAuthorizationsScopesFilterArrayInput interface {
	pulumi.Input

	ToGetAuthorizationsScopesFilterArrayOutput() GetAuthorizationsScopesFilterArrayOutput
	ToGetAuthorizationsScopesFilterArrayOutputWithContext(context.Context) GetAuthorizationsScopesFilterArrayOutput
}

type GetAuthorizationsScopesFilterArray []GetAuthorizationsScopesFilterInput

func (GetAuthorizationsScopesFilterArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]GetAuthorizationsScopesFilter)(nil)).Elem()
}

func (i GetAuthorizationsScopesFilterArray) ToGetAuthorizationsScopesFilterArrayOutput() GetAuthorizationsScopesFilterArrayOutput {
	return i.ToGetAuthorizationsScopesFilterArrayOutputWithContext(context.Background())
}

func (i GetAuthorizationsScopesFilterArray) ToGetAuthorizationsScopesFilterArrayOutputWithContext(ctx context.Context) GetAuthorizationsScopesFilterArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GetAuthorizationsScopesFilterArrayOutput)
}

type GetAuthorizationsScopesFilterOutput struct{ *pulumi.OutputState }

func (GetAuthorizationsScopesFilterOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetAuthorizationsScopesFilter)(nil)).Elem()
}

func (o GetAuthorizationsScopesFilterOutput) ToGetAuthorizationsScopesFilterOutput() GetAuthorizationsScopesFilterOutput {
	return o
}

func (o GetAuthorizationsScopesFilterOutput) ToGetAuthorizationsScopesFilterOutputWithContext(ctx context.Context) GetAuthorizationsScopesFilterOutput {
	return o
}

func (o GetAuthorizationsScopesFilterOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v GetAuthorizationsScopesFilter) string { return v.Name }).(pulumi.StringOutput)
}

func (o GetAuthorizationsScopesFilterOutput) Values() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetAuthorizationsScopesFilter) []string { return v.Values }).(pulumi.StringArrayOutput)
}

type GetAuthorizationsScopesFilterArrayOutput struct{ *pulumi.OutputState }

func (GetAuthorizationsScopesFilterArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]GetAuthorizationsScopesFilter)(nil)).Elem()
}

func (o GetAuthorizationsScopesFilterArrayOutput) ToGetAuthorizationsScopesFilterArrayOutput() GetAuthorizationsScopesFilterArrayOutput {
	return o
}

func (o GetAuthorizationsScopesFilterArrayOutput) ToGetAuthorizationsScopesFilterArrayOutputWithContext(ctx context.Context) GetAuthorizationsScopesFilterArrayOutput {
	return o
}

func (o GetAuthorizationsScopesFilterArrayOutput) Index(i pulumi.IntInput) GetAuthorizationsScopesFilterOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) GetAuthorizationsScopesFilter {
		return vs[0].([]GetAuthorizationsScopesFilter)[vs[1].(int)]
	}).(GetAuthorizationsScopesFilterOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*GetAuthorizationsClaimsFilterInput)(nil)).Elem(), GetAuthorizationsClaimsFilterArgs{})
	pulumi.RegisterInputType(reflect.TypeOf((*GetAuthorizationsClaimsFilterArrayInput)(nil)).Elem(), GetAuthorizationsClaimsFilterArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*GetAuthorizationsConfigurationInput)(nil)).Elem(), GetAuthorizationsConfigurationArgs{})
	pulumi.RegisterInputType(reflect.TypeOf((*GetAuthorizationsConfigurationPtrInput)(nil)).Elem(), GetAuthorizationsConfigurationArgs{})
	pulumi.RegisterInputType(reflect.TypeOf((*GetAuthorizationsFilterInput)(nil)).Elem(), GetAuthorizationsFilterArgs{})
	pulumi.RegisterInputType(reflect.TypeOf((*GetAuthorizationsFilterArrayInput)(nil)).Elem(), GetAuthorizationsFilterArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*GetAuthorizationsScopesConfigurationInput)(nil)).Elem(), GetAuthorizationsScopesConfigurationArgs{})
	pulumi.RegisterInputType(reflect.TypeOf((*GetAuthorizationsScopesConfigurationPtrInput)(nil)).Elem(), GetAuthorizationsScopesConfigurationArgs{})
	pulumi.RegisterInputType(reflect.TypeOf((*GetAuthorizationsScopesFilterInput)(nil)).Elem(), GetAuthorizationsScopesFilterArgs{})
	pulumi.RegisterInputType(reflect.TypeOf((*GetAuthorizationsScopesFilterArrayInput)(nil)).Elem(), GetAuthorizationsScopesFilterArray{})
	pulumi.RegisterOutputType(GetAuthorizationsClaimsFilterOutput{})
	pulumi.RegisterOutputType(GetAuthorizationsClaimsFilterArrayOutput{})
	pulumi.RegisterOutputType(GetAuthorizationsConfigurationOutput{})
	pulumi.RegisterOutputType(GetAuthorizationsConfigurationPtrOutput{})
	pulumi.RegisterOutputType(GetAuthorizationsFilterOutput{})
	pulumi.RegisterOutputType(GetAuthorizationsFilterArrayOutput{})
	pulumi.RegisterOutputType(GetAuthorizationsScopesConfigurationOutput{})
	pulumi.RegisterOutputType(GetAuthorizationsScopesConfigurationPtrOutput{})
	pulumi.RegisterOutputType(GetAuthorizationsScopesFilterOutput{})
	pulumi.RegisterOutputType(GetAuthorizationsScopesFilterArrayOutput{})
}