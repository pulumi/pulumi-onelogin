// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.onelogin.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GetPrivilegesInstancePrivilegeStatementArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetPrivilegesInstancePrivilegeStatementArgs Empty = new GetPrivilegesInstancePrivilegeStatementArgs();

    /**
     * An array of strings that represent actions within OneLogin. Actions are prefixed with the class of object they are related to and followed by a specific action for the given class.
     * e.g. users:List, where the class is users and the specific action is List. Don’t mix classes within an Action array. To create a privilege that includes multiple different classes, create multiple statements. A wildcard * that includes all actions is supported. Use wildcards to create a Super User privilege.
     * 
     */
    @Import(name="actions", required=true)
    private Output<List<String>> actions;

    /**
     * @return An array of strings that represent actions within OneLogin. Actions are prefixed with the class of object they are related to and followed by a specific action for the given class.
     * e.g. users:List, where the class is users and the specific action is List. Don’t mix classes within an Action array. To create a privilege that includes multiple different classes, create multiple statements. A wildcard * that includes all actions is supported. Use wildcards to create a Super User privilege.
     * 
     */
    public Output<List<String>> actions() {
        return this.actions;
    }

    /**
     * Set to “Allow.” By default, all actions are denied, this Statement allows the listed actions to be executed.
     * 
     */
    @Import(name="effect", required=true)
    private Output<String> effect;

    /**
     * @return Set to “Allow.” By default, all actions are denied, this Statement allows the listed actions to be executed.
     * 
     */
    public Output<String> effect() {
        return this.effect;
    }

    /**
     * Target the privileged action against specific resources with the scope.
     * The scope pattern is the class of object used by the Action, followed by an ID that represents a resource in OneLogin.
     * e.g. apps/1234, where apps is the class and 1234 is the ID of an app.
     * The wildcard * is supported and indicates that all resources of the class type declared, in the Action, are in scope.
     * The Action and Scope classes must match. However, there is an exception, a scope of roles/{role_id} can be combined with Actions on the user or app class. The exception allows you to target groups of users or apps with specific actions.
     * 
     */
    @Import(name="scopes", required=true)
    private Output<List<String>> scopes;

    /**
     * @return Target the privileged action against specific resources with the scope.
     * The scope pattern is the class of object used by the Action, followed by an ID that represents a resource in OneLogin.
     * e.g. apps/1234, where apps is the class and 1234 is the ID of an app.
     * The wildcard * is supported and indicates that all resources of the class type declared, in the Action, are in scope.
     * The Action and Scope classes must match. However, there is an exception, a scope of roles/{role_id} can be combined with Actions on the user or app class. The exception allows you to target groups of users or apps with specific actions.
     * 
     */
    public Output<List<String>> scopes() {
        return this.scopes;
    }

    private GetPrivilegesInstancePrivilegeStatementArgs() {}

    private GetPrivilegesInstancePrivilegeStatementArgs(GetPrivilegesInstancePrivilegeStatementArgs $) {
        this.actions = $.actions;
        this.effect = $.effect;
        this.scopes = $.scopes;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPrivilegesInstancePrivilegeStatementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPrivilegesInstancePrivilegeStatementArgs $;

        public Builder() {
            $ = new GetPrivilegesInstancePrivilegeStatementArgs();
        }

        public Builder(GetPrivilegesInstancePrivilegeStatementArgs defaults) {
            $ = new GetPrivilegesInstancePrivilegeStatementArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param actions An array of strings that represent actions within OneLogin. Actions are prefixed with the class of object they are related to and followed by a specific action for the given class.
         * e.g. users:List, where the class is users and the specific action is List. Don’t mix classes within an Action array. To create a privilege that includes multiple different classes, create multiple statements. A wildcard * that includes all actions is supported. Use wildcards to create a Super User privilege.
         * 
         * @return builder
         * 
         */
        public Builder actions(Output<List<String>> actions) {
            $.actions = actions;
            return this;
        }

        /**
         * @param actions An array of strings that represent actions within OneLogin. Actions are prefixed with the class of object they are related to and followed by a specific action for the given class.
         * e.g. users:List, where the class is users and the specific action is List. Don’t mix classes within an Action array. To create a privilege that includes multiple different classes, create multiple statements. A wildcard * that includes all actions is supported. Use wildcards to create a Super User privilege.
         * 
         * @return builder
         * 
         */
        public Builder actions(List<String> actions) {
            return actions(Output.of(actions));
        }

        /**
         * @param actions An array of strings that represent actions within OneLogin. Actions are prefixed with the class of object they are related to and followed by a specific action for the given class.
         * e.g. users:List, where the class is users and the specific action is List. Don’t mix classes within an Action array. To create a privilege that includes multiple different classes, create multiple statements. A wildcard * that includes all actions is supported. Use wildcards to create a Super User privilege.
         * 
         * @return builder
         * 
         */
        public Builder actions(String... actions) {
            return actions(List.of(actions));
        }

        /**
         * @param effect Set to “Allow.” By default, all actions are denied, this Statement allows the listed actions to be executed.
         * 
         * @return builder
         * 
         */
        public Builder effect(Output<String> effect) {
            $.effect = effect;
            return this;
        }

        /**
         * @param effect Set to “Allow.” By default, all actions are denied, this Statement allows the listed actions to be executed.
         * 
         * @return builder
         * 
         */
        public Builder effect(String effect) {
            return effect(Output.of(effect));
        }

        /**
         * @param scopes Target the privileged action against specific resources with the scope.
         * The scope pattern is the class of object used by the Action, followed by an ID that represents a resource in OneLogin.
         * e.g. apps/1234, where apps is the class and 1234 is the ID of an app.
         * The wildcard * is supported and indicates that all resources of the class type declared, in the Action, are in scope.
         * The Action and Scope classes must match. However, there is an exception, a scope of roles/{role_id} can be combined with Actions on the user or app class. The exception allows you to target groups of users or apps with specific actions.
         * 
         * @return builder
         * 
         */
        public Builder scopes(Output<List<String>> scopes) {
            $.scopes = scopes;
            return this;
        }

        /**
         * @param scopes Target the privileged action against specific resources with the scope.
         * The scope pattern is the class of object used by the Action, followed by an ID that represents a resource in OneLogin.
         * e.g. apps/1234, where apps is the class and 1234 is the ID of an app.
         * The wildcard * is supported and indicates that all resources of the class type declared, in the Action, are in scope.
         * The Action and Scope classes must match. However, there is an exception, a scope of roles/{role_id} can be combined with Actions on the user or app class. The exception allows you to target groups of users or apps with specific actions.
         * 
         * @return builder
         * 
         */
        public Builder scopes(List<String> scopes) {
            return scopes(Output.of(scopes));
        }

        /**
         * @param scopes Target the privileged action against specific resources with the scope.
         * The scope pattern is the class of object used by the Action, followed by an ID that represents a resource in OneLogin.
         * e.g. apps/1234, where apps is the class and 1234 is the ID of an app.
         * The wildcard * is supported and indicates that all resources of the class type declared, in the Action, are in scope.
         * The Action and Scope classes must match. However, there is an exception, a scope of roles/{role_id} can be combined with Actions on the user or app class. The exception allows you to target groups of users or apps with specific actions.
         * 
         * @return builder
         * 
         */
        public Builder scopes(String... scopes) {
            return scopes(List.of(scopes));
        }

        public GetPrivilegesInstancePrivilegeStatementArgs build() {
            if ($.actions == null) {
                throw new MissingRequiredPropertyException("GetPrivilegesInstancePrivilegeStatementArgs", "actions");
            }
            if ($.effect == null) {
                throw new MissingRequiredPropertyException("GetPrivilegesInstancePrivilegeStatementArgs", "effect");
            }
            if ($.scopes == null) {
                throw new MissingRequiredPropertyException("GetPrivilegesInstancePrivilegeStatementArgs", "scopes");
            }
            return $;
        }
    }

}
