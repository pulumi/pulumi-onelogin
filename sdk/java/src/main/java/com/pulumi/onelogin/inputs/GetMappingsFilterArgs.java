// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.onelogin.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GetMappingsFilterArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetMappingsFilterArgs Empty = new GetMappingsFilterArgs();

    @Import(name="name", required=true)
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    @Import(name="values", required=true)
    private Output<List<String>> values;

    public Output<List<String>> values() {
        return this.values;
    }

    private GetMappingsFilterArgs() {}

    private GetMappingsFilterArgs(GetMappingsFilterArgs $) {
        this.name = $.name;
        this.values = $.values;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetMappingsFilterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetMappingsFilterArgs $;

        public Builder() {
            $ = new GetMappingsFilterArgs();
        }

        public Builder(GetMappingsFilterArgs defaults) {
            $ = new GetMappingsFilterArgs(Objects.requireNonNull(defaults));
        }

        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder values(Output<List<String>> values) {
            $.values = values;
            return this;
        }

        public Builder values(List<String> values) {
            return values(Output.of(values));
        }

        public Builder values(String... values) {
            return values(List.of(values));
        }

        public GetMappingsFilterArgs build() {
            if ($.name == null) {
                throw new MissingRequiredPropertyException("GetMappingsFilterArgs", "name");
            }
            if ($.values == null) {
                throw new MissingRequiredPropertyException("GetMappingsFilterArgs", "values");
            }
            return $;
        }
    }

}
