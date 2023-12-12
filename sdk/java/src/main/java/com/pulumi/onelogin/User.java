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
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

@ResourceType(type="onelogin:index/user:User")
public class User extends com.pulumi.resources.CustomResource {
    @Export(name="activatedAt", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> activatedAt;

    public Output<Optional<String>> activatedAt() {
        return Codegen.optional(this.activatedAt);
    }
    /**
     * Free text related to the user.
     * 
     */
    @Export(name="comment", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> comment;

    /**
     * @return Free text related to the user.
     * 
     */
    public Output<Optional<String>> comment() {
        return Codegen.optional(this.comment);
    }
    /**
     * The user&#39;s company.
     * 
     */
    @Export(name="company", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> company;

    /**
     * @return The user&#39;s company.
     * 
     */
    public Output<Optional<String>> company() {
        return Codegen.optional(this.company);
    }
    @Export(name="createdAt", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> createdAt;

    public Output<Optional<String>> createdAt() {
        return Codegen.optional(this.createdAt);
    }
    /**
     * The user&#39;s department.
     * 
     */
    @Export(name="department", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> department;

    /**
     * @return The user&#39;s department.
     * 
     */
    public Output<Optional<String>> department() {
        return Codegen.optional(this.department);
    }
    /**
     * The ID of the OneLogin Directory of the user.
     * 
     */
    @Export(name="directoryId", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> directoryId;

    /**
     * @return The ID of the OneLogin Directory of the user.
     * 
     */
    public Output<Optional<Integer>> directoryId() {
        return Codegen.optional(this.directoryId);
    }
    /**
     * The distinguished name of the user.
     * 
     */
    @Export(name="distinguishedName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> distinguishedName;

    /**
     * @return The distinguished name of the user.
     * 
     */
    public Output<Optional<String>> distinguishedName() {
        return Codegen.optional(this.distinguishedName);
    }
    /**
     * A valid email for the user.
     * 
     */
    @Export(name="email", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> email;

    /**
     * @return A valid email for the user.
     * 
     */
    public Output<Optional<String>> email() {
        return Codegen.optional(this.email);
    }
    /**
     * The ID of the user in an external directory.
     * 
     */
    @Export(name="externalId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> externalId;

    /**
     * @return The ID of the user in an external directory.
     * 
     */
    public Output<Optional<String>> externalId() {
        return Codegen.optional(this.externalId);
    }
    /**
     * The user&#39;s first name.
     * 
     */
    @Export(name="firstname", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> firstname;

    /**
     * @return The user&#39;s first name.
     * 
     */
    public Output<Optional<String>> firstname() {
        return Codegen.optional(this.firstname);
    }
    /**
     * The ID of the Group in OneLogin that the user is assigned to.
     * 
     */
    @Export(name="groupId", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> groupId;

    /**
     * @return The ID of the Group in OneLogin that the user is assigned to.
     * 
     */
    public Output<Optional<Integer>> groupId() {
        return Codegen.optional(this.groupId);
    }
    @Export(name="invalidLoginAttempts", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> invalidLoginAttempts;

    public Output<Optional<Integer>> invalidLoginAttempts() {
        return Codegen.optional(this.invalidLoginAttempts);
    }
    @Export(name="invitationSentAt", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> invitationSentAt;

    public Output<Optional<String>> invitationSentAt() {
        return Codegen.optional(this.invitationSentAt);
    }
    @Export(name="lastLogin", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> lastLogin;

    public Output<Optional<String>> lastLogin() {
        return Codegen.optional(this.lastLogin);
    }
    /**
     * The user&#39;s last name.
     * 
     */
    @Export(name="lastname", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> lastname;

    /**
     * @return The user&#39;s last name.
     * 
     */
    public Output<Optional<String>> lastname() {
        return Codegen.optional(this.lastname);
    }
    @Export(name="lockedUntil", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> lockedUntil;

    public Output<Optional<String>> lockedUntil() {
        return Codegen.optional(this.lockedUntil);
    }
    /**
     * The ID of the user&#39;s manager in Active Directory.
     * 
     */
    @Export(name="managerAdId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> managerAdId;

    /**
     * @return The ID of the user&#39;s manager in Active Directory.
     * 
     */
    public Output<Optional<String>> managerAdId() {
        return Codegen.optional(this.managerAdId);
    }
    /**
     * The OneLogin User ID for the user&#39;s manager.
     * 
     */
    @Export(name="managerUserId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> managerUserId;

    /**
     * @return The OneLogin User ID for the user&#39;s manager.
     * 
     */
    public Output<Optional<String>> managerUserId() {
        return Codegen.optional(this.managerUserId);
    }
    /**
     * The user&#39;s directory membership.
     * 
     */
    @Export(name="memberOf", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> memberOf;

    /**
     * @return The user&#39;s directory membership.
     * 
     */
    public Output<Optional<String>> memberOf() {
        return Codegen.optional(this.memberOf);
    }
    /**
     * The password to set for a user.
     * 
     */
    @Export(name="password", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> password;

    /**
     * @return The password to set for a user.
     * 
     */
    public Output<Optional<String>> password() {
        return Codegen.optional(this.password);
    }
    /**
     * Use this when importing a password that&#39;s already hashed. Prepend the salt value to the cleartext password value before
     * SHA-256-encoding it
     * 
     */
    @Export(name="passwordAlgorithm", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> passwordAlgorithm;

    /**
     * @return Use this when importing a password that&#39;s already hashed. Prepend the salt value to the cleartext password value before
     * SHA-256-encoding it
     * 
     */
    public Output<Optional<String>> passwordAlgorithm() {
        return Codegen.optional(this.passwordAlgorithm);
    }
    @Export(name="passwordChangedAt", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> passwordChangedAt;

    public Output<Optional<String>> passwordChangedAt() {
        return Codegen.optional(this.passwordChangedAt);
    }
    /**
     * Required if the password is being set.
     * 
     */
    @Export(name="passwordConfirmation", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> passwordConfirmation;

    /**
     * @return Required if the password is being set.
     * 
     */
    public Output<Optional<String>> passwordConfirmation() {
        return Codegen.optional(this.passwordConfirmation);
    }
    /**
     * The E.164 format phone number for a user.
     * 
     */
    @Export(name="phone", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> phone;

    /**
     * @return The E.164 format phone number for a user.
     * 
     */
    public Output<Optional<String>> phone() {
        return Codegen.optional(this.phone);
    }
    @Export(name="preferredLocaleCode", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> preferredLocaleCode;

    public Output<Optional<String>> preferredLocaleCode() {
        return Codegen.optional(this.preferredLocaleCode);
    }
    /**
     * A list of OneLogin Role IDs of the user
     * 
     */
    @Export(name="roleIds", refs={List.class,Integer.class}, tree="[0,1]")
    private Output</* @Nullable */ List<Integer>> roleIds;

    /**
     * @return A list of OneLogin Role IDs of the user
     * 
     */
    public Output<Optional<List<Integer>>> roleIds() {
        return Codegen.optional(this.roleIds);
    }
    /**
     * The salt value used with the password_algorithm.
     * 
     */
    @Export(name="salt", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> salt;

    /**
     * @return The salt value used with the password_algorithm.
     * 
     */
    public Output<Optional<String>> salt() {
        return Codegen.optional(this.salt);
    }
    /**
     * The user&#39;s Active Directory username.
     * 
     */
    @Export(name="samaccountname", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> samaccountname;

    /**
     * @return The user&#39;s Active Directory username.
     * 
     */
    public Output<Optional<String>> samaccountname() {
        return Codegen.optional(this.samaccountname);
    }
    @Export(name="state", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> state;

    public Output<Optional<Integer>> state() {
        return Codegen.optional(this.state);
    }
    @Export(name="status", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> status;

    public Output<Optional<Integer>> status() {
        return Codegen.optional(this.status);
    }
    /**
     * The user&#39;s job title.
     * 
     */
    @Export(name="title", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> title;

    /**
     * @return The user&#39;s job title.
     * 
     */
    public Output<Optional<String>> title() {
        return Codegen.optional(this.title);
    }
    /**
     * The ID of the OneLogin Trusted IDP of the user.
     * 
     */
    @Export(name="trustedIdpId", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> trustedIdpId;

    /**
     * @return The ID of the OneLogin Trusted IDP of the user.
     * 
     */
    public Output<Optional<Integer>> trustedIdpId() {
        return Codegen.optional(this.trustedIdpId);
    }
    @Export(name="updatedAt", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> updatedAt;

    public Output<Optional<String>> updatedAt() {
        return Codegen.optional(this.updatedAt);
    }
    /**
     * A username for the user.
     * 
     */
    @Export(name="username", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> username;

    /**
     * @return A username for the user.
     * 
     */
    public Output<Optional<String>> username() {
        return Codegen.optional(this.username);
    }
    /**
     * The principle name of the user.
     * 
     */
    @Export(name="userprincipalname", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> userprincipalname;

    /**
     * @return The principle name of the user.
     * 
     */
    public Output<Optional<String>> userprincipalname() {
        return Codegen.optional(this.userprincipalname);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public User(String name) {
        this(name, UserArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public User(String name, @Nullable UserArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public User(String name, @Nullable UserArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("onelogin:index/user:User", name, args == null ? UserArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private User(String name, Output<String> id, @Nullable UserState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("onelogin:index/user:User", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
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
    public static User get(String name, Output<String> id, @Nullable UserState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new User(name, id, state, options);
    }
}
