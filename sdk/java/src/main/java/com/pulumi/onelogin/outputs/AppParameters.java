// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.onelogin.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.onelogin.outputs.AppParametersGroups;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AppParameters {
    private @Nullable AppParametersGroups groups;

    private AppParameters() {}
    public Optional<AppParametersGroups> groups() {
        return Optional.ofNullable(this.groups);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AppParameters defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable AppParametersGroups groups;
        public Builder() {}
        public Builder(AppParameters defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.groups = defaults.groups;
        }

        @CustomType.Setter
        public Builder groups(@Nullable AppParametersGroups groups) {

            this.groups = groups;
            return this;
        }
        public AppParameters build() {
            final var _resultValue = new AppParameters();
            _resultValue.groups = groups;
            return _resultValue;
        }
    }
}
