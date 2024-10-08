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

__all__ = [
    'GetAppsFilterArgs',
    'GetAppsFilterArgsDict',
    'GetDevicesFilterArgs',
    'GetDevicesFilterArgsDict',
    'GetUsersFilterArgs',
    'GetUsersFilterArgsDict',
    'GetV1AppsFilterArgs',
    'GetV1AppsFilterArgsDict',
    'GetV1FilterArgs',
    'GetV1FilterArgsDict',
]

MYPY = False

if not MYPY:
    class GetAppsFilterArgsDict(TypedDict):
        name: str
        values: Sequence[str]
elif False:
    GetAppsFilterArgsDict: TypeAlias = Mapping[str, Any]

@pulumi.input_type
class GetAppsFilterArgs:
    def __init__(__self__, *,
                 name: str,
                 values: Sequence[str]):
        pulumi.set(__self__, "name", name)
        pulumi.set(__self__, "values", values)

    @property
    @pulumi.getter
    def name(self) -> str:
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: str):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def values(self) -> Sequence[str]:
        return pulumi.get(self, "values")

    @values.setter
    def values(self, value: Sequence[str]):
        pulumi.set(self, "values", value)


if not MYPY:
    class GetDevicesFilterArgsDict(TypedDict):
        name: str
        values: Sequence[str]
elif False:
    GetDevicesFilterArgsDict: TypeAlias = Mapping[str, Any]

@pulumi.input_type
class GetDevicesFilterArgs:
    def __init__(__self__, *,
                 name: str,
                 values: Sequence[str]):
        pulumi.set(__self__, "name", name)
        pulumi.set(__self__, "values", values)

    @property
    @pulumi.getter
    def name(self) -> str:
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: str):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def values(self) -> Sequence[str]:
        return pulumi.get(self, "values")

    @values.setter
    def values(self, value: Sequence[str]):
        pulumi.set(self, "values", value)


if not MYPY:
    class GetUsersFilterArgsDict(TypedDict):
        name: str
        values: Sequence[str]
elif False:
    GetUsersFilterArgsDict: TypeAlias = Mapping[str, Any]

@pulumi.input_type
class GetUsersFilterArgs:
    def __init__(__self__, *,
                 name: str,
                 values: Sequence[str]):
        pulumi.set(__self__, "name", name)
        pulumi.set(__self__, "values", values)

    @property
    @pulumi.getter
    def name(self) -> str:
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: str):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def values(self) -> Sequence[str]:
        return pulumi.get(self, "values")

    @values.setter
    def values(self, value: Sequence[str]):
        pulumi.set(self, "values", value)


if not MYPY:
    class GetV1AppsFilterArgsDict(TypedDict):
        name: str
        values: Sequence[str]
elif False:
    GetV1AppsFilterArgsDict: TypeAlias = Mapping[str, Any]

@pulumi.input_type
class GetV1AppsFilterArgs:
    def __init__(__self__, *,
                 name: str,
                 values: Sequence[str]):
        pulumi.set(__self__, "name", name)
        pulumi.set(__self__, "values", values)

    @property
    @pulumi.getter
    def name(self) -> str:
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: str):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def values(self) -> Sequence[str]:
        return pulumi.get(self, "values")

    @values.setter
    def values(self, value: Sequence[str]):
        pulumi.set(self, "values", value)


if not MYPY:
    class GetV1FilterArgsDict(TypedDict):
        name: str
        values: Sequence[str]
elif False:
    GetV1FilterArgsDict: TypeAlias = Mapping[str, Any]

@pulumi.input_type
class GetV1FilterArgs:
    def __init__(__self__, *,
                 name: str,
                 values: Sequence[str]):
        pulumi.set(__self__, "name", name)
        pulumi.set(__self__, "values", values)

    @property
    @pulumi.getter
    def name(self) -> str:
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: str):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def values(self) -> Sequence[str]:
        return pulumi.get(self, "values")

    @values.setter
    def values(self, value: Sequence[str]):
        pulumi.set(self, "values", value)


