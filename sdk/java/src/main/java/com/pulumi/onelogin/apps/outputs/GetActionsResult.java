// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.onelogin.apps.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.onelogin.apps.outputs.GetActionsFilter;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetActionsResult {
    private String appsId;
    private @Nullable List<GetActionsFilter> filters;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private String name;
    private String value;

    private GetActionsResult() {}
    public String appsId() {
        return this.appsId;
    }
    public List<GetActionsFilter> filters() {
        return this.filters == null ? List.of() : this.filters;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String name() {
        return this.name;
    }
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetActionsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String appsId;
        private @Nullable List<GetActionsFilter> filters;
        private String id;
        private String name;
        private String value;
        public Builder() {}
        public Builder(GetActionsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appsId = defaults.appsId;
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder appsId(String appsId) {
            this.appsId = Objects.requireNonNull(appsId);
            return this;
        }
        @CustomType.Setter
        public Builder filters(@Nullable List<GetActionsFilter> filters) {
            this.filters = filters;
            return this;
        }
        public Builder filters(GetActionsFilter... filters) {
            return filters(List.of(filters));
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public GetActionsResult build() {
            final var o = new GetActionsResult();
            o.appsId = appsId;
            o.filters = filters;
            o.id = id;
            o.name = name;
            o.value = value;
            return o;
        }
    }
}
