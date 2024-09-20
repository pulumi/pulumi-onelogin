// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

export function getConditions(args: GetConditionsArgs, opts?: pulumi.InvokeOptions): Promise<GetConditionsResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("onelogin:apps/getConditions:getConditions", {
        "appsId": args.appsId,
        "filters": args.filters,
        "name": args.name,
        "value": args.value,
    }, opts);
}

/**
 * A collection of arguments for invoking getConditions.
 */
export interface GetConditionsArgs {
    appsId: string;
    filters?: inputs.apps.GetConditionsFilter[];
    name?: string;
    value?: string;
}

/**
 * A collection of values returned by getConditions.
 */
export interface GetConditionsResult {
    readonly appsId: string;
    readonly filters?: outputs.apps.GetConditionsFilter[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly name: string;
    readonly value: string;
}
export function getConditionsOutput(args: GetConditionsOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetConditionsResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("onelogin:apps/getConditions:getConditions", {
        "appsId": args.appsId,
        "filters": args.filters,
        "name": args.name,
        "value": args.value,
    }, opts);
}

/**
 * A collection of arguments for invoking getConditions.
 */
export interface GetConditionsOutputArgs {
    appsId: pulumi.Input<string>;
    filters?: pulumi.Input<pulumi.Input<inputs.apps.GetConditionsFilterArgs>[]>;
    name?: pulumi.Input<string>;
    value?: pulumi.Input<string>;
}
