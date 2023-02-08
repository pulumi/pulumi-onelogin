// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.onelogin.roles.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.onelogin.roles.inputs.GetRolesFilter;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetRolesPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRolesPlainArgs Empty = new GetRolesPlainArgs();

    @Import(name="admins")
    private @Nullable List<Integer> admins;

    public Optional<List<Integer>> admins() {
        return Optional.ofNullable(this.admins);
    }

    @Import(name="apps")
    private @Nullable List<Integer> apps;

    public Optional<List<Integer>> apps() {
        return Optional.ofNullable(this.apps);
    }

    @Import(name="filters")
    private @Nullable List<GetRolesFilter> filters;

    public Optional<List<GetRolesFilter>> filters() {
        return Optional.ofNullable(this.filters);
    }

    @Import(name="name")
    private @Nullable String name;

    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="users")
    private @Nullable List<Integer> users;

    public Optional<List<Integer>> users() {
        return Optional.ofNullable(this.users);
    }

    private GetRolesPlainArgs() {}

    private GetRolesPlainArgs(GetRolesPlainArgs $) {
        this.admins = $.admins;
        this.apps = $.apps;
        this.filters = $.filters;
        this.name = $.name;
        this.users = $.users;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRolesPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRolesPlainArgs $;

        public Builder() {
            $ = new GetRolesPlainArgs();
        }

        public Builder(GetRolesPlainArgs defaults) {
            $ = new GetRolesPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder admins(@Nullable List<Integer> admins) {
            $.admins = admins;
            return this;
        }

        public Builder admins(Integer... admins) {
            return admins(List.of(admins));
        }

        public Builder apps(@Nullable List<Integer> apps) {
            $.apps = apps;
            return this;
        }

        public Builder apps(Integer... apps) {
            return apps(List.of(apps));
        }

        public Builder filters(@Nullable List<GetRolesFilter> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(GetRolesFilter... filters) {
            return filters(List.of(filters));
        }

        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        public Builder users(@Nullable List<Integer> users) {
            $.users = users;
            return this;
        }

        public Builder users(Integer... users) {
            return users(List.of(users));
        }

        public GetRolesPlainArgs build() {
            return $;
        }
    }

}