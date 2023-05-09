// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.onelogin.apps.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.onelogin.apps.outputs.GetInstanceParametersGroups;
import java.util.Objects;

@CustomType
public final class GetInstanceParameters {
    private GetInstanceParametersGroups groups;

    private GetInstanceParameters() {}
    public GetInstanceParametersGroups groups() {
        return this.groups;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstanceParameters defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private GetInstanceParametersGroups groups;
        public Builder() {}
        public Builder(GetInstanceParameters defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.groups = defaults.groups;
        }

        @CustomType.Setter
        public Builder groups(GetInstanceParametersGroups groups) {
            this.groups = Objects.requireNonNull(groups);
            return this;
        }
        public GetInstanceParameters build() {
            final var o = new GetInstanceParameters();
            o.groups = groups;
            return o;
        }
    }
}