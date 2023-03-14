// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.onelogin.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AppEnforcementPointResource {
    private @Nullable String conditions;
    private @Nullable Boolean isPathRegex;
    private @Nullable String path;
    private @Nullable String permission;
    private @Nullable Boolean requireAuth;

    private AppEnforcementPointResource() {}
    public Optional<String> conditions() {
        return Optional.ofNullable(this.conditions);
    }
    public Optional<Boolean> isPathRegex() {
        return Optional.ofNullable(this.isPathRegex);
    }
    public Optional<String> path() {
        return Optional.ofNullable(this.path);
    }
    public Optional<String> permission() {
        return Optional.ofNullable(this.permission);
    }
    public Optional<Boolean> requireAuth() {
        return Optional.ofNullable(this.requireAuth);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AppEnforcementPointResource defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String conditions;
        private @Nullable Boolean isPathRegex;
        private @Nullable String path;
        private @Nullable String permission;
        private @Nullable Boolean requireAuth;
        public Builder() {}
        public Builder(AppEnforcementPointResource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.conditions = defaults.conditions;
    	      this.isPathRegex = defaults.isPathRegex;
    	      this.path = defaults.path;
    	      this.permission = defaults.permission;
    	      this.requireAuth = defaults.requireAuth;
        }

        @CustomType.Setter
        public Builder conditions(@Nullable String conditions) {
            this.conditions = conditions;
            return this;
        }
        @CustomType.Setter
        public Builder isPathRegex(@Nullable Boolean isPathRegex) {
            this.isPathRegex = isPathRegex;
            return this;
        }
        @CustomType.Setter
        public Builder path(@Nullable String path) {
            this.path = path;
            return this;
        }
        @CustomType.Setter
        public Builder permission(@Nullable String permission) {
            this.permission = permission;
            return this;
        }
        @CustomType.Setter
        public Builder requireAuth(@Nullable Boolean requireAuth) {
            this.requireAuth = requireAuth;
            return this;
        }
        public AppEnforcementPointResource build() {
            final var o = new AppEnforcementPointResource();
            o.conditions = conditions;
            o.isPathRegex = isPathRegex;
            o.path = path;
            o.permission = permission;
            o.requireAuth = requireAuth;
            return o;
        }
    }
}
