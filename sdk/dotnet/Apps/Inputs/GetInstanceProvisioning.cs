// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Onelogin.Apps.Inputs
{

    public sealed class GetInstanceProvisioningArgs : global::Pulumi.InvokeArgs
    {
        [Input("enabled", required: true)]
        public bool Enabled { get; set; }

        [Input("status", required: true)]
        public string Status { get; set; } = null!;

        public GetInstanceProvisioningArgs()
        {
        }
        public static new GetInstanceProvisioningArgs Empty => new GetInstanceProvisioningArgs();
    }
}
