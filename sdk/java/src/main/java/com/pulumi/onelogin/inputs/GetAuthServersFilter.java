// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.onelogin.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GetAuthServersFilter extends com.pulumi.resources.InvokeArgs {

    public static final GetAuthServersFilter Empty = new GetAuthServersFilter();

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

    private GetAuthServersFilter() {}

    private GetAuthServersFilter(GetAuthServersFilter $) {
        this.name = $.name;
        this.values = $.values;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAuthServersFilter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAuthServersFilter $;

        public Builder() {
            $ = new GetAuthServersFilter();
        }

        public Builder(GetAuthServersFilter defaults) {
            $ = new GetAuthServersFilter(Objects.requireNonNull(defaults));
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

        public GetAuthServersFilter build() {
            if ($.name == null) {
                throw new MissingRequiredPropertyException("GetAuthServersFilter", "name");
            }
            if ($.values == null) {
                throw new MissingRequiredPropertyException("GetAuthServersFilter", "values");
            }
            return $;
        }
    }

}
