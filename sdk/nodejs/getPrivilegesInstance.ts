// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

export function getPrivilegesInstance(args: GetPrivilegesInstanceArgs, opts?: pulumi.InvokeOptions): Promise<GetPrivilegesInstanceResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("onelogin:index/getPrivilegesInstance:getPrivilegesInstance", {
        "description": args.description,
        "id": args.id,
        "name": args.name,
        "privilege": args.privilege,
    }, opts);
}

/**
 * A collection of arguments for invoking getPrivilegesInstance.
 */
export interface GetPrivilegesInstanceArgs {
    description?: string;
    id: string;
    name?: string;
    privilege?: inputs.GetPrivilegesInstancePrivilege;
}

/**
 * A collection of values returned by getPrivilegesInstance.
 */
export interface GetPrivilegesInstanceResult {
    readonly description: string;
    readonly id: string;
    readonly name: string;
    readonly privilege: outputs.GetPrivilegesInstancePrivilege;
}
export function getPrivilegesInstanceOutput(args: GetPrivilegesInstanceOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetPrivilegesInstanceResult> {
    return pulumi.output(args).apply((a: any) => getPrivilegesInstance(a, opts))
}

/**
 * A collection of arguments for invoking getPrivilegesInstance.
 */
export interface GetPrivilegesInstanceOutputArgs {
    description?: pulumi.Input<string>;
    id: pulumi.Input<string>;
    name?: pulumi.Input<string>;
    privilege?: pulumi.Input<inputs.GetPrivilegesInstancePrivilegeArgs>;
}