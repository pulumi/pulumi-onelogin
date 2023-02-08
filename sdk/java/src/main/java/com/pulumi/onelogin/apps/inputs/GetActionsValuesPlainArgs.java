// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.onelogin.apps.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.onelogin.apps.inputs.GetActionsValuesFilter;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetActionsValuesPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetActionsValuesPlainArgs Empty = new GetActionsValuesPlainArgs();

    @Import(name="actionsId", required=true)
    private String actionsId;

    public String actionsId() {
        return this.actionsId;
    }

    @Import(name="appsId", required=true)
    private String appsId;

    public String appsId() {
        return this.appsId;
    }

    @Import(name="filters")
    private @Nullable List<GetActionsValuesFilter> filters;

    public Optional<List<GetActionsValuesFilter>> filters() {
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

    private GetActionsValuesPlainArgs() {}

    private GetActionsValuesPlainArgs(GetActionsValuesPlainArgs $) {
        this.actionsId = $.actionsId;
        this.appsId = $.appsId;
        this.filters = $.filters;
        this.name = $.name;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetActionsValuesPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetActionsValuesPlainArgs $;

        public Builder() {
            $ = new GetActionsValuesPlainArgs();
        }

        public Builder(GetActionsValuesPlainArgs defaults) {
            $ = new GetActionsValuesPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder actionsId(String actionsId) {
            $.actionsId = actionsId;
            return this;
        }

        public Builder appsId(String appsId) {
            $.appsId = appsId;
            return this;
        }

        public Builder filters(@Nullable List<GetActionsValuesFilter> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(GetActionsValuesFilter... filters) {
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

        public GetActionsValuesPlainArgs build() {
            $.actionsId = Objects.requireNonNull($.actionsId, "expected parameter 'actionsId' to be non-null");
            $.appsId = Objects.requireNonNull($.appsId, "expected parameter 'appsId' to be non-null");
            return $;
        }
    }

}
