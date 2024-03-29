// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.onelogin.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetAuthServersInstanceConfiguration {
    /**
     * @return The number of minutes until access token expires. There is no maximum expiry limit.
     * 
     */
    private Integer accessTokenExpirationMinutes;
    /**
     * @return List of API endpoints that will be returned in Access Tokens.
     * 
     */
    private List<String> audiences;
    /**
     * @return The number of minutes until refresh token expires. There is no maximum expiry limit.
     * 
     */
    private Integer refreshTokenExpirationMinutes;
    /**
     * @return Unique identifier for the API that the Authorization Server will issue Access Tokens for.
     * 
     */
    private String resourceIdentifier;

    private GetAuthServersInstanceConfiguration() {}
    /**
     * @return The number of minutes until access token expires. There is no maximum expiry limit.
     * 
     */
    public Integer accessTokenExpirationMinutes() {
        return this.accessTokenExpirationMinutes;
    }
    /**
     * @return List of API endpoints that will be returned in Access Tokens.
     * 
     */
    public List<String> audiences() {
        return this.audiences;
    }
    /**
     * @return The number of minutes until refresh token expires. There is no maximum expiry limit.
     * 
     */
    public Integer refreshTokenExpirationMinutes() {
        return this.refreshTokenExpirationMinutes;
    }
    /**
     * @return Unique identifier for the API that the Authorization Server will issue Access Tokens for.
     * 
     */
    public String resourceIdentifier() {
        return this.resourceIdentifier;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAuthServersInstanceConfiguration defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer accessTokenExpirationMinutes;
        private List<String> audiences;
        private Integer refreshTokenExpirationMinutes;
        private String resourceIdentifier;
        public Builder() {}
        public Builder(GetAuthServersInstanceConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessTokenExpirationMinutes = defaults.accessTokenExpirationMinutes;
    	      this.audiences = defaults.audiences;
    	      this.refreshTokenExpirationMinutes = defaults.refreshTokenExpirationMinutes;
    	      this.resourceIdentifier = defaults.resourceIdentifier;
        }

        @CustomType.Setter
        public Builder accessTokenExpirationMinutes(Integer accessTokenExpirationMinutes) {
            if (accessTokenExpirationMinutes == null) {
              throw new MissingRequiredPropertyException("GetAuthServersInstanceConfiguration", "accessTokenExpirationMinutes");
            }
            this.accessTokenExpirationMinutes = accessTokenExpirationMinutes;
            return this;
        }
        @CustomType.Setter
        public Builder audiences(List<String> audiences) {
            if (audiences == null) {
              throw new MissingRequiredPropertyException("GetAuthServersInstanceConfiguration", "audiences");
            }
            this.audiences = audiences;
            return this;
        }
        public Builder audiences(String... audiences) {
            return audiences(List.of(audiences));
        }
        @CustomType.Setter
        public Builder refreshTokenExpirationMinutes(Integer refreshTokenExpirationMinutes) {
            if (refreshTokenExpirationMinutes == null) {
              throw new MissingRequiredPropertyException("GetAuthServersInstanceConfiguration", "refreshTokenExpirationMinutes");
            }
            this.refreshTokenExpirationMinutes = refreshTokenExpirationMinutes;
            return this;
        }
        @CustomType.Setter
        public Builder resourceIdentifier(String resourceIdentifier) {
            if (resourceIdentifier == null) {
              throw new MissingRequiredPropertyException("GetAuthServersInstanceConfiguration", "resourceIdentifier");
            }
            this.resourceIdentifier = resourceIdentifier;
            return this;
        }
        public GetAuthServersInstanceConfiguration build() {
            final var _resultValue = new GetAuthServersInstanceConfiguration();
            _resultValue.accessTokenExpirationMinutes = accessTokenExpirationMinutes;
            _resultValue.audiences = audiences;
            _resultValue.refreshTokenExpirationMinutes = refreshTokenExpirationMinutes;
            _resultValue.resourceIdentifier = resourceIdentifier;
            return _resultValue;
        }
    }
}
