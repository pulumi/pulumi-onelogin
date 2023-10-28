# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities
from . import outputs
from ._inputs import *

__all__ = [
    'GetActionsResult',
    'AwaitableGetActionsResult',
    'get_actions',
    'get_actions_output',
]

@pulumi.output_type
class GetActionsResult:
    """
    A collection of values returned by getActions.
    """
    def __init__(__self__, apps_id=None, filters=None, id=None, name=None, value=None):
        if apps_id and not isinstance(apps_id, str):
            raise TypeError("Expected argument 'apps_id' to be a str")
        pulumi.set(__self__, "apps_id", apps_id)
        if filters and not isinstance(filters, list):
            raise TypeError("Expected argument 'filters' to be a list")
        pulumi.set(__self__, "filters", filters)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if value and not isinstance(value, str):
            raise TypeError("Expected argument 'value' to be a str")
        pulumi.set(__self__, "value", value)

    @property
    @pulumi.getter(name="appsId")
    def apps_id(self) -> str:
        return pulumi.get(self, "apps_id")

    @property
    @pulumi.getter
    def filters(self) -> Optional[Sequence['outputs.GetActionsFilterResult']]:
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
    def value(self) -> str:
        return pulumi.get(self, "value")


class AwaitableGetActionsResult(GetActionsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetActionsResult(
            apps_id=self.apps_id,
            filters=self.filters,
            id=self.id,
            name=self.name,
            value=self.value)


def get_actions(apps_id: Optional[str] = None,
                filters: Optional[Sequence[pulumi.InputType['GetActionsFilterArgs']]] = None,
                name: Optional[str] = None,
                value: Optional[str] = None,
                opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetActionsResult:
    """
    Use this data source to access information about an existing resource.
    """
    __args__ = dict()
    __args__['appsId'] = apps_id
    __args__['filters'] = filters
    __args__['name'] = name
    __args__['value'] = value
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('onelogin:apps/getActions:getActions', __args__, opts=opts, typ=GetActionsResult).value

    return AwaitableGetActionsResult(
        apps_id=pulumi.get(__ret__, 'apps_id'),
        filters=pulumi.get(__ret__, 'filters'),
        id=pulumi.get(__ret__, 'id'),
        name=pulumi.get(__ret__, 'name'),
        value=pulumi.get(__ret__, 'value'))


@_utilities.lift_output_func(get_actions)
def get_actions_output(apps_id: Optional[pulumi.Input[str]] = None,
                       filters: Optional[pulumi.Input[Optional[Sequence[pulumi.InputType['GetActionsFilterArgs']]]]] = None,
                       name: Optional[pulumi.Input[Optional[str]]] = None,
                       value: Optional[pulumi.Input[Optional[str]]] = None,
                       opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetActionsResult]:
    """
    Use this data source to access information about an existing resource.
    """
    ...
