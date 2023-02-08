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
    'GetInstanceResult',
    'AwaitableGetInstanceResult',
    'get_instance',
    'get_instance_output',
]

@pulumi.output_type
class GetInstanceResult:
    """
    A collection of values returned by getInstance.
    """
    def __init__(__self__, description=None, filters=None, id=None, name=None, source=None, target=None, type=None):
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
        if source and not isinstance(source, dict):
            raise TypeError("Expected argument 'source' to be a dict")
        pulumi.set(__self__, "source", source)
        if target and not isinstance(target, str):
            raise TypeError("Expected argument 'target' to be a str")
        pulumi.set(__self__, "target", target)
        if type and not isinstance(type, str):
            raise TypeError("Expected argument 'type' to be a str")
        pulumi.set(__self__, "type", type)

    @property
    @pulumi.getter
    def description(self) -> str:
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def filters(self) -> Sequence[str]:
        return pulumi.get(self, "filters")

    @property
    @pulumi.getter
    def id(self) -> str:
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def name(self) -> str:
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def source(self) -> 'outputs.GetInstanceSourceResult':
        return pulumi.get(self, "source")

    @property
    @pulumi.getter
    def target(self) -> str:
        return pulumi.get(self, "target")

    @property
    @pulumi.getter
    def type(self) -> str:
        return pulumi.get(self, "type")


class AwaitableGetInstanceResult(GetInstanceResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetInstanceResult(
            description=self.description,
            filters=self.filters,
            id=self.id,
            name=self.name,
            source=self.source,
            target=self.target,
            type=self.type)


def get_instance(description: Optional[str] = None,
                 filters: Optional[Sequence[str]] = None,
                 id: Optional[str] = None,
                 name: Optional[str] = None,
                 source: Optional[pulumi.InputType['GetInstanceSourceArgs']] = None,
                 target: Optional[str] = None,
                 type: Optional[str] = None,
                 opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetInstanceResult:
    """
    Use this data source to access information about an existing resource.
    """
    __args__ = dict()
    __args__['description'] = description
    __args__['filters'] = filters
    __args__['id'] = id
    __args__['name'] = name
    __args__['source'] = source
    __args__['target'] = target
    __args__['type'] = type
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('onelogin:rules/getInstance:getInstance', __args__, opts=opts, typ=GetInstanceResult).value

    return AwaitableGetInstanceResult(
        description=__ret__.description,
        filters=__ret__.filters,
        id=__ret__.id,
        name=__ret__.name,
        source=__ret__.source,
        target=__ret__.target,
        type=__ret__.type)


@_utilities.lift_output_func(get_instance)
def get_instance_output(description: Optional[pulumi.Input[Optional[str]]] = None,
                        filters: Optional[pulumi.Input[Optional[Sequence[str]]]] = None,
                        id: Optional[pulumi.Input[str]] = None,
                        name: Optional[pulumi.Input[Optional[str]]] = None,
                        source: Optional[pulumi.Input[Optional[pulumi.InputType['GetInstanceSourceArgs']]]] = None,
                        target: Optional[pulumi.Input[Optional[str]]] = None,
                        type: Optional[pulumi.Input[Optional[str]]] = None,
                        opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetInstanceResult]:
    """
    Use this data source to access information about an existing resource.
    """
    ...