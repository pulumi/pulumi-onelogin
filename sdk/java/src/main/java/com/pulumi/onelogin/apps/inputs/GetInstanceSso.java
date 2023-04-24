// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.onelogin.apps.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.onelogin.apps.inputs.GetInstanceSsoCertificate;
import java.lang.String;
import java.util.Objects;


public final class GetInstanceSso extends com.pulumi.resources.InvokeArgs {

    public static final GetInstanceSso Empty = new GetInstanceSso();

    @Import(name="acsUrl", required=true)
    private String acsUrl;

    public String acsUrl() {
        return this.acsUrl;
    }

    @Import(name="certificate", required=true)
    private GetInstanceSsoCertificate certificate;

    public GetInstanceSsoCertificate certificate() {
        return this.certificate;
    }

    @Import(name="clientId", required=true)
    private String clientId;

    public String clientId() {
        return this.clientId;
    }

    @Import(name="clientSecret", required=true)
    private String clientSecret;

    public String clientSecret() {
        return this.clientSecret;
    }

    @Import(name="issuer", required=true)
    private String issuer;

    public String issuer() {
        return this.issuer;
    }

    @Import(name="metadataUrl", required=true)
    private String metadataUrl;

    public String metadataUrl() {
        return this.metadataUrl;
    }

    private GetInstanceSso() {}

    private GetInstanceSso(GetInstanceSso $) {
        this.acsUrl = $.acsUrl;
        this.certificate = $.certificate;
        this.clientId = $.clientId;
        this.clientSecret = $.clientSecret;
        this.issuer = $.issuer;
        this.metadataUrl = $.metadataUrl;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetInstanceSso defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetInstanceSso $;

        public Builder() {
            $ = new GetInstanceSso();
        }

        public Builder(GetInstanceSso defaults) {
            $ = new GetInstanceSso(Objects.requireNonNull(defaults));
        }

        public Builder acsUrl(String acsUrl) {
            $.acsUrl = acsUrl;
            return this;
        }

        public Builder certificate(GetInstanceSsoCertificate certificate) {
            $.certificate = certificate;
            return this;
        }

        public Builder clientId(String clientId) {
            $.clientId = clientId;
            return this;
        }

        public Builder clientSecret(String clientSecret) {
            $.clientSecret = clientSecret;
            return this;
        }

        public Builder issuer(String issuer) {
            $.issuer = issuer;
            return this;
        }

        public Builder metadataUrl(String metadataUrl) {
            $.metadataUrl = metadataUrl;
            return this;
        }

        public GetInstanceSso build() {
            $.acsUrl = Objects.requireNonNull($.acsUrl, "expected parameter 'acsUrl' to be non-null");
            $.certificate = Objects.requireNonNull($.certificate, "expected parameter 'certificate' to be non-null");
            $.clientId = Objects.requireNonNull($.clientId, "expected parameter 'clientId' to be non-null");
            $.clientSecret = Objects.requireNonNull($.clientSecret, "expected parameter 'clientSecret' to be non-null");
            $.issuer = Objects.requireNonNull($.issuer, "expected parameter 'issuer' to be non-null");
            $.metadataUrl = Objects.requireNonNull($.metadataUrl, "expected parameter 'metadataUrl' to be non-null");
            return $;
        }
    }

}
