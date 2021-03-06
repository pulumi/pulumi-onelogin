// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package onelogin

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manage User Mappings resources.
//
// This resource allows you to create and configure User Mappings.
//
// ## Example Usage
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
// 		_, err := onelogin.NewUserMapping(ctx, "example", &onelogin.UserMappingArgs{
// 			Actions: UserMappingActionArray{
// 				&UserMappingActionArgs{
// 					Action: pulumi.String("set_status"),
// 					Values: pulumi.StringArray{
// 						pulumi.String("1"),
// 					},
// 				},
// 			},
// 			Conditions: UserMappingConditionArray{
// 				&UserMappingConditionArgs{
// 					Operator: pulumi.String(">"),
// 					Source:   pulumi.String("last_login"),
// 					Value:    pulumi.String("90"),
// 				},
// 			},
// 			Enabled:  pulumi.Bool(true),
// 			Match:    pulumi.String("all"),
// 			Position: pulumi.Int(1),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
//
// ## Import
//
// A User Mapping can be imported via the OneLogin User Mapping.
//
// ```sh
//  $ pulumi import onelogin:index/userMapping:UserMapping example <user_mapping_id>
// ```
type UserMapping struct {
	pulumi.CustomResourceState

	// The number of minutes until the token expires
	Actions UserMappingActionArrayOutput `pulumi:"actions"`
	// An array of conditions that the user must meet in order for the mapping to be applied.
	Conditions UserMappingConditionArrayOutput `pulumi:"conditions"`
	// Indicates if a mapping is enabled.
	Enabled pulumi.BoolPtrOutput `pulumi:"enabled"`
	// Indicates how conditions should be matched. Must be one of `all` or `any`.
	Match pulumi.StringOutput `pulumi:"match"`
	// The resource's name.
	Name pulumi.StringOutput `pulumi:"name"`
	// Indicates the ordering of the mapping. When not supplied the mapping will be put at the end of the list on create and managed by the provider. '0' can be supplied to consistently push this mapping to the end of the list on every update.
	Position pulumi.IntOutput `pulumi:"position"`
}

// NewUserMapping registers a new resource with the given unique name, arguments, and options.
func NewUserMapping(ctx *pulumi.Context,
	name string, args *UserMappingArgs, opts ...pulumi.ResourceOption) (*UserMapping, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Match == nil {
		return nil, errors.New("invalid value for required argument 'Match'")
	}
	var resource UserMapping
	err := ctx.RegisterResource("onelogin:index/userMapping:UserMapping", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetUserMapping gets an existing UserMapping resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetUserMapping(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *UserMappingState, opts ...pulumi.ResourceOption) (*UserMapping, error) {
	var resource UserMapping
	err := ctx.ReadResource("onelogin:index/userMapping:UserMapping", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering UserMapping resources.
type userMappingState struct {
	// The number of minutes until the token expires
	Actions []UserMappingAction `pulumi:"actions"`
	// An array of conditions that the user must meet in order for the mapping to be applied.
	Conditions []UserMappingCondition `pulumi:"conditions"`
	// Indicates if a mapping is enabled.
	Enabled *bool `pulumi:"enabled"`
	// Indicates how conditions should be matched. Must be one of `all` or `any`.
	Match *string `pulumi:"match"`
	// The resource's name.
	Name *string `pulumi:"name"`
	// Indicates the ordering of the mapping. When not supplied the mapping will be put at the end of the list on create and managed by the provider. '0' can be supplied to consistently push this mapping to the end of the list on every update.
	Position *int `pulumi:"position"`
}

type UserMappingState struct {
	// The number of minutes until the token expires
	Actions UserMappingActionArrayInput
	// An array of conditions that the user must meet in order for the mapping to be applied.
	Conditions UserMappingConditionArrayInput
	// Indicates if a mapping is enabled.
	Enabled pulumi.BoolPtrInput
	// Indicates how conditions should be matched. Must be one of `all` or `any`.
	Match pulumi.StringPtrInput
	// The resource's name.
	Name pulumi.StringPtrInput
	// Indicates the ordering of the mapping. When not supplied the mapping will be put at the end of the list on create and managed by the provider. '0' can be supplied to consistently push this mapping to the end of the list on every update.
	Position pulumi.IntPtrInput
}

func (UserMappingState) ElementType() reflect.Type {
	return reflect.TypeOf((*userMappingState)(nil)).Elem()
}

type userMappingArgs struct {
	// The number of minutes until the token expires
	Actions []UserMappingAction `pulumi:"actions"`
	// An array of conditions that the user must meet in order for the mapping to be applied.
	Conditions []UserMappingCondition `pulumi:"conditions"`
	// Indicates if a mapping is enabled.
	Enabled *bool `pulumi:"enabled"`
	// Indicates how conditions should be matched. Must be one of `all` or `any`.
	Match string `pulumi:"match"`
	// The resource's name.
	Name *string `pulumi:"name"`
	// Indicates the ordering of the mapping. When not supplied the mapping will be put at the end of the list on create and managed by the provider. '0' can be supplied to consistently push this mapping to the end of the list on every update.
	Position *int `pulumi:"position"`
}

// The set of arguments for constructing a UserMapping resource.
type UserMappingArgs struct {
	// The number of minutes until the token expires
	Actions UserMappingActionArrayInput
	// An array of conditions that the user must meet in order for the mapping to be applied.
	Conditions UserMappingConditionArrayInput
	// Indicates if a mapping is enabled.
	Enabled pulumi.BoolPtrInput
	// Indicates how conditions should be matched. Must be one of `all` or `any`.
	Match pulumi.StringInput
	// The resource's name.
	Name pulumi.StringPtrInput
	// Indicates the ordering of the mapping. When not supplied the mapping will be put at the end of the list on create and managed by the provider. '0' can be supplied to consistently push this mapping to the end of the list on every update.
	Position pulumi.IntPtrInput
}

func (UserMappingArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*userMappingArgs)(nil)).Elem()
}

type UserMappingInput interface {
	pulumi.Input

	ToUserMappingOutput() UserMappingOutput
	ToUserMappingOutputWithContext(ctx context.Context) UserMappingOutput
}

func (*UserMapping) ElementType() reflect.Type {
	return reflect.TypeOf((**UserMapping)(nil)).Elem()
}

func (i *UserMapping) ToUserMappingOutput() UserMappingOutput {
	return i.ToUserMappingOutputWithContext(context.Background())
}

func (i *UserMapping) ToUserMappingOutputWithContext(ctx context.Context) UserMappingOutput {
	return pulumi.ToOutputWithContext(ctx, i).(UserMappingOutput)
}

// UserMappingArrayInput is an input type that accepts UserMappingArray and UserMappingArrayOutput values.
// You can construct a concrete instance of `UserMappingArrayInput` via:
//
//          UserMappingArray{ UserMappingArgs{...} }
type UserMappingArrayInput interface {
	pulumi.Input

	ToUserMappingArrayOutput() UserMappingArrayOutput
	ToUserMappingArrayOutputWithContext(context.Context) UserMappingArrayOutput
}

type UserMappingArray []UserMappingInput

func (UserMappingArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*UserMapping)(nil)).Elem()
}

func (i UserMappingArray) ToUserMappingArrayOutput() UserMappingArrayOutput {
	return i.ToUserMappingArrayOutputWithContext(context.Background())
}

func (i UserMappingArray) ToUserMappingArrayOutputWithContext(ctx context.Context) UserMappingArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(UserMappingArrayOutput)
}

// UserMappingMapInput is an input type that accepts UserMappingMap and UserMappingMapOutput values.
// You can construct a concrete instance of `UserMappingMapInput` via:
//
//          UserMappingMap{ "key": UserMappingArgs{...} }
type UserMappingMapInput interface {
	pulumi.Input

	ToUserMappingMapOutput() UserMappingMapOutput
	ToUserMappingMapOutputWithContext(context.Context) UserMappingMapOutput
}

type UserMappingMap map[string]UserMappingInput

func (UserMappingMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*UserMapping)(nil)).Elem()
}

func (i UserMappingMap) ToUserMappingMapOutput() UserMappingMapOutput {
	return i.ToUserMappingMapOutputWithContext(context.Background())
}

func (i UserMappingMap) ToUserMappingMapOutputWithContext(ctx context.Context) UserMappingMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(UserMappingMapOutput)
}

type UserMappingOutput struct{ *pulumi.OutputState }

func (UserMappingOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**UserMapping)(nil)).Elem()
}

func (o UserMappingOutput) ToUserMappingOutput() UserMappingOutput {
	return o
}

func (o UserMappingOutput) ToUserMappingOutputWithContext(ctx context.Context) UserMappingOutput {
	return o
}

type UserMappingArrayOutput struct{ *pulumi.OutputState }

func (UserMappingArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*UserMapping)(nil)).Elem()
}

func (o UserMappingArrayOutput) ToUserMappingArrayOutput() UserMappingArrayOutput {
	return o
}

func (o UserMappingArrayOutput) ToUserMappingArrayOutputWithContext(ctx context.Context) UserMappingArrayOutput {
	return o
}

func (o UserMappingArrayOutput) Index(i pulumi.IntInput) UserMappingOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *UserMapping {
		return vs[0].([]*UserMapping)[vs[1].(int)]
	}).(UserMappingOutput)
}

type UserMappingMapOutput struct{ *pulumi.OutputState }

func (UserMappingMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*UserMapping)(nil)).Elem()
}

func (o UserMappingMapOutput) ToUserMappingMapOutput() UserMappingMapOutput {
	return o
}

func (o UserMappingMapOutput) ToUserMappingMapOutputWithContext(ctx context.Context) UserMappingMapOutput {
	return o
}

func (o UserMappingMapOutput) MapIndex(k pulumi.StringInput) UserMappingOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *UserMapping {
		return vs[0].(map[string]*UserMapping)[vs[1].(string)]
	}).(UserMappingOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*UserMappingInput)(nil)).Elem(), &UserMapping{})
	pulumi.RegisterInputType(reflect.TypeOf((*UserMappingArrayInput)(nil)).Elem(), UserMappingArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*UserMappingMapInput)(nil)).Elem(), UserMappingMap{})
	pulumi.RegisterOutputType(UserMappingOutput{})
	pulumi.RegisterOutputType(UserMappingArrayOutput{})
	pulumi.RegisterOutputType(UserMappingMapOutput{})
}
