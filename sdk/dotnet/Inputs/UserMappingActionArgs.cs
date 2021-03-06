// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Onelogin.Inputs
{

    public sealed class UserMappingActionArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The action to apply. See [List Actions](https://developers.onelogin.com/api-docs/2/user-mappings/list-conditions) for possible values.
        /// </summary>
        [Input("action", required: true)]
        public Input<string> Action { get; set; } = null!;

        [Input("values", required: true)]
        private InputList<string>? _values;

        /// <summary>
        /// An array of strings. Items in the array will be a plain text string or valid value for the selected action. See [List Action Values](https://developers.onelogin.com/api-docs/2/user-mappings/list-action-values) for possible values. In most cases only a single item will be accepted in the array.
        /// </summary>
        public InputList<string> Values
        {
            get => _values ?? (_values = new InputList<string>());
            set => _values = value;
        }

        public UserMappingActionArgs()
        {
        }
    }
}
