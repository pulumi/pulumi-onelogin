// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Returns User resource.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as onelogin from "@pulumi/onelogin";
 *
 * const example = pulumi.output(onelogin.getUser({
 *     username: "timmy.tester",
 * }));
 * ```
 */
export function getUser(args?: GetUserArgs, opts?: pulumi.InvokeOptions): Promise<GetUserResult> {
    args = args || {};
    if (!opts) {
        opts = {}
    }

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
    return pulumi.runtime.invoke("onelogin:index/getUser:getUser", {
        "externalId": args.externalId,
        "userId": args.userId,
        "username": args.username,
    }, opts);
}

/**
 * A collection of arguments for invoking getUser.
 */
export interface GetUserArgs {
    /**
     * The user's external_id
     */
    externalId?: number;
    /**
     * The user's ID.
     */
    userId?: string;
    /**
     * The user's username.
     */
    username?: string;
}

/**
 * A collection of values returned by getUser.
 */
export interface GetUserResult {
    /**
     * A comment about the user
     */
    readonly comment: string;
    /**
     * The user's company
     */
    readonly company: string;
    readonly customAttributes: {[key: string]: string};
    /**
     * The user's department
     */
    readonly department: string;
    /**
     * The user's directory_id
     */
    readonly directoryId: number;
    /**
     * The user's distinguished name
     */
    readonly distinguishedName: string;
    /**
     * The user's email.
     */
    readonly email: string;
    /**
     * The user's external_id
     */
    readonly externalId: number;
    /**
     * The user's first name
     */
    readonly firstname: string;
    /**
     * The user's group_id
     */
    readonly groupId: number;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * The user's last name
     */
    readonly lastname: string;
    /**
     * The user's manager_ad_id
     */
    readonly managerAdId: number;
    /**
     * The user's manager_user_id
     */
    readonly managerUserId: number;
    /**
     * The user's member_of
     */
    readonly memberOf: string;
    /**
     * The user's phone number
     */
    readonly phone: string;
    /**
     * The user's samaccount name
     */
    readonly samaccountname: string;
    /**
     * The user's state. Must be one of `0: Unapproved` `1: Approved` `2: Rejected` `3: Unlicensed`
     */
    readonly state: number;
    /**
     * The user's status. Must be one of `0: Unactivated` `1: Active` `2: Suspended` `3: Locked` `4: Password expired` `5: Awaiting password reset` `7: Password Pending` `8: Security questions required`
     */
    readonly status: number;
    /**
     * The user's title
     */
    readonly title: string;
    /**
     * The user's trusted_idp_id
     */
    readonly trustedIdpId: number;
    readonly userId?: string;
    readonly username: string;
    /**
     * The user's user principal name
     */
    readonly userprincipalname: string;
}

export function getUserOutput(args?: GetUserOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetUserResult> {
    return pulumi.output(args).apply(a => getUser(a, opts))
}

/**
 * A collection of arguments for invoking getUser.
 */
export interface GetUserOutputArgs {
    /**
     * The user's external_id
     */
    externalId?: pulumi.Input<number>;
    /**
     * The user's ID.
     */
    userId?: pulumi.Input<string>;
    /**
     * The user's username.
     */
    username?: pulumi.Input<string>;
}
