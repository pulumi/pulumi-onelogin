// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package onelogin

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Returns User resource.
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
// 		_, err := onelogin.LookupUser(ctx, &GetUserArgs{
// 			Username: pulumi.StringRef("timmy.tester"),
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
func LookupUser(ctx *pulumi.Context, args *LookupUserArgs, opts ...pulumi.InvokeOption) (*LookupUserResult, error) {
	var rv LookupUserResult
	err := ctx.Invoke("onelogin:index/getUser:getUser", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getUser.
type LookupUserArgs struct {
	// The user's external_id
	ExternalId *int `pulumi:"externalId"`
	// The user's ID.
	UserId *string `pulumi:"userId"`
	// The user's username.
	Username *string `pulumi:"username"`
}

// A collection of values returned by getUser.
type LookupUserResult struct {
	// A comment about the user
	Comment string `pulumi:"comment"`
	// The user's company
	Company          string            `pulumi:"company"`
	CustomAttributes map[string]string `pulumi:"customAttributes"`
	// The user's department
	Department string `pulumi:"department"`
	// The user's directory_id
	DirectoryId int `pulumi:"directoryId"`
	// The user's distinguished name
	DistinguishedName string `pulumi:"distinguishedName"`
	// The user's email.
	Email string `pulumi:"email"`
	// The user's external_id
	ExternalId int `pulumi:"externalId"`
	// The user's first name
	Firstname string `pulumi:"firstname"`
	// The user's group_id
	GroupId int `pulumi:"groupId"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// The user's last name
	Lastname string `pulumi:"lastname"`
	// The user's manager_ad_id
	ManagerAdId int `pulumi:"managerAdId"`
	// The user's manager_user_id
	ManagerUserId int `pulumi:"managerUserId"`
	// The user's member_of
	MemberOf string `pulumi:"memberOf"`
	// The user's phone number
	Phone string `pulumi:"phone"`
	// The user's samaccount name
	Samaccountname string `pulumi:"samaccountname"`
	// The user's state. Must be one of `0: Unapproved` `1: Approved` `2: Rejected` `3: Unlicensed`
	State int `pulumi:"state"`
	// The user's status. Must be one of `0: Unactivated` `1: Active` `2: Suspended` `3: Locked` `4: Password expired` `5: Awaiting password reset` `7: Password Pending` `8: Security questions required`
	Status int `pulumi:"status"`
	// The user's title
	Title string `pulumi:"title"`
	// The user's trusted_idp_id
	TrustedIdpId int     `pulumi:"trustedIdpId"`
	UserId       *string `pulumi:"userId"`
	Username     string  `pulumi:"username"`
	// The user's user principal name
	Userprincipalname string `pulumi:"userprincipalname"`
}

func LookupUserOutput(ctx *pulumi.Context, args LookupUserOutputArgs, opts ...pulumi.InvokeOption) LookupUserResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupUserResult, error) {
			args := v.(LookupUserArgs)
			r, err := LookupUser(ctx, &args, opts...)
			var s LookupUserResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupUserResultOutput)
}

// A collection of arguments for invoking getUser.
type LookupUserOutputArgs struct {
	// The user's external_id
	ExternalId pulumi.IntPtrInput `pulumi:"externalId"`
	// The user's ID.
	UserId pulumi.StringPtrInput `pulumi:"userId"`
	// The user's username.
	Username pulumi.StringPtrInput `pulumi:"username"`
}

func (LookupUserOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupUserArgs)(nil)).Elem()
}

// A collection of values returned by getUser.
type LookupUserResultOutput struct{ *pulumi.OutputState }

func (LookupUserResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupUserResult)(nil)).Elem()
}

func (o LookupUserResultOutput) ToLookupUserResultOutput() LookupUserResultOutput {
	return o
}

func (o LookupUserResultOutput) ToLookupUserResultOutputWithContext(ctx context.Context) LookupUserResultOutput {
	return o
}

// A comment about the user
func (o LookupUserResultOutput) Comment() pulumi.StringOutput {
	return o.ApplyT(func(v LookupUserResult) string { return v.Comment }).(pulumi.StringOutput)
}

// The user's company
func (o LookupUserResultOutput) Company() pulumi.StringOutput {
	return o.ApplyT(func(v LookupUserResult) string { return v.Company }).(pulumi.StringOutput)
}

func (o LookupUserResultOutput) CustomAttributes() pulumi.StringMapOutput {
	return o.ApplyT(func(v LookupUserResult) map[string]string { return v.CustomAttributes }).(pulumi.StringMapOutput)
}

// The user's department
func (o LookupUserResultOutput) Department() pulumi.StringOutput {
	return o.ApplyT(func(v LookupUserResult) string { return v.Department }).(pulumi.StringOutput)
}

// The user's directory_id
func (o LookupUserResultOutput) DirectoryId() pulumi.IntOutput {
	return o.ApplyT(func(v LookupUserResult) int { return v.DirectoryId }).(pulumi.IntOutput)
}

// The user's distinguished name
func (o LookupUserResultOutput) DistinguishedName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupUserResult) string { return v.DistinguishedName }).(pulumi.StringOutput)
}

// The user's email.
func (o LookupUserResultOutput) Email() pulumi.StringOutput {
	return o.ApplyT(func(v LookupUserResult) string { return v.Email }).(pulumi.StringOutput)
}

// The user's external_id
func (o LookupUserResultOutput) ExternalId() pulumi.IntOutput {
	return o.ApplyT(func(v LookupUserResult) int { return v.ExternalId }).(pulumi.IntOutput)
}

// The user's first name
func (o LookupUserResultOutput) Firstname() pulumi.StringOutput {
	return o.ApplyT(func(v LookupUserResult) string { return v.Firstname }).(pulumi.StringOutput)
}

// The user's group_id
func (o LookupUserResultOutput) GroupId() pulumi.IntOutput {
	return o.ApplyT(func(v LookupUserResult) int { return v.GroupId }).(pulumi.IntOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupUserResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupUserResult) string { return v.Id }).(pulumi.StringOutput)
}

// The user's last name
func (o LookupUserResultOutput) Lastname() pulumi.StringOutput {
	return o.ApplyT(func(v LookupUserResult) string { return v.Lastname }).(pulumi.StringOutput)
}

// The user's manager_ad_id
func (o LookupUserResultOutput) ManagerAdId() pulumi.IntOutput {
	return o.ApplyT(func(v LookupUserResult) int { return v.ManagerAdId }).(pulumi.IntOutput)
}

// The user's manager_user_id
func (o LookupUserResultOutput) ManagerUserId() pulumi.IntOutput {
	return o.ApplyT(func(v LookupUserResult) int { return v.ManagerUserId }).(pulumi.IntOutput)
}

// The user's member_of
func (o LookupUserResultOutput) MemberOf() pulumi.StringOutput {
	return o.ApplyT(func(v LookupUserResult) string { return v.MemberOf }).(pulumi.StringOutput)
}

// The user's phone number
func (o LookupUserResultOutput) Phone() pulumi.StringOutput {
	return o.ApplyT(func(v LookupUserResult) string { return v.Phone }).(pulumi.StringOutput)
}

// The user's samaccount name
func (o LookupUserResultOutput) Samaccountname() pulumi.StringOutput {
	return o.ApplyT(func(v LookupUserResult) string { return v.Samaccountname }).(pulumi.StringOutput)
}

// The user's state. Must be one of `0: Unapproved` `1: Approved` `2: Rejected` `3: Unlicensed`
func (o LookupUserResultOutput) State() pulumi.IntOutput {
	return o.ApplyT(func(v LookupUserResult) int { return v.State }).(pulumi.IntOutput)
}

// The user's status. Must be one of `0: Unactivated` `1: Active` `2: Suspended` `3: Locked` `4: Password expired` `5: Awaiting password reset` `7: Password Pending` `8: Security questions required`
func (o LookupUserResultOutput) Status() pulumi.IntOutput {
	return o.ApplyT(func(v LookupUserResult) int { return v.Status }).(pulumi.IntOutput)
}

// The user's title
func (o LookupUserResultOutput) Title() pulumi.StringOutput {
	return o.ApplyT(func(v LookupUserResult) string { return v.Title }).(pulumi.StringOutput)
}

// The user's trusted_idp_id
func (o LookupUserResultOutput) TrustedIdpId() pulumi.IntOutput {
	return o.ApplyT(func(v LookupUserResult) int { return v.TrustedIdpId }).(pulumi.IntOutput)
}

func (o LookupUserResultOutput) UserId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupUserResult) *string { return v.UserId }).(pulumi.StringPtrOutput)
}

func (o LookupUserResultOutput) Username() pulumi.StringOutput {
	return o.ApplyT(func(v LookupUserResult) string { return v.Username }).(pulumi.StringOutput)
}

// The user's user principal name
func (o LookupUserResultOutput) Userprincipalname() pulumi.StringOutput {
	return o.ApplyT(func(v LookupUserResult) string { return v.Userprincipalname }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupUserResultOutput{})
}
