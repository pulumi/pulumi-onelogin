// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

export function getUser(args?: GetUserArgs, opts?: pulumi.InvokeOptions): Promise<GetUserResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("onelogin:users/getUser:getUser", {
        "externalId": args.externalId,
        "userId": args.userId,
        "username": args.username,
    }, opts);
}

/**
 * A collection of arguments for invoking getUser.
 */
export interface GetUserArgs {
    externalId?: number;
    userId?: string;
    username?: string;
}

/**
 * A collection of values returned by getUser.
 */
export interface GetUserResult {
    readonly comment: string;
    readonly company: string;
    readonly customAttributes: {[key: string]: string};
    readonly department: string;
    readonly directoryId: number;
    readonly distinguishedName: string;
    readonly email: string;
    readonly externalId: number;
    readonly firstname: string;
    readonly groupId: number;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly lastname: string;
    readonly managerAdId: number;
    readonly managerUserId: number;
    readonly memberOf: string;
    readonly phone: string;
    readonly samaccountname: string;
    readonly state: number;
    readonly status: number;
    readonly title: string;
    readonly trustedIdpId: number;
    readonly userId?: string;
    readonly username: string;
    readonly userprincipalname: string;
}
export function getUserOutput(args?: GetUserOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetUserResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("onelogin:users/getUser:getUser", {
        "externalId": args.externalId,
        "userId": args.userId,
        "username": args.username,
    }, opts);
}

/**
 * A collection of arguments for invoking getUser.
 */
export interface GetUserOutputArgs {
    externalId?: pulumi.Input<number>;
    userId?: pulumi.Input<string>;
    username?: pulumi.Input<string>;
}
