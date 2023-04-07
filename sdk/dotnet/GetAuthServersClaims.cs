// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Onelogin
{
    public static class GetAuthServersClaims
    {
        public static Task<GetAuthServersClaimsResult> InvokeAsync(GetAuthServersClaimsArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetAuthServersClaimsResult>("onelogin:index/getAuthServersClaims:getAuthServersClaims", args ?? new GetAuthServersClaimsArgs(), options.WithDefaults());

        public static Output<GetAuthServersClaimsResult> Invoke(GetAuthServersClaimsInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetAuthServersClaimsResult>("onelogin:index/getAuthServersClaims:getAuthServersClaims", args ?? new GetAuthServersClaimsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetAuthServersClaimsArgs : global::Pulumi.InvokeArgs
    {
        [Input("attributeTransformations")]
        public string? AttributeTransformations { get; set; }

        [Input("authServersId", required: true)]
        public string AuthServersId { get; set; } = null!;

        [Input("defaultValues")]
        public string? DefaultValues { get; set; }

        [Input("filters")]
        private List<Inputs.GetAuthServersClaimsFilterArgs>? _filters;
        public List<Inputs.GetAuthServersClaimsFilterArgs> Filters
        {
            get => _filters ?? (_filters = new List<Inputs.GetAuthServersClaimsFilterArgs>());
            set => _filters = value;
        }

        [Input("label")]
        public string? Label { get; set; }

        [Input("provisionedEntitlements")]
        public bool? ProvisionedEntitlements { get; set; }

        [Input("skipIfBlank")]
        public bool? SkipIfBlank { get; set; }

        [Input("userAttributeMacros")]
        public string? UserAttributeMacros { get; set; }

        [Input("userAttributeMappings")]
        public string? UserAttributeMappings { get; set; }

        [Input("values")]
        private List<string>? _values;
        public List<string> Values
        {
            get => _values ?? (_values = new List<string>());
            set => _values = value;
        }

        public GetAuthServersClaimsArgs()
        {
        }
        public static new GetAuthServersClaimsArgs Empty => new GetAuthServersClaimsArgs();
    }

    public sealed class GetAuthServersClaimsInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("attributeTransformations")]
        public Input<string>? AttributeTransformations { get; set; }

        [Input("authServersId", required: true)]
        public Input<string> AuthServersId { get; set; } = null!;

        [Input("defaultValues")]
        public Input<string>? DefaultValues { get; set; }

        [Input("filters")]
        private InputList<Inputs.GetAuthServersClaimsFilterInputArgs>? _filters;
        public InputList<Inputs.GetAuthServersClaimsFilterInputArgs> Filters
        {
            get => _filters ?? (_filters = new InputList<Inputs.GetAuthServersClaimsFilterInputArgs>());
            set => _filters = value;
        }

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
        private InputList<string>? _values;
        public InputList<string> Values
        {
            get => _values ?? (_values = new InputList<string>());
            set => _values = value;
        }

        public GetAuthServersClaimsInvokeArgs()
        {
        }
        public static new GetAuthServersClaimsInvokeArgs Empty => new GetAuthServersClaimsInvokeArgs();
    }


    [OutputType]
    public sealed class GetAuthServersClaimsResult
    {
        public readonly string AttributeTransformations;
        public readonly string AuthServersId;
        public readonly string DefaultValues;
        public readonly ImmutableArray<Outputs.GetAuthServersClaimsFilterResult> Filters;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string Label;
        public readonly bool ProvisionedEntitlements;
        public readonly bool SkipIfBlank;
        public readonly string UserAttributeMacros;
        public readonly string UserAttributeMappings;
        public readonly ImmutableArray<string> Values;

        [OutputConstructor]
        private GetAuthServersClaimsResult(
            string attributeTransformations,

            string authServersId,

            string defaultValues,

            ImmutableArray<Outputs.GetAuthServersClaimsFilterResult> filters,

            string id,

            string label,

            bool provisionedEntitlements,

            bool skipIfBlank,

            string userAttributeMacros,

            string userAttributeMappings,

            ImmutableArray<string> values)
        {
            AttributeTransformations = attributeTransformations;
            AuthServersId = authServersId;
            DefaultValues = defaultValues;
            Filters = filters;
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