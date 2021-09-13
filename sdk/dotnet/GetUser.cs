// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Onelogin
{
    public static class GetUser
    {
        public static Task<GetUserResult> InvokeAsync(GetUserArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetUserResult>("onelogin:index/getUser:getUser", args ?? new GetUserArgs(), options.WithVersion());
    }


    public sealed class GetUserArgs : Pulumi.InvokeArgs
    {
        [Input("externalId")]
        public int? ExternalId { get; set; }

        [Input("userId")]
        public string? UserId { get; set; }

        [Input("username")]
        public string? Username { get; set; }

        public GetUserArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetUserResult
    {
        public readonly string Comment;
        public readonly string Company;
        public readonly ImmutableDictionary<string, string> CustomAttributes;
        public readonly string Department;
        public readonly int DirectoryId;
        public readonly string DistinguishedName;
        public readonly string Email;
        public readonly int ExternalId;
        public readonly string Firstname;
        public readonly int GroupId;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string Lastname;
        public readonly int ManagerAdId;
        public readonly int ManagerUserId;
        public readonly string MemberOf;
        public readonly string Phone;
        public readonly string Samaccountname;
        public readonly int State;
        public readonly int Status;
        public readonly string Title;
        public readonly int TrustedIdpId;
        public readonly string? UserId;
        public readonly string Username;
        public readonly string Userprincipalname;

        [OutputConstructor]
        private GetUserResult(
            string comment,

            string company,

            ImmutableDictionary<string, string> customAttributes,

            string department,

            int directoryId,

            string distinguishedName,

            string email,

            int externalId,

            string firstname,

            int groupId,

            string id,

            string lastname,

            int managerAdId,

            int managerUserId,

            string memberOf,

            string phone,

            string samaccountname,

            int state,

            int status,

            string title,

            int trustedIdpId,

            string? userId,

            string username,

            string userprincipalname)
        {
            Comment = comment;
            Company = company;
            CustomAttributes = customAttributes;
            Department = department;
            DirectoryId = directoryId;
            DistinguishedName = distinguishedName;
            Email = email;
            ExternalId = externalId;
            Firstname = firstname;
            GroupId = groupId;
            Id = id;
            Lastname = lastname;
            ManagerAdId = managerAdId;
            ManagerUserId = managerUserId;
            MemberOf = memberOf;
            Phone = phone;
            Samaccountname = samaccountname;
            State = state;
            Status = status;
            Title = title;
            TrustedIdpId = trustedIdpId;
            UserId = userId;
            Username = username;
            Userprincipalname = userprincipalname;
        }
    }
}
