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

func GetUsers(ctx *pulumi.Context, args *GetUsersArgs, opts ...pulumi.InvokeOption) (*GetUsersResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetUsersResult
	err := ctx.Invoke("onelogin:roles/getUsers:getUsers", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getUsers.
type GetUsersArgs struct {
	ActivatedAt          *string          `pulumi:"activatedAt"`
	Comment              *string          `pulumi:"comment"`
	Company              *string          `pulumi:"company"`
	CreatedAt            *string          `pulumi:"createdAt"`
	Department           *string          `pulumi:"department"`
	DirectoryId          *int             `pulumi:"directoryId"`
	DistinguishedName    *string          `pulumi:"distinguishedName"`
	Email                *string          `pulumi:"email"`
	ExternalId           *string          `pulumi:"externalId"`
	Filters              []GetUsersFilter `pulumi:"filters"`
	Firstname            *string          `pulumi:"firstname"`
	GroupId              *int             `pulumi:"groupId"`
	InvalidLoginAttempts *int             `pulumi:"invalidLoginAttempts"`
	InvitationSentAt     *string          `pulumi:"invitationSentAt"`
	LastLogin            *string          `pulumi:"lastLogin"`
	Lastname             *string          `pulumi:"lastname"`
	LockedUntil          *string          `pulumi:"lockedUntil"`
	ManagerAdId          *string          `pulumi:"managerAdId"`
	ManagerUserId        *string          `pulumi:"managerUserId"`
	MemberOf             *string          `pulumi:"memberOf"`
	Password             *string          `pulumi:"password"`
	PasswordAlgorithm    *string          `pulumi:"passwordAlgorithm"`
	PasswordChangedAt    *string          `pulumi:"passwordChangedAt"`
	PasswordConfirmation *string          `pulumi:"passwordConfirmation"`
	Phone                *string          `pulumi:"phone"`
	PreferredLocaleCode  *string          `pulumi:"preferredLocaleCode"`
	RoleIds              []int            `pulumi:"roleIds"`
	RolesId              string           `pulumi:"rolesId"`
	Salt                 *string          `pulumi:"salt"`
	Samaccountname       *string          `pulumi:"samaccountname"`
	State                *int             `pulumi:"state"`
	Status               *int             `pulumi:"status"`
	Title                *string          `pulumi:"title"`
	TrustedIdpId         *int             `pulumi:"trustedIdpId"`
	UpdatedAt            *string          `pulumi:"updatedAt"`
	Username             *string          `pulumi:"username"`
	Userprincipalname    *string          `pulumi:"userprincipalname"`
}

// A collection of values returned by getUsers.
type GetUsersResult struct {
	ActivatedAt       string           `pulumi:"activatedAt"`
	Comment           string           `pulumi:"comment"`
	Company           string           `pulumi:"company"`
	CreatedAt         string           `pulumi:"createdAt"`
	Department        string           `pulumi:"department"`
	DirectoryId       int              `pulumi:"directoryId"`
	DistinguishedName string           `pulumi:"distinguishedName"`
	Email             string           `pulumi:"email"`
	ExternalId        string           `pulumi:"externalId"`
	Filters           []GetUsersFilter `pulumi:"filters"`
	Firstname         string           `pulumi:"firstname"`
	GroupId           int              `pulumi:"groupId"`
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

func GetUsersOutput(ctx *pulumi.Context, args GetUsersOutputArgs, opts ...pulumi.InvokeOption) GetUsersResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetUsersResult, error) {
			args := v.(GetUsersArgs)
			r, err := GetUsers(ctx, &args, opts...)
			var s GetUsersResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetUsersResultOutput)
}

// A collection of arguments for invoking getUsers.
type GetUsersOutputArgs struct {
	ActivatedAt          pulumi.StringPtrInput    `pulumi:"activatedAt"`
	Comment              pulumi.StringPtrInput    `pulumi:"comment"`
	Company              pulumi.StringPtrInput    `pulumi:"company"`
	CreatedAt            pulumi.StringPtrInput    `pulumi:"createdAt"`
	Department           pulumi.StringPtrInput    `pulumi:"department"`
	DirectoryId          pulumi.IntPtrInput       `pulumi:"directoryId"`
	DistinguishedName    pulumi.StringPtrInput    `pulumi:"distinguishedName"`
	Email                pulumi.StringPtrInput    `pulumi:"email"`
	ExternalId           pulumi.StringPtrInput    `pulumi:"externalId"`
	Filters              GetUsersFilterArrayInput `pulumi:"filters"`
	Firstname            pulumi.StringPtrInput    `pulumi:"firstname"`
	GroupId              pulumi.IntPtrInput       `pulumi:"groupId"`
	InvalidLoginAttempts pulumi.IntPtrInput       `pulumi:"invalidLoginAttempts"`
	InvitationSentAt     pulumi.StringPtrInput    `pulumi:"invitationSentAt"`
	LastLogin            pulumi.StringPtrInput    `pulumi:"lastLogin"`
	Lastname             pulumi.StringPtrInput    `pulumi:"lastname"`
	LockedUntil          pulumi.StringPtrInput    `pulumi:"lockedUntil"`
	ManagerAdId          pulumi.StringPtrInput    `pulumi:"managerAdId"`
	ManagerUserId        pulumi.StringPtrInput    `pulumi:"managerUserId"`
	MemberOf             pulumi.StringPtrInput    `pulumi:"memberOf"`
	Password             pulumi.StringPtrInput    `pulumi:"password"`
	PasswordAlgorithm    pulumi.StringPtrInput    `pulumi:"passwordAlgorithm"`
	PasswordChangedAt    pulumi.StringPtrInput    `pulumi:"passwordChangedAt"`
	PasswordConfirmation pulumi.StringPtrInput    `pulumi:"passwordConfirmation"`
	Phone                pulumi.StringPtrInput    `pulumi:"phone"`
	PreferredLocaleCode  pulumi.StringPtrInput    `pulumi:"preferredLocaleCode"`
	RoleIds              pulumi.IntArrayInput     `pulumi:"roleIds"`
	RolesId              pulumi.StringInput       `pulumi:"rolesId"`
	Salt                 pulumi.StringPtrInput    `pulumi:"salt"`
	Samaccountname       pulumi.StringPtrInput    `pulumi:"samaccountname"`
	State                pulumi.IntPtrInput       `pulumi:"state"`
	Status               pulumi.IntPtrInput       `pulumi:"status"`
	Title                pulumi.StringPtrInput    `pulumi:"title"`
	TrustedIdpId         pulumi.IntPtrInput       `pulumi:"trustedIdpId"`
	UpdatedAt            pulumi.StringPtrInput    `pulumi:"updatedAt"`
	Username             pulumi.StringPtrInput    `pulumi:"username"`
	Userprincipalname    pulumi.StringPtrInput    `pulumi:"userprincipalname"`
}

func (GetUsersOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetUsersArgs)(nil)).Elem()
}

// A collection of values returned by getUsers.
type GetUsersResultOutput struct{ *pulumi.OutputState }

func (GetUsersResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetUsersResult)(nil)).Elem()
}

func (o GetUsersResultOutput) ToGetUsersResultOutput() GetUsersResultOutput {
	return o
}

func (o GetUsersResultOutput) ToGetUsersResultOutputWithContext(ctx context.Context) GetUsersResultOutput {
	return o
}

func (o GetUsersResultOutput) ToOutput(ctx context.Context) pulumix.Output[GetUsersResult] {
	return pulumix.Output[GetUsersResult]{
		OutputState: o.OutputState,
	}
}

func (o GetUsersResultOutput) ActivatedAt() pulumi.StringOutput {
	return o.ApplyT(func(v GetUsersResult) string { return v.ActivatedAt }).(pulumi.StringOutput)
}

func (o GetUsersResultOutput) Comment() pulumi.StringOutput {
	return o.ApplyT(func(v GetUsersResult) string { return v.Comment }).(pulumi.StringOutput)
}

func (o GetUsersResultOutput) Company() pulumi.StringOutput {
	return o.ApplyT(func(v GetUsersResult) string { return v.Company }).(pulumi.StringOutput)
}

func (o GetUsersResultOutput) CreatedAt() pulumi.StringOutput {
	return o.ApplyT(func(v GetUsersResult) string { return v.CreatedAt }).(pulumi.StringOutput)
}

func (o GetUsersResultOutput) Department() pulumi.StringOutput {
	return o.ApplyT(func(v GetUsersResult) string { return v.Department }).(pulumi.StringOutput)
}

func (o GetUsersResultOutput) DirectoryId() pulumi.IntOutput {
	return o.ApplyT(func(v GetUsersResult) int { return v.DirectoryId }).(pulumi.IntOutput)
}

func (o GetUsersResultOutput) DistinguishedName() pulumi.StringOutput {
	return o.ApplyT(func(v GetUsersResult) string { return v.DistinguishedName }).(pulumi.StringOutput)
}

func (o GetUsersResultOutput) Email() pulumi.StringOutput {
	return o.ApplyT(func(v GetUsersResult) string { return v.Email }).(pulumi.StringOutput)
}

func (o GetUsersResultOutput) ExternalId() pulumi.StringOutput {
	return o.ApplyT(func(v GetUsersResult) string { return v.ExternalId }).(pulumi.StringOutput)
}

func (o GetUsersResultOutput) Filters() GetUsersFilterArrayOutput {
	return o.ApplyT(func(v GetUsersResult) []GetUsersFilter { return v.Filters }).(GetUsersFilterArrayOutput)
}

func (o GetUsersResultOutput) Firstname() pulumi.StringOutput {
	return o.ApplyT(func(v GetUsersResult) string { return v.Firstname }).(pulumi.StringOutput)
}

func (o GetUsersResultOutput) GroupId() pulumi.IntOutput {
	return o.ApplyT(func(v GetUsersResult) int { return v.GroupId }).(pulumi.IntOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetUsersResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetUsersResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetUsersResultOutput) InvalidLoginAttempts() pulumi.IntOutput {
	return o.ApplyT(func(v GetUsersResult) int { return v.InvalidLoginAttempts }).(pulumi.IntOutput)
}

func (o GetUsersResultOutput) InvitationSentAt() pulumi.StringOutput {
	return o.ApplyT(func(v GetUsersResult) string { return v.InvitationSentAt }).(pulumi.StringOutput)
}

func (o GetUsersResultOutput) LastLogin() pulumi.StringOutput {
	return o.ApplyT(func(v GetUsersResult) string { return v.LastLogin }).(pulumi.StringOutput)
}

func (o GetUsersResultOutput) Lastname() pulumi.StringOutput {
	return o.ApplyT(func(v GetUsersResult) string { return v.Lastname }).(pulumi.StringOutput)
}

func (o GetUsersResultOutput) LockedUntil() pulumi.StringOutput {
	return o.ApplyT(func(v GetUsersResult) string { return v.LockedUntil }).(pulumi.StringOutput)
}

func (o GetUsersResultOutput) ManagerAdId() pulumi.StringOutput {
	return o.ApplyT(func(v GetUsersResult) string { return v.ManagerAdId }).(pulumi.StringOutput)
}

func (o GetUsersResultOutput) ManagerUserId() pulumi.StringOutput {
	return o.ApplyT(func(v GetUsersResult) string { return v.ManagerUserId }).(pulumi.StringOutput)
}

func (o GetUsersResultOutput) MemberOf() pulumi.StringOutput {
	return o.ApplyT(func(v GetUsersResult) string { return v.MemberOf }).(pulumi.StringOutput)
}

func (o GetUsersResultOutput) Password() pulumi.StringOutput {
	return o.ApplyT(func(v GetUsersResult) string { return v.Password }).(pulumi.StringOutput)
}

func (o GetUsersResultOutput) PasswordAlgorithm() pulumi.StringOutput {
	return o.ApplyT(func(v GetUsersResult) string { return v.PasswordAlgorithm }).(pulumi.StringOutput)
}

func (o GetUsersResultOutput) PasswordChangedAt() pulumi.StringOutput {
	return o.ApplyT(func(v GetUsersResult) string { return v.PasswordChangedAt }).(pulumi.StringOutput)
}

func (o GetUsersResultOutput) PasswordConfirmation() pulumi.StringOutput {
	return o.ApplyT(func(v GetUsersResult) string { return v.PasswordConfirmation }).(pulumi.StringOutput)
}

func (o GetUsersResultOutput) Phone() pulumi.StringOutput {
	return o.ApplyT(func(v GetUsersResult) string { return v.Phone }).(pulumi.StringOutput)
}

func (o GetUsersResultOutput) PreferredLocaleCode() pulumi.StringOutput {
	return o.ApplyT(func(v GetUsersResult) string { return v.PreferredLocaleCode }).(pulumi.StringOutput)
}

func (o GetUsersResultOutput) RoleIds() pulumi.IntArrayOutput {
	return o.ApplyT(func(v GetUsersResult) []int { return v.RoleIds }).(pulumi.IntArrayOutput)
}

func (o GetUsersResultOutput) RolesId() pulumi.StringOutput {
	return o.ApplyT(func(v GetUsersResult) string { return v.RolesId }).(pulumi.StringOutput)
}

func (o GetUsersResultOutput) Salt() pulumi.StringOutput {
	return o.ApplyT(func(v GetUsersResult) string { return v.Salt }).(pulumi.StringOutput)
}

func (o GetUsersResultOutput) Samaccountname() pulumi.StringOutput {
	return o.ApplyT(func(v GetUsersResult) string { return v.Samaccountname }).(pulumi.StringOutput)
}

func (o GetUsersResultOutput) State() pulumi.IntOutput {
	return o.ApplyT(func(v GetUsersResult) int { return v.State }).(pulumi.IntOutput)
}

func (o GetUsersResultOutput) Status() pulumi.IntOutput {
	return o.ApplyT(func(v GetUsersResult) int { return v.Status }).(pulumi.IntOutput)
}

func (o GetUsersResultOutput) Title() pulumi.StringOutput {
	return o.ApplyT(func(v GetUsersResult) string { return v.Title }).(pulumi.StringOutput)
}

func (o GetUsersResultOutput) TrustedIdpId() pulumi.IntOutput {
	return o.ApplyT(func(v GetUsersResult) int { return v.TrustedIdpId }).(pulumi.IntOutput)
}

func (o GetUsersResultOutput) UpdatedAt() pulumi.StringOutput {
	return o.ApplyT(func(v GetUsersResult) string { return v.UpdatedAt }).(pulumi.StringOutput)
}

func (o GetUsersResultOutput) Username() pulumi.StringOutput {
	return o.ApplyT(func(v GetUsersResult) string { return v.Username }).(pulumi.StringOutput)
}

func (o GetUsersResultOutput) Userprincipalname() pulumi.StringOutput {
	return o.ApplyT(func(v GetUsersResult) string { return v.Userprincipalname }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetUsersResultOutput{})
}
