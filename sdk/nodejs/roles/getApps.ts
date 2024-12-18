// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

export function getApps(args: GetAppsArgs, opts?: pulumi.InvokeOptions): Promise<GetAppsResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("onelogin:roles/getApps:getApps", {
        "filters": args.filters,
        "iconUrl": args.iconUrl,
        "name": args.name,
        "rolesId": args.rolesId,
    }, opts);
}

/**
 * A collection of arguments for invoking getApps.
 */
export interface GetAppsArgs {
    filters?: inputs.roles.GetAppsFilter[];
    iconUrl?: string;
    name?: string;
    rolesId: string;
}

/**
 * A collection of values returned by getApps.
 */
export interface GetAppsResult {
    readonly filters?: outputs.roles.GetAppsFilter[];
    readonly iconUrl: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly name: string;
    readonly rolesId: string;
}
export function getAppsOutput(args: GetAppsOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetAppsResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("onelogin:roles/getApps:getApps", {
        "filters": args.filters,
        "iconUrl": args.iconUrl,
        "name": args.name,
        "rolesId": args.rolesId,
    }, opts);
}

/**
 * A collection of arguments for invoking getApps.
 */
export interface GetAppsOutputArgs {
    filters?: pulumi.Input<pulumi.Input<inputs.roles.GetAppsFilterArgs>[]>;
    iconUrl?: pulumi.Input<string>;
    name?: pulumi.Input<string>;
    rolesId: pulumi.Input<string>;
}
