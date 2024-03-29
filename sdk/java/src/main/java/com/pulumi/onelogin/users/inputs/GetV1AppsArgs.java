// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.onelogin.users.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.onelogin.users.inputs.GetV1AppsFilterArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetV1AppsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetV1AppsArgs Empty = new GetV1AppsArgs();

    @Import(name="extension")
    private @Nullable Output<Boolean> extension;

    public Optional<Output<Boolean>> extension() {
        return Optional.ofNullable(this.extension);
    }

    @Import(name="filters")
    private @Nullable Output<List<GetV1AppsFilterArgs>> filters;

    public Optional<Output<List<GetV1AppsFilterArgs>>> filters() {
        return Optional.ofNullable(this.filters);
    }

    @Import(name="iconUrl")
    private @Nullable Output<String> iconUrl;

    public Optional<Output<String>> iconUrl() {
        return Optional.ofNullable(this.iconUrl);
    }

    @Import(name="loginId")
    private @Nullable Output<Integer> loginId;

    public Optional<Output<Integer>> loginId() {
        return Optional.ofNullable(this.loginId);
    }

    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="provisioningEnabled")
    private @Nullable Output<Boolean> provisioningEnabled;

    public Optional<Output<Boolean>> provisioningEnabled() {
        return Optional.ofNullable(this.provisioningEnabled);
    }

    @Import(name="provisioningState")
    private @Nullable Output<String> provisioningState;

    public Optional<Output<String>> provisioningState() {
        return Optional.ofNullable(this.provisioningState);
    }

    @Import(name="provisioningStatus")
    private @Nullable Output<String> provisioningStatus;

    public Optional<Output<String>> provisioningStatus() {
        return Optional.ofNullable(this.provisioningStatus);
    }

    @Import(name="usersV1Id", required=true)
    private Output<String> usersV1Id;

    public Output<String> usersV1Id() {
        return this.usersV1Id;
    }

    private GetV1AppsArgs() {}

    private GetV1AppsArgs(GetV1AppsArgs $) {
        this.extension = $.extension;
        this.filters = $.filters;
        this.iconUrl = $.iconUrl;
        this.loginId = $.loginId;
        this.name = $.name;
        this.provisioningEnabled = $.provisioningEnabled;
        this.provisioningState = $.provisioningState;
        this.provisioningStatus = $.provisioningStatus;
        this.usersV1Id = $.usersV1Id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetV1AppsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetV1AppsArgs $;

        public Builder() {
            $ = new GetV1AppsArgs();
        }

        public Builder(GetV1AppsArgs defaults) {
            $ = new GetV1AppsArgs(Objects.requireNonNull(defaults));
        }

        public Builder extension(@Nullable Output<Boolean> extension) {
            $.extension = extension;
            return this;
        }

        public Builder extension(Boolean extension) {
            return extension(Output.of(extension));
        }

        public Builder filters(@Nullable Output<List<GetV1AppsFilterArgs>> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(List<GetV1AppsFilterArgs> filters) {
            return filters(Output.of(filters));
        }

        public Builder filters(GetV1AppsFilterArgs... filters) {
            return filters(List.of(filters));
        }

        public Builder iconUrl(@Nullable Output<String> iconUrl) {
            $.iconUrl = iconUrl;
            return this;
        }

        public Builder iconUrl(String iconUrl) {
            return iconUrl(Output.of(iconUrl));
        }

        public Builder loginId(@Nullable Output<Integer> loginId) {
            $.loginId = loginId;
            return this;
        }

        public Builder loginId(Integer loginId) {
            return loginId(Output.of(loginId));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder provisioningEnabled(@Nullable Output<Boolean> provisioningEnabled) {
            $.provisioningEnabled = provisioningEnabled;
            return this;
        }

        public Builder provisioningEnabled(Boolean provisioningEnabled) {
            return provisioningEnabled(Output.of(provisioningEnabled));
        }

        public Builder provisioningState(@Nullable Output<String> provisioningState) {
            $.provisioningState = provisioningState;
            return this;
        }

        public Builder provisioningState(String provisioningState) {
            return provisioningState(Output.of(provisioningState));
        }

        public Builder provisioningStatus(@Nullable Output<String> provisioningStatus) {
            $.provisioningStatus = provisioningStatus;
            return this;
        }

        public Builder provisioningStatus(String provisioningStatus) {
            return provisioningStatus(Output.of(provisioningStatus));
        }

        public Builder usersV1Id(Output<String> usersV1Id) {
            $.usersV1Id = usersV1Id;
            return this;
        }

        public Builder usersV1Id(String usersV1Id) {
            return usersV1Id(Output.of(usersV1Id));
        }

        public GetV1AppsArgs build() {
            if ($.usersV1Id == null) {
                throw new MissingRequiredPropertyException("GetV1AppsArgs", "usersV1Id");
            }
            return $;
        }
    }

}
