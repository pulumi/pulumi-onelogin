// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Onelogin.Inputs
{

    public sealed class AuthServersConfigurationGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("accessTokenExpirationMinutes")]
        public Input<int>? AccessTokenExpirationMinutes { get; set; }

        [Input("audiences", required: true)]
        private InputList<string>? _audiences;
        public InputList<string> Audiences
        {
            get => _audiences ?? (_audiences = new InputList<string>());
            set => _audiences = value;
        }

        [Input("refreshTokenExpirationMinutes")]
        public Input<int>? RefreshTokenExpirationMinutes { get; set; }

        [Input("resourceIdentifier", required: true)]
        public Input<string> ResourceIdentifier { get; set; } = null!;

        public AuthServersConfigurationGetArgs()
        {
        }
        public static new AuthServersConfigurationGetArgs Empty => new AuthServersConfigurationGetArgs();
    }
}