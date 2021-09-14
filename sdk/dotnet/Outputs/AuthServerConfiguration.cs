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
        public readonly int? AccessTokenExpirationMinutes;
        public readonly ImmutableArray<string> Audiences;
        public readonly int? RefreshTokenExpirationMinutes;
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
