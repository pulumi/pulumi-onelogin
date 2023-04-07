// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.onelogin.apps.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.onelogin.apps.outputs.GetRulesInstanceAction;
import com.pulumi.onelogin.apps.outputs.GetRulesInstanceCondition;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetRulesInstanceResult {
    private List<GetRulesInstanceAction> actions;
    private String appsId;
    private List<GetRulesInstanceCondition> conditions;
    private Boolean enabled;
    private String id;
    private String match;
    private String name;
    private Integer position;

    private GetRulesInstanceResult() {}
    public List<GetRulesInstanceAction> actions() {
        return this.actions;
    }
    public String appsId() {
        return this.appsId;
    }
    public List<GetRulesInstanceCondition> conditions() {
        return this.conditions;
    }
    public Boolean enabled() {
        return this.enabled;
    }
    public String id() {
        return this.id;
    }
    public String match() {
        return this.match;
    }
    public String name() {
        return this.name;
    }
    public Integer position() {
        return this.position;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRulesInstanceResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetRulesInstanceAction> actions;
        private String appsId;
        private List<GetRulesInstanceCondition> conditions;
        private Boolean enabled;
        private String id;
        private String match;
        private String name;
        private Integer position;
        public Builder() {}
        public Builder(GetRulesInstanceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actions = defaults.actions;
    	      this.appsId = defaults.appsId;
    	      this.conditions = defaults.conditions;
    	      this.enabled = defaults.enabled;
    	      this.id = defaults.id;
    	      this.match = defaults.match;
    	      this.name = defaults.name;
    	      this.position = defaults.position;
        }

        @CustomType.Setter
        public Builder actions(List<GetRulesInstanceAction> actions) {
            this.actions = Objects.requireNonNull(actions);
            return this;
        }
        public Builder actions(GetRulesInstanceAction... actions) {
            return actions(List.of(actions));
        }
        @CustomType.Setter
        public Builder appsId(String appsId) {
            this.appsId = Objects.requireNonNull(appsId);
            return this;
        }
        @CustomType.Setter
        public Builder conditions(List<GetRulesInstanceCondition> conditions) {
            this.conditions = Objects.requireNonNull(conditions);
            return this;
        }
        public Builder conditions(GetRulesInstanceCondition... conditions) {
            return conditions(List.of(conditions));
        }
        @CustomType.Setter
        public Builder enabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder match(String match) {
            this.match = Objects.requireNonNull(match);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder position(Integer position) {
            this.position = Objects.requireNonNull(position);
            return this;
        }
        public GetRulesInstanceResult build() {
            final var o = new GetRulesInstanceResult();
            o.actions = actions;
            o.appsId = appsId;
            o.conditions = conditions;
            o.enabled = enabled;
            o.id = id;
            o.match = match;
            o.name = name;
            o.position = position;
            return o;
        }
    }
}