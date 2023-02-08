// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.onelogin.apps.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.onelogin.apps.inputs.GetConditionsFilter;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetConditionsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetConditionsPlainArgs Empty = new GetConditionsPlainArgs();

    @Import(name="appsId", required=true)
    private String appsId;

    public String appsId() {
        return this.appsId;
    }

    @Import(name="filters")
    private @Nullable List<GetConditionsFilter> filters;

    public Optional<List<GetConditionsFilter>> filters() {
        return Optional.ofNullable(this.filters);
    }

    @Import(name="name")
    private @Nullable String name;

    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="value")
    private @Nullable String value;

    public Optional<String> value() {
        return Optional.ofNullable(this.value);
    }

    private GetConditionsPlainArgs() {}

    private GetConditionsPlainArgs(GetConditionsPlainArgs $) {
        this.appsId = $.appsId;
        this.filters = $.filters;
        this.name = $.name;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetConditionsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetConditionsPlainArgs $;

        public Builder() {
            $ = new GetConditionsPlainArgs();
        }

        public Builder(GetConditionsPlainArgs defaults) {
            $ = new GetConditionsPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder appsId(String appsId) {
            $.appsId = appsId;
            return this;
        }

        public Builder filters(@Nullable List<GetConditionsFilter> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(GetConditionsFilter... filters) {
            return filters(List.of(filters));
        }

        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        public Builder value(@Nullable String value) {
            $.value = value;
            return this;
        }

        public GetConditionsPlainArgs build() {
            $.appsId = Objects.requireNonNull($.appsId, "expected parameter 'appsId' to be non-null");
            return $;
        }
    }

}
