// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

export function getApps(args: GetAppsArgs, opts?: pulumi.InvokeOptions): Promise<GetAppsResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("onelogin:users/getApps:getApps", {
        "extension": args.extension,
        "filters": args.filters,
        "iconUrl": args.iconUrl,
        "loginId": args.loginId,
        "name": args.name,
        "provisioningEnabled": args.provisioningEnabled,
        "provisioningState": args.provisioningState,
        "provisioningStatus": args.provisioningStatus,
        "usersId": args.usersId,
    }, opts);
}

/**
 * A collection of arguments for invoking getApps.
 */
export interface GetAppsArgs {
    extension?: boolean;
    filters?: inputs.users.GetAppsFilter[];
    iconUrl?: string;
    loginId?: number;
    name?: string;
    provisioningEnabled?: boolean;
    provisioningState?: string;
    provisioningStatus?: string;
    usersId: string;
}

/**
 * A collection of values returned by getApps.
 */
export interface GetAppsResult {
    readonly extension: boolean;
    readonly filters?: outputs.users.GetAppsFilter[];
    readonly iconUrl: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly loginId: number;
    readonly name: string;
    readonly provisioningEnabled: boolean;
    readonly provisioningState: string;
    readonly provisioningStatus: string;
    readonly usersId: string;
}
export function getAppsOutput(args: GetAppsOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetAppsResult> {
    return pulumi.output(args).apply((a: any) => getApps(a, opts))
}

/**
 * A collection of arguments for invoking getApps.
 */
export interface GetAppsOutputArgs {
    extension?: pulumi.Input<boolean>;
    filters?: pulumi.Input<pulumi.Input<inputs.users.GetAppsFilterArgs>[]>;
    iconUrl?: pulumi.Input<string>;
    loginId?: pulumi.Input<number>;
    name?: pulumi.Input<string>;
    provisioningEnabled?: pulumi.Input<boolean>;
    provisioningState?: pulumi.Input<string>;
    provisioningStatus?: pulumi.Input<string>;
    usersId: pulumi.Input<string>;
}
