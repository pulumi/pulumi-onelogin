// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.onelogin.apps.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.onelogin.apps.inputs.GetConditionsOperatorsFilter;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetConditionsOperatorsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetConditionsOperatorsPlainArgs Empty = new GetConditionsOperatorsPlainArgs();

    @Import(name="appsId", required=true)
    private String appsId;

    public String appsId() {
        return this.appsId;
    }

    @Import(name="conditionsId", required=true)
    private String conditionsId;

    public String conditionsId() {
        return this.conditionsId;
    }

    @Import(name="filters")
    private @Nullable List<GetConditionsOperatorsFilter> filters;

    public Optional<List<GetConditionsOperatorsFilter>> filters() {
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

    private GetConditionsOperatorsPlainArgs() {}

    private GetConditionsOperatorsPlainArgs(GetConditionsOperatorsPlainArgs $) {
        this.appsId = $.appsId;
        this.conditionsId = $.conditionsId;
        this.filters = $.filters;
        this.name = $.name;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetConditionsOperatorsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetConditionsOperatorsPlainArgs $;

        public Builder() {
            $ = new GetConditionsOperatorsPlainArgs();
        }

        public Builder(GetConditionsOperatorsPlainArgs defaults) {
            $ = new GetConditionsOperatorsPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder appsId(String appsId) {
            $.appsId = appsId;
            return this;
        }

        public Builder conditionsId(String conditionsId) {
            $.conditionsId = conditionsId;
            return this;
        }

        public Builder filters(@Nullable List<GetConditionsOperatorsFilter> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(GetConditionsOperatorsFilter... filters) {
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

        public GetConditionsOperatorsPlainArgs build() {
            $.appsId = Objects.requireNonNull($.appsId, "expected parameter 'appsId' to be non-null");
            $.conditionsId = Objects.requireNonNull($.conditionsId, "expected parameter 'conditionsId' to be non-null");
            return $;
        }
    }

}