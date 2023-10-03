# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from .. import _utilities
from . import outputs
from ._inputs import *

__all__ = [
    'GetConditionsOperatorsResult',
    'AwaitableGetConditionsOperatorsResult',
    'get_conditions_operators',
    'get_conditions_operators_output',
]

@pulumi.output_type
class GetConditionsOperatorsResult:
    """
    A collection of values returned by getConditionsOperators.
    """
    def __init__(__self__, apps_id=None, conditions_id=None, filters=None, id=None, name=None, value=None):
        if apps_id and not isinstance(apps_id, str):
            raise TypeError("Expected argument 'apps_id' to be a str")
        pulumi.set(__self__, "apps_id", apps_id)
        if conditions_id and not isinstance(conditions_id, str):
            raise TypeError("Expected argument 'conditions_id' to be a str")
        pulumi.set(__self__, "conditions_id", conditions_id)
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
    @pulumi.getter(name="conditionsId")
    def conditions_id(self) -> str:
        return pulumi.get(self, "conditions_id")

    @property
    @pulumi.getter
    def filters(self) -> Optional[Sequence['outputs.GetConditionsOperatorsFilterResult']]:
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


class AwaitableGetConditionsOperatorsResult(GetConditionsOperatorsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetConditionsOperatorsResult(
            apps_id=self.apps_id,
            conditions_id=self.conditions_id,
            filters=self.filters,
            id=self.id,
            name=self.name,
            value=self.value)


def get_conditions_operators(apps_id: Optional[str] = None,
                             conditions_id: Optional[str] = None,
                             filters: Optional[Sequence[pulumi.InputType['GetConditionsOperatorsFilterArgs']]] = None,
                             name: Optional[str] = None,
                             value: Optional[str] = None,
                             opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetConditionsOperatorsResult:
    """
    Use this data source to access information about an existing resource.
    """
    __args__ = dict()
    __args__['appsId'] = apps_id
    __args__['conditionsId'] = conditions_id
    __args__['filters'] = filters
    __args__['name'] = name
    __args__['value'] = value
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('onelogin:apps/getConditionsOperators:getConditionsOperators', __args__, opts=opts, typ=GetConditionsOperatorsResult).value

    return AwaitableGetConditionsOperatorsResult(
        apps_id=pulumi.get(__ret__, 'apps_id'),
        conditions_id=pulumi.get(__ret__, 'conditions_id'),
        filters=pulumi.get(__ret__, 'filters'),
        id=pulumi.get(__ret__, 'id'),
        name=pulumi.get(__ret__, 'name'),
        value=pulumi.get(__ret__, 'value'))


@_utilities.lift_output_func(get_conditions_operators)
def get_conditions_operators_output(apps_id: Optional[pulumi.Input[str]] = None,
                                    conditions_id: Optional[pulumi.Input[str]] = None,
                                    filters: Optional[pulumi.Input[Optional[Sequence[pulumi.InputType['GetConditionsOperatorsFilterArgs']]]]] = None,
                                    name: Optional[pulumi.Input[Optional[str]]] = None,
                                    value: Optional[pulumi.Input[Optional[str]]] = None,
                                    opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetConditionsOperatorsResult]:
    """
    Use this data source to access information about an existing resource.
    """
    ...
