// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.onelogin.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.onelogin.inputs.GetMappingsActionArgs;
import com.pulumi.onelogin.inputs.GetMappingsConditionArgs;
import com.pulumi.onelogin.inputs.GetMappingsFilterArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetMappingsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetMappingsArgs Empty = new GetMappingsArgs();

    @Import(name="actions")
    private @Nullable Output<List<GetMappingsActionArgs>> actions;

    public Optional<Output<List<GetMappingsActionArgs>>> actions() {
        return Optional.ofNullable(this.actions);
    }

    @Import(name="conditions")
    private @Nullable Output<List<GetMappingsConditionArgs>> conditions;

    public Optional<Output<List<GetMappingsConditionArgs>>> conditions() {
        return Optional.ofNullable(this.conditions);
    }

    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    @Import(name="filters")
    private @Nullable Output<List<GetMappingsFilterArgs>> filters;

    public Optional<Output<List<GetMappingsFilterArgs>>> filters() {
        return Optional.ofNullable(this.filters);
    }

    @Import(name="match")
    private @Nullable Output<String> match;

    public Optional<Output<String>> match() {
        return Optional.ofNullable(this.match);
    }

    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="position")
    private @Nullable Output<Integer> position;

    public Optional<Output<Integer>> position() {
        return Optional.ofNullable(this.position);
    }

    private GetMappingsArgs() {}

    private GetMappingsArgs(GetMappingsArgs $) {
        this.actions = $.actions;
        this.conditions = $.conditions;
        this.enabled = $.enabled;
        this.filters = $.filters;
        this.match = $.match;
        this.name = $.name;
        this.position = $.position;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetMappingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetMappingsArgs $;

        public Builder() {
            $ = new GetMappingsArgs();
        }

        public Builder(GetMappingsArgs defaults) {
            $ = new GetMappingsArgs(Objects.requireNonNull(defaults));
        }

        public Builder actions(@Nullable Output<List<GetMappingsActionArgs>> actions) {
            $.actions = actions;
            return this;
        }

        public Builder actions(List<GetMappingsActionArgs> actions) {
            return actions(Output.of(actions));
        }

        public Builder actions(GetMappingsActionArgs... actions) {
            return actions(List.of(actions));
        }

        public Builder conditions(@Nullable Output<List<GetMappingsConditionArgs>> conditions) {
            $.conditions = conditions;
            return this;
        }

        public Builder conditions(List<GetMappingsConditionArgs> conditions) {
            return conditions(Output.of(conditions));
        }

        public Builder conditions(GetMappingsConditionArgs... conditions) {
            return conditions(List.of(conditions));
        }

        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public Builder filters(@Nullable Output<List<GetMappingsFilterArgs>> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(List<GetMappingsFilterArgs> filters) {
            return filters(Output.of(filters));
        }

        public Builder filters(GetMappingsFilterArgs... filters) {
            return filters(List.of(filters));
        }

        public Builder match(@Nullable Output<String> match) {
            $.match = match;
            return this;
        }

        public Builder match(String match) {
            return match(Output.of(match));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder position(@Nullable Output<Integer> position) {
            $.position = position;
            return this;
        }

        public Builder position(Integer position) {
            return position(Output.of(position));
        }

        public GetMappingsArgs build() {
            return $;
        }
    }

}
