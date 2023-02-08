// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

export function getInstance(args: GetInstanceArgs, opts?: pulumi.InvokeOptions): Promise<GetInstanceResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("onelogin:rules/getInstance:getInstance", {
        "description": args.description,
        "filters": args.filters,
        "id": args.id,
        "name": args.name,
        "source": args.source,
        "target": args.target,
        "type": args.type,
    }, opts);
}

/**
 * A collection of arguments for invoking getInstance.
 */
export interface GetInstanceArgs {
    description?: string;
    filters?: string[];
    id: string;
    name?: string;
    source?: inputs.rules.GetInstanceSource;
    target?: string;
    type?: string;
}

/**
 * A collection of values returned by getInstance.
 */
export interface GetInstanceResult {
    readonly description: string;
    readonly filters: string[];
    readonly id: string;
    readonly name: string;
    readonly source: outputs.rules.GetInstanceSource;
    readonly target: string;
    readonly type: string;
}
export function getInstanceOutput(args: GetInstanceOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetInstanceResult> {
    return pulumi.output(args).apply((a: any) => getInstance(a, opts))
}

/**
 * A collection of arguments for invoking getInstance.
 */
export interface GetInstanceOutputArgs {
    description?: pulumi.Input<string>;
    filters?: pulumi.Input<pulumi.Input<string>[]>;
    id: pulumi.Input<string>;
    name?: pulumi.Input<string>;
    source?: pulumi.Input<inputs.rules.GetInstanceSourceArgs>;
    target?: pulumi.Input<string>;
    type?: pulumi.Input<string>;
}
