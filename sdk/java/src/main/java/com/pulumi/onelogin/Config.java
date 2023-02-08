// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.onelogin;

import com.pulumi.core.TypeShape;
import com.pulumi.core.internal.Codegen;
import com.pulumi.onelogin.config.inputs.Endpoints;
import java.lang.String;
import java.util.List;
import java.util.Optional;

public final class Config {

    private static final com.pulumi.Config config = com.pulumi.Config.of("onelogin");
    public Optional<String> authorization() {
        return Codegen.stringProp("authorization").config(config).get();
    }
    public Optional<String> bearerAuth() {
        return Codegen.stringProp("bearerAuth").config(config).get();
    }
    public Optional<String> contentType() {
        return Codegen.stringProp("contentType").config(config).get();
    }
    public Optional<List<Endpoints>> endpoints() {
        return Codegen.objectProp("endpoints", TypeShape.<List<Endpoints>>builder(List.class).addParameter(Endpoints.class).build()).config(config).get();
    }
}
