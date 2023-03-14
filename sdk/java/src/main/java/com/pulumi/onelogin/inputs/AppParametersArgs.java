// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.onelogin.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AppParametersArgs extends com.pulumi.resources.ResourceArgs {

    public static final AppParametersArgs Empty = new AppParametersArgs();

    @Import(name="includeInSamlAssertion")
    private @Nullable Output<Boolean> includeInSamlAssertion;

    public Optional<Output<Boolean>> includeInSamlAssertion() {
        return Optional.ofNullable(this.includeInSamlAssertion);
    }

    @Import(name="label")
    private @Nullable Output<String> label;

    public Optional<Output<String>> label() {
        return Optional.ofNullable(this.label);
    }

    @Import(name="userAttributeMacros")
    private @Nullable Output<String> userAttributeMacros;

    public Optional<Output<String>> userAttributeMacros() {
        return Optional.ofNullable(this.userAttributeMacros);
    }

    @Import(name="userAttributeMappings")
    private @Nullable Output<String> userAttributeMappings;

    public Optional<Output<String>> userAttributeMappings() {
        return Optional.ofNullable(this.userAttributeMappings);
    }

    private AppParametersArgs() {}

    private AppParametersArgs(AppParametersArgs $) {
        this.includeInSamlAssertion = $.includeInSamlAssertion;
        this.label = $.label;
        this.userAttributeMacros = $.userAttributeMacros;
        this.userAttributeMappings = $.userAttributeMappings;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AppParametersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AppParametersArgs $;

        public Builder() {
            $ = new AppParametersArgs();
        }

        public Builder(AppParametersArgs defaults) {
            $ = new AppParametersArgs(Objects.requireNonNull(defaults));
        }

        public Builder includeInSamlAssertion(@Nullable Output<Boolean> includeInSamlAssertion) {
            $.includeInSamlAssertion = includeInSamlAssertion;
            return this;
        }

        public Builder includeInSamlAssertion(Boolean includeInSamlAssertion) {
            return includeInSamlAssertion(Output.of(includeInSamlAssertion));
        }

        public Builder label(@Nullable Output<String> label) {
            $.label = label;
            return this;
        }

        public Builder label(String label) {
            return label(Output.of(label));
        }

        public Builder userAttributeMacros(@Nullable Output<String> userAttributeMacros) {
            $.userAttributeMacros = userAttributeMacros;
            return this;
        }

        public Builder userAttributeMacros(String userAttributeMacros) {
            return userAttributeMacros(Output.of(userAttributeMacros));
        }

        public Builder userAttributeMappings(@Nullable Output<String> userAttributeMappings) {
            $.userAttributeMappings = userAttributeMappings;
            return this;
        }

        public Builder userAttributeMappings(String userAttributeMappings) {
            return userAttributeMappings(Output.of(userAttributeMappings));
        }

        public AppParametersArgs build() {
            return $;
        }
    }

}
