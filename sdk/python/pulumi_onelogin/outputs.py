# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import sys
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
if sys.version_info >= (3, 11):
    from typing import NotRequired, TypedDict, TypeAlias
else:
    from typing_extensions import NotRequired, TypedDict, TypeAlias
from . import _utilities
from . import outputs

__all__ = [
    'AppParameters',
    'AppRulesAction',
    'AppRulesCondition',
    'AuthServersConfiguration',
    'OidcAppsParameter',
    'PrivilegesPrivilege',
    'PrivilegesPrivilegeStatement',
    'SamlAppsParameter',
    'SmartHookCondition',
    'SmartHookOption',
    'UserMappingsAction',
    'UserMappingsCondition',
]

@pulumi.output_type
class AppParameters(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "paramKeyName":
            suggest = "param_key_name"
        elif key == "attributesTransformations":
            suggest = "attributes_transformations"
        elif key == "defaultValues":
            suggest = "default_values"
        elif key == "includeInSamlAssertion":
            suggest = "include_in_saml_assertion"
        elif key == "paramId":
            suggest = "param_id"
        elif key == "provisionedEntitlements":
            suggest = "provisioned_entitlements"
        elif key == "safeEntitlementsEnabled":
            suggest = "safe_entitlements_enabled"
        elif key == "skipIfBlank":
            suggest = "skip_if_blank"
        elif key == "userAttributeMacros":
            suggest = "user_attribute_macros"
        elif key == "userAttributeMappings":
            suggest = "user_attribute_mappings"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in AppParameters. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        AppParameters.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        AppParameters.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 param_key_name: str,
                 attributes_transformations: Optional[str] = None,
                 default_values: Optional[str] = None,
                 include_in_saml_assertion: Optional[bool] = None,
                 label: Optional[str] = None,
                 param_id: Optional[int] = None,
                 provisioned_entitlements: Optional[bool] = None,
                 safe_entitlements_enabled: Optional[bool] = None,
                 skip_if_blank: Optional[bool] = None,
                 user_attribute_macros: Optional[str] = None,
                 user_attribute_mappings: Optional[str] = None,
                 values: Optional[str] = None):
        pulumi.set(__self__, "param_key_name", param_key_name)
        if attributes_transformations is not None:
            pulumi.set(__self__, "attributes_transformations", attributes_transformations)
        if default_values is not None:
            pulumi.set(__self__, "default_values", default_values)
        if include_in_saml_assertion is not None:
            pulumi.set(__self__, "include_in_saml_assertion", include_in_saml_assertion)
        if label is not None:
            pulumi.set(__self__, "label", label)
        if param_id is not None:
            pulumi.set(__self__, "param_id", param_id)
        if provisioned_entitlements is not None:
            pulumi.set(__self__, "provisioned_entitlements", provisioned_entitlements)
        if safe_entitlements_enabled is not None:
            pulumi.set(__self__, "safe_entitlements_enabled", safe_entitlements_enabled)
        if skip_if_blank is not None:
            pulumi.set(__self__, "skip_if_blank", skip_if_blank)
        if user_attribute_macros is not None:
            pulumi.set(__self__, "user_attribute_macros", user_attribute_macros)
        if user_attribute_mappings is not None:
            pulumi.set(__self__, "user_attribute_mappings", user_attribute_mappings)
        if values is not None:
            pulumi.set(__self__, "values", values)

    @property
    @pulumi.getter(name="paramKeyName")
    def param_key_name(self) -> str:
        return pulumi.get(self, "param_key_name")

    @property
    @pulumi.getter(name="attributesTransformations")
    def attributes_transformations(self) -> Optional[str]:
        return pulumi.get(self, "attributes_transformations")

    @property
    @pulumi.getter(name="defaultValues")
    def default_values(self) -> Optional[str]:
        return pulumi.get(self, "default_values")

    @property
    @pulumi.getter(name="includeInSamlAssertion")
    def include_in_saml_assertion(self) -> Optional[bool]:
        return pulumi.get(self, "include_in_saml_assertion")

    @property
    @pulumi.getter
    def label(self) -> Optional[str]:
        return pulumi.get(self, "label")

    @property
    @pulumi.getter(name="paramId")
    def param_id(self) -> Optional[int]:
        return pulumi.get(self, "param_id")

    @property
    @pulumi.getter(name="provisionedEntitlements")
    def provisioned_entitlements(self) -> Optional[bool]:
        return pulumi.get(self, "provisioned_entitlements")

    @property
    @pulumi.getter(name="safeEntitlementsEnabled")
    def safe_entitlements_enabled(self) -> Optional[bool]:
        return pulumi.get(self, "safe_entitlements_enabled")

    @property
    @pulumi.getter(name="skipIfBlank")
    def skip_if_blank(self) -> Optional[bool]:
        return pulumi.get(self, "skip_if_blank")

    @property
    @pulumi.getter(name="userAttributeMacros")
    def user_attribute_macros(self) -> Optional[str]:
        return pulumi.get(self, "user_attribute_macros")

    @property
    @pulumi.getter(name="userAttributeMappings")
    def user_attribute_mappings(self) -> Optional[str]:
        return pulumi.get(self, "user_attribute_mappings")

    @property
    @pulumi.getter
    def values(self) -> Optional[str]:
        return pulumi.get(self, "values")


@pulumi.output_type
class AppRulesAction(dict):
    def __init__(__self__, *,
                 action: str,
                 values: Sequence[str],
                 expression: Optional[str] = None):
        pulumi.set(__self__, "action", action)
        pulumi.set(__self__, "values", values)
        if expression is not None:
            pulumi.set(__self__, "expression", expression)

    @property
    @pulumi.getter
    def action(self) -> str:
        return pulumi.get(self, "action")

    @property
    @pulumi.getter
    def values(self) -> Sequence[str]:
        return pulumi.get(self, "values")

    @property
    @pulumi.getter
    def expression(self) -> Optional[str]:
        return pulumi.get(self, "expression")


@pulumi.output_type
class AppRulesCondition(dict):
    def __init__(__self__, *,
                 operator: str,
                 source: str,
                 value: str):
        pulumi.set(__self__, "operator", operator)
        pulumi.set(__self__, "source", source)
        pulumi.set(__self__, "value", value)

    @property
    @pulumi.getter
    def operator(self) -> str:
        return pulumi.get(self, "operator")

    @property
    @pulumi.getter
    def source(self) -> str:
        return pulumi.get(self, "source")

    @property
    @pulumi.getter
    def value(self) -> str:
        return pulumi.get(self, "value")


@pulumi.output_type
class AuthServersConfiguration(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "resourceIdentifier":
            suggest = "resource_identifier"
        elif key == "accessTokenExpirationMinutes":
            suggest = "access_token_expiration_minutes"
        elif key == "refreshTokenExpirationMinutes":
            suggest = "refresh_token_expiration_minutes"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in AuthServersConfiguration. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        AuthServersConfiguration.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        AuthServersConfiguration.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 audiences: Sequence[str],
                 resource_identifier: str,
                 access_token_expiration_minutes: Optional[int] = None,
                 refresh_token_expiration_minutes: Optional[int] = None):
        pulumi.set(__self__, "audiences", audiences)
        pulumi.set(__self__, "resource_identifier", resource_identifier)
        if access_token_expiration_minutes is not None:
            pulumi.set(__self__, "access_token_expiration_minutes", access_token_expiration_minutes)
        if refresh_token_expiration_minutes is not None:
            pulumi.set(__self__, "refresh_token_expiration_minutes", refresh_token_expiration_minutes)

    @property
    @pulumi.getter
    def audiences(self) -> Sequence[str]:
        return pulumi.get(self, "audiences")

    @property
    @pulumi.getter(name="resourceIdentifier")
    def resource_identifier(self) -> str:
        return pulumi.get(self, "resource_identifier")

    @property
    @pulumi.getter(name="accessTokenExpirationMinutes")
    def access_token_expiration_minutes(self) -> Optional[int]:
        return pulumi.get(self, "access_token_expiration_minutes")

    @property
    @pulumi.getter(name="refreshTokenExpirationMinutes")
    def refresh_token_expiration_minutes(self) -> Optional[int]:
        return pulumi.get(self, "refresh_token_expiration_minutes")


@pulumi.output_type
class OidcAppsParameter(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "paramKeyName":
            suggest = "param_key_name"
        elif key == "attributesTransformations":
            suggest = "attributes_transformations"
        elif key == "defaultValues":
            suggest = "default_values"
        elif key == "includeInSamlAssertion":
            suggest = "include_in_saml_assertion"
        elif key == "paramId":
            suggest = "param_id"
        elif key == "provisionedEntitlements":
            suggest = "provisioned_entitlements"
        elif key == "safeEntitlementsEnabled":
            suggest = "safe_entitlements_enabled"
        elif key == "skipIfBlank":
            suggest = "skip_if_blank"
        elif key == "userAttributeMacros":
            suggest = "user_attribute_macros"
        elif key == "userAttributeMappings":
            suggest = "user_attribute_mappings"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in OidcAppsParameter. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        OidcAppsParameter.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        OidcAppsParameter.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 param_key_name: str,
                 attributes_transformations: Optional[str] = None,
                 default_values: Optional[str] = None,
                 include_in_saml_assertion: Optional[bool] = None,
                 label: Optional[str] = None,
                 param_id: Optional[int] = None,
                 provisioned_entitlements: Optional[bool] = None,
                 safe_entitlements_enabled: Optional[bool] = None,
                 skip_if_blank: Optional[bool] = None,
                 user_attribute_macros: Optional[str] = None,
                 user_attribute_mappings: Optional[str] = None,
                 values: Optional[str] = None):
        pulumi.set(__self__, "param_key_name", param_key_name)
        if attributes_transformations is not None:
            pulumi.set(__self__, "attributes_transformations", attributes_transformations)
        if default_values is not None:
            pulumi.set(__self__, "default_values", default_values)
        if include_in_saml_assertion is not None:
            pulumi.set(__self__, "include_in_saml_assertion", include_in_saml_assertion)
        if label is not None:
            pulumi.set(__self__, "label", label)
        if param_id is not None:
            pulumi.set(__self__, "param_id", param_id)
        if provisioned_entitlements is not None:
            pulumi.set(__self__, "provisioned_entitlements", provisioned_entitlements)
        if safe_entitlements_enabled is not None:
            pulumi.set(__self__, "safe_entitlements_enabled", safe_entitlements_enabled)
        if skip_if_blank is not None:
            pulumi.set(__self__, "skip_if_blank", skip_if_blank)
        if user_attribute_macros is not None:
            pulumi.set(__self__, "user_attribute_macros", user_attribute_macros)
        if user_attribute_mappings is not None:
            pulumi.set(__self__, "user_attribute_mappings", user_attribute_mappings)
        if values is not None:
            pulumi.set(__self__, "values", values)

    @property
    @pulumi.getter(name="paramKeyName")
    def param_key_name(self) -> str:
        return pulumi.get(self, "param_key_name")

    @property
    @pulumi.getter(name="attributesTransformations")
    def attributes_transformations(self) -> Optional[str]:
        return pulumi.get(self, "attributes_transformations")

    @property
    @pulumi.getter(name="defaultValues")
    def default_values(self) -> Optional[str]:
        return pulumi.get(self, "default_values")

    @property
    @pulumi.getter(name="includeInSamlAssertion")
    def include_in_saml_assertion(self) -> Optional[bool]:
        return pulumi.get(self, "include_in_saml_assertion")

    @property
    @pulumi.getter
    def label(self) -> Optional[str]:
        return pulumi.get(self, "label")

    @property
    @pulumi.getter(name="paramId")
    def param_id(self) -> Optional[int]:
        return pulumi.get(self, "param_id")

    @property
    @pulumi.getter(name="provisionedEntitlements")
    def provisioned_entitlements(self) -> Optional[bool]:
        return pulumi.get(self, "provisioned_entitlements")

    @property
    @pulumi.getter(name="safeEntitlementsEnabled")
    def safe_entitlements_enabled(self) -> Optional[bool]:
        return pulumi.get(self, "safe_entitlements_enabled")

    @property
    @pulumi.getter(name="skipIfBlank")
    def skip_if_blank(self) -> Optional[bool]:
        return pulumi.get(self, "skip_if_blank")

    @property
    @pulumi.getter(name="userAttributeMacros")
    def user_attribute_macros(self) -> Optional[str]:
        return pulumi.get(self, "user_attribute_macros")

    @property
    @pulumi.getter(name="userAttributeMappings")
    def user_attribute_mappings(self) -> Optional[str]:
        return pulumi.get(self, "user_attribute_mappings")

    @property
    @pulumi.getter
    def values(self) -> Optional[str]:
        return pulumi.get(self, "values")


@pulumi.output_type
class PrivilegesPrivilege(dict):
    def __init__(__self__, *,
                 statements: Sequence['outputs.PrivilegesPrivilegeStatement'],
                 version: Optional[str] = None):
        pulumi.set(__self__, "statements", statements)
        if version is not None:
            pulumi.set(__self__, "version", version)

    @property
    @pulumi.getter
    def statements(self) -> Sequence['outputs.PrivilegesPrivilegeStatement']:
        return pulumi.get(self, "statements")

    @property
    @pulumi.getter
    def version(self) -> Optional[str]:
        return pulumi.get(self, "version")


@pulumi.output_type
class PrivilegesPrivilegeStatement(dict):
    def __init__(__self__, *,
                 actions: Sequence[str],
                 effect: str,
                 scopes: Sequence[str]):
        pulumi.set(__self__, "actions", actions)
        pulumi.set(__self__, "effect", effect)
        pulumi.set(__self__, "scopes", scopes)

    @property
    @pulumi.getter
    def actions(self) -> Sequence[str]:
        return pulumi.get(self, "actions")

    @property
    @pulumi.getter
    def effect(self) -> str:
        return pulumi.get(self, "effect")

    @property
    @pulumi.getter
    def scopes(self) -> Sequence[str]:
        return pulumi.get(self, "scopes")


@pulumi.output_type
class SamlAppsParameter(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "paramKeyName":
            suggest = "param_key_name"
        elif key == "attributesTransformations":
            suggest = "attributes_transformations"
        elif key == "defaultValues":
            suggest = "default_values"
        elif key == "includeInSamlAssertion":
            suggest = "include_in_saml_assertion"
        elif key == "paramId":
            suggest = "param_id"
        elif key == "provisionedEntitlements":
            suggest = "provisioned_entitlements"
        elif key == "safeEntitlementsEnabled":
            suggest = "safe_entitlements_enabled"
        elif key == "skipIfBlank":
            suggest = "skip_if_blank"
        elif key == "userAttributeMacros":
            suggest = "user_attribute_macros"
        elif key == "userAttributeMappings":
            suggest = "user_attribute_mappings"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in SamlAppsParameter. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        SamlAppsParameter.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        SamlAppsParameter.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 param_key_name: str,
                 attributes_transformations: Optional[str] = None,
                 default_values: Optional[str] = None,
                 include_in_saml_assertion: Optional[bool] = None,
                 label: Optional[str] = None,
                 param_id: Optional[int] = None,
                 provisioned_entitlements: Optional[bool] = None,
                 safe_entitlements_enabled: Optional[bool] = None,
                 skip_if_blank: Optional[bool] = None,
                 user_attribute_macros: Optional[str] = None,
                 user_attribute_mappings: Optional[str] = None,
                 values: Optional[str] = None):
        pulumi.set(__self__, "param_key_name", param_key_name)
        if attributes_transformations is not None:
            pulumi.set(__self__, "attributes_transformations", attributes_transformations)
        if default_values is not None:
            pulumi.set(__self__, "default_values", default_values)
        if include_in_saml_assertion is not None:
            pulumi.set(__self__, "include_in_saml_assertion", include_in_saml_assertion)
        if label is not None:
            pulumi.set(__self__, "label", label)
        if param_id is not None:
            pulumi.set(__self__, "param_id", param_id)
        if provisioned_entitlements is not None:
            pulumi.set(__self__, "provisioned_entitlements", provisioned_entitlements)
        if safe_entitlements_enabled is not None:
            pulumi.set(__self__, "safe_entitlements_enabled", safe_entitlements_enabled)
        if skip_if_blank is not None:
            pulumi.set(__self__, "skip_if_blank", skip_if_blank)
        if user_attribute_macros is not None:
            pulumi.set(__self__, "user_attribute_macros", user_attribute_macros)
        if user_attribute_mappings is not None:
            pulumi.set(__self__, "user_attribute_mappings", user_attribute_mappings)
        if values is not None:
            pulumi.set(__self__, "values", values)

    @property
    @pulumi.getter(name="paramKeyName")
    def param_key_name(self) -> str:
        return pulumi.get(self, "param_key_name")

    @property
    @pulumi.getter(name="attributesTransformations")
    def attributes_transformations(self) -> Optional[str]:
        return pulumi.get(self, "attributes_transformations")

    @property
    @pulumi.getter(name="defaultValues")
    def default_values(self) -> Optional[str]:
        return pulumi.get(self, "default_values")

    @property
    @pulumi.getter(name="includeInSamlAssertion")
    def include_in_saml_assertion(self) -> Optional[bool]:
        return pulumi.get(self, "include_in_saml_assertion")

    @property
    @pulumi.getter
    def label(self) -> Optional[str]:
        return pulumi.get(self, "label")

    @property
    @pulumi.getter(name="paramId")
    def param_id(self) -> Optional[int]:
        return pulumi.get(self, "param_id")

    @property
    @pulumi.getter(name="provisionedEntitlements")
    def provisioned_entitlements(self) -> Optional[bool]:
        return pulumi.get(self, "provisioned_entitlements")

    @property
    @pulumi.getter(name="safeEntitlementsEnabled")
    def safe_entitlements_enabled(self) -> Optional[bool]:
        return pulumi.get(self, "safe_entitlements_enabled")

    @property
    @pulumi.getter(name="skipIfBlank")
    def skip_if_blank(self) -> Optional[bool]:
        return pulumi.get(self, "skip_if_blank")

    @property
    @pulumi.getter(name="userAttributeMacros")
    def user_attribute_macros(self) -> Optional[str]:
        return pulumi.get(self, "user_attribute_macros")

    @property
    @pulumi.getter(name="userAttributeMappings")
    def user_attribute_mappings(self) -> Optional[str]:
        return pulumi.get(self, "user_attribute_mappings")

    @property
    @pulumi.getter
    def values(self) -> Optional[str]:
        return pulumi.get(self, "values")


@pulumi.output_type
class SmartHookCondition(dict):
    def __init__(__self__, *,
                 operator: str,
                 source: str,
                 value: str):
        pulumi.set(__self__, "operator", operator)
        pulumi.set(__self__, "source", source)
        pulumi.set(__self__, "value", value)

    @property
    @pulumi.getter
    def operator(self) -> str:
        return pulumi.get(self, "operator")

    @property
    @pulumi.getter
    def source(self) -> str:
        return pulumi.get(self, "source")

    @property
    @pulumi.getter
    def value(self) -> str:
        return pulumi.get(self, "value")


@pulumi.output_type
class SmartHookOption(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "locationEnabled":
            suggest = "location_enabled"
        elif key == "mfaDeviceInfoEnabled":
            suggest = "mfa_device_info_enabled"
        elif key == "riskEnabled":
            suggest = "risk_enabled"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in SmartHookOption. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        SmartHookOption.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        SmartHookOption.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 location_enabled: Optional[bool] = None,
                 mfa_device_info_enabled: Optional[bool] = None,
                 risk_enabled: Optional[bool] = None):
        if location_enabled is not None:
            pulumi.set(__self__, "location_enabled", location_enabled)
        if mfa_device_info_enabled is not None:
            pulumi.set(__self__, "mfa_device_info_enabled", mfa_device_info_enabled)
        if risk_enabled is not None:
            pulumi.set(__self__, "risk_enabled", risk_enabled)

    @property
    @pulumi.getter(name="locationEnabled")
    def location_enabled(self) -> Optional[bool]:
        return pulumi.get(self, "location_enabled")

    @property
    @pulumi.getter(name="mfaDeviceInfoEnabled")
    def mfa_device_info_enabled(self) -> Optional[bool]:
        return pulumi.get(self, "mfa_device_info_enabled")

    @property
    @pulumi.getter(name="riskEnabled")
    def risk_enabled(self) -> Optional[bool]:
        return pulumi.get(self, "risk_enabled")


@pulumi.output_type
class UserMappingsAction(dict):
    def __init__(__self__, *,
                 action: str,
                 values: Sequence[str]):
        pulumi.set(__self__, "action", action)
        pulumi.set(__self__, "values", values)

    @property
    @pulumi.getter
    def action(self) -> str:
        return pulumi.get(self, "action")

    @property
    @pulumi.getter
    def values(self) -> Sequence[str]:
        return pulumi.get(self, "values")


@pulumi.output_type
class UserMappingsCondition(dict):
    def __init__(__self__, *,
                 operator: str,
                 source: str,
                 value: str):
        pulumi.set(__self__, "operator", operator)
        pulumi.set(__self__, "source", source)
        pulumi.set(__self__, "value", value)

    @property
    @pulumi.getter
    def operator(self) -> str:
        return pulumi.get(self, "operator")

    @property
    @pulumi.getter
    def source(self) -> str:
        return pulumi.get(self, "source")

    @property
    @pulumi.getter
    def value(self) -> str:
        return pulumi.get(self, "value")


