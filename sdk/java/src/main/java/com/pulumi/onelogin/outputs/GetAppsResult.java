// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.onelogin.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.onelogin.outputs.GetAppsConfiguration;
import com.pulumi.onelogin.outputs.GetAppsEnforcementPoint;
import com.pulumi.onelogin.outputs.GetAppsFilter;
import com.pulumi.onelogin.outputs.GetAppsParameters;
import com.pulumi.onelogin.outputs.GetAppsProvisioning;
import com.pulumi.onelogin.outputs.GetAppsSso;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetAppsResult {
    private Boolean allowAssumedSignin;
    private Integer authMethod;
    private String authMethodDescription;
    private Integer brandId;
    private GetAppsConfiguration configuration;
    private Integer connectorId;
    private String createdAt;
    private String description;
    private GetAppsEnforcementPoint enforcementPoint;
    private @Nullable List<GetAppsFilter> filters;
    private String iconUrl;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private Integer loginConfig;
    private String name;
    private String notes;
    private GetAppsParameters parameters;
    private Integer policyId;
    private GetAppsProvisioning provisioning;
    private List<Integer> roleIds;
    private GetAppsSso sso;
    private Integer tabId;
    private String updatedAt;
    private Boolean visible;

    private GetAppsResult() {}
    public Boolean allowAssumedSignin() {
        return this.allowAssumedSignin;
    }
    public Integer authMethod() {
        return this.authMethod;
    }
    public String authMethodDescription() {
        return this.authMethodDescription;
    }
    public Integer brandId() {
        return this.brandId;
    }
    public GetAppsConfiguration configuration() {
        return this.configuration;
    }
    public Integer connectorId() {
        return this.connectorId;
    }
    public String createdAt() {
        return this.createdAt;
    }
    public String description() {
        return this.description;
    }
    public GetAppsEnforcementPoint enforcementPoint() {
        return this.enforcementPoint;
    }
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
    public Integer loginConfig() {
        return this.loginConfig;
    }
    public String name() {
        return this.name;
    }
    public String notes() {
        return this.notes;
    }
    public GetAppsParameters parameters() {
        return this.parameters;
    }
    public Integer policyId() {
        return this.policyId;
    }
    public GetAppsProvisioning provisioning() {
        return this.provisioning;
    }
    public List<Integer> roleIds() {
        return this.roleIds;
    }
    public GetAppsSso sso() {
        return this.sso;
    }
    public Integer tabId() {
        return this.tabId;
    }
    public String updatedAt() {
        return this.updatedAt;
    }
    public Boolean visible() {
        return this.visible;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAppsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean allowAssumedSignin;
        private Integer authMethod;
        private String authMethodDescription;
        private Integer brandId;
        private GetAppsConfiguration configuration;
        private Integer connectorId;
        private String createdAt;
        private String description;
        private GetAppsEnforcementPoint enforcementPoint;
        private @Nullable List<GetAppsFilter> filters;
        private String iconUrl;
        private String id;
        private Integer loginConfig;
        private String name;
        private String notes;
        private GetAppsParameters parameters;
        private Integer policyId;
        private GetAppsProvisioning provisioning;
        private List<Integer> roleIds;
        private GetAppsSso sso;
        private Integer tabId;
        private String updatedAt;
        private Boolean visible;
        public Builder() {}
        public Builder(GetAppsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowAssumedSignin = defaults.allowAssumedSignin;
    	      this.authMethod = defaults.authMethod;
    	      this.authMethodDescription = defaults.authMethodDescription;
    	      this.brandId = defaults.brandId;
    	      this.configuration = defaults.configuration;
    	      this.connectorId = defaults.connectorId;
    	      this.createdAt = defaults.createdAt;
    	      this.description = defaults.description;
    	      this.enforcementPoint = defaults.enforcementPoint;
    	      this.filters = defaults.filters;
    	      this.iconUrl = defaults.iconUrl;
    	      this.id = defaults.id;
    	      this.loginConfig = defaults.loginConfig;
    	      this.name = defaults.name;
    	      this.notes = defaults.notes;
    	      this.parameters = defaults.parameters;
    	      this.policyId = defaults.policyId;
    	      this.provisioning = defaults.provisioning;
    	      this.roleIds = defaults.roleIds;
    	      this.sso = defaults.sso;
    	      this.tabId = defaults.tabId;
    	      this.updatedAt = defaults.updatedAt;
    	      this.visible = defaults.visible;
        }

        @CustomType.Setter
        public Builder allowAssumedSignin(Boolean allowAssumedSignin) {
            this.allowAssumedSignin = Objects.requireNonNull(allowAssumedSignin);
            return this;
        }
        @CustomType.Setter
        public Builder authMethod(Integer authMethod) {
            this.authMethod = Objects.requireNonNull(authMethod);
            return this;
        }
        @CustomType.Setter
        public Builder authMethodDescription(String authMethodDescription) {
            this.authMethodDescription = Objects.requireNonNull(authMethodDescription);
            return this;
        }
        @CustomType.Setter
        public Builder brandId(Integer brandId) {
            this.brandId = Objects.requireNonNull(brandId);
            return this;
        }
        @CustomType.Setter
        public Builder configuration(GetAppsConfiguration configuration) {
            this.configuration = Objects.requireNonNull(configuration);
            return this;
        }
        @CustomType.Setter
        public Builder connectorId(Integer connectorId) {
            this.connectorId = Objects.requireNonNull(connectorId);
            return this;
        }
        @CustomType.Setter
        public Builder createdAt(String createdAt) {
            this.createdAt = Objects.requireNonNull(createdAt);
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        @CustomType.Setter
        public Builder enforcementPoint(GetAppsEnforcementPoint enforcementPoint) {
            this.enforcementPoint = Objects.requireNonNull(enforcementPoint);
            return this;
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
            this.iconUrl = Objects.requireNonNull(iconUrl);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder loginConfig(Integer loginConfig) {
            this.loginConfig = Objects.requireNonNull(loginConfig);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder notes(String notes) {
            this.notes = Objects.requireNonNull(notes);
            return this;
        }
        @CustomType.Setter
        public Builder parameters(GetAppsParameters parameters) {
            this.parameters = Objects.requireNonNull(parameters);
            return this;
        }
        @CustomType.Setter
        public Builder policyId(Integer policyId) {
            this.policyId = Objects.requireNonNull(policyId);
            return this;
        }
        @CustomType.Setter
        public Builder provisioning(GetAppsProvisioning provisioning) {
            this.provisioning = Objects.requireNonNull(provisioning);
            return this;
        }
        @CustomType.Setter
        public Builder roleIds(List<Integer> roleIds) {
            this.roleIds = Objects.requireNonNull(roleIds);
            return this;
        }
        public Builder roleIds(Integer... roleIds) {
            return roleIds(List.of(roleIds));
        }
        @CustomType.Setter
        public Builder sso(GetAppsSso sso) {
            this.sso = Objects.requireNonNull(sso);
            return this;
        }
        @CustomType.Setter
        public Builder tabId(Integer tabId) {
            this.tabId = Objects.requireNonNull(tabId);
            return this;
        }
        @CustomType.Setter
        public Builder updatedAt(String updatedAt) {
            this.updatedAt = Objects.requireNonNull(updatedAt);
            return this;
        }
        @CustomType.Setter
        public Builder visible(Boolean visible) {
            this.visible = Objects.requireNonNull(visible);
            return this;
        }
        public GetAppsResult build() {
            final var o = new GetAppsResult();
            o.allowAssumedSignin = allowAssumedSignin;
            o.authMethod = authMethod;
            o.authMethodDescription = authMethodDescription;
            o.brandId = brandId;
            o.configuration = configuration;
            o.connectorId = connectorId;
            o.createdAt = createdAt;
            o.description = description;
            o.enforcementPoint = enforcementPoint;
            o.filters = filters;
            o.iconUrl = iconUrl;
            o.id = id;
            o.loginConfig = loginConfig;
            o.name = name;
            o.notes = notes;
            o.parameters = parameters;
            o.policyId = policyId;
            o.provisioning = provisioning;
            o.roleIds = roleIds;
            o.sso = sso;
            o.tabId = tabId;
            o.updatedAt = updatedAt;
            o.visible = visible;
            return o;
        }
    }
}
