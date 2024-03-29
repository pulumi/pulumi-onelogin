// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.onelogin.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.util.Objects;


public final class GetAppsEnforcementPointSessionExpiryInactivity extends com.pulumi.resources.InvokeArgs {

    public static final GetAppsEnforcementPointSessionExpiryInactivity Empty = new GetAppsEnforcementPointSessionExpiryInactivity();

    @Import(name="unit", required=true)
    private Integer unit;

    public Integer unit() {
        return this.unit;
    }

    @Import(name="value", required=true)
    private Integer value;

    public Integer value() {
        return this.value;
    }

    private GetAppsEnforcementPointSessionExpiryInactivity() {}

    private GetAppsEnforcementPointSessionExpiryInactivity(GetAppsEnforcementPointSessionExpiryInactivity $) {
        this.unit = $.unit;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAppsEnforcementPointSessionExpiryInactivity defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAppsEnforcementPointSessionExpiryInactivity $;

        public Builder() {
            $ = new GetAppsEnforcementPointSessionExpiryInactivity();
        }

        public Builder(GetAppsEnforcementPointSessionExpiryInactivity defaults) {
            $ = new GetAppsEnforcementPointSessionExpiryInactivity(Objects.requireNonNull(defaults));
        }

        public Builder unit(Integer unit) {
            $.unit = unit;
            return this;
        }

        public Builder value(Integer value) {
            $.value = value;
            return this;
        }

        public GetAppsEnforcementPointSessionExpiryInactivity build() {
            if ($.unit == null) {
                throw new MissingRequiredPropertyException("GetAppsEnforcementPointSessionExpiryInactivity", "unit");
            }
            if ($.value == null) {
                throw new MissingRequiredPropertyException("GetAppsEnforcementPointSessionExpiryInactivity", "value");
            }
            return $;
        }
    }

}
