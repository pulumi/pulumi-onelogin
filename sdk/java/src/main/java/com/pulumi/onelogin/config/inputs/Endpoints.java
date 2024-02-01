// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.onelogin.config.inputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class Endpoints {
    /**
     * @return Use this to override the resource endpoint URL (the default one or the one constructed from the `region`).
     * 
     */
    private @Nullable String apps;
    /**
     * @return Use this to override the resource endpoint URL (the default one or the one constructed from the `region`).
     * 
     */
    private @Nullable String appsRules;
    /**
     * @return Use this to override the resource endpoint URL (the default one or the one constructed from the `region`).
     * 
     */
    private @Nullable String authServers;
    /**
     * @return Use this to override the resource endpoint URL (the default one or the one constructed from the `region`).
     * 
     */
    private @Nullable String privileges;
    /**
     * @return Use this to override the resource endpoint URL (the default one or the one constructed from the `region`).
     * 
     */
    private @Nullable String riskRules;
    /**
     * @return Use this to override the resource endpoint URL (the default one or the one constructed from the `region`).
     * 
     */
    private @Nullable String roles;
    /**
     * @return Use this to override the resource endpoint URL (the default one or the one constructed from the `region`).
     * 
     */
    private @Nullable String users;
    /**
     * @return Use this to override the resource endpoint URL (the default one or the one constructed from the `region`).
     * 
     */
    private @Nullable String usersV1;

    private Endpoints() {}
    /**
     * @return Use this to override the resource endpoint URL (the default one or the one constructed from the `region`).
     * 
     */
    public Optional<String> apps() {
        return Optional.ofNullable(this.apps);
    }
    /**
     * @return Use this to override the resource endpoint URL (the default one or the one constructed from the `region`).
     * 
     */
    public Optional<String> appsRules() {
        return Optional.ofNullable(this.appsRules);
    }
    /**
     * @return Use this to override the resource endpoint URL (the default one or the one constructed from the `region`).
     * 
     */
    public Optional<String> authServers() {
        return Optional.ofNullable(this.authServers);
    }
    /**
     * @return Use this to override the resource endpoint URL (the default one or the one constructed from the `region`).
     * 
     */
    public Optional<String> privileges() {
        return Optional.ofNullable(this.privileges);
    }
    /**
     * @return Use this to override the resource endpoint URL (the default one or the one constructed from the `region`).
     * 
     */
    public Optional<String> riskRules() {
        return Optional.ofNullable(this.riskRules);
    }
    /**
     * @return Use this to override the resource endpoint URL (the default one or the one constructed from the `region`).
     * 
     */
    public Optional<String> roles() {
        return Optional.ofNullable(this.roles);
    }
    /**
     * @return Use this to override the resource endpoint URL (the default one or the one constructed from the `region`).
     * 
     */
    public Optional<String> users() {
        return Optional.ofNullable(this.users);
    }
    /**
     * @return Use this to override the resource endpoint URL (the default one or the one constructed from the `region`).
     * 
     */
    public Optional<String> usersV1() {
        return Optional.ofNullable(this.usersV1);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(Endpoints defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String apps;
        private @Nullable String appsRules;
        private @Nullable String authServers;
        private @Nullable String privileges;
        private @Nullable String riskRules;
        private @Nullable String roles;
        private @Nullable String users;
        private @Nullable String usersV1;
        public Builder() {}
        public Builder(Endpoints defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apps = defaults.apps;
    	      this.appsRules = defaults.appsRules;
    	      this.authServers = defaults.authServers;
    	      this.privileges = defaults.privileges;
    	      this.riskRules = defaults.riskRules;
    	      this.roles = defaults.roles;
    	      this.users = defaults.users;
    	      this.usersV1 = defaults.usersV1;
        }

        @CustomType.Setter
        public Builder apps(@Nullable String apps) {

            this.apps = apps;
            return this;
        }
        @CustomType.Setter
        public Builder appsRules(@Nullable String appsRules) {

            this.appsRules = appsRules;
            return this;
        }
        @CustomType.Setter
        public Builder authServers(@Nullable String authServers) {

            this.authServers = authServers;
            return this;
        }
        @CustomType.Setter
        public Builder privileges(@Nullable String privileges) {

            this.privileges = privileges;
            return this;
        }
        @CustomType.Setter
        public Builder riskRules(@Nullable String riskRules) {

            this.riskRules = riskRules;
            return this;
        }
        @CustomType.Setter
        public Builder roles(@Nullable String roles) {

            this.roles = roles;
            return this;
        }
        @CustomType.Setter
        public Builder users(@Nullable String users) {

            this.users = users;
            return this;
        }
        @CustomType.Setter
        public Builder usersV1(@Nullable String usersV1) {

            this.usersV1 = usersV1;
            return this;
        }
        public Endpoints build() {
            final var _resultValue = new Endpoints();
            _resultValue.apps = apps;
            _resultValue.appsRules = appsRules;
            _resultValue.authServers = authServers;
            _resultValue.privileges = privileges;
            _resultValue.riskRules = riskRules;
            _resultValue.roles = roles;
            _resultValue.users = users;
            _resultValue.usersV1 = usersV1;
            return _resultValue;
        }
    }
}
