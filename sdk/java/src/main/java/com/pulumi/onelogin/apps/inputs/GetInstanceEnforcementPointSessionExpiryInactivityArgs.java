// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.onelogin.apps.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.util.Objects;


public final class GetInstanceEnforcementPointSessionExpiryInactivityArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetInstanceEnforcementPointSessionExpiryInactivityArgs Empty = new GetInstanceEnforcementPointSessionExpiryInactivityArgs();

    @Import(name="unit", required=true)
    private Output<Integer> unit;

    public Output<Integer> unit() {
        return this.unit;
    }

    @Import(name="value", required=true)
    private Output<Integer> value;

    public Output<Integer> value() {
        return this.value;
    }

    private GetInstanceEnforcementPointSessionExpiryInactivityArgs() {}

    private GetInstanceEnforcementPointSessionExpiryInactivityArgs(GetInstanceEnforcementPointSessionExpiryInactivityArgs $) {
        this.unit = $.unit;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetInstanceEnforcementPointSessionExpiryInactivityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetInstanceEnforcementPointSessionExpiryInactivityArgs $;

        public Builder() {
            $ = new GetInstanceEnforcementPointSessionExpiryInactivityArgs();
        }

        public Builder(GetInstanceEnforcementPointSessionExpiryInactivityArgs defaults) {
            $ = new GetInstanceEnforcementPointSessionExpiryInactivityArgs(Objects.requireNonNull(defaults));
        }

        public Builder unit(Output<Integer> unit) {
            $.unit = unit;
            return this;
        }

        public Builder unit(Integer unit) {
            return unit(Output.of(unit));
        }

        public Builder value(Output<Integer> value) {
            $.value = value;
            return this;
        }

        public Builder value(Integer value) {
            return value(Output.of(value));
        }

        public GetInstanceEnforcementPointSessionExpiryInactivityArgs build() {
            if ($.unit == null) {
                throw new MissingRequiredPropertyException("GetInstanceEnforcementPointSessionExpiryInactivityArgs", "unit");
            }
            if ($.value == null) {
                throw new MissingRequiredPropertyException("GetInstanceEnforcementPointSessionExpiryInactivityArgs", "value");
            }
            return $;
        }
    }

}
