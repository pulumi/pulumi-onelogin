// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.onelogin.users.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.onelogin.users.inputs.GetV1AppsFilter;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetV1AppsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetV1AppsPlainArgs Empty = new GetV1AppsPlainArgs();

    @Import(name="extension")
    private @Nullable Boolean extension;

    public Optional<Boolean> extension() {
        return Optional.ofNullable(this.extension);
    }

    @Import(name="filters")
    private @Nullable List<GetV1AppsFilter> filters;

    public Optional<List<GetV1AppsFilter>> filters() {
        return Optional.ofNullable(this.filters);
    }

    @Import(name="iconUrl")
    private @Nullable String iconUrl;

    public Optional<String> iconUrl() {
        return Optional.ofNullable(this.iconUrl);
    }

    @Import(name="loginId")
    private @Nullable Integer loginId;

    public Optional<Integer> loginId() {
        return Optional.ofNullable(this.loginId);
    }

    @Import(name="name")
    private @Nullable String name;

    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="provisioningEnabled")
    private @Nullable Boolean provisioningEnabled;

    public Optional<Boolean> provisioningEnabled() {
        return Optional.ofNullable(this.provisioningEnabled);
    }

    @Import(name="provisioningState")
    private @Nullable String provisioningState;

    public Optional<String> provisioningState() {
        return Optional.ofNullable(this.provisioningState);
    }

    @Import(name="provisioningStatus")
    private @Nullable String provisioningStatus;

    public Optional<String> provisioningStatus() {
        return Optional.ofNullable(this.provisioningStatus);
    }

    @Import(name="usersV1Id", required=true)
    private String usersV1Id;

    public String usersV1Id() {
        return this.usersV1Id;
    }

    private GetV1AppsPlainArgs() {}

    private GetV1AppsPlainArgs(GetV1AppsPlainArgs $) {
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
    public static Builder builder(GetV1AppsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetV1AppsPlainArgs $;

        public Builder() {
            $ = new GetV1AppsPlainArgs();
        }

        public Builder(GetV1AppsPlainArgs defaults) {
            $ = new GetV1AppsPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder extension(@Nullable Boolean extension) {
            $.extension = extension;
            return this;
        }

        public Builder filters(@Nullable List<GetV1AppsFilter> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(GetV1AppsFilter... filters) {
            return filters(List.of(filters));
        }

        public Builder iconUrl(@Nullable String iconUrl) {
            $.iconUrl = iconUrl;
            return this;
        }

        public Builder loginId(@Nullable Integer loginId) {
            $.loginId = loginId;
            return this;
        }

        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        public Builder provisioningEnabled(@Nullable Boolean provisioningEnabled) {
            $.provisioningEnabled = provisioningEnabled;
            return this;
        }

        public Builder provisioningState(@Nullable String provisioningState) {
            $.provisioningState = provisioningState;
            return this;
        }

        public Builder provisioningStatus(@Nullable String provisioningStatus) {
            $.provisioningStatus = provisioningStatus;
            return this;
        }

        public Builder usersV1Id(String usersV1Id) {
            $.usersV1Id = usersV1Id;
            return this;
        }

        public GetV1AppsPlainArgs build() {
            if ($.usersV1Id == null) {
                throw new MissingRequiredPropertyException("GetV1AppsPlainArgs", "usersV1Id");
            }
            return $;
        }
    }

}
