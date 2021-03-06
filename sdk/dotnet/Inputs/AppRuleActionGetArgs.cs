// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Onelogin.Inputs
{

    public sealed class AppRuleActionGetArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The action to apply. See [List Actions](https://developers.onelogin.com/api-docs/2/app-rules/list-conditions) for possible values. *Note*: The action `set_role_from_existing` may also be used, however doing so will always clear the `expression` field as it is not accepted when mapping a rule from existing roles.
        /// </summary>
        [Input("action", required: true)]
        public Input<string> Action { get; set; } = null!;

        /// <summary>
        /// A regular expression to extract a value. Applies to provisionable, multi-selects, and string actions.
        /// </summary>
        [Input("expression")]
        public Input<string>? Expression { get; set; }

        [Input("values", required: true)]
        private InputList<string>? _values;

        /// <summary>
        /// An array of strings. Only applicable to provisioned and set_* actions. Items in the array will be a plain text string or valid value for the selected action. See [List Action Values](https://developers.onelogin.com/api-docs/2/app-rules/list-action-values) for possible values. In most cases only a single item will be accepted in the array.
        /// </summary>
        public InputList<string> Values
        {
            get => _values ?? (_values = new InputList<string>());
            set => _values = value;
        }

        public AppRuleActionGetArgs()
        {
        }
    }
}
