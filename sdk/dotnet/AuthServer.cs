// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Onelogin
{
    /// <summary>
    /// Creates an Authentication Server Resource.
    /// 
    /// This resource allows you to create and configure an Authentication Server.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using Onelogin = Pulumi.Onelogin;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         var example = new Onelogin.AuthServer("example", new Onelogin.AuthServerArgs
    ///         {
    ///             Configuration = new Onelogin.Inputs.AuthServerConfigurationArgs
    ///             {
    ///                 AccessTokenExpirationMinutes = 10,
    ///                 Audiences = 
    ///                 {
    ///                     "https://example.com/contacts",
    ///                 },
    ///                 RefreshTokenExpirationMinutes = 30,
    ///                 ResourceIdentifier = "https://example.com/contacts",
    ///             },
    ///             Description = "This is an api",
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// 
    /// ## Import
    /// 
    /// An Auth Server can be imported via the OneLogin Auth Server ID.
    /// 
    /// ```sh
    ///  $ pulumi import onelogin:index/authServer:AuthServer example &lt;auth_server_id&gt;
    /// ```
    /// </summary>
    [OneloginResourceType("onelogin:index/authServer:AuthServer")]
    public partial class AuthServer : Pulumi.CustomResource
    {
        /// <summary>
        /// Configuration parameters
        /// </summary>
        [Output("configuration")]
        public Output<Outputs.AuthServerConfiguration> Configuration { get; private set; } = null!;

        /// <summary>
        /// A brief description about the resource.
        /// </summary>
        [Output("description")]
        public Output<string> Description { get; private set; } = null!;

        /// <summary>
        /// The resource's name.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;


        /// <summary>
        /// Create a AuthServer resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public AuthServer(string name, AuthServerArgs args, CustomResourceOptions? options = null)
            : base("onelogin:index/authServer:AuthServer", name, args ?? new AuthServerArgs(), MakeResourceOptions(options, ""))
        {
        }

        private AuthServer(string name, Input<string> id, AuthServerState? state = null, CustomResourceOptions? options = null)
            : base("onelogin:index/authServer:AuthServer", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing AuthServer resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static AuthServer Get(string name, Input<string> id, AuthServerState? state = null, CustomResourceOptions? options = null)
        {
            return new AuthServer(name, id, state, options);
        }
    }

    public sealed class AuthServerArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Configuration parameters
        /// </summary>
        [Input("configuration", required: true)]
        public Input<Inputs.AuthServerConfigurationArgs> Configuration { get; set; } = null!;

        /// <summary>
        /// A brief description about the resource.
        /// </summary>
        [Input("description", required: true)]
        public Input<string> Description { get; set; } = null!;

        /// <summary>
        /// The resource's name.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        public AuthServerArgs()
        {
        }
    }

    public sealed class AuthServerState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Configuration parameters
        /// </summary>
        [Input("configuration")]
        public Input<Inputs.AuthServerConfigurationGetArgs>? Configuration { get; set; }

        /// <summary>
        /// A brief description about the resource.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The resource's name.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        public AuthServerState()
        {
        }
    }
}