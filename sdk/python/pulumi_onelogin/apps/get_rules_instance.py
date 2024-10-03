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
from .. import _utilities
from . import outputs
from ._inputs import *

__all__ = [
    'GetRulesInstanceResult',
    'AwaitableGetRulesInstanceResult',
    'get_rules_instance',
    'get_rules_instance_output',
]

@pulumi.output_type
class GetRulesInstanceResult:
    """
    A collection of values returned by getRulesInstance.
    """
    def __init__(__self__, actions=None, apps_id=None, conditions=None, enabled=None, id=None, match=None, name=None, position=None):
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
    def actions(self) -> Sequence['outputs.GetRulesInstanceActionResult']:
        return pulumi.get(self, "actions")

    @property
    @pulumi.getter(name="appsId")
    def apps_id(self) -> str:
        return pulumi.get(self, "apps_id")

    @property
    @pulumi.getter
    def conditions(self) -> Sequence['outputs.GetRulesInstanceConditionResult']:
        return pulumi.get(self, "conditions")

    @property
    @pulumi.getter
    def enabled(self) -> bool:
        return pulumi.get(self, "enabled")

    @property
    @pulumi.getter
    def id(self) -> str:
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


class AwaitableGetRulesInstanceResult(GetRulesInstanceResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetRulesInstanceResult(
            actions=self.actions,
            apps_id=self.apps_id,
            conditions=self.conditions,
            enabled=self.enabled,
            id=self.id,
            match=self.match,
            name=self.name,
            position=self.position)


def get_rules_instance(actions: Optional[Sequence[Union['GetRulesInstanceActionArgs', 'GetRulesInstanceActionArgsDict']]] = None,
                       apps_id: Optional[str] = None,
                       conditions: Optional[Sequence[Union['GetRulesInstanceConditionArgs', 'GetRulesInstanceConditionArgsDict']]] = None,
                       enabled: Optional[bool] = None,
                       id: Optional[str] = None,
                       match: Optional[str] = None,
                       name: Optional[str] = None,
                       position: Optional[int] = None,
                       opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetRulesInstanceResult:
    """
    Use this data source to access information about an existing resource.
    """
    __args__ = dict()
    __args__['actions'] = actions
    __args__['appsId'] = apps_id
    __args__['conditions'] = conditions
    __args__['enabled'] = enabled
    __args__['id'] = id
    __args__['match'] = match
    __args__['name'] = name
    __args__['position'] = position
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('onelogin:apps/getRulesInstance:getRulesInstance', __args__, opts=opts, typ=GetRulesInstanceResult).value

    return AwaitableGetRulesInstanceResult(
        actions=pulumi.get(__ret__, 'actions'),
        apps_id=pulumi.get(__ret__, 'apps_id'),
        conditions=pulumi.get(__ret__, 'conditions'),
        enabled=pulumi.get(__ret__, 'enabled'),
        id=pulumi.get(__ret__, 'id'),
        match=pulumi.get(__ret__, 'match'),
        name=pulumi.get(__ret__, 'name'),
        position=pulumi.get(__ret__, 'position'))
def get_rules_instance_output(actions: Optional[pulumi.Input[Optional[Sequence[Union['GetRulesInstanceActionArgs', 'GetRulesInstanceActionArgsDict']]]]] = None,
                              apps_id: Optional[pulumi.Input[str]] = None,
                              conditions: Optional[pulumi.Input[Optional[Sequence[Union['GetRulesInstanceConditionArgs', 'GetRulesInstanceConditionArgsDict']]]]] = None,
                              enabled: Optional[pulumi.Input[Optional[bool]]] = None,
                              id: Optional[pulumi.Input[str]] = None,
                              match: Optional[pulumi.Input[Optional[str]]] = None,
                              name: Optional[pulumi.Input[Optional[str]]] = None,
                              position: Optional[pulumi.Input[Optional[int]]] = None,
                              opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetRulesInstanceResult]:
    """
    Use this data source to access information about an existing resource.
    """
    __args__ = dict()
    __args__['actions'] = actions
    __args__['appsId'] = apps_id
    __args__['conditions'] = conditions
    __args__['enabled'] = enabled
    __args__['id'] = id
    __args__['match'] = match
    __args__['name'] = name
    __args__['position'] = position
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('onelogin:apps/getRulesInstance:getRulesInstance', __args__, opts=opts, typ=GetRulesInstanceResult)
    return __ret__.apply(lambda __response__: GetRulesInstanceResult(
        actions=pulumi.get(__response__, 'actions'),
        apps_id=pulumi.get(__response__, 'apps_id'),
        conditions=pulumi.get(__response__, 'conditions'),
        enabled=pulumi.get(__response__, 'enabled'),
        id=pulumi.get(__response__, 'id'),
        match=pulumi.get(__response__, 'match'),
        name=pulumi.get(__response__, 'name'),
        position=pulumi.get(__response__, 'position')))
