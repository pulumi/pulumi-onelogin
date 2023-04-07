// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Onelogin.Inputs
{

    public sealed class GetPrivilegesInstancePrivilegeArgs : global::Pulumi.InvokeArgs
    {
        [Input("statements", required: true)]
        private List<Inputs.GetPrivilegesInstancePrivilegeStatementArgs>? _statements;
        public List<Inputs.GetPrivilegesInstancePrivilegeStatementArgs> Statements
        {
            get => _statements ?? (_statements = new List<Inputs.GetPrivilegesInstancePrivilegeStatementArgs>());
            set => _statements = value;
        }

        [Input("version", required: true)]
        public string Version { get; set; } = null!;

        public GetPrivilegesInstancePrivilegeArgs()
        {
        }
        public static new GetPrivilegesInstancePrivilegeArgs Empty => new GetPrivilegesInstancePrivilegeArgs();
    }
}