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
    public sealed class AuthServerConfiguration
    {
        /// <summary>
        /// The number of minutes until the token expires
        /// </summary>
        public readonly int? AccessTokenExpirationMinutes;
        /// <summary>
        /// List of API endpoints that will be returned in Access Tokens.
        /// </summary>
        public readonly ImmutableArray<string> Audiences;
        /// <summary>
        /// The number of minutes until the token expires
        /// </summary>
        public readonly int? RefreshTokenExpirationMinutes;
        /// <summary>
        /// Unique identifier for the API that the Authorization Server will issue Access Tokens for.
        /// </summary>
        public readonly string ResourceIdentifier;

        [OutputConstructor]
        private AuthServerConfiguration(
            int? accessTokenExpirationMinutes,

            ImmutableArray<string> audiences,

            int? refreshTokenExpirationMinutes,

            string resourceIdentifier)
        {
            AccessTokenExpirationMinutes = accessTokenExpirationMinutes;
            Audiences = audiences;
            RefreshTokenExpirationMinutes = refreshTokenExpirationMinutes;
            ResourceIdentifier = resourceIdentifier;
        }
    }
}
