// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";

export interface AppParameters {
    attributesTransformations?: pulumi.Input<string>;
    defaultValues?: pulumi.Input<string>;
    includeInSamlAssertion?: pulumi.Input<boolean>;
    label?: pulumi.Input<string>;
    paramId?: pulumi.Input<number>;
    paramKeyName: pulumi.Input<string>;
    provisionedEntitlements?: pulumi.Input<boolean>;
    safeEntitlementsEnabled?: pulumi.Input<boolean>;
    skipIfBlank?: pulumi.Input<boolean>;
    userAttributeMacros?: pulumi.Input<string>;
    userAttributeMappings?: pulumi.Input<string>;
    values?: pulumi.Input<string>;
}

export interface AppRulesAction {
    action: pulumi.Input<string>;
    expression?: pulumi.Input<string>;
    values: pulumi.Input<pulumi.Input<string>[]>;
}

export interface AppRulesCondition {
    operator: pulumi.Input<string>;
    source: pulumi.Input<string>;
    value: pulumi.Input<string>;
}

export interface AuthServersConfiguration {
    accessTokenExpirationMinutes?: pulumi.Input<number>;
    audiences: pulumi.Input<pulumi.Input<string>[]>;
    refreshTokenExpirationMinutes?: pulumi.Input<number>;
    resourceIdentifier: pulumi.Input<string>;
}

export interface OidcAppsParameter {
    attributesTransformations?: pulumi.Input<string>;
    defaultValues?: pulumi.Input<string>;
    includeInSamlAssertion?: pulumi.Input<boolean>;
    label?: pulumi.Input<string>;
    paramId?: pulumi.Input<number>;
    paramKeyName: pulumi.Input<string>;
    provisionedEntitlements?: pulumi.Input<boolean>;
    safeEntitlementsEnabled?: pulumi.Input<boolean>;
    skipIfBlank?: pulumi.Input<boolean>;
    userAttributeMacros?: pulumi.Input<string>;
    userAttributeMappings?: pulumi.Input<string>;
    values?: pulumi.Input<string>;
}

export interface PrivilegesPrivilege {
    statements: pulumi.Input<pulumi.Input<inputs.PrivilegesPrivilegeStatement>[]>;
    version?: pulumi.Input<string>;
}

export interface PrivilegesPrivilegeStatement {
    actions: pulumi.Input<pulumi.Input<string>[]>;
    effect: pulumi.Input<string>;
    scopes: pulumi.Input<pulumi.Input<string>[]>;
}

export interface SamlAppsParameter {
    attributesTransformations?: pulumi.Input<string>;
    defaultValues?: pulumi.Input<string>;
    includeInSamlAssertion?: pulumi.Input<boolean>;
    label?: pulumi.Input<string>;
    paramId?: pulumi.Input<number>;
    paramKeyName: pulumi.Input<string>;
    provisionedEntitlements?: pulumi.Input<boolean>;
    safeEntitlementsEnabled?: pulumi.Input<boolean>;
    skipIfBlank?: pulumi.Input<boolean>;
    userAttributeMacros?: pulumi.Input<string>;
    userAttributeMappings?: pulumi.Input<string>;
    values?: pulumi.Input<string>;
}

export interface SmartHookCondition {
    operator: pulumi.Input<string>;
    source: pulumi.Input<string>;
    value: pulumi.Input<string>;
}

export interface SmartHookOption {
    locationEnabled?: pulumi.Input<boolean>;
    mfaDeviceInfoEnabled?: pulumi.Input<boolean>;
    riskEnabled?: pulumi.Input<boolean>;
}

export interface UserMappingsAction {
    action: pulumi.Input<string>;
    values: pulumi.Input<pulumi.Input<string>[]>;
}

export interface UserMappingsCondition {
    operator: pulumi.Input<string>;
    source: pulumi.Input<string>;
    value: pulumi.Input<string>;
}
export namespace users {
}
