// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

export function getV1Instance(args: GetV1InstanceArgs, opts?: pulumi.InvokeOptions): Promise<GetV1InstanceResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("onelogin:users/getV1Instance:getV1Instance", {
        "activatedAt": args.activatedAt,
        "comment": args.comment,
        "company": args.company,
        "createdAt": args.createdAt,
        "department": args.department,
        "directoryId": args.directoryId,
        "distinguishedName": args.distinguishedName,
        "email": args.email,
        "externalId": args.externalId,
        "firstname": args.firstname,
        "groupId": args.groupId,
        "id": args.id,
        "invalidLoginAttempts": args.invalidLoginAttempts,
        "invitationSentAt": args.invitationSentAt,
        "lastLogin": args.lastLogin,
        "lastname": args.lastname,
        "lockedUntil": args.lockedUntil,
        "managerAdId": args.managerAdId,
        "managerUserId": args.managerUserId,
        "memberOf": args.memberOf,
        "password": args.password,
        "passwordAlgorithm": args.passwordAlgorithm,
        "passwordChangedAt": args.passwordChangedAt,
        "passwordConfirmation": args.passwordConfirmation,
        "phone": args.phone,
        "preferredLocaleCode": args.preferredLocaleCode,
        "roleIds": args.roleIds,
        "salt": args.salt,
        "samaccountname": args.samaccountname,
        "state": args.state,
        "status": args.status,
        "title": args.title,
        "trustedIdpId": args.trustedIdpId,
        "updatedAt": args.updatedAt,
        "username": args.username,
        "userprincipalname": args.userprincipalname,
    }, opts);
}

/**
 * A collection of arguments for invoking getV1Instance.
 */
export interface GetV1InstanceArgs {
    activatedAt?: string;
    comment?: string;
    company?: string;
    createdAt?: string;
    department?: string;
    directoryId?: number;
    distinguishedName?: string;
    email?: string;
    externalId?: string;
    firstname?: string;
    groupId?: number;
    id: string;
    invalidLoginAttempts?: number;
    invitationSentAt?: string;
    lastLogin?: string;
    lastname?: string;
    lockedUntil?: string;
    managerAdId?: string;
    managerUserId?: string;
    memberOf?: string;
    password?: string;
    passwordAlgorithm?: string;
    passwordChangedAt?: string;
    passwordConfirmation?: string;
    phone?: string;
    preferredLocaleCode?: string;
    roleIds?: number[];
    salt?: string;
    samaccountname?: string;
    state?: number;
    status?: number;
    title?: string;
    trustedIdpId?: number;
    updatedAt?: string;
    username?: string;
    userprincipalname?: string;
}

/**
 * A collection of values returned by getV1Instance.
 */
export interface GetV1InstanceResult {
    readonly activatedAt: string;
    readonly comment: string;
    readonly company: string;
    readonly createdAt: string;
    readonly department: string;
    readonly directoryId: number;
    readonly distinguishedName: string;
    readonly email: string;
    readonly externalId: string;
    readonly firstname: string;
    readonly groupId: number;
    readonly id: string;
    readonly invalidLoginAttempts: number;
    readonly invitationSentAt: string;
    readonly lastLogin: string;
    readonly lastname: string;
    readonly lockedUntil: string;
    readonly managerAdId: string;
    readonly managerUserId: string;
    readonly memberOf: string;
    readonly password: string;
    readonly passwordAlgorithm: string;
    readonly passwordChangedAt: string;
    readonly passwordConfirmation: string;
    readonly phone: string;
    readonly preferredLocaleCode: string;
    readonly roleIds: number[];
    readonly salt: string;
    readonly samaccountname: string;
    readonly state: number;
    readonly status: number;
    readonly title: string;
    readonly trustedIdpId: number;
    readonly updatedAt: string;
    readonly username: string;
    readonly userprincipalname: string;
}
export function getV1InstanceOutput(args: GetV1InstanceOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetV1InstanceResult> {
    return pulumi.output(args).apply((a: any) => getV1Instance(a, opts))
}

/**
 * A collection of arguments for invoking getV1Instance.
 */
export interface GetV1InstanceOutputArgs {
    activatedAt?: pulumi.Input<string>;
    comment?: pulumi.Input<string>;
    company?: pulumi.Input<string>;
    createdAt?: pulumi.Input<string>;
    department?: pulumi.Input<string>;
    directoryId?: pulumi.Input<number>;
    distinguishedName?: pulumi.Input<string>;
    email?: pulumi.Input<string>;
    externalId?: pulumi.Input<string>;
    firstname?: pulumi.Input<string>;
    groupId?: pulumi.Input<number>;
    id: pulumi.Input<string>;
    invalidLoginAttempts?: pulumi.Input<number>;
    invitationSentAt?: pulumi.Input<string>;
    lastLogin?: pulumi.Input<string>;
    lastname?: pulumi.Input<string>;
    lockedUntil?: pulumi.Input<string>;
    managerAdId?: pulumi.Input<string>;
    managerUserId?: pulumi.Input<string>;
    memberOf?: pulumi.Input<string>;
    password?: pulumi.Input<string>;
    passwordAlgorithm?: pulumi.Input<string>;
    passwordChangedAt?: pulumi.Input<string>;
    passwordConfirmation?: pulumi.Input<string>;
    phone?: pulumi.Input<string>;
    preferredLocaleCode?: pulumi.Input<string>;
    roleIds?: pulumi.Input<pulumi.Input<number>[]>;
    salt?: pulumi.Input<string>;
    samaccountname?: pulumi.Input<string>;
    state?: pulumi.Input<number>;
    status?: pulumi.Input<number>;
    title?: pulumi.Input<string>;
    trustedIdpId?: pulumi.Input<number>;
    updatedAt?: pulumi.Input<string>;
    username?: pulumi.Input<string>;
    userprincipalname?: pulumi.Input<string>;
}
