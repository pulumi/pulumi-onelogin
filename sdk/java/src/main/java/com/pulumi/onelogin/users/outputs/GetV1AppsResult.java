// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.onelogin.users.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.onelogin.users.outputs.GetV1AppsFilter;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetV1AppsResult {
    private Boolean extension;
    private @Nullable List<GetV1AppsFilter> filters;
    private String iconUrl;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private Integer loginId;
    private String name;
    private Boolean provisioningEnabled;
    private String provisioningState;
    private String provisioningStatus;
    private String usersV1Id;

    private GetV1AppsResult() {}
    public Boolean extension() {
        return this.extension;
    }
    public List<GetV1AppsFilter> filters() {
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
    public Integer loginId() {
        return this.loginId;
    }
    public String name() {
        return this.name;
    }
    public Boolean provisioningEnabled() {
        return this.provisioningEnabled;
    }
    public String provisioningState() {
        return this.provisioningState;
    }
    public String provisioningStatus() {
        return this.provisioningStatus;
    }
    public String usersV1Id() {
        return this.usersV1Id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetV1AppsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean extension;
        private @Nullable List<GetV1AppsFilter> filters;
        private String iconUrl;
        private String id;
        private Integer loginId;
        private String name;
        private Boolean provisioningEnabled;
        private String provisioningState;
        private String provisioningStatus;
        private String usersV1Id;
        public Builder() {}
        public Builder(GetV1AppsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.extension = defaults.extension;
    	      this.filters = defaults.filters;
    	      this.iconUrl = defaults.iconUrl;
    	      this.id = defaults.id;
    	      this.loginId = defaults.loginId;
    	      this.name = defaults.name;
    	      this.provisioningEnabled = defaults.provisioningEnabled;
    	      this.provisioningState = defaults.provisioningState;
    	      this.provisioningStatus = defaults.provisioningStatus;
    	      this.usersV1Id = defaults.usersV1Id;
        }

        @CustomType.Setter
        public Builder extension(Boolean extension) {
            this.extension = Objects.requireNonNull(extension);
            return this;
        }
        @CustomType.Setter
        public Builder filters(@Nullable List<GetV1AppsFilter> filters) {
            this.filters = filters;
            return this;
        }
        public Builder filters(GetV1AppsFilter... filters) {
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
        public Builder loginId(Integer loginId) {
            this.loginId = Objects.requireNonNull(loginId);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder provisioningEnabled(Boolean provisioningEnabled) {
            this.provisioningEnabled = Objects.requireNonNull(provisioningEnabled);
            return this;
        }
        @CustomType.Setter
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        @CustomType.Setter
        public Builder provisioningStatus(String provisioningStatus) {
            this.provisioningStatus = Objects.requireNonNull(provisioningStatus);
            return this;
        }
        @CustomType.Setter
        public Builder usersV1Id(String usersV1Id) {
            this.usersV1Id = Objects.requireNonNull(usersV1Id);
            return this;
        }
        public GetV1AppsResult build() {
            final var o = new GetV1AppsResult();
            o.extension = extension;
            o.filters = filters;
            o.iconUrl = iconUrl;
            o.id = id;
            o.loginId = loginId;
            o.name = name;
            o.provisioningEnabled = provisioningEnabled;
            o.provisioningState = provisioningState;
            o.provisioningStatus = provisioningStatus;
            o.usersV1Id = usersV1Id;
            return o;
        }
    }
}
