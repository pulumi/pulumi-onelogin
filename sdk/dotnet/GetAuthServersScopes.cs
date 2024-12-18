// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Onelogin
{
    public static class GetAuthServersScopes
    {
        public static Task<GetAuthServersScopesResult> InvokeAsync(GetAuthServersScopesArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetAuthServersScopesResult>("onelogin:index/getAuthServersScopes:getAuthServersScopes", args ?? new GetAuthServersScopesArgs(), options.WithDefaults());

        public static Output<GetAuthServersScopesResult> Invoke(GetAuthServersScopesInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetAuthServersScopesResult>("onelogin:index/getAuthServersScopes:getAuthServersScopes", args ?? new GetAuthServersScopesInvokeArgs(), options.WithDefaults());

        public static Output<GetAuthServersScopesResult> Invoke(GetAuthServersScopesInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetAuthServersScopesResult>("onelogin:index/getAuthServersScopes:getAuthServersScopes", args ?? new GetAuthServersScopesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetAuthServersScopesArgs : global::Pulumi.InvokeArgs
    {
        [Input("authServersId", required: true)]
        public string AuthServersId { get; set; } = null!;

        [Input("description")]
        public string? Description { get; set; }

        [Input("filters")]
        private List<Inputs.GetAuthServersScopesFilterArgs>? _filters;
        public List<Inputs.GetAuthServersScopesFilterArgs> Filters
        {
            get => _filters ?? (_filters = new List<Inputs.GetAuthServersScopesFilterArgs>());
            set => _filters = value;
        }

        [Input("value")]
        public string? Value { get; set; }

        public GetAuthServersScopesArgs()
        {
        }
        public static new GetAuthServersScopesArgs Empty => new GetAuthServersScopesArgs();
    }

    public sealed class GetAuthServersScopesInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("authServersId", required: true)]
        public Input<string> AuthServersId { get; set; } = null!;

        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("filters")]
        private InputList<Inputs.GetAuthServersScopesFilterInputArgs>? _filters;
        public InputList<Inputs.GetAuthServersScopesFilterInputArgs> Filters
        {
            get => _filters ?? (_filters = new InputList<Inputs.GetAuthServersScopesFilterInputArgs>());
            set => _filters = value;
        }

        [Input("value")]
        public Input<string>? Value { get; set; }

        public GetAuthServersScopesInvokeArgs()
        {
        }
        public static new GetAuthServersScopesInvokeArgs Empty => new GetAuthServersScopesInvokeArgs();
    }


    [OutputType]
    public sealed class GetAuthServersScopesResult
    {
        public readonly string AuthServersId;
        public readonly string Description;
        public readonly ImmutableArray<Outputs.GetAuthServersScopesFilterResult> Filters;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string Value;

        [OutputConstructor]
        private GetAuthServersScopesResult(
            string authServersId,

            string description,

            ImmutableArray<Outputs.GetAuthServersScopesFilterResult> filters,

            string id,

            string value)
        {
            AuthServersId = authServersId;
            Description = description;
            Filters = filters;
            Id = id;
            Value = value;
        }
    }
}
