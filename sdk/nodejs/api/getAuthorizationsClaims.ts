// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

export function getAuthorizationsClaims(args: GetAuthorizationsClaimsArgs, opts?: pulumi.InvokeOptions): Promise<GetAuthorizationsClaimsResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("onelogin:api/getAuthorizationsClaims:getAuthorizationsClaims", {
        "apiAuthorizationsId": args.apiAuthorizationsId,
        "attributeTransformations": args.attributeTransformations,
        "defaultValues": args.defaultValues,
        "filters": args.filters,
        "label": args.label,
        "provisionedEntitlements": args.provisionedEntitlements,
        "skipIfBlank": args.skipIfBlank,
        "userAttributeMacros": args.userAttributeMacros,
        "userAttributeMappings": args.userAttributeMappings,
        "values": args.values,
    }, opts);
}

/**
 * A collection of arguments for invoking getAuthorizationsClaims.
 */
export interface GetAuthorizationsClaimsArgs {
    apiAuthorizationsId: string;
    attributeTransformations?: string;
    defaultValues?: string;
    filters?: inputs.api.GetAuthorizationsClaimsFilter[];
    label?: string;
    provisionedEntitlements?: boolean;
    skipIfBlank?: boolean;
    userAttributeMacros?: string;
    userAttributeMappings?: string;
    values?: string[];
}

/**
 * A collection of values returned by getAuthorizationsClaims.
 */
export interface GetAuthorizationsClaimsResult {
    readonly apiAuthorizationsId: string;
    readonly attributeTransformations: string;
    readonly defaultValues: string;
    readonly filters?: outputs.api.GetAuthorizationsClaimsFilter[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly label: string;
    readonly provisionedEntitlements: boolean;
    readonly skipIfBlank: boolean;
    readonly userAttributeMacros: string;
    readonly userAttributeMappings: string;
    readonly values: string[];
}
export function getAuthorizationsClaimsOutput(args: GetAuthorizationsClaimsOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetAuthorizationsClaimsResult> {
    return pulumi.output(args).apply((a: any) => getAuthorizationsClaims(a, opts))
}

/**
 * A collection of arguments for invoking getAuthorizationsClaims.
 */
export interface GetAuthorizationsClaimsOutputArgs {
    apiAuthorizationsId: pulumi.Input<string>;
    attributeTransformations?: pulumi.Input<string>;
    defaultValues?: pulumi.Input<string>;
    filters?: pulumi.Input<pulumi.Input<inputs.api.GetAuthorizationsClaimsFilterArgs>[]>;
    label?: pulumi.Input<string>;
    provisionedEntitlements?: pulumi.Input<boolean>;
    skipIfBlank?: pulumi.Input<boolean>;
    userAttributeMacros?: pulumi.Input<string>;
    userAttributeMappings?: pulumi.Input<string>;
    values?: pulumi.Input<pulumi.Input<string>[]>;
}
