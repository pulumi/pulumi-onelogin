# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities
from . import outputs
from ._inputs import *

__all__ = ['RiskRulesArgs', 'RiskRules']

@pulumi.input_type
class RiskRulesArgs:
    def __init__(__self__, *,
                 description: Optional[pulumi.Input[str]] = None,
                 filters: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 source: Optional[pulumi.Input['RiskRulesSourceArgs']] = None,
                 target: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a RiskRules resource.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] filters: A list of IP addresses or country codes or names to evaluate against each event.
        :param pulumi.Input[str] name: The name of this rule
        :param pulumi.Input['RiskRulesSourceArgs'] source: Used for targeting custom rules based on a group of people, customers, accounts, or even a single user.
        :param pulumi.Input[str] target: The target parameter that will be used when evaluating the rule against an incoming event.
        :param pulumi.Input[str] type: The type parameter specifies the type of rule that will be created.
        """
        if description is not None:
            pulumi.set(__self__, "description", description)
        if filters is not None:
            pulumi.set(__self__, "filters", filters)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if source is not None:
            pulumi.set(__self__, "source", source)
        if target is not None:
            pulumi.set(__self__, "target", target)
        if type is not None:
            pulumi.set(__self__, "type", type)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def filters(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        A list of IP addresses or country codes or names to evaluate against each event.
        """
        return pulumi.get(self, "filters")

    @filters.setter
    def filters(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "filters", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of this rule
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def source(self) -> Optional[pulumi.Input['RiskRulesSourceArgs']]:
        """
        Used for targeting custom rules based on a group of people, customers, accounts, or even a single user.
        """
        return pulumi.get(self, "source")

    @source.setter
    def source(self, value: Optional[pulumi.Input['RiskRulesSourceArgs']]):
        pulumi.set(self, "source", value)

    @property
    @pulumi.getter
    def target(self) -> Optional[pulumi.Input[str]]:
        """
        The target parameter that will be used when evaluating the rule against an incoming event.
        """
        return pulumi.get(self, "target")

    @target.setter
    def target(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "target", value)

    @property
    @pulumi.getter
    def type(self) -> Optional[pulumi.Input[str]]:
        """
        The type parameter specifies the type of rule that will be created.
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "type", value)


@pulumi.input_type
class _RiskRulesState:
    def __init__(__self__, *,
                 description: Optional[pulumi.Input[str]] = None,
                 filters: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 source: Optional[pulumi.Input['RiskRulesSourceArgs']] = None,
                 target: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering RiskRules resources.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] filters: A list of IP addresses or country codes or names to evaluate against each event.
        :param pulumi.Input[str] name: The name of this rule
        :param pulumi.Input['RiskRulesSourceArgs'] source: Used for targeting custom rules based on a group of people, customers, accounts, or even a single user.
        :param pulumi.Input[str] target: The target parameter that will be used when evaluating the rule against an incoming event.
        :param pulumi.Input[str] type: The type parameter specifies the type of rule that will be created.
        """
        if description is not None:
            pulumi.set(__self__, "description", description)
        if filters is not None:
            pulumi.set(__self__, "filters", filters)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if source is not None:
            pulumi.set(__self__, "source", source)
        if target is not None:
            pulumi.set(__self__, "target", target)
        if type is not None:
            pulumi.set(__self__, "type", type)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def filters(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        A list of IP addresses or country codes or names to evaluate against each event.
        """
        return pulumi.get(self, "filters")

    @filters.setter
    def filters(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "filters", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of this rule
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def source(self) -> Optional[pulumi.Input['RiskRulesSourceArgs']]:
        """
        Used for targeting custom rules based on a group of people, customers, accounts, or even a single user.
        """
        return pulumi.get(self, "source")

    @source.setter
    def source(self, value: Optional[pulumi.Input['RiskRulesSourceArgs']]):
        pulumi.set(self, "source", value)

    @property
    @pulumi.getter
    def target(self) -> Optional[pulumi.Input[str]]:
        """
        The target parameter that will be used when evaluating the rule against an incoming event.
        """
        return pulumi.get(self, "target")

    @target.setter
    def target(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "target", value)

    @property
    @pulumi.getter
    def type(self) -> Optional[pulumi.Input[str]]:
        """
        The type parameter specifies the type of rule that will be created.
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "type", value)


class RiskRules(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 filters: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 source: Optional[pulumi.Input[pulumi.InputType['RiskRulesSourceArgs']]] = None,
                 target: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Create a RiskRules resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] filters: A list of IP addresses or country codes or names to evaluate against each event.
        :param pulumi.Input[str] name: The name of this rule
        :param pulumi.Input[pulumi.InputType['RiskRulesSourceArgs']] source: Used for targeting custom rules based on a group of people, customers, accounts, or even a single user.
        :param pulumi.Input[str] target: The target parameter that will be used when evaluating the rule against an incoming event.
        :param pulumi.Input[str] type: The type parameter specifies the type of rule that will be created.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[RiskRulesArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Create a RiskRules resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param RiskRulesArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(RiskRulesArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 filters: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 source: Optional[pulumi.Input[pulumi.InputType['RiskRulesSourceArgs']]] = None,
                 target: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = RiskRulesArgs.__new__(RiskRulesArgs)

            __props__.__dict__["description"] = description
            __props__.__dict__["filters"] = filters
            __props__.__dict__["name"] = name
            __props__.__dict__["source"] = source
            __props__.__dict__["target"] = target
            __props__.__dict__["type"] = type
        super(RiskRules, __self__).__init__(
            'onelogin:index/riskRules:RiskRules',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            description: Optional[pulumi.Input[str]] = None,
            filters: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            name: Optional[pulumi.Input[str]] = None,
            source: Optional[pulumi.Input[pulumi.InputType['RiskRulesSourceArgs']]] = None,
            target: Optional[pulumi.Input[str]] = None,
            type: Optional[pulumi.Input[str]] = None) -> 'RiskRules':
        """
        Get an existing RiskRules resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] filters: A list of IP addresses or country codes or names to evaluate against each event.
        :param pulumi.Input[str] name: The name of this rule
        :param pulumi.Input[pulumi.InputType['RiskRulesSourceArgs']] source: Used for targeting custom rules based on a group of people, customers, accounts, or even a single user.
        :param pulumi.Input[str] target: The target parameter that will be used when evaluating the rule against an incoming event.
        :param pulumi.Input[str] type: The type parameter specifies the type of rule that will be created.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _RiskRulesState.__new__(_RiskRulesState)

        __props__.__dict__["description"] = description
        __props__.__dict__["filters"] = filters
        __props__.__dict__["name"] = name
        __props__.__dict__["source"] = source
        __props__.__dict__["target"] = target
        __props__.__dict__["type"] = type
        return RiskRules(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def filters(self) -> pulumi.Output[Optional[Sequence[str]]]:
        """
        A list of IP addresses or country codes or names to evaluate against each event.
        """
        return pulumi.get(self, "filters")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The name of this rule
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def source(self) -> pulumi.Output[Optional['outputs.RiskRulesSource']]:
        """
        Used for targeting custom rules based on a group of people, customers, accounts, or even a single user.
        """
        return pulumi.get(self, "source")

    @property
    @pulumi.getter
    def target(self) -> pulumi.Output[Optional[str]]:
        """
        The target parameter that will be used when evaluating the rule against an incoming event.
        """
        return pulumi.get(self, "target")

    @property
    @pulumi.getter
    def type(self) -> pulumi.Output[Optional[str]]:
        """
        The type parameter specifies the type of rule that will be created.
        """
        return pulumi.get(self, "type")

