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

    /**
     * The URL path evaluation is case insensitive by default. Resources hosted on web servers such as Apache, NGINX and Java EE are case sensitive paths. Web servers such as Microsoft IIS are not case-sensitive.
     * 
     */
    @Import(name="caseSensitive", required=true)
    private Boolean caseSensitive;

    /**
     * @return The URL path evaluation is case insensitive by default. Resources hosted on web servers such as Apache, NGINX and Java EE are case sensitive paths. Web servers such as Microsoft IIS are not case-sensitive.
     * 
     */
    public Boolean caseSensitive() {
        return this.caseSensitive;
    }

    /**
     * If access is conditional, the conditions that must evaluate to true to allow access to a resource. For example, to require the user must be authenticated and have either the role Admin or User
     * 
     */
    @Import(name="conditions", required=true)
    private String conditions;

    /**
     * @return If access is conditional, the conditions that must evaluate to true to allow access to a resource. For example, to require the user must be authenticated and have either the role Admin or User
     * 
     */
    public String conditions() {
        return this.conditions;
    }

    /**
     * The root path to the application, often the name of the application. Can be any name, path or just a slash (“/”). The context root uniquely identifies the application within the enforcement point.
     * 
     */
    @Import(name="contextRoot", required=true)
    private String contextRoot;

    /**
     * @return The root path to the application, often the name of the application. Can be any name, path or just a slash (“/”). The context root uniquely identifies the application within the enforcement point.
     * 
     */
    public String contextRoot() {
        return this.contextRoot;
    }

    /**
     * The location within the context root to which the browser will be redirected for IdP-initiated single sign-on. For example, the landing page might be an index page in the context root such as index.html or default.aspx. The landing page cannot begin with a slash and must use valid URL characters.
     * 
     */
    @Import(name="landingPage", required=true)
    private String landingPage;

    /**
     * @return The location within the context root to which the browser will be redirected for IdP-initiated single sign-on. For example, the landing page might be an index page in the context root such as index.html or default.aspx. The landing page cannot begin with a slash and must use valid URL characters.
     * 
     */
    public String landingPage() {
        return this.landingPage;
    }

    /**
     * Specify to always `allow`, `deny` access to resources, of if access is `conditional`.
     * 
     */
    @Import(name="permissions", required=true)
    private String permissions;

    /**
     * @return Specify to always `allow`, `deny` access to resources, of if access is `conditional`.
     * 
     */
    public String permissions() {
        return this.permissions;
    }

    /**
     * Require user authentication to access any resource protected by this enforcement point.
     * 
     */
    @Import(name="requireSitewideAuthentication", required=true)
    private Boolean requireSitewideAuthentication;

    /**
     * @return Require user authentication to access any resource protected by this enforcement point.
     * 
     */
    public Boolean requireSitewideAuthentication() {
        return this.requireSitewideAuthentication;
    }

    /**
     * Array of resource objects
     * 
     */
    @Import(name="resources", required=true)
    private List<GetAppsEnforcementPointResource> resources;

    /**
     * @return Array of resource objects
     * 
     */
    public List<GetAppsEnforcementPointResource> resources() {
        return this.resources;
    }

    /**
     * unit: - 0 = Seconds - 1 = Minutes - 2 = Hours value: - When Unit = 0 or 1 value must be 0-60 - When Unit = 2 value must be 0-24
     * 
     */
    @Import(name="sessionExpiryFixed", required=true)
    private GetAppsEnforcementPointSessionExpiryFixed sessionExpiryFixed;

    /**
     * @return unit: - 0 = Seconds - 1 = Minutes - 2 = Hours value: - When Unit = 0 or 1 value must be 0-60 - When Unit = 2 value must be 0-24
     * 
     */
    public GetAppsEnforcementPointSessionExpiryFixed sessionExpiryFixed() {
        return this.sessionExpiryFixed;
    }

    /**
     * unit: - 0 = Seconds - 1 = Minutes - 2 = Hours value: - When Unit = 0 or 1 value must be 0-60 - When Unit = 2 value must be 0-24
     * 
     */
    @Import(name="sessionExpiryInactivity", required=true)
    private GetAppsEnforcementPointSessionExpiryInactivity sessionExpiryInactivity;

    /**
     * @return unit: - 0 = Seconds - 1 = Minutes - 2 = Hours value: - When Unit = 0 or 1 value must be 0-60 - When Unit = 2 value must be 0-24
     * 
     */
    public GetAppsEnforcementPointSessionExpiryInactivity sessionExpiryInactivity() {
        return this.sessionExpiryInactivity;
    }

    /**
     * A fully-qualified URL to the internal application including scheme, authority and path. The target host authority must be an IP address, not a hostname.
     * 
     */
    @Import(name="target", required=true)
    private String target;

    /**
     * @return A fully-qualified URL to the internal application including scheme, authority and path. The target host authority must be an IP address, not a hostname.
     * 
     */
    public String target() {
        return this.target;
    }

    /**
     * Can only be set on create. Access Gateway Token.
     * 
     */
    @Import(name="token", required=true)
    private String token;

    /**
     * @return Can only be set on create. Access Gateway Token.
     * 
     */
    public String token() {
        return this.token;
    }

    /**
     * Use the target host header as opposed to the original gateway or upstream host header.
     * 
     */
    @Import(name="useTargetHostHeader", required=true)
    private Boolean useTargetHostHeader;

    /**
     * @return Use the target host header as opposed to the original gateway or upstream host header.
     * 
     */
    public Boolean useTargetHostHeader() {
        return this.useTargetHostHeader;
    }

    /**
     * A comma-delimited list of one or more virtual hosts that map to applications assigned to the enforcement point. A VHOST may be a host name or an IP address. VHOST distinguish between applications that are at the same context root.
     * 
     */
    @Import(name="vhost", required=true)
    private String vhost;

    /**
     * @return A comma-delimited list of one or more virtual hosts that map to applications assigned to the enforcement point. A VHOST may be a host name or an IP address. VHOST distinguish between applications that are at the same context root.
     * 
     */
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

        /**
         * @param caseSensitive The URL path evaluation is case insensitive by default. Resources hosted on web servers such as Apache, NGINX and Java EE are case sensitive paths. Web servers such as Microsoft IIS are not case-sensitive.
         * 
         * @return builder
         * 
         */
        public Builder caseSensitive(Boolean caseSensitive) {
            $.caseSensitive = caseSensitive;
            return this;
        }

        /**
         * @param conditions If access is conditional, the conditions that must evaluate to true to allow access to a resource. For example, to require the user must be authenticated and have either the role Admin or User
         * 
         * @return builder
         * 
         */
        public Builder conditions(String conditions) {
            $.conditions = conditions;
            return this;
        }

        /**
         * @param contextRoot The root path to the application, often the name of the application. Can be any name, path or just a slash (“/”). The context root uniquely identifies the application within the enforcement point.
         * 
         * @return builder
         * 
         */
        public Builder contextRoot(String contextRoot) {
            $.contextRoot = contextRoot;
            return this;
        }

        /**
         * @param landingPage The location within the context root to which the browser will be redirected for IdP-initiated single sign-on. For example, the landing page might be an index page in the context root such as index.html or default.aspx. The landing page cannot begin with a slash and must use valid URL characters.
         * 
         * @return builder
         * 
         */
        public Builder landingPage(String landingPage) {
            $.landingPage = landingPage;
            return this;
        }

        /**
         * @param permissions Specify to always `allow`, `deny` access to resources, of if access is `conditional`.
         * 
         * @return builder
         * 
         */
        public Builder permissions(String permissions) {
            $.permissions = permissions;
            return this;
        }

        /**
         * @param requireSitewideAuthentication Require user authentication to access any resource protected by this enforcement point.
         * 
         * @return builder
         * 
         */
        public Builder requireSitewideAuthentication(Boolean requireSitewideAuthentication) {
            $.requireSitewideAuthentication = requireSitewideAuthentication;
            return this;
        }

        /**
         * @param resources Array of resource objects
         * 
         * @return builder
         * 
         */
        public Builder resources(List<GetAppsEnforcementPointResource> resources) {
            $.resources = resources;
            return this;
        }

        /**
         * @param resources Array of resource objects
         * 
         * @return builder
         * 
         */
        public Builder resources(GetAppsEnforcementPointResource... resources) {
            return resources(List.of(resources));
        }

        /**
         * @param sessionExpiryFixed unit: - 0 = Seconds - 1 = Minutes - 2 = Hours value: - When Unit = 0 or 1 value must be 0-60 - When Unit = 2 value must be 0-24
         * 
         * @return builder
         * 
         */
        public Builder sessionExpiryFixed(GetAppsEnforcementPointSessionExpiryFixed sessionExpiryFixed) {
            $.sessionExpiryFixed = sessionExpiryFixed;
            return this;
        }

        /**
         * @param sessionExpiryInactivity unit: - 0 = Seconds - 1 = Minutes - 2 = Hours value: - When Unit = 0 or 1 value must be 0-60 - When Unit = 2 value must be 0-24
         * 
         * @return builder
         * 
         */
        public Builder sessionExpiryInactivity(GetAppsEnforcementPointSessionExpiryInactivity sessionExpiryInactivity) {
            $.sessionExpiryInactivity = sessionExpiryInactivity;
            return this;
        }

        /**
         * @param target A fully-qualified URL to the internal application including scheme, authority and path. The target host authority must be an IP address, not a hostname.
         * 
         * @return builder
         * 
         */
        public Builder target(String target) {
            $.target = target;
            return this;
        }

        /**
         * @param token Can only be set on create. Access Gateway Token.
         * 
         * @return builder
         * 
         */
        public Builder token(String token) {
            $.token = token;
            return this;
        }

        /**
         * @param useTargetHostHeader Use the target host header as opposed to the original gateway or upstream host header.
         * 
         * @return builder
         * 
         */
        public Builder useTargetHostHeader(Boolean useTargetHostHeader) {
            $.useTargetHostHeader = useTargetHostHeader;
            return this;
        }

        /**
         * @param vhost A comma-delimited list of one or more virtual hosts that map to applications assigned to the enforcement point. A VHOST may be a host name or an IP address. VHOST distinguish between applications that are at the same context root.
         * 
         * @return builder
         * 
         */
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
