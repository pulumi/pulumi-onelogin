// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.onelogin.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.onelogin.inputs.GetAuthServersClaimsFilter;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetAuthServersClaimsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAuthServersClaimsPlainArgs Empty = new GetAuthServersClaimsPlainArgs();

    @Import(name="attributeTransformations")
    private @Nullable String attributeTransformations;

    public Optional<String> attributeTransformations() {
        return Optional.ofNullable(this.attributeTransformations);
    }

    @Import(name="authServersId", required=true)
    private String authServersId;

    public String authServersId() {
        return this.authServersId;
    }

    @Import(name="defaultValues")
    private @Nullable String defaultValues;

    public Optional<String> defaultValues() {
        return Optional.ofNullable(this.defaultValues);
    }

    @Import(name="filters")
    private @Nullable List<GetAuthServersClaimsFilter> filters;

    public Optional<List<GetAuthServersClaimsFilter>> filters() {
        return Optional.ofNullable(this.filters);
    }

    @Import(name="label")
    private @Nullable String label;

    public Optional<String> label() {
        return Optional.ofNullable(this.label);
    }

    @Import(name="provisionedEntitlements")
    private @Nullable Boolean provisionedEntitlements;

    public Optional<Boolean> provisionedEntitlements() {
        return Optional.ofNullable(this.provisionedEntitlements);
    }

    @Import(name="skipIfBlank")
    private @Nullable Boolean skipIfBlank;

    public Optional<Boolean> skipIfBlank() {
        return Optional.ofNullable(this.skipIfBlank);
    }

    @Import(name="userAttributeMacros")
    private @Nullable String userAttributeMacros;

    public Optional<String> userAttributeMacros() {
        return Optional.ofNullable(this.userAttributeMacros);
    }

    @Import(name="userAttributeMappings")
    private @Nullable String userAttributeMappings;

    public Optional<String> userAttributeMappings() {
        return Optional.ofNullable(this.userAttributeMappings);
    }

    @Import(name="values")
    private @Nullable List<String> values;

    public Optional<List<String>> values() {
        return Optional.ofNullable(this.values);
    }

    private GetAuthServersClaimsPlainArgs() {}

    private GetAuthServersClaimsPlainArgs(GetAuthServersClaimsPlainArgs $) {
        this.attributeTransformations = $.attributeTransformations;
        this.authServersId = $.authServersId;
        this.defaultValues = $.defaultValues;
        this.filters = $.filters;
        this.label = $.label;
        this.provisionedEntitlements = $.provisionedEntitlements;
        this.skipIfBlank = $.skipIfBlank;
        this.userAttributeMacros = $.userAttributeMacros;
        this.userAttributeMappings = $.userAttributeMappings;
        this.values = $.values;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAuthServersClaimsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAuthServersClaimsPlainArgs $;

        public Builder() {
            $ = new GetAuthServersClaimsPlainArgs();
        }

        public Builder(GetAuthServersClaimsPlainArgs defaults) {
            $ = new GetAuthServersClaimsPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder attributeTransformations(@Nullable String attributeTransformations) {
            $.attributeTransformations = attributeTransformations;
            return this;
        }

        public Builder authServersId(String authServersId) {
            $.authServersId = authServersId;
            return this;
        }

        public Builder defaultValues(@Nullable String defaultValues) {
            $.defaultValues = defaultValues;
            return this;
        }

        public Builder filters(@Nullable List<GetAuthServersClaimsFilter> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(GetAuthServersClaimsFilter... filters) {
            return filters(List.of(filters));
        }

        public Builder label(@Nullable String label) {
            $.label = label;
            return this;
        }

        public Builder provisionedEntitlements(@Nullable Boolean provisionedEntitlements) {
            $.provisionedEntitlements = provisionedEntitlements;
            return this;
        }

        public Builder skipIfBlank(@Nullable Boolean skipIfBlank) {
            $.skipIfBlank = skipIfBlank;
            return this;
        }

        public Builder userAttributeMacros(@Nullable String userAttributeMacros) {
            $.userAttributeMacros = userAttributeMacros;
            return this;
        }

        public Builder userAttributeMappings(@Nullable String userAttributeMappings) {
            $.userAttributeMappings = userAttributeMappings;
            return this;
        }

        public Builder values(@Nullable List<String> values) {
            $.values = values;
            return this;
        }

        public Builder values(String... values) {
            return values(List.of(values));
        }

        public GetAuthServersClaimsPlainArgs build() {
            if ($.authServersId == null) {
                throw new MissingRequiredPropertyException("GetAuthServersClaimsPlainArgs", "authServersId");
            }
            return $;
        }
    }

}
