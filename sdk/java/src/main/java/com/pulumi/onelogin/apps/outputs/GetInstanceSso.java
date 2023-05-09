// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.onelogin.apps.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.onelogin.apps.outputs.GetInstanceSsoCertificate;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetInstanceSso {
    private String acsUrl;
    private GetInstanceSsoCertificate certificate;
    private String clientId;
    private String clientSecret;
    private String issuer;
    private String metadataUrl;

    private GetInstanceSso() {}
    public String acsUrl() {
        return this.acsUrl;
    }
    public GetInstanceSsoCertificate certificate() {
        return this.certificate;
    }
    public String clientId() {
        return this.clientId;
    }
    public String clientSecret() {
        return this.clientSecret;
    }
    public String issuer() {
        return this.issuer;
    }
    public String metadataUrl() {
        return this.metadataUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstanceSso defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String acsUrl;
        private GetInstanceSsoCertificate certificate;
        private String clientId;
        private String clientSecret;
        private String issuer;
        private String metadataUrl;
        public Builder() {}
        public Builder(GetInstanceSso defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acsUrl = defaults.acsUrl;
    	      this.certificate = defaults.certificate;
    	      this.clientId = defaults.clientId;
    	      this.clientSecret = defaults.clientSecret;
    	      this.issuer = defaults.issuer;
    	      this.metadataUrl = defaults.metadataUrl;
        }

        @CustomType.Setter
        public Builder acsUrl(String acsUrl) {
            this.acsUrl = Objects.requireNonNull(acsUrl);
            return this;
        }
        @CustomType.Setter
        public Builder certificate(GetInstanceSsoCertificate certificate) {
            this.certificate = Objects.requireNonNull(certificate);
            return this;
        }
        @CustomType.Setter
        public Builder clientId(String clientId) {
            this.clientId = Objects.requireNonNull(clientId);
            return this;
        }
        @CustomType.Setter
        public Builder clientSecret(String clientSecret) {
            this.clientSecret = Objects.requireNonNull(clientSecret);
            return this;
        }
        @CustomType.Setter
        public Builder issuer(String issuer) {
            this.issuer = Objects.requireNonNull(issuer);
            return this;
        }
        @CustomType.Setter
        public Builder metadataUrl(String metadataUrl) {
            this.metadataUrl = Objects.requireNonNull(metadataUrl);
            return this;
        }
        public GetInstanceSso build() {
            final var o = new GetInstanceSso();
            o.acsUrl = acsUrl;
            o.certificate = certificate;
            o.clientId = clientId;
            o.clientSecret = clientSecret;
            o.issuer = issuer;
            o.metadataUrl = metadataUrl;
            return o;
        }
    }
}