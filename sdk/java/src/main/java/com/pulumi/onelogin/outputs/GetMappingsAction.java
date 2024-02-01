// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.onelogin.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetMappingsAction {
    /**
     * @return The action to apply
     * 
     */
    private String action;
    /**
     * @return Only applicable to provisioned and set_* actions. Items in the array will be a plain text string or valid value for the selected action.
     * 
     */
    private List<String> values;

    private GetMappingsAction() {}
    /**
     * @return The action to apply
     * 
     */
    public String action() {
        return this.action;
    }
    /**
     * @return Only applicable to provisioned and set_* actions. Items in the array will be a plain text string or valid value for the selected action.
     * 
     */
    public List<String> values() {
        return this.values;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetMappingsAction defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String action;
        private List<String> values;
        public Builder() {}
        public Builder(GetMappingsAction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.values = defaults.values;
        }

        @CustomType.Setter
        public Builder action(String action) {
            if (action == null) {
              throw new MissingRequiredPropertyException("GetMappingsAction", "action");
            }
            this.action = action;
            return this;
        }
        @CustomType.Setter
        public Builder values(List<String> values) {
            if (values == null) {
              throw new MissingRequiredPropertyException("GetMappingsAction", "values");
            }
            this.values = values;
            return this;
        }
        public Builder values(String... values) {
            return values(List.of(values));
        }
        public GetMappingsAction build() {
            final var _resultValue = new GetMappingsAction();
            _resultValue.action = action;
            _resultValue.values = values;
            return _resultValue;
        }
    }
}
