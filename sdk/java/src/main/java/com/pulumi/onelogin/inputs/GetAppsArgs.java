// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.onelogin.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.onelogin.inputs.GetAppsConfigurationArgs;
import com.pulumi.onelogin.inputs.GetAppsEnforcementPointArgs;
import com.pulumi.onelogin.inputs.GetAppsFilterArgs;
import com.pulumi.onelogin.inputs.GetAppsParametersArgs;
import com.pulumi.onelogin.inputs.GetAppsProvisioningArgs;
import com.pulumi.onelogin.inputs.GetAppsSsoArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetAppsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAppsArgs Empty = new GetAppsArgs();

    @Import(name="allowAssumedSignin")
    private @Nullable Output<Boolean> allowAssumedSignin;

    public Optional<Output<Boolean>> allowAssumedSignin() {
        return Optional.ofNullable(this.allowAssumedSignin);
    }

    @Import(name="authMethod")
    private @Nullable Output<Integer> authMethod;

    public Optional<Output<Integer>> authMethod() {
        return Optional.ofNullable(this.authMethod);
    }

    @Import(name="authMethodDescription")
    private @Nullable Output<String> authMethodDescription;

    public Optional<Output<String>> authMethodDescription() {
        return Optional.ofNullable(this.authMethodDescription);
    }

    @Import(name="brandId")
    private @Nullable Output<Integer> brandId;

    public Optional<Output<Integer>> brandId() {
        return Optional.ofNullable(this.brandId);
    }

    @Import(name="configuration")
    private @Nullable Output<GetAppsConfigurationArgs> configuration;

    public Optional<Output<GetAppsConfigurationArgs>> configuration() {
        return Optional.ofNullable(this.configuration);
    }

    @Import(name="connectorId")
    private @Nullable Output<Integer> connectorId;

    public Optional<Output<Integer>> connectorId() {
        return Optional.ofNullable(this.connectorId);
    }

    @Import(name="createdAt")
    private @Nullable Output<String> createdAt;

    public Optional<Output<String>> createdAt() {
        return Optional.ofNullable(this.createdAt);
    }

    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    @Import(name="enforcementPoint")
    private @Nullable Output<GetAppsEnforcementPointArgs> enforcementPoint;

    public Optional<Output<GetAppsEnforcementPointArgs>> enforcementPoint() {
        return Optional.ofNullable(this.enforcementPoint);
    }

    @Import(name="filters")
    private @Nullable Output<List<GetAppsFilterArgs>> filters;

    public Optional<Output<List<GetAppsFilterArgs>>> filters() {
        return Optional.ofNullable(this.filters);
    }

    @Import(name="iconUrl")
    private @Nullable Output<String> iconUrl;

    public Optional<Output<String>> iconUrl() {
        return Optional.ofNullable(this.iconUrl);
    }

    @Import(name="loginConfig")
    private @Nullable Output<Integer> loginConfig;

    public Optional<Output<Integer>> loginConfig() {
        return Optional.ofNullable(this.loginConfig);
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
    private @Nullable Output<GetAppsParametersArgs> parameters;

    public Optional<Output<GetAppsParametersArgs>> parameters() {
        return Optional.ofNullable(this.parameters);
    }

    @Import(name="policyId")
    private @Nullable Output<Integer> policyId;

    public Optional<Output<Integer>> policyId() {
        return Optional.ofNullable(this.policyId);
    }

    @Import(name="provisioning")
    private @Nullable Output<GetAppsProvisioningArgs> provisioning;

    public Optional<Output<GetAppsProvisioningArgs>> provisioning() {
        return Optional.ofNullable(this.provisioning);
    }

    @Import(name="roleIds")
    private @Nullable Output<List<Integer>> roleIds;

    public Optional<Output<List<Integer>>> roleIds() {
        return Optional.ofNullable(this.roleIds);
    }

    @Import(name="sso")
    private @Nullable Output<GetAppsSsoArgs> sso;

    public Optional<Output<GetAppsSsoArgs>> sso() {
        return Optional.ofNullable(this.sso);
    }

    @Import(name="tabId")
    private @Nullable Output<Integer> tabId;

    public Optional<Output<Integer>> tabId() {
        return Optional.ofNullable(this.tabId);
    }

    @Import(name="updatedAt")
    private @Nullable Output<String> updatedAt;

    public Optional<Output<String>> updatedAt() {
        return Optional.ofNullable(this.updatedAt);
    }

    @Import(name="visible")
    private @Nullable Output<Boolean> visible;

    public Optional<Output<Boolean>> visible() {
        return Optional.ofNullable(this.visible);
    }

    private GetAppsArgs() {}

    private GetAppsArgs(GetAppsArgs $) {
        this.allowAssumedSignin = $.allowAssumedSignin;
        this.authMethod = $.authMethod;
        this.authMethodDescription = $.authMethodDescription;
        this.brandId = $.brandId;
        this.configuration = $.configuration;
        this.connectorId = $.connectorId;
        this.createdAt = $.createdAt;
        this.description = $.description;
        this.enforcementPoint = $.enforcementPoint;
        this.filters = $.filters;
        this.iconUrl = $.iconUrl;
        this.loginConfig = $.loginConfig;
        this.name = $.name;
        this.notes = $.notes;
        this.parameters = $.parameters;
        this.policyId = $.policyId;
        this.provisioning = $.provisioning;
        this.roleIds = $.roleIds;
        this.sso = $.sso;
        this.tabId = $.tabId;
        this.updatedAt = $.updatedAt;
        this.visible = $.visible;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAppsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAppsArgs $;

        public Builder() {
            $ = new GetAppsArgs();
        }

        public Builder(GetAppsArgs defaults) {
            $ = new GetAppsArgs(Objects.requireNonNull(defaults));
        }

        public Builder allowAssumedSignin(@Nullable Output<Boolean> allowAssumedSignin) {
            $.allowAssumedSignin = allowAssumedSignin;
            return this;
        }

        public Builder allowAssumedSignin(Boolean allowAssumedSignin) {
            return allowAssumedSignin(Output.of(allowAssumedSignin));
        }

        public Builder authMethod(@Nullable Output<Integer> authMethod) {
            $.authMethod = authMethod;
            return this;
        }

        public Builder authMethod(Integer authMethod) {
            return authMethod(Output.of(authMethod));
        }

        public Builder authMethodDescription(@Nullable Output<String> authMethodDescription) {
            $.authMethodDescription = authMethodDescription;
            return this;
        }

        public Builder authMethodDescription(String authMethodDescription) {
            return authMethodDescription(Output.of(authMethodDescription));
        }

        public Builder brandId(@Nullable Output<Integer> brandId) {
            $.brandId = brandId;
            return this;
        }

        public Builder brandId(Integer brandId) {
            return brandId(Output.of(brandId));
        }

        public Builder configuration(@Nullable Output<GetAppsConfigurationArgs> configuration) {
            $.configuration = configuration;
            return this;
        }

        public Builder configuration(GetAppsConfigurationArgs configuration) {
            return configuration(Output.of(configuration));
        }

        public Builder connectorId(@Nullable Output<Integer> connectorId) {
            $.connectorId = connectorId;
            return this;
        }

        public Builder connectorId(Integer connectorId) {
            return connectorId(Output.of(connectorId));
        }

        public Builder createdAt(@Nullable Output<String> createdAt) {
            $.createdAt = createdAt;
            return this;
        }

        public Builder createdAt(String createdAt) {
            return createdAt(Output.of(createdAt));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder enforcementPoint(@Nullable Output<GetAppsEnforcementPointArgs> enforcementPoint) {
            $.enforcementPoint = enforcementPoint;
            return this;
        }

        public Builder enforcementPoint(GetAppsEnforcementPointArgs enforcementPoint) {
            return enforcementPoint(Output.of(enforcementPoint));
        }

        public Builder filters(@Nullable Output<List<GetAppsFilterArgs>> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(List<GetAppsFilterArgs> filters) {
            return filters(Output.of(filters));
        }

        public Builder filters(GetAppsFilterArgs... filters) {
            return filters(List.of(filters));
        }

        public Builder iconUrl(@Nullable Output<String> iconUrl) {
            $.iconUrl = iconUrl;
            return this;
        }

        public Builder iconUrl(String iconUrl) {
            return iconUrl(Output.of(iconUrl));
        }

        public Builder loginConfig(@Nullable Output<Integer> loginConfig) {
            $.loginConfig = loginConfig;
            return this;
        }

        public Builder loginConfig(Integer loginConfig) {
            return loginConfig(Output.of(loginConfig));
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

        public Builder parameters(@Nullable Output<GetAppsParametersArgs> parameters) {
            $.parameters = parameters;
            return this;
        }

        public Builder parameters(GetAppsParametersArgs parameters) {
            return parameters(Output.of(parameters));
        }

        public Builder policyId(@Nullable Output<Integer> policyId) {
            $.policyId = policyId;
            return this;
        }

        public Builder policyId(Integer policyId) {
            return policyId(Output.of(policyId));
        }

        public Builder provisioning(@Nullable Output<GetAppsProvisioningArgs> provisioning) {
            $.provisioning = provisioning;
            return this;
        }

        public Builder provisioning(GetAppsProvisioningArgs provisioning) {
            return provisioning(Output.of(provisioning));
        }

        public Builder roleIds(@Nullable Output<List<Integer>> roleIds) {
            $.roleIds = roleIds;
            return this;
        }

        public Builder roleIds(List<Integer> roleIds) {
            return roleIds(Output.of(roleIds));
        }

        public Builder roleIds(Integer... roleIds) {
            return roleIds(List.of(roleIds));
        }

        public Builder sso(@Nullable Output<GetAppsSsoArgs> sso) {
            $.sso = sso;
            return this;
        }

        public Builder sso(GetAppsSsoArgs sso) {
            return sso(Output.of(sso));
        }

        public Builder tabId(@Nullable Output<Integer> tabId) {
            $.tabId = tabId;
            return this;
        }

        public Builder tabId(Integer tabId) {
            return tabId(Output.of(tabId));
        }

        public Builder updatedAt(@Nullable Output<String> updatedAt) {
            $.updatedAt = updatedAt;
            return this;
        }

        public Builder updatedAt(String updatedAt) {
            return updatedAt(Output.of(updatedAt));
        }

        public Builder visible(@Nullable Output<Boolean> visible) {
            $.visible = visible;
            return this;
        }

        public Builder visible(Boolean visible) {
            return visible(Output.of(visible));
        }

        public GetAppsArgs build() {
            return $;
        }
    }

}
