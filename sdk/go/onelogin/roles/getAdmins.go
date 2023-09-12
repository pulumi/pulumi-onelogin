// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package roles

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-onelogin/sdk/go/onelogin/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

func GetAdmins(ctx *pulumi.Context, args *GetAdminsArgs, opts ...pulumi.InvokeOption) (*GetAdminsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetAdminsResult
	err := ctx.Invoke("onelogin:roles/getAdmins:getAdmins", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getAdmins.
type GetAdminsArgs struct {
	ActivatedAt          *string           `pulumi:"activatedAt"`
	Comment              *string           `pulumi:"comment"`
	Company              *string           `pulumi:"company"`
	CreatedAt            *string           `pulumi:"createdAt"`
	Department           *string           `pulumi:"department"`
	DirectoryId          *int              `pulumi:"directoryId"`
	DistinguishedName    *string           `pulumi:"distinguishedName"`
	Email                *string           `pulumi:"email"`
	ExternalId           *string           `pulumi:"externalId"`
	Filters              []GetAdminsFilter `pulumi:"filters"`
	Firstname            *string           `pulumi:"firstname"`
	GroupId              *int              `pulumi:"groupId"`
	InvalidLoginAttempts *int              `pulumi:"invalidLoginAttempts"`
	InvitationSentAt     *string           `pulumi:"invitationSentAt"`
	LastLogin            *string           `pulumi:"lastLogin"`
	Lastname             *string           `pulumi:"lastname"`
	LockedUntil          *string           `pulumi:"lockedUntil"`
	ManagerAdId          *string           `pulumi:"managerAdId"`
	ManagerUserId        *string           `pulumi:"managerUserId"`
	MemberOf             *string           `pulumi:"memberOf"`
	Password             *string           `pulumi:"password"`
	PasswordAlgorithm    *string           `pulumi:"passwordAlgorithm"`
	PasswordChangedAt    *string           `pulumi:"passwordChangedAt"`
	PasswordConfirmation *string           `pulumi:"passwordConfirmation"`
	Phone                *string           `pulumi:"phone"`
	PreferredLocaleCode  *string           `pulumi:"preferredLocaleCode"`
	RoleIds              []int             `pulumi:"roleIds"`
	RolesId              string            `pulumi:"rolesId"`
	Salt                 *string           `pulumi:"salt"`
	Samaccountname       *string           `pulumi:"samaccountname"`
	State                *int              `pulumi:"state"`
	Status               *int              `pulumi:"status"`
	Title                *string           `pulumi:"title"`
	TrustedIdpId         *int              `pulumi:"trustedIdpId"`
	UpdatedAt            *string           `pulumi:"updatedAt"`
	Username             *string           `pulumi:"username"`
	Userprincipalname    *string           `pulumi:"userprincipalname"`
}

// A collection of values returned by getAdmins.
type GetAdminsResult struct {
	ActivatedAt       string            `pulumi:"activatedAt"`
	Comment           string            `pulumi:"comment"`
	Company           string            `pulumi:"company"`
	CreatedAt         string            `pulumi:"createdAt"`
	Department        string            `pulumi:"department"`
	DirectoryId       int               `pulumi:"directoryId"`
	DistinguishedName string            `pulumi:"distinguishedName"`
	Email             string            `pulumi:"email"`
	ExternalId        string            `pulumi:"externalId"`
	Filters           []GetAdminsFilter `pulumi:"filters"`
	Firstname         string            `pulumi:"firstname"`
	GroupId           int               `pulumi:"groupId"`
	// The provider-assigned unique ID for this managed resource.
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
	RolesId              string `pulumi:"rolesId"`
	Salt                 string `pulumi:"salt"`
	Samaccountname       string `pulumi:"samaccountname"`
	State                int    `pulumi:"state"`
	Status               int    `pulumi:"status"`
	Title                string `pulumi:"title"`
	TrustedIdpId         int    `pulumi:"trustedIdpId"`
	UpdatedAt            string `pulumi:"updatedAt"`
	Username             string `pulumi:"username"`
	Userprincipalname    string `pulumi:"userprincipalname"`
}

func GetAdminsOutput(ctx *pulumi.Context, args GetAdminsOutputArgs, opts ...pulumi.InvokeOption) GetAdminsResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetAdminsResult, error) {
			args := v.(GetAdminsArgs)
			r, err := GetAdmins(ctx, &args, opts...)
			var s GetAdminsResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetAdminsResultOutput)
}

// A collection of arguments for invoking getAdmins.
type GetAdminsOutputArgs struct {
	ActivatedAt          pulumi.StringPtrInput     `pulumi:"activatedAt"`
	Comment              pulumi.StringPtrInput     `pulumi:"comment"`
	Company              pulumi.StringPtrInput     `pulumi:"company"`
	CreatedAt            pulumi.StringPtrInput     `pulumi:"createdAt"`
	Department           pulumi.StringPtrInput     `pulumi:"department"`
	DirectoryId          pulumi.IntPtrInput        `pulumi:"directoryId"`
	DistinguishedName    pulumi.StringPtrInput     `pulumi:"distinguishedName"`
	Email                pulumi.StringPtrInput     `pulumi:"email"`
	ExternalId           pulumi.StringPtrInput     `pulumi:"externalId"`
	Filters              GetAdminsFilterArrayInput `pulumi:"filters"`
	Firstname            pulumi.StringPtrInput     `pulumi:"firstname"`
	GroupId              pulumi.IntPtrInput        `pulumi:"groupId"`
	InvalidLoginAttempts pulumi.IntPtrInput        `pulumi:"invalidLoginAttempts"`
	InvitationSentAt     pulumi.StringPtrInput     `pulumi:"invitationSentAt"`
	LastLogin            pulumi.StringPtrInput     `pulumi:"lastLogin"`
	Lastname             pulumi.StringPtrInput     `pulumi:"lastname"`
	LockedUntil          pulumi.StringPtrInput     `pulumi:"lockedUntil"`
	ManagerAdId          pulumi.StringPtrInput     `pulumi:"managerAdId"`
	ManagerUserId        pulumi.StringPtrInput     `pulumi:"managerUserId"`
	MemberOf             pulumi.StringPtrInput     `pulumi:"memberOf"`
	Password             pulumi.StringPtrInput     `pulumi:"password"`
	PasswordAlgorithm    pulumi.StringPtrInput     `pulumi:"passwordAlgorithm"`
	PasswordChangedAt    pulumi.StringPtrInput     `pulumi:"passwordChangedAt"`
	PasswordConfirmation pulumi.StringPtrInput     `pulumi:"passwordConfirmation"`
	Phone                pulumi.StringPtrInput     `pulumi:"phone"`
	PreferredLocaleCode  pulumi.StringPtrInput     `pulumi:"preferredLocaleCode"`
	RoleIds              pulumi.IntArrayInput      `pulumi:"roleIds"`
	RolesId              pulumi.StringInput        `pulumi:"rolesId"`
	Salt                 pulumi.StringPtrInput     `pulumi:"salt"`
	Samaccountname       pulumi.StringPtrInput     `pulumi:"samaccountname"`
	State                pulumi.IntPtrInput        `pulumi:"state"`
	Status               pulumi.IntPtrInput        `pulumi:"status"`
	Title                pulumi.StringPtrInput     `pulumi:"title"`
	TrustedIdpId         pulumi.IntPtrInput        `pulumi:"trustedIdpId"`
	UpdatedAt            pulumi.StringPtrInput     `pulumi:"updatedAt"`
	Username             pulumi.StringPtrInput     `pulumi:"username"`
	Userprincipalname    pulumi.StringPtrInput     `pulumi:"userprincipalname"`
}

func (GetAdminsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetAdminsArgs)(nil)).Elem()
}

// A collection of values returned by getAdmins.
type GetAdminsResultOutput struct{ *pulumi.OutputState }

func (GetAdminsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetAdminsResult)(nil)).Elem()
}

func (o GetAdminsResultOutput) ToGetAdminsResultOutput() GetAdminsResultOutput {
	return o
}

func (o GetAdminsResultOutput) ToGetAdminsResultOutputWithContext(ctx context.Context) GetAdminsResultOutput {
	return o
}

func (o GetAdminsResultOutput) ToOutput(ctx context.Context) pulumix.Output[GetAdminsResult] {
	return pulumix.Output[GetAdminsResult]{
		OutputState: o.OutputState,
	}
}

func (o GetAdminsResultOutput) ActivatedAt() pulumi.StringOutput {
	return o.ApplyT(func(v GetAdminsResult) string { return v.ActivatedAt }).(pulumi.StringOutput)
}

func (o GetAdminsResultOutput) Comment() pulumi.StringOutput {
	return o.ApplyT(func(v GetAdminsResult) string { return v.Comment }).(pulumi.StringOutput)
}

func (o GetAdminsResultOutput) Company() pulumi.StringOutput {
	return o.ApplyT(func(v GetAdminsResult) string { return v.Company }).(pulumi.StringOutput)
}

func (o GetAdminsResultOutput) CreatedAt() pulumi.StringOutput {
	return o.ApplyT(func(v GetAdminsResult) string { return v.CreatedAt }).(pulumi.StringOutput)
}

func (o GetAdminsResultOutput) Department() pulumi.StringOutput {
	return o.ApplyT(func(v GetAdminsResult) string { return v.Department }).(pulumi.StringOutput)
}

func (o GetAdminsResultOutput) DirectoryId() pulumi.IntOutput {
	return o.ApplyT(func(v GetAdminsResult) int { return v.DirectoryId }).(pulumi.IntOutput)
}

func (o GetAdminsResultOutput) DistinguishedName() pulumi.StringOutput {
	return o.ApplyT(func(v GetAdminsResult) string { return v.DistinguishedName }).(pulumi.StringOutput)
}

func (o GetAdminsResultOutput) Email() pulumi.StringOutput {
	return o.ApplyT(func(v GetAdminsResult) string { return v.Email }).(pulumi.StringOutput)
}

func (o GetAdminsResultOutput) ExternalId() pulumi.StringOutput {
	return o.ApplyT(func(v GetAdminsResult) string { return v.ExternalId }).(pulumi.StringOutput)
}

func (o GetAdminsResultOutput) Filters() GetAdminsFilterArrayOutput {
	return o.ApplyT(func(v GetAdminsResult) []GetAdminsFilter { return v.Filters }).(GetAdminsFilterArrayOutput)
}

func (o GetAdminsResultOutput) Firstname() pulumi.StringOutput {
	return o.ApplyT(func(v GetAdminsResult) string { return v.Firstname }).(pulumi.StringOutput)
}

func (o GetAdminsResultOutput) GroupId() pulumi.IntOutput {
	return o.ApplyT(func(v GetAdminsResult) int { return v.GroupId }).(pulumi.IntOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetAdminsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetAdminsResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetAdminsResultOutput) InvalidLoginAttempts() pulumi.IntOutput {
	return o.ApplyT(func(v GetAdminsResult) int { return v.InvalidLoginAttempts }).(pulumi.IntOutput)
}

func (o GetAdminsResultOutput) InvitationSentAt() pulumi.StringOutput {
	return o.ApplyT(func(v GetAdminsResult) string { return v.InvitationSentAt }).(pulumi.StringOutput)
}

func (o GetAdminsResultOutput) LastLogin() pulumi.StringOutput {
	return o.ApplyT(func(v GetAdminsResult) string { return v.LastLogin }).(pulumi.StringOutput)
}

func (o GetAdminsResultOutput) Lastname() pulumi.StringOutput {
	return o.ApplyT(func(v GetAdminsResult) string { return v.Lastname }).(pulumi.StringOutput)
}

func (o GetAdminsResultOutput) LockedUntil() pulumi.StringOutput {
	return o.ApplyT(func(v GetAdminsResult) string { return v.LockedUntil }).(pulumi.StringOutput)
}

func (o GetAdminsResultOutput) ManagerAdId() pulumi.StringOutput {
	return o.ApplyT(func(v GetAdminsResult) string { return v.ManagerAdId }).(pulumi.StringOutput)
}

func (o GetAdminsResultOutput) ManagerUserId() pulumi.StringOutput {
	return o.ApplyT(func(v GetAdminsResult) string { return v.ManagerUserId }).(pulumi.StringOutput)
}

func (o GetAdminsResultOutput) MemberOf() pulumi.StringOutput {
	return o.ApplyT(func(v GetAdminsResult) string { return v.MemberOf }).(pulumi.StringOutput)
}

func (o GetAdminsResultOutput) Password() pulumi.StringOutput {
	return o.ApplyT(func(v GetAdminsResult) string { return v.Password }).(pulumi.StringOutput)
}

func (o GetAdminsResultOutput) PasswordAlgorithm() pulumi.StringOutput {
	return o.ApplyT(func(v GetAdminsResult) string { return v.PasswordAlgorithm }).(pulumi.StringOutput)
}

func (o GetAdminsResultOutput) PasswordChangedAt() pulumi.StringOutput {
	return o.ApplyT(func(v GetAdminsResult) string { return v.PasswordChangedAt }).(pulumi.StringOutput)
}

func (o GetAdminsResultOutput) PasswordConfirmation() pulumi.StringOutput {
	return o.ApplyT(func(v GetAdminsResult) string { return v.PasswordConfirmation }).(pulumi.StringOutput)
}

func (o GetAdminsResultOutput) Phone() pulumi.StringOutput {
	return o.ApplyT(func(v GetAdminsResult) string { return v.Phone }).(pulumi.StringOutput)
}

func (o GetAdminsResultOutput) PreferredLocaleCode() pulumi.StringOutput {
	return o.ApplyT(func(v GetAdminsResult) string { return v.PreferredLocaleCode }).(pulumi.StringOutput)
}

func (o GetAdminsResultOutput) RoleIds() pulumi.IntArrayOutput {
	return o.ApplyT(func(v GetAdminsResult) []int { return v.RoleIds }).(pulumi.IntArrayOutput)
}

func (o GetAdminsResultOutput) RolesId() pulumi.StringOutput {
	return o.ApplyT(func(v GetAdminsResult) string { return v.RolesId }).(pulumi.StringOutput)
}

func (o GetAdminsResultOutput) Salt() pulumi.StringOutput {
	return o.ApplyT(func(v GetAdminsResult) string { return v.Salt }).(pulumi.StringOutput)
}

func (o GetAdminsResultOutput) Samaccountname() pulumi.StringOutput {
	return o.ApplyT(func(v GetAdminsResult) string { return v.Samaccountname }).(pulumi.StringOutput)
}

func (o GetAdminsResultOutput) State() pulumi.IntOutput {
	return o.ApplyT(func(v GetAdminsResult) int { return v.State }).(pulumi.IntOutput)
}

func (o GetAdminsResultOutput) Status() pulumi.IntOutput {
	return o.ApplyT(func(v GetAdminsResult) int { return v.Status }).(pulumi.IntOutput)
}

func (o GetAdminsResultOutput) Title() pulumi.StringOutput {
	return o.ApplyT(func(v GetAdminsResult) string { return v.Title }).(pulumi.StringOutput)
}

func (o GetAdminsResultOutput) TrustedIdpId() pulumi.IntOutput {
	return o.ApplyT(func(v GetAdminsResult) int { return v.TrustedIdpId }).(pulumi.IntOutput)
}

func (o GetAdminsResultOutput) UpdatedAt() pulumi.StringOutput {
	return o.ApplyT(func(v GetAdminsResult) string { return v.UpdatedAt }).(pulumi.StringOutput)
}

func (o GetAdminsResultOutput) Username() pulumi.StringOutput {
	return o.ApplyT(func(v GetAdminsResult) string { return v.Username }).(pulumi.StringOutput)
}

func (o GetAdminsResultOutput) Userprincipalname() pulumi.StringOutput {
	return o.ApplyT(func(v GetAdminsResult) string { return v.Userprincipalname }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetAdminsResultOutput{})
}
