// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

// Export members:
export { GetAppsArgs, GetAppsResult, GetAppsOutputArgs } from "./getApps";
export const getApps: typeof import("./getApps").getApps = null as any;
export const getAppsOutput: typeof import("./getApps").getAppsOutput = null as any;
utilities.lazyLoad(exports, ["getApps","getAppsOutput"], () => require("./getApps"));

export { GetDevicesArgs, GetDevicesResult, GetDevicesOutputArgs } from "./getDevices";
export const getDevices: typeof import("./getDevices").getDevices = null as any;
export const getDevicesOutput: typeof import("./getDevices").getDevicesOutput = null as any;
utilities.lazyLoad(exports, ["getDevices","getDevicesOutput"], () => require("./getDevices"));

export { GetInstanceArgs, GetInstanceResult, GetInstanceOutputArgs } from "./getInstance";
export const getInstance: typeof import("./getInstance").getInstance = null as any;
export const getInstanceOutput: typeof import("./getInstance").getInstanceOutput = null as any;
utilities.lazyLoad(exports, ["getInstance","getInstanceOutput"], () => require("./getInstance"));

export { GetUsersArgs, GetUsersResult, GetUsersOutputArgs } from "./getUsers";
export const getUsers: typeof import("./getUsers").getUsers = null as any;
export const getUsersOutput: typeof import("./getUsers").getUsersOutput = null as any;
utilities.lazyLoad(exports, ["getUsers","getUsersOutput"], () => require("./getUsers"));

export { GetV1Args, GetV1Result, GetV1OutputArgs } from "./getV1";
export const getV1: typeof import("./getV1").getV1 = null as any;
export const getV1Output: typeof import("./getV1").getV1Output = null as any;
utilities.lazyLoad(exports, ["getV1","getV1Output"], () => require("./getV1"));

export { GetV1AppsArgs, GetV1AppsResult, GetV1AppsOutputArgs } from "./getV1Apps";
export const getV1Apps: typeof import("./getV1Apps").getV1Apps = null as any;
export const getV1AppsOutput: typeof import("./getV1Apps").getV1AppsOutput = null as any;
utilities.lazyLoad(exports, ["getV1Apps","getV1AppsOutput"], () => require("./getV1Apps"));

export { GetV1InstanceArgs, GetV1InstanceResult, GetV1InstanceOutputArgs } from "./getV1Instance";
export const getV1Instance: typeof import("./getV1Instance").getV1Instance = null as any;
export const getV1InstanceOutput: typeof import("./getV1Instance").getV1InstanceOutput = null as any;
utilities.lazyLoad(exports, ["getV1Instance","getV1InstanceOutput"], () => require("./getV1Instance"));

export { V1Args, V1State } from "./v1";
export type V1 = import("./v1").V1;
export const V1: typeof import("./v1").V1 = null as any;
utilities.lazyLoad(exports, ["V1"], () => require("./v1"));


const _module = {
    version: utilities.getVersion(),
    construct: (name: string, type: string, urn: string): pulumi.Resource => {
        switch (type) {
            case "onelogin:users/v1:V1":
                return new V1(name, <any>undefined, { urn })
            default:
                throw new Error(`unknown resource type ${type}`);
        }
    },
};
pulumi.runtime.registerResourceModule("onelogin", "users/v1", _module)
