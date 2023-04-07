// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.onelogin.apps.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RulesConditionArgs extends com.pulumi.resources.ResourceArgs {

    public static final RulesConditionArgs Empty = new RulesConditionArgs();

    @Import(name="operator")
    private @Nullable Output<String> operator;

    public Optional<Output<String>> operator() {
        return Optional.ofNullable(this.operator);
    }

    @Import(name="source")
    private @Nullable Output<String> source;

    public Optional<Output<String>> source() {
        return Optional.ofNullable(this.source);
    }

    @Import(name="value")
    private @Nullable Output<String> value;

    public Optional<Output<String>> value() {
        return Optional.ofNullable(this.value);
    }

    private RulesConditionArgs() {}

    private RulesConditionArgs(RulesConditionArgs $) {
        this.operator = $.operator;
        this.source = $.source;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RulesConditionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RulesConditionArgs $;

        public Builder() {
            $ = new RulesConditionArgs();
        }

        public Builder(RulesConditionArgs defaults) {
            $ = new RulesConditionArgs(Objects.requireNonNull(defaults));
        }

        public Builder operator(@Nullable Output<String> operator) {
            $.operator = operator;
            return this;
        }

        public Builder operator(String operator) {
            return operator(Output.of(operator));
        }

        public Builder source(@Nullable Output<String> source) {
            $.source = source;
            return this;
        }

        public Builder source(String source) {
            return source(Output.of(source));
        }

        public Builder value(@Nullable Output<String> value) {
            $.value = value;
            return this;
        }

        public Builder value(String value) {
            return value(Output.of(value));
        }

        public RulesConditionArgs build() {
            return $;
        }
    }

}