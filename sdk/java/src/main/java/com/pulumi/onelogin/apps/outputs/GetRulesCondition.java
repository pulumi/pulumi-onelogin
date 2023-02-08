// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.onelogin.apps.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetRulesCondition {
    private String operator;
    private String source;
    private String value;

    private GetRulesCondition() {}
    public String operator() {
        return this.operator;
    }
    public String source() {
        return this.source;
    }
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
            this.operator = Objects.requireNonNull(operator);
            return this;
        }
        @CustomType.Setter
        public Builder source(String source) {
            this.source = Objects.requireNonNull(source);
            return this;
        }
        @CustomType.Setter
        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public GetRulesCondition build() {
            final var o = new GetRulesCondition();
            o.operator = operator;
            o.source = source;
            o.value = value;
            return o;
        }
    }
}
