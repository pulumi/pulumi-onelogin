// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.onelogin.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.onelogin.outputs.AppEnforcementPointResource;
import com.pulumi.onelogin.outputs.AppEnforcementPointSessionExpiryFixed;
import com.pulumi.onelogin.outputs.AppEnforcementPointSessionExpiryInactivity;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AppEnforcementPoint {
    private @Nullable Boolean caseSensitive;
    private @Nullable String conditions;
    private @Nullable String contextRoot;
    private @Nullable String landingPage;
    private @Nullable String permissions;
    private @Nullable Boolean requireSitewideAuthentication;
    private @Nullable List<AppEnforcementPointResource> resources;
    private @Nullable AppEnforcementPointSessionExpiryFixed sessionExpiryFixed;
    private @Nullable AppEnforcementPointSessionExpiryInactivity sessionExpiryInactivity;
    private @Nullable String target;
    private @Nullable String token;
    private @Nullable Boolean useTargetHostHeader;
    private @Nullable String vhost;

    private AppEnforcementPoint() {}
    public Optional<Boolean> caseSensitive() {
        return Optional.ofNullable(this.caseSensitive);
    }
    public Optional<String> conditions() {
        return Optional.ofNullable(this.conditions);
    }
    public Optional<String> contextRoot() {
        return Optional.ofNullable(this.contextRoot);
    }
    public Optional<String> landingPage() {
        return Optional.ofNullable(this.landingPage);
    }
    public Optional<String> permissions() {
        return Optional.ofNullable(this.permissions);
    }
    public Optional<Boolean> requireSitewideAuthentication() {
        return Optional.ofNullable(this.requireSitewideAuthentication);
    }
    public List<AppEnforcementPointResource> resources() {
        return this.resources == null ? List.of() : this.resources;
    }
    public Optional<AppEnforcementPointSessionExpiryFixed> sessionExpiryFixed() {
        return Optional.ofNullable(this.sessionExpiryFixed);
    }
    public Optional<AppEnforcementPointSessionExpiryInactivity> sessionExpiryInactivity() {
        return Optional.ofNullable(this.sessionExpiryInactivity);
    }
    public Optional<String> target() {
        return Optional.ofNullable(this.target);
    }
    public Optional<String> token() {
        return Optional.ofNullable(this.token);
    }
    public Optional<Boolean> useTargetHostHeader() {
        return Optional.ofNullable(this.useTargetHostHeader);
    }
    public Optional<String> vhost() {
        return Optional.ofNullable(this.vhost);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AppEnforcementPoint defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean caseSensitive;
        private @Nullable String conditions;
        private @Nullable String contextRoot;
        private @Nullable String landingPage;
        private @Nullable String permissions;
        private @Nullable Boolean requireSitewideAuthentication;
        private @Nullable List<AppEnforcementPointResource> resources;
        private @Nullable AppEnforcementPointSessionExpiryFixed sessionExpiryFixed;
        private @Nullable AppEnforcementPointSessionExpiryInactivity sessionExpiryInactivity;
        private @Nullable String target;
        private @Nullable String token;
        private @Nullable Boolean useTargetHostHeader;
        private @Nullable String vhost;
        public Builder() {}
        public Builder(AppEnforcementPoint defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.caseSensitive = defaults.caseSensitive;
    	      this.conditions = defaults.conditions;
    	      this.contextRoot = defaults.contextRoot;
    	      this.landingPage = defaults.landingPage;
    	      this.permissions = defaults.permissions;
    	      this.requireSitewideAuthentication = defaults.requireSitewideAuthentication;
    	      this.resources = defaults.resources;
    	      this.sessionExpiryFixed = defaults.sessionExpiryFixed;
    	      this.sessionExpiryInactivity = defaults.sessionExpiryInactivity;
    	      this.target = defaults.target;
    	      this.token = defaults.token;
    	      this.useTargetHostHeader = defaults.useTargetHostHeader;
    	      this.vhost = defaults.vhost;
        }

        @CustomType.Setter
        public Builder caseSensitive(@Nullable Boolean caseSensitive) {
            this.caseSensitive = caseSensitive;
            return this;
        }
        @CustomType.Setter
        public Builder conditions(@Nullable String conditions) {
            this.conditions = conditions;
            return this;
        }
        @CustomType.Setter
        public Builder contextRoot(@Nullable String contextRoot) {
            this.contextRoot = contextRoot;
            return this;
        }
        @CustomType.Setter
        public Builder landingPage(@Nullable String landingPage) {
            this.landingPage = landingPage;
            return this;
        }
        @CustomType.Setter
        public Builder permissions(@Nullable String permissions) {
            this.permissions = permissions;
            return this;
        }
        @CustomType.Setter
        public Builder requireSitewideAuthentication(@Nullable Boolean requireSitewideAuthentication) {
            this.requireSitewideAuthentication = requireSitewideAuthentication;
            return this;
        }
        @CustomType.Setter
        public Builder resources(@Nullable List<AppEnforcementPointResource> resources) {
            this.resources = resources;
            return this;
        }
        public Builder resources(AppEnforcementPointResource... resources) {
            return resources(List.of(resources));
        }
        @CustomType.Setter
        public Builder sessionExpiryFixed(@Nullable AppEnforcementPointSessionExpiryFixed sessionExpiryFixed) {
            this.sessionExpiryFixed = sessionExpiryFixed;
            return this;
        }
        @CustomType.Setter
        public Builder sessionExpiryInactivity(@Nullable AppEnforcementPointSessionExpiryInactivity sessionExpiryInactivity) {
            this.sessionExpiryInactivity = sessionExpiryInactivity;
            return this;
        }
        @CustomType.Setter
        public Builder target(@Nullable String target) {
            this.target = target;
            return this;
        }
        @CustomType.Setter
        public Builder token(@Nullable String token) {
            this.token = token;
            return this;
        }
        @CustomType.Setter
        public Builder useTargetHostHeader(@Nullable Boolean useTargetHostHeader) {
            this.useTargetHostHeader = useTargetHostHeader;
            return this;
        }
        @CustomType.Setter
        public Builder vhost(@Nullable String vhost) {
            this.vhost = vhost;
            return this;
        }
        public AppEnforcementPoint build() {
            final var _resultValue = new AppEnforcementPoint();
            _resultValue.caseSensitive = caseSensitive;
            _resultValue.conditions = conditions;
            _resultValue.contextRoot = contextRoot;
            _resultValue.landingPage = landingPage;
            _resultValue.permissions = permissions;
            _resultValue.requireSitewideAuthentication = requireSitewideAuthentication;
            _resultValue.resources = resources;
            _resultValue.sessionExpiryFixed = sessionExpiryFixed;
            _resultValue.sessionExpiryInactivity = sessionExpiryInactivity;
            _resultValue.target = target;
            _resultValue.token = token;
            _resultValue.useTargetHostHeader = useTargetHostHeader;
            _resultValue.vhost = vhost;
            return _resultValue;
        }
    }
}
