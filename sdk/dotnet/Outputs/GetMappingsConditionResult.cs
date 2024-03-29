// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Onelogin.Outputs
{

    [OutputType]
    public sealed class GetMappingsConditionResult
    {
        /// <summary>
        /// A valid operator for the selected condition source
        /// </summary>
        public readonly string Operator;
        /// <summary>
        /// source field to check.
        /// </summary>
        public readonly string Source;
        /// <summary>
        /// A plain text string or valid value for the selected  condition source
        /// </summary>
        public readonly string Value;

        [OutputConstructor]
        private GetMappingsConditionResult(
            string @operator,

            string source,

            string value)
        {
            Operator = @operator;
            Source = source;
            Value = value;
        }
    }
}
