// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Onelogin.Apps.Inputs
{

    public sealed class GetInstanceEnforcementPointInputArgs : global::Pulumi.ResourceArgs
    {
        [Input("caseSensitive", required: true)]
        public Input<bool> CaseSensitive { get; set; } = null!;

        [Input("conditions", required: true)]
        public Input<string> Conditions { get; set; } = null!;

        [Input("contextRoot", required: true)]
        public Input<string> ContextRoot { get; set; } = null!;

        [Input("landingPage", required: true)]
        public Input<string> LandingPage { get; set; } = null!;

        [Input("permissions", required: true)]
        public Input<string> Permissions { get; set; } = null!;

        [Input("requireSitewideAuthentication", required: true)]
        public Input<bool> RequireSitewideAuthentication { get; set; } = null!;

        [Input("resources", required: true)]
        private InputList<Inputs.GetInstanceEnforcementPointResourceInputArgs>? _resources;
        public InputList<Inputs.GetInstanceEnforcementPointResourceInputArgs> Resources
        {
            get => _resources ?? (_resources = new InputList<Inputs.GetInstanceEnforcementPointResourceInputArgs>());
            set => _resources = value;
        }

        [Input("sessionExpiryFixed", required: true)]
        public Input<Inputs.GetInstanceEnforcementPointSessionExpiryFixedInputArgs> SessionExpiryFixed { get; set; } = null!;

        [Input("sessionExpiryInactivity", required: true)]
        public Input<Inputs.GetInstanceEnforcementPointSessionExpiryInactivityInputArgs> SessionExpiryInactivity { get; set; } = null!;

        [Input("target", required: true)]
        public Input<string> Target { get; set; } = null!;

        [Input("token", required: true)]
        public Input<string> Token { get; set; } = null!;

        [Input("useTargetHostHeader", required: true)]
        public Input<bool> UseTargetHostHeader { get; set; } = null!;

        [Input("vhost", required: true)]
        public Input<string> Vhost { get; set; } = null!;

        public GetInstanceEnforcementPointInputArgs()
        {
        }
        public static new GetInstanceEnforcementPointInputArgs Empty => new GetInstanceEnforcementPointInputArgs();
    }
}