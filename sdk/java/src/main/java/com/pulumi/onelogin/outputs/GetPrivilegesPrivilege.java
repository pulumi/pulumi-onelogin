// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.onelogin.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.onelogin.outputs.GetPrivilegesPrivilegeStatement;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetPrivilegesPrivilege {
    private List<GetPrivilegesPrivilegeStatement> statements;
    private String version;

    private GetPrivilegesPrivilege() {}
    public List<GetPrivilegesPrivilegeStatement> statements() {
        return this.statements;
    }
    public String version() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPrivilegesPrivilege defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetPrivilegesPrivilegeStatement> statements;
        private String version;
        public Builder() {}
        public Builder(GetPrivilegesPrivilege defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.statements = defaults.statements;
    	      this.version = defaults.version;
        }

        @CustomType.Setter
        public Builder statements(List<GetPrivilegesPrivilegeStatement> statements) {
            this.statements = Objects.requireNonNull(statements);
            return this;
        }
        public Builder statements(GetPrivilegesPrivilegeStatement... statements) {
            return statements(List.of(statements));
        }
        @CustomType.Setter
        public Builder version(String version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }
        public GetPrivilegesPrivilege build() {
            final var _resultValue = new GetPrivilegesPrivilege();
            _resultValue.statements = statements;
            _resultValue.version = version;
            return _resultValue;
        }
    }
}
