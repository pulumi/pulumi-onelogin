// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.onelogin.apps.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class GetInstanceSsoCertificate extends com.pulumi.resources.InvokeArgs {

    public static final GetInstanceSsoCertificate Empty = new GetInstanceSsoCertificate();

    @Import(name="id", required=true)
    private Integer id;

    public Integer id() {
        return this.id;
    }

    @Import(name="name", required=true)
    private String name;

    public String name() {
        return this.name;
    }

    @Import(name="value", required=true)
    private String value;

    public String value() {
        return this.value;
    }

    private GetInstanceSsoCertificate() {}

    private GetInstanceSsoCertificate(GetInstanceSsoCertificate $) {
        this.id = $.id;
        this.name = $.name;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetInstanceSsoCertificate defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetInstanceSsoCertificate $;

        public Builder() {
            $ = new GetInstanceSsoCertificate();
        }

        public Builder(GetInstanceSsoCertificate defaults) {
            $ = new GetInstanceSsoCertificate(Objects.requireNonNull(defaults));
        }

        public Builder id(Integer id) {
            $.id = id;
            return this;
        }

        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public Builder value(String value) {
            $.value = value;
            return this;
        }

        public GetInstanceSsoCertificate build() {
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.value = Objects.requireNonNull($.value, "expected parameter 'value' to be non-null");
            return $;
        }
    }

}