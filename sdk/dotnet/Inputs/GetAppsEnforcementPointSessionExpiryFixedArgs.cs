// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Onelogin.Inputs
{

    public sealed class GetAppsEnforcementPointSessionExpiryFixedInputArgs : global::Pulumi.ResourceArgs
    {
        [Input("unit", required: true)]
        public Input<int> Unit { get; set; } = null!;

        [Input("value", required: true)]
        public Input<int> Value { get; set; } = null!;

        public GetAppsEnforcementPointSessionExpiryFixedInputArgs()
        {
        }
        public static new GetAppsEnforcementPointSessionExpiryFixedInputArgs Empty => new GetAppsEnforcementPointSessionExpiryFixedInputArgs();
    }
}
