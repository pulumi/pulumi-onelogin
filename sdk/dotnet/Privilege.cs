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
    /// Manage Privilege resources.
    /// 
    /// This resource allows you to create and configure Privilege.
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
    ///         var superAdmin = new Onelogin.Privilege("superAdmin", new Onelogin.PrivilegeArgs
    ///         {
    ///             Description = "description",
    ///             Privileges = 
    ///             {
    ///                 new Onelogin.Inputs.PrivilegePrivilegeArgs
    ///                 {
    ///                     Statements = 
    ///                     {
    ///                         new Onelogin.Inputs.PrivilegePrivilegeStatementArgs
    ///                         {
    ///                             Action = 
    ///                             {
    ///                                 "apps:List",
    ///                             },
    ///                             Effect = "Allow",
    ///                             Scope = 
    ///                             {
    ///                                 "*",
    ///                             },
    ///                         },
    ///                         new Onelogin.Inputs.PrivilegePrivilegeStatementArgs
    ///                         {
    ///                             Action = 
    ///                             {
    ///                                 "users:List",
    ///                                 "users:Update",
    ///                             },
    ///                             Effect = "Allow",
    ///                             Scope = 
    ///                             {
    ///                                 "users/123",
    ///                                 "users/345",
    ///                             },
    ///                         },
    ///                     },
    ///                 },
    ///             },
    ///             RoleIds = 
    ///             {
    ///                 987,
    ///                 654,
    ///             },
    ///             UserIds = 
    ///             {
    ///                 123,
    ///                 345,
    ///             },
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// 
    /// ## Import
    /// 
    /// A privilege can be imported using the OneLogin Privilege ID.
    /// 
    /// ```sh
    ///  $ pulumi import onelogin:index/privilege:Privilege super_admin &lt;privilege id&gt;
    /// ```
    /// </summary>
    [OneloginResourceType("onelogin:index/privilege:Privilege")]
    public partial class Privilege : Pulumi.CustomResource
    {
        /// <summary>
        /// Description for the Privilege.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// The name of the privilege.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// A list of statements that describe what the privilege grants access to.
        /// </summary>
        [Output("privileges")]
        public Output<ImmutableArray<Outputs.PrivilegePrivilege>> Privileges { get; private set; } = null!;

        /// <summary>
        /// A list of role IDs for whom the role applies.
        /// </summary>
        [Output("roleIds")]
        public Output<ImmutableArray<int>> RoleIds { get; private set; } = null!;

        /// <summary>
        /// A list of user IDs for whom the privilege applies.
        /// </summary>
        [Output("userIds")]
        public Output<ImmutableArray<int>> UserIds { get; private set; } = null!;


        /// <summary>
        /// Create a Privilege resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Privilege(string name, PrivilegeArgs args, CustomResourceOptions? options = null)
            : base("onelogin:index/privilege:Privilege", name, args ?? new PrivilegeArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Privilege(string name, Input<string> id, PrivilegeState? state = null, CustomResourceOptions? options = null)
            : base("onelogin:index/privilege:Privilege", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Privilege resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Privilege Get(string name, Input<string> id, PrivilegeState? state = null, CustomResourceOptions? options = null)
        {
            return new Privilege(name, id, state, options);
        }
    }

    public sealed class PrivilegeArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Description for the Privilege.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The name of the privilege.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("privileges", required: true)]
        private InputList<Inputs.PrivilegePrivilegeArgs>? _privileges;

        /// <summary>
        /// A list of statements that describe what the privilege grants access to.
        /// </summary>
        public InputList<Inputs.PrivilegePrivilegeArgs> Privileges
        {
            get => _privileges ?? (_privileges = new InputList<Inputs.PrivilegePrivilegeArgs>());
            set => _privileges = value;
        }

        [Input("roleIds")]
        private InputList<int>? _roleIds;

        /// <summary>
        /// A list of role IDs for whom the role applies.
        /// </summary>
        public InputList<int> RoleIds
        {
            get => _roleIds ?? (_roleIds = new InputList<int>());
            set => _roleIds = value;
        }

        [Input("userIds")]
        private InputList<int>? _userIds;

        /// <summary>
        /// A list of user IDs for whom the privilege applies.
        /// </summary>
        public InputList<int> UserIds
        {
            get => _userIds ?? (_userIds = new InputList<int>());
            set => _userIds = value;
        }

        public PrivilegeArgs()
        {
        }
    }

    public sealed class PrivilegeState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Description for the Privilege.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The name of the privilege.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("privileges")]
        private InputList<Inputs.PrivilegePrivilegeGetArgs>? _privileges;

        /// <summary>
        /// A list of statements that describe what the privilege grants access to.
        /// </summary>
        public InputList<Inputs.PrivilegePrivilegeGetArgs> Privileges
        {
            get => _privileges ?? (_privileges = new InputList<Inputs.PrivilegePrivilegeGetArgs>());
            set => _privileges = value;
        }

        [Input("roleIds")]
        private InputList<int>? _roleIds;

        /// <summary>
        /// A list of role IDs for whom the role applies.
        /// </summary>
        public InputList<int> RoleIds
        {
            get => _roleIds ?? (_roleIds = new InputList<int>());
            set => _roleIds = value;
        }

        [Input("userIds")]
        private InputList<int>? _userIds;

        /// <summary>
        /// A list of user IDs for whom the privilege applies.
        /// </summary>
        public InputList<int> UserIds
        {
            get => _userIds ?? (_userIds = new InputList<int>());
            set => _userIds = value;
        }

        public PrivilegeState()
        {
        }
    }
}
