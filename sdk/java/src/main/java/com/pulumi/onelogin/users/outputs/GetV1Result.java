// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.onelogin.users.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.onelogin.users.outputs.GetV1Filter;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetV1Result {
    private String activatedAt;
    private String comment;
    private String company;
    private String createdAt;
    private String department;
    private Integer directoryId;
    private String distinguishedName;
    private String email;
    private String externalId;
    private @Nullable List<GetV1Filter> filters;
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

    private GetV1Result() {}
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
    public List<GetV1Filter> filters() {
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

    public static Builder builder(GetV1Result defaults) {
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
        private @Nullable List<GetV1Filter> filters;
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
        public Builder(GetV1Result defaults) {
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
            if (activatedAt == null) {
              throw new MissingRequiredPropertyException("GetV1Result", "activatedAt");
            }
            this.activatedAt = activatedAt;
            return this;
        }
        @CustomType.Setter
        public Builder comment(String comment) {
            if (comment == null) {
              throw new MissingRequiredPropertyException("GetV1Result", "comment");
            }
            this.comment = comment;
            return this;
        }
        @CustomType.Setter
        public Builder company(String company) {
            if (company == null) {
              throw new MissingRequiredPropertyException("GetV1Result", "company");
            }
            this.company = company;
            return this;
        }
        @CustomType.Setter
        public Builder createdAt(String createdAt) {
            if (createdAt == null) {
              throw new MissingRequiredPropertyException("GetV1Result", "createdAt");
            }
            this.createdAt = createdAt;
            return this;
        }
        @CustomType.Setter
        public Builder department(String department) {
            if (department == null) {
              throw new MissingRequiredPropertyException("GetV1Result", "department");
            }
            this.department = department;
            return this;
        }
        @CustomType.Setter
        public Builder directoryId(Integer directoryId) {
            if (directoryId == null) {
              throw new MissingRequiredPropertyException("GetV1Result", "directoryId");
            }
            this.directoryId = directoryId;
            return this;
        }
        @CustomType.Setter
        public Builder distinguishedName(String distinguishedName) {
            if (distinguishedName == null) {
              throw new MissingRequiredPropertyException("GetV1Result", "distinguishedName");
            }
            this.distinguishedName = distinguishedName;
            return this;
        }
        @CustomType.Setter
        public Builder email(String email) {
            if (email == null) {
              throw new MissingRequiredPropertyException("GetV1Result", "email");
            }
            this.email = email;
            return this;
        }
        @CustomType.Setter
        public Builder externalId(String externalId) {
            if (externalId == null) {
              throw new MissingRequiredPropertyException("GetV1Result", "externalId");
            }
            this.externalId = externalId;
            return this;
        }
        @CustomType.Setter
        public Builder filters(@Nullable List<GetV1Filter> filters) {

            this.filters = filters;
            return this;
        }
        public Builder filters(GetV1Filter... filters) {
            return filters(List.of(filters));
        }
        @CustomType.Setter
        public Builder firstname(String firstname) {
            if (firstname == null) {
              throw new MissingRequiredPropertyException("GetV1Result", "firstname");
            }
            this.firstname = firstname;
            return this;
        }
        @CustomType.Setter
        public Builder groupId(Integer groupId) {
            if (groupId == null) {
              throw new MissingRequiredPropertyException("GetV1Result", "groupId");
            }
            this.groupId = groupId;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetV1Result", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder invalidLoginAttempts(Integer invalidLoginAttempts) {
            if (invalidLoginAttempts == null) {
              throw new MissingRequiredPropertyException("GetV1Result", "invalidLoginAttempts");
            }
            this.invalidLoginAttempts = invalidLoginAttempts;
            return this;
        }
        @CustomType.Setter
        public Builder invitationSentAt(String invitationSentAt) {
            if (invitationSentAt == null) {
              throw new MissingRequiredPropertyException("GetV1Result", "invitationSentAt");
            }
            this.invitationSentAt = invitationSentAt;
            return this;
        }
        @CustomType.Setter
        public Builder lastLogin(String lastLogin) {
            if (lastLogin == null) {
              throw new MissingRequiredPropertyException("GetV1Result", "lastLogin");
            }
            this.lastLogin = lastLogin;
            return this;
        }
        @CustomType.Setter
        public Builder lastname(String lastname) {
            if (lastname == null) {
              throw new MissingRequiredPropertyException("GetV1Result", "lastname");
            }
            this.lastname = lastname;
            return this;
        }
        @CustomType.Setter
        public Builder lockedUntil(String lockedUntil) {
            if (lockedUntil == null) {
              throw new MissingRequiredPropertyException("GetV1Result", "lockedUntil");
            }
            this.lockedUntil = lockedUntil;
            return this;
        }
        @CustomType.Setter
        public Builder managerAdId(String managerAdId) {
            if (managerAdId == null) {
              throw new MissingRequiredPropertyException("GetV1Result", "managerAdId");
            }
            this.managerAdId = managerAdId;
            return this;
        }
        @CustomType.Setter
        public Builder managerUserId(String managerUserId) {
            if (managerUserId == null) {
              throw new MissingRequiredPropertyException("GetV1Result", "managerUserId");
            }
            this.managerUserId = managerUserId;
            return this;
        }
        @CustomType.Setter
        public Builder memberOf(String memberOf) {
            if (memberOf == null) {
              throw new MissingRequiredPropertyException("GetV1Result", "memberOf");
            }
            this.memberOf = memberOf;
            return this;
        }
        @CustomType.Setter
        public Builder password(String password) {
            if (password == null) {
              throw new MissingRequiredPropertyException("GetV1Result", "password");
            }
            this.password = password;
            return this;
        }
        @CustomType.Setter
        public Builder passwordAlgorithm(String passwordAlgorithm) {
            if (passwordAlgorithm == null) {
              throw new MissingRequiredPropertyException("GetV1Result", "passwordAlgorithm");
            }
            this.passwordAlgorithm = passwordAlgorithm;
            return this;
        }
        @CustomType.Setter
        public Builder passwordChangedAt(String passwordChangedAt) {
            if (passwordChangedAt == null) {
              throw new MissingRequiredPropertyException("GetV1Result", "passwordChangedAt");
            }
            this.passwordChangedAt = passwordChangedAt;
            return this;
        }
        @CustomType.Setter
        public Builder passwordConfirmation(String passwordConfirmation) {
            if (passwordConfirmation == null) {
              throw new MissingRequiredPropertyException("GetV1Result", "passwordConfirmation");
            }
            this.passwordConfirmation = passwordConfirmation;
            return this;
        }
        @CustomType.Setter
        public Builder phone(String phone) {
            if (phone == null) {
              throw new MissingRequiredPropertyException("GetV1Result", "phone");
            }
            this.phone = phone;
            return this;
        }
        @CustomType.Setter
        public Builder preferredLocaleCode(String preferredLocaleCode) {
            if (preferredLocaleCode == null) {
              throw new MissingRequiredPropertyException("GetV1Result", "preferredLocaleCode");
            }
            this.preferredLocaleCode = preferredLocaleCode;
            return this;
        }
        @CustomType.Setter
        public Builder roleIds(List<Integer> roleIds) {
            if (roleIds == null) {
              throw new MissingRequiredPropertyException("GetV1Result", "roleIds");
            }
            this.roleIds = roleIds;
            return this;
        }
        public Builder roleIds(Integer... roleIds) {
            return roleIds(List.of(roleIds));
        }
        @CustomType.Setter
        public Builder salt(String salt) {
            if (salt == null) {
              throw new MissingRequiredPropertyException("GetV1Result", "salt");
            }
            this.salt = salt;
            return this;
        }
        @CustomType.Setter
        public Builder samaccountname(String samaccountname) {
            if (samaccountname == null) {
              throw new MissingRequiredPropertyException("GetV1Result", "samaccountname");
            }
            this.samaccountname = samaccountname;
            return this;
        }
        @CustomType.Setter
        public Builder state(Integer state) {
            if (state == null) {
              throw new MissingRequiredPropertyException("GetV1Result", "state");
            }
            this.state = state;
            return this;
        }
        @CustomType.Setter
        public Builder status(Integer status) {
            if (status == null) {
              throw new MissingRequiredPropertyException("GetV1Result", "status");
            }
            this.status = status;
            return this;
        }
        @CustomType.Setter
        public Builder title(String title) {
            if (title == null) {
              throw new MissingRequiredPropertyException("GetV1Result", "title");
            }
            this.title = title;
            return this;
        }
        @CustomType.Setter
        public Builder trustedIdpId(Integer trustedIdpId) {
            if (trustedIdpId == null) {
              throw new MissingRequiredPropertyException("GetV1Result", "trustedIdpId");
            }
            this.trustedIdpId = trustedIdpId;
            return this;
        }
        @CustomType.Setter
        public Builder updatedAt(String updatedAt) {
            if (updatedAt == null) {
              throw new MissingRequiredPropertyException("GetV1Result", "updatedAt");
            }
            this.updatedAt = updatedAt;
            return this;
        }
        @CustomType.Setter
        public Builder username(String username) {
            if (username == null) {
              throw new MissingRequiredPropertyException("GetV1Result", "username");
            }
            this.username = username;
            return this;
        }
        @CustomType.Setter
        public Builder userprincipalname(String userprincipalname) {
            if (userprincipalname == null) {
              throw new MissingRequiredPropertyException("GetV1Result", "userprincipalname");
            }
            this.userprincipalname = userprincipalname;
            return this;
        }
        public GetV1Result build() {
            final var _resultValue = new GetV1Result();
            _resultValue.activatedAt = activatedAt;
            _resultValue.comment = comment;
            _resultValue.company = company;
            _resultValue.createdAt = createdAt;
            _resultValue.department = department;
            _resultValue.directoryId = directoryId;
            _resultValue.distinguishedName = distinguishedName;
            _resultValue.email = email;
            _resultValue.externalId = externalId;
            _resultValue.filters = filters;
            _resultValue.firstname = firstname;
            _resultValue.groupId = groupId;
            _resultValue.id = id;
            _resultValue.invalidLoginAttempts = invalidLoginAttempts;
            _resultValue.invitationSentAt = invitationSentAt;
            _resultValue.lastLogin = lastLogin;
            _resultValue.lastname = lastname;
            _resultValue.lockedUntil = lockedUntil;
            _resultValue.managerAdId = managerAdId;
            _resultValue.managerUserId = managerUserId;
            _resultValue.memberOf = memberOf;
            _resultValue.password = password;
            _resultValue.passwordAlgorithm = passwordAlgorithm;
            _resultValue.passwordChangedAt = passwordChangedAt;
            _resultValue.passwordConfirmation = passwordConfirmation;
            _resultValue.phone = phone;
            _resultValue.preferredLocaleCode = preferredLocaleCode;
            _resultValue.roleIds = roleIds;
            _resultValue.salt = salt;
            _resultValue.samaccountname = samaccountname;
            _resultValue.state = state;
            _resultValue.status = status;
            _resultValue.title = title;
            _resultValue.trustedIdpId = trustedIdpId;
            _resultValue.updatedAt = updatedAt;
            _resultValue.username = username;
            _resultValue.userprincipalname = userprincipalname;
            return _resultValue;
        }
    }
}
