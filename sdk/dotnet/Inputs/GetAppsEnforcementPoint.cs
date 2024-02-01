// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Onelogin.Inputs
{

    public sealed class GetAppsEnforcementPointArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The URL path evaluation is case insensitive by default. Resources hosted on web servers such as Apache, NGINX and Java EE are case sensitive paths. Web servers such as Microsoft IIS are not case-sensitive.
        /// </summary>
        [Input("caseSensitive", required: true)]
        public bool CaseSensitive { get; set; }

        /// <summary>
        /// If access is conditional, the conditions that must evaluate to true to allow access to a resource. For example, to require the user must be authenticated and have either the role Admin or User
        /// </summary>
        [Input("conditions", required: true)]
        public string Conditions { get; set; } = null!;

        /// <summary>
        /// The root path to the application, often the name of the application. Can be any name, path or just a slash (“/”). The context root uniquely identifies the application within the enforcement point.
        /// </summary>
        [Input("contextRoot", required: true)]
        public string ContextRoot { get; set; } = null!;

        /// <summary>
        /// The location within the context root to which the browser will be redirected for IdP-initiated single sign-on. For example, the landing page might be an index page in the context root such as index.html or default.aspx. The landing page cannot begin with a slash and must use valid URL characters.
        /// </summary>
        [Input("landingPage", required: true)]
        public string LandingPage { get; set; } = null!;

        /// <summary>
        /// Specify to always `allow`, `deny` access to resources, of if access is `conditional`.
        /// </summary>
        [Input("permissions", required: true)]
        public string Permissions { get; set; } = null!;

        /// <summary>
        /// Require user authentication to access any resource protected by this enforcement point.
        /// </summary>
        [Input("requireSitewideAuthentication", required: true)]
        public bool RequireSitewideAuthentication { get; set; }

        [Input("resources", required: true)]
        private List<Inputs.GetAppsEnforcementPointResourceArgs>? _resources;

        /// <summary>
        /// Array of resource objects
        /// </summary>
        public List<Inputs.GetAppsEnforcementPointResourceArgs> Resources
        {
            get => _resources ?? (_resources = new List<Inputs.GetAppsEnforcementPointResourceArgs>());
            set => _resources = value;
        }

        /// <summary>
        /// unit: - 0 = Seconds - 1 = Minutes - 2 = Hours value: - When Unit = 0 or 1 value must be 0-60 - When Unit = 2 value must be 0-24
        /// </summary>
        [Input("sessionExpiryFixed", required: true)]
        public Inputs.GetAppsEnforcementPointSessionExpiryFixedArgs SessionExpiryFixed { get; set; } = null!;

        /// <summary>
        /// unit: - 0 = Seconds - 1 = Minutes - 2 = Hours value: - When Unit = 0 or 1 value must be 0-60 - When Unit = 2 value must be 0-24
        /// </summary>
        [Input("sessionExpiryInactivity", required: true)]
        public Inputs.GetAppsEnforcementPointSessionExpiryInactivityArgs SessionExpiryInactivity { get; set; } = null!;

        /// <summary>
        /// A fully-qualified URL to the internal application including scheme, authority and path. The target host authority must be an IP address, not a hostname.
        /// </summary>
        [Input("target", required: true)]
        public string Target { get; set; } = null!;

        /// <summary>
        /// Can only be set on create. Access Gateway Token.
        /// </summary>
        [Input("token", required: true)]
        public string Token { get; set; } = null!;

        /// <summary>
        /// Use the target host header as opposed to the original gateway or upstream host header.
        /// </summary>
        [Input("useTargetHostHeader", required: true)]
        public bool UseTargetHostHeader { get; set; }

        /// <summary>
        /// A comma-delimited list of one or more virtual hosts that map to applications assigned to the enforcement point. A VHOST may be a host name or an IP address. VHOST distinguish between applications that are at the same context root.
        /// </summary>
        [Input("vhost", required: true)]
        public string Vhost { get; set; } = null!;

        public GetAppsEnforcementPointArgs()
        {
        }
        public static new GetAppsEnforcementPointArgs Empty => new GetAppsEnforcementPointArgs();
    }
}
