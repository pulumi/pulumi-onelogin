# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = [
    'RulesActionArgs',
    'RulesConditionArgs',
    'GetActionsFilterArgs',
    'GetActionsValuesFilterArgs',
    'GetConditionsFilterArgs',
    'GetConditionsOperatorsFilterArgs',
    'GetInstanceConfigurationArgs',
    'GetInstanceEnforcementPointArgs',
    'GetInstanceEnforcementPointResourceArgs',
    'GetInstanceEnforcementPointSessionExpiryFixedArgs',
    'GetInstanceEnforcementPointSessionExpiryInactivityArgs',
    'GetInstanceProvisioningArgs',
    'GetRulesActionArgs',
    'GetRulesConditionArgs',
    'GetRulesFilterArgs',
    'GetRulesInstanceActionArgs',
    'GetRulesInstanceConditionArgs',
    'GetUsersFilterArgs',
]

@pulumi.input_type
class RulesActionArgs:
    def __init__(__self__, *,
                 action: Optional[pulumi.Input[str]] = None,
                 values: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None):
        if action is not None:
            pulumi.set(__self__, "action", action)
        if values is not None:
            pulumi.set(__self__, "values", values)

    @property
    @pulumi.getter
    def action(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "action")

    @action.setter
    def action(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "action", value)

    @property
    @pulumi.getter
    def values(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        return pulumi.get(self, "values")

    @values.setter
    def values(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "values", value)


@pulumi.input_type
class RulesConditionArgs:
    def __init__(__self__, *,
                 operator: Optional[pulumi.Input[str]] = None,
                 source: Optional[pulumi.Input[str]] = None,
                 value: Optional[pulumi.Input[str]] = None):
        if operator is not None:
            pulumi.set(__self__, "operator", operator)
        if source is not None:
            pulumi.set(__self__, "source", source)
        if value is not None:
            pulumi.set(__self__, "value", value)

    @property
    @pulumi.getter
    def operator(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "operator")

    @operator.setter
    def operator(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "operator", value)

    @property
    @pulumi.getter
    def source(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "source")

    @source.setter
    def source(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "source", value)

    @property
    @pulumi.getter
    def value(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "value")

    @value.setter
    def value(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "value", value)


@pulumi.input_type
class GetActionsFilterArgs:
    def __init__(__self__, *,
                 name: str,
                 values: Sequence[str]):
        pulumi.set(__self__, "name", name)
        pulumi.set(__self__, "values", values)

    @property
    @pulumi.getter
    def name(self) -> str:
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: str):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def values(self) -> Sequence[str]:
        return pulumi.get(self, "values")

    @values.setter
    def values(self, value: Sequence[str]):
        pulumi.set(self, "values", value)


@pulumi.input_type
class GetActionsValuesFilterArgs:
    def __init__(__self__, *,
                 name: str,
                 values: Sequence[str]):
        pulumi.set(__self__, "name", name)
        pulumi.set(__self__, "values", values)

    @property
    @pulumi.getter
    def name(self) -> str:
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: str):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def values(self) -> Sequence[str]:
        return pulumi.get(self, "values")

    @values.setter
    def values(self, value: Sequence[str]):
        pulumi.set(self, "values", value)


@pulumi.input_type
class GetConditionsFilterArgs:
    def __init__(__self__, *,
                 name: str,
                 values: Sequence[str]):
        pulumi.set(__self__, "name", name)
        pulumi.set(__self__, "values", values)

    @property
    @pulumi.getter
    def name(self) -> str:
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: str):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def values(self) -> Sequence[str]:
        return pulumi.get(self, "values")

    @values.setter
    def values(self, value: Sequence[str]):
        pulumi.set(self, "values", value)


@pulumi.input_type
class GetConditionsOperatorsFilterArgs:
    def __init__(__self__, *,
                 name: str,
                 values: Sequence[str]):
        pulumi.set(__self__, "name", name)
        pulumi.set(__self__, "values", values)

    @property
    @pulumi.getter
    def name(self) -> str:
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: str):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def values(self) -> Sequence[str]:
        return pulumi.get(self, "values")

    @values.setter
    def values(self, value: Sequence[str]):
        pulumi.set(self, "values", value)


@pulumi.input_type
class GetInstanceConfigurationArgs:
    def __init__(__self__, *,
                 access_token_expiration_minutes: int,
                 login_url: str,
                 oidc_application_type: int,
                 redirect_uri: str,
                 token_endpoint_auth_method: int):
        pulumi.set(__self__, "access_token_expiration_minutes", access_token_expiration_minutes)
        pulumi.set(__self__, "login_url", login_url)
        pulumi.set(__self__, "oidc_application_type", oidc_application_type)
        pulumi.set(__self__, "redirect_uri", redirect_uri)
        pulumi.set(__self__, "token_endpoint_auth_method", token_endpoint_auth_method)

    @property
    @pulumi.getter(name="accessTokenExpirationMinutes")
    def access_token_expiration_minutes(self) -> int:
        return pulumi.get(self, "access_token_expiration_minutes")

    @access_token_expiration_minutes.setter
    def access_token_expiration_minutes(self, value: int):
        pulumi.set(self, "access_token_expiration_minutes", value)

    @property
    @pulumi.getter(name="loginUrl")
    def login_url(self) -> str:
        return pulumi.get(self, "login_url")

    @login_url.setter
    def login_url(self, value: str):
        pulumi.set(self, "login_url", value)

    @property
    @pulumi.getter(name="oidcApplicationType")
    def oidc_application_type(self) -> int:
        return pulumi.get(self, "oidc_application_type")

    @oidc_application_type.setter
    def oidc_application_type(self, value: int):
        pulumi.set(self, "oidc_application_type", value)

    @property
    @pulumi.getter(name="redirectUri")
    def redirect_uri(self) -> str:
        return pulumi.get(self, "redirect_uri")

    @redirect_uri.setter
    def redirect_uri(self, value: str):
        pulumi.set(self, "redirect_uri", value)

    @property
    @pulumi.getter(name="tokenEndpointAuthMethod")
    def token_endpoint_auth_method(self) -> int:
        return pulumi.get(self, "token_endpoint_auth_method")

    @token_endpoint_auth_method.setter
    def token_endpoint_auth_method(self, value: int):
        pulumi.set(self, "token_endpoint_auth_method", value)


@pulumi.input_type
class GetInstanceEnforcementPointArgs:
    def __init__(__self__, *,
                 case_sensitive: bool,
                 conditions: str,
                 context_root: str,
                 landing_page: str,
                 permissions: str,
                 require_sitewide_authentication: bool,
                 resources: Sequence['GetInstanceEnforcementPointResourceArgs'],
                 session_expiry_fixed: 'GetInstanceEnforcementPointSessionExpiryFixedArgs',
                 session_expiry_inactivity: 'GetInstanceEnforcementPointSessionExpiryInactivityArgs',
                 target: str,
                 token: str,
                 use_target_host_header: bool,
                 vhost: str):
        pulumi.set(__self__, "case_sensitive", case_sensitive)
        pulumi.set(__self__, "conditions", conditions)
        pulumi.set(__self__, "context_root", context_root)
        pulumi.set(__self__, "landing_page", landing_page)
        pulumi.set(__self__, "permissions", permissions)
        pulumi.set(__self__, "require_sitewide_authentication", require_sitewide_authentication)
        pulumi.set(__self__, "resources", resources)
        pulumi.set(__self__, "session_expiry_fixed", session_expiry_fixed)
        pulumi.set(__self__, "session_expiry_inactivity", session_expiry_inactivity)
        pulumi.set(__self__, "target", target)
        pulumi.set(__self__, "token", token)
        pulumi.set(__self__, "use_target_host_header", use_target_host_header)
        pulumi.set(__self__, "vhost", vhost)

    @property
    @pulumi.getter(name="caseSensitive")
    def case_sensitive(self) -> bool:
        return pulumi.get(self, "case_sensitive")

    @case_sensitive.setter
    def case_sensitive(self, value: bool):
        pulumi.set(self, "case_sensitive", value)

    @property
    @pulumi.getter
    def conditions(self) -> str:
        return pulumi.get(self, "conditions")

    @conditions.setter
    def conditions(self, value: str):
        pulumi.set(self, "conditions", value)

    @property
    @pulumi.getter(name="contextRoot")
    def context_root(self) -> str:
        return pulumi.get(self, "context_root")

    @context_root.setter
    def context_root(self, value: str):
        pulumi.set(self, "context_root", value)

    @property
    @pulumi.getter(name="landingPage")
    def landing_page(self) -> str:
        return pulumi.get(self, "landing_page")

    @landing_page.setter
    def landing_page(self, value: str):
        pulumi.set(self, "landing_page", value)

    @property
    @pulumi.getter
    def permissions(self) -> str:
        return pulumi.get(self, "permissions")

    @permissions.setter
    def permissions(self, value: str):
        pulumi.set(self, "permissions", value)

    @property
    @pulumi.getter(name="requireSitewideAuthentication")
    def require_sitewide_authentication(self) -> bool:
        return pulumi.get(self, "require_sitewide_authentication")

    @require_sitewide_authentication.setter
    def require_sitewide_authentication(self, value: bool):
        pulumi.set(self, "require_sitewide_authentication", value)

    @property
    @pulumi.getter
    def resources(self) -> Sequence['GetInstanceEnforcementPointResourceArgs']:
        return pulumi.get(self, "resources")

    @resources.setter
    def resources(self, value: Sequence['GetInstanceEnforcementPointResourceArgs']):
        pulumi.set(self, "resources", value)

    @property
    @pulumi.getter(name="sessionExpiryFixed")
    def session_expiry_fixed(self) -> 'GetInstanceEnforcementPointSessionExpiryFixedArgs':
        return pulumi.get(self, "session_expiry_fixed")

    @session_expiry_fixed.setter
    def session_expiry_fixed(self, value: 'GetInstanceEnforcementPointSessionExpiryFixedArgs'):
        pulumi.set(self, "session_expiry_fixed", value)

    @property
    @pulumi.getter(name="sessionExpiryInactivity")
    def session_expiry_inactivity(self) -> 'GetInstanceEnforcementPointSessionExpiryInactivityArgs':
        return pulumi.get(self, "session_expiry_inactivity")

    @session_expiry_inactivity.setter
    def session_expiry_inactivity(self, value: 'GetInstanceEnforcementPointSessionExpiryInactivityArgs'):
        pulumi.set(self, "session_expiry_inactivity", value)

    @property
    @pulumi.getter
    def target(self) -> str:
        return pulumi.get(self, "target")

    @target.setter
    def target(self, value: str):
        pulumi.set(self, "target", value)

    @property
    @pulumi.getter
    def token(self) -> str:
        return pulumi.get(self, "token")

    @token.setter
    def token(self, value: str):
        pulumi.set(self, "token", value)

    @property
    @pulumi.getter(name="useTargetHostHeader")
    def use_target_host_header(self) -> bool:
        return pulumi.get(self, "use_target_host_header")

    @use_target_host_header.setter
    def use_target_host_header(self, value: bool):
        pulumi.set(self, "use_target_host_header", value)

    @property
    @pulumi.getter
    def vhost(self) -> str:
        return pulumi.get(self, "vhost")

    @vhost.setter
    def vhost(self, value: str):
        pulumi.set(self, "vhost", value)


@pulumi.input_type
class GetInstanceEnforcementPointResourceArgs:
    def __init__(__self__, *,
                 conditions: str,
                 is_path_regex: bool,
                 path: str,
                 permission: str,
                 require_auth: bool):
        pulumi.set(__self__, "conditions", conditions)
        pulumi.set(__self__, "is_path_regex", is_path_regex)
        pulumi.set(__self__, "path", path)
        pulumi.set(__self__, "permission", permission)
        pulumi.set(__self__, "require_auth", require_auth)

    @property
    @pulumi.getter
    def conditions(self) -> str:
        return pulumi.get(self, "conditions")

    @conditions.setter
    def conditions(self, value: str):
        pulumi.set(self, "conditions", value)

    @property
    @pulumi.getter(name="isPathRegex")
    def is_path_regex(self) -> bool:
        return pulumi.get(self, "is_path_regex")

    @is_path_regex.setter
    def is_path_regex(self, value: bool):
        pulumi.set(self, "is_path_regex", value)

    @property
    @pulumi.getter
    def path(self) -> str:
        return pulumi.get(self, "path")

    @path.setter
    def path(self, value: str):
        pulumi.set(self, "path", value)

    @property
    @pulumi.getter
    def permission(self) -> str:
        return pulumi.get(self, "permission")

    @permission.setter
    def permission(self, value: str):
        pulumi.set(self, "permission", value)

    @property
    @pulumi.getter(name="requireAuth")
    def require_auth(self) -> bool:
        return pulumi.get(self, "require_auth")

    @require_auth.setter
    def require_auth(self, value: bool):
        pulumi.set(self, "require_auth", value)


@pulumi.input_type
class GetInstanceEnforcementPointSessionExpiryFixedArgs:
    def __init__(__self__, *,
                 unit: int,
                 value: int):
        pulumi.set(__self__, "unit", unit)
        pulumi.set(__self__, "value", value)

    @property
    @pulumi.getter
    def unit(self) -> int:
        return pulumi.get(self, "unit")

    @unit.setter
    def unit(self, value: int):
        pulumi.set(self, "unit", value)

    @property
    @pulumi.getter
    def value(self) -> int:
        return pulumi.get(self, "value")

    @value.setter
    def value(self, value: int):
        pulumi.set(self, "value", value)


@pulumi.input_type
class GetInstanceEnforcementPointSessionExpiryInactivityArgs:
    def __init__(__self__, *,
                 unit: int,
                 value: int):
        pulumi.set(__self__, "unit", unit)
        pulumi.set(__self__, "value", value)

    @property
    @pulumi.getter
    def unit(self) -> int:
        return pulumi.get(self, "unit")

    @unit.setter
    def unit(self, value: int):
        pulumi.set(self, "unit", value)

    @property
    @pulumi.getter
    def value(self) -> int:
        return pulumi.get(self, "value")

    @value.setter
    def value(self, value: int):
        pulumi.set(self, "value", value)


@pulumi.input_type
class GetInstanceProvisioningArgs:
    def __init__(__self__, *,
                 enabled: bool):
        pulumi.set(__self__, "enabled", enabled)

    @property
    @pulumi.getter
    def enabled(self) -> bool:
        return pulumi.get(self, "enabled")

    @enabled.setter
    def enabled(self, value: bool):
        pulumi.set(self, "enabled", value)


@pulumi.input_type
class GetRulesActionArgs:
    def __init__(__self__, *,
                 action: str,
                 values: Sequence[str]):
        pulumi.set(__self__, "action", action)
        pulumi.set(__self__, "values", values)

    @property
    @pulumi.getter
    def action(self) -> str:
        return pulumi.get(self, "action")

    @action.setter
    def action(self, value: str):
        pulumi.set(self, "action", value)

    @property
    @pulumi.getter
    def values(self) -> Sequence[str]:
        return pulumi.get(self, "values")

    @values.setter
    def values(self, value: Sequence[str]):
        pulumi.set(self, "values", value)


@pulumi.input_type
class GetRulesConditionArgs:
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

    @operator.setter
    def operator(self, value: str):
        pulumi.set(self, "operator", value)

    @property
    @pulumi.getter
    def source(self) -> str:
        return pulumi.get(self, "source")

    @source.setter
    def source(self, value: str):
        pulumi.set(self, "source", value)

    @property
    @pulumi.getter
    def value(self) -> str:
        return pulumi.get(self, "value")

    @value.setter
    def value(self, value: str):
        pulumi.set(self, "value", value)


@pulumi.input_type
class GetRulesFilterArgs:
    def __init__(__self__, *,
                 name: str,
                 values: Sequence[str]):
        pulumi.set(__self__, "name", name)
        pulumi.set(__self__, "values", values)

    @property
    @pulumi.getter
    def name(self) -> str:
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: str):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def values(self) -> Sequence[str]:
        return pulumi.get(self, "values")

    @values.setter
    def values(self, value: Sequence[str]):
        pulumi.set(self, "values", value)


@pulumi.input_type
class GetRulesInstanceActionArgs:
    def __init__(__self__, *,
                 action: str,
                 values: Sequence[str]):
        pulumi.set(__self__, "action", action)
        pulumi.set(__self__, "values", values)

    @property
    @pulumi.getter
    def action(self) -> str:
        return pulumi.get(self, "action")

    @action.setter
    def action(self, value: str):
        pulumi.set(self, "action", value)

    @property
    @pulumi.getter
    def values(self) -> Sequence[str]:
        return pulumi.get(self, "values")

    @values.setter
    def values(self, value: Sequence[str]):
        pulumi.set(self, "values", value)


@pulumi.input_type
class GetRulesInstanceConditionArgs:
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

    @operator.setter
    def operator(self, value: str):
        pulumi.set(self, "operator", value)

    @property
    @pulumi.getter
    def source(self) -> str:
        return pulumi.get(self, "source")

    @source.setter
    def source(self, value: str):
        pulumi.set(self, "source", value)

    @property
    @pulumi.getter
    def value(self) -> str:
        return pulumi.get(self, "value")

    @value.setter
    def value(self, value: str):
        pulumi.set(self, "value", value)


@pulumi.input_type
class GetUsersFilterArgs:
    def __init__(__self__, *,
                 name: str,
                 values: Sequence[str]):
        pulumi.set(__self__, "name", name)
        pulumi.set(__self__, "values", values)

    @property
    @pulumi.getter
    def name(self) -> str:
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: str):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def values(self) -> Sequence[str]:
        return pulumi.get(self, "values")

    @values.setter
    def values(self, value: Sequence[str]):
        pulumi.set(self, "values", value)


