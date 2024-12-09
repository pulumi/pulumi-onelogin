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
    'GetPrivilegesResult',
    'AwaitableGetPrivilegesResult',
    'get_privileges',
    'get_privileges_output',
]

@pulumi.output_type
class GetPrivilegesResult:
    """
    A collection of values returned by getPrivileges.
    """
    def __init__(__self__, description=None, filters=None, id=None, name=None, privilege=None):
        if description and not isinstance(description, str):
            raise TypeError("Expected argument 'description' to be a str")
        pulumi.set(__self__, "description", description)
        if filters and not isinstance(filters, list):
            raise TypeError("Expected argument 'filters' to be a list")
        pulumi.set(__self__, "filters", filters)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if privilege and not isinstance(privilege, dict):
            raise TypeError("Expected argument 'privilege' to be a dict")
        pulumi.set(__self__, "privilege", privilege)

    @property
    @pulumi.getter
    def description(self) -> str:
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def filters(self) -> Optional[Sequence['outputs.GetPrivilegesFilterResult']]:
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
    def name(self) -> str:
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def privilege(self) -> 'outputs.GetPrivilegesPrivilegeResult':
        return pulumi.get(self, "privilege")


class AwaitableGetPrivilegesResult(GetPrivilegesResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetPrivilegesResult(
            description=self.description,
            filters=self.filters,
            id=self.id,
            name=self.name,
            privilege=self.privilege)


def get_privileges(description: Optional[str] = None,
                   filters: Optional[Sequence[Union['GetPrivilegesFilterArgs', 'GetPrivilegesFilterArgsDict']]] = None,
                   name: Optional[str] = None,
                   privilege: Optional[Union['GetPrivilegesPrivilegeArgs', 'GetPrivilegesPrivilegeArgsDict']] = None,
                   opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetPrivilegesResult:
    """
    Use this data source to access information about an existing resource.
    """
    __args__ = dict()
    __args__['description'] = description
    __args__['filters'] = filters
    __args__['name'] = name
    __args__['privilege'] = privilege
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('onelogin:index/getPrivileges:getPrivileges', __args__, opts=opts, typ=GetPrivilegesResult).value

    return AwaitableGetPrivilegesResult(
        description=pulumi.get(__ret__, 'description'),
        filters=pulumi.get(__ret__, 'filters'),
        id=pulumi.get(__ret__, 'id'),
        name=pulumi.get(__ret__, 'name'),
        privilege=pulumi.get(__ret__, 'privilege'))
def get_privileges_output(description: Optional[pulumi.Input[Optional[str]]] = None,
                          filters: Optional[pulumi.Input[Optional[Sequence[Union['GetPrivilegesFilterArgs', 'GetPrivilegesFilterArgsDict']]]]] = None,
                          name: Optional[pulumi.Input[Optional[str]]] = None,
                          privilege: Optional[pulumi.Input[Optional[Union['GetPrivilegesPrivilegeArgs', 'GetPrivilegesPrivilegeArgsDict']]]] = None,
                          opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetPrivilegesResult]:
    """
    Use this data source to access information about an existing resource.
    """
    __args__ = dict()
    __args__['description'] = description
    __args__['filters'] = filters
    __args__['name'] = name
    __args__['privilege'] = privilege
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('onelogin:index/getPrivileges:getPrivileges', __args__, opts=opts, typ=GetPrivilegesResult)
    return __ret__.apply(lambda __response__: GetPrivilegesResult(
        description=pulumi.get(__response__, 'description'),
        filters=pulumi.get(__response__, 'filters'),
        id=pulumi.get(__response__, 'id'),
        name=pulumi.get(__response__, 'name'),
        privilege=pulumi.get(__response__, 'privilege')))
