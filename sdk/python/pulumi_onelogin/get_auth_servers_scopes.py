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
from ._inputs import *

__all__ = [
    'GetAuthServersScopesResult',
    'AwaitableGetAuthServersScopesResult',
    'get_auth_servers_scopes',
    'get_auth_servers_scopes_output',
]

@pulumi.output_type
class GetAuthServersScopesResult:
    """
    A collection of values returned by getAuthServersScopes.
    """
    def __init__(__self__, auth_servers_id=None, description=None, filters=None, id=None, value=None):
        if auth_servers_id and not isinstance(auth_servers_id, str):
            raise TypeError("Expected argument 'auth_servers_id' to be a str")
        pulumi.set(__self__, "auth_servers_id", auth_servers_id)
        if description and not isinstance(description, str):
            raise TypeError("Expected argument 'description' to be a str")
        pulumi.set(__self__, "description", description)
        if filters and not isinstance(filters, list):
            raise TypeError("Expected argument 'filters' to be a list")
        pulumi.set(__self__, "filters", filters)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if value and not isinstance(value, str):
            raise TypeError("Expected argument 'value' to be a str")
        pulumi.set(__self__, "value", value)

    @property
    @pulumi.getter(name="authServersId")
    def auth_servers_id(self) -> str:
        return pulumi.get(self, "auth_servers_id")

    @property
    @pulumi.getter
    def description(self) -> str:
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def filters(self) -> Optional[Sequence['outputs.GetAuthServersScopesFilterResult']]:
        return pulumi.get(self, "filters")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def value(self) -> str:
        return pulumi.get(self, "value")


class AwaitableGetAuthServersScopesResult(GetAuthServersScopesResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetAuthServersScopesResult(
            auth_servers_id=self.auth_servers_id,
            description=self.description,
            filters=self.filters,
            id=self.id,
            value=self.value)


def get_auth_servers_scopes(auth_servers_id: Optional[str] = None,
                            description: Optional[str] = None,
                            filters: Optional[Sequence[Union['GetAuthServersScopesFilterArgs', 'GetAuthServersScopesFilterArgsDict']]] = None,
                            value: Optional[str] = None,
                            opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetAuthServersScopesResult:
    """
    Use this data source to access information about an existing resource.
    """
    __args__ = dict()
    __args__['authServersId'] = auth_servers_id
    __args__['description'] = description
    __args__['filters'] = filters
    __args__['value'] = value
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('onelogin:index/getAuthServersScopes:getAuthServersScopes', __args__, opts=opts, typ=GetAuthServersScopesResult).value

    return AwaitableGetAuthServersScopesResult(
        auth_servers_id=pulumi.get(__ret__, 'auth_servers_id'),
        description=pulumi.get(__ret__, 'description'),
        filters=pulumi.get(__ret__, 'filters'),
        id=pulumi.get(__ret__, 'id'),
        value=pulumi.get(__ret__, 'value'))
def get_auth_servers_scopes_output(auth_servers_id: Optional[pulumi.Input[str]] = None,
                                   description: Optional[pulumi.Input[Optional[str]]] = None,
                                   filters: Optional[pulumi.Input[Optional[Sequence[Union['GetAuthServersScopesFilterArgs', 'GetAuthServersScopesFilterArgsDict']]]]] = None,
                                   value: Optional[pulumi.Input[Optional[str]]] = None,
                                   opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetAuthServersScopesResult]:
    """
    Use this data source to access information about an existing resource.
    """
    __args__ = dict()
    __args__['authServersId'] = auth_servers_id
    __args__['description'] = description
    __args__['filters'] = filters
    __args__['value'] = value
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('onelogin:index/getAuthServersScopes:getAuthServersScopes', __args__, opts=opts, typ=GetAuthServersScopesResult)
    return __ret__.apply(lambda __response__: GetAuthServersScopesResult(
        auth_servers_id=pulumi.get(__response__, 'auth_servers_id'),
        description=pulumi.get(__response__, 'description'),
        filters=pulumi.get(__response__, 'filters'),
        id=pulumi.get(__response__, 'id'),
        value=pulumi.get(__response__, 'value')))
