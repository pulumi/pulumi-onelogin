// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.onelogin;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.onelogin.inputs.OidcAppsParameterArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OidcAppsArgs extends com.pulumi.resources.ResourceArgs {

    public static final OidcAppsArgs Empty = new OidcAppsArgs();

    @Import(name="allowAssumedSignin")
    private @Nullable Output<Boolean> allowAssumedSignin;

    public Optional<Output<Boolean>> allowAssumedSignin() {
        return Optional.ofNullable(this.allowAssumedSignin);
    }

    @Import(name="brandId")
    private @Nullable Output<Integer> brandId;

    public Optional<Output<Integer>> brandId() {
        return Optional.ofNullable(this.brandId);
    }

    @Import(name="configuration")
    private @Nullable Output<Map<String,String>> configuration;

    public Optional<Output<Map<String,String>>> configuration() {
        return Optional.ofNullable(this.configuration);
    }

    @Import(name="connectorId", required=true)
    private Output<Integer> connectorId;

    public Output<Integer> connectorId() {
        return this.connectorId;
    }

    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="notes")
    private @Nullable Output<String> notes;

    public Optional<Output<String>> notes() {
        return Optional.ofNullable(this.notes);
    }

    @Import(name="parameters")
    private @Nullable Output<List<OidcAppsParameterArgs>> parameters;

    public Optional<Output<List<OidcAppsParameterArgs>>> parameters() {
        return Optional.ofNullable(this.parameters);
    }

    @Import(name="provisioning")
    private @Nullable Output<Map<String,Boolean>> provisioning;

    public Optional<Output<Map<String,Boolean>>> provisioning() {
        return Optional.ofNullable(this.provisioning);
    }

    @Import(name="visible")
    private @Nullable Output<Boolean> visible;

    public Optional<Output<Boolean>> visible() {
        return Optional.ofNullable(this.visible);
    }

    private OidcAppsArgs() {}

    private OidcAppsArgs(OidcAppsArgs $) {
        this.allowAssumedSignin = $.allowAssumedSignin;
        this.brandId = $.brandId;
        this.configuration = $.configuration;
        this.connectorId = $.connectorId;
        this.description = $.description;
        this.name = $.name;
        this.notes = $.notes;
        this.parameters = $.parameters;
        this.provisioning = $.provisioning;
        this.visible = $.visible;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OidcAppsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OidcAppsArgs $;

        public Builder() {
            $ = new OidcAppsArgs();
        }

        public Builder(OidcAppsArgs defaults) {
            $ = new OidcAppsArgs(Objects.requireNonNull(defaults));
        }

        public Builder allowAssumedSignin(@Nullable Output<Boolean> allowAssumedSignin) {
            $.allowAssumedSignin = allowAssumedSignin;
            return this;
        }

        public Builder allowAssumedSignin(Boolean allowAssumedSignin) {
            return allowAssumedSignin(Output.of(allowAssumedSignin));
        }

        public Builder brandId(@Nullable Output<Integer> brandId) {
            $.brandId = brandId;
            return this;
        }

        public Builder brandId(Integer brandId) {
            return brandId(Output.of(brandId));
        }

        public Builder configuration(@Nullable Output<Map<String,String>> configuration) {
            $.configuration = configuration;
            return this;
        }

        public Builder configuration(Map<String,String> configuration) {
            return configuration(Output.of(configuration));
        }

        public Builder connectorId(Output<Integer> connectorId) {
            $.connectorId = connectorId;
            return this;
        }

        public Builder connectorId(Integer connectorId) {
            return connectorId(Output.of(connectorId));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder notes(@Nullable Output<String> notes) {
            $.notes = notes;
            return this;
        }

        public Builder notes(String notes) {
            return notes(Output.of(notes));
        }

        public Builder parameters(@Nullable Output<List<OidcAppsParameterArgs>> parameters) {
            $.parameters = parameters;
            return this;
        }

        public Builder parameters(List<OidcAppsParameterArgs> parameters) {
            return parameters(Output.of(parameters));
        }

        public Builder parameters(OidcAppsParameterArgs... parameters) {
            return parameters(List.of(parameters));
        }

        public Builder provisioning(@Nullable Output<Map<String,Boolean>> provisioning) {
            $.provisioning = provisioning;
            return this;
        }

        public Builder provisioning(Map<String,Boolean> provisioning) {
            return provisioning(Output.of(provisioning));
        }

        public Builder visible(@Nullable Output<Boolean> visible) {
            $.visible = visible;
            return this;
        }

        public Builder visible(Boolean visible) {
            return visible(Output.of(visible));
        }

        public OidcAppsArgs build() {
            if ($.connectorId == null) {
                throw new MissingRequiredPropertyException("OidcAppsArgs", "connectorId");
            }
            return $;
        }
    }

}
