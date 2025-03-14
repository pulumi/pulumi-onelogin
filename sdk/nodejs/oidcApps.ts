// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

export class OidcApps extends pulumi.CustomResource {
    /**
     * Get an existing OidcApps resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: OidcAppsState, opts?: pulumi.CustomResourceOptions): OidcApps {
        return new OidcApps(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'onelogin:index/oidcApps:OidcApps';

    /**
     * Returns true if the given object is an instance of OidcApps.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is OidcApps {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === OidcApps.__pulumiType;
    }

    public readonly allowAssumedSignin!: pulumi.Output<boolean | undefined>;
    public /*out*/ readonly authMethod!: pulumi.Output<number>;
    public readonly brandId!: pulumi.Output<number | undefined>;
    public readonly configuration!: pulumi.Output<{[key: string]: string} | undefined>;
    public readonly connectorId!: pulumi.Output<number>;
    public /*out*/ readonly createdAt!: pulumi.Output<string>;
    public readonly description!: pulumi.Output<string | undefined>;
    public /*out*/ readonly iconUrl!: pulumi.Output<string>;
    public readonly name!: pulumi.Output<string>;
    public readonly notes!: pulumi.Output<string | undefined>;
    public readonly parameters!: pulumi.Output<outputs.OidcAppsParameter[]>;
    public /*out*/ readonly policyId!: pulumi.Output<number>;
    public readonly provisioning!: pulumi.Output<{[key: string]: boolean}>;
    public /*out*/ readonly sso!: pulumi.Output<{[key: string]: string}>;
    public /*out*/ readonly tabId!: pulumi.Output<number>;
    public /*out*/ readonly updatedAt!: pulumi.Output<string>;
    public readonly visible!: pulumi.Output<boolean | undefined>;

    /**
     * Create a OidcApps resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: OidcAppsArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: OidcAppsArgs | OidcAppsState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as OidcAppsState | undefined;
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
            const args = argsOrState as OidcAppsArgs | undefined;
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
        const secretOpts = { additionalSecretOutputs: ["sso"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(OidcApps.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering OidcApps resources.
 */
export interface OidcAppsState {
    allowAssumedSignin?: pulumi.Input<boolean>;
    authMethod?: pulumi.Input<number>;
    brandId?: pulumi.Input<number>;
    configuration?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    connectorId?: pulumi.Input<number>;
    createdAt?: pulumi.Input<string>;
    description?: pulumi.Input<string>;
    iconUrl?: pulumi.Input<string>;
    name?: pulumi.Input<string>;
    notes?: pulumi.Input<string>;
    parameters?: pulumi.Input<pulumi.Input<inputs.OidcAppsParameter>[]>;
    policyId?: pulumi.Input<number>;
    provisioning?: pulumi.Input<{[key: string]: pulumi.Input<boolean>}>;
    sso?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    tabId?: pulumi.Input<number>;
    updatedAt?: pulumi.Input<string>;
    visible?: pulumi.Input<boolean>;
}

/**
 * The set of arguments for constructing a OidcApps resource.
 */
export interface OidcAppsArgs {
    allowAssumedSignin?: pulumi.Input<boolean>;
    brandId?: pulumi.Input<number>;
    configuration?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    connectorId: pulumi.Input<number>;
    description?: pulumi.Input<string>;
    name?: pulumi.Input<string>;
    notes?: pulumi.Input<string>;
    parameters?: pulumi.Input<pulumi.Input<inputs.OidcAppsParameter>[]>;
    provisioning?: pulumi.Input<{[key: string]: pulumi.Input<boolean>}>;
    visible?: pulumi.Input<boolean>;
}
