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
        [Input("includeInSamlAssertion", required: true)]
        public bool IncludeInSamlAssertion { get; set; }

        [Input("label", required: true)]
        public string Label { get; set; } = null!;

        [Input("userAttributeMacros", required: true)]
        public string UserAttributeMacros { get; set; } = null!;

        [Input("userAttributeMappings", required: true)]
        public string UserAttributeMappings { get; set; } = null!;

        public GetInstanceParametersArgs()
        {
        }
        public static new GetInstanceParametersArgs Empty => new GetInstanceParametersArgs();
    }
}
