// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Onelogin.Inputs
{

    public sealed class GetMappingsConditionArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// A valid operator for the selected condition source
        /// </summary>
        [Input("operator", required: true)]
        public string Operator { get; set; } = null!;

        /// <summary>
        /// source field to check.
        /// </summary>
        [Input("source", required: true)]
        public string Source { get; set; } = null!;

        /// <summary>
        /// A plain text string or valid value for the selected  condition source
        /// </summary>
        [Input("value", required: true)]
        public string Value { get; set; } = null!;

        public GetMappingsConditionArgs()
        {
        }
        public static new GetMappingsConditionArgs Empty => new GetMappingsConditionArgs();
    }
}
