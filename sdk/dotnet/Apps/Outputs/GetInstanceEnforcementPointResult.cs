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
        /// <summary>
        /// The URL path evaluation is case insensitive by default. Resources hosted on web servers such as Apache, NGINX and Java EE are case sensitive paths. Web servers such as Microsoft IIS are not case-sensitive.
        /// </summary>
        public readonly bool CaseSensitive;
        /// <summary>
        /// If access is conditional, the conditions that must evaluate to true to allow access to a resource. For example, to require the user must be authenticated and have either the role Admin or User
        /// </summary>
        public readonly string Conditions;
        /// <summary>
        /// The root path to the application, often the name of the application. Can be any name, path or just a slash (“/”). The context root uniquely identifies the application within the enforcement point.
        /// </summary>
        public readonly string ContextRoot;
        /// <summary>
        /// The location within the context root to which the browser will be redirected for IdP-initiated single sign-on. For example, the landing page might be an index page in the context root such as index.html or default.aspx. The landing page cannot begin with a slash and must use valid URL characters.
        /// </summary>
        public readonly string LandingPage;
        /// <summary>
        /// Specify to always `allow`, `deny` access to resources, of if access is `conditional`.
        /// </summary>
        public readonly string Permissions;
        /// <summary>
        /// Require user authentication to access any resource protected by this enforcement point.
        /// </summary>
        public readonly bool RequireSitewideAuthentication;
        /// <summary>
        /// Array of resource objects
        /// </summary>
        public readonly ImmutableArray<Outputs.GetInstanceEnforcementPointResourceResult> Resources;
        /// <summary>
        /// unit: - 0 = Seconds - 1 = Minutes - 2 = Hours value: - When Unit = 0 or 1 value must be 0-60 - When Unit = 2 value must be 0-24
        /// </summary>
        public readonly Outputs.GetInstanceEnforcementPointSessionExpiryFixedResult SessionExpiryFixed;
        /// <summary>
        /// unit: - 0 = Seconds - 1 = Minutes - 2 = Hours value: - When Unit = 0 or 1 value must be 0-60 - When Unit = 2 value must be 0-24
        /// </summary>
        public readonly Outputs.GetInstanceEnforcementPointSessionExpiryInactivityResult SessionExpiryInactivity;
        /// <summary>
        /// A fully-qualified URL to the internal application including scheme, authority and path. The target host authority must be an IP address, not a hostname.
        /// </summary>
        public readonly string Target;
        /// <summary>
        /// Can only be set on create. Access Gateway Token.
        /// </summary>
        public readonly string Token;
        /// <summary>
        /// Use the target host header as opposed to the original gateway or upstream host header.
        /// </summary>
        public readonly bool UseTargetHostHeader;
        /// <summary>
        /// A comma-delimited list of one or more virtual hosts that map to applications assigned to the enforcement point. A VHOST may be a host name or an IP address. VHOST distinguish between applications that are at the same context root.
        /// </summary>
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
