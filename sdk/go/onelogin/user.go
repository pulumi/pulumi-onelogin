// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package onelogin

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manage User resources.
//
// This resource allows you to create and configure Users.
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
// 		_, err := onelogin.NewUser(ctx, "example", &onelogin.UserArgs{
// 			Email:    pulumi.String("timmy.tester@test.com"),
// 			Username: pulumi.String("timmy.tester"),
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
// A User can be imported via the OneLogin User ID.
//
// ```sh
//  $ pulumi import onelogin:index/user:User example 12345678
// ```
type User struct {
	pulumi.CustomResourceState

	// A comment about the user
	Comment pulumi.StringPtrOutput `pulumi:"comment"`
	// The user's company
	Company          pulumi.StringPtrOutput `pulumi:"company"`
	CustomAttributes pulumi.StringMapOutput `pulumi:"customAttributes"`
	// The user's department
	Department pulumi.StringPtrOutput `pulumi:"department"`
	// The user's directory_id
	DirectoryId pulumi.IntOutput `pulumi:"directoryId"`
	// The user's distinguished name
	DistinguishedName pulumi.StringPtrOutput `pulumi:"distinguishedName"`
	// The user's email.
	Email pulumi.StringOutput `pulumi:"email"`
	// The user's external_id
	ExternalId pulumi.IntOutput `pulumi:"externalId"`
	// The user's first name
	Firstname pulumi.StringPtrOutput `pulumi:"firstname"`
	// The user's group_id
	GroupId pulumi.IntOutput `pulumi:"groupId"`
	// The user's last name
	Lastname pulumi.StringPtrOutput `pulumi:"lastname"`
	// The user's manager_ad_id
	ManagerAdId pulumi.IntOutput `pulumi:"managerAdId"`
	// The user's manager_user_id
	ManagerUserId pulumi.IntOutput `pulumi:"managerUserId"`
	// The user's member_of
	MemberOf pulumi.StringPtrOutput `pulumi:"memberOf"`
	// The user's phone number
	Phone pulumi.StringPtrOutput `pulumi:"phone"`
	// The user's samaccount name
	Samaccountname pulumi.StringPtrOutput `pulumi:"samaccountname"`
	// The user's state. Must be one of `0: Unapproved` `1: Approved` `2: Rejected` `3: Unlicensed`
	State pulumi.IntOutput `pulumi:"state"`
	// The user's status. Must be one of `0: Unactivated` `1: Active` `2: Suspended` `3: Locked` `4: Password expired` `5: Awaiting password reset` `7: Password Pending` `8: Security questions required`
	Status pulumi.IntOutput `pulumi:"status"`
	// The user's title
	Title pulumi.StringPtrOutput `pulumi:"title"`
	// The user's trusted_idp_id
	TrustedIdpId pulumi.IntOutput `pulumi:"trustedIdpId"`
	// The user's username.
	Username pulumi.StringOutput `pulumi:"username"`
	// The user's user principal name
	Userprincipalname pulumi.StringPtrOutput `pulumi:"userprincipalname"`
}

// NewUser registers a new resource with the given unique name, arguments, and options.
func NewUser(ctx *pulumi.Context,
	name string, args *UserArgs, opts ...pulumi.ResourceOption) (*User, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Email == nil {
		return nil, errors.New("invalid value for required argument 'Email'")
	}
	if args.Username == nil {
		return nil, errors.New("invalid value for required argument 'Username'")
	}
	var resource User
	err := ctx.RegisterResource("onelogin:index/user:User", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetUser gets an existing User resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetUser(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *UserState, opts ...pulumi.ResourceOption) (*User, error) {
	var resource User
	err := ctx.ReadResource("onelogin:index/user:User", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering User resources.
type userState struct {
	// A comment about the user
	Comment *string `pulumi:"comment"`
	// The user's company
	Company          *string           `pulumi:"company"`
	CustomAttributes map[string]string `pulumi:"customAttributes"`
	// The user's department
	Department *string `pulumi:"department"`
	// The user's directory_id
	DirectoryId *int `pulumi:"directoryId"`
	// The user's distinguished name
	DistinguishedName *string `pulumi:"distinguishedName"`
	// The user's email.
	Email *string `pulumi:"email"`
	// The user's external_id
	ExternalId *int `pulumi:"externalId"`
	// The user's first name
	Firstname *string `pulumi:"firstname"`
	// The user's group_id
	GroupId *int `pulumi:"groupId"`
	// The user's last name
	Lastname *string `pulumi:"lastname"`
	// The user's manager_ad_id
	ManagerAdId *int `pulumi:"managerAdId"`
	// The user's manager_user_id
	ManagerUserId *int `pulumi:"managerUserId"`
	// The user's member_of
	MemberOf *string `pulumi:"memberOf"`
	// The user's phone number
	Phone *string `pulumi:"phone"`
	// The user's samaccount name
	Samaccountname *string `pulumi:"samaccountname"`
	// The user's state. Must be one of `0: Unapproved` `1: Approved` `2: Rejected` `3: Unlicensed`
	State *int `pulumi:"state"`
	// The user's status. Must be one of `0: Unactivated` `1: Active` `2: Suspended` `3: Locked` `4: Password expired` `5: Awaiting password reset` `7: Password Pending` `8: Security questions required`
	Status *int `pulumi:"status"`
	// The user's title
	Title *string `pulumi:"title"`
	// The user's trusted_idp_id
	TrustedIdpId *int `pulumi:"trustedIdpId"`
	// The user's username.
	Username *string `pulumi:"username"`
	// The user's user principal name
	Userprincipalname *string `pulumi:"userprincipalname"`
}

type UserState struct {
	// A comment about the user
	Comment pulumi.StringPtrInput
	// The user's company
	Company          pulumi.StringPtrInput
	CustomAttributes pulumi.StringMapInput
	// The user's department
	Department pulumi.StringPtrInput
	// The user's directory_id
	DirectoryId pulumi.IntPtrInput
	// The user's distinguished name
	DistinguishedName pulumi.StringPtrInput
	// The user's email.
	Email pulumi.StringPtrInput
	// The user's external_id
	ExternalId pulumi.IntPtrInput
	// The user's first name
	Firstname pulumi.StringPtrInput
	// The user's group_id
	GroupId pulumi.IntPtrInput
	// The user's last name
	Lastname pulumi.StringPtrInput
	// The user's manager_ad_id
	ManagerAdId pulumi.IntPtrInput
	// The user's manager_user_id
	ManagerUserId pulumi.IntPtrInput
	// The user's member_of
	MemberOf pulumi.StringPtrInput
	// The user's phone number
	Phone pulumi.StringPtrInput
	// The user's samaccount name
	Samaccountname pulumi.StringPtrInput
	// The user's state. Must be one of `0: Unapproved` `1: Approved` `2: Rejected` `3: Unlicensed`
	State pulumi.IntPtrInput
	// The user's status. Must be one of `0: Unactivated` `1: Active` `2: Suspended` `3: Locked` `4: Password expired` `5: Awaiting password reset` `7: Password Pending` `8: Security questions required`
	Status pulumi.IntPtrInput
	// The user's title
	Title pulumi.StringPtrInput
	// The user's trusted_idp_id
	TrustedIdpId pulumi.IntPtrInput
	// The user's username.
	Username pulumi.StringPtrInput
	// The user's user principal name
	Userprincipalname pulumi.StringPtrInput
}

func (UserState) ElementType() reflect.Type {
	return reflect.TypeOf((*userState)(nil)).Elem()
}

type userArgs struct {
	// A comment about the user
	Comment *string `pulumi:"comment"`
	// The user's company
	Company          *string           `pulumi:"company"`
	CustomAttributes map[string]string `pulumi:"customAttributes"`
	// The user's department
	Department *string `pulumi:"department"`
	// The user's directory_id
	DirectoryId *int `pulumi:"directoryId"`
	// The user's distinguished name
	DistinguishedName *string `pulumi:"distinguishedName"`
	// The user's email.
	Email string `pulumi:"email"`
	// The user's external_id
	ExternalId *int `pulumi:"externalId"`
	// The user's first name
	Firstname *string `pulumi:"firstname"`
	// The user's group_id
	GroupId *int `pulumi:"groupId"`
	// The user's last name
	Lastname *string `pulumi:"lastname"`
	// The user's manager_ad_id
	ManagerAdId *int `pulumi:"managerAdId"`
	// The user's manager_user_id
	ManagerUserId *int `pulumi:"managerUserId"`
	// The user's member_of
	MemberOf *string `pulumi:"memberOf"`
	// The user's phone number
	Phone *string `pulumi:"phone"`
	// The user's samaccount name
	Samaccountname *string `pulumi:"samaccountname"`
	// The user's state. Must be one of `0: Unapproved` `1: Approved` `2: Rejected` `3: Unlicensed`
	State *int `pulumi:"state"`
	// The user's status. Must be one of `0: Unactivated` `1: Active` `2: Suspended` `3: Locked` `4: Password expired` `5: Awaiting password reset` `7: Password Pending` `8: Security questions required`
	Status *int `pulumi:"status"`
	// The user's title
	Title *string `pulumi:"title"`
	// The user's trusted_idp_id
	TrustedIdpId *int `pulumi:"trustedIdpId"`
	// The user's username.
	Username string `pulumi:"username"`
	// The user's user principal name
	Userprincipalname *string `pulumi:"userprincipalname"`
}

// The set of arguments for constructing a User resource.
type UserArgs struct {
	// A comment about the user
	Comment pulumi.StringPtrInput
	// The user's company
	Company          pulumi.StringPtrInput
	CustomAttributes pulumi.StringMapInput
	// The user's department
	Department pulumi.StringPtrInput
	// The user's directory_id
	DirectoryId pulumi.IntPtrInput
	// The user's distinguished name
	DistinguishedName pulumi.StringPtrInput
	// The user's email.
	Email pulumi.StringInput
	// The user's external_id
	ExternalId pulumi.IntPtrInput
	// The user's first name
	Firstname pulumi.StringPtrInput
	// The user's group_id
	GroupId pulumi.IntPtrInput
	// The user's last name
	Lastname pulumi.StringPtrInput
	// The user's manager_ad_id
	ManagerAdId pulumi.IntPtrInput
	// The user's manager_user_id
	ManagerUserId pulumi.IntPtrInput
	// The user's member_of
	MemberOf pulumi.StringPtrInput
	// The user's phone number
	Phone pulumi.StringPtrInput
	// The user's samaccount name
	Samaccountname pulumi.StringPtrInput
	// The user's state. Must be one of `0: Unapproved` `1: Approved` `2: Rejected` `3: Unlicensed`
	State pulumi.IntPtrInput
	// The user's status. Must be one of `0: Unactivated` `1: Active` `2: Suspended` `3: Locked` `4: Password expired` `5: Awaiting password reset` `7: Password Pending` `8: Security questions required`
	Status pulumi.IntPtrInput
	// The user's title
	Title pulumi.StringPtrInput
	// The user's trusted_idp_id
	TrustedIdpId pulumi.IntPtrInput
	// The user's username.
	Username pulumi.StringInput
	// The user's user principal name
	Userprincipalname pulumi.StringPtrInput
}

func (UserArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*userArgs)(nil)).Elem()
}

type UserInput interface {
	pulumi.Input

	ToUserOutput() UserOutput
	ToUserOutputWithContext(ctx context.Context) UserOutput
}

func (*User) ElementType() reflect.Type {
	return reflect.TypeOf((**User)(nil)).Elem()
}

func (i *User) ToUserOutput() UserOutput {
	return i.ToUserOutputWithContext(context.Background())
}

func (i *User) ToUserOutputWithContext(ctx context.Context) UserOutput {
	return pulumi.ToOutputWithContext(ctx, i).(UserOutput)
}

// UserArrayInput is an input type that accepts UserArray and UserArrayOutput values.
// You can construct a concrete instance of `UserArrayInput` via:
//
//          UserArray{ UserArgs{...} }
type UserArrayInput interface {
	pulumi.Input

	ToUserArrayOutput() UserArrayOutput
	ToUserArrayOutputWithContext(context.Context) UserArrayOutput
}

type UserArray []UserInput

func (UserArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*User)(nil)).Elem()
}

func (i UserArray) ToUserArrayOutput() UserArrayOutput {
	return i.ToUserArrayOutputWithContext(context.Background())
}

func (i UserArray) ToUserArrayOutputWithContext(ctx context.Context) UserArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(UserArrayOutput)
}

// UserMapInput is an input type that accepts UserMap and UserMapOutput values.
// You can construct a concrete instance of `UserMapInput` via:
//
//          UserMap{ "key": UserArgs{...} }
type UserMapInput interface {
	pulumi.Input

	ToUserMapOutput() UserMapOutput
	ToUserMapOutputWithContext(context.Context) UserMapOutput
}

type UserMap map[string]UserInput

func (UserMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*User)(nil)).Elem()
}

func (i UserMap) ToUserMapOutput() UserMapOutput {
	return i.ToUserMapOutputWithContext(context.Background())
}

func (i UserMap) ToUserMapOutputWithContext(ctx context.Context) UserMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(UserMapOutput)
}

type UserOutput struct{ *pulumi.OutputState }

func (UserOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**User)(nil)).Elem()
}

func (o UserOutput) ToUserOutput() UserOutput {
	return o
}

func (o UserOutput) ToUserOutputWithContext(ctx context.Context) UserOutput {
	return o
}

type UserArrayOutput struct{ *pulumi.OutputState }

func (UserArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*User)(nil)).Elem()
}

func (o UserArrayOutput) ToUserArrayOutput() UserArrayOutput {
	return o
}

func (o UserArrayOutput) ToUserArrayOutputWithContext(ctx context.Context) UserArrayOutput {
	return o
}

func (o UserArrayOutput) Index(i pulumi.IntInput) UserOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *User {
		return vs[0].([]*User)[vs[1].(int)]
	}).(UserOutput)
}

type UserMapOutput struct{ *pulumi.OutputState }

func (UserMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*User)(nil)).Elem()
}

func (o UserMapOutput) ToUserMapOutput() UserMapOutput {
	return o
}

func (o UserMapOutput) ToUserMapOutputWithContext(ctx context.Context) UserMapOutput {
	return o
}

func (o UserMapOutput) MapIndex(k pulumi.StringInput) UserOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *User {
		return vs[0].(map[string]*User)[vs[1].(string)]
	}).(UserOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*UserInput)(nil)).Elem(), &User{})
	pulumi.RegisterInputType(reflect.TypeOf((*UserArrayInput)(nil)).Elem(), UserArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*UserMapInput)(nil)).Elem(), UserMap{})
	pulumi.RegisterOutputType(UserOutput{})
	pulumi.RegisterOutputType(UserArrayOutput{})
	pulumi.RegisterOutputType(UserMapOutput{})
}
