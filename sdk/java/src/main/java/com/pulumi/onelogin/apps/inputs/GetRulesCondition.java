// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.onelogin.apps.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetRulesCondition extends com.pulumi.resources.InvokeArgs {

    public static final GetRulesCondition Empty = new GetRulesCondition();

    /**
     * A valid operator for the selected condition source
     * 
     */
    @Import(name="operator", required=true)
    private String operator;

    /**
     * @return A valid operator for the selected condition source
     * 
     */
    public String operator() {
        return this.operator;
    }

    /**
     * source field to check.
     * 
     */
    @Import(name="source", required=true)
    private String source;

    /**
     * @return source field to check.
     * 
     */
    public String source() {
        return this.source;
    }

    /**
     * A plain text string or valid value for the selected  condition source
     * 
     */
    @Import(name="value", required=true)
    private String value;

    /**
     * @return A plain text string or valid value for the selected  condition source
     * 
     */
    public String value() {
        return this.value;
    }

    private GetRulesCondition() {}

    private GetRulesCondition(GetRulesCondition $) {
        this.operator = $.operator;
        this.source = $.source;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRulesCondition defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRulesCondition $;

        public Builder() {
            $ = new GetRulesCondition();
        }

        public Builder(GetRulesCondition defaults) {
            $ = new GetRulesCondition(Objects.requireNonNull(defaults));
        }

        /**
         * @param operator A valid operator for the selected condition source
         * 
         * @return builder
         * 
         */
        public Builder operator(String operator) {
            $.operator = operator;
            return this;
        }

        /**
         * @param source source field to check.
         * 
         * @return builder
         * 
         */
        public Builder source(String source) {
            $.source = source;
            return this;
        }

        /**
         * @param value A plain text string or valid value for the selected  condition source
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            $.value = value;
            return this;
        }

        public GetRulesCondition build() {
            if ($.operator == null) {
                throw new MissingRequiredPropertyException("GetRulesCondition", "operator");
            }
            if ($.source == null) {
                throw new MissingRequiredPropertyException("GetRulesCondition", "source");
            }
            if ($.value == null) {
                throw new MissingRequiredPropertyException("GetRulesCondition", "value");
            }
            return $;
        }
    }

}
