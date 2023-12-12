// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.onelogin.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.onelogin.outputs.GetAppsParametersGroups;
import java.util.Objects;

@CustomType
public final class GetAppsParameters {
    private GetAppsParametersGroups groups;

    private GetAppsParameters() {}
    public GetAppsParametersGroups groups() {
        return this.groups;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAppsParameters defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private GetAppsParametersGroups groups;
        public Builder() {}
        public Builder(GetAppsParameters defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.groups = defaults.groups;
        }

        @CustomType.Setter
        public Builder groups(GetAppsParametersGroups groups) {
            this.groups = Objects.requireNonNull(groups);
            return this;
        }
        public GetAppsParameters build() {
            final var _resultValue = new GetAppsParameters();
            _resultValue.groups = groups;
            return _resultValue;
        }
    }
}
