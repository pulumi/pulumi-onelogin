// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.onelogin.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GetAuthServersScopesFilter extends com.pulumi.resources.InvokeArgs {

    public static final GetAuthServersScopesFilter Empty = new GetAuthServersScopesFilter();

    @Import(name="name", required=true)
    private String name;

    public String name() {
        return this.name;
    }

    @Import(name="values", required=true)
    private List<String> values;

    public List<String> values() {
        return this.values;
    }

    private GetAuthServersScopesFilter() {}

    private GetAuthServersScopesFilter(GetAuthServersScopesFilter $) {
        this.name = $.name;
        this.values = $.values;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAuthServersScopesFilter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAuthServersScopesFilter $;

        public Builder() {
            $ = new GetAuthServersScopesFilter();
        }

        public Builder(GetAuthServersScopesFilter defaults) {
            $ = new GetAuthServersScopesFilter(Objects.requireNonNull(defaults));
        }

        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public Builder values(List<String> values) {
            $.values = values;
            return this;
        }

        public Builder values(String... values) {
            return values(List.of(values));
        }

        public GetAuthServersScopesFilter build() {
            if ($.name == null) {
                throw new MissingRequiredPropertyException("GetAuthServersScopesFilter", "name");
            }
            if ($.values == null) {
                throw new MissingRequiredPropertyException("GetAuthServersScopesFilter", "values");
            }
            return $;
        }
    }

}
