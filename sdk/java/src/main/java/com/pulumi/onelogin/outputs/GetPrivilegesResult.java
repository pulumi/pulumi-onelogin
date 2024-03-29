// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.onelogin.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.onelogin.outputs.GetPrivilegesFilter;
import com.pulumi.onelogin.outputs.GetPrivilegesPrivilege;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetPrivilegesResult {
    private String description;
    private @Nullable List<GetPrivilegesFilter> filters;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private String name;
    private GetPrivilegesPrivilege privilege;

    private GetPrivilegesResult() {}
    public String description() {
        return this.description;
    }
    public List<GetPrivilegesFilter> filters() {
        return this.filters == null ? List.of() : this.filters;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String name() {
        return this.name;
    }
    public GetPrivilegesPrivilege privilege() {
        return this.privilege;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPrivilegesResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String description;
        private @Nullable List<GetPrivilegesFilter> filters;
        private String id;
        private String name;
        private GetPrivilegesPrivilege privilege;
        public Builder() {}
        public Builder(GetPrivilegesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.privilege = defaults.privilege;
        }

        @CustomType.Setter
        public Builder description(String description) {
            if (description == null) {
              throw new MissingRequiredPropertyException("GetPrivilegesResult", "description");
            }
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder filters(@Nullable List<GetPrivilegesFilter> filters) {

            this.filters = filters;
            return this;
        }
        public Builder filters(GetPrivilegesFilter... filters) {
            return filters(List.of(filters));
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetPrivilegesResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetPrivilegesResult", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder privilege(GetPrivilegesPrivilege privilege) {
            if (privilege == null) {
              throw new MissingRequiredPropertyException("GetPrivilegesResult", "privilege");
            }
            this.privilege = privilege;
            return this;
        }
        public GetPrivilegesResult build() {
            final var _resultValue = new GetPrivilegesResult();
            _resultValue.description = description;
            _resultValue.filters = filters;
            _resultValue.id = id;
            _resultValue.name = name;
            _resultValue.privilege = privilege;
            return _resultValue;
        }
    }
}
