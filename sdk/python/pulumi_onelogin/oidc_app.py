# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities
from . import outputs
from ._inputs import *

__all__ = ['OidcAppArgs', 'OidcApp']

@pulumi.input_type
class OidcAppArgs:
    def __init__(__self__, *,
                 connector_id: pulumi.Input[int],
                 allow_assumed_signin: Optional[pulumi.Input[bool]] = None,
                 brand_id: Optional[pulumi.Input[int]] = None,
                 configuration: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 notes: Optional[pulumi.Input[str]] = None,
                 parameters: Optional[pulumi.Input[Sequence[pulumi.Input['OidcAppParameterArgs']]]] = None,
                 provisioning: Optional[pulumi.Input[Mapping[str, pulumi.Input[bool]]]] = None,
                 visible: Optional[pulumi.Input[bool]] = None):
        """
        The set of arguments for constructing a OidcApp resource.
        :param pulumi.Input[int] connector_id: The ID for the app connector, dictates the type of app (e.g. AWS Multi-Role App).
        :param pulumi.Input[bool] allow_assumed_signin: Enable sign in when user has been assumed by the account owner. Defaults to `false`.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] configuration: OIDC settings that control the authentication flow e.g. redirect urls and token settings.
        :param pulumi.Input[str] description: App description.
        :param pulumi.Input[str] name: The app's name.
        :param pulumi.Input[str] notes: Notes about the app.
        :param pulumi.Input[Sequence[pulumi.Input['OidcAppParameterArgs']]] parameters: a list of custom parameters for this app.
        :param pulumi.Input[Mapping[str, pulumi.Input[bool]]] provisioning: Settings regarding the app's provisioning ability.
        :param pulumi.Input[bool] visible: Determine if app should be visible in OneLogin portal. Defaults to `true`.
        """
        pulumi.set(__self__, "connector_id", connector_id)
        if allow_assumed_signin is not None:
            pulumi.set(__self__, "allow_assumed_signin", allow_assumed_signin)
        if brand_id is not None:
            pulumi.set(__self__, "brand_id", brand_id)
        if configuration is not None:
            pulumi.set(__self__, "configuration", configuration)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if notes is not None:
            pulumi.set(__self__, "notes", notes)
        if parameters is not None:
            pulumi.set(__self__, "parameters", parameters)
        if provisioning is not None:
            pulumi.set(__self__, "provisioning", provisioning)
        if visible is not None:
            pulumi.set(__self__, "visible", visible)

    @property
    @pulumi.getter(name="connectorId")
    def connector_id(self) -> pulumi.Input[int]:
        """
        The ID for the app connector, dictates the type of app (e.g. AWS Multi-Role App).
        """
        return pulumi.get(self, "connector_id")

    @connector_id.setter
    def connector_id(self, value: pulumi.Input[int]):
        pulumi.set(self, "connector_id", value)

    @property
    @pulumi.getter(name="allowAssumedSignin")
    def allow_assumed_signin(self) -> Optional[pulumi.Input[bool]]:
        """
        Enable sign in when user has been assumed by the account owner. Defaults to `false`.
        """
        return pulumi.get(self, "allow_assumed_signin")

    @allow_assumed_signin.setter
    def allow_assumed_signin(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "allow_assumed_signin", value)

    @property
    @pulumi.getter(name="brandId")
    def brand_id(self) -> Optional[pulumi.Input[int]]:
        return pulumi.get(self, "brand_id")

    @brand_id.setter
    def brand_id(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "brand_id", value)

    @property
    @pulumi.getter
    def configuration(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        OIDC settings that control the authentication flow e.g. redirect urls and token settings.
        """
        return pulumi.get(self, "configuration")

    @configuration.setter
    def configuration(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "configuration", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        App description.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The app's name.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def notes(self) -> Optional[pulumi.Input[str]]:
        """
        Notes about the app.
        """
        return pulumi.get(self, "notes")

    @notes.setter
    def notes(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "notes", value)

    @property
    @pulumi.getter
    def parameters(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['OidcAppParameterArgs']]]]:
        """
        a list of custom parameters for this app.
        """
        return pulumi.get(self, "parameters")

    @parameters.setter
    def parameters(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['OidcAppParameterArgs']]]]):
        pulumi.set(self, "parameters", value)

    @property
    @pulumi.getter
    def provisioning(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[bool]]]]:
        """
        Settings regarding the app's provisioning ability.
        """
        return pulumi.get(self, "provisioning")

    @provisioning.setter
    def provisioning(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[bool]]]]):
        pulumi.set(self, "provisioning", value)

    @property
    @pulumi.getter
    def visible(self) -> Optional[pulumi.Input[bool]]:
        """
        Determine if app should be visible in OneLogin portal. Defaults to `true`.
        """
        return pulumi.get(self, "visible")

    @visible.setter
    def visible(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "visible", value)


@pulumi.input_type
class _OidcAppState:
    def __init__(__self__, *,
                 allow_assumed_signin: Optional[pulumi.Input[bool]] = None,
                 auth_method: Optional[pulumi.Input[int]] = None,
                 brand_id: Optional[pulumi.Input[int]] = None,
                 configuration: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 connector_id: Optional[pulumi.Input[int]] = None,
                 created_at: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 icon_url: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 notes: Optional[pulumi.Input[str]] = None,
                 parameters: Optional[pulumi.Input[Sequence[pulumi.Input['OidcAppParameterArgs']]]] = None,
                 policy_id: Optional[pulumi.Input[int]] = None,
                 provisioning: Optional[pulumi.Input[Mapping[str, pulumi.Input[bool]]]] = None,
                 sso: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 tab_id: Optional[pulumi.Input[int]] = None,
                 updated_at: Optional[pulumi.Input[str]] = None,
                 visible: Optional[pulumi.Input[bool]] = None):
        """
        Input properties used for looking up and filtering OidcApp resources.
        :param pulumi.Input[bool] allow_assumed_signin: Enable sign in when user has been assumed by the account owner. Defaults to `false`.
        :param pulumi.Input[int] auth_method: The apps auth method. Refer to the [OneLogin Apps Documentation](https://developers.onelogin.com/api-docs/2/apps/app-resource) for a comprehensive list of available auth methods.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] configuration: OIDC settings that control the authentication flow e.g. redirect urls and token settings.
        :param pulumi.Input[int] connector_id: The ID for the app connector, dictates the type of app (e.g. AWS Multi-Role App).
        :param pulumi.Input[str] created_at: Timestamp for app's creation.
        :param pulumi.Input[str] description: App description.
        :param pulumi.Input[str] icon_url: The url for the app's icon.
        :param pulumi.Input[str] name: The app's name.
        :param pulumi.Input[str] notes: Notes about the app.
        :param pulumi.Input[Sequence[pulumi.Input['OidcAppParameterArgs']]] parameters: a list of custom parameters for this app.
        :param pulumi.Input[int] policy_id: The security policy assigned to the app.
        :param pulumi.Input[Mapping[str, pulumi.Input[bool]]] provisioning: Settings regarding the app's provisioning ability.
        :param pulumi.Input[int] tab_id: The tab in which to display in OneLogin portal.
        :param pulumi.Input[str] updated_at: Timestamp for app's last update.
        :param pulumi.Input[bool] visible: Determine if app should be visible in OneLogin portal. Defaults to `true`.
        """
        if allow_assumed_signin is not None:
            pulumi.set(__self__, "allow_assumed_signin", allow_assumed_signin)
        if auth_method is not None:
            pulumi.set(__self__, "auth_method", auth_method)
        if brand_id is not None:
            pulumi.set(__self__, "brand_id", brand_id)
        if configuration is not None:
            pulumi.set(__self__, "configuration", configuration)
        if connector_id is not None:
            pulumi.set(__self__, "connector_id", connector_id)
        if created_at is not None:
            pulumi.set(__self__, "created_at", created_at)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if icon_url is not None:
            pulumi.set(__self__, "icon_url", icon_url)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if notes is not None:
            pulumi.set(__self__, "notes", notes)
        if parameters is not None:
            pulumi.set(__self__, "parameters", parameters)
        if policy_id is not None:
            pulumi.set(__self__, "policy_id", policy_id)
        if provisioning is not None:
            pulumi.set(__self__, "provisioning", provisioning)
        if sso is not None:
            pulumi.set(__self__, "sso", sso)
        if tab_id is not None:
            pulumi.set(__self__, "tab_id", tab_id)
        if updated_at is not None:
            pulumi.set(__self__, "updated_at", updated_at)
        if visible is not None:
            pulumi.set(__self__, "visible", visible)

    @property
    @pulumi.getter(name="allowAssumedSignin")
    def allow_assumed_signin(self) -> Optional[pulumi.Input[bool]]:
        """
        Enable sign in when user has been assumed by the account owner. Defaults to `false`.
        """
        return pulumi.get(self, "allow_assumed_signin")

    @allow_assumed_signin.setter
    def allow_assumed_signin(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "allow_assumed_signin", value)

    @property
    @pulumi.getter(name="authMethod")
    def auth_method(self) -> Optional[pulumi.Input[int]]:
        """
        The apps auth method. Refer to the [OneLogin Apps Documentation](https://developers.onelogin.com/api-docs/2/apps/app-resource) for a comprehensive list of available auth methods.
        """
        return pulumi.get(self, "auth_method")

    @auth_method.setter
    def auth_method(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "auth_method", value)

    @property
    @pulumi.getter(name="brandId")
    def brand_id(self) -> Optional[pulumi.Input[int]]:
        return pulumi.get(self, "brand_id")

    @brand_id.setter
    def brand_id(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "brand_id", value)

    @property
    @pulumi.getter
    def configuration(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        OIDC settings that control the authentication flow e.g. redirect urls and token settings.
        """
        return pulumi.get(self, "configuration")

    @configuration.setter
    def configuration(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "configuration", value)

    @property
    @pulumi.getter(name="connectorId")
    def connector_id(self) -> Optional[pulumi.Input[int]]:
        """
        The ID for the app connector, dictates the type of app (e.g. AWS Multi-Role App).
        """
        return pulumi.get(self, "connector_id")

    @connector_id.setter
    def connector_id(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "connector_id", value)

    @property
    @pulumi.getter(name="createdAt")
    def created_at(self) -> Optional[pulumi.Input[str]]:
        """
        Timestamp for app's creation.
        """
        return pulumi.get(self, "created_at")

    @created_at.setter
    def created_at(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "created_at", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        App description.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="iconUrl")
    def icon_url(self) -> Optional[pulumi.Input[str]]:
        """
        The url for the app's icon.
        """
        return pulumi.get(self, "icon_url")

    @icon_url.setter
    def icon_url(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "icon_url", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The app's name.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def notes(self) -> Optional[pulumi.Input[str]]:
        """
        Notes about the app.
        """
        return pulumi.get(self, "notes")

    @notes.setter
    def notes(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "notes", value)

    @property
    @pulumi.getter
    def parameters(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['OidcAppParameterArgs']]]]:
        """
        a list of custom parameters for this app.
        """
        return pulumi.get(self, "parameters")

    @parameters.setter
    def parameters(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['OidcAppParameterArgs']]]]):
        pulumi.set(self, "parameters", value)

    @property
    @pulumi.getter(name="policyId")
    def policy_id(self) -> Optional[pulumi.Input[int]]:
        """
        The security policy assigned to the app.
        """
        return pulumi.get(self, "policy_id")

    @policy_id.setter
    def policy_id(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "policy_id", value)

    @property
    @pulumi.getter
    def provisioning(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[bool]]]]:
        """
        Settings regarding the app's provisioning ability.
        """
        return pulumi.get(self, "provisioning")

    @provisioning.setter
    def provisioning(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[bool]]]]):
        pulumi.set(self, "provisioning", value)

    @property
    @pulumi.getter
    def sso(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        return pulumi.get(self, "sso")

    @sso.setter
    def sso(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "sso", value)

    @property
    @pulumi.getter(name="tabId")
    def tab_id(self) -> Optional[pulumi.Input[int]]:
        """
        The tab in which to display in OneLogin portal.
        """
        return pulumi.get(self, "tab_id")

    @tab_id.setter
    def tab_id(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "tab_id", value)

    @property
    @pulumi.getter(name="updatedAt")
    def updated_at(self) -> Optional[pulumi.Input[str]]:
        """
        Timestamp for app's last update.
        """
        return pulumi.get(self, "updated_at")

    @updated_at.setter
    def updated_at(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "updated_at", value)

    @property
    @pulumi.getter
    def visible(self) -> Optional[pulumi.Input[bool]]:
        """
        Determine if app should be visible in OneLogin portal. Defaults to `true`.
        """
        return pulumi.get(self, "visible")

    @visible.setter
    def visible(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "visible", value)


class OidcApp(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 allow_assumed_signin: Optional[pulumi.Input[bool]] = None,
                 brand_id: Optional[pulumi.Input[int]] = None,
                 configuration: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 connector_id: Optional[pulumi.Input[int]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 notes: Optional[pulumi.Input[str]] = None,
                 parameters: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['OidcAppParameterArgs']]]]] = None,
                 provisioning: Optional[pulumi.Input[Mapping[str, pulumi.Input[bool]]]] = None,
                 visible: Optional[pulumi.Input[bool]] = None,
                 __props__=None):
        """
        Creates an OIDC Application.

        This resource allows you to create and configure an OIDC Application.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_onelogin as onelogin

        my_oidc_app = onelogin.OidcApp("myOidcApp",
            allow_assumed_signin=False,
            configuration={
                "access_token_expiration_minutes": "1",
                "login_url": "https://www.example.com",
                "oidc_application_type": "0",
                "post_logout_redirect_uri": "",
                "redirect_uri": "https://example.com/example",
                "refresh_token_expiration_minutes": "1",
                "token_endpoint_auth_method": "1",
            },
            connector_id=123456,
            description="example OIDC app",
            notes="example",
            parameters=[onelogin.OidcAppParameterArgs(
                attributes_transformations="",
                default_values="",
                include_in_saml_assertion=False,
                label="example app parameter ",
                param_key_name="example",
                provisioned_entitlements=False,
                safe_entitlements_enabled=False,
                skip_if_blank=False,
                user_attribute_macros="",
                user_attribute_mappings="",
                values="",
            )],
            provisioning={
                "enabled": False,
            },
            visible=True)
        ```

        ## Import

        A OIDC App can be imported via the OneLogin App ID.

        ```sh
         $ pulumi import onelogin:index/oidcApp:OidcApp my_oidc_app <app id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] allow_assumed_signin: Enable sign in when user has been assumed by the account owner. Defaults to `false`.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] configuration: OIDC settings that control the authentication flow e.g. redirect urls and token settings.
        :param pulumi.Input[int] connector_id: The ID for the app connector, dictates the type of app (e.g. AWS Multi-Role App).
        :param pulumi.Input[str] description: App description.
        :param pulumi.Input[str] name: The app's name.
        :param pulumi.Input[str] notes: Notes about the app.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['OidcAppParameterArgs']]]] parameters: a list of custom parameters for this app.
        :param pulumi.Input[Mapping[str, pulumi.Input[bool]]] provisioning: Settings regarding the app's provisioning ability.
        :param pulumi.Input[bool] visible: Determine if app should be visible in OneLogin portal. Defaults to `true`.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: OidcAppArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Creates an OIDC Application.

        This resource allows you to create and configure an OIDC Application.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_onelogin as onelogin

        my_oidc_app = onelogin.OidcApp("myOidcApp",
            allow_assumed_signin=False,
            configuration={
                "access_token_expiration_minutes": "1",
                "login_url": "https://www.example.com",
                "oidc_application_type": "0",
                "post_logout_redirect_uri": "",
                "redirect_uri": "https://example.com/example",
                "refresh_token_expiration_minutes": "1",
                "token_endpoint_auth_method": "1",
            },
            connector_id=123456,
            description="example OIDC app",
            notes="example",
            parameters=[onelogin.OidcAppParameterArgs(
                attributes_transformations="",
                default_values="",
                include_in_saml_assertion=False,
                label="example app parameter ",
                param_key_name="example",
                provisioned_entitlements=False,
                safe_entitlements_enabled=False,
                skip_if_blank=False,
                user_attribute_macros="",
                user_attribute_mappings="",
                values="",
            )],
            provisioning={
                "enabled": False,
            },
            visible=True)
        ```

        ## Import

        A OIDC App can be imported via the OneLogin App ID.

        ```sh
         $ pulumi import onelogin:index/oidcApp:OidcApp my_oidc_app <app id>
        ```

        :param str resource_name: The name of the resource.
        :param OidcAppArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(OidcAppArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 allow_assumed_signin: Optional[pulumi.Input[bool]] = None,
                 brand_id: Optional[pulumi.Input[int]] = None,
                 configuration: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 connector_id: Optional[pulumi.Input[int]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 notes: Optional[pulumi.Input[str]] = None,
                 parameters: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['OidcAppParameterArgs']]]]] = None,
                 provisioning: Optional[pulumi.Input[Mapping[str, pulumi.Input[bool]]]] = None,
                 visible: Optional[pulumi.Input[bool]] = None,
                 __props__=None):
        if opts is None:
            opts = pulumi.ResourceOptions()
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.version is None:
            opts.version = _utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = OidcAppArgs.__new__(OidcAppArgs)

            __props__.__dict__["allow_assumed_signin"] = allow_assumed_signin
            __props__.__dict__["brand_id"] = brand_id
            __props__.__dict__["configuration"] = configuration
            if connector_id is None and not opts.urn:
                raise TypeError("Missing required property 'connector_id'")
            __props__.__dict__["connector_id"] = connector_id
            __props__.__dict__["description"] = description
            __props__.__dict__["name"] = name
            __props__.__dict__["notes"] = notes
            __props__.__dict__["parameters"] = parameters
            __props__.__dict__["provisioning"] = provisioning
            __props__.__dict__["visible"] = visible
            __props__.__dict__["auth_method"] = None
            __props__.__dict__["created_at"] = None
            __props__.__dict__["icon_url"] = None
            __props__.__dict__["policy_id"] = None
            __props__.__dict__["sso"] = None
            __props__.__dict__["tab_id"] = None
            __props__.__dict__["updated_at"] = None
        super(OidcApp, __self__).__init__(
            'onelogin:index/oidcApp:OidcApp',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            allow_assumed_signin: Optional[pulumi.Input[bool]] = None,
            auth_method: Optional[pulumi.Input[int]] = None,
            brand_id: Optional[pulumi.Input[int]] = None,
            configuration: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            connector_id: Optional[pulumi.Input[int]] = None,
            created_at: Optional[pulumi.Input[str]] = None,
            description: Optional[pulumi.Input[str]] = None,
            icon_url: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            notes: Optional[pulumi.Input[str]] = None,
            parameters: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['OidcAppParameterArgs']]]]] = None,
            policy_id: Optional[pulumi.Input[int]] = None,
            provisioning: Optional[pulumi.Input[Mapping[str, pulumi.Input[bool]]]] = None,
            sso: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            tab_id: Optional[pulumi.Input[int]] = None,
            updated_at: Optional[pulumi.Input[str]] = None,
            visible: Optional[pulumi.Input[bool]] = None) -> 'OidcApp':
        """
        Get an existing OidcApp resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] allow_assumed_signin: Enable sign in when user has been assumed by the account owner. Defaults to `false`.
        :param pulumi.Input[int] auth_method: The apps auth method. Refer to the [OneLogin Apps Documentation](https://developers.onelogin.com/api-docs/2/apps/app-resource) for a comprehensive list of available auth methods.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] configuration: OIDC settings that control the authentication flow e.g. redirect urls and token settings.
        :param pulumi.Input[int] connector_id: The ID for the app connector, dictates the type of app (e.g. AWS Multi-Role App).
        :param pulumi.Input[str] created_at: Timestamp for app's creation.
        :param pulumi.Input[str] description: App description.
        :param pulumi.Input[str] icon_url: The url for the app's icon.
        :param pulumi.Input[str] name: The app's name.
        :param pulumi.Input[str] notes: Notes about the app.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['OidcAppParameterArgs']]]] parameters: a list of custom parameters for this app.
        :param pulumi.Input[int] policy_id: The security policy assigned to the app.
        :param pulumi.Input[Mapping[str, pulumi.Input[bool]]] provisioning: Settings regarding the app's provisioning ability.
        :param pulumi.Input[int] tab_id: The tab in which to display in OneLogin portal.
        :param pulumi.Input[str] updated_at: Timestamp for app's last update.
        :param pulumi.Input[bool] visible: Determine if app should be visible in OneLogin portal. Defaults to `true`.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _OidcAppState.__new__(_OidcAppState)

        __props__.__dict__["allow_assumed_signin"] = allow_assumed_signin
        __props__.__dict__["auth_method"] = auth_method
        __props__.__dict__["brand_id"] = brand_id
        __props__.__dict__["configuration"] = configuration
        __props__.__dict__["connector_id"] = connector_id
        __props__.__dict__["created_at"] = created_at
        __props__.__dict__["description"] = description
        __props__.__dict__["icon_url"] = icon_url
        __props__.__dict__["name"] = name
        __props__.__dict__["notes"] = notes
        __props__.__dict__["parameters"] = parameters
        __props__.__dict__["policy_id"] = policy_id
        __props__.__dict__["provisioning"] = provisioning
        __props__.__dict__["sso"] = sso
        __props__.__dict__["tab_id"] = tab_id
        __props__.__dict__["updated_at"] = updated_at
        __props__.__dict__["visible"] = visible
        return OidcApp(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="allowAssumedSignin")
    def allow_assumed_signin(self) -> pulumi.Output[Optional[bool]]:
        """
        Enable sign in when user has been assumed by the account owner. Defaults to `false`.
        """
        return pulumi.get(self, "allow_assumed_signin")

    @property
    @pulumi.getter(name="authMethod")
    def auth_method(self) -> pulumi.Output[int]:
        """
        The apps auth method. Refer to the [OneLogin Apps Documentation](https://developers.onelogin.com/api-docs/2/apps/app-resource) for a comprehensive list of available auth methods.
        """
        return pulumi.get(self, "auth_method")

    @property
    @pulumi.getter(name="brandId")
    def brand_id(self) -> pulumi.Output[Optional[int]]:
        return pulumi.get(self, "brand_id")

    @property
    @pulumi.getter
    def configuration(self) -> pulumi.Output[Optional[Mapping[str, str]]]:
        """
        OIDC settings that control the authentication flow e.g. redirect urls and token settings.
        """
        return pulumi.get(self, "configuration")

    @property
    @pulumi.getter(name="connectorId")
    def connector_id(self) -> pulumi.Output[int]:
        """
        The ID for the app connector, dictates the type of app (e.g. AWS Multi-Role App).
        """
        return pulumi.get(self, "connector_id")

    @property
    @pulumi.getter(name="createdAt")
    def created_at(self) -> pulumi.Output[str]:
        """
        Timestamp for app's creation.
        """
        return pulumi.get(self, "created_at")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        App description.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="iconUrl")
    def icon_url(self) -> pulumi.Output[str]:
        """
        The url for the app's icon.
        """
        return pulumi.get(self, "icon_url")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The app's name.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def notes(self) -> pulumi.Output[Optional[str]]:
        """
        Notes about the app.
        """
        return pulumi.get(self, "notes")

    @property
    @pulumi.getter
    def parameters(self) -> pulumi.Output[Sequence['outputs.OidcAppParameter']]:
        """
        a list of custom parameters for this app.
        """
        return pulumi.get(self, "parameters")

    @property
    @pulumi.getter(name="policyId")
    def policy_id(self) -> pulumi.Output[int]:
        """
        The security policy assigned to the app.
        """
        return pulumi.get(self, "policy_id")

    @property
    @pulumi.getter
    def provisioning(self) -> pulumi.Output[Mapping[str, bool]]:
        """
        Settings regarding the app's provisioning ability.
        """
        return pulumi.get(self, "provisioning")

    @property
    @pulumi.getter
    def sso(self) -> pulumi.Output[Mapping[str, str]]:
        return pulumi.get(self, "sso")

    @property
    @pulumi.getter(name="tabId")
    def tab_id(self) -> pulumi.Output[int]:
        """
        The tab in which to display in OneLogin portal.
        """
        return pulumi.get(self, "tab_id")

    @property
    @pulumi.getter(name="updatedAt")
    def updated_at(self) -> pulumi.Output[str]:
        """
        Timestamp for app's last update.
        """
        return pulumi.get(self, "updated_at")

    @property
    @pulumi.getter
    def visible(self) -> pulumi.Output[Optional[bool]]:
        """
        Determine if app should be visible in OneLogin portal. Defaults to `true`.
        """
        return pulumi.get(self, "visible")

