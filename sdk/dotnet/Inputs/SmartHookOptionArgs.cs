// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Onelogin.Inputs
{

    public sealed class SmartHookOptionArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// When true an ip to location lookup is done and the location info is passed in the context. Only applies authentication time hooks. E.g. pre-authentication, user-migration. Default false
        /// </summary>
        [Input("locationEnabled")]
        public Input<bool>? LocationEnabled { get; set; }

        [Input("mfaDeviceInfoEnabled")]
        public Input<bool>? MfaDeviceInfoEnabled { get; set; }

        /// <summary>
        /// When true a risk score and risk reasons will be passed in the context. Only applies authentication time hooks. E.g. pre-authentication, user-migration. Default false
        /// </summary>
        [Input("riskEnabled")]
        public Input<bool>? RiskEnabled { get; set; }

        public SmartHookOptionArgs()
        {
        }
    }
}
