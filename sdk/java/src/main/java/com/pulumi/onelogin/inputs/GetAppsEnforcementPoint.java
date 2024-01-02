// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.onelogin.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.onelogin.inputs.GetAppsEnforcementPointResource;
import com.pulumi.onelogin.inputs.GetAppsEnforcementPointSessionExpiryFixed;
import com.pulumi.onelogin.inputs.GetAppsEnforcementPointSessionExpiryInactivity;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GetAppsEnforcementPoint extends com.pulumi.resources.InvokeArgs {

    public static final GetAppsEnforcementPoint Empty = new GetAppsEnforcementPoint();

    @Import(name="caseSensitive", required=true)
    private Boolean caseSensitive;

    public Boolean caseSensitive() {
        return this.caseSensitive;
    }

    @Import(name="conditions", required=true)
    private String conditions;

    public String conditions() {
        return this.conditions;
    }

    @Import(name="contextRoot", required=true)
    private String contextRoot;

    public String contextRoot() {
        return this.contextRoot;
    }

    @Import(name="landingPage", required=true)
    private String landingPage;

    public String landingPage() {
        return this.landingPage;
    }

    @Import(name="permissions", required=true)
    private String permissions;

    public String permissions() {
        return this.permissions;
    }

    @Import(name="requireSitewideAuthentication", required=true)
    private Boolean requireSitewideAuthentication;

    public Boolean requireSitewideAuthentication() {
        return this.requireSitewideAuthentication;
    }

    @Import(name="resources", required=true)
    private List<GetAppsEnforcementPointResource> resources;

    public List<GetAppsEnforcementPointResource> resources() {
        return this.resources;
    }

    @Import(name="sessionExpiryFixed", required=true)
    private GetAppsEnforcementPointSessionExpiryFixed sessionExpiryFixed;

    public GetAppsEnforcementPointSessionExpiryFixed sessionExpiryFixed() {
        return this.sessionExpiryFixed;
    }

    @Import(name="sessionExpiryInactivity", required=true)
    private GetAppsEnforcementPointSessionExpiryInactivity sessionExpiryInactivity;

    public GetAppsEnforcementPointSessionExpiryInactivity sessionExpiryInactivity() {
        return this.sessionExpiryInactivity;
    }

    @Import(name="target", required=true)
    private String target;

    public String target() {
        return this.target;
    }

    @Import(name="token", required=true)
    private String token;

    public String token() {
        return this.token;
    }

    @Import(name="useTargetHostHeader", required=true)
    private Boolean useTargetHostHeader;

    public Boolean useTargetHostHeader() {
        return this.useTargetHostHeader;
    }

    @Import(name="vhost", required=true)
    private String vhost;

    public String vhost() {
        return this.vhost;
    }

    private GetAppsEnforcementPoint() {}

    private GetAppsEnforcementPoint(GetAppsEnforcementPoint $) {
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
    public static Builder builder(GetAppsEnforcementPoint defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAppsEnforcementPoint $;

        public Builder() {
            $ = new GetAppsEnforcementPoint();
        }

        public Builder(GetAppsEnforcementPoint defaults) {
            $ = new GetAppsEnforcementPoint(Objects.requireNonNull(defaults));
        }

        public Builder caseSensitive(Boolean caseSensitive) {
            $.caseSensitive = caseSensitive;
            return this;
        }

        public Builder conditions(String conditions) {
            $.conditions = conditions;
            return this;
        }

        public Builder contextRoot(String contextRoot) {
            $.contextRoot = contextRoot;
            return this;
        }

        public Builder landingPage(String landingPage) {
            $.landingPage = landingPage;
            return this;
        }

        public Builder permissions(String permissions) {
            $.permissions = permissions;
            return this;
        }

        public Builder requireSitewideAuthentication(Boolean requireSitewideAuthentication) {
            $.requireSitewideAuthentication = requireSitewideAuthentication;
            return this;
        }

        public Builder resources(List<GetAppsEnforcementPointResource> resources) {
            $.resources = resources;
            return this;
        }

        public Builder resources(GetAppsEnforcementPointResource... resources) {
            return resources(List.of(resources));
        }

        public Builder sessionExpiryFixed(GetAppsEnforcementPointSessionExpiryFixed sessionExpiryFixed) {
            $.sessionExpiryFixed = sessionExpiryFixed;
            return this;
        }

        public Builder sessionExpiryInactivity(GetAppsEnforcementPointSessionExpiryInactivity sessionExpiryInactivity) {
            $.sessionExpiryInactivity = sessionExpiryInactivity;
            return this;
        }

        public Builder target(String target) {
            $.target = target;
            return this;
        }

        public Builder token(String token) {
            $.token = token;
            return this;
        }

        public Builder useTargetHostHeader(Boolean useTargetHostHeader) {
            $.useTargetHostHeader = useTargetHostHeader;
            return this;
        }

        public Builder vhost(String vhost) {
            $.vhost = vhost;
            return this;
        }

        public GetAppsEnforcementPoint build() {
            if ($.caseSensitive == null) {
                throw new MissingRequiredPropertyException("GetAppsEnforcementPoint", "caseSensitive");
            }
            if ($.conditions == null) {
                throw new MissingRequiredPropertyException("GetAppsEnforcementPoint", "conditions");
            }
            if ($.contextRoot == null) {
                throw new MissingRequiredPropertyException("GetAppsEnforcementPoint", "contextRoot");
            }
            if ($.landingPage == null) {
                throw new MissingRequiredPropertyException("GetAppsEnforcementPoint", "landingPage");
            }
            if ($.permissions == null) {
                throw new MissingRequiredPropertyException("GetAppsEnforcementPoint", "permissions");
            }
            if ($.requireSitewideAuthentication == null) {
                throw new MissingRequiredPropertyException("GetAppsEnforcementPoint", "requireSitewideAuthentication");
            }
            if ($.resources == null) {
                throw new MissingRequiredPropertyException("GetAppsEnforcementPoint", "resources");
            }
            if ($.sessionExpiryFixed == null) {
                throw new MissingRequiredPropertyException("GetAppsEnforcementPoint", "sessionExpiryFixed");
            }
            if ($.sessionExpiryInactivity == null) {
                throw new MissingRequiredPropertyException("GetAppsEnforcementPoint", "sessionExpiryInactivity");
            }
            if ($.target == null) {
                throw new MissingRequiredPropertyException("GetAppsEnforcementPoint", "target");
            }
            if ($.token == null) {
                throw new MissingRequiredPropertyException("GetAppsEnforcementPoint", "token");
            }
            if ($.useTargetHostHeader == null) {
                throw new MissingRequiredPropertyException("GetAppsEnforcementPoint", "useTargetHostHeader");
            }
            if ($.vhost == null) {
                throw new MissingRequiredPropertyException("GetAppsEnforcementPoint", "vhost");
            }
            return $;
        }
    }

}
