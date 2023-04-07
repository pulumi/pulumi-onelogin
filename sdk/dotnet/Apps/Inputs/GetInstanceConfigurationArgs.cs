// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Onelogin.Apps.Inputs
{

    public sealed class GetInstanceConfigurationInputArgs : global::Pulumi.ResourceArgs
    {
        [Input("accessTokenExpirationMinutes", required: true)]
        public Input<int> AccessTokenExpirationMinutes { get; set; } = null!;

        [Input("loginUrl", required: true)]
        public Input<string> LoginUrl { get; set; } = null!;

        [Input("oidcApplicationType", required: true)]
        public Input<int> OidcApplicationType { get; set; } = null!;

        [Input("redirectUri", required: true)]
        public Input<string> RedirectUri { get; set; } = null!;

        [Input("tokenEndpointAuthMethod", required: true)]
        public Input<int> TokenEndpointAuthMethod { get; set; } = null!;

        public GetInstanceConfigurationInputArgs()
        {
        }
        public static new GetInstanceConfigurationInputArgs Empty => new GetInstanceConfigurationInputArgs();
    }
}