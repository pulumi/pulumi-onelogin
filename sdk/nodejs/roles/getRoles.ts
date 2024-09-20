// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

export function getRoles(args?: GetRolesArgs, opts?: pulumi.InvokeOptions): Promise<GetRolesResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("onelogin:roles/getRoles:getRoles", {
        "admins": args.admins,
        "apps": args.apps,
        "filters": args.filters,
        "name": args.name,
        "users": args.users,
    }, opts);
}

/**
 * A collection of arguments for invoking getRoles.
 */
export interface GetRolesArgs {
    admins?: number[];
    apps?: number[];
    filters?: inputs.roles.GetRolesFilter[];
    name?: string;
    users?: number[];
}

/**
 * A collection of values returned by getRoles.
 */
export interface GetRolesResult {
    readonly admins: number[];
    readonly apps: number[];
    readonly filters?: outputs.roles.GetRolesFilter[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly name: string;
    readonly users: number[];
}
export function getRolesOutput(args?: GetRolesOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetRolesResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("onelogin:roles/getRoles:getRoles", {
        "admins": args.admins,
        "apps": args.apps,
        "filters": args.filters,
        "name": args.name,
        "users": args.users,
    }, opts);
}

/**
 * A collection of arguments for invoking getRoles.
 */
export interface GetRolesOutputArgs {
    admins?: pulumi.Input<pulumi.Input<number>[]>;
    apps?: pulumi.Input<pulumi.Input<number>[]>;
    filters?: pulumi.Input<pulumi.Input<inputs.roles.GetRolesFilterArgs>[]>;
    name?: pulumi.Input<string>;
    users?: pulumi.Input<pulumi.Input<number>[]>;
}
