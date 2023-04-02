// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package onelogin

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

type User struct {
	pulumi.CustomResourceState

	ActivatedAt pulumi.StringPtrOutput `pulumi:"activatedAt"`
	// Free text related to the user.
	Comment pulumi.StringPtrOutput `pulumi:"comment"`
	// The user's company.
	Company   pulumi.StringPtrOutput `pulumi:"company"`
	CreatedAt pulumi.StringPtrOutput `pulumi:"createdAt"`
	// The user's department.
	Department pulumi.StringPtrOutput `pulumi:"department"`
	// The ID of the OneLogin Directory of the user.
	DirectoryId pulumi.IntPtrOutput `pulumi:"directoryId"`
	// The distinguished name of the user.
	DistinguishedName pulumi.StringPtrOutput `pulumi:"distinguishedName"`
	// A valid email for the user.
	Email pulumi.StringPtrOutput `pulumi:"email"`
	// The ID of the user in an external directory.
	ExternalId pulumi.StringPtrOutput `pulumi:"externalId"`
	// The user's first name.
	Firstname pulumi.StringPtrOutput `pulumi:"firstname"`
	// The ID of the Group in OneLogin that the user is assigned to.
	GroupId              pulumi.IntPtrOutput    `pulumi:"groupId"`
	InvalidLoginAttempts pulumi.IntPtrOutput    `pulumi:"invalidLoginAttempts"`
	InvitationSentAt     pulumi.StringPtrOutput `pulumi:"invitationSentAt"`
	LastLogin            pulumi.StringPtrOutput `pulumi:"lastLogin"`
	// The user's last name.
	Lastname    pulumi.StringPtrOutput `pulumi:"lastname"`
	LockedUntil pulumi.StringPtrOutput `pulumi:"lockedUntil"`
	// The ID of the user's manager in Active Directory.
	ManagerAdId pulumi.StringPtrOutput `pulumi:"managerAdId"`
	// The OneLogin User ID for the user's manager.
	ManagerUserId pulumi.StringPtrOutput `pulumi:"managerUserId"`
	// The user's directory membership.
	MemberOf pulumi.StringPtrOutput `pulumi:"memberOf"`
	// The password to set for a user.
	Password pulumi.StringPtrOutput `pulumi:"password"`
	// Use this when importing a password that's already hashed. Prepend the salt value to the cleartext password value before
	// SHA-256-encoding it
	PasswordAlgorithm pulumi.StringPtrOutput `pulumi:"passwordAlgorithm"`
	PasswordChangedAt pulumi.StringPtrOutput `pulumi:"passwordChangedAt"`
	// Required if the password is being set.
	PasswordConfirmation pulumi.StringPtrOutput `pulumi:"passwordConfirmation"`
	// The E.164 format phone number for a user.
	Phone               pulumi.StringPtrOutput `pulumi:"phone"`
	PreferredLocaleCode pulumi.StringPtrOutput `pulumi:"preferredLocaleCode"`
	// A list of OneLogin Role IDs of the user
	RoleIds pulumi.IntArrayOutput `pulumi:"roleIds"`
	// The salt value used with the password_algorithm.
	Salt pulumi.StringPtrOutput `pulumi:"salt"`
	// The user's Active Directory username.
	Samaccountname pulumi.StringPtrOutput `pulumi:"samaccountname"`
	State          pulumi.IntPtrOutput    `pulumi:"state"`
	Status         pulumi.IntPtrOutput    `pulumi:"status"`
	// The user's job title.
	Title pulumi.StringPtrOutput `pulumi:"title"`
	// The ID of the OneLogin Trusted IDP of the user.
	TrustedIdpId pulumi.IntPtrOutput    `pulumi:"trustedIdpId"`
	UpdatedAt    pulumi.StringPtrOutput `pulumi:"updatedAt"`
	// A username for the user.
	Username pulumi.StringPtrOutput `pulumi:"username"`
	// The principle name of the user.
	Userprincipalname pulumi.StringPtrOutput `pulumi:"userprincipalname"`
}

// NewUser registers a new resource with the given unique name, arguments, and options.
func NewUser(ctx *pulumi.Context,
	name string, args *UserArgs, opts ...pulumi.ResourceOption) (*User, error) {
	if args == nil {
		args = &UserArgs{}
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
	ActivatedAt *string `pulumi:"activatedAt"`
	// Free text related to the user.
	Comment *string `pulumi:"comment"`
	// The user's company.
	Company   *string `pulumi:"company"`
	CreatedAt *string `pulumi:"createdAt"`
	// The user's department.
	Department *string `pulumi:"department"`
	// The ID of the OneLogin Directory of the user.
	DirectoryId *int `pulumi:"directoryId"`
	// The distinguished name of the user.
	DistinguishedName *string `pulumi:"distinguishedName"`
	// A valid email for the user.
	Email *string `pulumi:"email"`
	// The ID of the user in an external directory.
	ExternalId *string `pulumi:"externalId"`
	// The user's first name.
	Firstname *string `pulumi:"firstname"`
	// The ID of the Group in OneLogin that the user is assigned to.
	GroupId              *int    `pulumi:"groupId"`
	InvalidLoginAttempts *int    `pulumi:"invalidLoginAttempts"`
	InvitationSentAt     *string `pulumi:"invitationSentAt"`
	LastLogin            *string `pulumi:"lastLogin"`
	// The user's last name.
	Lastname    *string `pulumi:"lastname"`
	LockedUntil *string `pulumi:"lockedUntil"`
	// The ID of the user's manager in Active Directory.
	ManagerAdId *string `pulumi:"managerAdId"`
	// The OneLogin User ID for the user's manager.
	ManagerUserId *string `pulumi:"managerUserId"`
	// The user's directory membership.
	MemberOf *string `pulumi:"memberOf"`
	// The password to set for a user.
	Password *string `pulumi:"password"`
	// Use this when importing a password that's already hashed. Prepend the salt value to the cleartext password value before
	// SHA-256-encoding it
	PasswordAlgorithm *string `pulumi:"passwordAlgorithm"`
	PasswordChangedAt *string `pulumi:"passwordChangedAt"`
	// Required if the password is being set.
	PasswordConfirmation *string `pulumi:"passwordConfirmation"`
	// The E.164 format phone number for a user.
	Phone               *string `pulumi:"phone"`
	PreferredLocaleCode *string `pulumi:"preferredLocaleCode"`
	// A list of OneLogin Role IDs of the user
	RoleIds []int `pulumi:"roleIds"`
	// The salt value used with the password_algorithm.
	Salt *string `pulumi:"salt"`
	// The user's Active Directory username.
	Samaccountname *string `pulumi:"samaccountname"`
	State          *int    `pulumi:"state"`
	Status         *int    `pulumi:"status"`
	// The user's job title.
	Title *string `pulumi:"title"`
	// The ID of the OneLogin Trusted IDP of the user.
	TrustedIdpId *int    `pulumi:"trustedIdpId"`
	UpdatedAt    *string `pulumi:"updatedAt"`
	// A username for the user.
	Username *string `pulumi:"username"`
	// The principle name of the user.
	Userprincipalname *string `pulumi:"userprincipalname"`
}

type UserState struct {
	ActivatedAt pulumi.StringPtrInput
	// Free text related to the user.
	Comment pulumi.StringPtrInput
	// The user's company.
	Company   pulumi.StringPtrInput
	CreatedAt pulumi.StringPtrInput
	// The user's department.
	Department pulumi.StringPtrInput
	// The ID of the OneLogin Directory of the user.
	DirectoryId pulumi.IntPtrInput
	// The distinguished name of the user.
	DistinguishedName pulumi.StringPtrInput
	// A valid email for the user.
	Email pulumi.StringPtrInput
	// The ID of the user in an external directory.
	ExternalId pulumi.StringPtrInput
	// The user's first name.
	Firstname pulumi.StringPtrInput
	// The ID of the Group in OneLogin that the user is assigned to.
	GroupId              pulumi.IntPtrInput
	InvalidLoginAttempts pulumi.IntPtrInput
	InvitationSentAt     pulumi.StringPtrInput
	LastLogin            pulumi.StringPtrInput
	// The user's last name.
	Lastname    pulumi.StringPtrInput
	LockedUntil pulumi.StringPtrInput
	// The ID of the user's manager in Active Directory.
	ManagerAdId pulumi.StringPtrInput
	// The OneLogin User ID for the user's manager.
	ManagerUserId pulumi.StringPtrInput
	// The user's directory membership.
	MemberOf pulumi.StringPtrInput
	// The password to set for a user.
	Password pulumi.StringPtrInput
	// Use this when importing a password that's already hashed. Prepend the salt value to the cleartext password value before
	// SHA-256-encoding it
	PasswordAlgorithm pulumi.StringPtrInput
	PasswordChangedAt pulumi.StringPtrInput
	// Required if the password is being set.
	PasswordConfirmation pulumi.StringPtrInput
	// The E.164 format phone number for a user.
	Phone               pulumi.StringPtrInput
	PreferredLocaleCode pulumi.StringPtrInput
	// A list of OneLogin Role IDs of the user
	RoleIds pulumi.IntArrayInput
	// The salt value used with the password_algorithm.
	Salt pulumi.StringPtrInput
	// The user's Active Directory username.
	Samaccountname pulumi.StringPtrInput
	State          pulumi.IntPtrInput
	Status         pulumi.IntPtrInput
	// The user's job title.
	Title pulumi.StringPtrInput
	// The ID of the OneLogin Trusted IDP of the user.
	TrustedIdpId pulumi.IntPtrInput
	UpdatedAt    pulumi.StringPtrInput
	// A username for the user.
	Username pulumi.StringPtrInput
	// The principle name of the user.
	Userprincipalname pulumi.StringPtrInput
}

func (UserState) ElementType() reflect.Type {
	return reflect.TypeOf((*userState)(nil)).Elem()
}

type userArgs struct {
	ActivatedAt *string `pulumi:"activatedAt"`
	// Free text related to the user.
	Comment *string `pulumi:"comment"`
	// The user's company.
	Company   *string `pulumi:"company"`
	CreatedAt *string `pulumi:"createdAt"`
	// The user's department.
	Department *string `pulumi:"department"`
	// The ID of the OneLogin Directory of the user.
	DirectoryId *int `pulumi:"directoryId"`
	// The distinguished name of the user.
	DistinguishedName *string `pulumi:"distinguishedName"`
	// A valid email for the user.
	Email *string `pulumi:"email"`
	// The ID of the user in an external directory.
	ExternalId *string `pulumi:"externalId"`
	// The user's first name.
	Firstname *string `pulumi:"firstname"`
	// The ID of the Group in OneLogin that the user is assigned to.
	GroupId              *int    `pulumi:"groupId"`
	InvalidLoginAttempts *int    `pulumi:"invalidLoginAttempts"`
	InvitationSentAt     *string `pulumi:"invitationSentAt"`
	LastLogin            *string `pulumi:"lastLogin"`
	// The user's last name.
	Lastname    *string `pulumi:"lastname"`
	LockedUntil *string `pulumi:"lockedUntil"`
	// The ID of the user's manager in Active Directory.
	ManagerAdId *string `pulumi:"managerAdId"`
	// The OneLogin User ID for the user's manager.
	ManagerUserId *string `pulumi:"managerUserId"`
	// The user's directory membership.
	MemberOf *string `pulumi:"memberOf"`
	// The password to set for a user.
	Password *string `pulumi:"password"`
	// Use this when importing a password that's already hashed. Prepend the salt value to the cleartext password value before
	// SHA-256-encoding it
	PasswordAlgorithm *string `pulumi:"passwordAlgorithm"`
	PasswordChangedAt *string `pulumi:"passwordChangedAt"`
	// Required if the password is being set.
	PasswordConfirmation *string `pulumi:"passwordConfirmation"`
	// The E.164 format phone number for a user.
	Phone               *string `pulumi:"phone"`
	PreferredLocaleCode *string `pulumi:"preferredLocaleCode"`
	// A list of OneLogin Role IDs of the user
	RoleIds []int `pulumi:"roleIds"`
	// The salt value used with the password_algorithm.
	Salt *string `pulumi:"salt"`
	// The user's Active Directory username.
	Samaccountname *string `pulumi:"samaccountname"`
	State          *int    `pulumi:"state"`
	Status         *int    `pulumi:"status"`
	// The user's job title.
	Title *string `pulumi:"title"`
	// The ID of the OneLogin Trusted IDP of the user.
	TrustedIdpId *int    `pulumi:"trustedIdpId"`
	UpdatedAt    *string `pulumi:"updatedAt"`
	// A username for the user.
	Username *string `pulumi:"username"`
	// The principle name of the user.
	Userprincipalname *string `pulumi:"userprincipalname"`
}

// The set of arguments for constructing a User resource.
type UserArgs struct {
	ActivatedAt pulumi.StringPtrInput
	// Free text related to the user.
	Comment pulumi.StringPtrInput
	// The user's company.
	Company   pulumi.StringPtrInput
	CreatedAt pulumi.StringPtrInput
	// The user's department.
	Department pulumi.StringPtrInput
	// The ID of the OneLogin Directory of the user.
	DirectoryId pulumi.IntPtrInput
	// The distinguished name of the user.
	DistinguishedName pulumi.StringPtrInput
	// A valid email for the user.
	Email pulumi.StringPtrInput
	// The ID of the user in an external directory.
	ExternalId pulumi.StringPtrInput
	// The user's first name.
	Firstname pulumi.StringPtrInput
	// The ID of the Group in OneLogin that the user is assigned to.
	GroupId              pulumi.IntPtrInput
	InvalidLoginAttempts pulumi.IntPtrInput
	InvitationSentAt     pulumi.StringPtrInput
	LastLogin            pulumi.StringPtrInput
	// The user's last name.
	Lastname    pulumi.StringPtrInput
	LockedUntil pulumi.StringPtrInput
	// The ID of the user's manager in Active Directory.
	ManagerAdId pulumi.StringPtrInput
	// The OneLogin User ID for the user's manager.
	ManagerUserId pulumi.StringPtrInput
	// The user's directory membership.
	MemberOf pulumi.StringPtrInput
	// The password to set for a user.
	Password pulumi.StringPtrInput
	// Use this when importing a password that's already hashed. Prepend the salt value to the cleartext password value before
	// SHA-256-encoding it
	PasswordAlgorithm pulumi.StringPtrInput
	PasswordChangedAt pulumi.StringPtrInput
	// Required if the password is being set.
	PasswordConfirmation pulumi.StringPtrInput
	// The E.164 format phone number for a user.
	Phone               pulumi.StringPtrInput
	PreferredLocaleCode pulumi.StringPtrInput
	// A list of OneLogin Role IDs of the user
	RoleIds pulumi.IntArrayInput
	// The salt value used with the password_algorithm.
	Salt pulumi.StringPtrInput
	// The user's Active Directory username.
	Samaccountname pulumi.StringPtrInput
	State          pulumi.IntPtrInput
	Status         pulumi.IntPtrInput
	// The user's job title.
	Title pulumi.StringPtrInput
	// The ID of the OneLogin Trusted IDP of the user.
	TrustedIdpId pulumi.IntPtrInput
	UpdatedAt    pulumi.StringPtrInput
	// A username for the user.
	Username pulumi.StringPtrInput
	// The principle name of the user.
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
//	UserArray{ UserArgs{...} }
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
//	UserMap{ "key": UserArgs{...} }
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

func (o UserOutput) ActivatedAt() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *User) pulumi.StringPtrOutput { return v.ActivatedAt }).(pulumi.StringPtrOutput)
}

// Free text related to the user.
func (o UserOutput) Comment() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *User) pulumi.StringPtrOutput { return v.Comment }).(pulumi.StringPtrOutput)
}

// The user's company.
func (o UserOutput) Company() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *User) pulumi.StringPtrOutput { return v.Company }).(pulumi.StringPtrOutput)
}

func (o UserOutput) CreatedAt() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *User) pulumi.StringPtrOutput { return v.CreatedAt }).(pulumi.StringPtrOutput)
}

// The user's department.
func (o UserOutput) Department() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *User) pulumi.StringPtrOutput { return v.Department }).(pulumi.StringPtrOutput)
}

// The ID of the OneLogin Directory of the user.
func (o UserOutput) DirectoryId() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *User) pulumi.IntPtrOutput { return v.DirectoryId }).(pulumi.IntPtrOutput)
}

// The distinguished name of the user.
func (o UserOutput) DistinguishedName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *User) pulumi.StringPtrOutput { return v.DistinguishedName }).(pulumi.StringPtrOutput)
}

// A valid email for the user.
func (o UserOutput) Email() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *User) pulumi.StringPtrOutput { return v.Email }).(pulumi.StringPtrOutput)
}

// The ID of the user in an external directory.
func (o UserOutput) ExternalId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *User) pulumi.StringPtrOutput { return v.ExternalId }).(pulumi.StringPtrOutput)
}

// The user's first name.
func (o UserOutput) Firstname() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *User) pulumi.StringPtrOutput { return v.Firstname }).(pulumi.StringPtrOutput)
}

// The ID of the Group in OneLogin that the user is assigned to.
func (o UserOutput) GroupId() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *User) pulumi.IntPtrOutput { return v.GroupId }).(pulumi.IntPtrOutput)
}

func (o UserOutput) InvalidLoginAttempts() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *User) pulumi.IntPtrOutput { return v.InvalidLoginAttempts }).(pulumi.IntPtrOutput)
}

func (o UserOutput) InvitationSentAt() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *User) pulumi.StringPtrOutput { return v.InvitationSentAt }).(pulumi.StringPtrOutput)
}

func (o UserOutput) LastLogin() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *User) pulumi.StringPtrOutput { return v.LastLogin }).(pulumi.StringPtrOutput)
}

// The user's last name.
func (o UserOutput) Lastname() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *User) pulumi.StringPtrOutput { return v.Lastname }).(pulumi.StringPtrOutput)
}

func (o UserOutput) LockedUntil() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *User) pulumi.StringPtrOutput { return v.LockedUntil }).(pulumi.StringPtrOutput)
}

// The ID of the user's manager in Active Directory.
func (o UserOutput) ManagerAdId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *User) pulumi.StringPtrOutput { return v.ManagerAdId }).(pulumi.StringPtrOutput)
}

// The OneLogin User ID for the user's manager.
func (o UserOutput) ManagerUserId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *User) pulumi.StringPtrOutput { return v.ManagerUserId }).(pulumi.StringPtrOutput)
}

// The user's directory membership.
func (o UserOutput) MemberOf() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *User) pulumi.StringPtrOutput { return v.MemberOf }).(pulumi.StringPtrOutput)
}

// The password to set for a user.
func (o UserOutput) Password() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *User) pulumi.StringPtrOutput { return v.Password }).(pulumi.StringPtrOutput)
}

// Use this when importing a password that's already hashed. Prepend the salt value to the cleartext password value before
// SHA-256-encoding it
func (o UserOutput) PasswordAlgorithm() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *User) pulumi.StringPtrOutput { return v.PasswordAlgorithm }).(pulumi.StringPtrOutput)
}

func (o UserOutput) PasswordChangedAt() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *User) pulumi.StringPtrOutput { return v.PasswordChangedAt }).(pulumi.StringPtrOutput)
}

// Required if the password is being set.
func (o UserOutput) PasswordConfirmation() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *User) pulumi.StringPtrOutput { return v.PasswordConfirmation }).(pulumi.StringPtrOutput)
}

// The E.164 format phone number for a user.
func (o UserOutput) Phone() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *User) pulumi.StringPtrOutput { return v.Phone }).(pulumi.StringPtrOutput)
}

func (o UserOutput) PreferredLocaleCode() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *User) pulumi.StringPtrOutput { return v.PreferredLocaleCode }).(pulumi.StringPtrOutput)
}

// A list of OneLogin Role IDs of the user
func (o UserOutput) RoleIds() pulumi.IntArrayOutput {
	return o.ApplyT(func(v *User) pulumi.IntArrayOutput { return v.RoleIds }).(pulumi.IntArrayOutput)
}

// The salt value used with the password_algorithm.
func (o UserOutput) Salt() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *User) pulumi.StringPtrOutput { return v.Salt }).(pulumi.StringPtrOutput)
}

// The user's Active Directory username.
func (o UserOutput) Samaccountname() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *User) pulumi.StringPtrOutput { return v.Samaccountname }).(pulumi.StringPtrOutput)
}

func (o UserOutput) State() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *User) pulumi.IntPtrOutput { return v.State }).(pulumi.IntPtrOutput)
}

func (o UserOutput) Status() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *User) pulumi.IntPtrOutput { return v.Status }).(pulumi.IntPtrOutput)
}

// The user's job title.
func (o UserOutput) Title() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *User) pulumi.StringPtrOutput { return v.Title }).(pulumi.StringPtrOutput)
}

// The ID of the OneLogin Trusted IDP of the user.
func (o UserOutput) TrustedIdpId() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *User) pulumi.IntPtrOutput { return v.TrustedIdpId }).(pulumi.IntPtrOutput)
}

func (o UserOutput) UpdatedAt() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *User) pulumi.StringPtrOutput { return v.UpdatedAt }).(pulumi.StringPtrOutput)
}

// A username for the user.
func (o UserOutput) Username() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *User) pulumi.StringPtrOutput { return v.Username }).(pulumi.StringPtrOutput)
}

// The principle name of the user.
func (o UserOutput) Userprincipalname() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *User) pulumi.StringPtrOutput { return v.Userprincipalname }).(pulumi.StringPtrOutput)
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
