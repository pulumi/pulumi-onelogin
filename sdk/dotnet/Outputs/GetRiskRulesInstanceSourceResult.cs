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
    public sealed class GetRiskRulesInstanceSourceResult
    {
        /// <summary>
        /// A unique id that represents the source of the event.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The name of the source
        /// </summary>
        public readonly string Name;

        [OutputConstructor]
        private GetRiskRulesInstanceSourceResult(
            string id,

            string name)
        {
            Id = id;
            Name = name;
        }
    }
}
