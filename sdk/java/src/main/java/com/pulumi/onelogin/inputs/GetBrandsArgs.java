// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.onelogin.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.onelogin.inputs.GetBrandsFilterArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetBrandsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetBrandsArgs Empty = new GetBrandsArgs();

    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    @Import(name="filters")
    private @Nullable Output<List<GetBrandsFilterArgs>> filters;

    public Optional<Output<List<GetBrandsFilterArgs>>> filters() {
        return Optional.ofNullable(this.filters);
    }

    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private GetBrandsArgs() {}

    private GetBrandsArgs(GetBrandsArgs $) {
        this.enabled = $.enabled;
        this.filters = $.filters;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetBrandsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetBrandsArgs $;

        public Builder() {
            $ = new GetBrandsArgs();
        }

        public Builder(GetBrandsArgs defaults) {
            $ = new GetBrandsArgs(Objects.requireNonNull(defaults));
        }

        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public Builder filters(@Nullable Output<List<GetBrandsFilterArgs>> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(List<GetBrandsFilterArgs> filters) {
            return filters(Output.of(filters));
        }

        public Builder filters(GetBrandsFilterArgs... filters) {
            return filters(List.of(filters));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public GetBrandsArgs build() {
            return $;
        }
    }

}
