// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.onelogin.apps.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.onelogin.apps.inputs.GetConditionsFilterArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetConditionsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetConditionsArgs Empty = new GetConditionsArgs();

    @Import(name="appsId", required=true)
    private Output<String> appsId;

    public Output<String> appsId() {
        return this.appsId;
    }

    @Import(name="filters")
    private @Nullable Output<List<GetConditionsFilterArgs>> filters;

    public Optional<Output<List<GetConditionsFilterArgs>>> filters() {
        return Optional.ofNullable(this.filters);
    }

    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="value")
    private @Nullable Output<String> value;

    public Optional<Output<String>> value() {
        return Optional.ofNullable(this.value);
    }

    private GetConditionsArgs() {}

    private GetConditionsArgs(GetConditionsArgs $) {
        this.appsId = $.appsId;
        this.filters = $.filters;
        this.name = $.name;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetConditionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetConditionsArgs $;

        public Builder() {
            $ = new GetConditionsArgs();
        }

        public Builder(GetConditionsArgs defaults) {
            $ = new GetConditionsArgs(Objects.requireNonNull(defaults));
        }

        public Builder appsId(Output<String> appsId) {
            $.appsId = appsId;
            return this;
        }

        public Builder appsId(String appsId) {
            return appsId(Output.of(appsId));
        }

        public Builder filters(@Nullable Output<List<GetConditionsFilterArgs>> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(List<GetConditionsFilterArgs> filters) {
            return filters(Output.of(filters));
        }

        public Builder filters(GetConditionsFilterArgs... filters) {
            return filters(List.of(filters));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder value(@Nullable Output<String> value) {
            $.value = value;
            return this;
        }

        public Builder value(String value) {
            return value(Output.of(value));
        }

        public GetConditionsArgs build() {
            $.appsId = Objects.requireNonNull($.appsId, "expected parameter 'appsId' to be non-null");
            return $;
        }
    }

}
