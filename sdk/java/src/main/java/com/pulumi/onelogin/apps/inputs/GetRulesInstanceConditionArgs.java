// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.onelogin.apps.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetRulesInstanceConditionArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetRulesInstanceConditionArgs Empty = new GetRulesInstanceConditionArgs();

    @Import(name="operator", required=true)
    private Output<String> operator;

    public Output<String> operator() {
        return this.operator;
    }

    @Import(name="source", required=true)
    private Output<String> source;

    public Output<String> source() {
        return this.source;
    }

    @Import(name="value", required=true)
    private Output<String> value;

    public Output<String> value() {
        return this.value;
    }

    private GetRulesInstanceConditionArgs() {}

    private GetRulesInstanceConditionArgs(GetRulesInstanceConditionArgs $) {
        this.operator = $.operator;
        this.source = $.source;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRulesInstanceConditionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRulesInstanceConditionArgs $;

        public Builder() {
            $ = new GetRulesInstanceConditionArgs();
        }

        public Builder(GetRulesInstanceConditionArgs defaults) {
            $ = new GetRulesInstanceConditionArgs(Objects.requireNonNull(defaults));
        }

        public Builder operator(Output<String> operator) {
            $.operator = operator;
            return this;
        }

        public Builder operator(String operator) {
            return operator(Output.of(operator));
        }

        public Builder source(Output<String> source) {
            $.source = source;
            return this;
        }

        public Builder source(String source) {
            return source(Output.of(source));
        }

        public Builder value(Output<String> value) {
            $.value = value;
            return this;
        }

        public Builder value(String value) {
            return value(Output.of(value));
        }

        public GetRulesInstanceConditionArgs build() {
            if ($.operator == null) {
                throw new MissingRequiredPropertyException("GetRulesInstanceConditionArgs", "operator");
            }
            if ($.source == null) {
                throw new MissingRequiredPropertyException("GetRulesInstanceConditionArgs", "source");
            }
            if ($.value == null) {
                throw new MissingRequiredPropertyException("GetRulesInstanceConditionArgs", "value");
            }
            return $;
        }
    }

}
