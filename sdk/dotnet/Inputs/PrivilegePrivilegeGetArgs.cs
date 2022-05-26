// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Onelogin.Inputs
{

    public sealed class PrivilegePrivilegeGetArgs : Pulumi.ResourceArgs
    {
        [Input("statements", required: true)]
        private InputList<Inputs.PrivilegePrivilegeStatementGetArgs>? _statements;

        /// <summary>
        /// At least one `statement` is required. Statements describe the effect granted to a resource type. In this case it allow's the privilege holder to lisst apps and users.
        /// </summary>
        public InputList<Inputs.PrivilegePrivilegeStatementGetArgs> Statements
        {
            get => _statements ?? (_statements = new InputList<Inputs.PrivilegePrivilegeStatementGetArgs>());
            set => _statements = value;
        }

        [Input("version")]
        public Input<string>? Version { get; set; }

        public PrivilegePrivilegeGetArgs()
        {
        }
    }
}