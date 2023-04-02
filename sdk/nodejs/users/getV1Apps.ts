// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

export function getV1Apps(args: GetV1AppsArgs, opts?: pulumi.InvokeOptions): Promise<GetV1AppsResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("onelogin:users/getV1Apps:getV1Apps", {
        "extension": args.extension,
        "filters": args.filters,
        "iconUrl": args.iconUrl,
        "loginId": args.loginId,
        "name": args.name,
        "provisioningEnabled": args.provisioningEnabled,
        "provisioningState": args.provisioningState,
        "provisioningStatus": args.provisioningStatus,
        "usersV1Id": args.usersV1Id,
    }, opts);
}

/**
 * A collection of arguments for invoking getV1Apps.
 */
export interface GetV1AppsArgs {
    extension?: boolean;
    filters?: inputs.users.GetV1AppsFilter[];
    iconUrl?: string;
    loginId?: number;
    name?: string;
    provisioningEnabled?: boolean;
    provisioningState?: string;
    provisioningStatus?: string;
    usersV1Id: string;
}

/**
 * A collection of values returned by getV1Apps.
 */
export interface GetV1AppsResult {
    readonly extension: boolean;
    readonly filters?: outputs.users.GetV1AppsFilter[];
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
    readonly usersV1Id: string;
}
export function getV1AppsOutput(args: GetV1AppsOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetV1AppsResult> {
    return pulumi.output(args).apply((a: any) => getV1Apps(a, opts))
}

/**
 * A collection of arguments for invoking getV1Apps.
 */
export interface GetV1AppsOutputArgs {
    extension?: pulumi.Input<boolean>;
    filters?: pulumi.Input<pulumi.Input<inputs.users.GetV1AppsFilterArgs>[]>;
    iconUrl?: pulumi.Input<string>;
    loginId?: pulumi.Input<number>;
    name?: pulumi.Input<string>;
    provisioningEnabled?: pulumi.Input<boolean>;
    provisioningState?: pulumi.Input<string>;
    provisioningStatus?: pulumi.Input<string>;
    usersV1Id: pulumi.Input<string>;
}
