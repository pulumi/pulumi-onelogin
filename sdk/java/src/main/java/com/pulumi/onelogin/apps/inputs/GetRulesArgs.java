// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.onelogin.apps.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.onelogin.apps.inputs.GetRulesActionArgs;
import com.pulumi.onelogin.apps.inputs.GetRulesConditionArgs;
import com.pulumi.onelogin.apps.inputs.GetRulesFilterArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetRulesArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRulesArgs Empty = new GetRulesArgs();

    @Import(name="actions")
    private @Nullable Output<List<GetRulesActionArgs>> actions;

    public Optional<Output<List<GetRulesActionArgs>>> actions() {
        return Optional.ofNullable(this.actions);
    }

    @Import(name="appsId", required=true)
    private Output<String> appsId;

    public Output<String> appsId() {
        return this.appsId;
    }

    @Import(name="conditions")
    private @Nullable Output<List<GetRulesConditionArgs>> conditions;

    public Optional<Output<List<GetRulesConditionArgs>>> conditions() {
        return Optional.ofNullable(this.conditions);
    }

    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    @Import(name="filters")
    private @Nullable Output<List<GetRulesFilterArgs>> filters;

    public Optional<Output<List<GetRulesFilterArgs>>> filters() {
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

    private GetRulesArgs() {}

    private GetRulesArgs(GetRulesArgs $) {
        this.actions = $.actions;
        this.appsId = $.appsId;
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

        public Builder actions(@Nullable Output<List<GetRulesActionArgs>> actions) {
            $.actions = actions;
            return this;
        }

        public Builder actions(List<GetRulesActionArgs> actions) {
            return actions(Output.of(actions));
        }

        public Builder actions(GetRulesActionArgs... actions) {
            return actions(List.of(actions));
        }

        public Builder appsId(Output<String> appsId) {
            $.appsId = appsId;
            return this;
        }

        public Builder appsId(String appsId) {
            return appsId(Output.of(appsId));
        }

        public Builder conditions(@Nullable Output<List<GetRulesConditionArgs>> conditions) {
            $.conditions = conditions;
            return this;
        }

        public Builder conditions(List<GetRulesConditionArgs> conditions) {
            return conditions(Output.of(conditions));
        }

        public Builder conditions(GetRulesConditionArgs... conditions) {
            return conditions(List.of(conditions));
        }

        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public Builder filters(@Nullable Output<List<GetRulesFilterArgs>> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(List<GetRulesFilterArgs> filters) {
            return filters(Output.of(filters));
        }

        public Builder filters(GetRulesFilterArgs... filters) {
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

        public GetRulesArgs build() {
            $.appsId = Objects.requireNonNull($.appsId, "expected parameter 'appsId' to be non-null");
            return $;
        }
    }

}
