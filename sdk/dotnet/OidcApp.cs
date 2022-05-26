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
    /// Creates an OIDC Application.
    /// 
    /// This resource allows you to create and configure an OIDC Application.
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
    ///         var myOidcApp = new Onelogin.OidcApp("myOidcApp", new Onelogin.OidcAppArgs
    ///         {
    ///             AllowAssumedSignin = false,
    ///             Configuration = 
    ///             {
    ///                 { "access_token_expiration_minutes", "1" },
    ///                 { "login_url", "https://www.example.com" },
    ///                 { "oidc_application_type", "0" },
    ///                 { "post_logout_redirect_uri", "" },
    ///                 { "redirect_uri", "https://example.com/example" },
    ///                 { "refresh_token_expiration_minutes", "1" },
    ///                 { "token_endpoint_auth_method", "1" },
    ///             },
    ///             ConnectorId = 123456,
    ///             Description = "example OIDC app",
    ///             Notes = "example",
    ///             Parameters = 
    ///             {
    ///                 new Onelogin.Inputs.OidcAppParameterArgs
    ///                 {
    ///                     AttributesTransformations = "",
    ///                     DefaultValues = "",
    ///                     IncludeInSamlAssertion = false,
    ///                     Label = "example app parameter ",
    ///                     ParamKeyName = "example",
    ///                     ProvisionedEntitlements = false,
    ///                     SafeEntitlementsEnabled = false,
    ///                     SkipIfBlank = false,
    ///                     UserAttributeMacros = "",
    ///                     UserAttributeMappings = "",
    ///                     Values = "",
    ///                 },
    ///             },
    ///             Provisioning = 
    ///             {
    ///                 { "enabled", false },
    ///             },
    ///             Visible = true,
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// 
    /// ## Import
    /// 
    /// A OIDC App can be imported via the OneLogin App ID.
    /// 
    /// ```sh
    ///  $ pulumi import onelogin:index/oidcApp:OidcApp my_oidc_app &lt;app id&gt;
    /// ```
    /// </summary>
    [OneloginResourceType("onelogin:index/oidcApp:OidcApp")]
    public partial class OidcApp : Pulumi.CustomResource
    {
        /// <summary>
        /// Enable sign in when user has been assumed by the account owner. Defaults to `false`.
        /// </summary>
        [Output("allowAssumedSignin")]
        public Output<bool?> AllowAssumedSignin { get; private set; } = null!;

        /// <summary>
        /// The apps auth method. Refer to the [OneLogin Apps Documentation](https://developers.onelogin.com/api-docs/2/apps/app-resource) for a comprehensive list of available auth methods.
        /// </summary>
        [Output("authMethod")]
        public Output<int> AuthMethod { get; private set; } = null!;

        [Output("brandId")]
        public Output<int?> BrandId { get; private set; } = null!;

        /// <summary>
        /// OIDC settings that control the authentication flow e.g. redirect urls and token settings.
        /// </summary>
        [Output("configuration")]
        public Output<ImmutableDictionary<string, string>?> Configuration { get; private set; } = null!;

        /// <summary>
        /// The ID for the app connector, dictates the type of app (e.g. AWS Multi-Role App).
        /// </summary>
        [Output("connectorId")]
        public Output<int> ConnectorId { get; private set; } = null!;

        /// <summary>
        /// Timestamp for app's creation.
        /// </summary>
        [Output("createdAt")]
        public Output<string> CreatedAt { get; private set; } = null!;

        /// <summary>
        /// App description.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// The url for the app's icon.
        /// </summary>
        [Output("iconUrl")]
        public Output<string> IconUrl { get; private set; } = null!;

        /// <summary>
        /// The app's name.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Notes about the app.
        /// </summary>
        [Output("notes")]
        public Output<string?> Notes { get; private set; } = null!;

        /// <summary>
        /// a list of custom parameters for this app.
        /// </summary>
        [Output("parameters")]
        public Output<ImmutableArray<Outputs.OidcAppParameter>> Parameters { get; private set; } = null!;

        /// <summary>
        /// The security policy assigned to the app.
        /// </summary>
        [Output("policyId")]
        public Output<int> PolicyId { get; private set; } = null!;

        /// <summary>
        /// Settings regarding the app's provisioning ability.
        /// </summary>
        [Output("provisioning")]
        public Output<ImmutableDictionary<string, bool>> Provisioning { get; private set; } = null!;

        [Output("sso")]
        public Output<ImmutableDictionary<string, string>> Sso { get; private set; } = null!;

        /// <summary>
        /// The tab in which to display in OneLogin portal.
        /// </summary>
        [Output("tabId")]
        public Output<int> TabId { get; private set; } = null!;

        /// <summary>
        /// Timestamp for app's last update.
        /// </summary>
        [Output("updatedAt")]
        public Output<string> UpdatedAt { get; private set; } = null!;

        /// <summary>
        /// Determine if app should be visible in OneLogin portal. Defaults to `true`.
        /// </summary>
        [Output("visible")]
        public Output<bool?> Visible { get; private set; } = null!;


        /// <summary>
        /// Create a OidcApp resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public OidcApp(string name, OidcAppArgs args, CustomResourceOptions? options = null)
            : base("onelogin:index/oidcApp:OidcApp", name, args ?? new OidcAppArgs(), MakeResourceOptions(options, ""))
        {
        }

        private OidcApp(string name, Input<string> id, OidcAppState? state = null, CustomResourceOptions? options = null)
            : base("onelogin:index/oidcApp:OidcApp", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing OidcApp resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static OidcApp Get(string name, Input<string> id, OidcAppState? state = null, CustomResourceOptions? options = null)
        {
            return new OidcApp(name, id, state, options);
        }
    }

    public sealed class OidcAppArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Enable sign in when user has been assumed by the account owner. Defaults to `false`.
        /// </summary>
        [Input("allowAssumedSignin")]
        public Input<bool>? AllowAssumedSignin { get; set; }

        [Input("brandId")]
        public Input<int>? BrandId { get; set; }

        [Input("configuration")]
        private InputMap<string>? _configuration;

        /// <summary>
        /// OIDC settings that control the authentication flow e.g. redirect urls and token settings.
        /// </summary>
        public InputMap<string> Configuration
        {
            get => _configuration ?? (_configuration = new InputMap<string>());
            set => _configuration = value;
        }

        /// <summary>
        /// The ID for the app connector, dictates the type of app (e.g. AWS Multi-Role App).
        /// </summary>
        [Input("connectorId", required: true)]
        public Input<int> ConnectorId { get; set; } = null!;

        /// <summary>
        /// App description.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The app's name.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Notes about the app.
        /// </summary>
        [Input("notes")]
        public Input<string>? Notes { get; set; }

        [Input("parameters")]
        private InputList<Inputs.OidcAppParameterArgs>? _parameters;

        /// <summary>
        /// a list of custom parameters for this app.
        /// </summary>
        public InputList<Inputs.OidcAppParameterArgs> Parameters
        {
            get => _parameters ?? (_parameters = new InputList<Inputs.OidcAppParameterArgs>());
            set => _parameters = value;
        }

        [Input("provisioning")]
        private InputMap<bool>? _provisioning;

        /// <summary>
        /// Settings regarding the app's provisioning ability.
        /// </summary>
        public InputMap<bool> Provisioning
        {
            get => _provisioning ?? (_provisioning = new InputMap<bool>());
            set => _provisioning = value;
        }

        /// <summary>
        /// Determine if app should be visible in OneLogin portal. Defaults to `true`.
        /// </summary>
        [Input("visible")]
        public Input<bool>? Visible { get; set; }

        public OidcAppArgs()
        {
        }
    }

    public sealed class OidcAppState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Enable sign in when user has been assumed by the account owner. Defaults to `false`.
        /// </summary>
        [Input("allowAssumedSignin")]
        public Input<bool>? AllowAssumedSignin { get; set; }

        /// <summary>
        /// The apps auth method. Refer to the [OneLogin Apps Documentation](https://developers.onelogin.com/api-docs/2/apps/app-resource) for a comprehensive list of available auth methods.
        /// </summary>
        [Input("authMethod")]
        public Input<int>? AuthMethod { get; set; }

        [Input("brandId")]
        public Input<int>? BrandId { get; set; }

        [Input("configuration")]
        private InputMap<string>? _configuration;

        /// <summary>
        /// OIDC settings that control the authentication flow e.g. redirect urls and token settings.
        /// </summary>
        public InputMap<string> Configuration
        {
            get => _configuration ?? (_configuration = new InputMap<string>());
            set => _configuration = value;
        }

        /// <summary>
        /// The ID for the app connector, dictates the type of app (e.g. AWS Multi-Role App).
        /// </summary>
        [Input("connectorId")]
        public Input<int>? ConnectorId { get; set; }

        /// <summary>
        /// Timestamp for app's creation.
        /// </summary>
        [Input("createdAt")]
        public Input<string>? CreatedAt { get; set; }

        /// <summary>
        /// App description.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The url for the app's icon.
        /// </summary>
        [Input("iconUrl")]
        public Input<string>? IconUrl { get; set; }

        /// <summary>
        /// The app's name.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Notes about the app.
        /// </summary>
        [Input("notes")]
        public Input<string>? Notes { get; set; }

        [Input("parameters")]
        private InputList<Inputs.OidcAppParameterGetArgs>? _parameters;

        /// <summary>
        /// a list of custom parameters for this app.
        /// </summary>
        public InputList<Inputs.OidcAppParameterGetArgs> Parameters
        {
            get => _parameters ?? (_parameters = new InputList<Inputs.OidcAppParameterGetArgs>());
            set => _parameters = value;
        }

        /// <summary>
        /// The security policy assigned to the app.
        /// </summary>
        [Input("policyId")]
        public Input<int>? PolicyId { get; set; }

        [Input("provisioning")]
        private InputMap<bool>? _provisioning;

        /// <summary>
        /// Settings regarding the app's provisioning ability.
        /// </summary>
        public InputMap<bool> Provisioning
        {
            get => _provisioning ?? (_provisioning = new InputMap<bool>());
            set => _provisioning = value;
        }

        [Input("sso")]
        private InputMap<string>? _sso;
        public InputMap<string> Sso
        {
            get => _sso ?? (_sso = new InputMap<string>());
            set => _sso = value;
        }

        /// <summary>
        /// The tab in which to display in OneLogin portal.
        /// </summary>
        [Input("tabId")]
        public Input<int>? TabId { get; set; }

        /// <summary>
        /// Timestamp for app's last update.
        /// </summary>
        [Input("updatedAt")]
        public Input<string>? UpdatedAt { get; set; }

        /// <summary>
        /// Determine if app should be visible in OneLogin portal. Defaults to `true`.
        /// </summary>
        [Input("visible")]
        public Input<bool>? Visible { get; set; }

        public OidcAppState()
        {
        }
    }
}
