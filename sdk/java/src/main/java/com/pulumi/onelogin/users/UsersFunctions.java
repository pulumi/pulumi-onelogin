// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.onelogin.users;

import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.deployment.InvokeOutputOptions;
import com.pulumi.onelogin.Utilities;
import com.pulumi.onelogin.users.inputs.GetAppsArgs;
import com.pulumi.onelogin.users.inputs.GetAppsPlainArgs;
import com.pulumi.onelogin.users.inputs.GetDevicesArgs;
import com.pulumi.onelogin.users.inputs.GetDevicesPlainArgs;
import com.pulumi.onelogin.users.inputs.GetInstanceArgs;
import com.pulumi.onelogin.users.inputs.GetInstancePlainArgs;
import com.pulumi.onelogin.users.inputs.GetUsersArgs;
import com.pulumi.onelogin.users.inputs.GetUsersPlainArgs;
import com.pulumi.onelogin.users.inputs.GetV1AppsArgs;
import com.pulumi.onelogin.users.inputs.GetV1AppsPlainArgs;
import com.pulumi.onelogin.users.inputs.GetV1Args;
import com.pulumi.onelogin.users.inputs.GetV1InstanceArgs;
import com.pulumi.onelogin.users.inputs.GetV1InstancePlainArgs;
import com.pulumi.onelogin.users.inputs.GetV1PlainArgs;
import com.pulumi.onelogin.users.outputs.GetAppsResult;
import com.pulumi.onelogin.users.outputs.GetDevicesResult;
import com.pulumi.onelogin.users.outputs.GetInstanceResult;
import com.pulumi.onelogin.users.outputs.GetUsersResult;
import com.pulumi.onelogin.users.outputs.GetV1AppsResult;
import com.pulumi.onelogin.users.outputs.GetV1InstanceResult;
import com.pulumi.onelogin.users.outputs.GetV1Result;
import java.util.concurrent.CompletableFuture;

public final class UsersFunctions {
    public static Output<GetAppsResult> getApps(GetAppsArgs args) {
        return getApps(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetAppsResult> getAppsPlain(GetAppsPlainArgs args) {
        return getAppsPlain(args, InvokeOptions.Empty);
    }
    public static Output<GetAppsResult> getApps(GetAppsArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("onelogin:users/getApps:getApps", TypeShape.of(GetAppsResult.class), args, Utilities.withVersion(options));
    }
    public static Output<GetAppsResult> getApps(GetAppsArgs args, InvokeOutputOptions options) {
        return Deployment.getInstance().invoke("onelogin:users/getApps:getApps", TypeShape.of(GetAppsResult.class), args, Utilities.withVersion(options));
    }
    public static CompletableFuture<GetAppsResult> getAppsPlain(GetAppsPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("onelogin:users/getApps:getApps", TypeShape.of(GetAppsResult.class), args, Utilities.withVersion(options));
    }
    public static Output<GetDevicesResult> getDevices(GetDevicesArgs args) {
        return getDevices(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetDevicesResult> getDevicesPlain(GetDevicesPlainArgs args) {
        return getDevicesPlain(args, InvokeOptions.Empty);
    }
    public static Output<GetDevicesResult> getDevices(GetDevicesArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("onelogin:users/getDevices:getDevices", TypeShape.of(GetDevicesResult.class), args, Utilities.withVersion(options));
    }
    public static Output<GetDevicesResult> getDevices(GetDevicesArgs args, InvokeOutputOptions options) {
        return Deployment.getInstance().invoke("onelogin:users/getDevices:getDevices", TypeShape.of(GetDevicesResult.class), args, Utilities.withVersion(options));
    }
    public static CompletableFuture<GetDevicesResult> getDevicesPlain(GetDevicesPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("onelogin:users/getDevices:getDevices", TypeShape.of(GetDevicesResult.class), args, Utilities.withVersion(options));
    }
    public static Output<GetInstanceResult> getInstance(GetInstanceArgs args) {
        return getInstance(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetInstanceResult> getInstancePlain(GetInstancePlainArgs args) {
        return getInstancePlain(args, InvokeOptions.Empty);
    }
    public static Output<GetInstanceResult> getInstance(GetInstanceArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("onelogin:users/getInstance:getInstance", TypeShape.of(GetInstanceResult.class), args, Utilities.withVersion(options));
    }
    public static Output<GetInstanceResult> getInstance(GetInstanceArgs args, InvokeOutputOptions options) {
        return Deployment.getInstance().invoke("onelogin:users/getInstance:getInstance", TypeShape.of(GetInstanceResult.class), args, Utilities.withVersion(options));
    }
    public static CompletableFuture<GetInstanceResult> getInstancePlain(GetInstancePlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("onelogin:users/getInstance:getInstance", TypeShape.of(GetInstanceResult.class), args, Utilities.withVersion(options));
    }
    public static Output<GetUsersResult> getUsers() {
        return getUsers(GetUsersArgs.Empty, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetUsersResult> getUsersPlain() {
        return getUsersPlain(GetUsersPlainArgs.Empty, InvokeOptions.Empty);
    }
    public static Output<GetUsersResult> getUsers(GetUsersArgs args) {
        return getUsers(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetUsersResult> getUsersPlain(GetUsersPlainArgs args) {
        return getUsersPlain(args, InvokeOptions.Empty);
    }
    public static Output<GetUsersResult> getUsers(GetUsersArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("onelogin:users/getUsers:getUsers", TypeShape.of(GetUsersResult.class), args, Utilities.withVersion(options));
    }
    public static Output<GetUsersResult> getUsers(GetUsersArgs args, InvokeOutputOptions options) {
        return Deployment.getInstance().invoke("onelogin:users/getUsers:getUsers", TypeShape.of(GetUsersResult.class), args, Utilities.withVersion(options));
    }
    public static CompletableFuture<GetUsersResult> getUsersPlain(GetUsersPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("onelogin:users/getUsers:getUsers", TypeShape.of(GetUsersResult.class), args, Utilities.withVersion(options));
    }
    public static Output<GetV1Result> getV1() {
        return getV1(GetV1Args.Empty, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetV1Result> getV1Plain() {
        return getV1Plain(GetV1PlainArgs.Empty, InvokeOptions.Empty);
    }
    public static Output<GetV1Result> getV1(GetV1Args args) {
        return getV1(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetV1Result> getV1Plain(GetV1PlainArgs args) {
        return getV1Plain(args, InvokeOptions.Empty);
    }
    public static Output<GetV1Result> getV1(GetV1Args args, InvokeOptions options) {
        return Deployment.getInstance().invoke("onelogin:users/getV1:getV1", TypeShape.of(GetV1Result.class), args, Utilities.withVersion(options));
    }
    public static Output<GetV1Result> getV1(GetV1Args args, InvokeOutputOptions options) {
        return Deployment.getInstance().invoke("onelogin:users/getV1:getV1", TypeShape.of(GetV1Result.class), args, Utilities.withVersion(options));
    }
    public static CompletableFuture<GetV1Result> getV1Plain(GetV1PlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("onelogin:users/getV1:getV1", TypeShape.of(GetV1Result.class), args, Utilities.withVersion(options));
    }
    public static Output<GetV1AppsResult> getV1Apps(GetV1AppsArgs args) {
        return getV1Apps(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetV1AppsResult> getV1AppsPlain(GetV1AppsPlainArgs args) {
        return getV1AppsPlain(args, InvokeOptions.Empty);
    }
    public static Output<GetV1AppsResult> getV1Apps(GetV1AppsArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("onelogin:users/getV1Apps:getV1Apps", TypeShape.of(GetV1AppsResult.class), args, Utilities.withVersion(options));
    }
    public static Output<GetV1AppsResult> getV1Apps(GetV1AppsArgs args, InvokeOutputOptions options) {
        return Deployment.getInstance().invoke("onelogin:users/getV1Apps:getV1Apps", TypeShape.of(GetV1AppsResult.class), args, Utilities.withVersion(options));
    }
    public static CompletableFuture<GetV1AppsResult> getV1AppsPlain(GetV1AppsPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("onelogin:users/getV1Apps:getV1Apps", TypeShape.of(GetV1AppsResult.class), args, Utilities.withVersion(options));
    }
    public static Output<GetV1InstanceResult> getV1Instance(GetV1InstanceArgs args) {
        return getV1Instance(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetV1InstanceResult> getV1InstancePlain(GetV1InstancePlainArgs args) {
        return getV1InstancePlain(args, InvokeOptions.Empty);
    }
    public static Output<GetV1InstanceResult> getV1Instance(GetV1InstanceArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("onelogin:users/getV1Instance:getV1Instance", TypeShape.of(GetV1InstanceResult.class), args, Utilities.withVersion(options));
    }
    public static Output<GetV1InstanceResult> getV1Instance(GetV1InstanceArgs args, InvokeOutputOptions options) {
        return Deployment.getInstance().invoke("onelogin:users/getV1Instance:getV1Instance", TypeShape.of(GetV1InstanceResult.class), args, Utilities.withVersion(options));
    }
    public static CompletableFuture<GetV1InstanceResult> getV1InstancePlain(GetV1InstancePlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("onelogin:users/getV1Instance:getV1Instance", TypeShape.of(GetV1InstanceResult.class), args, Utilities.withVersion(options));
    }
}
