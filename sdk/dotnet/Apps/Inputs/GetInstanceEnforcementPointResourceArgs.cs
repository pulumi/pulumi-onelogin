// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Onelogin.Apps.Inputs
{

    public sealed class GetInstanceEnforcementPointResourceInputArgs : global::Pulumi.ResourceArgs
    {
        [Input("conditions", required: true)]
        public Input<string> Conditions { get; set; } = null!;

        [Input("isPathRegex", required: true)]
        public Input<bool> IsPathRegex { get; set; } = null!;

        [Input("path", required: true)]
        public Input<string> Path { get; set; } = null!;

        [Input("permission", required: true)]
        public Input<string> Permission { get; set; } = null!;

        [Input("requireAuth", required: true)]
        public Input<bool> RequireAuth { get; set; } = null!;

        public GetInstanceEnforcementPointResourceInputArgs()
        {
        }
        public static new GetInstanceEnforcementPointResourceInputArgs Empty => new GetInstanceEnforcementPointResourceInputArgs();
    }
}