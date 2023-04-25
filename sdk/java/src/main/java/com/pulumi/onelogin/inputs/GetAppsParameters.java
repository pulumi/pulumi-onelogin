// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.onelogin.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.onelogin.inputs.GetAppsParametersGroups;
import java.util.Objects;


public final class GetAppsParameters extends com.pulumi.resources.InvokeArgs {

    public static final GetAppsParameters Empty = new GetAppsParameters();

    @Import(name="groups", required=true)
    private GetAppsParametersGroups groups;

    public GetAppsParametersGroups groups() {
        return this.groups;
    }

    private GetAppsParameters() {}

    private GetAppsParameters(GetAppsParameters $) {
        this.groups = $.groups;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAppsParameters defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAppsParameters $;

        public Builder() {
            $ = new GetAppsParameters();
        }

        public Builder(GetAppsParameters defaults) {
            $ = new GetAppsParameters(Objects.requireNonNull(defaults));
        }

        public Builder groups(GetAppsParametersGroups groups) {
            $.groups = groups;
            return this;
        }

        public GetAppsParameters build() {
            $.groups = Objects.requireNonNull($.groups, "expected parameter 'groups' to be non-null");
            return $;
        }
    }

}
