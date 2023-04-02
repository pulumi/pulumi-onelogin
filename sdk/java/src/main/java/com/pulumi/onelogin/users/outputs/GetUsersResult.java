// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.onelogin.users.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.onelogin.users.outputs.GetUsersFilter;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetUsersResult {
    private String activatedAt;
    private String comment;
    private String company;
    private String createdAt;
    private String department;
    private Integer directoryId;
    private String distinguishedName;
    private String email;
    private String externalId;
    private @Nullable List<GetUsersFilter> filters;
    private String firstname;
    private Integer groupId;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private Integer invalidLoginAttempts;
    private String invitationSentAt;
    private String lastLogin;
    private String lastname;
    private String lockedUntil;
    private String managerAdId;
    private String managerUserId;
    private String memberOf;
    private String password;
    private String passwordAlgorithm;
    private String passwordChangedAt;
    private String passwordConfirmation;
    private String phone;
    private String preferredLocaleCode;
    private List<Integer> roleIds;
    private String salt;
    private String samaccountname;
    private Integer state;
    private Integer status;
    private String title;
    private Integer trustedIdpId;
    private String updatedAt;
    private String username;
    private String userprincipalname;

    private GetUsersResult() {}
    public String activatedAt() {
        return this.activatedAt;
    }
    public String comment() {
        return this.comment;
    }
    public String company() {
        return this.company;
    }
    public String createdAt() {
        return this.createdAt;
    }
    public String department() {
        return this.department;
    }
    public Integer directoryId() {
        return this.directoryId;
    }
    public String distinguishedName() {
        return this.distinguishedName;
    }
    public String email() {
        return this.email;
    }
    public String externalId() {
        return this.externalId;
    }
    public List<GetUsersFilter> filters() {
        return this.filters == null ? List.of() : this.filters;
    }
    public String firstname() {
        return this.firstname;
    }
    public Integer groupId() {
        return this.groupId;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public Integer invalidLoginAttempts() {
        return this.invalidLoginAttempts;
    }
    public String invitationSentAt() {
        return this.invitationSentAt;
    }
    public String lastLogin() {
        return this.lastLogin;
    }
    public String lastname() {
        return this.lastname;
    }
    public String lockedUntil() {
        return this.lockedUntil;
    }
    public String managerAdId() {
        return this.managerAdId;
    }
    public String managerUserId() {
        return this.managerUserId;
    }
    public String memberOf() {
        return this.memberOf;
    }
    public String password() {
        return this.password;
    }
    public String passwordAlgorithm() {
        return this.passwordAlgorithm;
    }
    public String passwordChangedAt() {
        return this.passwordChangedAt;
    }
    public String passwordConfirmation() {
        return this.passwordConfirmation;
    }
    public String phone() {
        return this.phone;
    }
    public String preferredLocaleCode() {
        return this.preferredLocaleCode;
    }
    public List<Integer> roleIds() {
        return this.roleIds;
    }
    public String salt() {
        return this.salt;
    }
    public String samaccountname() {
        return this.samaccountname;
    }
    public Integer state() {
        return this.state;
    }
    public Integer status() {
        return this.status;
    }
    public String title() {
        return this.title;
    }
    public Integer trustedIdpId() {
        return this.trustedIdpId;
    }
    public String updatedAt() {
        return this.updatedAt;
    }
    public String username() {
        return this.username;
    }
    public String userprincipalname() {
        return this.userprincipalname;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetUsersResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String activatedAt;
        private String comment;
        private String company;
        private String createdAt;
        private String department;
        private Integer directoryId;
        private String distinguishedName;
        private String email;
        private String externalId;
        private @Nullable List<GetUsersFilter> filters;
        private String firstname;
        private Integer groupId;
        private String id;
        private Integer invalidLoginAttempts;
        private String invitationSentAt;
        private String lastLogin;
        private String lastname;
        private String lockedUntil;
        private String managerAdId;
        private String managerUserId;
        private String memberOf;
        private String password;
        private String passwordAlgorithm;
        private String passwordChangedAt;
        private String passwordConfirmation;
        private String phone;
        private String preferredLocaleCode;
        private List<Integer> roleIds;
        private String salt;
        private String samaccountname;
        private Integer state;
        private Integer status;
        private String title;
        private Integer trustedIdpId;
        private String updatedAt;
        private String username;
        private String userprincipalname;
        public Builder() {}
        public Builder(GetUsersResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.activatedAt = defaults.activatedAt;
    	      this.comment = defaults.comment;
    	      this.company = defaults.company;
    	      this.createdAt = defaults.createdAt;
    	      this.department = defaults.department;
    	      this.directoryId = defaults.directoryId;
    	      this.distinguishedName = defaults.distinguishedName;
    	      this.email = defaults.email;
    	      this.externalId = defaults.externalId;
    	      this.filters = defaults.filters;
    	      this.firstname = defaults.firstname;
    	      this.groupId = defaults.groupId;
    	      this.id = defaults.id;
    	      this.invalidLoginAttempts = defaults.invalidLoginAttempts;
    	      this.invitationSentAt = defaults.invitationSentAt;
    	      this.lastLogin = defaults.lastLogin;
    	      this.lastname = defaults.lastname;
    	      this.lockedUntil = defaults.lockedUntil;
    	      this.managerAdId = defaults.managerAdId;
    	      this.managerUserId = defaults.managerUserId;
    	      this.memberOf = defaults.memberOf;
    	      this.password = defaults.password;
    	      this.passwordAlgorithm = defaults.passwordAlgorithm;
    	      this.passwordChangedAt = defaults.passwordChangedAt;
    	      this.passwordConfirmation = defaults.passwordConfirmation;
    	      this.phone = defaults.phone;
    	      this.preferredLocaleCode = defaults.preferredLocaleCode;
    	      this.roleIds = defaults.roleIds;
    	      this.salt = defaults.salt;
    	      this.samaccountname = defaults.samaccountname;
    	      this.state = defaults.state;
    	      this.status = defaults.status;
    	      this.title = defaults.title;
    	      this.trustedIdpId = defaults.trustedIdpId;
    	      this.updatedAt = defaults.updatedAt;
    	      this.username = defaults.username;
    	      this.userprincipalname = defaults.userprincipalname;
        }

        @CustomType.Setter
        public Builder activatedAt(String activatedAt) {
            this.activatedAt = Objects.requireNonNull(activatedAt);
            return this;
        }
        @CustomType.Setter
        public Builder comment(String comment) {
            this.comment = Objects.requireNonNull(comment);
            return this;
        }
        @CustomType.Setter
        public Builder company(String company) {
            this.company = Objects.requireNonNull(company);
            return this;
        }
        @CustomType.Setter
        public Builder createdAt(String createdAt) {
            this.createdAt = Objects.requireNonNull(createdAt);
            return this;
        }
        @CustomType.Setter
        public Builder department(String department) {
            this.department = Objects.requireNonNull(department);
            return this;
        }
        @CustomType.Setter
        public Builder directoryId(Integer directoryId) {
            this.directoryId = Objects.requireNonNull(directoryId);
            return this;
        }
        @CustomType.Setter
        public Builder distinguishedName(String distinguishedName) {
            this.distinguishedName = Objects.requireNonNull(distinguishedName);
            return this;
        }
        @CustomType.Setter
        public Builder email(String email) {
            this.email = Objects.requireNonNull(email);
            return this;
        }
        @CustomType.Setter
        public Builder externalId(String externalId) {
            this.externalId = Objects.requireNonNull(externalId);
            return this;
        }
        @CustomType.Setter
        public Builder filters(@Nullable List<GetUsersFilter> filters) {
            this.filters = filters;
            return this;
        }
        public Builder filters(GetUsersFilter... filters) {
            return filters(List.of(filters));
        }
        @CustomType.Setter
        public Builder firstname(String firstname) {
            this.firstname = Objects.requireNonNull(firstname);
            return this;
        }
        @CustomType.Setter
        public Builder groupId(Integer groupId) {
            this.groupId = Objects.requireNonNull(groupId);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder invalidLoginAttempts(Integer invalidLoginAttempts) {
            this.invalidLoginAttempts = Objects.requireNonNull(invalidLoginAttempts);
            return this;
        }
        @CustomType.Setter
        public Builder invitationSentAt(String invitationSentAt) {
            this.invitationSentAt = Objects.requireNonNull(invitationSentAt);
            return this;
        }
        @CustomType.Setter
        public Builder lastLogin(String lastLogin) {
            this.lastLogin = Objects.requireNonNull(lastLogin);
            return this;
        }
        @CustomType.Setter
        public Builder lastname(String lastname) {
            this.lastname = Objects.requireNonNull(lastname);
            return this;
        }
        @CustomType.Setter
        public Builder lockedUntil(String lockedUntil) {
            this.lockedUntil = Objects.requireNonNull(lockedUntil);
            return this;
        }
        @CustomType.Setter
        public Builder managerAdId(String managerAdId) {
            this.managerAdId = Objects.requireNonNull(managerAdId);
            return this;
        }
        @CustomType.Setter
        public Builder managerUserId(String managerUserId) {
            this.managerUserId = Objects.requireNonNull(managerUserId);
            return this;
        }
        @CustomType.Setter
        public Builder memberOf(String memberOf) {
            this.memberOf = Objects.requireNonNull(memberOf);
            return this;
        }
        @CustomType.Setter
        public Builder password(String password) {
            this.password = Objects.requireNonNull(password);
            return this;
        }
        @CustomType.Setter
        public Builder passwordAlgorithm(String passwordAlgorithm) {
            this.passwordAlgorithm = Objects.requireNonNull(passwordAlgorithm);
            return this;
        }
        @CustomType.Setter
        public Builder passwordChangedAt(String passwordChangedAt) {
            this.passwordChangedAt = Objects.requireNonNull(passwordChangedAt);
            return this;
        }
        @CustomType.Setter
        public Builder passwordConfirmation(String passwordConfirmation) {
            this.passwordConfirmation = Objects.requireNonNull(passwordConfirmation);
            return this;
        }
        @CustomType.Setter
        public Builder phone(String phone) {
            this.phone = Objects.requireNonNull(phone);
            return this;
        }
        @CustomType.Setter
        public Builder preferredLocaleCode(String preferredLocaleCode) {
            this.preferredLocaleCode = Objects.requireNonNull(preferredLocaleCode);
            return this;
        }
        @CustomType.Setter
        public Builder roleIds(List<Integer> roleIds) {
            this.roleIds = Objects.requireNonNull(roleIds);
            return this;
        }
        public Builder roleIds(Integer... roleIds) {
            return roleIds(List.of(roleIds));
        }
        @CustomType.Setter
        public Builder salt(String salt) {
            this.salt = Objects.requireNonNull(salt);
            return this;
        }
        @CustomType.Setter
        public Builder samaccountname(String samaccountname) {
            this.samaccountname = Objects.requireNonNull(samaccountname);
            return this;
        }
        @CustomType.Setter
        public Builder state(Integer state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        @CustomType.Setter
        public Builder status(Integer status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        @CustomType.Setter
        public Builder title(String title) {
            this.title = Objects.requireNonNull(title);
            return this;
        }
        @CustomType.Setter
        public Builder trustedIdpId(Integer trustedIdpId) {
            this.trustedIdpId = Objects.requireNonNull(trustedIdpId);
            return this;
        }
        @CustomType.Setter
        public Builder updatedAt(String updatedAt) {
            this.updatedAt = Objects.requireNonNull(updatedAt);
            return this;
        }
        @CustomType.Setter
        public Builder username(String username) {
            this.username = Objects.requireNonNull(username);
            return this;
        }
        @CustomType.Setter
        public Builder userprincipalname(String userprincipalname) {
            this.userprincipalname = Objects.requireNonNull(userprincipalname);
            return this;
        }
        public GetUsersResult build() {
            final var o = new GetUsersResult();
            o.activatedAt = activatedAt;
            o.comment = comment;
            o.company = company;
            o.createdAt = createdAt;
            o.department = department;
            o.directoryId = directoryId;
            o.distinguishedName = distinguishedName;
            o.email = email;
            o.externalId = externalId;
            o.filters = filters;
            o.firstname = firstname;
            o.groupId = groupId;
            o.id = id;
            o.invalidLoginAttempts = invalidLoginAttempts;
            o.invitationSentAt = invitationSentAt;
            o.lastLogin = lastLogin;
            o.lastname = lastname;
            o.lockedUntil = lockedUntil;
            o.managerAdId = managerAdId;
            o.managerUserId = managerUserId;
            o.memberOf = memberOf;
            o.password = password;
            o.passwordAlgorithm = passwordAlgorithm;
            o.passwordChangedAt = passwordChangedAt;
            o.passwordConfirmation = passwordConfirmation;
            o.phone = phone;
            o.preferredLocaleCode = preferredLocaleCode;
            o.roleIds = roleIds;
            o.salt = salt;
            o.samaccountname = samaccountname;
            o.state = state;
            o.status = status;
            o.title = title;
            o.trustedIdpId = trustedIdpId;
            o.updatedAt = updatedAt;
            o.username = username;
            o.userprincipalname = userprincipalname;
            return o;
        }
    }
}
