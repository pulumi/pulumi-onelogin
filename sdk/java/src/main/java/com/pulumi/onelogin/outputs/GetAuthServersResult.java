// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.onelogin.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.onelogin.outputs.GetAuthServersConfiguration;
import com.pulumi.onelogin.outputs.GetAuthServersFilter;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetAuthServersResult {
    private GetAuthServersConfiguration configuration;
    private String description;
    private @Nullable List<GetAuthServersFilter> filters;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private String name;

    private GetAuthServersResult() {}
    public GetAuthServersConfiguration configuration() {
        return this.configuration;
    }
    public String description() {
        return this.description;
    }
    public List<GetAuthServersFilter> filters() {
        return this.filters == null ? List.of() : this.filters;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAuthServersResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private GetAuthServersConfiguration configuration;
        private String description;
        private @Nullable List<GetAuthServersFilter> filters;
        private String id;
        private String name;
        public Builder() {}
        public Builder(GetAuthServersResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configuration = defaults.configuration;
    	      this.description = defaults.description;
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
        }

        @CustomType.Setter
        public Builder configuration(GetAuthServersConfiguration configuration) {
            if (configuration == null) {
              throw new MissingRequiredPropertyException("GetAuthServersResult", "configuration");
            }
            this.configuration = configuration;
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            if (description == null) {
              throw new MissingRequiredPropertyException("GetAuthServersResult", "description");
            }
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder filters(@Nullable List<GetAuthServersFilter> filters) {

            this.filters = filters;
            return this;
        }
        public Builder filters(GetAuthServersFilter... filters) {
            return filters(List.of(filters));
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetAuthServersResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetAuthServersResult", "name");
            }
            this.name = name;
            return this;
        }
        public GetAuthServersResult build() {
            final var _resultValue = new GetAuthServersResult();
            _resultValue.configuration = configuration;
            _resultValue.description = description;
            _resultValue.filters = filters;
            _resultValue.id = id;
            _resultValue.name = name;
            return _resultValue;
        }
    }
}
