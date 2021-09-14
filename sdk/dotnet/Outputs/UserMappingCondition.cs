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
    public sealed class UserMappingCondition
    {
        public readonly string Operator;
        public readonly string Source;
        public readonly string Value;

        [OutputConstructor]
        private UserMappingCondition(
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
