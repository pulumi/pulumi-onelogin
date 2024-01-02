// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.onelogin.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class GetAppsConfiguration extends com.pulumi.resources.InvokeArgs {

    public static final GetAppsConfiguration Empty = new GetAppsConfiguration();

    @Import(name="accessTokenExpirationMinutes", required=true)
    private Integer accessTokenExpirationMinutes;

    public Integer accessTokenExpirationMinutes() {
        return this.accessTokenExpirationMinutes;
    }

    @Import(name="loginUrl", required=true)
    private String loginUrl;

    public String loginUrl() {
        return this.loginUrl;
    }

    @Import(name="oidcApiVersion", required=true)
    private String oidcApiVersion;

    public String oidcApiVersion() {
        return this.oidcApiVersion;
    }

    @Import(name="oidcApplicationType", required=true)
    private Integer oidcApplicationType;

    public Integer oidcApplicationType() {
        return this.oidcApplicationType;
    }

    @Import(name="oidcEncryptionKey", required=true)
    private String oidcEncryptionKey;

    public String oidcEncryptionKey() {
        return this.oidcEncryptionKey;
    }

    @Import(name="postLogoutRedirectUri", required=true)
    private String postLogoutRedirectUri;

    public String postLogoutRedirectUri() {
        return this.postLogoutRedirectUri;
    }

    @Import(name="redirectUri", required=true)
    private String redirectUri;

    public String redirectUri() {
        return this.redirectUri;
    }

    @Import(name="refreshTokenExpirationMinutes", required=true)
    private Integer refreshTokenExpirationMinutes;

    public Integer refreshTokenExpirationMinutes() {
        return this.refreshTokenExpirationMinutes;
    }

    @Import(name="tokenEndpointAuthMethod", required=true)
    private Integer tokenEndpointAuthMethod;

    public Integer tokenEndpointAuthMethod() {
        return this.tokenEndpointAuthMethod;
    }

    private GetAppsConfiguration() {}

    private GetAppsConfiguration(GetAppsConfiguration $) {
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
    public static Builder builder(GetAppsConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAppsConfiguration $;

        public Builder() {
            $ = new GetAppsConfiguration();
        }

        public Builder(GetAppsConfiguration defaults) {
            $ = new GetAppsConfiguration(Objects.requireNonNull(defaults));
        }

        public Builder accessTokenExpirationMinutes(Integer accessTokenExpirationMinutes) {
            $.accessTokenExpirationMinutes = accessTokenExpirationMinutes;
            return this;
        }

        public Builder loginUrl(String loginUrl) {
            $.loginUrl = loginUrl;
            return this;
        }

        public Builder oidcApiVersion(String oidcApiVersion) {
            $.oidcApiVersion = oidcApiVersion;
            return this;
        }

        public Builder oidcApplicationType(Integer oidcApplicationType) {
            $.oidcApplicationType = oidcApplicationType;
            return this;
        }

        public Builder oidcEncryptionKey(String oidcEncryptionKey) {
            $.oidcEncryptionKey = oidcEncryptionKey;
            return this;
        }

        public Builder postLogoutRedirectUri(String postLogoutRedirectUri) {
            $.postLogoutRedirectUri = postLogoutRedirectUri;
            return this;
        }

        public Builder redirectUri(String redirectUri) {
            $.redirectUri = redirectUri;
            return this;
        }

        public Builder refreshTokenExpirationMinutes(Integer refreshTokenExpirationMinutes) {
            $.refreshTokenExpirationMinutes = refreshTokenExpirationMinutes;
            return this;
        }

        public Builder tokenEndpointAuthMethod(Integer tokenEndpointAuthMethod) {
            $.tokenEndpointAuthMethod = tokenEndpointAuthMethod;
            return this;
        }

        public GetAppsConfiguration build() {
            if ($.accessTokenExpirationMinutes == null) {
                throw new MissingRequiredPropertyException("GetAppsConfiguration", "accessTokenExpirationMinutes");
            }
            if ($.loginUrl == null) {
                throw new MissingRequiredPropertyException("GetAppsConfiguration", "loginUrl");
            }
            if ($.oidcApiVersion == null) {
                throw new MissingRequiredPropertyException("GetAppsConfiguration", "oidcApiVersion");
            }
            if ($.oidcApplicationType == null) {
                throw new MissingRequiredPropertyException("GetAppsConfiguration", "oidcApplicationType");
            }
            if ($.oidcEncryptionKey == null) {
                throw new MissingRequiredPropertyException("GetAppsConfiguration", "oidcEncryptionKey");
            }
            if ($.postLogoutRedirectUri == null) {
                throw new MissingRequiredPropertyException("GetAppsConfiguration", "postLogoutRedirectUri");
            }
            if ($.redirectUri == null) {
                throw new MissingRequiredPropertyException("GetAppsConfiguration", "redirectUri");
            }
            if ($.refreshTokenExpirationMinutes == null) {
                throw new MissingRequiredPropertyException("GetAppsConfiguration", "refreshTokenExpirationMinutes");
            }
            if ($.tokenEndpointAuthMethod == null) {
                throw new MissingRequiredPropertyException("GetAppsConfiguration", "tokenEndpointAuthMethod");
            }
            return $;
        }
    }

}
