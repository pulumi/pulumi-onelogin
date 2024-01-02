// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.onelogin.users.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetInstancePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetInstancePlainArgs Empty = new GetInstancePlainArgs();

    @Import(name="activatedAt")
    private @Nullable String activatedAt;

    public Optional<String> activatedAt() {
        return Optional.ofNullable(this.activatedAt);
    }

    @Import(name="comment")
    private @Nullable String comment;

    public Optional<String> comment() {
        return Optional.ofNullable(this.comment);
    }

    @Import(name="company")
    private @Nullable String company;

    public Optional<String> company() {
        return Optional.ofNullable(this.company);
    }

    @Import(name="createdAt")
    private @Nullable String createdAt;

    public Optional<String> createdAt() {
        return Optional.ofNullable(this.createdAt);
    }

    @Import(name="department")
    private @Nullable String department;

    public Optional<String> department() {
        return Optional.ofNullable(this.department);
    }

    @Import(name="directoryId")
    private @Nullable Integer directoryId;

    public Optional<Integer> directoryId() {
        return Optional.ofNullable(this.directoryId);
    }

    @Import(name="distinguishedName")
    private @Nullable String distinguishedName;

    public Optional<String> distinguishedName() {
        return Optional.ofNullable(this.distinguishedName);
    }

    @Import(name="email")
    private @Nullable String email;

    public Optional<String> email() {
        return Optional.ofNullable(this.email);
    }

    @Import(name="externalId")
    private @Nullable String externalId;

    public Optional<String> externalId() {
        return Optional.ofNullable(this.externalId);
    }

    @Import(name="firstname")
    private @Nullable String firstname;

    public Optional<String> firstname() {
        return Optional.ofNullable(this.firstname);
    }

    @Import(name="groupId")
    private @Nullable Integer groupId;

    public Optional<Integer> groupId() {
        return Optional.ofNullable(this.groupId);
    }

    @Import(name="id", required=true)
    private String id;

    public String id() {
        return this.id;
    }

    @Import(name="invalidLoginAttempts")
    private @Nullable Integer invalidLoginAttempts;

    public Optional<Integer> invalidLoginAttempts() {
        return Optional.ofNullable(this.invalidLoginAttempts);
    }

    @Import(name="invitationSentAt")
    private @Nullable String invitationSentAt;

    public Optional<String> invitationSentAt() {
        return Optional.ofNullable(this.invitationSentAt);
    }

    @Import(name="lastLogin")
    private @Nullable String lastLogin;

    public Optional<String> lastLogin() {
        return Optional.ofNullable(this.lastLogin);
    }

    @Import(name="lastname")
    private @Nullable String lastname;

    public Optional<String> lastname() {
        return Optional.ofNullable(this.lastname);
    }

    @Import(name="lockedUntil")
    private @Nullable String lockedUntil;

    public Optional<String> lockedUntil() {
        return Optional.ofNullable(this.lockedUntil);
    }

    @Import(name="managerAdId")
    private @Nullable String managerAdId;

    public Optional<String> managerAdId() {
        return Optional.ofNullable(this.managerAdId);
    }

    @Import(name="managerUserId")
    private @Nullable String managerUserId;

    public Optional<String> managerUserId() {
        return Optional.ofNullable(this.managerUserId);
    }

    @Import(name="memberOf")
    private @Nullable String memberOf;

    public Optional<String> memberOf() {
        return Optional.ofNullable(this.memberOf);
    }

    @Import(name="password")
    private @Nullable String password;

    public Optional<String> password() {
        return Optional.ofNullable(this.password);
    }

    @Import(name="passwordAlgorithm")
    private @Nullable String passwordAlgorithm;

    public Optional<String> passwordAlgorithm() {
        return Optional.ofNullable(this.passwordAlgorithm);
    }

    @Import(name="passwordChangedAt")
    private @Nullable String passwordChangedAt;

    public Optional<String> passwordChangedAt() {
        return Optional.ofNullable(this.passwordChangedAt);
    }

    @Import(name="passwordConfirmation")
    private @Nullable String passwordConfirmation;

    public Optional<String> passwordConfirmation() {
        return Optional.ofNullable(this.passwordConfirmation);
    }

    @Import(name="phone")
    private @Nullable String phone;

    public Optional<String> phone() {
        return Optional.ofNullable(this.phone);
    }

    @Import(name="preferredLocaleCode")
    private @Nullable String preferredLocaleCode;

    public Optional<String> preferredLocaleCode() {
        return Optional.ofNullable(this.preferredLocaleCode);
    }

    @Import(name="roleIds")
    private @Nullable List<Integer> roleIds;

    public Optional<List<Integer>> roleIds() {
        return Optional.ofNullable(this.roleIds);
    }

    @Import(name="salt")
    private @Nullable String salt;

    public Optional<String> salt() {
        return Optional.ofNullable(this.salt);
    }

    @Import(name="samaccountname")
    private @Nullable String samaccountname;

    public Optional<String> samaccountname() {
        return Optional.ofNullable(this.samaccountname);
    }

    @Import(name="state")
    private @Nullable Integer state;

    public Optional<Integer> state() {
        return Optional.ofNullable(this.state);
    }

    @Import(name="status")
    private @Nullable Integer status;

    public Optional<Integer> status() {
        return Optional.ofNullable(this.status);
    }

    @Import(name="title")
    private @Nullable String title;

    public Optional<String> title() {
        return Optional.ofNullable(this.title);
    }

    @Import(name="trustedIdpId")
    private @Nullable Integer trustedIdpId;

    public Optional<Integer> trustedIdpId() {
        return Optional.ofNullable(this.trustedIdpId);
    }

    @Import(name="updatedAt")
    private @Nullable String updatedAt;

    public Optional<String> updatedAt() {
        return Optional.ofNullable(this.updatedAt);
    }

    @Import(name="username")
    private @Nullable String username;

    public Optional<String> username() {
        return Optional.ofNullable(this.username);
    }

    @Import(name="userprincipalname")
    private @Nullable String userprincipalname;

    public Optional<String> userprincipalname() {
        return Optional.ofNullable(this.userprincipalname);
    }

    private GetInstancePlainArgs() {}

    private GetInstancePlainArgs(GetInstancePlainArgs $) {
        this.activatedAt = $.activatedAt;
        this.comment = $.comment;
        this.company = $.company;
        this.createdAt = $.createdAt;
        this.department = $.department;
        this.directoryId = $.directoryId;
        this.distinguishedName = $.distinguishedName;
        this.email = $.email;
        this.externalId = $.externalId;
        this.firstname = $.firstname;
        this.groupId = $.groupId;
        this.id = $.id;
        this.invalidLoginAttempts = $.invalidLoginAttempts;
        this.invitationSentAt = $.invitationSentAt;
        this.lastLogin = $.lastLogin;
        this.lastname = $.lastname;
        this.lockedUntil = $.lockedUntil;
        this.managerAdId = $.managerAdId;
        this.managerUserId = $.managerUserId;
        this.memberOf = $.memberOf;
        this.password = $.password;
        this.passwordAlgorithm = $.passwordAlgorithm;
        this.passwordChangedAt = $.passwordChangedAt;
        this.passwordConfirmation = $.passwordConfirmation;
        this.phone = $.phone;
        this.preferredLocaleCode = $.preferredLocaleCode;
        this.roleIds = $.roleIds;
        this.salt = $.salt;
        this.samaccountname = $.samaccountname;
        this.state = $.state;
        this.status = $.status;
        this.title = $.title;
        this.trustedIdpId = $.trustedIdpId;
        this.updatedAt = $.updatedAt;
        this.username = $.username;
        this.userprincipalname = $.userprincipalname;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetInstancePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetInstancePlainArgs $;

        public Builder() {
            $ = new GetInstancePlainArgs();
        }

        public Builder(GetInstancePlainArgs defaults) {
            $ = new GetInstancePlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder activatedAt(@Nullable String activatedAt) {
            $.activatedAt = activatedAt;
            return this;
        }

        public Builder comment(@Nullable String comment) {
            $.comment = comment;
            return this;
        }

        public Builder company(@Nullable String company) {
            $.company = company;
            return this;
        }

        public Builder createdAt(@Nullable String createdAt) {
            $.createdAt = createdAt;
            return this;
        }

        public Builder department(@Nullable String department) {
            $.department = department;
            return this;
        }

        public Builder directoryId(@Nullable Integer directoryId) {
            $.directoryId = directoryId;
            return this;
        }

        public Builder distinguishedName(@Nullable String distinguishedName) {
            $.distinguishedName = distinguishedName;
            return this;
        }

        public Builder email(@Nullable String email) {
            $.email = email;
            return this;
        }

        public Builder externalId(@Nullable String externalId) {
            $.externalId = externalId;
            return this;
        }

        public Builder firstname(@Nullable String firstname) {
            $.firstname = firstname;
            return this;
        }

        public Builder groupId(@Nullable Integer groupId) {
            $.groupId = groupId;
            return this;
        }

        public Builder id(String id) {
            $.id = id;
            return this;
        }

        public Builder invalidLoginAttempts(@Nullable Integer invalidLoginAttempts) {
            $.invalidLoginAttempts = invalidLoginAttempts;
            return this;
        }

        public Builder invitationSentAt(@Nullable String invitationSentAt) {
            $.invitationSentAt = invitationSentAt;
            return this;
        }

        public Builder lastLogin(@Nullable String lastLogin) {
            $.lastLogin = lastLogin;
            return this;
        }

        public Builder lastname(@Nullable String lastname) {
            $.lastname = lastname;
            return this;
        }

        public Builder lockedUntil(@Nullable String lockedUntil) {
            $.lockedUntil = lockedUntil;
            return this;
        }

        public Builder managerAdId(@Nullable String managerAdId) {
            $.managerAdId = managerAdId;
            return this;
        }

        public Builder managerUserId(@Nullable String managerUserId) {
            $.managerUserId = managerUserId;
            return this;
        }

        public Builder memberOf(@Nullable String memberOf) {
            $.memberOf = memberOf;
            return this;
        }

        public Builder password(@Nullable String password) {
            $.password = password;
            return this;
        }

        public Builder passwordAlgorithm(@Nullable String passwordAlgorithm) {
            $.passwordAlgorithm = passwordAlgorithm;
            return this;
        }

        public Builder passwordChangedAt(@Nullable String passwordChangedAt) {
            $.passwordChangedAt = passwordChangedAt;
            return this;
        }

        public Builder passwordConfirmation(@Nullable String passwordConfirmation) {
            $.passwordConfirmation = passwordConfirmation;
            return this;
        }

        public Builder phone(@Nullable String phone) {
            $.phone = phone;
            return this;
        }

        public Builder preferredLocaleCode(@Nullable String preferredLocaleCode) {
            $.preferredLocaleCode = preferredLocaleCode;
            return this;
        }

        public Builder roleIds(@Nullable List<Integer> roleIds) {
            $.roleIds = roleIds;
            return this;
        }

        public Builder roleIds(Integer... roleIds) {
            return roleIds(List.of(roleIds));
        }

        public Builder salt(@Nullable String salt) {
            $.salt = salt;
            return this;
        }

        public Builder samaccountname(@Nullable String samaccountname) {
            $.samaccountname = samaccountname;
            return this;
        }

        public Builder state(@Nullable Integer state) {
            $.state = state;
            return this;
        }

        public Builder status(@Nullable Integer status) {
            $.status = status;
            return this;
        }

        public Builder title(@Nullable String title) {
            $.title = title;
            return this;
        }

        public Builder trustedIdpId(@Nullable Integer trustedIdpId) {
            $.trustedIdpId = trustedIdpId;
            return this;
        }

        public Builder updatedAt(@Nullable String updatedAt) {
            $.updatedAt = updatedAt;
            return this;
        }

        public Builder username(@Nullable String username) {
            $.username = username;
            return this;
        }

        public Builder userprincipalname(@Nullable String userprincipalname) {
            $.userprincipalname = userprincipalname;
            return this;
        }

        public GetInstancePlainArgs build() {
            if ($.id == null) {
                throw new MissingRequiredPropertyException("GetInstancePlainArgs", "id");
            }
            return $;
        }
    }

}
