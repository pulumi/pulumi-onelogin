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
    /// Manage User Mappings resources.
    /// 
    /// This resource allows you to create and configure User Mappings.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using Onelogin = Pulumi.Onelogin;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         var example = new Onelogin.UserMapping("example", new Onelogin.UserMappingArgs
    ///         {
    ///             Actions = 
    ///             {
    ///                 new Onelogin.Inputs.UserMappingActionArgs
    ///                 {
    ///                     Action = "set_status",
    ///                     Values = 
    ///                     {
    ///                         "1",
    ///                     },
    ///                 },
    ///             },
    ///             Conditions = 
    ///             {
    ///                 new Onelogin.Inputs.UserMappingConditionArgs
    ///                 {
    ///                     Operator = "&gt;",
    ///                     Source = "last_login",
    ///                     Value = "90",
    ///                 },
    ///             },
    ///             Enabled = true,
    ///             Match = "all",
    ///             Position = 1,
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// 
    /// ## Import
    /// 
    /// A User Mapping can be imported via the OneLogin User Mapping.
    /// 
    /// ```sh
    ///  $ pulumi import onelogin:index/userMapping:UserMapping example &lt;user_mapping_id&gt;
    /// ```
    /// </summary>
    [OneloginResourceType("onelogin:index/userMapping:UserMapping")]
    public partial class UserMapping : Pulumi.CustomResource
    {
        /// <summary>
        /// The number of minutes until the token expires
        /// </summary>
        [Output("actions")]
        public Output<ImmutableArray<Outputs.UserMappingAction>> Actions { get; private set; } = null!;

        /// <summary>
        /// An array of conditions that the user must meet in order for the mapping to be applied.
        /// </summary>
        [Output("conditions")]
        public Output<ImmutableArray<Outputs.UserMappingCondition>> Conditions { get; private set; } = null!;

        /// <summary>
        /// Indicates if a mapping is enabled.
        /// </summary>
        [Output("enabled")]
        public Output<bool?> Enabled { get; private set; } = null!;

        /// <summary>
        /// Indicates how conditions should be matched. Must be one of `all` or `any`.
        /// </summary>
        [Output("match")]
        public Output<string> Match { get; private set; } = null!;

        /// <summary>
        /// The resource's name.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Indicates the ordering of the mapping. When not supplied the mapping will be put at the end of the list on create and managed by the provider. '0' can be supplied to consistently push this mapping to the end of the list on every update.
        /// </summary>
        [Output("position")]
        public Output<int> Position { get; private set; } = null!;


        /// <summary>
        /// Create a UserMapping resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public UserMapping(string name, UserMappingArgs args, CustomResourceOptions? options = null)
            : base("onelogin:index/userMapping:UserMapping", name, args ?? new UserMappingArgs(), MakeResourceOptions(options, ""))
        {
        }

        private UserMapping(string name, Input<string> id, UserMappingState? state = null, CustomResourceOptions? options = null)
            : base("onelogin:index/userMapping:UserMapping", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing UserMapping resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static UserMapping Get(string name, Input<string> id, UserMappingState? state = null, CustomResourceOptions? options = null)
        {
            return new UserMapping(name, id, state, options);
        }
    }

    public sealed class UserMappingArgs : Pulumi.ResourceArgs
    {
        [Input("actions")]
        private InputList<Inputs.UserMappingActionArgs>? _actions;

        /// <summary>
        /// The number of minutes until the token expires
        /// </summary>
        public InputList<Inputs.UserMappingActionArgs> Actions
        {
            get => _actions ?? (_actions = new InputList<Inputs.UserMappingActionArgs>());
            set => _actions = value;
        }

        [Input("conditions")]
        private InputList<Inputs.UserMappingConditionArgs>? _conditions;

        /// <summary>
        /// An array of conditions that the user must meet in order for the mapping to be applied.
        /// </summary>
        public InputList<Inputs.UserMappingConditionArgs> Conditions
        {
            get => _conditions ?? (_conditions = new InputList<Inputs.UserMappingConditionArgs>());
            set => _conditions = value;
        }

        /// <summary>
        /// Indicates if a mapping is enabled.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// Indicates how conditions should be matched. Must be one of `all` or `any`.
        /// </summary>
        [Input("match", required: true)]
        public Input<string> Match { get; set; } = null!;

        /// <summary>
        /// The resource's name.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Indicates the ordering of the mapping. When not supplied the mapping will be put at the end of the list on create and managed by the provider. '0' can be supplied to consistently push this mapping to the end of the list on every update.
        /// </summary>
        [Input("position")]
        public Input<int>? Position { get; set; }

        public UserMappingArgs()
        {
        }
    }

    public sealed class UserMappingState : Pulumi.ResourceArgs
    {
        [Input("actions")]
        private InputList<Inputs.UserMappingActionGetArgs>? _actions;

        /// <summary>
        /// The number of minutes until the token expires
        /// </summary>
        public InputList<Inputs.UserMappingActionGetArgs> Actions
        {
            get => _actions ?? (_actions = new InputList<Inputs.UserMappingActionGetArgs>());
            set => _actions = value;
        }

        [Input("conditions")]
        private InputList<Inputs.UserMappingConditionGetArgs>? _conditions;

        /// <summary>
        /// An array of conditions that the user must meet in order for the mapping to be applied.
        /// </summary>
        public InputList<Inputs.UserMappingConditionGetArgs> Conditions
        {
            get => _conditions ?? (_conditions = new InputList<Inputs.UserMappingConditionGetArgs>());
            set => _conditions = value;
        }

        /// <summary>
        /// Indicates if a mapping is enabled.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// Indicates how conditions should be matched. Must be one of `all` or `any`.
        /// </summary>
        [Input("match")]
        public Input<string>? Match { get; set; }

        /// <summary>
        /// The resource's name.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Indicates the ordering of the mapping. When not supplied the mapping will be put at the end of the list on create and managed by the provider. '0' can be supplied to consistently push this mapping to the end of the list on every update.
        /// </summary>
        [Input("position")]
        public Input<int>? Position { get; set; }

        public UserMappingState()
        {
        }
    }
}
