// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.onelogin.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AppConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final AppConfigurationArgs Empty = new AppConfigurationArgs();

    /**
     * OIDC Apps only Number of minutes the refresh token will be valid for.
     * 
     */
    @Import(name="accessTokenExpirationMinutes")
    private @Nullable Output<Integer> accessTokenExpirationMinutes;

    /**
     * @return OIDC Apps only Number of minutes the refresh token will be valid for.
     * 
     */
    public Optional<Output<Integer>> accessTokenExpirationMinutes() {
        return Optional.ofNullable(this.accessTokenExpirationMinutes);
    }

    /**
     * OIDC Apps only The OpenId Connect Client Id. Note that client_secret is only returned after Creating an App.
     * 
     */
    @Import(name="loginUrl")
    private @Nullable Output<String> loginUrl;

    /**
     * @return OIDC Apps only The OpenId Connect Client Id. Note that client_secret is only returned after Creating an App.
     * 
     */
    public Optional<Output<String>> loginUrl() {
        return Optional.ofNullable(this.loginUrl);
    }

    @Import(name="oidcApiVersion")
    private @Nullable Output<String> oidcApiVersion;

    public Optional<Output<String>> oidcApiVersion() {
        return Optional.ofNullable(this.oidcApiVersion);
    }

    /**
     * OIDC Apps Only
     *   - 0: Web
     *   - 1: Native/Mobile
     * 
     */
    @Import(name="oidcApplicationType")
    private @Nullable Output<Integer> oidcApplicationType;

    /**
     * @return OIDC Apps Only
     *   - 0: Web
     *   - 1: Native/Mobile
     * 
     */
    public Optional<Output<Integer>> oidcApplicationType() {
        return Optional.ofNullable(this.oidcApplicationType);
    }

    /**
     * OIDC Apps only
     * 
     */
    @Import(name="oidcEncryptionKey")
    private @Nullable Output<String> oidcEncryptionKey;

    /**
     * @return OIDC Apps only
     * 
     */
    public Optional<Output<String>> oidcEncryptionKey() {
        return Optional.ofNullable(this.oidcEncryptionKey);
    }

    /**
     * OIDC Apps only
     * 
     */
    @Import(name="postLogoutRedirectUri")
    private @Nullable Output<String> postLogoutRedirectUri;

    /**
     * @return OIDC Apps only
     * 
     */
    public Optional<Output<String>> postLogoutRedirectUri() {
        return Optional.ofNullable(this.postLogoutRedirectUri);
    }

    /**
     * OIDC Apps only Comma or newline separated list of valid redirect uris for the OpenId Connect Authorization Code flow.
     * 
     */
    @Import(name="redirectUri")
    private @Nullable Output<String> redirectUri;

    /**
     * @return OIDC Apps only Comma or newline separated list of valid redirect uris for the OpenId Connect Authorization Code flow.
     * 
     */
    public Optional<Output<String>> redirectUri() {
        return Optional.ofNullable(this.redirectUri);
    }

    /**
     * Number of minutes the refresh token will be valid for.
     * 
     */
    @Import(name="refreshTokenExpirationMinutes")
    private @Nullable Output<Integer> refreshTokenExpirationMinutes;

    /**
     * @return Number of minutes the refresh token will be valid for.
     * 
     */
    public Optional<Output<Integer>> refreshTokenExpirationMinutes() {
        return Optional.ofNullable(this.refreshTokenExpirationMinutes);
    }

    /**
     * OIDC Apps only
     *  - 0: Basic
     *  - 1: POST
     *  - 2: None / PKCE
     * 
     */
    @Import(name="tokenEndpointAuthMethod")
    private @Nullable Output<Integer> tokenEndpointAuthMethod;

    /**
     * @return OIDC Apps only
     *  - 0: Basic
     *  - 1: POST
     *  - 2: None / PKCE
     * 
     */
    public Optional<Output<Integer>> tokenEndpointAuthMethod() {
        return Optional.ofNullable(this.tokenEndpointAuthMethod);
    }

    private AppConfigurationArgs() {}

    private AppConfigurationArgs(AppConfigurationArgs $) {
        this.accessTokenExpirationMinutes = $.accessTokenExpirationMinutes;
        this.loginUrl = $.loginUrl;
        this.oidcApiVersion = $.oidcApiVersion;
        this.oidcApplicationType = $.oidcApplicationType;
        this.oidcEncryptionKey = $.oidcEncryptionKey;
        this.postLogoutRedirectUri = $.postLogoutRedirectUri;
        this.redirectUri = $.redirectUri;
        this.refreshTokenExpirationMinutes = $.refreshTokenExpirationMinutes;
        this.tokenEndpointAuthMethod = $.tokenEndpointAuthMethod;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AppConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AppConfigurationArgs $;

        public Builder() {
            $ = new AppConfigurationArgs();
        }

        public Builder(AppConfigurationArgs defaults) {
            $ = new AppConfigurationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accessTokenExpirationMinutes OIDC Apps only Number of minutes the refresh token will be valid for.
         * 
         * @return builder
         * 
         */
        public Builder accessTokenExpirationMinutes(@Nullable Output<Integer> accessTokenExpirationMinutes) {
            $.accessTokenExpirationMinutes = accessTokenExpirationMinutes;
            return this;
        }

        /**
         * @param accessTokenExpirationMinutes OIDC Apps only Number of minutes the refresh token will be valid for.
         * 
         * @return builder
         * 
         */
        public Builder accessTokenExpirationMinutes(Integer accessTokenExpirationMinutes) {
            return accessTokenExpirationMinutes(Output.of(accessTokenExpirationMinutes));
        }

        /**
         * @param loginUrl OIDC Apps only The OpenId Connect Client Id. Note that client_secret is only returned after Creating an App.
         * 
         * @return builder
         * 
         */
        public Builder loginUrl(@Nullable Output<String> loginUrl) {
            $.loginUrl = loginUrl;
            return this;
        }

        /**
         * @param loginUrl OIDC Apps only The OpenId Connect Client Id. Note that client_secret is only returned after Creating an App.
         * 
         * @return builder
         * 
         */
        public Builder loginUrl(String loginUrl) {
            return loginUrl(Output.of(loginUrl));
        }

        public Builder oidcApiVersion(@Nullable Output<String> oidcApiVersion) {
            $.oidcApiVersion = oidcApiVersion;
            return this;
        }

        public Builder oidcApiVersion(String oidcApiVersion) {
            return oidcApiVersion(Output.of(oidcApiVersion));
        }

        /**
         * @param oidcApplicationType OIDC Apps Only
         *   - 0: Web
         *   - 1: Native/Mobile
         * 
         * @return builder
         * 
         */
        public Builder oidcApplicationType(@Nullable Output<Integer> oidcApplicationType) {
            $.oidcApplicationType = oidcApplicationType;
            return this;
        }

        /**
         * @param oidcApplicationType OIDC Apps Only
         *   - 0: Web
         *   - 1: Native/Mobile
         * 
         * @return builder
         * 
         */
        public Builder oidcApplicationType(Integer oidcApplicationType) {
            return oidcApplicationType(Output.of(oidcApplicationType));
        }

        /**
         * @param oidcEncryptionKey OIDC Apps only
         * 
         * @return builder
         * 
         */
        public Builder oidcEncryptionKey(@Nullable Output<String> oidcEncryptionKey) {
            $.oidcEncryptionKey = oidcEncryptionKey;
            return this;
        }

        /**
         * @param oidcEncryptionKey OIDC Apps only
         * 
         * @return builder
         * 
         */
        public Builder oidcEncryptionKey(String oidcEncryptionKey) {
            return oidcEncryptionKey(Output.of(oidcEncryptionKey));
        }

        /**
         * @param postLogoutRedirectUri OIDC Apps only
         * 
         * @return builder
         * 
         */
        public Builder postLogoutRedirectUri(@Nullable Output<String> postLogoutRedirectUri) {
            $.postLogoutRedirectUri = postLogoutRedirectUri;
            return this;
        }

        /**
         * @param postLogoutRedirectUri OIDC Apps only
         * 
         * @return builder
         * 
         */
        public Builder postLogoutRedirectUri(String postLogoutRedirectUri) {
            return postLogoutRedirectUri(Output.of(postLogoutRedirectUri));
        }

        /**
         * @param redirectUri OIDC Apps only Comma or newline separated list of valid redirect uris for the OpenId Connect Authorization Code flow.
         * 
         * @return builder
         * 
         */
        public Builder redirectUri(@Nullable Output<String> redirectUri) {
            $.redirectUri = redirectUri;
            return this;
        }

        /**
         * @param redirectUri OIDC Apps only Comma or newline separated list of valid redirect uris for the OpenId Connect Authorization Code flow.
         * 
         * @return builder
         * 
         */
        public Builder redirectUri(String redirectUri) {
            return redirectUri(Output.of(redirectUri));
        }

        /**
         * @param refreshTokenExpirationMinutes Number of minutes the refresh token will be valid for.
         * 
         * @return builder
         * 
         */
        public Builder refreshTokenExpirationMinutes(@Nullable Output<Integer> refreshTokenExpirationMinutes) {
            $.refreshTokenExpirationMinutes = refreshTokenExpirationMinutes;
            return this;
        }

        /**
         * @param refreshTokenExpirationMinutes Number of minutes the refresh token will be valid for.
         * 
         * @return builder
         * 
         */
        public Builder refreshTokenExpirationMinutes(Integer refreshTokenExpirationMinutes) {
            return refreshTokenExpirationMinutes(Output.of(refreshTokenExpirationMinutes));
        }

        /**
         * @param tokenEndpointAuthMethod OIDC Apps only
         *  - 0: Basic
         *  - 1: POST
         *  - 2: None / PKCE
         * 
         * @return builder
         * 
         */
        public Builder tokenEndpointAuthMethod(@Nullable Output<Integer> tokenEndpointAuthMethod) {
            $.tokenEndpointAuthMethod = tokenEndpointAuthMethod;
            return this;
        }

        /**
         * @param tokenEndpointAuthMethod OIDC Apps only
         *  - 0: Basic
         *  - 1: POST
         *  - 2: None / PKCE
         * 
         * @return builder
         * 
         */
        public Builder tokenEndpointAuthMethod(Integer tokenEndpointAuthMethod) {
            return tokenEndpointAuthMethod(Output.of(tokenEndpointAuthMethod));
        }

        public AppConfigurationArgs build() {
            return $;
        }
    }

}
