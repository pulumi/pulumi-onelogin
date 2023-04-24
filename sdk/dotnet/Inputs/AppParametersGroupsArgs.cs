// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Onelogin.Inputs
{

    public sealed class AppParametersGroupsArgs : global::Pulumi.ResourceArgs
    {
        [Input("attributesTransformations")]
        public Input<string>? AttributesTransformations { get; set; }

        [Input("defaultValues")]
        public Input<string>? DefaultValues { get; set; }

        [Input("id")]
        public Input<int>? Id { get; set; }

        [Input("label")]
        public Input<string>? Label { get; set; }

        [Input("provisionedEntitlements")]
        public Input<bool>? ProvisionedEntitlements { get; set; }

        [Input("skipIfBlank")]
        public Input<bool>? SkipIfBlank { get; set; }

        [Input("userAttributeMacros")]
        public Input<string>? UserAttributeMacros { get; set; }

        [Input("userAttributeMappings")]
        public Input<string>? UserAttributeMappings { get; set; }

        [Input("values")]
        public Input<string>? Values { get; set; }

        public AppParametersGroupsArgs()
        {
        }
        public static new AppParametersGroupsArgs Empty => new AppParametersGroupsArgs();
    }
}
