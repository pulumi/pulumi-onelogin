// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Onelogin.Apps.Inputs
{

    public sealed class GetRulesInstanceConditionInputArgs : global::Pulumi.ResourceArgs
    {
        [Input("operator", required: true)]
        public Input<string> Operator { get; set; } = null!;

        [Input("source", required: true)]
        public Input<string> Source { get; set; } = null!;

        [Input("value", required: true)]
        public Input<string> Value { get; set; } = null!;

        public GetRulesInstanceConditionInputArgs()
        {
        }
        public static new GetRulesInstanceConditionInputArgs Empty => new GetRulesInstanceConditionInputArgs();
    }
}