// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Onelogin.Roles
{
    public static class GetInstance
    {
        public static Task<GetInstanceResult> InvokeAsync(GetInstanceArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetInstanceResult>("onelogin:roles/getInstance:getInstance", args ?? new GetInstanceArgs(), options.WithDefaults());

        public static Output<GetInstanceResult> Invoke(GetInstanceInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetInstanceResult>("onelogin:roles/getInstance:getInstance", args ?? new GetInstanceInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetInstanceArgs : global::Pulumi.InvokeArgs
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

        [Input("id", required: true)]
        public string Id { get; set; } = null!;

        [Input("name")]
        public string? Name { get; set; }

        [Input("users")]
        private List<int>? _users;
        public List<int> Users
        {
            get => _users ?? (_users = new List<int>());
            set => _users = value;
        }

        public GetInstanceArgs()
        {
        }
        public static new GetInstanceArgs Empty => new GetInstanceArgs();
    }

    public sealed class GetInstanceInvokeArgs : global::Pulumi.InvokeArgs
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

        [Input("id", required: true)]
        public Input<string> Id { get; set; } = null!;

        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("users")]
        private InputList<int>? _users;
        public InputList<int> Users
        {
            get => _users ?? (_users = new InputList<int>());
            set => _users = value;
        }

        public GetInstanceInvokeArgs()
        {
        }
        public static new GetInstanceInvokeArgs Empty => new GetInstanceInvokeArgs();
    }


    [OutputType]
    public sealed class GetInstanceResult
    {
        public readonly ImmutableArray<int> Admins;
        public readonly ImmutableArray<int> Apps;
        public readonly string Id;
        public readonly string Name;
        public readonly ImmutableArray<int> Users;

        [OutputConstructor]
        private GetInstanceResult(
            ImmutableArray<int> admins,

            ImmutableArray<int> apps,

            string id,

            string name,

            ImmutableArray<int> users)
        {
            Admins = admins;
            Apps = apps;
            Id = id;
            Name = name;
            Users = users;
        }
    }
}
