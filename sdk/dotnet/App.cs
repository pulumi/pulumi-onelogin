// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Onelogin
{
    [OneloginResourceType("onelogin:index/app:App")]
    public partial class App : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Indicates whether or not administrators can access the app as a user that they have assumed control over.
        /// </summary>
        [Output("allowAssumedSignin")]
        public Output<bool?> AllowAssumedSignin { get; private set; } = null!;

        /// <summary>
        /// An ID indicating the type of app: - 0: Password - 1: OpenId - 2: SAML - 3: API - 4: Google - 6: Forms Based App - 7:
        /// WSFED - 8: OpenId Connect
        /// </summary>
        [Output("authMethod")]
        public Output<int?> AuthMethod { get; private set; } = null!;

        [Output("authMethodDescription")]
        public Output<string> AuthMethodDescription { get; private set; } = null!;

        [Output("brandId")]
        public Output<int?> BrandId { get; private set; } = null!;

        /// <summary>
        /// Only apply configurations that are applicable to the type of app
        /// </summary>
        [Output("configuration")]
        public Output<Outputs.AppConfiguration> Configuration { get; private set; } = null!;

        /// <summary>
        /// ID of the connector to base the app from.
        /// </summary>
        [Output("connectorId")]
        public Output<int> ConnectorId { get; private set; } = null!;

        /// <summary>
        /// the date the app was created
        /// </summary>
        [Output("createdAt")]
        public Output<string> CreatedAt { get; private set; } = null!;

        /// <summary>
        /// Freeform description of the app.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// For apps that connect to a OneLogin Access Enforcement Point the following enforcement_point object will be included
        /// with the app payload.
        /// </summary>
        [Output("enforcementPoint")]
        public Output<Outputs.AppEnforcementPoint?> EnforcementPoint { get; private set; } = null!;

        /// <summary>
        /// A link to the apps icon url
        /// </summary>
        [Output("iconUrl")]
        public Output<string?> IconUrl { get; private set; } = null!;

        [Output("loginConfig")]
        public Output<int> LoginConfig { get; private set; } = null!;

        /// <summary>
        /// The name of the app.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Freeform notes about the app.
        /// </summary>
        [Output("notes")]
        public Output<string?> Notes { get; private set; } = null!;

        [Output("parameters")]
        public Output<Outputs.AppParameters> Parameters { get; private set; } = null!;

        /// <summary>
        /// The security policy assigned to the app.
        /// </summary>
        [Output("policyId")]
        public Output<int?> PolicyId { get; private set; } = null!;

        /// <summary>
        /// Indicates if provisioning is enabled for this app.
        /// </summary>
        [Output("provisioning")]
        public Output<Outputs.AppProvisioning?> Provisioning { get; private set; } = null!;

        /// <summary>
        /// List of Role IDs that are assigned to the app. On App Create or Update the entire array is replaced with the values
        /// provided.
        /// </summary>
        [Output("roleIds")]
        public Output<ImmutableArray<int>> RoleIds { get; private set; } = null!;

        /// <summary>
        /// The attributes included in the sso section are determined by the type of app. All of the attributes of the `sso` object
        /// are read only.
        /// </summary>
        [Output("sso")]
        public Output<Outputs.AppSso> Sso { get; private set; } = null!;

        /// <summary>
        /// ID of the OneLogin portal tab that the app is assigned to.
        /// </summary>
        [Output("tabId")]
        public Output<int?> TabId { get; private set; } = null!;

        /// <summary>
        /// the date the app was last updated
        /// </summary>
        [Output("updatedAt")]
        public Output<string> UpdatedAt { get; private set; } = null!;

        /// <summary>
        /// Indicates if the app is visible in the OneLogin portal.
        /// </summary>
        [Output("visible")]
        public Output<bool?> Visible { get; private set; } = null!;


        /// <summary>
        /// Create a App resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public App(string name, AppArgs args, CustomResourceOptions? options = null)
            : base("onelogin:index/app:App", name, args ?? new AppArgs(), MakeResourceOptions(options, ""))
        {
        }

        private App(string name, Input<string> id, AppState? state = null, CustomResourceOptions? options = null)
            : base("onelogin:index/app:App", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing App resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static App Get(string name, Input<string> id, AppState? state = null, CustomResourceOptions? options = null)
        {
            return new App(name, id, state, options);
        }
    }

    public sealed class AppArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Indicates whether or not administrators can access the app as a user that they have assumed control over.
        /// </summary>
        [Input("allowAssumedSignin")]
        public Input<bool>? AllowAssumedSignin { get; set; }

        /// <summary>
        /// An ID indicating the type of app: - 0: Password - 1: OpenId - 2: SAML - 3: API - 4: Google - 6: Forms Based App - 7:
        /// WSFED - 8: OpenId Connect
        /// </summary>
        [Input("authMethod")]
        public Input<int>? AuthMethod { get; set; }

        [Input("authMethodDescription")]
        public Input<string>? AuthMethodDescription { get; set; }

        [Input("brandId")]
        public Input<int>? BrandId { get; set; }

        /// <summary>
        /// Only apply configurations that are applicable to the type of app
        /// </summary>
        [Input("configuration")]
        public Input<Inputs.AppConfigurationArgs>? Configuration { get; set; }

        /// <summary>
        /// ID of the connector to base the app from.
        /// </summary>
        [Input("connectorId", required: true)]
        public Input<int> ConnectorId { get; set; } = null!;

        /// <summary>
        /// the date the app was created
        /// </summary>
        [Input("createdAt")]
        public Input<string>? CreatedAt { get; set; }

        /// <summary>
        /// Freeform description of the app.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// For apps that connect to a OneLogin Access Enforcement Point the following enforcement_point object will be included
        /// with the app payload.
        /// </summary>
        [Input("enforcementPoint")]
        public Input<Inputs.AppEnforcementPointArgs>? EnforcementPoint { get; set; }

        /// <summary>
        /// A link to the apps icon url
        /// </summary>
        [Input("iconUrl")]
        public Input<string>? IconUrl { get; set; }

        [Input("loginConfig")]
        public Input<int>? LoginConfig { get; set; }

        /// <summary>
        /// The name of the app.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Freeform notes about the app.
        /// </summary>
        [Input("notes")]
        public Input<string>? Notes { get; set; }

        [Input("parameters")]
        public Input<Inputs.AppParametersArgs>? Parameters { get; set; }

        /// <summary>
        /// The security policy assigned to the app.
        /// </summary>
        [Input("policyId")]
        public Input<int>? PolicyId { get; set; }

        /// <summary>
        /// Indicates if provisioning is enabled for this app.
        /// </summary>
        [Input("provisioning")]
        public Input<Inputs.AppProvisioningArgs>? Provisioning { get; set; }

        [Input("roleIds")]
        private InputList<int>? _roleIds;

        /// <summary>
        /// List of Role IDs that are assigned to the app. On App Create or Update the entire array is replaced with the values
        /// provided.
        /// </summary>
        public InputList<int> RoleIds
        {
            get => _roleIds ?? (_roleIds = new InputList<int>());
            set => _roleIds = value;
        }

        /// <summary>
        /// The attributes included in the sso section are determined by the type of app. All of the attributes of the `sso` object
        /// are read only.
        /// </summary>
        [Input("sso")]
        public Input<Inputs.AppSsoArgs>? Sso { get; set; }

        /// <summary>
        /// ID of the OneLogin portal tab that the app is assigned to.
        /// </summary>
        [Input("tabId")]
        public Input<int>? TabId { get; set; }

        /// <summary>
        /// the date the app was last updated
        /// </summary>
        [Input("updatedAt")]
        public Input<string>? UpdatedAt { get; set; }

        /// <summary>
        /// Indicates if the app is visible in the OneLogin portal.
        /// </summary>
        [Input("visible")]
        public Input<bool>? Visible { get; set; }

        public AppArgs()
        {
        }
        public static new AppArgs Empty => new AppArgs();
    }

    public sealed class AppState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Indicates whether or not administrators can access the app as a user that they have assumed control over.
        /// </summary>
        [Input("allowAssumedSignin")]
        public Input<bool>? AllowAssumedSignin { get; set; }

        /// <summary>
        /// An ID indicating the type of app: - 0: Password - 1: OpenId - 2: SAML - 3: API - 4: Google - 6: Forms Based App - 7:
        /// WSFED - 8: OpenId Connect
        /// </summary>
        [Input("authMethod")]
        public Input<int>? AuthMethod { get; set; }

        [Input("authMethodDescription")]
        public Input<string>? AuthMethodDescription { get; set; }

        [Input("brandId")]
        public Input<int>? BrandId { get; set; }

        /// <summary>
        /// Only apply configurations that are applicable to the type of app
        /// </summary>
        [Input("configuration")]
        public Input<Inputs.AppConfigurationGetArgs>? Configuration { get; set; }

        /// <summary>
        /// ID of the connector to base the app from.
        /// </summary>
        [Input("connectorId")]
        public Input<int>? ConnectorId { get; set; }

        /// <summary>
        /// the date the app was created
        /// </summary>
        [Input("createdAt")]
        public Input<string>? CreatedAt { get; set; }

        /// <summary>
        /// Freeform description of the app.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// For apps that connect to a OneLogin Access Enforcement Point the following enforcement_point object will be included
        /// with the app payload.
        /// </summary>
        [Input("enforcementPoint")]
        public Input<Inputs.AppEnforcementPointGetArgs>? EnforcementPoint { get; set; }

        /// <summary>
        /// A link to the apps icon url
        /// </summary>
        [Input("iconUrl")]
        public Input<string>? IconUrl { get; set; }

        [Input("loginConfig")]
        public Input<int>? LoginConfig { get; set; }

        /// <summary>
        /// The name of the app.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Freeform notes about the app.
        /// </summary>
        [Input("notes")]
        public Input<string>? Notes { get; set; }

        [Input("parameters")]
        public Input<Inputs.AppParametersGetArgs>? Parameters { get; set; }

        /// <summary>
        /// The security policy assigned to the app.
        /// </summary>
        [Input("policyId")]
        public Input<int>? PolicyId { get; set; }

        /// <summary>
        /// Indicates if provisioning is enabled for this app.
        /// </summary>
        [Input("provisioning")]
        public Input<Inputs.AppProvisioningGetArgs>? Provisioning { get; set; }

        [Input("roleIds")]
        private InputList<int>? _roleIds;

        /// <summary>
        /// List of Role IDs that are assigned to the app. On App Create or Update the entire array is replaced with the values
        /// provided.
        /// </summary>
        public InputList<int> RoleIds
        {
            get => _roleIds ?? (_roleIds = new InputList<int>());
            set => _roleIds = value;
        }

        /// <summary>
        /// The attributes included in the sso section are determined by the type of app. All of the attributes of the `sso` object
        /// are read only.
        /// </summary>
        [Input("sso")]
        public Input<Inputs.AppSsoGetArgs>? Sso { get; set; }

        /// <summary>
        /// ID of the OneLogin portal tab that the app is assigned to.
        /// </summary>
        [Input("tabId")]
        public Input<int>? TabId { get; set; }

        /// <summary>
        /// the date the app was last updated
        /// </summary>
        [Input("updatedAt")]
        public Input<string>? UpdatedAt { get; set; }

        /// <summary>
        /// Indicates if the app is visible in the OneLogin portal.
        /// </summary>
        [Input("visible")]
        public Input<bool>? Visible { get; set; }

        public AppState()
        {
        }
        public static new AppState Empty => new AppState();
    }
}
