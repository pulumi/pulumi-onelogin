// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

export function getMappings(args?: GetMappingsArgs, opts?: pulumi.InvokeOptions): Promise<GetMappingsResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("onelogin:index/getMappings:getMappings", {
        "actions": args.actions,
        "conditions": args.conditions,
        "enabled": args.enabled,
        "filters": args.filters,
        "match": args.match,
        "name": args.name,
        "position": args.position,
    }, opts);
}

/**
 * A collection of arguments for invoking getMappings.
 */
export interface GetMappingsArgs {
    actions?: inputs.GetMappingsAction[];
    conditions?: inputs.GetMappingsCondition[];
    enabled?: boolean;
    filters?: inputs.GetMappingsFilter[];
    match?: string;
    name?: string;
    position?: number;
}

/**
 * A collection of values returned by getMappings.
 */
export interface GetMappingsResult {
    readonly actions: outputs.GetMappingsAction[];
    readonly conditions: outputs.GetMappingsCondition[];
    readonly enabled: boolean;
    readonly filters?: outputs.GetMappingsFilter[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly match: string;
    readonly name: string;
    readonly position: number;
}
export function getMappingsOutput(args?: GetMappingsOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetMappingsResult> {
    return pulumi.output(args).apply((a: any) => getMappings(a, opts))
}

/**
 * A collection of arguments for invoking getMappings.
 */
export interface GetMappingsOutputArgs {
    actions?: pulumi.Input<pulumi.Input<inputs.GetMappingsActionArgs>[]>;
    conditions?: pulumi.Input<pulumi.Input<inputs.GetMappingsConditionArgs>[]>;
    enabled?: pulumi.Input<boolean>;
    filters?: pulumi.Input<pulumi.Input<inputs.GetMappingsFilterArgs>[]>;
    match?: pulumi.Input<string>;
    name?: pulumi.Input<string>;
    position?: pulumi.Input<number>;
}
