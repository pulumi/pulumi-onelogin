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
    'GetRulesResult',
    'AwaitableGetRulesResult',
    'get_rules',
    'get_rules_output',
]

@pulumi.output_type
class GetRulesResult:
    """
    A collection of values returned by getRules.
    """
    def __init__(__self__, actions=None, apps_id=None, conditions=None, enabled=None, filters=None, id=None, match=None, name=None, position=None):
        if actions and not isinstance(actions, list):
            raise TypeError("Expected argument 'actions' to be a list")
        pulumi.set(__self__, "actions", actions)
        if apps_id and not isinstance(apps_id, str):
            raise TypeError("Expected argument 'apps_id' to be a str")
        pulumi.set(__self__, "apps_id", apps_id)
        if conditions and not isinstance(conditions, list):
            raise TypeError("Expected argument 'conditions' to be a list")
        pulumi.set(__self__, "conditions", conditions)
        if enabled and not isinstance(enabled, bool):
            raise TypeError("Expected argument 'enabled' to be a bool")
        pulumi.set(__self__, "enabled", enabled)
        if filters and not isinstance(filters, list):
            raise TypeError("Expected argument 'filters' to be a list")
        pulumi.set(__self__, "filters", filters)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if match and not isinstance(match, str):
            raise TypeError("Expected argument 'match' to be a str")
        pulumi.set(__self__, "match", match)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if position and not isinstance(position, int):
            raise TypeError("Expected argument 'position' to be a int")
        pulumi.set(__self__, "position", position)

    @property
    @pulumi.getter
    def actions(self) -> Sequence['outputs.GetRulesActionResult']:
        return pulumi.get(self, "actions")

    @property
    @pulumi.getter(name="appsId")
    def apps_id(self) -> str:
        return pulumi.get(self, "apps_id")

    @property
    @pulumi.getter
    def conditions(self) -> Sequence['outputs.GetRulesConditionResult']:
        return pulumi.get(self, "conditions")

    @property
    @pulumi.getter
    def enabled(self) -> bool:
        return pulumi.get(self, "enabled")

    @property
    @pulumi.getter
    def filters(self) -> Optional[Sequence['outputs.GetRulesFilterResult']]:
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
    def match(self) -> str:
        return pulumi.get(self, "match")

    @property
    @pulumi.getter
    def name(self) -> str:
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def position(self) -> int:
        return pulumi.get(self, "position")


class AwaitableGetRulesResult(GetRulesResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetRulesResult(
            actions=self.actions,
            apps_id=self.apps_id,
            conditions=self.conditions,
            enabled=self.enabled,
            filters=self.filters,
            id=self.id,
            match=self.match,
            name=self.name,
            position=self.position)


def get_rules(actions: Optional[Sequence[pulumi.InputType['GetRulesActionArgs']]] = None,
              apps_id: Optional[str] = None,
              conditions: Optional[Sequence[pulumi.InputType['GetRulesConditionArgs']]] = None,
              enabled: Optional[bool] = None,
              filters: Optional[Sequence[pulumi.InputType['GetRulesFilterArgs']]] = None,
              match: Optional[str] = None,
              name: Optional[str] = None,
              position: Optional[int] = None,
              opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetRulesResult:
    """
    Use this data source to access information about an existing resource.
    """
    __args__ = dict()
    __args__['actions'] = actions
    __args__['appsId'] = apps_id
    __args__['conditions'] = conditions
    __args__['enabled'] = enabled
    __args__['filters'] = filters
    __args__['match'] = match
    __args__['name'] = name
    __args__['position'] = position
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('onelogin:apps/getRules:getRules', __args__, opts=opts, typ=GetRulesResult).value

    return AwaitableGetRulesResult(
        actions=pulumi.get(__ret__, 'actions'),
        apps_id=pulumi.get(__ret__, 'apps_id'),
        conditions=pulumi.get(__ret__, 'conditions'),
        enabled=pulumi.get(__ret__, 'enabled'),
        filters=pulumi.get(__ret__, 'filters'),
        id=pulumi.get(__ret__, 'id'),
        match=pulumi.get(__ret__, 'match'),
        name=pulumi.get(__ret__, 'name'),
        position=pulumi.get(__ret__, 'position'))


@_utilities.lift_output_func(get_rules)
def get_rules_output(actions: Optional[pulumi.Input[Optional[Sequence[pulumi.InputType['GetRulesActionArgs']]]]] = None,
                     apps_id: Optional[pulumi.Input[str]] = None,
                     conditions: Optional[pulumi.Input[Optional[Sequence[pulumi.InputType['GetRulesConditionArgs']]]]] = None,
                     enabled: Optional[pulumi.Input[Optional[bool]]] = None,
                     filters: Optional[pulumi.Input[Optional[Sequence[pulumi.InputType['GetRulesFilterArgs']]]]] = None,
                     match: Optional[pulumi.Input[Optional[str]]] = None,
                     name: Optional[pulumi.Input[Optional[str]]] = None,
                     position: Optional[pulumi.Input[Optional[int]]] = None,
                     opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetRulesResult]:
    """
    Use this data source to access information about an existing resource.
    """
    ...
