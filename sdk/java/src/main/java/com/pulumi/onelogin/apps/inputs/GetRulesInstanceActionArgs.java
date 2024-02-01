// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.onelogin.apps.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GetRulesInstanceActionArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetRulesInstanceActionArgs Empty = new GetRulesInstanceActionArgs();

    /**
     * The action to apply
     * 
     */
    @Import(name="action", required=true)
    private Output<String> action;

    /**
     * @return The action to apply
     * 
     */
    public Output<String> action() {
        return this.action;
    }

    /**
     * Only applicable to provisioned and set_* actions. Items in the array will be a plain text string or valid value for the selected action.
     * 
     */
    @Import(name="values", required=true)
    private Output<List<String>> values;

    /**
     * @return Only applicable to provisioned and set_* actions. Items in the array will be a plain text string or valid value for the selected action.
     * 
     */
    public Output<List<String>> values() {
        return this.values;
    }

    private GetRulesInstanceActionArgs() {}

    private GetRulesInstanceActionArgs(GetRulesInstanceActionArgs $) {
        this.action = $.action;
        this.values = $.values;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRulesInstanceActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRulesInstanceActionArgs $;

        public Builder() {
            $ = new GetRulesInstanceActionArgs();
        }

        public Builder(GetRulesInstanceActionArgs defaults) {
            $ = new GetRulesInstanceActionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param action The action to apply
         * 
         * @return builder
         * 
         */
        public Builder action(Output<String> action) {
            $.action = action;
            return this;
        }

        /**
         * @param action The action to apply
         * 
         * @return builder
         * 
         */
        public Builder action(String action) {
            return action(Output.of(action));
        }

        /**
         * @param values Only applicable to provisioned and set_* actions. Items in the array will be a plain text string or valid value for the selected action.
         * 
         * @return builder
         * 
         */
        public Builder values(Output<List<String>> values) {
            $.values = values;
            return this;
        }

        /**
         * @param values Only applicable to provisioned and set_* actions. Items in the array will be a plain text string or valid value for the selected action.
         * 
         * @return builder
         * 
         */
        public Builder values(List<String> values) {
            return values(Output.of(values));
        }

        /**
         * @param values Only applicable to provisioned and set_* actions. Items in the array will be a plain text string or valid value for the selected action.
         * 
         * @return builder
         * 
         */
        public Builder values(String... values) {
            return values(List.of(values));
        }

        public GetRulesInstanceActionArgs build() {
            if ($.action == null) {
                throw new MissingRequiredPropertyException("GetRulesInstanceActionArgs", "action");
            }
            if ($.values == null) {
                throw new MissingRequiredPropertyException("GetRulesInstanceActionArgs", "values");
            }
            return $;
        }
    }

}
