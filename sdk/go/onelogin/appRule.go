// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package onelogin

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manage App Rule resources.
//
// This resource allows you to create and configure App Rules.
//
// ## Example Usage
// ### Strict Ordering
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-onelogin/sdk/go/onelogin"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := onelogin.NewAppRule(ctx, "check", &onelogin.AppRuleArgs{
// 			AppId:    pulumi.Any(onelogin_saml_apps.My_saml_app.Id),
// 			Position: pulumi.Int(1),
// 			Enabled:  pulumi.Bool(true),
// 			Match:    pulumi.String("all"),
// 			Conditions: AppRuleConditionArray{
// 				Operator: "ri",
// 				Source:   "has_role",
// 				Value:    "340475",
// 			},
// 			Actions: AppRuleActionArray{
// 				Action:     "set_amazonusername",
// 				Expression: ".*",
// 				Values: AppRuleActionArgs{
// 					"member_of",
// 				},
// 			},
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
// ### Dependency Based Ordering
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-onelogin/sdk/go/onelogin"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		test, err := onelogin.NewAppRule(ctx, "test", &onelogin.AppRuleArgs{
// 			AppId:   pulumi.Any(onelogin_saml_apps.My_saml_app.Id),
// 			Enabled: pulumi.Bool(true),
// 			Match:   pulumi.String("all"),
// 			Conditions: AppRuleConditionArray{
// 				Operator: "ri",
// 				Source:   "has_role",
// 				Value:    "340475",
// 			},
// 			Actions: AppRuleActionArray{
// 				Action:     "set_amazonusername",
// 				Expression: ".*",
// 				Values: AppRuleActionArgs{
// 					"member_of",
// 				},
// 			},
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = onelogin.NewAppRule(ctx, "check", &onelogin.AppRuleArgs{
// 			AppId:   pulumi.Any(onelogin_saml_apps.My_saml_app.Id),
// 			Enabled: pulumi.Bool(true),
// 			Match:   pulumi.String("all"),
// 			Conditions: AppRuleConditionArray{
// 				Operator: "ri",
// 				Source:   "has_role",
// 				Value:    "340475",
// 			},
// 			Actions: AppRuleActionArray{
// 				Action:     "set_amazonusername",
// 				Expression: ".*",
// 				Values: AppRuleActionArgs{
// 					"member_of",
// 				},
// 			},
// 		}, pulumi.DependsOn([]pulumi.Resource{
// 			test,
// 		}))
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
// ## Important Note Regarding Position
//
// The position field indicates the order in which rules are applied. They behave like progressive filters and as such, their positioning is strictly enforced. Your options for this field are to either:
//
// * Accept any ordering - Do not fill out any position field and each rule will be inserted in the order received by the API.
//
// * Strict Ordering - Enter a position number for each app rule. You'll need to ensure there are no duplicates and no gaps in numbering.
//
// * Dependency based ordering - Use the `dependsOn` field to specify an app rule's predecessor to ensure rules are received by the API in the order in which they should be applied. e.g. `dependsOn = [onelogin_app_rules.test]`
//
// ## Import
//
// An App Rule cannot be imported at this time.
type AppRule struct {
	pulumi.CustomResourceState

	// An array of actions that will be applied to the users that are matched by the conditions.
	Actions AppRuleActionArrayOutput `pulumi:"actions"`
	// The id of the App resource to which the rule should belong.
	AppId pulumi.StringOutput `pulumi:"appId"`
	// An array of conditions that the user must meet in order for the rule to be applied.
	Conditions AppRuleConditionArrayOutput `pulumi:"conditions"`
	// Indicate if the rule should go into effect.
	Enabled pulumi.BoolPtrOutput `pulumi:"enabled"`
	// Indicates how conditions should be matched. Must be one of `all` or `any`.
	Match pulumi.StringOutput `pulumi:"match"`
	// The Rule's name
	Name pulumi.StringOutput `pulumi:"name"`
	// Indicates the ordering of the rule. When not supplied the rule will be put at the end of the list on create and managed by the provider. '0' can be supplied to consistently push this rule to the end of the list on every update.
	Position pulumi.IntOutput `pulumi:"position"`
}

// NewAppRule registers a new resource with the given unique name, arguments, and options.
func NewAppRule(ctx *pulumi.Context,
	name string, args *AppRuleArgs, opts ...pulumi.ResourceOption) (*AppRule, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AppId == nil {
		return nil, errors.New("invalid value for required argument 'AppId'")
	}
	if args.Match == nil {
		return nil, errors.New("invalid value for required argument 'Match'")
	}
	var resource AppRule
	err := ctx.RegisterResource("onelogin:index/appRule:AppRule", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetAppRule gets an existing AppRule resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAppRule(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AppRuleState, opts ...pulumi.ResourceOption) (*AppRule, error) {
	var resource AppRule
	err := ctx.ReadResource("onelogin:index/appRule:AppRule", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering AppRule resources.
type appRuleState struct {
	// An array of actions that will be applied to the users that are matched by the conditions.
	Actions []AppRuleAction `pulumi:"actions"`
	// The id of the App resource to which the rule should belong.
	AppId *string `pulumi:"appId"`
	// An array of conditions that the user must meet in order for the rule to be applied.
	Conditions []AppRuleCondition `pulumi:"conditions"`
	// Indicate if the rule should go into effect.
	Enabled *bool `pulumi:"enabled"`
	// Indicates how conditions should be matched. Must be one of `all` or `any`.
	Match *string `pulumi:"match"`
	// The Rule's name
	Name *string `pulumi:"name"`
	// Indicates the ordering of the rule. When not supplied the rule will be put at the end of the list on create and managed by the provider. '0' can be supplied to consistently push this rule to the end of the list on every update.
	Position *int `pulumi:"position"`
}

type AppRuleState struct {
	// An array of actions that will be applied to the users that are matched by the conditions.
	Actions AppRuleActionArrayInput
	// The id of the App resource to which the rule should belong.
	AppId pulumi.StringPtrInput
	// An array of conditions that the user must meet in order for the rule to be applied.
	Conditions AppRuleConditionArrayInput
	// Indicate if the rule should go into effect.
	Enabled pulumi.BoolPtrInput
	// Indicates how conditions should be matched. Must be one of `all` or `any`.
	Match pulumi.StringPtrInput
	// The Rule's name
	Name pulumi.StringPtrInput
	// Indicates the ordering of the rule. When not supplied the rule will be put at the end of the list on create and managed by the provider. '0' can be supplied to consistently push this rule to the end of the list on every update.
	Position pulumi.IntPtrInput
}

func (AppRuleState) ElementType() reflect.Type {
	return reflect.TypeOf((*appRuleState)(nil)).Elem()
}

type appRuleArgs struct {
	// An array of actions that will be applied to the users that are matched by the conditions.
	Actions []AppRuleAction `pulumi:"actions"`
	// The id of the App resource to which the rule should belong.
	AppId string `pulumi:"appId"`
	// An array of conditions that the user must meet in order for the rule to be applied.
	Conditions []AppRuleCondition `pulumi:"conditions"`
	// Indicate if the rule should go into effect.
	Enabled *bool `pulumi:"enabled"`
	// Indicates how conditions should be matched. Must be one of `all` or `any`.
	Match string `pulumi:"match"`
	// The Rule's name
	Name *string `pulumi:"name"`
	// Indicates the ordering of the rule. When not supplied the rule will be put at the end of the list on create and managed by the provider. '0' can be supplied to consistently push this rule to the end of the list on every update.
	Position *int `pulumi:"position"`
}

// The set of arguments for constructing a AppRule resource.
type AppRuleArgs struct {
	// An array of actions that will be applied to the users that are matched by the conditions.
	Actions AppRuleActionArrayInput
	// The id of the App resource to which the rule should belong.
	AppId pulumi.StringInput
	// An array of conditions that the user must meet in order for the rule to be applied.
	Conditions AppRuleConditionArrayInput
	// Indicate if the rule should go into effect.
	Enabled pulumi.BoolPtrInput
	// Indicates how conditions should be matched. Must be one of `all` or `any`.
	Match pulumi.StringInput
	// The Rule's name
	Name pulumi.StringPtrInput
	// Indicates the ordering of the rule. When not supplied the rule will be put at the end of the list on create and managed by the provider. '0' can be supplied to consistently push this rule to the end of the list on every update.
	Position pulumi.IntPtrInput
}

func (AppRuleArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*appRuleArgs)(nil)).Elem()
}

type AppRuleInput interface {
	pulumi.Input

	ToAppRuleOutput() AppRuleOutput
	ToAppRuleOutputWithContext(ctx context.Context) AppRuleOutput
}

func (*AppRule) ElementType() reflect.Type {
	return reflect.TypeOf((**AppRule)(nil)).Elem()
}

func (i *AppRule) ToAppRuleOutput() AppRuleOutput {
	return i.ToAppRuleOutputWithContext(context.Background())
}

func (i *AppRule) ToAppRuleOutputWithContext(ctx context.Context) AppRuleOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AppRuleOutput)
}

// AppRuleArrayInput is an input type that accepts AppRuleArray and AppRuleArrayOutput values.
// You can construct a concrete instance of `AppRuleArrayInput` via:
//
//          AppRuleArray{ AppRuleArgs{...} }
type AppRuleArrayInput interface {
	pulumi.Input

	ToAppRuleArrayOutput() AppRuleArrayOutput
	ToAppRuleArrayOutputWithContext(context.Context) AppRuleArrayOutput
}

type AppRuleArray []AppRuleInput

func (AppRuleArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AppRule)(nil)).Elem()
}

func (i AppRuleArray) ToAppRuleArrayOutput() AppRuleArrayOutput {
	return i.ToAppRuleArrayOutputWithContext(context.Background())
}

func (i AppRuleArray) ToAppRuleArrayOutputWithContext(ctx context.Context) AppRuleArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AppRuleArrayOutput)
}

// AppRuleMapInput is an input type that accepts AppRuleMap and AppRuleMapOutput values.
// You can construct a concrete instance of `AppRuleMapInput` via:
//
//          AppRuleMap{ "key": AppRuleArgs{...} }
type AppRuleMapInput interface {
	pulumi.Input

	ToAppRuleMapOutput() AppRuleMapOutput
	ToAppRuleMapOutputWithContext(context.Context) AppRuleMapOutput
}

type AppRuleMap map[string]AppRuleInput

func (AppRuleMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AppRule)(nil)).Elem()
}

func (i AppRuleMap) ToAppRuleMapOutput() AppRuleMapOutput {
	return i.ToAppRuleMapOutputWithContext(context.Background())
}

func (i AppRuleMap) ToAppRuleMapOutputWithContext(ctx context.Context) AppRuleMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AppRuleMapOutput)
}

type AppRuleOutput struct{ *pulumi.OutputState }

func (AppRuleOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**AppRule)(nil)).Elem()
}

func (o AppRuleOutput) ToAppRuleOutput() AppRuleOutput {
	return o
}

func (o AppRuleOutput) ToAppRuleOutputWithContext(ctx context.Context) AppRuleOutput {
	return o
}

type AppRuleArrayOutput struct{ *pulumi.OutputState }

func (AppRuleArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AppRule)(nil)).Elem()
}

func (o AppRuleArrayOutput) ToAppRuleArrayOutput() AppRuleArrayOutput {
	return o
}

func (o AppRuleArrayOutput) ToAppRuleArrayOutputWithContext(ctx context.Context) AppRuleArrayOutput {
	return o
}

func (o AppRuleArrayOutput) Index(i pulumi.IntInput) AppRuleOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *AppRule {
		return vs[0].([]*AppRule)[vs[1].(int)]
	}).(AppRuleOutput)
}

type AppRuleMapOutput struct{ *pulumi.OutputState }

func (AppRuleMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AppRule)(nil)).Elem()
}

func (o AppRuleMapOutput) ToAppRuleMapOutput() AppRuleMapOutput {
	return o
}

func (o AppRuleMapOutput) ToAppRuleMapOutputWithContext(ctx context.Context) AppRuleMapOutput {
	return o
}

func (o AppRuleMapOutput) MapIndex(k pulumi.StringInput) AppRuleOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *AppRule {
		return vs[0].(map[string]*AppRule)[vs[1].(string)]
	}).(AppRuleOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*AppRuleInput)(nil)).Elem(), &AppRule{})
	pulumi.RegisterInputType(reflect.TypeOf((*AppRuleArrayInput)(nil)).Elem(), AppRuleArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*AppRuleMapInput)(nil)).Elem(), AppRuleMap{})
	pulumi.RegisterOutputType(AppRuleOutput{})
	pulumi.RegisterOutputType(AppRuleArrayOutput{})
	pulumi.RegisterOutputType(AppRuleMapOutput{})
}
