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
    'GetAdminsFilterArgs',
    'GetAdminsFilterArgsDict',
    'GetAppsFilterArgs',
    'GetAppsFilterArgsDict',
    'GetRolesFilterArgs',
    'GetRolesFilterArgsDict',
    'GetUsersFilterArgs',
    'GetUsersFilterArgsDict',
]

MYPY = False

if not MYPY:
    class GetAdminsFilterArgsDict(TypedDict):
        name: str
        values: Sequence[str]
elif False:
    GetAdminsFilterArgsDict: TypeAlias = Mapping[str, Any]

@pulumi.input_type
class GetAdminsFilterArgs:
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
    class GetRolesFilterArgsDict(TypedDict):
        name: str
        values: Sequence[str]
elif False:
    GetRolesFilterArgsDict: TypeAlias = Mapping[str, Any]

@pulumi.input_type
class GetRolesFilterArgs:
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


