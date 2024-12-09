// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

export function getAuthServersScopes(args: GetAuthServersScopesArgs, opts?: pulumi.InvokeOptions): Promise<GetAuthServersScopesResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("onelogin:index/getAuthServersScopes:getAuthServersScopes", {
        "authServersId": args.authServersId,
        "description": args.description,
        "filters": args.filters,
        "value": args.value,
    }, opts);
}

/**
 * A collection of arguments for invoking getAuthServersScopes.
 */
export interface GetAuthServersScopesArgs {
    authServersId: string;
    description?: string;
    filters?: inputs.GetAuthServersScopesFilter[];
    value?: string;
}

/**
 * A collection of values returned by getAuthServersScopes.
 */
export interface GetAuthServersScopesResult {
    readonly authServersId: string;
    readonly description: string;
    readonly filters?: outputs.GetAuthServersScopesFilter[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly value: string;
}
export function getAuthServersScopesOutput(args: GetAuthServersScopesOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetAuthServersScopesResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("onelogin:index/getAuthServersScopes:getAuthServersScopes", {
        "authServersId": args.authServersId,
        "description": args.description,
        "filters": args.filters,
        "value": args.value,
    }, opts);
}

/**
 * A collection of arguments for invoking getAuthServersScopes.
 */
export interface GetAuthServersScopesOutputArgs {
    authServersId: pulumi.Input<string>;
    description?: pulumi.Input<string>;
    filters?: pulumi.Input<pulumi.Input<inputs.GetAuthServersScopesFilterArgs>[]>;
    value?: pulumi.Input<string>;
}
