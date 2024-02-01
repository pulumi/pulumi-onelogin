// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Onelogin.Inputs
{

    public sealed class RiskRulesSourceArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// A unique id that represents the source of the event.
        /// </summary>
        [Input("id")]
        public Input<string>? Id { get; set; }

        /// <summary>
        /// The name of the source
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        public RiskRulesSourceArgs()
        {
        }
        public static new RiskRulesSourceArgs Empty => new RiskRulesSourceArgs();
    }
}
