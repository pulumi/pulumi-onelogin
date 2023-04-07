// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.onelogin.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.onelogin.inputs.GetAppsEnforcementPointResourceArgs;
import com.pulumi.onelogin.inputs.GetAppsEnforcementPointSessionExpiryFixedArgs;
import com.pulumi.onelogin.inputs.GetAppsEnforcementPointSessionExpiryInactivityArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GetAppsEnforcementPointArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetAppsEnforcementPointArgs Empty = new GetAppsEnforcementPointArgs();

    @Import(name="caseSensitive", required=true)
    private Output<Boolean> caseSensitive;

    public Output<Boolean> caseSensitive() {
        return this.caseSensitive;
    }

    @Import(name="conditions", required=true)
    private Output<String> conditions;

    public Output<String> conditions() {
        return this.conditions;
    }

    @Import(name="contextRoot", required=true)
    private Output<String> contextRoot;

    public Output<String> contextRoot() {
        return this.contextRoot;
    }

    @Import(name="landingPage", required=true)
    private Output<String> landingPage;

    public Output<String> landingPage() {
        return this.landingPage;
    }

    @Import(name="permissions", required=true)
    private Output<String> permissions;

    public Output<String> permissions() {
        return this.permissions;
    }

    @Import(name="requireSitewideAuthentication", required=true)
    private Output<Boolean> requireSitewideAuthentication;

    public Output<Boolean> requireSitewideAuthentication() {
        return this.requireSitewideAuthentication;
    }

    @Import(name="resources", required=true)
    private Output<List<GetAppsEnforcementPointResourceArgs>> resources;

    public Output<List<GetAppsEnforcementPointResourceArgs>> resources() {
        return this.resources;
    }

    @Import(name="sessionExpiryFixed", required=true)
    private Output<GetAppsEnforcementPointSessionExpiryFixedArgs> sessionExpiryFixed;

    public Output<GetAppsEnforcementPointSessionExpiryFixedArgs> sessionExpiryFixed() {
        return this.sessionExpiryFixed;
    }

    @Import(name="sessionExpiryInactivity", required=true)
    private Output<GetAppsEnforcementPointSessionExpiryInactivityArgs> sessionExpiryInactivity;

    public Output<GetAppsEnforcementPointSessionExpiryInactivityArgs> sessionExpiryInactivity() {
        return this.sessionExpiryInactivity;
    }

    @Import(name="target", required=true)
    private Output<String> target;

    public Output<String> target() {
        return this.target;
    }

    @Import(name="token", required=true)
    private Output<String> token;

    public Output<String> token() {
        return this.token;
    }

    @Import(name="useTargetHostHeader", required=true)
    private Output<Boolean> useTargetHostHeader;

    public Output<Boolean> useTargetHostHeader() {
        return this.useTargetHostHeader;
    }

    @Import(name="vhost", required=true)
    private Output<String> vhost;

    public Output<String> vhost() {
        return this.vhost;
    }

    private GetAppsEnforcementPointArgs() {}

    private GetAppsEnforcementPointArgs(GetAppsEnforcementPointArgs $) {
        this.caseSensitive = $.caseSensitive;
        this.conditions = $.conditions;
        this.contextRoot = $.contextRoot;
        this.landingPage = $.landingPage;
        this.permissions = $.permissions;
        this.requireSitewideAuthentication = $.requireSitewideAuthentication;
        this.resources = $.resources;
        this.sessionExpiryFixed = $.sessionExpiryFixed;
        this.sessionExpiryInactivity = $.sessionExpiryInactivity;
        this.target = $.target;
        this.token = $.token;
        this.useTargetHostHeader = $.useTargetHostHeader;
        this.vhost = $.vhost;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAppsEnforcementPointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAppsEnforcementPointArgs $;

        public Builder() {
            $ = new GetAppsEnforcementPointArgs();
        }

        public Builder(GetAppsEnforcementPointArgs defaults) {
            $ = new GetAppsEnforcementPointArgs(Objects.requireNonNull(defaults));
        }

        public Builder caseSensitive(Output<Boolean> caseSensitive) {
            $.caseSensitive = caseSensitive;
            return this;
        }

        public Builder caseSensitive(Boolean caseSensitive) {
            return caseSensitive(Output.of(caseSensitive));
        }

        public Builder conditions(Output<String> conditions) {
            $.conditions = conditions;
            return this;
        }

        public Builder conditions(String conditions) {
            return conditions(Output.of(conditions));
        }

        public Builder contextRoot(Output<String> contextRoot) {
            $.contextRoot = contextRoot;
            return this;
        }

        public Builder contextRoot(String contextRoot) {
            return contextRoot(Output.of(contextRoot));
        }

        public Builder landingPage(Output<String> landingPage) {
            $.landingPage = landingPage;
            return this;
        }

        public Builder landingPage(String landingPage) {
            return landingPage(Output.of(landingPage));
        }

        public Builder permissions(Output<String> permissions) {
            $.permissions = permissions;
            return this;
        }

        public Builder permissions(String permissions) {
            return permissions(Output.of(permissions));
        }

        public Builder requireSitewideAuthentication(Output<Boolean> requireSitewideAuthentication) {
            $.requireSitewideAuthentication = requireSitewideAuthentication;
            return this;
        }

        public Builder requireSitewideAuthentication(Boolean requireSitewideAuthentication) {
            return requireSitewideAuthentication(Output.of(requireSitewideAuthentication));
        }

        public Builder resources(Output<List<GetAppsEnforcementPointResourceArgs>> resources) {
            $.resources = resources;
            return this;
        }

        public Builder resources(List<GetAppsEnforcementPointResourceArgs> resources) {
            return resources(Output.of(resources));
        }

        public Builder resources(GetAppsEnforcementPointResourceArgs... resources) {
            return resources(List.of(resources));
        }

        public Builder sessionExpiryFixed(Output<GetAppsEnforcementPointSessionExpiryFixedArgs> sessionExpiryFixed) {
            $.sessionExpiryFixed = sessionExpiryFixed;
            return this;
        }

        public Builder sessionExpiryFixed(GetAppsEnforcementPointSessionExpiryFixedArgs sessionExpiryFixed) {
            return sessionExpiryFixed(Output.of(sessionExpiryFixed));
        }

        public Builder sessionExpiryInactivity(Output<GetAppsEnforcementPointSessionExpiryInactivityArgs> sessionExpiryInactivity) {
            $.sessionExpiryInactivity = sessionExpiryInactivity;
            return this;
        }

        public Builder sessionExpiryInactivity(GetAppsEnforcementPointSessionExpiryInactivityArgs sessionExpiryInactivity) {
            return sessionExpiryInactivity(Output.of(sessionExpiryInactivity));
        }

        public Builder target(Output<String> target) {
            $.target = target;
            return this;
        }

        public Builder target(String target) {
            return target(Output.of(target));
        }

        public Builder token(Output<String> token) {
            $.token = token;
            return this;
        }

        public Builder token(String token) {
            return token(Output.of(token));
        }

        public Builder useTargetHostHeader(Output<Boolean> useTargetHostHeader) {
            $.useTargetHostHeader = useTargetHostHeader;
            return this;
        }

        public Builder useTargetHostHeader(Boolean useTargetHostHeader) {
            return useTargetHostHeader(Output.of(useTargetHostHeader));
        }

        public Builder vhost(Output<String> vhost) {
            $.vhost = vhost;
            return this;
        }

        public Builder vhost(String vhost) {
            return vhost(Output.of(vhost));
        }

        public GetAppsEnforcementPointArgs build() {
            $.caseSensitive = Objects.requireNonNull($.caseSensitive, "expected parameter 'caseSensitive' to be non-null");
            $.conditions = Objects.requireNonNull($.conditions, "expected parameter 'conditions' to be non-null");
            $.contextRoot = Objects.requireNonNull($.contextRoot, "expected parameter 'contextRoot' to be non-null");
            $.landingPage = Objects.requireNonNull($.landingPage, "expected parameter 'landingPage' to be non-null");
            $.permissions = Objects.requireNonNull($.permissions, "expected parameter 'permissions' to be non-null");
            $.requireSitewideAuthentication = Objects.requireNonNull($.requireSitewideAuthentication, "expected parameter 'requireSitewideAuthentication' to be non-null");
            $.resources = Objects.requireNonNull($.resources, "expected parameter 'resources' to be non-null");
            $.sessionExpiryFixed = Objects.requireNonNull($.sessionExpiryFixed, "expected parameter 'sessionExpiryFixed' to be non-null");
            $.sessionExpiryInactivity = Objects.requireNonNull($.sessionExpiryInactivity, "expected parameter 'sessionExpiryInactivity' to be non-null");
            $.target = Objects.requireNonNull($.target, "expected parameter 'target' to be non-null");
            $.token = Objects.requireNonNull($.token, "expected parameter 'token' to be non-null");
            $.useTargetHostHeader = Objects.requireNonNull($.useTargetHostHeader, "expected parameter 'useTargetHostHeader' to be non-null");
            $.vhost = Objects.requireNonNull($.vhost, "expected parameter 'vhost' to be non-null");
            return $;
        }
    }

}