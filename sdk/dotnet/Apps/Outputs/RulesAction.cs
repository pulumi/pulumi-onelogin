// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Onelogin.Apps.Outputs
{

    [OutputType]
    public sealed class RulesAction
    {
        public readonly string? Action;
        public readonly ImmutableArray<string> Values;

        [OutputConstructor]
        private RulesAction(
            string? action,

            ImmutableArray<string> values)
        {
            Action = action;
            Values = values;
        }
    }
}
