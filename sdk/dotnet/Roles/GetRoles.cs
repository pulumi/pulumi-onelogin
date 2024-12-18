// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Onelogin.Roles
{
    public static class GetRoles
    {
        public static Task<GetRolesResult> InvokeAsync(GetRolesArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetRolesResult>("onelogin:roles/getRoles:getRoles", args ?? new GetRolesArgs(), options.WithDefaults());

        public static Output<GetRolesResult> Invoke(GetRolesInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetRolesResult>("onelogin:roles/getRoles:getRoles", args ?? new GetRolesInvokeArgs(), options.WithDefaults());

        public static Output<GetRolesResult> Invoke(GetRolesInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetRolesResult>("onelogin:roles/getRoles:getRoles", args ?? new GetRolesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetRolesArgs : global::Pulumi.InvokeArgs
    {
        [Input("admins")]
        private List<int>? _admins;
        public List<int> Admins
        {
            get => _admins ?? (_admins = new List<int>());
            set => _admins = value;
        }

        [Input("apps")]
        private List<int>? _apps;
        public List<int> Apps
        {
            get => _apps ?? (_apps = new List<int>());
            set => _apps = value;
        }

        [Input("filters")]
        private List<Inputs.GetRolesFilterArgs>? _filters;
        public List<Inputs.GetRolesFilterArgs> Filters
        {
            get => _filters ?? (_filters = new List<Inputs.GetRolesFilterArgs>());
            set => _filters = value;
        }

        [Input("name")]
        public string? Name { get; set; }

        [Input("users")]
        private List<int>? _users;
        public List<int> Users
        {
            get => _users ?? (_users = new List<int>());
            set => _users = value;
        }

        public GetRolesArgs()
        {
        }
        public static new GetRolesArgs Empty => new GetRolesArgs();
    }

    public sealed class GetRolesInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("admins")]
        private InputList<int>? _admins;
        public InputList<int> Admins
        {
            get => _admins ?? (_admins = new InputList<int>());
            set => _admins = value;
        }

        [Input("apps")]
        private InputList<int>? _apps;
        public InputList<int> Apps
        {
            get => _apps ?? (_apps = new InputList<int>());
            set => _apps = value;
        }

        [Input("filters")]
        private InputList<Inputs.GetRolesFilterInputArgs>? _filters;
        public InputList<Inputs.GetRolesFilterInputArgs> Filters
        {
            get => _filters ?? (_filters = new InputList<Inputs.GetRolesFilterInputArgs>());
            set => _filters = value;
        }

        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("users")]
        private InputList<int>? _users;
        public InputList<int> Users
        {
            get => _users ?? (_users = new InputList<int>());
            set => _users = value;
        }

        public GetRolesInvokeArgs()
        {
        }
        public static new GetRolesInvokeArgs Empty => new GetRolesInvokeArgs();
    }


    [OutputType]
    public sealed class GetRolesResult
    {
        public readonly ImmutableArray<int> Admins;
        public readonly ImmutableArray<int> Apps;
        public readonly ImmutableArray<Outputs.GetRolesFilterResult> Filters;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string Name;
        public readonly ImmutableArray<int> Users;

        [OutputConstructor]
        private GetRolesResult(
            ImmutableArray<int> admins,

            ImmutableArray<int> apps,

            ImmutableArray<Outputs.GetRolesFilterResult> filters,

            string id,

            string name,

            ImmutableArray<int> users)
        {
            Admins = admins;
            Apps = apps;
            Filters = filters;
            Id = id;
            Name = name;
            Users = users;
        }
    }
}
