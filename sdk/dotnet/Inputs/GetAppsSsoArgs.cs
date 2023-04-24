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
        [Input("acsUrl", required: true)]
        public Input<string> AcsUrl { get; set; } = null!;

        [Input("certificate", required: true)]
        public Input<Inputs.GetAppsSsoCertificateInputArgs> Certificate { get; set; } = null!;

        [Input("clientId", required: true)]
        public Input<string> ClientId { get; set; } = null!;

        [Input("clientSecret", required: true)]
        public Input<string> ClientSecret { get; set; } = null!;

        [Input("issuer", required: true)]
        public Input<string> Issuer { get; set; } = null!;

        [Input("metadataUrl", required: true)]
        public Input<string> MetadataUrl { get; set; } = null!;

        public GetAppsSsoInputArgs()
        {
        }
        public static new GetAppsSsoInputArgs Empty => new GetAppsSsoInputArgs();
    }
}
