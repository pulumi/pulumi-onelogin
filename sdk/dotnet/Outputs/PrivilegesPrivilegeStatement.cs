// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Onelogin.Outputs
{

    [OutputType]
    public sealed class PrivilegesPrivilegeStatement
    {
        /// <summary>
        /// An array of strings that represent actions within OneLogin. Actions are prefixed with the class of object they are related to and followed by a specific action for the given class.
        /// e.g. users:List, where the class is users and the specific action is List. Don’t mix classes within an Action array. To create a privilege that includes multiple different classes, create multiple statements. A wildcard * that includes all actions is supported. Use wildcards to create a Super User privilege.
        /// </summary>
        public readonly ImmutableArray<string> Actions;
        /// <summary>
        /// Set to “Allow.” By default, all actions are denied, this Statement allows the listed actions to be executed.
        /// </summary>
        public readonly string Effect;
        /// <summary>
        /// Target the privileged action against specific resources with the scope.
        /// The scope pattern is the class of object used by the Action, followed by an ID that represents a resource in OneLogin.
        /// e.g. apps/1234, where apps is the class and 1234 is the ID of an app.
        /// The wildcard * is supported and indicates that all resources of the class type declared, in the Action, are in scope.
        /// The Action and Scope classes must match. However, there is an exception, a scope of roles/{role_id} can be combined with Actions on the user or app class. The exception allows you to target groups of users or apps with specific actions.
        /// </summary>
        public readonly ImmutableArray<string> Scopes;

        [OutputConstructor]
        private PrivilegesPrivilegeStatement(
            ImmutableArray<string> actions,

            string effect,

            ImmutableArray<string> scopes)
        {
            Actions = actions;
            Effect = effect;
            Scopes = scopes;
        }
    }
}
