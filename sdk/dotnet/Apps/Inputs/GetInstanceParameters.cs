// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Onelogin.Apps.Inputs
{

    public sealed class GetInstanceParametersArgs : global::Pulumi.InvokeArgs
    {
        [Input("groups", required: true)]
        public Inputs.GetInstanceParametersGroupsArgs Groups { get; set; } = null!;

        public GetInstanceParametersArgs()
        {
        }
        public static new GetInstanceParametersArgs Empty => new GetInstanceParametersArgs();
    }
}
