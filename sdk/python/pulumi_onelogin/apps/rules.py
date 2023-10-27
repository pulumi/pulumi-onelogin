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

__all__ = ['RulesArgs', 'Rules']

@pulumi.input_type
class RulesArgs:
    def __init__(__self__, *,
                 apps_id: pulumi.Input[str],
                 actions: Optional[pulumi.Input[Sequence[pulumi.Input['RulesActionArgs']]]] = None,
                 conditions: Optional[pulumi.Input[Sequence[pulumi.Input['RulesConditionArgs']]]] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 match: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 position: Optional[pulumi.Input[int]] = None):
        """
        The set of arguments for constructing a Rules resource.
        :param pulumi.Input[Sequence[pulumi.Input['RulesConditionArgs']]] conditions: An array of conditions that the user must meet in order for the rule to be applied.
        :param pulumi.Input[bool] enabled: Indicates if the rule is enabled or not.
        :param pulumi.Input[str] match: Indicates how conditions should be matched.
        :param pulumi.Input[str] name: Rule Name
        :param pulumi.Input[int] position: Indicates the order of the rule. When `null` this will default to last position.
        """
        pulumi.set(__self__, "apps_id", apps_id)
        if actions is not None:
            pulumi.set(__self__, "actions", actions)
        if conditions is not None:
            pulumi.set(__self__, "conditions", conditions)
        if enabled is not None:
            pulumi.set(__self__, "enabled", enabled)
        if match is not None:
            pulumi.set(__self__, "match", match)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if position is not None:
            pulumi.set(__self__, "position", position)

    @property
    @pulumi.getter(name="appsId")
    def apps_id(self) -> pulumi.Input[str]:
        return pulumi.get(self, "apps_id")

    @apps_id.setter
    def apps_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "apps_id", value)

    @property
    @pulumi.getter
    def actions(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['RulesActionArgs']]]]:
        return pulumi.get(self, "actions")

    @actions.setter
    def actions(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['RulesActionArgs']]]]):
        pulumi.set(self, "actions", value)

    @property
    @pulumi.getter
    def conditions(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['RulesConditionArgs']]]]:
        """
        An array of conditions that the user must meet in order for the rule to be applied.
        """
        return pulumi.get(self, "conditions")

    @conditions.setter
    def conditions(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['RulesConditionArgs']]]]):
        pulumi.set(self, "conditions", value)

    @property
    @pulumi.getter
    def enabled(self) -> Optional[pulumi.Input[bool]]:
        """
        Indicates if the rule is enabled or not.
        """
        return pulumi.get(self, "enabled")

    @enabled.setter
    def enabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "enabled", value)

    @property
    @pulumi.getter
    def match(self) -> Optional[pulumi.Input[str]]:
        """
        Indicates how conditions should be matched.
        """
        return pulumi.get(self, "match")

    @match.setter
    def match(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "match", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Rule Name
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def position(self) -> Optional[pulumi.Input[int]]:
        """
        Indicates the order of the rule. When `null` this will default to last position.
        """
        return pulumi.get(self, "position")

    @position.setter
    def position(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "position", value)


@pulumi.input_type
class _RulesState:
    def __init__(__self__, *,
                 actions: Optional[pulumi.Input[Sequence[pulumi.Input['RulesActionArgs']]]] = None,
                 apps_id: Optional[pulumi.Input[str]] = None,
                 conditions: Optional[pulumi.Input[Sequence[pulumi.Input['RulesConditionArgs']]]] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 match: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 position: Optional[pulumi.Input[int]] = None):
        """
        Input properties used for looking up and filtering Rules resources.
        :param pulumi.Input[Sequence[pulumi.Input['RulesConditionArgs']]] conditions: An array of conditions that the user must meet in order for the rule to be applied.
        :param pulumi.Input[bool] enabled: Indicates if the rule is enabled or not.
        :param pulumi.Input[str] match: Indicates how conditions should be matched.
        :param pulumi.Input[str] name: Rule Name
        :param pulumi.Input[int] position: Indicates the order of the rule. When `null` this will default to last position.
        """
        if actions is not None:
            pulumi.set(__self__, "actions", actions)
        if apps_id is not None:
            pulumi.set(__self__, "apps_id", apps_id)
        if conditions is not None:
            pulumi.set(__self__, "conditions", conditions)
        if enabled is not None:
            pulumi.set(__self__, "enabled", enabled)
        if match is not None:
            pulumi.set(__self__, "match", match)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if position is not None:
            pulumi.set(__self__, "position", position)

    @property
    @pulumi.getter
    def actions(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['RulesActionArgs']]]]:
        return pulumi.get(self, "actions")

    @actions.setter
    def actions(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['RulesActionArgs']]]]):
        pulumi.set(self, "actions", value)

    @property
    @pulumi.getter(name="appsId")
    def apps_id(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "apps_id")

    @apps_id.setter
    def apps_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "apps_id", value)

    @property
    @pulumi.getter
    def conditions(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['RulesConditionArgs']]]]:
        """
        An array of conditions that the user must meet in order for the rule to be applied.
        """
        return pulumi.get(self, "conditions")

    @conditions.setter
    def conditions(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['RulesConditionArgs']]]]):
        pulumi.set(self, "conditions", value)

    @property
    @pulumi.getter
    def enabled(self) -> Optional[pulumi.Input[bool]]:
        """
        Indicates if the rule is enabled or not.
        """
        return pulumi.get(self, "enabled")

    @enabled.setter
    def enabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "enabled", value)

    @property
    @pulumi.getter
    def match(self) -> Optional[pulumi.Input[str]]:
        """
        Indicates how conditions should be matched.
        """
        return pulumi.get(self, "match")

    @match.setter
    def match(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "match", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Rule Name
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def position(self) -> Optional[pulumi.Input[int]]:
        """
        Indicates the order of the rule. When `null` this will default to last position.
        """
        return pulumi.get(self, "position")

    @position.setter
    def position(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "position", value)


class Rules(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 actions: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['RulesActionArgs']]]]] = None,
                 apps_id: Optional[pulumi.Input[str]] = None,
                 conditions: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['RulesConditionArgs']]]]] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 match: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 position: Optional[pulumi.Input[int]] = None,
                 __props__=None):
        """
        Create a Rules resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['RulesConditionArgs']]]] conditions: An array of conditions that the user must meet in order for the rule to be applied.
        :param pulumi.Input[bool] enabled: Indicates if the rule is enabled or not.
        :param pulumi.Input[str] match: Indicates how conditions should be matched.
        :param pulumi.Input[str] name: Rule Name
        :param pulumi.Input[int] position: Indicates the order of the rule. When `null` this will default to last position.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: RulesArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Create a Rules resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param RulesArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(RulesArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 actions: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['RulesActionArgs']]]]] = None,
                 apps_id: Optional[pulumi.Input[str]] = None,
                 conditions: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['RulesConditionArgs']]]]] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 match: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 position: Optional[pulumi.Input[int]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = RulesArgs.__new__(RulesArgs)

            __props__.__dict__["actions"] = actions
            if apps_id is None and not opts.urn:
                raise TypeError("Missing required property 'apps_id'")
            __props__.__dict__["apps_id"] = apps_id
            __props__.__dict__["conditions"] = conditions
            __props__.__dict__["enabled"] = enabled
            __props__.__dict__["match"] = match
            __props__.__dict__["name"] = name
            __props__.__dict__["position"] = position
        super(Rules, __self__).__init__(
            'onelogin:apps/rules:Rules',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            actions: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['RulesActionArgs']]]]] = None,
            apps_id: Optional[pulumi.Input[str]] = None,
            conditions: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['RulesConditionArgs']]]]] = None,
            enabled: Optional[pulumi.Input[bool]] = None,
            match: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            position: Optional[pulumi.Input[int]] = None) -> 'Rules':
        """
        Get an existing Rules resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['RulesConditionArgs']]]] conditions: An array of conditions that the user must meet in order for the rule to be applied.
        :param pulumi.Input[bool] enabled: Indicates if the rule is enabled or not.
        :param pulumi.Input[str] match: Indicates how conditions should be matched.
        :param pulumi.Input[str] name: Rule Name
        :param pulumi.Input[int] position: Indicates the order of the rule. When `null` this will default to last position.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _RulesState.__new__(_RulesState)

        __props__.__dict__["actions"] = actions
        __props__.__dict__["apps_id"] = apps_id
        __props__.__dict__["conditions"] = conditions
        __props__.__dict__["enabled"] = enabled
        __props__.__dict__["match"] = match
        __props__.__dict__["name"] = name
        __props__.__dict__["position"] = position
        return Rules(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def actions(self) -> pulumi.Output[Optional[Sequence['outputs.RulesAction']]]:
        return pulumi.get(self, "actions")

    @property
    @pulumi.getter(name="appsId")
    def apps_id(self) -> pulumi.Output[str]:
        return pulumi.get(self, "apps_id")

    @property
    @pulumi.getter
    def conditions(self) -> pulumi.Output[Optional[Sequence['outputs.RulesCondition']]]:
        """
        An array of conditions that the user must meet in order for the rule to be applied.
        """
        return pulumi.get(self, "conditions")

    @property
    @pulumi.getter
    def enabled(self) -> pulumi.Output[Optional[bool]]:
        """
        Indicates if the rule is enabled or not.
        """
        return pulumi.get(self, "enabled")

    @property
    @pulumi.getter
    def match(self) -> pulumi.Output[Optional[str]]:
        """
        Indicates how conditions should be matched.
        """
        return pulumi.get(self, "match")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Rule Name
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def position(self) -> pulumi.Output[Optional[int]]:
        """
        Indicates the order of the rule. When `null` this will default to last position.
        """
        return pulumi.get(self, "position")

