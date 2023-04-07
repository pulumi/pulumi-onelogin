// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.onelogin.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetRiskRulesInstanceSource extends com.pulumi.resources.InvokeArgs {

    public static final GetRiskRulesInstanceSource Empty = new GetRiskRulesInstanceSource();

    @Import(name="id", required=true)
    private String id;

    public String id() {
        return this.id;
    }

    @Import(name="name", required=true)
    private String name;

    public String name() {
        return this.name;
    }

    private GetRiskRulesInstanceSource() {}

    private GetRiskRulesInstanceSource(GetRiskRulesInstanceSource $) {
        this.id = $.id;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRiskRulesInstanceSource defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRiskRulesInstanceSource $;

        public Builder() {
            $ = new GetRiskRulesInstanceSource();
        }

        public Builder(GetRiskRulesInstanceSource defaults) {
            $ = new GetRiskRulesInstanceSource(Objects.requireNonNull(defaults));
        }

        public Builder id(String id) {
            $.id = id;
            return this;
        }

        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public GetRiskRulesInstanceSource build() {
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}