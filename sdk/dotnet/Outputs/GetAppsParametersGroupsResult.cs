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
    public sealed class GetAppsParametersGroupsResult
    {
        public readonly string AttributesTransformations;
        public readonly string DefaultValues;
        public readonly int Id;
        public readonly string Label;
        public readonly bool ProvisionedEntitlements;
        public readonly bool SkipIfBlank;
        public readonly string UserAttributeMacros;
        public readonly string UserAttributeMappings;
        public readonly string Values;

        [OutputConstructor]
        private GetAppsParametersGroupsResult(
            string attributesTransformations,

            string defaultValues,

            int id,

            string label,

            bool provisionedEntitlements,

            bool skipIfBlank,

            string userAttributeMacros,

            string userAttributeMappings,

            string values)
        {
            AttributesTransformations = attributesTransformations;
            DefaultValues = defaultValues;
            Id = id;
            Label = label;
            ProvisionedEntitlements = provisionedEntitlements;
            SkipIfBlank = skipIfBlank;
            UserAttributeMacros = userAttributeMacros;
            UserAttributeMappings = userAttributeMappings;
            Values = values;
        }
    }
}
