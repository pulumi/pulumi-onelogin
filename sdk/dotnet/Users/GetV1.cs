// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Onelogin.Users
{
    public static class GetV1
    {
        public static Task<GetV1Result> InvokeAsync(GetV1Args? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetV1Result>("onelogin:users/getV1:getV1", args ?? new GetV1Args(), options.WithDefaults());

        public static Output<GetV1Result> Invoke(GetV1InvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetV1Result>("onelogin:users/getV1:getV1", args ?? new GetV1InvokeArgs(), options.WithDefaults());
    }


    public sealed class GetV1Args : global::Pulumi.InvokeArgs
    {
        [Input("activatedAt")]
        public string? ActivatedAt { get; set; }

        [Input("comment")]
        public string? Comment { get; set; }

        [Input("company")]
        public string? Company { get; set; }

        [Input("createdAt")]
        public string? CreatedAt { get; set; }

        [Input("department")]
        public string? Department { get; set; }

        [Input("directoryId")]
        public int? DirectoryId { get; set; }

        [Input("distinguishedName")]
        public string? DistinguishedName { get; set; }

        [Input("email")]
        public string? Email { get; set; }

        [Input("externalId")]
        public string? ExternalId { get; set; }

        [Input("filters")]
        private List<Inputs.GetV1FilterArgs>? _filters;
        public List<Inputs.GetV1FilterArgs> Filters
        {
            get => _filters ?? (_filters = new List<Inputs.GetV1FilterArgs>());
            set => _filters = value;
        }

        [Input("firstname")]
        public string? Firstname { get; set; }

        [Input("groupId")]
        public int? GroupId { get; set; }

        [Input("invalidLoginAttempts")]
        public int? InvalidLoginAttempts { get; set; }

        [Input("invitationSentAt")]
        public string? InvitationSentAt { get; set; }

        [Input("lastLogin")]
        public string? LastLogin { get; set; }

        [Input("lastname")]
        public string? Lastname { get; set; }

        [Input("lockedUntil")]
        public string? LockedUntil { get; set; }

        [Input("managerAdId")]
        public string? ManagerAdId { get; set; }

        [Input("managerUserId")]
        public string? ManagerUserId { get; set; }

        [Input("memberOf")]
        public string? MemberOf { get; set; }

        [Input("password")]
        public string? Password { get; set; }

        [Input("passwordAlgorithm")]
        public string? PasswordAlgorithm { get; set; }

        [Input("passwordChangedAt")]
        public string? PasswordChangedAt { get; set; }

        [Input("passwordConfirmation")]
        public string? PasswordConfirmation { get; set; }

        [Input("phone")]
        public string? Phone { get; set; }

        [Input("preferredLocaleCode")]
        public string? PreferredLocaleCode { get; set; }

        [Input("roleIds")]
        private List<int>? _roleIds;
        public List<int> RoleIds
        {
            get => _roleIds ?? (_roleIds = new List<int>());
            set => _roleIds = value;
        }

        [Input("salt")]
        public string? Salt { get; set; }

        [Input("samaccountname")]
        public string? Samaccountname { get; set; }

        [Input("state")]
        public int? State { get; set; }

        [Input("status")]
        public int? Status { get; set; }

        [Input("title")]
        public string? Title { get; set; }

        [Input("trustedIdpId")]
        public int? TrustedIdpId { get; set; }

        [Input("updatedAt")]
        public string? UpdatedAt { get; set; }

        [Input("username")]
        public string? Username { get; set; }

        [Input("userprincipalname")]
        public string? Userprincipalname { get; set; }

        public GetV1Args()
        {
        }
        public static new GetV1Args Empty => new GetV1Args();
    }

    public sealed class GetV1InvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("activatedAt")]
        public Input<string>? ActivatedAt { get; set; }

        [Input("comment")]
        public Input<string>? Comment { get; set; }

        [Input("company")]
        public Input<string>? Company { get; set; }

        [Input("createdAt")]
        public Input<string>? CreatedAt { get; set; }

        [Input("department")]
        public Input<string>? Department { get; set; }

        [Input("directoryId")]
        public Input<int>? DirectoryId { get; set; }

        [Input("distinguishedName")]
        public Input<string>? DistinguishedName { get; set; }

        [Input("email")]
        public Input<string>? Email { get; set; }

        [Input("externalId")]
        public Input<string>? ExternalId { get; set; }

        [Input("filters")]
        private InputList<Inputs.GetV1FilterInputArgs>? _filters;
        public InputList<Inputs.GetV1FilterInputArgs> Filters
        {
            get => _filters ?? (_filters = new InputList<Inputs.GetV1FilterInputArgs>());
            set => _filters = value;
        }

        [Input("firstname")]
        public Input<string>? Firstname { get; set; }

        [Input("groupId")]
        public Input<int>? GroupId { get; set; }

        [Input("invalidLoginAttempts")]
        public Input<int>? InvalidLoginAttempts { get; set; }

        [Input("invitationSentAt")]
        public Input<string>? InvitationSentAt { get; set; }

        [Input("lastLogin")]
        public Input<string>? LastLogin { get; set; }

        [Input("lastname")]
        public Input<string>? Lastname { get; set; }

        [Input("lockedUntil")]
        public Input<string>? LockedUntil { get; set; }

        [Input("managerAdId")]
        public Input<string>? ManagerAdId { get; set; }

        [Input("managerUserId")]
        public Input<string>? ManagerUserId { get; set; }

        [Input("memberOf")]
        public Input<string>? MemberOf { get; set; }

        [Input("password")]
        public Input<string>? Password { get; set; }

        [Input("passwordAlgorithm")]
        public Input<string>? PasswordAlgorithm { get; set; }

        [Input("passwordChangedAt")]
        public Input<string>? PasswordChangedAt { get; set; }

        [Input("passwordConfirmation")]
        public Input<string>? PasswordConfirmation { get; set; }

        [Input("phone")]
        public Input<string>? Phone { get; set; }

        [Input("preferredLocaleCode")]
        public Input<string>? PreferredLocaleCode { get; set; }

        [Input("roleIds")]
        private InputList<int>? _roleIds;
        public InputList<int> RoleIds
        {
            get => _roleIds ?? (_roleIds = new InputList<int>());
            set => _roleIds = value;
        }

        [Input("salt")]
        public Input<string>? Salt { get; set; }

        [Input("samaccountname")]
        public Input<string>? Samaccountname { get; set; }

        [Input("state")]
        public Input<int>? State { get; set; }

        [Input("status")]
        public Input<int>? Status { get; set; }

        [Input("title")]
        public Input<string>? Title { get; set; }

        [Input("trustedIdpId")]
        public Input<int>? TrustedIdpId { get; set; }

        [Input("updatedAt")]
        public Input<string>? UpdatedAt { get; set; }

        [Input("username")]
        public Input<string>? Username { get; set; }

        [Input("userprincipalname")]
        public Input<string>? Userprincipalname { get; set; }

        public GetV1InvokeArgs()
        {
        }
        public static new GetV1InvokeArgs Empty => new GetV1InvokeArgs();
    }


    [OutputType]
    public sealed class GetV1Result
    {
        public readonly string ActivatedAt;
        public readonly string Comment;
        public readonly string Company;
        public readonly string CreatedAt;
        public readonly string Department;
        public readonly int DirectoryId;
        public readonly string DistinguishedName;
        public readonly string Email;
        public readonly string ExternalId;
        public readonly ImmutableArray<Outputs.GetV1FilterResult> Filters;
        public readonly string Firstname;
        public readonly int GroupId;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly int InvalidLoginAttempts;
        public readonly string InvitationSentAt;
        public readonly string LastLogin;
        public readonly string Lastname;
        public readonly string LockedUntil;
        public readonly string ManagerAdId;
        public readonly string ManagerUserId;
        public readonly string MemberOf;
        public readonly string Password;
        public readonly string PasswordAlgorithm;
        public readonly string PasswordChangedAt;
        public readonly string PasswordConfirmation;
        public readonly string Phone;
        public readonly string PreferredLocaleCode;
        public readonly ImmutableArray<int> RoleIds;
        public readonly string Salt;
        public readonly string Samaccountname;
        public readonly int State;
        public readonly int Status;
        public readonly string Title;
        public readonly int TrustedIdpId;
        public readonly string UpdatedAt;
        public readonly string Username;
        public readonly string Userprincipalname;

        [OutputConstructor]
        private GetV1Result(
            string activatedAt,

            string comment,

            string company,

            string createdAt,

            string department,

            int directoryId,

            string distinguishedName,

            string email,

            string externalId,

            ImmutableArray<Outputs.GetV1FilterResult> filters,

            string firstname,

            int groupId,

            string id,

            int invalidLoginAttempts,

            string invitationSentAt,

            string lastLogin,

            string lastname,

            string lockedUntil,

            string managerAdId,

            string managerUserId,

            string memberOf,

            string password,

            string passwordAlgorithm,

            string passwordChangedAt,

            string passwordConfirmation,

            string phone,

            string preferredLocaleCode,

            ImmutableArray<int> roleIds,

            string salt,

            string samaccountname,

            int state,

            int status,

            string title,

            int trustedIdpId,

            string updatedAt,

            string username,

            string userprincipalname)
        {
            ActivatedAt = activatedAt;
            Comment = comment;
            Company = company;
            CreatedAt = createdAt;
            Department = department;
            DirectoryId = directoryId;
            DistinguishedName = distinguishedName;
            Email = email;
            ExternalId = externalId;
            Filters = filters;
            Firstname = firstname;
            GroupId = groupId;
            Id = id;
            InvalidLoginAttempts = invalidLoginAttempts;
            InvitationSentAt = invitationSentAt;
            LastLogin = lastLogin;
            Lastname = lastname;
            LockedUntil = lockedUntil;
            ManagerAdId = managerAdId;
            ManagerUserId = managerUserId;
            MemberOf = memberOf;
            Password = password;
            PasswordAlgorithm = passwordAlgorithm;
            PasswordChangedAt = passwordChangedAt;
            PasswordConfirmation = passwordConfirmation;
            Phone = phone;
            PreferredLocaleCode = preferredLocaleCode;
            RoleIds = roleIds;
            Salt = salt;
            Samaccountname = samaccountname;
            State = state;
            Status = status;
            Title = title;
            TrustedIdpId = trustedIdpId;
            UpdatedAt = updatedAt;
            Username = username;
            Userprincipalname = userprincipalname;
        }
    }
}
