// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.onelogin.api.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetAuthorizationsScopesConfiguration {
    private Integer accessTokenExpirationMinutes;
    private List<String> audiences;
    private Integer refreshTokenExpirationMinutes;
    private String resourceIdentifier;

    private GetAuthorizationsScopesConfiguration() {}
    public Integer accessTokenExpirationMinutes() {
        return this.accessTokenExpirationMinutes;
    }
    public List<String> audiences() {
        return this.audiences;
    }
    public Integer refreshTokenExpirationMinutes() {
        return this.refreshTokenExpirationMinutes;
    }
    public String resourceIdentifier() {
        return this.resourceIdentifier;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAuthorizationsScopesConfiguration defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer accessTokenExpirationMinutes;
        private List<String> audiences;
        private Integer refreshTokenExpirationMinutes;
        private String resourceIdentifier;
        public Builder() {}
        public Builder(GetAuthorizationsScopesConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessTokenExpirationMinutes = defaults.accessTokenExpirationMinutes;
    	      this.audiences = defaults.audiences;
    	      this.refreshTokenExpirationMinutes = defaults.refreshTokenExpirationMinutes;
    	      this.resourceIdentifier = defaults.resourceIdentifier;
        }

        @CustomType.Setter
        public Builder accessTokenExpirationMinutes(Integer accessTokenExpirationMinutes) {
            this.accessTokenExpirationMinutes = Objects.requireNonNull(accessTokenExpirationMinutes);
            return this;
        }
        @CustomType.Setter
        public Builder audiences(List<String> audiences) {
            this.audiences = Objects.requireNonNull(audiences);
            return this;
        }
        public Builder audiences(String... audiences) {
            return audiences(List.of(audiences));
        }
        @CustomType.Setter
        public Builder refreshTokenExpirationMinutes(Integer refreshTokenExpirationMinutes) {
            this.refreshTokenExpirationMinutes = Objects.requireNonNull(refreshTokenExpirationMinutes);
            return this;
        }
        @CustomType.Setter
        public Builder resourceIdentifier(String resourceIdentifier) {
            this.resourceIdentifier = Objects.requireNonNull(resourceIdentifier);
            return this;
        }
        public GetAuthorizationsScopesConfiguration build() {
            final var o = new GetAuthorizationsScopesConfiguration();
            o.accessTokenExpirationMinutes = accessTokenExpirationMinutes;
            o.audiences = audiences;
            o.refreshTokenExpirationMinutes = refreshTokenExpirationMinutes;
            o.resourceIdentifier = resourceIdentifier;
            return o;
        }
    }
}
