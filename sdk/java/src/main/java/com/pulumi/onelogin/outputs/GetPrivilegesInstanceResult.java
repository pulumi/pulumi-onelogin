// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.onelogin.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.onelogin.outputs.GetPrivilegesInstancePrivilege;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetPrivilegesInstanceResult {
    private String description;
    private String id;
    private String name;
    private GetPrivilegesInstancePrivilege privilege;

    private GetPrivilegesInstanceResult() {}
    public String description() {
        return this.description;
    }
    public String id() {
        return this.id;
    }
    public String name() {
        return this.name;
    }
    public GetPrivilegesInstancePrivilege privilege() {
        return this.privilege;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPrivilegesInstanceResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String description;
        private String id;
        private String name;
        private GetPrivilegesInstancePrivilege privilege;
        public Builder() {}
        public Builder(GetPrivilegesInstanceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.privilege = defaults.privilege;
        }

        @CustomType.Setter
        public Builder description(String description) {
            if (description == null) {
              throw new MissingRequiredPropertyException("GetPrivilegesInstanceResult", "description");
            }
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetPrivilegesInstanceResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetPrivilegesInstanceResult", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder privilege(GetPrivilegesInstancePrivilege privilege) {
            if (privilege == null) {
              throw new MissingRequiredPropertyException("GetPrivilegesInstanceResult", "privilege");
            }
            this.privilege = privilege;
            return this;
        }
        public GetPrivilegesInstanceResult build() {
            final var _resultValue = new GetPrivilegesInstanceResult();
            _resultValue.description = description;
            _resultValue.id = id;
            _resultValue.name = name;
            _resultValue.privilege = privilege;
            return _resultValue;
        }
    }
}
