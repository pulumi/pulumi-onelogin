// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.onelogin.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetPrivilegesPrivilegeStatement {
    private List<String> actions;
    private String effect;
    private List<String> scopes;

    private GetPrivilegesPrivilegeStatement() {}
    public List<String> actions() {
        return this.actions;
    }
    public String effect() {
        return this.effect;
    }
    public List<String> scopes() {
        return this.scopes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPrivilegesPrivilegeStatement defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> actions;
        private String effect;
        private List<String> scopes;
        public Builder() {}
        public Builder(GetPrivilegesPrivilegeStatement defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actions = defaults.actions;
    	      this.effect = defaults.effect;
    	      this.scopes = defaults.scopes;
        }

        @CustomType.Setter
        public Builder actions(List<String> actions) {
            this.actions = Objects.requireNonNull(actions);
            return this;
        }
        public Builder actions(String... actions) {
            return actions(List.of(actions));
        }
        @CustomType.Setter
        public Builder effect(String effect) {
            this.effect = Objects.requireNonNull(effect);
            return this;
        }
        @CustomType.Setter
        public Builder scopes(List<String> scopes) {
            this.scopes = Objects.requireNonNull(scopes);
            return this;
        }
        public Builder scopes(String... scopes) {
            return scopes(List.of(scopes));
        }
        public GetPrivilegesPrivilegeStatement build() {
            final var o = new GetPrivilegesPrivilegeStatement();
            o.actions = actions;
            o.effect = effect;
            o.scopes = scopes;
            return o;
        }
    }
}