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
    /// Manage App Rule resources.
    /// 
    /// This resource allows you to create and configure App Rules.
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
    ///         var check = new Onelogin.AppRule("check", new Onelogin.AppRuleArgs
    ///         {
    ///             AppId = onelogin_saml_apps.My_saml_app.Id,
    ///             Position = 1,
    ///             Enabled = true,
    ///             Match = "all",
    ///             Conditions = 
    ///             {
    ///                 { "operator", "ri" },
    ///                 { "source", "has_role" },
    ///                 { "value", "340475" },
    ///             },
    ///             Actions = 
    ///             {
    ///                 { "action", "set_amazonusername" },
    ///                 { "expression", ".*" },
    ///                 { "values", 
    ///                 {
    ///                     "member_of",
    ///                 } },
    ///             },
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// ### Dependency Based Ordering
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using Onelogin = Pulumi.Onelogin;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         var test = new Onelogin.AppRule("test", new Onelogin.AppRuleArgs
    ///         {
    ///             AppId = onelogin_saml_apps.My_saml_app.Id,
    ///             Enabled = true,
    ///             Match = "all",
    ///             Conditions = 
    ///             {
    ///                 { "operator", "ri" },
    ///                 { "source", "has_role" },
    ///                 { "value", "340475" },
    ///             },
    ///             Actions = 
    ///             {
    ///                 { "action", "set_amazonusername" },
    ///                 { "expression", ".*" },
    ///                 { "values", 
    ///                 {
    ///                     "member_of",
    ///                 } },
    ///             },
    ///         });
    ///         var check = new Onelogin.AppRule("check", new Onelogin.AppRuleArgs
    ///         {
    ///             AppId = onelogin_saml_apps.My_saml_app.Id,
    ///             Enabled = true,
    ///             Match = "all",
    ///             Conditions = 
    ///             {
    ///                 { "operator", "ri" },
    ///                 { "source", "has_role" },
    ///                 { "value", "340475" },
    ///             },
    ///             Actions = 
    ///             {
    ///                 { "action", "set_amazonusername" },
    ///                 { "expression", ".*" },
    ///                 { "values", 
    ///                 {
    ///                     "member_of",
    ///                 } },
    ///             },
    ///         }, new CustomResourceOptions
    ///         {
    ///             DependsOn = 
    ///             {
    ///                 test,
    ///             },
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// ## Important Note Regarding Position
    /// 
    /// The position field indicates the order in which rules are applied. They behave like progressive filters and as such, their positioning is strictly enforced. Your options for this field are to either:
    /// 
    /// * Accept any ordering - Do not fill out any position field and each rule will be inserted in the order received by the API.
    /// 
    /// * Strict Ordering - Enter a position number for each app rule. You'll need to ensure there are no duplicates and no gaps in numbering.
    /// 
    /// * Dependency based ordering - Use the `depends_on` field to specify an app rule's predecessor to ensure rules are received by the API in the order in which they should be applied. e.g. `depends_on = [onelogin_app_rules.test]`
    /// 
    /// ## Import
    /// 
    /// An App Rule cannot be imported at this time.
    /// </summary>
    [OneloginResourceType("onelogin:index/appRule:AppRule")]
    public partial class AppRule : Pulumi.CustomResource
    {
        /// <summary>
        /// An array of actions that will be applied to the users that are matched by the conditions.
        /// </summary>
        [Output("actions")]
        public Output<ImmutableArray<Outputs.AppRuleAction>> Actions { get; private set; } = null!;

        /// <summary>
        /// The id of the App resource to which the rule should belong.
        /// </summary>
        [Output("appId")]
        public Output<string> AppId { get; private set; } = null!;

        /// <summary>
        /// An array of conditions that the user must meet in order for the rule to be applied.
        /// </summary>
        [Output("conditions")]
        public Output<ImmutableArray<Outputs.AppRuleCondition>> Conditions { get; private set; } = null!;

        /// <summary>
        /// Indicate if the rule should go into effect.
        /// </summary>
        [Output("enabled")]
        public Output<bool?> Enabled { get; private set; } = null!;

        /// <summary>
        /// Indicates how conditions should be matched. Must be one of `all` or `any`.
        /// </summary>
        [Output("match")]
        public Output<string> Match { get; private set; } = null!;

        /// <summary>
        /// The Rule's name
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Indicates the ordering of the rule. When not supplied the rule will be put at the end of the list on create and managed by the provider. '0' can be supplied to consistently push this rule to the end of the list on every update.
        /// </summary>
        [Output("position")]
        public Output<int> Position { get; private set; } = null!;


        /// <summary>
        /// Create a AppRule resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public AppRule(string name, AppRuleArgs args, CustomResourceOptions? options = null)
            : base("onelogin:index/appRule:AppRule", name, args ?? new AppRuleArgs(), MakeResourceOptions(options, ""))
        {
        }

        private AppRule(string name, Input<string> id, AppRuleState? state = null, CustomResourceOptions? options = null)
            : base("onelogin:index/appRule:AppRule", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing AppRule resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static AppRule Get(string name, Input<string> id, AppRuleState? state = null, CustomResourceOptions? options = null)
        {
            return new AppRule(name, id, state, options);
        }
    }

    public sealed class AppRuleArgs : Pulumi.ResourceArgs
    {
        [Input("actions")]
        private InputList<Inputs.AppRuleActionArgs>? _actions;

        /// <summary>
        /// An array of actions that will be applied to the users that are matched by the conditions.
        /// </summary>
        public InputList<Inputs.AppRuleActionArgs> Actions
        {
            get => _actions ?? (_actions = new InputList<Inputs.AppRuleActionArgs>());
            set => _actions = value;
        }

        /// <summary>
        /// The id of the App resource to which the rule should belong.
        /// </summary>
        [Input("appId", required: true)]
        public Input<string> AppId { get; set; } = null!;

        [Input("conditions")]
        private InputList<Inputs.AppRuleConditionArgs>? _conditions;

        /// <summary>
        /// An array of conditions that the user must meet in order for the rule to be applied.
        /// </summary>
        public InputList<Inputs.AppRuleConditionArgs> Conditions
        {
            get => _conditions ?? (_conditions = new InputList<Inputs.AppRuleConditionArgs>());
            set => _conditions = value;
        }

        /// <summary>
        /// Indicate if the rule should go into effect.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// Indicates how conditions should be matched. Must be one of `all` or `any`.
        /// </summary>
        [Input("match", required: true)]
        public Input<string> Match { get; set; } = null!;

        /// <summary>
        /// The Rule's name
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Indicates the ordering of the rule. When not supplied the rule will be put at the end of the list on create and managed by the provider. '0' can be supplied to consistently push this rule to the end of the list on every update.
        /// </summary>
        [Input("position")]
        public Input<int>? Position { get; set; }

        public AppRuleArgs()
        {
        }
    }

    public sealed class AppRuleState : Pulumi.ResourceArgs
    {
        [Input("actions")]
        private InputList<Inputs.AppRuleActionGetArgs>? _actions;

        /// <summary>
        /// An array of actions that will be applied to the users that are matched by the conditions.
        /// </summary>
        public InputList<Inputs.AppRuleActionGetArgs> Actions
        {
            get => _actions ?? (_actions = new InputList<Inputs.AppRuleActionGetArgs>());
            set => _actions = value;
        }

        /// <summary>
        /// The id of the App resource to which the rule should belong.
        /// </summary>
        [Input("appId")]
        public Input<string>? AppId { get; set; }

        [Input("conditions")]
        private InputList<Inputs.AppRuleConditionGetArgs>? _conditions;

        /// <summary>
        /// An array of conditions that the user must meet in order for the rule to be applied.
        /// </summary>
        public InputList<Inputs.AppRuleConditionGetArgs> Conditions
        {
            get => _conditions ?? (_conditions = new InputList<Inputs.AppRuleConditionGetArgs>());
            set => _conditions = value;
        }

        /// <summary>
        /// Indicate if the rule should go into effect.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// Indicates how conditions should be matched. Must be one of `all` or `any`.
        /// </summary>
        [Input("match")]
        public Input<string>? Match { get; set; }

        /// <summary>
        /// The Rule's name
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Indicates the ordering of the rule. When not supplied the rule will be put at the end of the list on create and managed by the provider. '0' can be supplied to consistently push this rule to the end of the list on every update.
        /// </summary>
        [Input("position")]
        public Input<int>? Position { get; set; }

        public AppRuleState()
        {
        }
    }
}
