// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.onelogin.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.onelogin.inputs.AppParametersGroupsArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AppParametersArgs extends com.pulumi.resources.ResourceArgs {

    public static final AppParametersArgs Empty = new AppParametersArgs();

    @Import(name="groups")
    private @Nullable Output<AppParametersGroupsArgs> groups;

    public Optional<Output<AppParametersGroupsArgs>> groups() {
        return Optional.ofNullable(this.groups);
    }

    private AppParametersArgs() {}

    private AppParametersArgs(AppParametersArgs $) {
        this.groups = $.groups;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AppParametersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AppParametersArgs $;

        public Builder() {
            $ = new AppParametersArgs();
        }

        public Builder(AppParametersArgs defaults) {
            $ = new AppParametersArgs(Objects.requireNonNull(defaults));
        }

        public Builder groups(@Nullable Output<AppParametersGroupsArgs> groups) {
            $.groups = groups;
            return this;
        }

        public Builder groups(AppParametersGroupsArgs groups) {
            return groups(Output.of(groups));
        }

        public AppParametersArgs build() {
            return $;
        }
    }

}
