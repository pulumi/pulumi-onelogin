// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package onelogin

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-onelogin/sdk/go/onelogin/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

type User struct {
	pulumi.CustomResourceState

	Comment           pulumi.StringPtrOutput `pulumi:"comment"`
	Company           pulumi.StringPtrOutput `pulumi:"company"`
	CustomAttributes  pulumi.StringMapOutput `pulumi:"customAttributes"`
	Department        pulumi.StringPtrOutput `pulumi:"department"`
	DirectoryId       pulumi.IntOutput       `pulumi:"directoryId"`
	DistinguishedName pulumi.StringPtrOutput `pulumi:"distinguishedName"`
	Email             pulumi.StringOutput    `pulumi:"email"`
	ExternalId        pulumi.IntOutput       `pulumi:"externalId"`
	Firstname         pulumi.StringPtrOutput `pulumi:"firstname"`
	GroupId           pulumi.IntOutput       `pulumi:"groupId"`
	Lastname          pulumi.StringPtrOutput `pulumi:"lastname"`
	ManagerAdId       pulumi.IntOutput       `pulumi:"managerAdId"`
	ManagerUserId     pulumi.IntOutput       `pulumi:"managerUserId"`
	MemberOf          pulumi.StringPtrOutput `pulumi:"memberOf"`
	Phone             pulumi.StringPtrOutput `pulumi:"phone"`
	Samaccountname    pulumi.StringPtrOutput `pulumi:"samaccountname"`
	State             pulumi.IntOutput       `pulumi:"state"`
	Status            pulumi.IntOutput       `pulumi:"status"`
	Title             pulumi.StringPtrOutput `pulumi:"title"`
	TrustedIdpId      pulumi.IntOutput       `pulumi:"trustedIdpId"`
	Username          pulumi.StringOutput    `pulumi:"username"`
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
	opts = internal.PkgResourceDefaultOpts(opts)
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
	Comment           *string           `pulumi:"comment"`
	Company           *string           `pulumi:"company"`
	CustomAttributes  map[string]string `pulumi:"customAttributes"`
	Department        *string           `pulumi:"department"`
	DirectoryId       *int              `pulumi:"directoryId"`
	DistinguishedName *string           `pulumi:"distinguishedName"`
	Email             *string           `pulumi:"email"`
	ExternalId        *int              `pulumi:"externalId"`
	Firstname         *string           `pulumi:"firstname"`
	GroupId           *int              `pulumi:"groupId"`
	Lastname          *string           `pulumi:"lastname"`
	ManagerAdId       *int              `pulumi:"managerAdId"`
	ManagerUserId     *int              `pulumi:"managerUserId"`
	MemberOf          *string           `pulumi:"memberOf"`
	Phone             *string           `pulumi:"phone"`
	Samaccountname    *string           `pulumi:"samaccountname"`
	State             *int              `pulumi:"state"`
	Status            *int              `pulumi:"status"`
	Title             *string           `pulumi:"title"`
	TrustedIdpId      *int              `pulumi:"trustedIdpId"`
	Username          *string           `pulumi:"username"`
	Userprincipalname *string           `pulumi:"userprincipalname"`
}

type UserState struct {
	Comment           pulumi.StringPtrInput
	Company           pulumi.StringPtrInput
	CustomAttributes  pulumi.StringMapInput
	Department        pulumi.StringPtrInput
	DirectoryId       pulumi.IntPtrInput
	DistinguishedName pulumi.StringPtrInput
	Email             pulumi.StringPtrInput
	ExternalId        pulumi.IntPtrInput
	Firstname         pulumi.StringPtrInput
	GroupId           pulumi.IntPtrInput
	Lastname          pulumi.StringPtrInput
	ManagerAdId       pulumi.IntPtrInput
	ManagerUserId     pulumi.IntPtrInput
	MemberOf          pulumi.StringPtrInput
	Phone             pulumi.StringPtrInput
	Samaccountname    pulumi.StringPtrInput
	State             pulumi.IntPtrInput
	Status            pulumi.IntPtrInput
	Title             pulumi.StringPtrInput
	TrustedIdpId      pulumi.IntPtrInput
	Username          pulumi.StringPtrInput
	Userprincipalname pulumi.StringPtrInput
}

func (UserState) ElementType() reflect.Type {
	return reflect.TypeOf((*userState)(nil)).Elem()
}

type userArgs struct {
	Comment           *string           `pulumi:"comment"`
	Company           *string           `pulumi:"company"`
	CustomAttributes  map[string]string `pulumi:"customAttributes"`
	Department        *string           `pulumi:"department"`
	DirectoryId       *int              `pulumi:"directoryId"`
	DistinguishedName *string           `pulumi:"distinguishedName"`
	Email             string            `pulumi:"email"`
	ExternalId        *int              `pulumi:"externalId"`
	Firstname         *string           `pulumi:"firstname"`
	GroupId           *int              `pulumi:"groupId"`
	Lastname          *string           `pulumi:"lastname"`
	ManagerAdId       *int              `pulumi:"managerAdId"`
	ManagerUserId     *int              `pulumi:"managerUserId"`
	MemberOf          *string           `pulumi:"memberOf"`
	Phone             *string           `pulumi:"phone"`
	Samaccountname    *string           `pulumi:"samaccountname"`
	State             *int              `pulumi:"state"`
	Status            *int              `pulumi:"status"`
	Title             *string           `pulumi:"title"`
	TrustedIdpId      *int              `pulumi:"trustedIdpId"`
	Username          string            `pulumi:"username"`
	Userprincipalname *string           `pulumi:"userprincipalname"`
}

// The set of arguments for constructing a User resource.
type UserArgs struct {
	Comment           pulumi.StringPtrInput
	Company           pulumi.StringPtrInput
	CustomAttributes  pulumi.StringMapInput
	Department        pulumi.StringPtrInput
	DirectoryId       pulumi.IntPtrInput
	DistinguishedName pulumi.StringPtrInput
	Email             pulumi.StringInput
	ExternalId        pulumi.IntPtrInput
	Firstname         pulumi.StringPtrInput
	GroupId           pulumi.IntPtrInput
	Lastname          pulumi.StringPtrInput
	ManagerAdId       pulumi.IntPtrInput
	ManagerUserId     pulumi.IntPtrInput
	MemberOf          pulumi.StringPtrInput
	Phone             pulumi.StringPtrInput
	Samaccountname    pulumi.StringPtrInput
	State             pulumi.IntPtrInput
	Status            pulumi.IntPtrInput
	Title             pulumi.StringPtrInput
	TrustedIdpId      pulumi.IntPtrInput
	Username          pulumi.StringInput
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

func (o UserOutput) Comment() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *User) pulumi.StringPtrOutput { return v.Comment }).(pulumi.StringPtrOutput)
}

func (o UserOutput) Company() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *User) pulumi.StringPtrOutput { return v.Company }).(pulumi.StringPtrOutput)
}

func (o UserOutput) CustomAttributes() pulumi.StringMapOutput {
	return o.ApplyT(func(v *User) pulumi.StringMapOutput { return v.CustomAttributes }).(pulumi.StringMapOutput)
}

func (o UserOutput) Department() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *User) pulumi.StringPtrOutput { return v.Department }).(pulumi.StringPtrOutput)
}

func (o UserOutput) DirectoryId() pulumi.IntOutput {
	return o.ApplyT(func(v *User) pulumi.IntOutput { return v.DirectoryId }).(pulumi.IntOutput)
}

func (o UserOutput) DistinguishedName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *User) pulumi.StringPtrOutput { return v.DistinguishedName }).(pulumi.StringPtrOutput)
}

func (o UserOutput) Email() pulumi.StringOutput {
	return o.ApplyT(func(v *User) pulumi.StringOutput { return v.Email }).(pulumi.StringOutput)
}

func (o UserOutput) ExternalId() pulumi.IntOutput {
	return o.ApplyT(func(v *User) pulumi.IntOutput { return v.ExternalId }).(pulumi.IntOutput)
}

func (o UserOutput) Firstname() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *User) pulumi.StringPtrOutput { return v.Firstname }).(pulumi.StringPtrOutput)
}

func (o UserOutput) GroupId() pulumi.IntOutput {
	return o.ApplyT(func(v *User) pulumi.IntOutput { return v.GroupId }).(pulumi.IntOutput)
}

func (o UserOutput) Lastname() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *User) pulumi.StringPtrOutput { return v.Lastname }).(pulumi.StringPtrOutput)
}

func (o UserOutput) ManagerAdId() pulumi.IntOutput {
	return o.ApplyT(func(v *User) pulumi.IntOutput { return v.ManagerAdId }).(pulumi.IntOutput)
}

func (o UserOutput) ManagerUserId() pulumi.IntOutput {
	return o.ApplyT(func(v *User) pulumi.IntOutput { return v.ManagerUserId }).(pulumi.IntOutput)
}

func (o UserOutput) MemberOf() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *User) pulumi.StringPtrOutput { return v.MemberOf }).(pulumi.StringPtrOutput)
}

func (o UserOutput) Phone() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *User) pulumi.StringPtrOutput { return v.Phone }).(pulumi.StringPtrOutput)
}

func (o UserOutput) Samaccountname() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *User) pulumi.StringPtrOutput { return v.Samaccountname }).(pulumi.StringPtrOutput)
}

func (o UserOutput) State() pulumi.IntOutput {
	return o.ApplyT(func(v *User) pulumi.IntOutput { return v.State }).(pulumi.IntOutput)
}

func (o UserOutput) Status() pulumi.IntOutput {
	return o.ApplyT(func(v *User) pulumi.IntOutput { return v.Status }).(pulumi.IntOutput)
}

func (o UserOutput) Title() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *User) pulumi.StringPtrOutput { return v.Title }).(pulumi.StringPtrOutput)
}

func (o UserOutput) TrustedIdpId() pulumi.IntOutput {
	return o.ApplyT(func(v *User) pulumi.IntOutput { return v.TrustedIdpId }).(pulumi.IntOutput)
}

func (o UserOutput) Username() pulumi.StringOutput {
	return o.ApplyT(func(v *User) pulumi.StringOutput { return v.Username }).(pulumi.StringOutput)
}

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
