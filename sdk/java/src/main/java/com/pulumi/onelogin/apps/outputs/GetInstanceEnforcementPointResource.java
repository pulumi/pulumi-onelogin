// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.onelogin.apps.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetInstanceEnforcementPointResource {
    /**
     * @return required if permission == &#34;conditions&#34;
     * 
     */
    private String conditions;
    private Boolean isPathRegex;
    private String path;
    private String permission;
    private Boolean requireAuth;

    private GetInstanceEnforcementPointResource() {}
    /**
     * @return required if permission == &#34;conditions&#34;
     * 
     */
    public String conditions() {
        return this.conditions;
    }
    public Boolean isPathRegex() {
        return this.isPathRegex;
    }
    public String path() {
        return this.path;
    }
    public String permission() {
        return this.permission;
    }
    public Boolean requireAuth() {
        return this.requireAuth;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstanceEnforcementPointResource defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String conditions;
        private Boolean isPathRegex;
        private String path;
        private String permission;
        private Boolean requireAuth;
        public Builder() {}
        public Builder(GetInstanceEnforcementPointResource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.conditions = defaults.conditions;
    	      this.isPathRegex = defaults.isPathRegex;
    	      this.path = defaults.path;
    	      this.permission = defaults.permission;
    	      this.requireAuth = defaults.requireAuth;
        }

        @CustomType.Setter
        public Builder conditions(String conditions) {
            if (conditions == null) {
              throw new MissingRequiredPropertyException("GetInstanceEnforcementPointResource", "conditions");
            }
            this.conditions = conditions;
            return this;
        }
        @CustomType.Setter
        public Builder isPathRegex(Boolean isPathRegex) {
            if (isPathRegex == null) {
              throw new MissingRequiredPropertyException("GetInstanceEnforcementPointResource", "isPathRegex");
            }
            this.isPathRegex = isPathRegex;
            return this;
        }
        @CustomType.Setter
        public Builder path(String path) {
            if (path == null) {
              throw new MissingRequiredPropertyException("GetInstanceEnforcementPointResource", "path");
            }
            this.path = path;
            return this;
        }
        @CustomType.Setter
        public Builder permission(String permission) {
            if (permission == null) {
              throw new MissingRequiredPropertyException("GetInstanceEnforcementPointResource", "permission");
            }
            this.permission = permission;
            return this;
        }
        @CustomType.Setter
        public Builder requireAuth(Boolean requireAuth) {
            if (requireAuth == null) {
              throw new MissingRequiredPropertyException("GetInstanceEnforcementPointResource", "requireAuth");
            }
            this.requireAuth = requireAuth;
            return this;
        }
        public GetInstanceEnforcementPointResource build() {
            final var _resultValue = new GetInstanceEnforcementPointResource();
            _resultValue.conditions = conditions;
            _resultValue.isPathRegex = isPathRegex;
            _resultValue.path = path;
            _resultValue.permission = permission;
            _resultValue.requireAuth = requireAuth;
            return _resultValue;
        }
    }
}
