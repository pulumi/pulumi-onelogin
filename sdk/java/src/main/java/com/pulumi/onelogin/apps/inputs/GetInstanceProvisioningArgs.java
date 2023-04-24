// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.onelogin.apps.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


public final class GetInstanceProvisioningArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetInstanceProvisioningArgs Empty = new GetInstanceProvisioningArgs();

    @Import(name="enabled", required=true)
    private Output<Boolean> enabled;

    public Output<Boolean> enabled() {
        return this.enabled;
    }

    @Import(name="status", required=true)
    private Output<String> status;

    public Output<String> status() {
        return this.status;
    }

    private GetInstanceProvisioningArgs() {}

    private GetInstanceProvisioningArgs(GetInstanceProvisioningArgs $) {
        this.enabled = $.enabled;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetInstanceProvisioningArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetInstanceProvisioningArgs $;

        public Builder() {
            $ = new GetInstanceProvisioningArgs();
        }

        public Builder(GetInstanceProvisioningArgs defaults) {
            $ = new GetInstanceProvisioningArgs(Objects.requireNonNull(defaults));
        }

        public Builder enabled(Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public Builder status(Output<String> status) {
            $.status = status;
            return this;
        }

        public Builder status(String status) {
            return status(Output.of(status));
        }

        public GetInstanceProvisioningArgs build() {
            $.enabled = Objects.requireNonNull($.enabled, "expected parameter 'enabled' to be non-null");
            $.status = Objects.requireNonNull($.status, "expected parameter 'status' to be non-null");
            return $;
        }
    }

}
