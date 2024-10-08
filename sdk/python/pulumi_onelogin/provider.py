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
from ._inputs import *

__all__ = ['ProviderArgs', 'Provider']

@pulumi.input_type
class ProviderArgs:
    def __init__(__self__, *,
                 apikey_auth: pulumi.Input[str],
                 content_type: Optional[pulumi.Input[str]] = None,
                 endpoints: Optional[pulumi.Input[Sequence[pulumi.Input['ProviderEndpointArgs']]]] = None):
        """
        The set of arguments for constructing a Provider resource.
        """
        pulumi.set(__self__, "apikey_auth", apikey_auth)
        if content_type is not None:
            pulumi.set(__self__, "content_type", content_type)
        if endpoints is not None:
            pulumi.set(__self__, "endpoints", endpoints)

    @property
    @pulumi.getter(name="apikeyAuth")
    def apikey_auth(self) -> pulumi.Input[str]:
        return pulumi.get(self, "apikey_auth")

    @apikey_auth.setter
    def apikey_auth(self, value: pulumi.Input[str]):
        pulumi.set(self, "apikey_auth", value)

    @property
    @pulumi.getter(name="contentType")
    def content_type(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "content_type")

    @content_type.setter
    def content_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "content_type", value)

    @property
    @pulumi.getter
    def endpoints(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['ProviderEndpointArgs']]]]:
        return pulumi.get(self, "endpoints")

    @endpoints.setter
    def endpoints(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['ProviderEndpointArgs']]]]):
        pulumi.set(self, "endpoints", value)


class Provider(pulumi.ProviderResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 apikey_auth: Optional[pulumi.Input[str]] = None,
                 content_type: Optional[pulumi.Input[str]] = None,
                 endpoints: Optional[pulumi.Input[Sequence[pulumi.Input[Union['ProviderEndpointArgs', 'ProviderEndpointArgsDict']]]]] = None,
                 __props__=None):
        """
        The provider type for the onelogin package. By default, resources use package-wide configuration
        settings, however an explicit `Provider` instance may be created and passed during resource
        construction to achieve fine-grained programmatic control over provider settings. See the
        [documentation](https://www.pulumi.com/docs/reference/programming-model/#providers) for more information.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ProviderArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        The provider type for the onelogin package. By default, resources use package-wide configuration
        settings, however an explicit `Provider` instance may be created and passed during resource
        construction to achieve fine-grained programmatic control over provider settings. See the
        [documentation](https://www.pulumi.com/docs/reference/programming-model/#providers) for more information.

        :param str resource_name: The name of the resource.
        :param ProviderArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ProviderArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 apikey_auth: Optional[pulumi.Input[str]] = None,
                 content_type: Optional[pulumi.Input[str]] = None,
                 endpoints: Optional[pulumi.Input[Sequence[pulumi.Input[Union['ProviderEndpointArgs', 'ProviderEndpointArgsDict']]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ProviderArgs.__new__(ProviderArgs)

            if apikey_auth is None and not opts.urn:
                raise TypeError("Missing required property 'apikey_auth'")
            __props__.__dict__["apikey_auth"] = apikey_auth
            __props__.__dict__["content_type"] = content_type
            __props__.__dict__["endpoints"] = pulumi.Output.from_input(endpoints).apply(pulumi.runtime.to_json) if endpoints is not None else None
        super(Provider, __self__).__init__(
            'onelogin',
            resource_name,
            __props__,
            opts)

    @property
    @pulumi.getter(name="apikeyAuth")
    def apikey_auth(self) -> pulumi.Output[str]:
        return pulumi.get(self, "apikey_auth")

    @property
    @pulumi.getter(name="contentType")
    def content_type(self) -> pulumi.Output[Optional[str]]:
        return pulumi.get(self, "content_type")

