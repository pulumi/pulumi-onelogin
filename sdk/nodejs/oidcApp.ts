// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "./types";
import * as utilities from "./utilities";

/**
 * Creates an OIDC Application.
 *
 * This resource allows you to create and configure an OIDC Application.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as onelogin from "@pulumi/onelogin";
 *
 * const myOidcApp = new onelogin.OidcApp("my_oidc_app", {
 *     allowAssumedSignin: false,
 *     configuration: {
 *         access_token_expiration_minutes: 1,
 *         login_url: "https://www.example.com",
 *         oidc_application_type: 0,
 *         post_logout_redirect_uri: "",
 *         redirect_uri: "https://example.com/example",
 *         refresh_token_expiration_minutes: 1,
 *         token_endpoint_auth_method: 1,
 *     },
 *     connectorId: 123456,
 *     description: "example OIDC app",
 *     notes: "example",
 *     parameters: [{
 *         attributesTransformations: "",
 *         defaultValues: "",
 *         includeInSamlAssertion: false,
 *         label: "example app parameter ",
 *         paramKeyName: "example",
 *         provisionedEntitlements: false,
 *         safeEntitlementsEnabled: false,
 *         skipIfBlank: false,
 *         userAttributeMacros: "",
 *         userAttributeMappings: "",
 *         values: "",
 *     }],
 *     provisioning: {
 *         enabled: false,
 *     },
 *     visible: true,
 * });
 * ```
 *
 * ## Import
 *
 * A OIDC App can be imported via the OneLogin App ID.
 *
 * ```sh
 *  $ pulumi import onelogin:index/oidcApp:OidcApp my_oidc_app <app id>
 * ```
 */
export class OidcApp extends pulumi.CustomResource {
    /**
     * Get an existing OidcApp resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: OidcAppState, opts?: pulumi.CustomResourceOptions): OidcApp {
        return new OidcApp(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'onelogin:index/oidcApp:OidcApp';

    /**
     * Returns true if the given object is an instance of OidcApp.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is OidcApp {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === OidcApp.__pulumiType;
    }

    /**
     * Enable sign in when user has been assumed by the account owner. Defaults to `false`.
     */
    public readonly allowAssumedSignin!: pulumi.Output<boolean | undefined>;
    /**
     * The apps auth method. Refer to the [OneLogin Apps Documentation](https://developers.onelogin.com/api-docs/2/apps/app-resource) for a comprehensive list of available auth methods.
     */
    public /*out*/ readonly authMethod!: pulumi.Output<number>;
    public readonly brandId!: pulumi.Output<number | undefined>;
    /**
     * OIDC settings that control the authentication flow e.g. redirect urls and token settings.
     */
    public readonly configuration!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * The ID for the app connector, dictates the type of app (e.g. AWS Multi-Role App).
     */
    public readonly connectorId!: pulumi.Output<number>;
    /**
     * Timestamp for app's creation.
     */
    public /*out*/ readonly createdAt!: pulumi.Output<string>;
    /**
     * App description.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * The url for the app's icon.
     */
    public /*out*/ readonly iconUrl!: pulumi.Output<string>;
    /**
     * The app's name.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Notes about the app.
     */
    public readonly notes!: pulumi.Output<string | undefined>;
    /**
     * a list of custom parameters for this app.
     */
    public readonly parameters!: pulumi.Output<outputs.OidcAppParameter[]>;
    /**
     * The security policy assigned to the app.
     */
    public /*out*/ readonly policyId!: pulumi.Output<number>;
    /**
     * Settings regarding the app's provisioning ability.
     */
    public readonly provisioning!: pulumi.Output<{[key: string]: boolean}>;
    public /*out*/ readonly sso!: pulumi.Output<{[key: string]: string}>;
    /**
     * The tab in which to display in OneLogin portal.
     */
    public /*out*/ readonly tabId!: pulumi.Output<number>;
    /**
     * Timestamp for app's last update.
     */
    public /*out*/ readonly updatedAt!: pulumi.Output<string>;
    /**
     * Determine if app should be visible in OneLogin portal. Defaults to `true`.
     */
    public readonly visible!: pulumi.Output<boolean | undefined>;

    /**
     * Create a OidcApp resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: OidcAppArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: OidcAppArgs | OidcAppState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as OidcAppState | undefined;
            resourceInputs["allowAssumedSignin"] = state ? state.allowAssumedSignin : undefined;
            resourceInputs["authMethod"] = state ? state.authMethod : undefined;
            resourceInputs["brandId"] = state ? state.brandId : undefined;
            resourceInputs["configuration"] = state ? state.configuration : undefined;
            resourceInputs["connectorId"] = state ? state.connectorId : undefined;
            resourceInputs["createdAt"] = state ? state.createdAt : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["iconUrl"] = state ? state.iconUrl : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["notes"] = state ? state.notes : undefined;
            resourceInputs["parameters"] = state ? state.parameters : undefined;
            resourceInputs["policyId"] = state ? state.policyId : undefined;
            resourceInputs["provisioning"] = state ? state.provisioning : undefined;
            resourceInputs["sso"] = state ? state.sso : undefined;
            resourceInputs["tabId"] = state ? state.tabId : undefined;
            resourceInputs["updatedAt"] = state ? state.updatedAt : undefined;
            resourceInputs["visible"] = state ? state.visible : undefined;
        } else {
            const args = argsOrState as OidcAppArgs | undefined;
            if ((!args || args.connectorId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'connectorId'");
            }
            resourceInputs["allowAssumedSignin"] = args ? args.allowAssumedSignin : undefined;
            resourceInputs["brandId"] = args ? args.brandId : undefined;
            resourceInputs["configuration"] = args ? args.configuration : undefined;
            resourceInputs["connectorId"] = args ? args.connectorId : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["notes"] = args ? args.notes : undefined;
            resourceInputs["parameters"] = args ? args.parameters : undefined;
            resourceInputs["provisioning"] = args ? args.provisioning : undefined;
            resourceInputs["visible"] = args ? args.visible : undefined;
            resourceInputs["authMethod"] = undefined /*out*/;
            resourceInputs["createdAt"] = undefined /*out*/;
            resourceInputs["iconUrl"] = undefined /*out*/;
            resourceInputs["policyId"] = undefined /*out*/;
            resourceInputs["sso"] = undefined /*out*/;
            resourceInputs["tabId"] = undefined /*out*/;
            resourceInputs["updatedAt"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(OidcApp.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering OidcApp resources.
 */
export interface OidcAppState {
    /**
     * Enable sign in when user has been assumed by the account owner. Defaults to `false`.
     */
    allowAssumedSignin?: pulumi.Input<boolean>;
    /**
     * The apps auth method. Refer to the [OneLogin Apps Documentation](https://developers.onelogin.com/api-docs/2/apps/app-resource) for a comprehensive list of available auth methods.
     */
    authMethod?: pulumi.Input<number>;
    brandId?: pulumi.Input<number>;
    /**
     * OIDC settings that control the authentication flow e.g. redirect urls and token settings.
     */
    configuration?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The ID for the app connector, dictates the type of app (e.g. AWS Multi-Role App).
     */
    connectorId?: pulumi.Input<number>;
    /**
     * Timestamp for app's creation.
     */
    createdAt?: pulumi.Input<string>;
    /**
     * App description.
     */
    description?: pulumi.Input<string>;
    /**
     * The url for the app's icon.
     */
    iconUrl?: pulumi.Input<string>;
    /**
     * The app's name.
     */
    name?: pulumi.Input<string>;
    /**
     * Notes about the app.
     */
    notes?: pulumi.Input<string>;
    /**
     * a list of custom parameters for this app.
     */
    parameters?: pulumi.Input<pulumi.Input<inputs.OidcAppParameter>[]>;
    /**
     * The security policy assigned to the app.
     */
    policyId?: pulumi.Input<number>;
    /**
     * Settings regarding the app's provisioning ability.
     */
    provisioning?: pulumi.Input<{[key: string]: pulumi.Input<boolean>}>;
    sso?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The tab in which to display in OneLogin portal.
     */
    tabId?: pulumi.Input<number>;
    /**
     * Timestamp for app's last update.
     */
    updatedAt?: pulumi.Input<string>;
    /**
     * Determine if app should be visible in OneLogin portal. Defaults to `true`.
     */
    visible?: pulumi.Input<boolean>;
}

/**
 * The set of arguments for constructing a OidcApp resource.
 */
export interface OidcAppArgs {
    /**
     * Enable sign in when user has been assumed by the account owner. Defaults to `false`.
     */
    allowAssumedSignin?: pulumi.Input<boolean>;
    brandId?: pulumi.Input<number>;
    /**
     * OIDC settings that control the authentication flow e.g. redirect urls and token settings.
     */
    configuration?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The ID for the app connector, dictates the type of app (e.g. AWS Multi-Role App).
     */
    connectorId: pulumi.Input<number>;
    /**
     * App description.
     */
    description?: pulumi.Input<string>;
    /**
     * The app's name.
     */
    name?: pulumi.Input<string>;
    /**
     * Notes about the app.
     */
    notes?: pulumi.Input<string>;
    /**
     * a list of custom parameters for this app.
     */
    parameters?: pulumi.Input<pulumi.Input<inputs.OidcAppParameter>[]>;
    /**
     * Settings regarding the app's provisioning ability.
     */
    provisioning?: pulumi.Input<{[key: string]: pulumi.Input<boolean>}>;
    /**
     * Determine if app should be visible in OneLogin portal. Defaults to `true`.
     */
    visible?: pulumi.Input<boolean>;
}
