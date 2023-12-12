// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.onelogin;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.onelogin.AppArgs;
import com.pulumi.onelogin.Utilities;
import com.pulumi.onelogin.inputs.AppState;
import com.pulumi.onelogin.outputs.AppConfiguration;
import com.pulumi.onelogin.outputs.AppEnforcementPoint;
import com.pulumi.onelogin.outputs.AppParameters;
import com.pulumi.onelogin.outputs.AppProvisioning;
import com.pulumi.onelogin.outputs.AppSso;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

@ResourceType(type="onelogin:index/app:App")
public class App extends com.pulumi.resources.CustomResource {
    /**
     * Indicates whether or not administrators can access the app as a user that they have assumed control over.
     * 
     */
    @Export(name="allowAssumedSignin", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> allowAssumedSignin;

    /**
     * @return Indicates whether or not administrators can access the app as a user that they have assumed control over.
     * 
     */
    public Output<Optional<Boolean>> allowAssumedSignin() {
        return Codegen.optional(this.allowAssumedSignin);
    }
    /**
     * An ID indicating the type of app: - 0: Password - 1: OpenId - 2: SAML - 3: API - 4: Google - 6: Forms Based App - 7:
     * WSFED - 8: OpenId Connect
     * 
     */
    @Export(name="authMethod", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> authMethod;

    /**
     * @return An ID indicating the type of app: - 0: Password - 1: OpenId - 2: SAML - 3: API - 4: Google - 6: Forms Based App - 7:
     * WSFED - 8: OpenId Connect
     * 
     */
    public Output<Optional<Integer>> authMethod() {
        return Codegen.optional(this.authMethod);
    }
    @Export(name="authMethodDescription", refs={String.class}, tree="[0]")
    private Output<String> authMethodDescription;

    public Output<String> authMethodDescription() {
        return this.authMethodDescription;
    }
    @Export(name="brandId", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> brandId;

    public Output<Optional<Integer>> brandId() {
        return Codegen.optional(this.brandId);
    }
    /**
     * Only apply configurations that are applicable to the type of app
     * 
     */
    @Export(name="configuration", refs={AppConfiguration.class}, tree="[0]")
    private Output<AppConfiguration> configuration;

    /**
     * @return Only apply configurations that are applicable to the type of app
     * 
     */
    public Output<AppConfiguration> configuration() {
        return this.configuration;
    }
    /**
     * ID of the connector to base the app from.
     * 
     */
    @Export(name="connectorId", refs={Integer.class}, tree="[0]")
    private Output<Integer> connectorId;

    /**
     * @return ID of the connector to base the app from.
     * 
     */
    public Output<Integer> connectorId() {
        return this.connectorId;
    }
    /**
     * the date the app was created
     * 
     */
    @Export(name="createdAt", refs={String.class}, tree="[0]")
    private Output<String> createdAt;

    /**
     * @return the date the app was created
     * 
     */
    public Output<String> createdAt() {
        return this.createdAt;
    }
    /**
     * Freeform description of the app.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return Freeform description of the app.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * For apps that connect to a OneLogin Access Enforcement Point the following enforcement_point object will be included
     * with the app payload.
     * 
     */
    @Export(name="enforcementPoint", refs={AppEnforcementPoint.class}, tree="[0]")
    private Output</* @Nullable */ AppEnforcementPoint> enforcementPoint;

    /**
     * @return For apps that connect to a OneLogin Access Enforcement Point the following enforcement_point object will be included
     * with the app payload.
     * 
     */
    public Output<Optional<AppEnforcementPoint>> enforcementPoint() {
        return Codegen.optional(this.enforcementPoint);
    }
    /**
     * A link to the apps icon url
     * 
     */
    @Export(name="iconUrl", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> iconUrl;

    /**
     * @return A link to the apps icon url
     * 
     */
    public Output<Optional<String>> iconUrl() {
        return Codegen.optional(this.iconUrl);
    }
    @Export(name="loginConfig", refs={Integer.class}, tree="[0]")
    private Output<Integer> loginConfig;

    public Output<Integer> loginConfig() {
        return this.loginConfig;
    }
    /**
     * The name of the app.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the app.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Freeform notes about the app.
     * 
     */
    @Export(name="notes", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> notes;

    /**
     * @return Freeform notes about the app.
     * 
     */
    public Output<Optional<String>> notes() {
        return Codegen.optional(this.notes);
    }
    @Export(name="parameters", refs={AppParameters.class}, tree="[0]")
    private Output<AppParameters> parameters;

    public Output<AppParameters> parameters() {
        return this.parameters;
    }
    /**
     * The security policy assigned to the app.
     * 
     */
    @Export(name="policyId", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> policyId;

    /**
     * @return The security policy assigned to the app.
     * 
     */
    public Output<Optional<Integer>> policyId() {
        return Codegen.optional(this.policyId);
    }
    /**
     * Indicates if provisioning is enabled for this app.
     * 
     */
    @Export(name="provisioning", refs={AppProvisioning.class}, tree="[0]")
    private Output</* @Nullable */ AppProvisioning> provisioning;

    /**
     * @return Indicates if provisioning is enabled for this app.
     * 
     */
    public Output<Optional<AppProvisioning>> provisioning() {
        return Codegen.optional(this.provisioning);
    }
    /**
     * List of Role IDs that are assigned to the app. On App Create or Update the entire array is replaced with the values
     * provided.
     * 
     */
    @Export(name="roleIds", refs={List.class,Integer.class}, tree="[0,1]")
    private Output</* @Nullable */ List<Integer>> roleIds;

    /**
     * @return List of Role IDs that are assigned to the app. On App Create or Update the entire array is replaced with the values
     * provided.
     * 
     */
    public Output<Optional<List<Integer>>> roleIds() {
        return Codegen.optional(this.roleIds);
    }
    /**
     * The attributes included in the sso section are determined by the type of app. All of the attributes of the `sso` object
     * are read only.
     * 
     */
    @Export(name="sso", refs={AppSso.class}, tree="[0]")
    private Output<AppSso> sso;

    /**
     * @return The attributes included in the sso section are determined by the type of app. All of the attributes of the `sso` object
     * are read only.
     * 
     */
    public Output<AppSso> sso() {
        return this.sso;
    }
    /**
     * ID of the OneLogin portal tab that the app is assigned to.
     * 
     */
    @Export(name="tabId", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> tabId;

    /**
     * @return ID of the OneLogin portal tab that the app is assigned to.
     * 
     */
    public Output<Optional<Integer>> tabId() {
        return Codegen.optional(this.tabId);
    }
    /**
     * the date the app was last updated
     * 
     */
    @Export(name="updatedAt", refs={String.class}, tree="[0]")
    private Output<String> updatedAt;

    /**
     * @return the date the app was last updated
     * 
     */
    public Output<String> updatedAt() {
        return this.updatedAt;
    }
    /**
     * Indicates if the app is visible in the OneLogin portal.
     * 
     */
    @Export(name="visible", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> visible;

    /**
     * @return Indicates if the app is visible in the OneLogin portal.
     * 
     */
    public Output<Optional<Boolean>> visible() {
        return Codegen.optional(this.visible);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public App(String name) {
        this(name, AppArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public App(String name, AppArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public App(String name, AppArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("onelogin:index/app:App", name, args == null ? AppArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private App(String name, Output<String> id, @Nullable AppState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("onelogin:index/app:App", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static App get(String name, Output<String> id, @Nullable AppState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new App(name, id, state, options);
    }
}
