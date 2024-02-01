// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Onelogin.Inputs
{

    public sealed class AppSsoGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// App Name.	This is only returned after Creating a SAML App.
        /// </summary>
        [Input("acsUrl")]
        public Input<string>? AcsUrl { get; set; }

        /// <summary>
        /// The certificate used for signing.	This is only returned after Creating a SAML App.
        /// </summary>
        [Input("certificate")]
        public Input<Inputs.AppSsoCertificateGetArgs>? Certificate { get; set; }

        /// <summary>
        /// The OpenId Connect Client Id. Note that client_secret is only returned after Creating an OIDC App.
        /// </summary>
        [Input("clientId")]
        public Input<string>? ClientId { get; set; }

        /// <summary>
        /// OpenId Connet Client Secret
        /// </summary>
        [Input("clientSecret")]
        public Input<string>? ClientSecret { get; set; }

        /// <summary>
        /// Issuer of app.	This is only returned after Creating a SAML App.
        /// </summary>
        [Input("issuer")]
        public Input<string>? Issuer { get; set; }

        /// <summary>
        /// ID of the apps underlying connector.	This is only returned after Creating a SAML App.
        /// </summary>
        [Input("metadataUrl")]
        public Input<string>? MetadataUrl { get; set; }

        public AppSsoGetArgs()
        {
        }
        public static new AppSsoGetArgs Empty => new AppSsoGetArgs();
    }
}
