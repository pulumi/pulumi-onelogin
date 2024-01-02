// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.onelogin.roles.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.onelogin.roles.outputs.GetAppsFilter;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetAppsResult {
    private @Nullable List<GetAppsFilter> filters;
    private String iconUrl;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private String name;
    private String rolesId;

    private GetAppsResult() {}
    public List<GetAppsFilter> filters() {
        return this.filters == null ? List.of() : this.filters;
    }
    public String iconUrl() {
        return this.iconUrl;
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
    public String rolesId() {
        return this.rolesId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAppsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<GetAppsFilter> filters;
        private String iconUrl;
        private String id;
        private String name;
        private String rolesId;
        public Builder() {}
        public Builder(GetAppsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filters = defaults.filters;
    	      this.iconUrl = defaults.iconUrl;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.rolesId = defaults.rolesId;
        }

        @CustomType.Setter
        public Builder filters(@Nullable List<GetAppsFilter> filters) {

            this.filters = filters;
            return this;
        }
        public Builder filters(GetAppsFilter... filters) {
            return filters(List.of(filters));
        }
        @CustomType.Setter
        public Builder iconUrl(String iconUrl) {
            if (iconUrl == null) {
              throw new MissingRequiredPropertyException("GetAppsResult", "iconUrl");
            }
            this.iconUrl = iconUrl;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetAppsResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetAppsResult", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder rolesId(String rolesId) {
            if (rolesId == null) {
              throw new MissingRequiredPropertyException("GetAppsResult", "rolesId");
            }
            this.rolesId = rolesId;
            return this;
        }
        public GetAppsResult build() {
            final var _resultValue = new GetAppsResult();
            _resultValue.filters = filters;
            _resultValue.iconUrl = iconUrl;
            _resultValue.id = id;
            _resultValue.name = name;
            _resultValue.rolesId = rolesId;
            return _resultValue;
        }
    }
}
