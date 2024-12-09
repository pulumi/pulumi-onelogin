// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

export function getRiskRulesInstance(args: GetRiskRulesInstanceArgs, opts?: pulumi.InvokeOptions): Promise<GetRiskRulesInstanceResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("onelogin:index/getRiskRulesInstance:getRiskRulesInstance", {
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
 * A collection of arguments for invoking getRiskRulesInstance.
 */
export interface GetRiskRulesInstanceArgs {
    description?: string;
    filters?: string[];
    id: string;
    name?: string;
    source?: inputs.GetRiskRulesInstanceSource;
    target?: string;
    type?: string;
}

/**
 * A collection of values returned by getRiskRulesInstance.
 */
export interface GetRiskRulesInstanceResult {
    readonly description: string;
    readonly filters: string[];
    readonly id: string;
    readonly name: string;
    readonly source: outputs.GetRiskRulesInstanceSource;
    readonly target: string;
    readonly type: string;
}
export function getRiskRulesInstanceOutput(args: GetRiskRulesInstanceOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetRiskRulesInstanceResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("onelogin:index/getRiskRulesInstance:getRiskRulesInstance", {
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
 * A collection of arguments for invoking getRiskRulesInstance.
 */
export interface GetRiskRulesInstanceOutputArgs {
    description?: pulumi.Input<string>;
    filters?: pulumi.Input<pulumi.Input<string>[]>;
    id: pulumi.Input<string>;
    name?: pulumi.Input<string>;
    source?: pulumi.Input<inputs.GetRiskRulesInstanceSourceArgs>;
    target?: pulumi.Input<string>;
    type?: pulumi.Input<string>;
}
