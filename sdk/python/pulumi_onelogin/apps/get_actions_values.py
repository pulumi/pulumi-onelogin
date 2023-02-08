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
    'GetActionsValuesResult',
    'AwaitableGetActionsValuesResult',
    'get_actions_values',
    'get_actions_values_output',
]

@pulumi.output_type
class GetActionsValuesResult:
    """
    A collection of values returned by getActionsValues.
    """
    def __init__(__self__, actions_id=None, apps_id=None, filters=None, id=None, name=None, value=None):
        if actions_id and not isinstance(actions_id, str):
            raise TypeError("Expected argument 'actions_id' to be a str")
        pulumi.set(__self__, "actions_id", actions_id)
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
    @pulumi.getter(name="actionsId")
    def actions_id(self) -> str:
        return pulumi.get(self, "actions_id")

    @property
    @pulumi.getter(name="appsId")
    def apps_id(self) -> str:
        return pulumi.get(self, "apps_id")

    @property
    @pulumi.getter
    def filters(self) -> Optional[Sequence['outputs.GetActionsValuesFilterResult']]:
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


class AwaitableGetActionsValuesResult(GetActionsValuesResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetActionsValuesResult(
            actions_id=self.actions_id,
            apps_id=self.apps_id,
            filters=self.filters,
            id=self.id,
            name=self.name,
            value=self.value)


def get_actions_values(actions_id: Optional[str] = None,
                       apps_id: Optional[str] = None,
                       filters: Optional[Sequence[pulumi.InputType['GetActionsValuesFilterArgs']]] = None,
                       name: Optional[str] = None,
                       value: Optional[str] = None,
                       opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetActionsValuesResult:
    """
    Use this data source to access information about an existing resource.
    """
    __args__ = dict()
    __args__['actionsId'] = actions_id
    __args__['appsId'] = apps_id
    __args__['filters'] = filters
    __args__['name'] = name
    __args__['value'] = value
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('onelogin:apps/getActionsValues:getActionsValues', __args__, opts=opts, typ=GetActionsValuesResult).value

    return AwaitableGetActionsValuesResult(
        actions_id=__ret__.actions_id,
        apps_id=__ret__.apps_id,
        filters=__ret__.filters,
        id=__ret__.id,
        name=__ret__.name,
        value=__ret__.value)


@_utilities.lift_output_func(get_actions_values)
def get_actions_values_output(actions_id: Optional[pulumi.Input[str]] = None,
                              apps_id: Optional[pulumi.Input[str]] = None,
                              filters: Optional[pulumi.Input[Optional[Sequence[pulumi.InputType['GetActionsValuesFilterArgs']]]]] = None,
                              name: Optional[pulumi.Input[Optional[str]]] = None,
                              value: Optional[pulumi.Input[Optional[str]]] = None,
                              opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetActionsValuesResult]:
    """
    Use this data source to access information about an existing resource.
    """
    ...