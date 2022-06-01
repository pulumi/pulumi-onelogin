// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Onelogin.Outputs
{

    [OutputType]
    public sealed class SamlAppParameter
    {
        /// <summary>
        /// Describes how the app's attributes should be transformed.
        /// </summary>
        public readonly string? AttributesTransformations;
        /// <summary>
        /// Default parameter values.
        /// </summary>
        public readonly string? DefaultValues;
        /// <summary>
        /// When true, this parameter will be included in a SAML assertion payload.
        /// </summary>
        public readonly bool? IncludeInSamlAssertion;
        /// <summary>
        /// The can only be set when creating a new parameter. It can not be updated.
        /// </summary>
        public readonly string? Label;
        /// <summary>
        /// The parameter ID.
        /// </summary>
        public readonly int? ParamId;
        /// <summary>
        /// Name to represent the parameter in OneLogin.
        /// </summary>
        public readonly string ParamKeyName;
        /// <summary>
        /// Provisioned access entitlements for the app. Defaults to `false`.
        /// </summary>
        public readonly bool? ProvisionedEntitlements;
        /// <summary>
        /// Indicates that the parameter is used to support creating entitlements using OneLogin Mappings. Defaults to `false`.
        /// </summary>
        public readonly bool? SafeEntitlementsEnabled;
        /// <summary>
        /// Flag to let the SCIM provisioner know not include this value if it's blank. Defaults to `false`.
        /// </summary>
        public readonly bool? SkipIfBlank;
        /// <summary>
        /// When `user_attribute_mappings` is set to `_macro_` this macro will be used to assign the parameter value.
        /// </summary>
        public readonly string? UserAttributeMacros;
        /// <summary>
        /// A user attribute to map values from. For custom attributes prefix the name of the attribute with `custom_attribute_`.
        /// </summary>
        public readonly string? UserAttributeMappings;
        /// <summary>
        /// Parameter values.
        /// </summary>
        public readonly string? Values;

        [OutputConstructor]
        private SamlAppParameter(
            string? attributesTransformations,

            string? defaultValues,

            bool? includeInSamlAssertion,

            string? label,

            int? paramId,

            string paramKeyName,

            bool? provisionedEntitlements,

            bool? safeEntitlementsEnabled,

            bool? skipIfBlank,

            string? userAttributeMacros,

            string? userAttributeMappings,

            string? values)
        {
            AttributesTransformations = attributesTransformations;
            DefaultValues = defaultValues;
            IncludeInSamlAssertion = includeInSamlAssertion;
            Label = label;
            ParamId = paramId;
            ParamKeyName = paramKeyName;
            ProvisionedEntitlements = provisionedEntitlements;
            SafeEntitlementsEnabled = safeEntitlementsEnabled;
            SkipIfBlank = skipIfBlank;
            UserAttributeMacros = userAttributeMacros;
            UserAttributeMappings = userAttributeMappings;
            Values = values;
        }
    }
}
