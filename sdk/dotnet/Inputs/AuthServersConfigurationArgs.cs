// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Onelogin.Inputs
{

    public sealed class AuthServersConfigurationArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The number of minutes until access token expires. There is no maximum expiry limit.
        /// </summary>
        [Input("accessTokenExpirationMinutes")]
        public Input<int>? AccessTokenExpirationMinutes { get; set; }

        [Input("audiences", required: true)]
        private InputList<string>? _audiences;

        /// <summary>
        /// List of API endpoints that will be returned in Access Tokens.
        /// </summary>
        public InputList<string> Audiences
        {
            get => _audiences ?? (_audiences = new InputList<string>());
            set => _audiences = value;
        }

        /// <summary>
        /// The number of minutes until refresh token expires. There is no maximum expiry limit.
        /// </summary>
        [Input("refreshTokenExpirationMinutes")]
        public Input<int>? RefreshTokenExpirationMinutes { get; set; }

        /// <summary>
        /// Unique identifier for the API that the Authorization Server will issue Access Tokens for.
        /// </summary>
        [Input("resourceIdentifier", required: true)]
        public Input<string> ResourceIdentifier { get; set; } = null!;

        public AuthServersConfigurationArgs()
        {
        }
        public static new AuthServersConfigurationArgs Empty => new AuthServersConfigurationArgs();
    }
}
