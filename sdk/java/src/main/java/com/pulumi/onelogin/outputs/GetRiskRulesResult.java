// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.onelogin.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.onelogin.outputs.GetRiskRulesFilter;
import com.pulumi.onelogin.outputs.GetRiskRulesSource;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetRiskRulesResult {
    private String description;
    private @Nullable List<GetRiskRulesFilter> filter;
    private List<String> filters;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private String name;
    private GetRiskRulesSource source;
    private String target;
    private String type;

    private GetRiskRulesResult() {}
    public String description() {
        return this.description;
    }
    public List<GetRiskRulesFilter> filter() {
        return this.filter == null ? List.of() : this.filter;
    }
    public List<String> filters() {
        return this.filters;
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
    public GetRiskRulesSource source() {
        return this.source;
    }
    public String target() {
        return this.target;
    }
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRiskRulesResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String description;
        private @Nullable List<GetRiskRulesFilter> filter;
        private List<String> filters;
        private String id;
        private String name;
        private GetRiskRulesSource source;
        private String target;
        private String type;
        public Builder() {}
        public Builder(GetRiskRulesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.filter = defaults.filter;
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.source = defaults.source;
    	      this.target = defaults.target;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        @CustomType.Setter
        public Builder filter(@Nullable List<GetRiskRulesFilter> filter) {
            this.filter = filter;
            return this;
        }
        public Builder filter(GetRiskRulesFilter... filter) {
            return filter(List.of(filter));
        }
        @CustomType.Setter
        public Builder filters(List<String> filters) {
            this.filters = Objects.requireNonNull(filters);
            return this;
        }
        public Builder filters(String... filters) {
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
        public Builder source(GetRiskRulesSource source) {
            this.source = Objects.requireNonNull(source);
            return this;
        }
        @CustomType.Setter
        public Builder target(String target) {
            this.target = Objects.requireNonNull(target);
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetRiskRulesResult build() {
            final var o = new GetRiskRulesResult();
            o.description = description;
            o.filter = filter;
            o.filters = filters;
            o.id = id;
            o.name = name;
            o.source = source;
            o.target = target;
            o.type = type;
            return o;
        }
    }
}