// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.onelogin.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AppEnforcementPointSessionExpiryFixed {
    private @Nullable Integer unit;
    private @Nullable Integer value;

    private AppEnforcementPointSessionExpiryFixed() {}
    public Optional<Integer> unit() {
        return Optional.ofNullable(this.unit);
    }
    public Optional<Integer> value() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AppEnforcementPointSessionExpiryFixed defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer unit;
        private @Nullable Integer value;
        public Builder() {}
        public Builder(AppEnforcementPointSessionExpiryFixed defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.unit = defaults.unit;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder unit(@Nullable Integer unit) {
            this.unit = unit;
            return this;
        }
        @CustomType.Setter
        public Builder value(@Nullable Integer value) {
            this.value = value;
            return this;
        }
        public AppEnforcementPointSessionExpiryFixed build() {
            final var o = new AppEnforcementPointSessionExpiryFixed();
            o.unit = unit;
            o.value = value;
            return o;
        }
    }
}