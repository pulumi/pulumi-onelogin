// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.onelogin.roles.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetInstanceResult {
    private List<Integer> admins;
    private List<Integer> apps;
    private String id;
    private String name;
    private List<Integer> users;

    private GetInstanceResult() {}
    public List<Integer> admins() {
        return this.admins;
    }
    public List<Integer> apps() {
        return this.apps;
    }
    public String id() {
        return this.id;
    }
    public String name() {
        return this.name;
    }
    public List<Integer> users() {
        return this.users;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstanceResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<Integer> admins;
        private List<Integer> apps;
        private String id;
        private String name;
        private List<Integer> users;
        public Builder() {}
        public Builder(GetInstanceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.admins = defaults.admins;
    	      this.apps = defaults.apps;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.users = defaults.users;
        }

        @CustomType.Setter
        public Builder admins(List<Integer> admins) {
            this.admins = Objects.requireNonNull(admins);
            return this;
        }
        public Builder admins(Integer... admins) {
            return admins(List.of(admins));
        }
        @CustomType.Setter
        public Builder apps(List<Integer> apps) {
            this.apps = Objects.requireNonNull(apps);
            return this;
        }
        public Builder apps(Integer... apps) {
            return apps(List.of(apps));
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder users(List<Integer> users) {
            this.users = Objects.requireNonNull(users);
            return this;
        }
        public Builder users(Integer... users) {
            return users(List.of(users));
        }
        public GetInstanceResult build() {
            final var o = new GetInstanceResult();
            o.admins = admins;
            o.apps = apps;
            o.id = id;
            o.name = name;
            o.users = users;
            return o;
        }
    }
}