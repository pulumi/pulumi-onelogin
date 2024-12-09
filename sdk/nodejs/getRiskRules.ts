// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

export function getRiskRules(args?: GetRiskRulesArgs, opts?: pulumi.InvokeOptions): Promise<GetRiskRulesResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("onelogin:index/getRiskRules:getRiskRules", {
        "description": args.description,
        "filter": args.filter,
        "filters": args.filters,
        "name": args.name,
        "source": args.source,
        "target": args.target,
        "type": args.type,
    }, opts);
}

/**
 * A collection of arguments for invoking getRiskRules.
 */
export interface GetRiskRulesArgs {
    description?: string;
    filter?: inputs.GetRiskRulesFilter[];
    filters?: string[];
    name?: string;
    source?: inputs.GetRiskRulesSource;
    target?: string;
    type?: string;
}

/**
 * A collection of values returned by getRiskRules.
 */
export interface GetRiskRulesResult {
    readonly description: string;
    readonly filter?: outputs.GetRiskRulesFilter[];
    readonly filters: string[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly name: string;
    readonly source: outputs.GetRiskRulesSource;
    readonly target: string;
    readonly type: string;
}
export function getRiskRulesOutput(args?: GetRiskRulesOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetRiskRulesResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("onelogin:index/getRiskRules:getRiskRules", {
        "description": args.description,
        "filter": args.filter,
        "filters": args.filters,
        "name": args.name,
        "source": args.source,
        "target": args.target,
        "type": args.type,
    }, opts);
}

/**
 * A collection of arguments for invoking getRiskRules.
 */
export interface GetRiskRulesOutputArgs {
    description?: pulumi.Input<string>;
    filter?: pulumi.Input<pulumi.Input<inputs.GetRiskRulesFilterArgs>[]>;
    filters?: pulumi.Input<pulumi.Input<string>[]>;
    name?: pulumi.Input<string>;
    source?: pulumi.Input<inputs.GetRiskRulesSourceArgs>;
    target?: pulumi.Input<string>;
    type?: pulumi.Input<string>;
}
