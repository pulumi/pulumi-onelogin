// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.onelogin.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class GetAppsEnforcementPointSessionExpiryInactivity {
    private Integer unit;
    private Integer value;

    private GetAppsEnforcementPointSessionExpiryInactivity() {}
    public Integer unit() {
        return this.unit;
    }
    public Integer value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAppsEnforcementPointSessionExpiryInactivity defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer unit;
        private Integer value;
        public Builder() {}
        public Builder(GetAppsEnforcementPointSessionExpiryInactivity defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.unit = defaults.unit;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder unit(Integer unit) {
            this.unit = Objects.requireNonNull(unit);
            return this;
        }
        @CustomType.Setter
        public Builder value(Integer value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public GetAppsEnforcementPointSessionExpiryInactivity build() {
            final var o = new GetAppsEnforcementPointSessionExpiryInactivity();
            o.unit = unit;
            o.value = value;
            return o;
        }
    }
}
