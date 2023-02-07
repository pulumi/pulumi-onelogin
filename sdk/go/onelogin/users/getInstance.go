// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package users

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func GetInstance(ctx *pulumi.Context, args *GetInstanceArgs, opts ...pulumi.InvokeOption) (*GetInstanceResult, error) {
	var rv GetInstanceResult
	err := ctx.Invoke("onelogin:users/getInstance:getInstance", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getInstance.
type GetInstanceArgs struct {
	ActivatedAt          *string `pulumi:"activatedAt"`
	Comment              *string `pulumi:"comment"`
	Company              *string `pulumi:"company"`
	CreatedAt            *string `pulumi:"createdAt"`
	Department           *string `pulumi:"department"`
	DirectoryId          *int    `pulumi:"directoryId"`
	DistinguishedName    *string `pulumi:"distinguishedName"`
	Email                *string `pulumi:"email"`
	ExternalId           *string `pulumi:"externalId"`
	Firstname            *string `pulumi:"firstname"`
	GroupId              *int    `pulumi:"groupId"`
	Id                   string  `pulumi:"id"`
	InvalidLoginAttempts *int    `pulumi:"invalidLoginAttempts"`
	InvitationSentAt     *string `pulumi:"invitationSentAt"`
	LastLogin            *string `pulumi:"lastLogin"`
	Lastname             *string `pulumi:"lastname"`
	LockedUntil          *string `pulumi:"lockedUntil"`
	ManagerAdId          *string `pulumi:"managerAdId"`
	ManagerUserId        *string `pulumi:"managerUserId"`
	MemberOf             *string `pulumi:"memberOf"`
	Password             *string `pulumi:"password"`
	PasswordAlgorithm    *string `pulumi:"passwordAlgorithm"`
	PasswordChangedAt    *string `pulumi:"passwordChangedAt"`
	PasswordConfirmation *string `pulumi:"passwordConfirmation"`
	Phone                *string `pulumi:"phone"`
	PreferredLocaleCode  *string `pulumi:"preferredLocaleCode"`
	RoleIds              []int   `pulumi:"roleIds"`
	Salt                 *string `pulumi:"salt"`
	SamaccountName       *string `pulumi:"samaccountName"`
	State                *int    `pulumi:"state"`
	Status               *int    `pulumi:"status"`
	Title                *string `pulumi:"title"`
	TrustedIdpId         *int    `pulumi:"trustedIdpId"`
	UpdatedAt            *string `pulumi:"updatedAt"`
	Username             *string `pulumi:"username"`
	Userprincipalname    *string `pulumi:"userprincipalname"`
}

// A collection of values returned by getInstance.
type GetInstanceResult struct {
	ActivatedAt          string `pulumi:"activatedAt"`
	Comment              string `pulumi:"comment"`
	Company              string `pulumi:"company"`
	CreatedAt            string `pulumi:"createdAt"`
	Department           string `pulumi:"department"`
	DirectoryId          int    `pulumi:"directoryId"`
	DistinguishedName    string `pulumi:"distinguishedName"`
	Email                string `pulumi:"email"`
	ExternalId           string `pulumi:"externalId"`
	Firstname            string `pulumi:"firstname"`
	GroupId              int    `pulumi:"groupId"`
	Id                   string `pulumi:"id"`
	InvalidLoginAttempts int    `pulumi:"invalidLoginAttempts"`
	InvitationSentAt     string `pulumi:"invitationSentAt"`
	LastLogin            string `pulumi:"lastLogin"`
	Lastname             string `pulumi:"lastname"`
	LockedUntil          string `pulumi:"lockedUntil"`
	ManagerAdId          string `pulumi:"managerAdId"`
	ManagerUserId        string `pulumi:"managerUserId"`
	MemberOf             string `pulumi:"memberOf"`
	Password             string `pulumi:"password"`
	PasswordAlgorithm    string `pulumi:"passwordAlgorithm"`
	PasswordChangedAt    string `pulumi:"passwordChangedAt"`
	PasswordConfirmation string `pulumi:"passwordConfirmation"`
	Phone                string `pulumi:"phone"`
	PreferredLocaleCode  string `pulumi:"preferredLocaleCode"`
	RoleIds              []int  `pulumi:"roleIds"`
	Salt                 string `pulumi:"salt"`
	SamaccountName       string `pulumi:"samaccountName"`
	State                int    `pulumi:"state"`
	Status               int    `pulumi:"status"`
	Title                string `pulumi:"title"`
	TrustedIdpId         int    `pulumi:"trustedIdpId"`
	UpdatedAt            string `pulumi:"updatedAt"`
	Username             string `pulumi:"username"`
	Userprincipalname    string `pulumi:"userprincipalname"`
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
	ActivatedAt          pulumi.StringPtrInput `pulumi:"activatedAt"`
	Comment              pulumi.StringPtrInput `pulumi:"comment"`
	Company              pulumi.StringPtrInput `pulumi:"company"`
	CreatedAt            pulumi.StringPtrInput `pulumi:"createdAt"`
	Department           pulumi.StringPtrInput `pulumi:"department"`
	DirectoryId          pulumi.IntPtrInput    `pulumi:"directoryId"`
	DistinguishedName    pulumi.StringPtrInput `pulumi:"distinguishedName"`
	Email                pulumi.StringPtrInput `pulumi:"email"`
	ExternalId           pulumi.StringPtrInput `pulumi:"externalId"`
	Firstname            pulumi.StringPtrInput `pulumi:"firstname"`
	GroupId              pulumi.IntPtrInput    `pulumi:"groupId"`
	Id                   pulumi.StringInput    `pulumi:"id"`
	InvalidLoginAttempts pulumi.IntPtrInput    `pulumi:"invalidLoginAttempts"`
	InvitationSentAt     pulumi.StringPtrInput `pulumi:"invitationSentAt"`
	LastLogin            pulumi.StringPtrInput `pulumi:"lastLogin"`
	Lastname             pulumi.StringPtrInput `pulumi:"lastname"`
	LockedUntil          pulumi.StringPtrInput `pulumi:"lockedUntil"`
	ManagerAdId          pulumi.StringPtrInput `pulumi:"managerAdId"`
	ManagerUserId        pulumi.StringPtrInput `pulumi:"managerUserId"`
	MemberOf             pulumi.StringPtrInput `pulumi:"memberOf"`
	Password             pulumi.StringPtrInput `pulumi:"password"`
	PasswordAlgorithm    pulumi.StringPtrInput `pulumi:"passwordAlgorithm"`
	PasswordChangedAt    pulumi.StringPtrInput `pulumi:"passwordChangedAt"`
	PasswordConfirmation pulumi.StringPtrInput `pulumi:"passwordConfirmation"`
	Phone                pulumi.StringPtrInput `pulumi:"phone"`
	PreferredLocaleCode  pulumi.StringPtrInput `pulumi:"preferredLocaleCode"`
	RoleIds              pulumi.IntArrayInput  `pulumi:"roleIds"`
	Salt                 pulumi.StringPtrInput `pulumi:"salt"`
	SamaccountName       pulumi.StringPtrInput `pulumi:"samaccountName"`
	State                pulumi.IntPtrInput    `pulumi:"state"`
	Status               pulumi.IntPtrInput    `pulumi:"status"`
	Title                pulumi.StringPtrInput `pulumi:"title"`
	TrustedIdpId         pulumi.IntPtrInput    `pulumi:"trustedIdpId"`
	UpdatedAt            pulumi.StringPtrInput `pulumi:"updatedAt"`
	Username             pulumi.StringPtrInput `pulumi:"username"`
	Userprincipalname    pulumi.StringPtrInput `pulumi:"userprincipalname"`
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

func (o GetInstanceResultOutput) ActivatedAt() pulumi.StringOutput {
	return o.ApplyT(func(v GetInstanceResult) string { return v.ActivatedAt }).(pulumi.StringOutput)
}

func (o GetInstanceResultOutput) Comment() pulumi.StringOutput {
	return o.ApplyT(func(v GetInstanceResult) string { return v.Comment }).(pulumi.StringOutput)
}

func (o GetInstanceResultOutput) Company() pulumi.StringOutput {
	return o.ApplyT(func(v GetInstanceResult) string { return v.Company }).(pulumi.StringOutput)
}

func (o GetInstanceResultOutput) CreatedAt() pulumi.StringOutput {
	return o.ApplyT(func(v GetInstanceResult) string { return v.CreatedAt }).(pulumi.StringOutput)
}

func (o GetInstanceResultOutput) Department() pulumi.StringOutput {
	return o.ApplyT(func(v GetInstanceResult) string { return v.Department }).(pulumi.StringOutput)
}

func (o GetInstanceResultOutput) DirectoryId() pulumi.IntOutput {
	return o.ApplyT(func(v GetInstanceResult) int { return v.DirectoryId }).(pulumi.IntOutput)
}

func (o GetInstanceResultOutput) DistinguishedName() pulumi.StringOutput {
	return o.ApplyT(func(v GetInstanceResult) string { return v.DistinguishedName }).(pulumi.StringOutput)
}

func (o GetInstanceResultOutput) Email() pulumi.StringOutput {
	return o.ApplyT(func(v GetInstanceResult) string { return v.Email }).(pulumi.StringOutput)
}

func (o GetInstanceResultOutput) ExternalId() pulumi.StringOutput {
	return o.ApplyT(func(v GetInstanceResult) string { return v.ExternalId }).(pulumi.StringOutput)
}

func (o GetInstanceResultOutput) Firstname() pulumi.StringOutput {
	return o.ApplyT(func(v GetInstanceResult) string { return v.Firstname }).(pulumi.StringOutput)
}

func (o GetInstanceResultOutput) GroupId() pulumi.IntOutput {
	return o.ApplyT(func(v GetInstanceResult) int { return v.GroupId }).(pulumi.IntOutput)
}

func (o GetInstanceResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetInstanceResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetInstanceResultOutput) InvalidLoginAttempts() pulumi.IntOutput {
	return o.ApplyT(func(v GetInstanceResult) int { return v.InvalidLoginAttempts }).(pulumi.IntOutput)
}

func (o GetInstanceResultOutput) InvitationSentAt() pulumi.StringOutput {
	return o.ApplyT(func(v GetInstanceResult) string { return v.InvitationSentAt }).(pulumi.StringOutput)
}

func (o GetInstanceResultOutput) LastLogin() pulumi.StringOutput {
	return o.ApplyT(func(v GetInstanceResult) string { return v.LastLogin }).(pulumi.StringOutput)
}

func (o GetInstanceResultOutput) Lastname() pulumi.StringOutput {
	return o.ApplyT(func(v GetInstanceResult) string { return v.Lastname }).(pulumi.StringOutput)
}

func (o GetInstanceResultOutput) LockedUntil() pulumi.StringOutput {
	return o.ApplyT(func(v GetInstanceResult) string { return v.LockedUntil }).(pulumi.StringOutput)
}

func (o GetInstanceResultOutput) ManagerAdId() pulumi.StringOutput {
	return o.ApplyT(func(v GetInstanceResult) string { return v.ManagerAdId }).(pulumi.StringOutput)
}

func (o GetInstanceResultOutput) ManagerUserId() pulumi.StringOutput {
	return o.ApplyT(func(v GetInstanceResult) string { return v.ManagerUserId }).(pulumi.StringOutput)
}

func (o GetInstanceResultOutput) MemberOf() pulumi.StringOutput {
	return o.ApplyT(func(v GetInstanceResult) string { return v.MemberOf }).(pulumi.StringOutput)
}

func (o GetInstanceResultOutput) Password() pulumi.StringOutput {
	return o.ApplyT(func(v GetInstanceResult) string { return v.Password }).(pulumi.StringOutput)
}

func (o GetInstanceResultOutput) PasswordAlgorithm() pulumi.StringOutput {
	return o.ApplyT(func(v GetInstanceResult) string { return v.PasswordAlgorithm }).(pulumi.StringOutput)
}

func (o GetInstanceResultOutput) PasswordChangedAt() pulumi.StringOutput {
	return o.ApplyT(func(v GetInstanceResult) string { return v.PasswordChangedAt }).(pulumi.StringOutput)
}

func (o GetInstanceResultOutput) PasswordConfirmation() pulumi.StringOutput {
	return o.ApplyT(func(v GetInstanceResult) string { return v.PasswordConfirmation }).(pulumi.StringOutput)
}

func (o GetInstanceResultOutput) Phone() pulumi.StringOutput {
	return o.ApplyT(func(v GetInstanceResult) string { return v.Phone }).(pulumi.StringOutput)
}

func (o GetInstanceResultOutput) PreferredLocaleCode() pulumi.StringOutput {
	return o.ApplyT(func(v GetInstanceResult) string { return v.PreferredLocaleCode }).(pulumi.StringOutput)
}

func (o GetInstanceResultOutput) RoleIds() pulumi.IntArrayOutput {
	return o.ApplyT(func(v GetInstanceResult) []int { return v.RoleIds }).(pulumi.IntArrayOutput)
}

func (o GetInstanceResultOutput) Salt() pulumi.StringOutput {
	return o.ApplyT(func(v GetInstanceResult) string { return v.Salt }).(pulumi.StringOutput)
}

func (o GetInstanceResultOutput) SamaccountName() pulumi.StringOutput {
	return o.ApplyT(func(v GetInstanceResult) string { return v.SamaccountName }).(pulumi.StringOutput)
}

func (o GetInstanceResultOutput) State() pulumi.IntOutput {
	return o.ApplyT(func(v GetInstanceResult) int { return v.State }).(pulumi.IntOutput)
}

func (o GetInstanceResultOutput) Status() pulumi.IntOutput {
	return o.ApplyT(func(v GetInstanceResult) int { return v.Status }).(pulumi.IntOutput)
}

func (o GetInstanceResultOutput) Title() pulumi.StringOutput {
	return o.ApplyT(func(v GetInstanceResult) string { return v.Title }).(pulumi.StringOutput)
}

func (o GetInstanceResultOutput) TrustedIdpId() pulumi.IntOutput {
	return o.ApplyT(func(v GetInstanceResult) int { return v.TrustedIdpId }).(pulumi.IntOutput)
}

func (o GetInstanceResultOutput) UpdatedAt() pulumi.StringOutput {
	return o.ApplyT(func(v GetInstanceResult) string { return v.UpdatedAt }).(pulumi.StringOutput)
}

func (o GetInstanceResultOutput) Username() pulumi.StringOutput {
	return o.ApplyT(func(v GetInstanceResult) string { return v.Username }).(pulumi.StringOutput)
}

func (o GetInstanceResultOutput) Userprincipalname() pulumi.StringOutput {
	return o.ApplyT(func(v GetInstanceResult) string { return v.Userprincipalname }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetInstanceResultOutput{})
}
