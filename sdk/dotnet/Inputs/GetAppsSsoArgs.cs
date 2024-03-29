// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Onelogin.Inputs
{

    public sealed class GetAppsSsoInputArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// App Name.	This is only returned after Creating a SAML App.
        /// </summary>
        [Input("acsUrl", required: true)]
        public Input<string> AcsUrl { get; set; } = null!;

        /// <summary>
        /// The certificate used for signing.	This is only returned after Creating a SAML App.
        /// </summary>
        [Input("certificate", required: true)]
        public Input<Inputs.GetAppsSsoCertificateInputArgs> Certificate { get; set; } = null!;

        /// <summary>
        /// The OpenId Connect Client Id. Note that client_secret is only returned after Creating an OIDC App.
        /// </summary>
        [Input("clientId", required: true)]
        public Input<string> ClientId { get; set; } = null!;

        /// <summary>
        /// OpenId Connet Client Secret
        /// </summary>
        [Input("clientSecret", required: true)]
        public Input<string> ClientSecret { get; set; } = null!;

        /// <summary>
        /// Issuer of app.	This is only returned after Creating a SAML App.
        /// </summary>
        [Input("issuer", required: true)]
        public Input<string> Issuer { get; set; } = null!;

        /// <summary>
        /// ID of the apps underlying connector.	This is only returned after Creating a SAML App.
        /// </summary>
        [Input("metadataUrl", required: true)]
        public Input<string> MetadataUrl { get; set; } = null!;

        public GetAppsSsoInputArgs()
        {
        }
        public static new GetAppsSsoInputArgs Empty => new GetAppsSsoInputArgs();
    }
}
