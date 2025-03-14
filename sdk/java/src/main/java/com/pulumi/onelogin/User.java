// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.onelogin;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.onelogin.UserArgs;
import com.pulumi.onelogin.Utilities;
import com.pulumi.onelogin.inputs.UserState;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

@ResourceType(type="onelogin:index/user:User")
public class User extends com.pulumi.resources.CustomResource {
    @Export(name="comment", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> comment;

    public Output<Optional<String>> comment() {
        return Codegen.optional(this.comment);
    }
    @Export(name="company", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> company;

    public Output<Optional<String>> company() {
        return Codegen.optional(this.company);
    }
    @Export(name="customAttributes", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> customAttributes;

    public Output<Optional<Map<String,String>>> customAttributes() {
        return Codegen.optional(this.customAttributes);
    }
    @Export(name="department", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> department;

    public Output<Optional<String>> department() {
        return Codegen.optional(this.department);
    }
    @Export(name="directoryId", refs={Integer.class}, tree="[0]")
    private Output<Integer> directoryId;

    public Output<Integer> directoryId() {
        return this.directoryId;
    }
    @Export(name="distinguishedName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> distinguishedName;

    public Output<Optional<String>> distinguishedName() {
        return Codegen.optional(this.distinguishedName);
    }
    @Export(name="email", refs={String.class}, tree="[0]")
    private Output<String> email;

    public Output<String> email() {
        return this.email;
    }
    @Export(name="externalId", refs={Integer.class}, tree="[0]")
    private Output<Integer> externalId;

    public Output<Integer> externalId() {
        return this.externalId;
    }
    @Export(name="firstname", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> firstname;

    public Output<Optional<String>> firstname() {
        return Codegen.optional(this.firstname);
    }
    @Export(name="groupId", refs={Integer.class}, tree="[0]")
    private Output<Integer> groupId;

    public Output<Integer> groupId() {
        return this.groupId;
    }
    @Export(name="lastname", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> lastname;

    public Output<Optional<String>> lastname() {
        return Codegen.optional(this.lastname);
    }
    @Export(name="managerAdId", refs={Integer.class}, tree="[0]")
    private Output<Integer> managerAdId;

    public Output<Integer> managerAdId() {
        return this.managerAdId;
    }
    @Export(name="managerUserId", refs={Integer.class}, tree="[0]")
    private Output<Integer> managerUserId;

    public Output<Integer> managerUserId() {
        return this.managerUserId;
    }
    @Export(name="memberOf", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> memberOf;

    public Output<Optional<String>> memberOf() {
        return Codegen.optional(this.memberOf);
    }
    @Export(name="phone", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> phone;

    public Output<Optional<String>> phone() {
        return Codegen.optional(this.phone);
    }
    @Export(name="samaccountname", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> samaccountname;

    public Output<Optional<String>> samaccountname() {
        return Codegen.optional(this.samaccountname);
    }
    @Export(name="state", refs={Integer.class}, tree="[0]")
    private Output<Integer> state;

    public Output<Integer> state() {
        return this.state;
    }
    @Export(name="status", refs={Integer.class}, tree="[0]")
    private Output<Integer> status;

    public Output<Integer> status() {
        return this.status;
    }
    @Export(name="title", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> title;

    public Output<Optional<String>> title() {
        return Codegen.optional(this.title);
    }
    @Export(name="trustedIdpId", refs={Integer.class}, tree="[0]")
    private Output<Integer> trustedIdpId;

    public Output<Integer> trustedIdpId() {
        return this.trustedIdpId;
    }
    @Export(name="username", refs={String.class}, tree="[0]")
    private Output<String> username;

    public Output<String> username() {
        return this.username;
    }
    @Export(name="userprincipalname", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> userprincipalname;

    public Output<Optional<String>> userprincipalname() {
        return Codegen.optional(this.userprincipalname);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public User(java.lang.String name) {
        this(name, UserArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public User(java.lang.String name, UserArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public User(java.lang.String name, UserArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("onelogin:index/user:User", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private User(java.lang.String name, Output<java.lang.String> id, @Nullable UserState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("onelogin:index/user:User", name, state, makeResourceOptions(options, id), false);
    }

    private static UserArgs makeArgs(UserArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? UserArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static User get(java.lang.String name, Output<java.lang.String> id, @Nullable UserState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new User(name, id, state, options);
    }
}
