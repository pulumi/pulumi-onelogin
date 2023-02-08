// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Onelogin.Api.Inputs
{

    public sealed class GetAuthorizationsScopesConfigurationInputArgs : global::Pulumi.ResourceArgs
    {
        [Input("accessTokenExpirationMinutes", required: true)]
        public Input<int> AccessTokenExpirationMinutes { get; set; } = null!;

        [Input("audiences", required: true)]
        private InputList<string>? _audiences;
        public InputList<string> Audiences
        {
            get => _audiences ?? (_audiences = new InputList<string>());
            set => _audiences = value;
        }

        [Input("refreshTokenExpirationMinutes", required: true)]
        public Input<int> RefreshTokenExpirationMinutes { get; set; } = null!;

        [Input("resourceIdentifier", required: true)]
        public Input<string> ResourceIdentifier { get; set; } = null!;

        public GetAuthorizationsScopesConfigurationInputArgs()
        {
        }
        public static new GetAuthorizationsScopesConfigurationInputArgs Empty => new GetAuthorizationsScopesConfigurationInputArgs();
    }
}
