// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Onelogin
{
    public static class GetUsers
    {
        /// <summary>
        /// Returns User IDs matching the given attributes.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using Pulumi;
        /// using Onelogin = Pulumi.Onelogin;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var example = Output.Create(Onelogin.GetUsers.InvokeAsync(new Onelogin.GetUsersArgs
        ///         {
        ///             Firstname = "tom",
        ///         }));
        ///     }
        /// 
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetUsersResult> InvokeAsync(GetUsersArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetUsersResult>("onelogin:index/getUsers:getUsers", args ?? new GetUsersArgs(), options.WithDefaults());

        /// <summary>
        /// Returns User IDs matching the given attributes.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using Pulumi;
        /// using Onelogin = Pulumi.Onelogin;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var example = Output.Create(Onelogin.GetUsers.InvokeAsync(new Onelogin.GetUsersArgs
        ///         {
        ///             Firstname = "tom",
        ///         }));
        ///     }
        /// 
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetUsersResult> Invoke(GetUsersInvokeArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.Invoke<GetUsersResult>("onelogin:index/getUsers:getUsers", args ?? new GetUsersInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetUsersArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// The user's directory_id
        /// </summary>
        [Input("directoryId")]
        public int? DirectoryId { get; set; }

        /// <summary>
        /// The user's external_id
        /// </summary>
        [Input("externalId")]
        public int? ExternalId { get; set; }

        /// <summary>
        /// The user's first name
        /// </summary>
        [Input("firstname")]
        public string? Firstname { get; set; }

        /// <summary>
        /// The user's last name
        /// </summary>
        [Input("lastname")]
        public string? Lastname { get; set; }

        /// <summary>
        /// The user's samaccount name
        /// </summary>
        [Input("samaccountname")]
        public string? Samaccountname { get; set; }

        [Input("userId")]
        public string? UserId { get; set; }

        /// <summary>
        /// The user's username.
        /// </summary>
        [Input("username")]
        public string? Username { get; set; }

        public GetUsersArgs()
        {
        }
    }

    public sealed class GetUsersInvokeArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// The user's directory_id
        /// </summary>
        [Input("directoryId")]
        public Input<int>? DirectoryId { get; set; }

        /// <summary>
        /// The user's external_id
        /// </summary>
        [Input("externalId")]
        public Input<int>? ExternalId { get; set; }

        /// <summary>
        /// The user's first name
        /// </summary>
        [Input("firstname")]
        public Input<string>? Firstname { get; set; }

        /// <summary>
        /// The user's last name
        /// </summary>
        [Input("lastname")]
        public Input<string>? Lastname { get; set; }

        /// <summary>
        /// The user's samaccount name
        /// </summary>
        [Input("samaccountname")]
        public Input<string>? Samaccountname { get; set; }

        [Input("userId")]
        public Input<string>? UserId { get; set; }

        /// <summary>
        /// The user's username.
        /// </summary>
        [Input("username")]
        public Input<string>? Username { get; set; }

        public GetUsersInvokeArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetUsersResult
    {
        public readonly int? DirectoryId;
        public readonly int? ExternalId;
        public readonly string? Firstname;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// List of user's id
        /// </summary>
        public readonly ImmutableArray<string> Ids;
        public readonly string? Lastname;
        public readonly string? Samaccountname;
        public readonly string? UserId;
        public readonly string? Username;

        [OutputConstructor]
        private GetUsersResult(
            int? directoryId,

            int? externalId,

            string? firstname,

            string id,

            ImmutableArray<string> ids,

            string? lastname,

            string? samaccountname,

            string? userId,

            string? username)
        {
            DirectoryId = directoryId;
            ExternalId = externalId;
            Firstname = firstname;
            Id = id;
            Ids = ids;
            Lastname = lastname;
            Samaccountname = samaccountname;
            UserId = userId;
            Username = username;
        }
    }
}
