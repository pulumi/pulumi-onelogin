// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

export function getPrivileges(args?: GetPrivilegesArgs, opts?: pulumi.InvokeOptions): Promise<GetPrivilegesResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("onelogin:index/getPrivileges:getPrivileges", {
        "description": args.description,
        "filters": args.filters,
        "name": args.name,
        "privilege": args.privilege,
    }, opts);
}

/**
 * A collection of arguments for invoking getPrivileges.
 */
export interface GetPrivilegesArgs {
    description?: string;
    filters?: inputs.GetPrivilegesFilter[];
    name?: string;
    privilege?: inputs.GetPrivilegesPrivilege;
}

/**
 * A collection of values returned by getPrivileges.
 */
export interface GetPrivilegesResult {
    readonly description: string;
    readonly filters?: outputs.GetPrivilegesFilter[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly name: string;
    readonly privilege: outputs.GetPrivilegesPrivilege;
}
export function getPrivilegesOutput(args?: GetPrivilegesOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetPrivilegesResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("onelogin:index/getPrivileges:getPrivileges", {
        "description": args.description,
        "filters": args.filters,
        "name": args.name,
        "privilege": args.privilege,
    }, opts);
}

/**
 * A collection of arguments for invoking getPrivileges.
 */
export interface GetPrivilegesOutputArgs {
    description?: pulumi.Input<string>;
    filters?: pulumi.Input<pulumi.Input<inputs.GetPrivilegesFilterArgs>[]>;
    name?: pulumi.Input<string>;
    privilege?: pulumi.Input<inputs.GetPrivilegesPrivilegeArgs>;
}
