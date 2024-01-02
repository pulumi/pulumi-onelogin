// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.onelogin.roles.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.onelogin.roles.inputs.GetAdminsFilterArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetAdminsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAdminsArgs Empty = new GetAdminsArgs();

    @Import(name="activatedAt")
    private @Nullable Output<String> activatedAt;

    public Optional<Output<String>> activatedAt() {
        return Optional.ofNullable(this.activatedAt);
    }

    @Import(name="comment")
    private @Nullable Output<String> comment;

    public Optional<Output<String>> comment() {
        return Optional.ofNullable(this.comment);
    }

    @Import(name="company")
    private @Nullable Output<String> company;

    public Optional<Output<String>> company() {
        return Optional.ofNullable(this.company);
    }

    @Import(name="createdAt")
    private @Nullable Output<String> createdAt;

    public Optional<Output<String>> createdAt() {
        return Optional.ofNullable(this.createdAt);
    }

    @Import(name="department")
    private @Nullable Output<String> department;

    public Optional<Output<String>> department() {
        return Optional.ofNullable(this.department);
    }

    @Import(name="directoryId")
    private @Nullable Output<Integer> directoryId;

    public Optional<Output<Integer>> directoryId() {
        return Optional.ofNullable(this.directoryId);
    }

    @Import(name="distinguishedName")
    private @Nullable Output<String> distinguishedName;

    public Optional<Output<String>> distinguishedName() {
        return Optional.ofNullable(this.distinguishedName);
    }

    @Import(name="email")
    private @Nullable Output<String> email;

    public Optional<Output<String>> email() {
        return Optional.ofNullable(this.email);
    }

    @Import(name="externalId")
    private @Nullable Output<String> externalId;

    public Optional<Output<String>> externalId() {
        return Optional.ofNullable(this.externalId);
    }

    @Import(name="filters")
    private @Nullable Output<List<GetAdminsFilterArgs>> filters;

    public Optional<Output<List<GetAdminsFilterArgs>>> filters() {
        return Optional.ofNullable(this.filters);
    }

    @Import(name="firstname")
    private @Nullable Output<String> firstname;

    public Optional<Output<String>> firstname() {
        return Optional.ofNullable(this.firstname);
    }

    @Import(name="groupId")
    private @Nullable Output<Integer> groupId;

    public Optional<Output<Integer>> groupId() {
        return Optional.ofNullable(this.groupId);
    }

    @Import(name="invalidLoginAttempts")
    private @Nullable Output<Integer> invalidLoginAttempts;

    public Optional<Output<Integer>> invalidLoginAttempts() {
        return Optional.ofNullable(this.invalidLoginAttempts);
    }

    @Import(name="invitationSentAt")
    private @Nullable Output<String> invitationSentAt;

    public Optional<Output<String>> invitationSentAt() {
        return Optional.ofNullable(this.invitationSentAt);
    }

    @Import(name="lastLogin")
    private @Nullable Output<String> lastLogin;

    public Optional<Output<String>> lastLogin() {
        return Optional.ofNullable(this.lastLogin);
    }

    @Import(name="lastname")
    private @Nullable Output<String> lastname;

    public Optional<Output<String>> lastname() {
        return Optional.ofNullable(this.lastname);
    }

    @Import(name="lockedUntil")
    private @Nullable Output<String> lockedUntil;

    public Optional<Output<String>> lockedUntil() {
        return Optional.ofNullable(this.lockedUntil);
    }

    @Import(name="managerAdId")
    private @Nullable Output<String> managerAdId;

    public Optional<Output<String>> managerAdId() {
        return Optional.ofNullable(this.managerAdId);
    }

    @Import(name="managerUserId")
    private @Nullable Output<String> managerUserId;

    public Optional<Output<String>> managerUserId() {
        return Optional.ofNullable(this.managerUserId);
    }

    @Import(name="memberOf")
    private @Nullable Output<String> memberOf;

    public Optional<Output<String>> memberOf() {
        return Optional.ofNullable(this.memberOf);
    }

    @Import(name="password")
    private @Nullable Output<String> password;

    public Optional<Output<String>> password() {
        return Optional.ofNullable(this.password);
    }

    @Import(name="passwordAlgorithm")
    private @Nullable Output<String> passwordAlgorithm;

    public Optional<Output<String>> passwordAlgorithm() {
        return Optional.ofNullable(this.passwordAlgorithm);
    }

    @Import(name="passwordChangedAt")
    private @Nullable Output<String> passwordChangedAt;

    public Optional<Output<String>> passwordChangedAt() {
        return Optional.ofNullable(this.passwordChangedAt);
    }

    @Import(name="passwordConfirmation")
    private @Nullable Output<String> passwordConfirmation;

    public Optional<Output<String>> passwordConfirmation() {
        return Optional.ofNullable(this.passwordConfirmation);
    }

    @Import(name="phone")
    private @Nullable Output<String> phone;

    public Optional<Output<String>> phone() {
        return Optional.ofNullable(this.phone);
    }

    @Import(name="preferredLocaleCode")
    private @Nullable Output<String> preferredLocaleCode;

    public Optional<Output<String>> preferredLocaleCode() {
        return Optional.ofNullable(this.preferredLocaleCode);
    }

    @Import(name="roleIds")
    private @Nullable Output<List<Integer>> roleIds;

    public Optional<Output<List<Integer>>> roleIds() {
        return Optional.ofNullable(this.roleIds);
    }

    @Import(name="rolesId", required=true)
    private Output<String> rolesId;

    public Output<String> rolesId() {
        return this.rolesId;
    }

    @Import(name="salt")
    private @Nullable Output<String> salt;

    public Optional<Output<String>> salt() {
        return Optional.ofNullable(this.salt);
    }

    @Import(name="samaccountname")
    private @Nullable Output<String> samaccountname;

    public Optional<Output<String>> samaccountname() {
        return Optional.ofNullable(this.samaccountname);
    }

    @Import(name="state")
    private @Nullable Output<Integer> state;

    public Optional<Output<Integer>> state() {
        return Optional.ofNullable(this.state);
    }

    @Import(name="status")
    private @Nullable Output<Integer> status;

    public Optional<Output<Integer>> status() {
        return Optional.ofNullable(this.status);
    }

    @Import(name="title")
    private @Nullable Output<String> title;

    public Optional<Output<String>> title() {
        return Optional.ofNullable(this.title);
    }

    @Import(name="trustedIdpId")
    private @Nullable Output<Integer> trustedIdpId;

    public Optional<Output<Integer>> trustedIdpId() {
        return Optional.ofNullable(this.trustedIdpId);
    }

    @Import(name="updatedAt")
    private @Nullable Output<String> updatedAt;

    public Optional<Output<String>> updatedAt() {
        return Optional.ofNullable(this.updatedAt);
    }

    @Import(name="username")
    private @Nullable Output<String> username;

    public Optional<Output<String>> username() {
        return Optional.ofNullable(this.username);
    }

    @Import(name="userprincipalname")
    private @Nullable Output<String> userprincipalname;

    public Optional<Output<String>> userprincipalname() {
        return Optional.ofNullable(this.userprincipalname);
    }

    private GetAdminsArgs() {}

    private GetAdminsArgs(GetAdminsArgs $) {
        this.activatedAt = $.activatedAt;
        this.comment = $.comment;
        this.company = $.company;
        this.createdAt = $.createdAt;
        this.department = $.department;
        this.directoryId = $.directoryId;
        this.distinguishedName = $.distinguishedName;
        this.email = $.email;
        this.externalId = $.externalId;
        this.filters = $.filters;
        this.firstname = $.firstname;
        this.groupId = $.groupId;
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
        this.rolesId = $.rolesId;
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
    public static Builder builder(GetAdminsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAdminsArgs $;

        public Builder() {
            $ = new GetAdminsArgs();
        }

        public Builder(GetAdminsArgs defaults) {
            $ = new GetAdminsArgs(Objects.requireNonNull(defaults));
        }

        public Builder activatedAt(@Nullable Output<String> activatedAt) {
            $.activatedAt = activatedAt;
            return this;
        }

        public Builder activatedAt(String activatedAt) {
            return activatedAt(Output.of(activatedAt));
        }

        public Builder comment(@Nullable Output<String> comment) {
            $.comment = comment;
            return this;
        }

        public Builder comment(String comment) {
            return comment(Output.of(comment));
        }

        public Builder company(@Nullable Output<String> company) {
            $.company = company;
            return this;
        }

        public Builder company(String company) {
            return company(Output.of(company));
        }

        public Builder createdAt(@Nullable Output<String> createdAt) {
            $.createdAt = createdAt;
            return this;
        }

        public Builder createdAt(String createdAt) {
            return createdAt(Output.of(createdAt));
        }

        public Builder department(@Nullable Output<String> department) {
            $.department = department;
            return this;
        }

        public Builder department(String department) {
            return department(Output.of(department));
        }

        public Builder directoryId(@Nullable Output<Integer> directoryId) {
            $.directoryId = directoryId;
            return this;
        }

        public Builder directoryId(Integer directoryId) {
            return directoryId(Output.of(directoryId));
        }

        public Builder distinguishedName(@Nullable Output<String> distinguishedName) {
            $.distinguishedName = distinguishedName;
            return this;
        }

        public Builder distinguishedName(String distinguishedName) {
            return distinguishedName(Output.of(distinguishedName));
        }

        public Builder email(@Nullable Output<String> email) {
            $.email = email;
            return this;
        }

        public Builder email(String email) {
            return email(Output.of(email));
        }

        public Builder externalId(@Nullable Output<String> externalId) {
            $.externalId = externalId;
            return this;
        }

        public Builder externalId(String externalId) {
            return externalId(Output.of(externalId));
        }

        public Builder filters(@Nullable Output<List<GetAdminsFilterArgs>> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(List<GetAdminsFilterArgs> filters) {
            return filters(Output.of(filters));
        }

        public Builder filters(GetAdminsFilterArgs... filters) {
            return filters(List.of(filters));
        }

        public Builder firstname(@Nullable Output<String> firstname) {
            $.firstname = firstname;
            return this;
        }

        public Builder firstname(String firstname) {
            return firstname(Output.of(firstname));
        }

        public Builder groupId(@Nullable Output<Integer> groupId) {
            $.groupId = groupId;
            return this;
        }

        public Builder groupId(Integer groupId) {
            return groupId(Output.of(groupId));
        }

        public Builder invalidLoginAttempts(@Nullable Output<Integer> invalidLoginAttempts) {
            $.invalidLoginAttempts = invalidLoginAttempts;
            return this;
        }

        public Builder invalidLoginAttempts(Integer invalidLoginAttempts) {
            return invalidLoginAttempts(Output.of(invalidLoginAttempts));
        }

        public Builder invitationSentAt(@Nullable Output<String> invitationSentAt) {
            $.invitationSentAt = invitationSentAt;
            return this;
        }

        public Builder invitationSentAt(String invitationSentAt) {
            return invitationSentAt(Output.of(invitationSentAt));
        }

        public Builder lastLogin(@Nullable Output<String> lastLogin) {
            $.lastLogin = lastLogin;
            return this;
        }

        public Builder lastLogin(String lastLogin) {
            return lastLogin(Output.of(lastLogin));
        }

        public Builder lastname(@Nullable Output<String> lastname) {
            $.lastname = lastname;
            return this;
        }

        public Builder lastname(String lastname) {
            return lastname(Output.of(lastname));
        }

        public Builder lockedUntil(@Nullable Output<String> lockedUntil) {
            $.lockedUntil = lockedUntil;
            return this;
        }

        public Builder lockedUntil(String lockedUntil) {
            return lockedUntil(Output.of(lockedUntil));
        }

        public Builder managerAdId(@Nullable Output<String> managerAdId) {
            $.managerAdId = managerAdId;
            return this;
        }

        public Builder managerAdId(String managerAdId) {
            return managerAdId(Output.of(managerAdId));
        }

        public Builder managerUserId(@Nullable Output<String> managerUserId) {
            $.managerUserId = managerUserId;
            return this;
        }

        public Builder managerUserId(String managerUserId) {
            return managerUserId(Output.of(managerUserId));
        }

        public Builder memberOf(@Nullable Output<String> memberOf) {
            $.memberOf = memberOf;
            return this;
        }

        public Builder memberOf(String memberOf) {
            return memberOf(Output.of(memberOf));
        }

        public Builder password(@Nullable Output<String> password) {
            $.password = password;
            return this;
        }

        public Builder password(String password) {
            return password(Output.of(password));
        }

        public Builder passwordAlgorithm(@Nullable Output<String> passwordAlgorithm) {
            $.passwordAlgorithm = passwordAlgorithm;
            return this;
        }

        public Builder passwordAlgorithm(String passwordAlgorithm) {
            return passwordAlgorithm(Output.of(passwordAlgorithm));
        }

        public Builder passwordChangedAt(@Nullable Output<String> passwordChangedAt) {
            $.passwordChangedAt = passwordChangedAt;
            return this;
        }

        public Builder passwordChangedAt(String passwordChangedAt) {
            return passwordChangedAt(Output.of(passwordChangedAt));
        }

        public Builder passwordConfirmation(@Nullable Output<String> passwordConfirmation) {
            $.passwordConfirmation = passwordConfirmation;
            return this;
        }

        public Builder passwordConfirmation(String passwordConfirmation) {
            return passwordConfirmation(Output.of(passwordConfirmation));
        }

        public Builder phone(@Nullable Output<String> phone) {
            $.phone = phone;
            return this;
        }

        public Builder phone(String phone) {
            return phone(Output.of(phone));
        }

        public Builder preferredLocaleCode(@Nullable Output<String> preferredLocaleCode) {
            $.preferredLocaleCode = preferredLocaleCode;
            return this;
        }

        public Builder preferredLocaleCode(String preferredLocaleCode) {
            return preferredLocaleCode(Output.of(preferredLocaleCode));
        }

        public Builder roleIds(@Nullable Output<List<Integer>> roleIds) {
            $.roleIds = roleIds;
            return this;
        }

        public Builder roleIds(List<Integer> roleIds) {
            return roleIds(Output.of(roleIds));
        }

        public Builder roleIds(Integer... roleIds) {
            return roleIds(List.of(roleIds));
        }

        public Builder rolesId(Output<String> rolesId) {
            $.rolesId = rolesId;
            return this;
        }

        public Builder rolesId(String rolesId) {
            return rolesId(Output.of(rolesId));
        }

        public Builder salt(@Nullable Output<String> salt) {
            $.salt = salt;
            return this;
        }

        public Builder salt(String salt) {
            return salt(Output.of(salt));
        }

        public Builder samaccountname(@Nullable Output<String> samaccountname) {
            $.samaccountname = samaccountname;
            return this;
        }

        public Builder samaccountname(String samaccountname) {
            return samaccountname(Output.of(samaccountname));
        }

        public Builder state(@Nullable Output<Integer> state) {
            $.state = state;
            return this;
        }

        public Builder state(Integer state) {
            return state(Output.of(state));
        }

        public Builder status(@Nullable Output<Integer> status) {
            $.status = status;
            return this;
        }

        public Builder status(Integer status) {
            return status(Output.of(status));
        }

        public Builder title(@Nullable Output<String> title) {
            $.title = title;
            return this;
        }

        public Builder title(String title) {
            return title(Output.of(title));
        }

        public Builder trustedIdpId(@Nullable Output<Integer> trustedIdpId) {
            $.trustedIdpId = trustedIdpId;
            return this;
        }

        public Builder trustedIdpId(Integer trustedIdpId) {
            return trustedIdpId(Output.of(trustedIdpId));
        }

        public Builder updatedAt(@Nullable Output<String> updatedAt) {
            $.updatedAt = updatedAt;
            return this;
        }

        public Builder updatedAt(String updatedAt) {
            return updatedAt(Output.of(updatedAt));
        }

        public Builder username(@Nullable Output<String> username) {
            $.username = username;
            return this;
        }

        public Builder username(String username) {
            return username(Output.of(username));
        }

        public Builder userprincipalname(@Nullable Output<String> userprincipalname) {
            $.userprincipalname = userprincipalname;
            return this;
        }

        public Builder userprincipalname(String userprincipalname) {
            return userprincipalname(Output.of(userprincipalname));
        }

        public GetAdminsArgs build() {
            if ($.rolesId == null) {
                throw new MissingRequiredPropertyException("GetAdminsArgs", "rolesId");
            }
            return $;
        }
    }

}
