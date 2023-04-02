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
    public sealed class GetAppsConfigurationResult
    {
        public readonly int AccessTokenExpirationMinutes;
        public readonly string LoginUrl;
        public readonly int OidcApplicationType;
        public readonly string RedirectUri;
        public readonly int TokenEndpointAuthMethod;

        [OutputConstructor]
        private GetAppsConfigurationResult(
            int accessTokenExpirationMinutes,

            string loginUrl,

            int oidcApplicationType,

            string redirectUri,

            int tokenEndpointAuthMethod)
        {
            AccessTokenExpirationMinutes = accessTokenExpirationMinutes;
            LoginUrl = loginUrl;
            OidcApplicationType = oidcApplicationType;
            RedirectUri = redirectUri;
            TokenEndpointAuthMethod = tokenEndpointAuthMethod;
        }
    }
}
