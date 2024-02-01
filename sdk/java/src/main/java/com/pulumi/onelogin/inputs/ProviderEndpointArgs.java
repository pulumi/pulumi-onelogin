// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.onelogin.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ProviderEndpointArgs extends com.pulumi.resources.ResourceArgs {

    public static final ProviderEndpointArgs Empty = new ProviderEndpointArgs();

    /**
     * Use this to override the resource endpoint URL (the default one or the one constructed from the `region`).
     * 
     */
    @Import(name="apps")
    private @Nullable Output<String> apps;

    /**
     * @return Use this to override the resource endpoint URL (the default one or the one constructed from the `region`).
     * 
     */
    public Optional<Output<String>> apps() {
        return Optional.ofNullable(this.apps);
    }

    /**
     * Use this to override the resource endpoint URL (the default one or the one constructed from the `region`).
     * 
     */
    @Import(name="appsRules")
    private @Nullable Output<String> appsRules;

    /**
     * @return Use this to override the resource endpoint URL (the default one or the one constructed from the `region`).
     * 
     */
    public Optional<Output<String>> appsRules() {
        return Optional.ofNullable(this.appsRules);
    }

    /**
     * Use this to override the resource endpoint URL (the default one or the one constructed from the `region`).
     * 
     */
    @Import(name="authServers")
    private @Nullable Output<String> authServers;

    /**
     * @return Use this to override the resource endpoint URL (the default one or the one constructed from the `region`).
     * 
     */
    public Optional<Output<String>> authServers() {
        return Optional.ofNullable(this.authServers);
    }

    /**
     * Use this to override the resource endpoint URL (the default one or the one constructed from the `region`).
     * 
     */
    @Import(name="privileges")
    private @Nullable Output<String> privileges;

    /**
     * @return Use this to override the resource endpoint URL (the default one or the one constructed from the `region`).
     * 
     */
    public Optional<Output<String>> privileges() {
        return Optional.ofNullable(this.privileges);
    }

    /**
     * Use this to override the resource endpoint URL (the default one or the one constructed from the `region`).
     * 
     */
    @Import(name="riskRules")
    private @Nullable Output<String> riskRules;

    /**
     * @return Use this to override the resource endpoint URL (the default one or the one constructed from the `region`).
     * 
     */
    public Optional<Output<String>> riskRules() {
        return Optional.ofNullable(this.riskRules);
    }

    /**
     * Use this to override the resource endpoint URL (the default one or the one constructed from the `region`).
     * 
     */
    @Import(name="roles")
    private @Nullable Output<String> roles;

    /**
     * @return Use this to override the resource endpoint URL (the default one or the one constructed from the `region`).
     * 
     */
    public Optional<Output<String>> roles() {
        return Optional.ofNullable(this.roles);
    }

    /**
     * Use this to override the resource endpoint URL (the default one or the one constructed from the `region`).
     * 
     */
    @Import(name="users")
    private @Nullable Output<String> users;

    /**
     * @return Use this to override the resource endpoint URL (the default one or the one constructed from the `region`).
     * 
     */
    public Optional<Output<String>> users() {
        return Optional.ofNullable(this.users);
    }

    /**
     * Use this to override the resource endpoint URL (the default one or the one constructed from the `region`).
     * 
     */
    @Import(name="usersV1")
    private @Nullable Output<String> usersV1;

    /**
     * @return Use this to override the resource endpoint URL (the default one or the one constructed from the `region`).
     * 
     */
    public Optional<Output<String>> usersV1() {
        return Optional.ofNullable(this.usersV1);
    }

    private ProviderEndpointArgs() {}

    private ProviderEndpointArgs(ProviderEndpointArgs $) {
        this.apps = $.apps;
        this.appsRules = $.appsRules;
        this.authServers = $.authServers;
        this.privileges = $.privileges;
        this.riskRules = $.riskRules;
        this.roles = $.roles;
        this.users = $.users;
        this.usersV1 = $.usersV1;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ProviderEndpointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProviderEndpointArgs $;

        public Builder() {
            $ = new ProviderEndpointArgs();
        }

        public Builder(ProviderEndpointArgs defaults) {
            $ = new ProviderEndpointArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param apps Use this to override the resource endpoint URL (the default one or the one constructed from the `region`).
         * 
         * @return builder
         * 
         */
        public Builder apps(@Nullable Output<String> apps) {
            $.apps = apps;
            return this;
        }

        /**
         * @param apps Use this to override the resource endpoint URL (the default one or the one constructed from the `region`).
         * 
         * @return builder
         * 
         */
        public Builder apps(String apps) {
            return apps(Output.of(apps));
        }

        /**
         * @param appsRules Use this to override the resource endpoint URL (the default one or the one constructed from the `region`).
         * 
         * @return builder
         * 
         */
        public Builder appsRules(@Nullable Output<String> appsRules) {
            $.appsRules = appsRules;
            return this;
        }

        /**
         * @param appsRules Use this to override the resource endpoint URL (the default one or the one constructed from the `region`).
         * 
         * @return builder
         * 
         */
        public Builder appsRules(String appsRules) {
            return appsRules(Output.of(appsRules));
        }

        /**
         * @param authServers Use this to override the resource endpoint URL (the default one or the one constructed from the `region`).
         * 
         * @return builder
         * 
         */
        public Builder authServers(@Nullable Output<String> authServers) {
            $.authServers = authServers;
            return this;
        }

        /**
         * @param authServers Use this to override the resource endpoint URL (the default one or the one constructed from the `region`).
         * 
         * @return builder
         * 
         */
        public Builder authServers(String authServers) {
            return authServers(Output.of(authServers));
        }

        /**
         * @param privileges Use this to override the resource endpoint URL (the default one or the one constructed from the `region`).
         * 
         * @return builder
         * 
         */
        public Builder privileges(@Nullable Output<String> privileges) {
            $.privileges = privileges;
            return this;
        }

        /**
         * @param privileges Use this to override the resource endpoint URL (the default one or the one constructed from the `region`).
         * 
         * @return builder
         * 
         */
        public Builder privileges(String privileges) {
            return privileges(Output.of(privileges));
        }

        /**
         * @param riskRules Use this to override the resource endpoint URL (the default one or the one constructed from the `region`).
         * 
         * @return builder
         * 
         */
        public Builder riskRules(@Nullable Output<String> riskRules) {
            $.riskRules = riskRules;
            return this;
        }

        /**
         * @param riskRules Use this to override the resource endpoint URL (the default one or the one constructed from the `region`).
         * 
         * @return builder
         * 
         */
        public Builder riskRules(String riskRules) {
            return riskRules(Output.of(riskRules));
        }

        /**
         * @param roles Use this to override the resource endpoint URL (the default one or the one constructed from the `region`).
         * 
         * @return builder
         * 
         */
        public Builder roles(@Nullable Output<String> roles) {
            $.roles = roles;
            return this;
        }

        /**
         * @param roles Use this to override the resource endpoint URL (the default one or the one constructed from the `region`).
         * 
         * @return builder
         * 
         */
        public Builder roles(String roles) {
            return roles(Output.of(roles));
        }

        /**
         * @param users Use this to override the resource endpoint URL (the default one or the one constructed from the `region`).
         * 
         * @return builder
         * 
         */
        public Builder users(@Nullable Output<String> users) {
            $.users = users;
            return this;
        }

        /**
         * @param users Use this to override the resource endpoint URL (the default one or the one constructed from the `region`).
         * 
         * @return builder
         * 
         */
        public Builder users(String users) {
            return users(Output.of(users));
        }

        /**
         * @param usersV1 Use this to override the resource endpoint URL (the default one or the one constructed from the `region`).
         * 
         * @return builder
         * 
         */
        public Builder usersV1(@Nullable Output<String> usersV1) {
            $.usersV1 = usersV1;
            return this;
        }

        /**
         * @param usersV1 Use this to override the resource endpoint URL (the default one or the one constructed from the `region`).
         * 
         * @return builder
         * 
         */
        public Builder usersV1(String usersV1) {
            return usersV1(Output.of(usersV1));
        }

        public ProviderEndpointArgs build() {
            return $;
        }
    }

}
