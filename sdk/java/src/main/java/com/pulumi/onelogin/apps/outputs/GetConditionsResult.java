// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.onelogin.apps.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.onelogin.apps.outputs.GetConditionsFilter;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetConditionsResult {
    private String appsId;
    private @Nullable List<GetConditionsFilter> filters;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private String name;
    private String value;

    private GetConditionsResult() {}
    public String appsId() {
        return this.appsId;
    }
    public List<GetConditionsFilter> filters() {
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
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetConditionsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String appsId;
        private @Nullable List<GetConditionsFilter> filters;
        private String id;
        private String name;
        private String value;
        public Builder() {}
        public Builder(GetConditionsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appsId = defaults.appsId;
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder appsId(String appsId) {
            if (appsId == null) {
              throw new MissingRequiredPropertyException("GetConditionsResult", "appsId");
            }
            this.appsId = appsId;
            return this;
        }
        @CustomType.Setter
        public Builder filters(@Nullable List<GetConditionsFilter> filters) {

            this.filters = filters;
            return this;
        }
        public Builder filters(GetConditionsFilter... filters) {
            return filters(List.of(filters));
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetConditionsResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetConditionsResult", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder value(String value) {
            if (value == null) {
              throw new MissingRequiredPropertyException("GetConditionsResult", "value");
            }
            this.value = value;
            return this;
        }
        public GetConditionsResult build() {
            final var _resultValue = new GetConditionsResult();
            _resultValue.appsId = appsId;
            _resultValue.filters = filters;
            _resultValue.id = id;
            _resultValue.name = name;
            _resultValue.value = value;
            return _resultValue;
        }
    }
}
