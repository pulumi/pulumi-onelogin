// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.onelogin.apps.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;


public final class GetInstanceEnforcementPointSessionExpiryFixedArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetInstanceEnforcementPointSessionExpiryFixedArgs Empty = new GetInstanceEnforcementPointSessionExpiryFixedArgs();

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

    private GetInstanceEnforcementPointSessionExpiryFixedArgs() {}

    private GetInstanceEnforcementPointSessionExpiryFixedArgs(GetInstanceEnforcementPointSessionExpiryFixedArgs $) {
        this.unit = $.unit;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetInstanceEnforcementPointSessionExpiryFixedArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetInstanceEnforcementPointSessionExpiryFixedArgs $;

        public Builder() {
            $ = new GetInstanceEnforcementPointSessionExpiryFixedArgs();
        }

        public Builder(GetInstanceEnforcementPointSessionExpiryFixedArgs defaults) {
            $ = new GetInstanceEnforcementPointSessionExpiryFixedArgs(Objects.requireNonNull(defaults));
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

        public GetInstanceEnforcementPointSessionExpiryFixedArgs build() {
            $.unit = Objects.requireNonNull($.unit, "expected parameter 'unit' to be non-null");
            $.value = Objects.requireNonNull($.value, "expected parameter 'value' to be non-null");
            return $;
        }
    }

}
