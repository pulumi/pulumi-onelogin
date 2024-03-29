// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.onelogin.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GetMappingsAction extends com.pulumi.resources.InvokeArgs {

    public static final GetMappingsAction Empty = new GetMappingsAction();

    /**
     * The action to apply
     * 
     */
    @Import(name="action", required=true)
    private String action;

    /**
     * @return The action to apply
     * 
     */
    public String action() {
        return this.action;
    }

    /**
     * Only applicable to provisioned and set_* actions. Items in the array will be a plain text string or valid value for the selected action.
     * 
     */
    @Import(name="values", required=true)
    private List<String> values;

    /**
     * @return Only applicable to provisioned and set_* actions. Items in the array will be a plain text string or valid value for the selected action.
     * 
     */
    public List<String> values() {
        return this.values;
    }

    private GetMappingsAction() {}

    private GetMappingsAction(GetMappingsAction $) {
        this.action = $.action;
        this.values = $.values;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetMappingsAction defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetMappingsAction $;

        public Builder() {
            $ = new GetMappingsAction();
        }

        public Builder(GetMappingsAction defaults) {
            $ = new GetMappingsAction(Objects.requireNonNull(defaults));
        }

        /**
         * @param action The action to apply
         * 
         * @return builder
         * 
         */
        public Builder action(String action) {
            $.action = action;
            return this;
        }

        /**
         * @param values Only applicable to provisioned and set_* actions. Items in the array will be a plain text string or valid value for the selected action.
         * 
         * @return builder
         * 
         */
        public Builder values(List<String> values) {
            $.values = values;
            return this;
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

        public GetMappingsAction build() {
            if ($.action == null) {
                throw new MissingRequiredPropertyException("GetMappingsAction", "action");
            }
            if ($.values == null) {
                throw new MissingRequiredPropertyException("GetMappingsAction", "values");
            }
            return $;
        }
    }

}
