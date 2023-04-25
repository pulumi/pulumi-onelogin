// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.onelogin.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class GetAppsSsoCertificate extends com.pulumi.resources.InvokeArgs {

    public static final GetAppsSsoCertificate Empty = new GetAppsSsoCertificate();

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

    private GetAppsSsoCertificate() {}

    private GetAppsSsoCertificate(GetAppsSsoCertificate $) {
        this.id = $.id;
        this.name = $.name;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAppsSsoCertificate defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAppsSsoCertificate $;

        public Builder() {
            $ = new GetAppsSsoCertificate();
        }

        public Builder(GetAppsSsoCertificate defaults) {
            $ = new GetAppsSsoCertificate(Objects.requireNonNull(defaults));
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

        public GetAppsSsoCertificate build() {
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.value = Objects.requireNonNull($.value, "expected parameter 'value' to be non-null");
            return $;
        }
    }

}
