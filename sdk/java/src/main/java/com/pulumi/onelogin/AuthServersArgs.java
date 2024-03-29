// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.onelogin;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.onelogin.inputs.AuthServersConfigurationArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AuthServersArgs extends com.pulumi.resources.ResourceArgs {

    public static final AuthServersArgs Empty = new AuthServersArgs();

    /**
     * Authorization server configuration
     * 
     */
    @Import(name="configuration", required=true)
    private Output<AuthServersConfigurationArgs> configuration;

    /**
     * @return Authorization server configuration
     * 
     */
    public Output<AuthServersConfigurationArgs> configuration() {
        return this.configuration;
    }

    /**
     * Description of what the API does.
     * 
     */
    @Import(name="description", required=true)
    private Output<String> description;

    /**
     * @return Description of what the API does.
     * 
     */
    public Output<String> description() {
        return this.description;
    }

    /**
     * Name of the API.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the API.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private AuthServersArgs() {}

    private AuthServersArgs(AuthServersArgs $) {
        this.configuration = $.configuration;
        this.description = $.description;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AuthServersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AuthServersArgs $;

        public Builder() {
            $ = new AuthServersArgs();
        }

        public Builder(AuthServersArgs defaults) {
            $ = new AuthServersArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param configuration Authorization server configuration
         * 
         * @return builder
         * 
         */
        public Builder configuration(Output<AuthServersConfigurationArgs> configuration) {
            $.configuration = configuration;
            return this;
        }

        /**
         * @param configuration Authorization server configuration
         * 
         * @return builder
         * 
         */
        public Builder configuration(AuthServersConfigurationArgs configuration) {
            return configuration(Output.of(configuration));
        }

        /**
         * @param description Description of what the API does.
         * 
         * @return builder
         * 
         */
        public Builder description(Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Description of what the API does.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param name Name of the API.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the API.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public AuthServersArgs build() {
            if ($.configuration == null) {
                throw new MissingRequiredPropertyException("AuthServersArgs", "configuration");
            }
            if ($.description == null) {
                throw new MissingRequiredPropertyException("AuthServersArgs", "description");
            }
            return $;
        }
    }

}
