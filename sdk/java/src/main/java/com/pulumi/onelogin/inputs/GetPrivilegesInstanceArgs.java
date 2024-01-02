// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.onelogin.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.onelogin.inputs.GetPrivilegesInstancePrivilegeArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPrivilegesInstanceArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetPrivilegesInstanceArgs Empty = new GetPrivilegesInstanceArgs();

    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    @Import(name="id", required=true)
    private Output<String> id;

    public Output<String> id() {
        return this.id;
    }

    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="privilege")
    private @Nullable Output<GetPrivilegesInstancePrivilegeArgs> privilege;

    public Optional<Output<GetPrivilegesInstancePrivilegeArgs>> privilege() {
        return Optional.ofNullable(this.privilege);
    }

    private GetPrivilegesInstanceArgs() {}

    private GetPrivilegesInstanceArgs(GetPrivilegesInstanceArgs $) {
        this.description = $.description;
        this.id = $.id;
        this.name = $.name;
        this.privilege = $.privilege;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPrivilegesInstanceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPrivilegesInstanceArgs $;

        public Builder() {
            $ = new GetPrivilegesInstanceArgs();
        }

        public Builder(GetPrivilegesInstanceArgs defaults) {
            $ = new GetPrivilegesInstanceArgs(Objects.requireNonNull(defaults));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder id(Output<String> id) {
            $.id = id;
            return this;
        }

        public Builder id(String id) {
            return id(Output.of(id));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder privilege(@Nullable Output<GetPrivilegesInstancePrivilegeArgs> privilege) {
            $.privilege = privilege;
            return this;
        }

        public Builder privilege(GetPrivilegesInstancePrivilegeArgs privilege) {
            return privilege(Output.of(privilege));
        }

        public GetPrivilegesInstanceArgs build() {
            if ($.id == null) {
                throw new MissingRequiredPropertyException("GetPrivilegesInstanceArgs", "id");
            }
            return $;
        }
    }

}
