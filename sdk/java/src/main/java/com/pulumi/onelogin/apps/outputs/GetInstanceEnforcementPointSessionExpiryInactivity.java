// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.onelogin.apps.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class GetInstanceEnforcementPointSessionExpiryInactivity {
    private Integer unit;
    private Integer value;

    private GetInstanceEnforcementPointSessionExpiryInactivity() {}
    public Integer unit() {
        return this.unit;
    }
    public Integer value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstanceEnforcementPointSessionExpiryInactivity defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer unit;
        private Integer value;
        public Builder() {}
        public Builder(GetInstanceEnforcementPointSessionExpiryInactivity defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.unit = defaults.unit;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder unit(Integer unit) {
            if (unit == null) {
              throw new MissingRequiredPropertyException("GetInstanceEnforcementPointSessionExpiryInactivity", "unit");
            }
            this.unit = unit;
            return this;
        }
        @CustomType.Setter
        public Builder value(Integer value) {
            if (value == null) {
              throw new MissingRequiredPropertyException("GetInstanceEnforcementPointSessionExpiryInactivity", "value");
            }
            this.value = value;
            return this;
        }
        public GetInstanceEnforcementPointSessionExpiryInactivity build() {
            final var _resultValue = new GetInstanceEnforcementPointSessionExpiryInactivity();
            _resultValue.unit = unit;
            _resultValue.value = value;
            return _resultValue;
        }
    }
}
