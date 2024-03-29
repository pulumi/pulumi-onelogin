// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.onelogin.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


public final class GetAppsProvisioning extends com.pulumi.resources.InvokeArgs {

    public static final GetAppsProvisioning Empty = new GetAppsProvisioning();

    @Import(name="enabled", required=true)
    private Boolean enabled;

    public Boolean enabled() {
        return this.enabled;
    }

    @Import(name="status", required=true)
    private String status;

    public String status() {
        return this.status;
    }

    private GetAppsProvisioning() {}

    private GetAppsProvisioning(GetAppsProvisioning $) {
        this.enabled = $.enabled;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAppsProvisioning defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAppsProvisioning $;

        public Builder() {
            $ = new GetAppsProvisioning();
        }

        public Builder(GetAppsProvisioning defaults) {
            $ = new GetAppsProvisioning(Objects.requireNonNull(defaults));
        }

        public Builder enabled(Boolean enabled) {
            $.enabled = enabled;
            return this;
        }

        public Builder status(String status) {
            $.status = status;
            return this;
        }

        public GetAppsProvisioning build() {
            if ($.enabled == null) {
                throw new MissingRequiredPropertyException("GetAppsProvisioning", "enabled");
            }
            if ($.status == null) {
                throw new MissingRequiredPropertyException("GetAppsProvisioning", "status");
            }
            return $;
        }
    }

}
