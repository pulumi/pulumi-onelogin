// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Onelogin.Apps.Outputs
{

    [OutputType]
    public sealed class GetInstanceEnforcementPointResult
    {
        public readonly bool CaseSensitive;
        public readonly string Conditions;
        public readonly string ContextRoot;
        public readonly string LandingPage;
        public readonly string Permissions;
        public readonly bool RequireSitewideAuthentication;
        public readonly ImmutableArray<Outputs.GetInstanceEnforcementPointResourceResult> Resources;
        public readonly Outputs.GetInstanceEnforcementPointSessionExpiryFixedResult SessionExpiryFixed;
        public readonly Outputs.GetInstanceEnforcementPointSessionExpiryInactivityResult SessionExpiryInactivity;
        public readonly string Target;
        public readonly string Token;
        public readonly bool UseTargetHostHeader;
        public readonly string Vhost;

        [OutputConstructor]
        private GetInstanceEnforcementPointResult(
            bool caseSensitive,

            string conditions,

            string contextRoot,

            string landingPage,

            string permissions,

            bool requireSitewideAuthentication,

            ImmutableArray<Outputs.GetInstanceEnforcementPointResourceResult> resources,

            Outputs.GetInstanceEnforcementPointSessionExpiryFixedResult sessionExpiryFixed,

            Outputs.GetInstanceEnforcementPointSessionExpiryInactivityResult sessionExpiryInactivity,

            string target,

            string token,

            bool useTargetHostHeader,

            string vhost)
        {
            CaseSensitive = caseSensitive;
            Conditions = conditions;
            ContextRoot = contextRoot;
            LandingPage = landingPage;
            Permissions = permissions;
            RequireSitewideAuthentication = requireSitewideAuthentication;
            Resources = resources;
            SessionExpiryFixed = sessionExpiryFixed;
            SessionExpiryInactivity = sessionExpiryInactivity;
            Target = target;
            Token = token;
            UseTargetHostHeader = useTargetHostHeader;
            Vhost = vhost;
        }
    }
}