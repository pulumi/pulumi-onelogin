// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Onelogin.Apps.Inputs
{

    public sealed class GetRulesActionInputArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The action to apply
        /// </summary>
        [Input("action", required: true)]
        public Input<string> Action { get; set; } = null!;

        [Input("values", required: true)]
        private InputList<string>? _values;

        /// <summary>
        /// Only applicable to provisioned and set_* actions. Items in the array will be a plain text string or valid value for the selected action.
        /// </summary>
        public InputList<string> Values
        {
            get => _values ?? (_values = new InputList<string>());
            set => _values = value;
        }

        public GetRulesActionInputArgs()
        {
        }
        public static new GetRulesActionInputArgs Empty => new GetRulesActionInputArgs();
    }
}
