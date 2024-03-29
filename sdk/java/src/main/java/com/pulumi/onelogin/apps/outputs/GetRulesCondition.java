// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.onelogin.apps.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetRulesCondition {
    /**
     * @return A valid operator for the selected condition source
     * 
     */
    private String operator;
    /**
     * @return source field to check.
     * 
     */
    private String source;
    /**
     * @return A plain text string or valid value for the selected  condition source
     * 
     */
    private String value;

    private GetRulesCondition() {}
    /**
     * @return A valid operator for the selected condition source
     * 
     */
    public String operator() {
        return this.operator;
    }
    /**
     * @return source field to check.
     * 
     */
    public String source() {
        return this.source;
    }
    /**
     * @return A plain text string or valid value for the selected  condition source
     * 
     */
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRulesCondition defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String operator;
        private String source;
        private String value;
        public Builder() {}
        public Builder(GetRulesCondition defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.operator = defaults.operator;
    	      this.source = defaults.source;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder operator(String operator) {
            if (operator == null) {
              throw new MissingRequiredPropertyException("GetRulesCondition", "operator");
            }
            this.operator = operator;
            return this;
        }
        @CustomType.Setter
        public Builder source(String source) {
            if (source == null) {
              throw new MissingRequiredPropertyException("GetRulesCondition", "source");
            }
            this.source = source;
            return this;
        }
        @CustomType.Setter
        public Builder value(String value) {
            if (value == null) {
              throw new MissingRequiredPropertyException("GetRulesCondition", "value");
            }
            this.value = value;
            return this;
        }
        public GetRulesCondition build() {
            final var _resultValue = new GetRulesCondition();
            _resultValue.operator = operator;
            _resultValue.source = source;
            _resultValue.value = value;
            return _resultValue;
        }
    }
}
