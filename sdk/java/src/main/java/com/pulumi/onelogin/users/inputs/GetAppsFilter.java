// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.onelogin.users.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GetAppsFilter extends com.pulumi.resources.InvokeArgs {

    public static final GetAppsFilter Empty = new GetAppsFilter();

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

    private GetAppsFilter() {}

    private GetAppsFilter(GetAppsFilter $) {
        this.name = $.name;
        this.values = $.values;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAppsFilter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAppsFilter $;

        public Builder() {
            $ = new GetAppsFilter();
        }

        public Builder(GetAppsFilter defaults) {
            $ = new GetAppsFilter(Objects.requireNonNull(defaults));
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

        public GetAppsFilter build() {
            if ($.name == null) {
                throw new MissingRequiredPropertyException("GetAppsFilter", "name");
            }
            if ($.values == null) {
                throw new MissingRequiredPropertyException("GetAppsFilter", "values");
            }
            return $;
        }
    }

}
