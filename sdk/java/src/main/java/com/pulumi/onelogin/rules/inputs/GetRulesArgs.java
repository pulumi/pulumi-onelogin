// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.onelogin.rules.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.onelogin.rules.inputs.GetRulesFilterArgs;
import com.pulumi.onelogin.rules.inputs.GetRulesSourceArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetRulesArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRulesArgs Empty = new GetRulesArgs();

    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    @Import(name="filter")
    private @Nullable Output<List<GetRulesFilterArgs>> filter;

    public Optional<Output<List<GetRulesFilterArgs>>> filter() {
        return Optional.ofNullable(this.filter);
    }

    @Import(name="filters")
    private @Nullable Output<List<String>> filters;

    public Optional<Output<List<String>>> filters() {
        return Optional.ofNullable(this.filters);
    }

    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="source")
    private @Nullable Output<GetRulesSourceArgs> source;

    public Optional<Output<GetRulesSourceArgs>> source() {
        return Optional.ofNullable(this.source);
    }

    @Import(name="target")
    private @Nullable Output<String> target;

    public Optional<Output<String>> target() {
        return Optional.ofNullable(this.target);
    }

    @Import(name="type")
    private @Nullable Output<String> type;

    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private GetRulesArgs() {}

    private GetRulesArgs(GetRulesArgs $) {
        this.description = $.description;
        this.filter = $.filter;
        this.filters = $.filters;
        this.name = $.name;
        this.source = $.source;
        this.target = $.target;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRulesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRulesArgs $;

        public Builder() {
            $ = new GetRulesArgs();
        }

        public Builder(GetRulesArgs defaults) {
            $ = new GetRulesArgs(Objects.requireNonNull(defaults));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder filter(@Nullable Output<List<GetRulesFilterArgs>> filter) {
            $.filter = filter;
            return this;
        }

        public Builder filter(List<GetRulesFilterArgs> filter) {
            return filter(Output.of(filter));
        }

        public Builder filter(GetRulesFilterArgs... filter) {
            return filter(List.of(filter));
        }

        public Builder filters(@Nullable Output<List<String>> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(List<String> filters) {
            return filters(Output.of(filters));
        }

        public Builder filters(String... filters) {
            return filters(List.of(filters));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder source(@Nullable Output<GetRulesSourceArgs> source) {
            $.source = source;
            return this;
        }

        public Builder source(GetRulesSourceArgs source) {
            return source(Output.of(source));
        }

        public Builder target(@Nullable Output<String> target) {
            $.target = target;
            return this;
        }

        public Builder target(String target) {
            return target(Output.of(target));
        }

        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        public Builder type(String type) {
            return type(Output.of(type));
        }

        public GetRulesArgs build() {
            return $;
        }
    }

}
