# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = [
    'GetActionsFilterResult',
    'GetActionsValuesFilterResult',
    'GetConditionsFilterResult',
    'GetConditionsOperatorsFilterResult',
    'GetConditionsValuesFilterResult',
    'GetInstanceProvisioningResult',
    'GetRulesActionResult',
    'GetRulesConditionResult',
    'GetRulesFilterResult',
    'GetUsersFilterResult',
]

@pulumi.output_type
class GetActionsFilterResult(dict):
    def __init__(__self__, *,
                 name: str,
                 values: Sequence[str]):
        pulumi.set(__self__, "name", name)
        pulumi.set(__self__, "values", values)

    @property
    @pulumi.getter
    def name(self) -> str:
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def values(self) -> Sequence[str]:
        return pulumi.get(self, "values")


@pulumi.output_type
class GetActionsValuesFilterResult(dict):
    def __init__(__self__, *,
                 name: str,
                 values: Sequence[str]):
        pulumi.set(__self__, "name", name)
        pulumi.set(__self__, "values", values)

    @property
    @pulumi.getter
    def name(self) -> str:
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def values(self) -> Sequence[str]:
        return pulumi.get(self, "values")


@pulumi.output_type
class GetConditionsFilterResult(dict):
    def __init__(__self__, *,
                 name: str,
                 values: Sequence[str]):
        pulumi.set(__self__, "name", name)
        pulumi.set(__self__, "values", values)

    @property
    @pulumi.getter
    def name(self) -> str:
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def values(self) -> Sequence[str]:
        return pulumi.get(self, "values")


@pulumi.output_type
class GetConditionsOperatorsFilterResult(dict):
    def __init__(__self__, *,
                 name: str,
                 values: Sequence[str]):
        pulumi.set(__self__, "name", name)
        pulumi.set(__self__, "values", values)

    @property
    @pulumi.getter
    def name(self) -> str:
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def values(self) -> Sequence[str]:
        return pulumi.get(self, "values")


@pulumi.output_type
class GetConditionsValuesFilterResult(dict):
    def __init__(__self__, *,
                 name: str,
                 values: Sequence[str]):
        pulumi.set(__self__, "name", name)
        pulumi.set(__self__, "values", values)

    @property
    @pulumi.getter
    def name(self) -> str:
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def values(self) -> Sequence[str]:
        return pulumi.get(self, "values")


@pulumi.output_type
class GetInstanceProvisioningResult(dict):
    def __init__(__self__, *,
                 enabled: bool):
        pulumi.set(__self__, "enabled", enabled)

    @property
    @pulumi.getter
    def enabled(self) -> bool:
        return pulumi.get(self, "enabled")


@pulumi.output_type
class GetRulesActionResult(dict):
    def __init__(__self__, *,
                 action: str,
                 values: Sequence[str]):
        pulumi.set(__self__, "action", action)
        pulumi.set(__self__, "values", values)

    @property
    @pulumi.getter
    def action(self) -> str:
        return pulumi.get(self, "action")

    @property
    @pulumi.getter
    def values(self) -> Sequence[str]:
        return pulumi.get(self, "values")


@pulumi.output_type
class GetRulesConditionResult(dict):
    def __init__(__self__, *,
                 operator: str,
                 source: str,
                 value: str):
        pulumi.set(__self__, "operator", operator)
        pulumi.set(__self__, "source", source)
        pulumi.set(__self__, "value", value)

    @property
    @pulumi.getter
    def operator(self) -> str:
        return pulumi.get(self, "operator")

    @property
    @pulumi.getter
    def source(self) -> str:
        return pulumi.get(self, "source")

    @property
    @pulumi.getter
    def value(self) -> str:
        return pulumi.get(self, "value")


@pulumi.output_type
class GetRulesFilterResult(dict):
    def __init__(__self__, *,
                 name: str,
                 values: Sequence[str]):
        pulumi.set(__self__, "name", name)
        pulumi.set(__self__, "values", values)

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
        pulumi.set(__self__, "name", name)
        pulumi.set(__self__, "values", values)

    @property
    @pulumi.getter
    def name(self) -> str:
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def values(self) -> Sequence[str]:
        return pulumi.get(self, "values")


