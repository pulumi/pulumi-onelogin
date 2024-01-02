// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.onelogin.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.onelogin.outputs.GetAuthServersInstanceConfiguration;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetAuthServersInstanceResult {
    private GetAuthServersInstanceConfiguration configuration;
    private String description;
    private String id;
    private String name;

    private GetAuthServersInstanceResult() {}
    public GetAuthServersInstanceConfiguration configuration() {
        return this.configuration;
    }
    public String description() {
        return this.description;
    }
    public String id() {
        return this.id;
    }
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAuthServersInstanceResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private GetAuthServersInstanceConfiguration configuration;
        private String description;
        private String id;
        private String name;
        public Builder() {}
        public Builder(GetAuthServersInstanceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configuration = defaults.configuration;
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
        }

        @CustomType.Setter
        public Builder configuration(GetAuthServersInstanceConfiguration configuration) {
            if (configuration == null) {
              throw new MissingRequiredPropertyException("GetAuthServersInstanceResult", "configuration");
            }
            this.configuration = configuration;
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            if (description == null) {
              throw new MissingRequiredPropertyException("GetAuthServersInstanceResult", "description");
            }
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetAuthServersInstanceResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetAuthServersInstanceResult", "name");
            }
            this.name = name;
            return this;
        }
        public GetAuthServersInstanceResult build() {
            final var _resultValue = new GetAuthServersInstanceResult();
            _resultValue.configuration = configuration;
            _resultValue.description = description;
            _resultValue.id = id;
            _resultValue.name = name;
            return _resultValue;
        }
    }
}
