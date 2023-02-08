// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.onelogin.api.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GetAuthorizationsScopesConfiguration extends com.pulumi.resources.InvokeArgs {

    public static final GetAuthorizationsScopesConfiguration Empty = new GetAuthorizationsScopesConfiguration();

    @Import(name="accessTokenExpirationMinutes", required=true)
    private Integer accessTokenExpirationMinutes;

    public Integer accessTokenExpirationMinutes() {
        return this.accessTokenExpirationMinutes;
    }

    @Import(name="audiences", required=true)
    private List<String> audiences;

    public List<String> audiences() {
        return this.audiences;
    }

    @Import(name="refreshTokenExpirationMinutes", required=true)
    private Integer refreshTokenExpirationMinutes;

    public Integer refreshTokenExpirationMinutes() {
        return this.refreshTokenExpirationMinutes;
    }

    @Import(name="resourceIdentifier", required=true)
    private String resourceIdentifier;

    public String resourceIdentifier() {
        return this.resourceIdentifier;
    }

    private GetAuthorizationsScopesConfiguration() {}

    private GetAuthorizationsScopesConfiguration(GetAuthorizationsScopesConfiguration $) {
        this.accessTokenExpirationMinutes = $.accessTokenExpirationMinutes;
        this.audiences = $.audiences;
        this.refreshTokenExpirationMinutes = $.refreshTokenExpirationMinutes;
        this.resourceIdentifier = $.resourceIdentifier;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAuthorizationsScopesConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAuthorizationsScopesConfiguration $;

        public Builder() {
            $ = new GetAuthorizationsScopesConfiguration();
        }

        public Builder(GetAuthorizationsScopesConfiguration defaults) {
            $ = new GetAuthorizationsScopesConfiguration(Objects.requireNonNull(defaults));
        }

        public Builder accessTokenExpirationMinutes(Integer accessTokenExpirationMinutes) {
            $.accessTokenExpirationMinutes = accessTokenExpirationMinutes;
            return this;
        }

        public Builder audiences(List<String> audiences) {
            $.audiences = audiences;
            return this;
        }

        public Builder audiences(String... audiences) {
            return audiences(List.of(audiences));
        }

        public Builder refreshTokenExpirationMinutes(Integer refreshTokenExpirationMinutes) {
            $.refreshTokenExpirationMinutes = refreshTokenExpirationMinutes;
            return this;
        }

        public Builder resourceIdentifier(String resourceIdentifier) {
            $.resourceIdentifier = resourceIdentifier;
            return this;
        }

        public GetAuthorizationsScopesConfiguration build() {
            $.accessTokenExpirationMinutes = Objects.requireNonNull($.accessTokenExpirationMinutes, "expected parameter 'accessTokenExpirationMinutes' to be non-null");
            $.audiences = Objects.requireNonNull($.audiences, "expected parameter 'audiences' to be non-null");
            $.refreshTokenExpirationMinutes = Objects.requireNonNull($.refreshTokenExpirationMinutes, "expected parameter 'refreshTokenExpirationMinutes' to be non-null");
            $.resourceIdentifier = Objects.requireNonNull($.resourceIdentifier, "expected parameter 'resourceIdentifier' to be non-null");
            return $;
        }
    }

}