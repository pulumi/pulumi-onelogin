// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.onelogin.apps.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.onelogin.apps.inputs.GetInstanceParametersGroups;
import java.util.Objects;


public final class GetInstanceParameters extends com.pulumi.resources.InvokeArgs {

    public static final GetInstanceParameters Empty = new GetInstanceParameters();

    @Import(name="groups", required=true)
    private GetInstanceParametersGroups groups;

    public GetInstanceParametersGroups groups() {
        return this.groups;
    }

    private GetInstanceParameters() {}

    private GetInstanceParameters(GetInstanceParameters $) {
        this.groups = $.groups;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetInstanceParameters defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetInstanceParameters $;

        public Builder() {
            $ = new GetInstanceParameters();
        }

        public Builder(GetInstanceParameters defaults) {
            $ = new GetInstanceParameters(Objects.requireNonNull(defaults));
        }

        public Builder groups(GetInstanceParametersGroups groups) {
            $.groups = groups;
            return this;
        }

        public GetInstanceParameters build() {
            if ($.groups == null) {
                throw new MissingRequiredPropertyException("GetInstanceParameters", "groups");
            }
            return $;
        }
    }

}
