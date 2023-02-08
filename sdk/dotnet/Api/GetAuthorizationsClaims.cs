// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Onelogin.Api
{
    public static class GetAuthorizationsClaims
    {
        public static Task<GetAuthorizationsClaimsResult> InvokeAsync(GetAuthorizationsClaimsArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetAuthorizationsClaimsResult>("onelogin:api/getAuthorizationsClaims:getAuthorizationsClaims", args ?? new GetAuthorizationsClaimsArgs(), options.WithDefaults());

        public static Output<GetAuthorizationsClaimsResult> Invoke(GetAuthorizationsClaimsInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetAuthorizationsClaimsResult>("onelogin:api/getAuthorizationsClaims:getAuthorizationsClaims", args ?? new GetAuthorizationsClaimsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetAuthorizationsClaimsArgs : global::Pulumi.InvokeArgs
    {
        [Input("apiAuthorizationsId", required: true)]
        public string ApiAuthorizationsId { get; set; } = null!;

        [Input("attributeTransformations")]
        public string? AttributeTransformations { get; set; }

        [Input("defaultValues")]
        public string? DefaultValues { get; set; }

        [Input("filters")]
        private List<Inputs.GetAuthorizationsClaimsFilterArgs>? _filters;
        public List<Inputs.GetAuthorizationsClaimsFilterArgs> Filters
        {
            get => _filters ?? (_filters = new List<Inputs.GetAuthorizationsClaimsFilterArgs>());
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

        public GetAuthorizationsClaimsArgs()
        {
        }
        public static new GetAuthorizationsClaimsArgs Empty => new GetAuthorizationsClaimsArgs();
    }

    public sealed class GetAuthorizationsClaimsInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("apiAuthorizationsId", required: true)]
        public Input<string> ApiAuthorizationsId { get; set; } = null!;

        [Input("attributeTransformations")]
        public Input<string>? AttributeTransformations { get; set; }

        [Input("defaultValues")]
        public Input<string>? DefaultValues { get; set; }

        [Input("filters")]
        private InputList<Inputs.GetAuthorizationsClaimsFilterInputArgs>? _filters;
        public InputList<Inputs.GetAuthorizationsClaimsFilterInputArgs> Filters
        {
            get => _filters ?? (_filters = new InputList<Inputs.GetAuthorizationsClaimsFilterInputArgs>());
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

        public GetAuthorizationsClaimsInvokeArgs()
        {
        }
        public static new GetAuthorizationsClaimsInvokeArgs Empty => new GetAuthorizationsClaimsInvokeArgs();
    }


    [OutputType]
    public sealed class GetAuthorizationsClaimsResult
    {
        public readonly string ApiAuthorizationsId;
        public readonly string AttributeTransformations;
        public readonly string DefaultValues;
        public readonly ImmutableArray<Outputs.GetAuthorizationsClaimsFilterResult> Filters;
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
        private GetAuthorizationsClaimsResult(
            string apiAuthorizationsId,

            string attributeTransformations,

            string defaultValues,

            ImmutableArray<Outputs.GetAuthorizationsClaimsFilterResult> filters,

            string id,

            string label,

            bool provisionedEntitlements,

            bool skipIfBlank,

            string userAttributeMacros,

            string userAttributeMappings,

            ImmutableArray<string> values)
        {
            ApiAuthorizationsId = apiAuthorizationsId;
            AttributeTransformations = attributeTransformations;
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