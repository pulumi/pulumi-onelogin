// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.onelogin;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.onelogin.PrivilegesArgs;
import com.pulumi.onelogin.Utilities;
import com.pulumi.onelogin.inputs.PrivilegesState;
import com.pulumi.onelogin.outputs.PrivilegesPrivilege;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

@ResourceType(type="onelogin:index/privileges:Privileges")
public class Privileges extends com.pulumi.resources.CustomResource {
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }
    @Export(name="privilege", refs={PrivilegesPrivilege.class}, tree="[0]")
    private Output<PrivilegesPrivilege> privilege;

    public Output<PrivilegesPrivilege> privilege() {
        return this.privilege;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Privileges(java.lang.String name) {
        this(name, PrivilegesArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Privileges(java.lang.String name, PrivilegesArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Privileges(java.lang.String name, PrivilegesArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("onelogin:index/privileges:Privileges", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private Privileges(java.lang.String name, Output<java.lang.String> id, @Nullable PrivilegesState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("onelogin:index/privileges:Privileges", name, state, makeResourceOptions(options, id), false);
    }

    private static PrivilegesArgs makeArgs(PrivilegesArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? PrivilegesArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Privileges get(java.lang.String name, Output<java.lang.String> id, @Nullable PrivilegesState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Privileges(name, id, state, options);
    }
}
