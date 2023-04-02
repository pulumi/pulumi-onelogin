// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.onelogin.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.onelogin.outputs.PrivilegesPrivilegeStatement;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PrivilegesPrivilege {
    private @Nullable List<PrivilegesPrivilegeStatement> statements;
    private @Nullable String version;

    private PrivilegesPrivilege() {}
    public List<PrivilegesPrivilegeStatement> statements() {
        return this.statements == null ? List.of() : this.statements;
    }
    public Optional<String> version() {
        return Optional.ofNullable(this.version);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivilegesPrivilege defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<PrivilegesPrivilegeStatement> statements;
        private @Nullable String version;
        public Builder() {}
        public Builder(PrivilegesPrivilege defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.statements = defaults.statements;
    	      this.version = defaults.version;
        }

        @CustomType.Setter
        public Builder statements(@Nullable List<PrivilegesPrivilegeStatement> statements) {
            this.statements = statements;
            return this;
        }
        public Builder statements(PrivilegesPrivilegeStatement... statements) {
            return statements(List.of(statements));
        }
        @CustomType.Setter
        public Builder version(@Nullable String version) {
            this.version = version;
            return this;
        }
        public PrivilegesPrivilege build() {
            final var o = new PrivilegesPrivilege();
            o.statements = statements;
            o.version = version;
            return o;
        }
    }
}
