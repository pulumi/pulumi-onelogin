// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package apps

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-onelogin/sdk/go/onelogin/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

type Rules struct {
	pulumi.CustomResourceState

	Actions RulesActionArrayOutput `pulumi:"actions"`
	AppsId  pulumi.StringOutput    `pulumi:"appsId"`
	// An array of conditions that the user must meet in order for the rule to be applied.
	Conditions RulesConditionArrayOutput `pulumi:"conditions"`
	// Indicates if the rule is enabled or not.
	Enabled pulumi.BoolPtrOutput `pulumi:"enabled"`
	// Indicates how conditions should be matched.
	Match pulumi.StringPtrOutput `pulumi:"match"`
	// Rule Name
	Name pulumi.StringOutput `pulumi:"name"`
	// Indicates the order of the rule. When `null` this will default to last position.
	Position pulumi.IntPtrOutput `pulumi:"position"`
}

// NewRules registers a new resource with the given unique name, arguments, and options.
func NewRules(ctx *pulumi.Context,
	name string, args *RulesArgs, opts ...pulumi.ResourceOption) (*Rules, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AppsId == nil {
		return nil, errors.New("invalid value for required argument 'AppsId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Rules
	err := ctx.RegisterResource("onelogin:apps/rules:Rules", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetRules gets an existing Rules resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetRules(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *RulesState, opts ...pulumi.ResourceOption) (*Rules, error) {
	var resource Rules
	err := ctx.ReadResource("onelogin:apps/rules:Rules", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Rules resources.
type rulesState struct {
	Actions []RulesAction `pulumi:"actions"`
	AppsId  *string       `pulumi:"appsId"`
	// An array of conditions that the user must meet in order for the rule to be applied.
	Conditions []RulesCondition `pulumi:"conditions"`
	// Indicates if the rule is enabled or not.
	Enabled *bool `pulumi:"enabled"`
	// Indicates how conditions should be matched.
	Match *string `pulumi:"match"`
	// Rule Name
	Name *string `pulumi:"name"`
	// Indicates the order of the rule. When `null` this will default to last position.
	Position *int `pulumi:"position"`
}

type RulesState struct {
	Actions RulesActionArrayInput
	AppsId  pulumi.StringPtrInput
	// An array of conditions that the user must meet in order for the rule to be applied.
	Conditions RulesConditionArrayInput
	// Indicates if the rule is enabled or not.
	Enabled pulumi.BoolPtrInput
	// Indicates how conditions should be matched.
	Match pulumi.StringPtrInput
	// Rule Name
	Name pulumi.StringPtrInput
	// Indicates the order of the rule. When `null` this will default to last position.
	Position pulumi.IntPtrInput
}

func (RulesState) ElementType() reflect.Type {
	return reflect.TypeOf((*rulesState)(nil)).Elem()
}

type rulesArgs struct {
	Actions []RulesAction `pulumi:"actions"`
	AppsId  string        `pulumi:"appsId"`
	// An array of conditions that the user must meet in order for the rule to be applied.
	Conditions []RulesCondition `pulumi:"conditions"`
	// Indicates if the rule is enabled or not.
	Enabled *bool `pulumi:"enabled"`
	// Indicates how conditions should be matched.
	Match *string `pulumi:"match"`
	// Rule Name
	Name *string `pulumi:"name"`
	// Indicates the order of the rule. When `null` this will default to last position.
	Position *int `pulumi:"position"`
}

// The set of arguments for constructing a Rules resource.
type RulesArgs struct {
	Actions RulesActionArrayInput
	AppsId  pulumi.StringInput
	// An array of conditions that the user must meet in order for the rule to be applied.
	Conditions RulesConditionArrayInput
	// Indicates if the rule is enabled or not.
	Enabled pulumi.BoolPtrInput
	// Indicates how conditions should be matched.
	Match pulumi.StringPtrInput
	// Rule Name
	Name pulumi.StringPtrInput
	// Indicates the order of the rule. When `null` this will default to last position.
	Position pulumi.IntPtrInput
}

func (RulesArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*rulesArgs)(nil)).Elem()
}

type RulesInput interface {
	pulumi.Input

	ToRulesOutput() RulesOutput
	ToRulesOutputWithContext(ctx context.Context) RulesOutput
}

func (*Rules) ElementType() reflect.Type {
	return reflect.TypeOf((**Rules)(nil)).Elem()
}

func (i *Rules) ToRulesOutput() RulesOutput {
	return i.ToRulesOutputWithContext(context.Background())
}

func (i *Rules) ToRulesOutputWithContext(ctx context.Context) RulesOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RulesOutput)
}

// RulesArrayInput is an input type that accepts RulesArray and RulesArrayOutput values.
// You can construct a concrete instance of `RulesArrayInput` via:
//
//	RulesArray{ RulesArgs{...} }
type RulesArrayInput interface {
	pulumi.Input

	ToRulesArrayOutput() RulesArrayOutput
	ToRulesArrayOutputWithContext(context.Context) RulesArrayOutput
}

type RulesArray []RulesInput

func (RulesArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Rules)(nil)).Elem()
}

func (i RulesArray) ToRulesArrayOutput() RulesArrayOutput {
	return i.ToRulesArrayOutputWithContext(context.Background())
}

func (i RulesArray) ToRulesArrayOutputWithContext(ctx context.Context) RulesArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RulesArrayOutput)
}

// RulesMapInput is an input type that accepts RulesMap and RulesMapOutput values.
// You can construct a concrete instance of `RulesMapInput` via:
//
//	RulesMap{ "key": RulesArgs{...} }
type RulesMapInput interface {
	pulumi.Input

	ToRulesMapOutput() RulesMapOutput
	ToRulesMapOutputWithContext(context.Context) RulesMapOutput
}

type RulesMap map[string]RulesInput

func (RulesMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Rules)(nil)).Elem()
}

func (i RulesMap) ToRulesMapOutput() RulesMapOutput {
	return i.ToRulesMapOutputWithContext(context.Background())
}

func (i RulesMap) ToRulesMapOutputWithContext(ctx context.Context) RulesMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RulesMapOutput)
}

type RulesOutput struct{ *pulumi.OutputState }

func (RulesOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Rules)(nil)).Elem()
}

func (o RulesOutput) ToRulesOutput() RulesOutput {
	return o
}

func (o RulesOutput) ToRulesOutputWithContext(ctx context.Context) RulesOutput {
	return o
}

func (o RulesOutput) Actions() RulesActionArrayOutput {
	return o.ApplyT(func(v *Rules) RulesActionArrayOutput { return v.Actions }).(RulesActionArrayOutput)
}

func (o RulesOutput) AppsId() pulumi.StringOutput {
	return o.ApplyT(func(v *Rules) pulumi.StringOutput { return v.AppsId }).(pulumi.StringOutput)
}

// An array of conditions that the user must meet in order for the rule to be applied.
func (o RulesOutput) Conditions() RulesConditionArrayOutput {
	return o.ApplyT(func(v *Rules) RulesConditionArrayOutput { return v.Conditions }).(RulesConditionArrayOutput)
}

// Indicates if the rule is enabled or not.
func (o RulesOutput) Enabled() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Rules) pulumi.BoolPtrOutput { return v.Enabled }).(pulumi.BoolPtrOutput)
}

// Indicates how conditions should be matched.
func (o RulesOutput) Match() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Rules) pulumi.StringPtrOutput { return v.Match }).(pulumi.StringPtrOutput)
}

// Rule Name
func (o RulesOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Rules) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Indicates the order of the rule. When `null` this will default to last position.
func (o RulesOutput) Position() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *Rules) pulumi.IntPtrOutput { return v.Position }).(pulumi.IntPtrOutput)
}

type RulesArrayOutput struct{ *pulumi.OutputState }

func (RulesArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Rules)(nil)).Elem()
}

func (o RulesArrayOutput) ToRulesArrayOutput() RulesArrayOutput {
	return o
}

func (o RulesArrayOutput) ToRulesArrayOutputWithContext(ctx context.Context) RulesArrayOutput {
	return o
}

func (o RulesArrayOutput) Index(i pulumi.IntInput) RulesOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Rules {
		return vs[0].([]*Rules)[vs[1].(int)]
	}).(RulesOutput)
}

type RulesMapOutput struct{ *pulumi.OutputState }

func (RulesMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Rules)(nil)).Elem()
}

func (o RulesMapOutput) ToRulesMapOutput() RulesMapOutput {
	return o
}

func (o RulesMapOutput) ToRulesMapOutputWithContext(ctx context.Context) RulesMapOutput {
	return o
}

func (o RulesMapOutput) MapIndex(k pulumi.StringInput) RulesOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Rules {
		return vs[0].(map[string]*Rules)[vs[1].(string)]
	}).(RulesOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*RulesInput)(nil)).Elem(), &Rules{})
	pulumi.RegisterInputType(reflect.TypeOf((*RulesArrayInput)(nil)).Elem(), RulesArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*RulesMapInput)(nil)).Elem(), RulesMap{})
	pulumi.RegisterOutputType(RulesOutput{})
	pulumi.RegisterOutputType(RulesArrayOutput{})
	pulumi.RegisterOutputType(RulesMapOutput{})
}
