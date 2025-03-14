// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

// Export members:
export { AppArgs, AppState } from "./app";
export type App = import("./app").App;
export const App: typeof import("./app").App = null as any;
utilities.lazyLoad(exports, ["App"], () => require("./app"));

export { AppRoleAttachmentsArgs, AppRoleAttachmentsState } from "./appRoleAttachments";
export type AppRoleAttachments = import("./appRoleAttachments").AppRoleAttachments;
export const AppRoleAttachments: typeof import("./appRoleAttachments").AppRoleAttachments = null as any;
utilities.lazyLoad(exports, ["AppRoleAttachments"], () => require("./appRoleAttachments"));

export { AppRulesArgs, AppRulesState } from "./appRules";
export type AppRules = import("./appRules").AppRules;
export const AppRules: typeof import("./appRules").AppRules = null as any;
utilities.lazyLoad(exports, ["AppRules"], () => require("./appRules"));

export { AuthServersArgs, AuthServersState } from "./authServers";
export type AuthServers = import("./authServers").AuthServers;
export const AuthServers: typeof import("./authServers").AuthServers = null as any;
utilities.lazyLoad(exports, ["AuthServers"], () => require("./authServers"));

export { GetUserArgs, GetUserResult, GetUserOutputArgs } from "./getUser";
export const getUser: typeof import("./getUser").getUser = null as any;
export const getUserOutput: typeof import("./getUser").getUserOutput = null as any;
utilities.lazyLoad(exports, ["getUser","getUserOutput"], () => require("./getUser"));

export { OidcAppsArgs, OidcAppsState } from "./oidcApps";
export type OidcApps = import("./oidcApps").OidcApps;
export const OidcApps: typeof import("./oidcApps").OidcApps = null as any;
utilities.lazyLoad(exports, ["OidcApps"], () => require("./oidcApps"));

export { PrivilegesArgs, PrivilegesState } from "./privileges";
export type Privileges = import("./privileges").Privileges;
export const Privileges: typeof import("./privileges").Privileges = null as any;
utilities.lazyLoad(exports, ["Privileges"], () => require("./privileges"));

export { ProviderArgs } from "./provider";
export type Provider = import("./provider").Provider;
export const Provider: typeof import("./provider").Provider = null as any;
utilities.lazyLoad(exports, ["Provider"], () => require("./provider"));

export { RoleArgs, RoleState } from "./role";
export type Role = import("./role").Role;
export const Role: typeof import("./role").Role = null as any;
utilities.lazyLoad(exports, ["Role"], () => require("./role"));

export { SamlAppsArgs, SamlAppsState } from "./samlApps";
export type SamlApps = import("./samlApps").SamlApps;
export const SamlApps: typeof import("./samlApps").SamlApps = null as any;
utilities.lazyLoad(exports, ["SamlApps"], () => require("./samlApps"));

export { SmartHookArgs, SmartHookState } from "./smartHook";
export type SmartHook = import("./smartHook").SmartHook;
export const SmartHook: typeof import("./smartHook").SmartHook = null as any;
utilities.lazyLoad(exports, ["SmartHook"], () => require("./smartHook"));

export { SmarthookEnvironmentVariablesArgs, SmarthookEnvironmentVariablesState } from "./smarthookEnvironmentVariables";
export type SmarthookEnvironmentVariables = import("./smarthookEnvironmentVariables").SmarthookEnvironmentVariables;
export const SmarthookEnvironmentVariables: typeof import("./smarthookEnvironmentVariables").SmarthookEnvironmentVariables = null as any;
utilities.lazyLoad(exports, ["SmarthookEnvironmentVariables"], () => require("./smarthookEnvironmentVariables"));

export { UserArgs, UserState } from "./user";
export type User = import("./user").User;
export const User: typeof import("./user").User = null as any;
utilities.lazyLoad(exports, ["User"], () => require("./user"));

export { UserMappingsArgs, UserMappingsState } from "./userMappings";
export type UserMappings = import("./userMappings").UserMappings;
export const UserMappings: typeof import("./userMappings").UserMappings = null as any;
utilities.lazyLoad(exports, ["UserMappings"], () => require("./userMappings"));


// Export sub-modules:
import * as config from "./config";
import * as types from "./types";
import * as users from "./users";

export {
    config,
    types,
    users,
};

const _module = {
    version: utilities.getVersion(),
    construct: (name: string, type: string, urn: string): pulumi.Resource => {
        switch (type) {
            case "onelogin:index/app:App":
                return new App(name, <any>undefined, { urn })
            case "onelogin:index/appRoleAttachments:AppRoleAttachments":
                return new AppRoleAttachments(name, <any>undefined, { urn })
            case "onelogin:index/appRules:AppRules":
                return new AppRules(name, <any>undefined, { urn })
            case "onelogin:index/authServers:AuthServers":
                return new AuthServers(name, <any>undefined, { urn })
            case "onelogin:index/oidcApps:OidcApps":
                return new OidcApps(name, <any>undefined, { urn })
            case "onelogin:index/privileges:Privileges":
                return new Privileges(name, <any>undefined, { urn })
            case "onelogin:index/role:Role":
                return new Role(name, <any>undefined, { urn })
            case "onelogin:index/samlApps:SamlApps":
                return new SamlApps(name, <any>undefined, { urn })
            case "onelogin:index/smartHook:SmartHook":
                return new SmartHook(name, <any>undefined, { urn })
            case "onelogin:index/smarthookEnvironmentVariables:SmarthookEnvironmentVariables":
                return new SmarthookEnvironmentVariables(name, <any>undefined, { urn })
            case "onelogin:index/user:User":
                return new User(name, <any>undefined, { urn })
            case "onelogin:index/userMappings:UserMappings":
                return new UserMappings(name, <any>undefined, { urn })
            default:
                throw new Error(`unknown resource type ${type}`);
        }
    },
};
pulumi.runtime.registerResourceModule("onelogin", "index/app", _module)
pulumi.runtime.registerResourceModule("onelogin", "index/appRoleAttachments", _module)
pulumi.runtime.registerResourceModule("onelogin", "index/appRules", _module)
pulumi.runtime.registerResourceModule("onelogin", "index/authServers", _module)
pulumi.runtime.registerResourceModule("onelogin", "index/oidcApps", _module)
pulumi.runtime.registerResourceModule("onelogin", "index/privileges", _module)
pulumi.runtime.registerResourceModule("onelogin", "index/role", _module)
pulumi.runtime.registerResourceModule("onelogin", "index/samlApps", _module)
pulumi.runtime.registerResourceModule("onelogin", "index/smartHook", _module)
pulumi.runtime.registerResourceModule("onelogin", "index/smarthookEnvironmentVariables", _module)
pulumi.runtime.registerResourceModule("onelogin", "index/user", _module)
pulumi.runtime.registerResourceModule("onelogin", "index/userMappings", _module)
pulumi.runtime.registerResourcePackage("onelogin", {
    version: utilities.getVersion(),
    constructProvider: (name: string, type: string, urn: string): pulumi.ProviderResource => {
        if (type !== "pulumi:providers:onelogin") {
            throw new Error(`unknown provider type ${type}`);
        }
        return new Provider(name, <any>undefined, { urn });
    },
});
