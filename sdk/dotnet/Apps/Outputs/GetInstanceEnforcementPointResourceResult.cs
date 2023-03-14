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
    public sealed class GetInstanceEnforcementPointResourceResult
    {
        public readonly string Conditions;
        public readonly bool IsPathRegex;
        public readonly string Path;
        public readonly string Permission;
        public readonly bool RequireAuth;

        [OutputConstructor]
        private GetInstanceEnforcementPointResourceResult(
            string conditions,

            bool isPathRegex,

            string path,

            string permission,

            bool requireAuth)
        {
            Conditions = conditions;
            IsPathRegex = isPathRegex;
            Path = path;
            Permission = permission;
            RequireAuth = requireAuth;
        }
    }
}
