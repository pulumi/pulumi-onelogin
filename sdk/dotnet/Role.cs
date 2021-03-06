// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Onelogin
{
    /// <summary>
    /// Manage Role resources.
    /// 
    /// This resource allows you to create and configure Roles.
    /// 
    /// ## Example Usage
    /// ### Strict Ordering
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using Onelogin = Pulumi.Onelogin;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         var executiveAdmin = new Onelogin.Role("executiveAdmin", new Onelogin.RoleArgs
    ///         {
    ///             Admins = 
    ///             {
    ///                 777,
    ///             },
    ///             Apps = 
    ///             {
    ///                 123,
    ///                 456,
    ///                 787,
    ///             },
    ///             Users = 
    ///             {
    ///                 543,
    ///                 213,
    ///                 420,
    ///             },
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// 
    /// ## Import
    /// 
    /// A role can be imported using the OneLogin Role ID.
    /// 
    /// ```sh
    ///  $ pulumi import onelogin:index/role:Role executive_admin &lt;role id&gt;
    /// ```
    /// </summary>
    [OneloginResourceType("onelogin:index/role:Role")]
    public partial class Role : Pulumi.CustomResource
    {
        /// <summary>
        /// A list of IDs of users who administer the role.
        /// </summary>
        [Output("admins")]
        public Output<ImmutableArray<int>> Admins { get; private set; } = null!;

        /// <summary>
        /// A list of app IDs for which the role applies.
        /// </summary>
        [Output("apps")]
        public Output<ImmutableArray<int>> Apps { get; private set; } = null!;

        /// <summary>
        /// The name of the role.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// A list of user IDs for whom the role applies.
        /// </summary>
        [Output("users")]
        public Output<ImmutableArray<int>> Users { get; private set; } = null!;


        /// <summary>
        /// Create a Role resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Role(string name, RoleArgs? args = null, CustomResourceOptions? options = null)
            : base("onelogin:index/role:Role", name, args ?? new RoleArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Role(string name, Input<string> id, RoleState? state = null, CustomResourceOptions? options = null)
            : base("onelogin:index/role:Role", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing Role resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Role Get(string name, Input<string> id, RoleState? state = null, CustomResourceOptions? options = null)
        {
            return new Role(name, id, state, options);
        }
    }

    public sealed class RoleArgs : Pulumi.ResourceArgs
    {
        [Input("admins")]
        private InputList<int>? _admins;

        /// <summary>
        /// A list of IDs of users who administer the role.
        /// </summary>
        public InputList<int> Admins
        {
            get => _admins ?? (_admins = new InputList<int>());
            set => _admins = value;
        }

        [Input("apps")]
        private InputList<int>? _apps;

        /// <summary>
        /// A list of app IDs for which the role applies.
        /// </summary>
        public InputList<int> Apps
        {
            get => _apps ?? (_apps = new InputList<int>());
            set => _apps = value;
        }

        /// <summary>
        /// The name of the role.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("users")]
        private InputList<int>? _users;

        /// <summary>
        /// A list of user IDs for whom the role applies.
        /// </summary>
        public InputList<int> Users
        {
            get => _users ?? (_users = new InputList<int>());
            set => _users = value;
        }

        public RoleArgs()
        {
        }
    }

    public sealed class RoleState : Pulumi.ResourceArgs
    {
        [Input("admins")]
        private InputList<int>? _admins;

        /// <summary>
        /// A list of IDs of users who administer the role.
        /// </summary>
        public InputList<int> Admins
        {
            get => _admins ?? (_admins = new InputList<int>());
            set => _admins = value;
        }

        [Input("apps")]
        private InputList<int>? _apps;

        /// <summary>
        /// A list of app IDs for which the role applies.
        /// </summary>
        public InputList<int> Apps
        {
            get => _apps ?? (_apps = new InputList<int>());
            set => _apps = value;
        }

        /// <summary>
        /// The name of the role.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("users")]
        private InputList<int>? _users;

        /// <summary>
        /// A list of user IDs for whom the role applies.
        /// </summary>
        public InputList<int> Users
        {
            get => _users ?? (_users = new InputList<int>());
            set => _users = value;
        }

        public RoleState()
        {
        }
    }
}
