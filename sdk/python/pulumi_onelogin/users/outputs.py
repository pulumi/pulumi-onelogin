# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = [
    'GetAppsFilterResult',
    'GetDevicesFilterResult',
    'GetUsersFilterResult',
    'GetV1AppsFilterResult',
    'GetV1FilterResult',
]

@pulumi.output_type
class GetAppsFilterResult(dict):
    def __init__(__self__, *,
                 name: str,
                 values: Sequence[str]):
        GetAppsFilterResult._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            name=name,
            values=values,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             name: Optional[str] = None,
             values: Optional[Sequence[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None,
             **kwargs):
        if name is None:
            raise TypeError("Missing 'name' argument")
        if values is None:
            raise TypeError("Missing 'values' argument")

        _setter("name", name)
        _setter("values", values)

    @property
    @pulumi.getter
    def name(self) -> str:
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def values(self) -> Sequence[str]:
        return pulumi.get(self, "values")


@pulumi.output_type
class GetDevicesFilterResult(dict):
    def __init__(__self__, *,
                 name: str,
                 values: Sequence[str]):
        GetDevicesFilterResult._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            name=name,
            values=values,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             name: Optional[str] = None,
             values: Optional[Sequence[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None,
             **kwargs):
        if name is None:
            raise TypeError("Missing 'name' argument")
        if values is None:
            raise TypeError("Missing 'values' argument")

        _setter("name", name)
        _setter("values", values)

    @property
    @pulumi.getter
    def name(self) -> str:
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def values(self) -> Sequence[str]:
        return pulumi.get(self, "values")


@pulumi.output_type
class GetUsersFilterResult(dict):
    def __init__(__self__, *,
                 name: str,
                 values: Sequence[str]):
        GetUsersFilterResult._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            name=name,
            values=values,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             name: Optional[str] = None,
             values: Optional[Sequence[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None,
             **kwargs):
        if name is None:
            raise TypeError("Missing 'name' argument")
        if values is None:
            raise TypeError("Missing 'values' argument")

        _setter("name", name)
        _setter("values", values)

    @property
    @pulumi.getter
    def name(self) -> str:
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def values(self) -> Sequence[str]:
        return pulumi.get(self, "values")


@pulumi.output_type
class GetV1AppsFilterResult(dict):
    def __init__(__self__, *,
                 name: str,
                 values: Sequence[str]):
        GetV1AppsFilterResult._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            name=name,
            values=values,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             name: Optional[str] = None,
             values: Optional[Sequence[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None,
             **kwargs):
        if name is None:
            raise TypeError("Missing 'name' argument")
        if values is None:
            raise TypeError("Missing 'values' argument")

        _setter("name", name)
        _setter("values", values)

    @property
    @pulumi.getter
    def name(self) -> str:
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def values(self) -> Sequence[str]:
        return pulumi.get(self, "values")


@pulumi.output_type
class GetV1FilterResult(dict):
    def __init__(__self__, *,
                 name: str,
                 values: Sequence[str]):
        GetV1FilterResult._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            name=name,
            values=values,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             name: Optional[str] = None,
             values: Optional[Sequence[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None,
             **kwargs):
        if name is None:
            raise TypeError("Missing 'name' argument")
        if values is None:
            raise TypeError("Missing 'values' argument")

        _setter("name", name)
        _setter("values", values)

    @property
    @pulumi.getter
    def name(self) -> str:
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def values(self) -> Sequence[str]:
        return pulumi.get(self, "values")


