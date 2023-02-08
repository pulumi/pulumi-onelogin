// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.onelogin.api.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.onelogin.api.inputs.GetAuthorizationsConfigurationArgs;
import com.pulumi.onelogin.api.inputs.GetAuthorizationsFilterArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetAuthorizationsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAuthorizationsArgs Empty = new GetAuthorizationsArgs();

    @Import(name="configuration")
    private @Nullable Output<GetAuthorizationsConfigurationArgs> configuration;

    public Optional<Output<GetAuthorizationsConfigurationArgs>> configuration() {
        return Optional.ofNullable(this.configuration);
    }

    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    @Import(name="filters")
    private @Nullable Output<List<GetAuthorizationsFilterArgs>> filters;

    public Optional<Output<List<GetAuthorizationsFilterArgs>>> filters() {
        return Optional.ofNullable(this.filters);
    }

    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private GetAuthorizationsArgs() {}

    private GetAuthorizationsArgs(GetAuthorizationsArgs $) {
        this.configuration = $.configuration;
        this.description = $.description;
        this.filters = $.filters;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAuthorizationsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAuthorizationsArgs $;

        public Builder() {
            $ = new GetAuthorizationsArgs();
        }

        public Builder(GetAuthorizationsArgs defaults) {
            $ = new GetAuthorizationsArgs(Objects.requireNonNull(defaults));
        }

        public Builder configuration(@Nullable Output<GetAuthorizationsConfigurationArgs> configuration) {
            $.configuration = configuration;
            return this;
        }

        public Builder configuration(GetAuthorizationsConfigurationArgs configuration) {
            return configuration(Output.of(configuration));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder filters(@Nullable Output<List<GetAuthorizationsFilterArgs>> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(List<GetAuthorizationsFilterArgs> filters) {
            return filters(Output.of(filters));
        }

        public Builder filters(GetAuthorizationsFilterArgs... filters) {
            return filters(List.of(filters));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public GetAuthorizationsArgs build() {
            return $;
        }
    }

}