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
    'GetAuthorizationsResult',
    'AwaitableGetAuthorizationsResult',
    'get_authorizations',
    'get_authorizations_output',
]

@pulumi.output_type
class GetAuthorizationsResult:
    """
    A collection of values returned by getAuthorizations.
    """
    def __init__(__self__, configuration=None, description=None, filters=None, id=None, name=None):
        if configuration and not isinstance(configuration, dict):
            raise TypeError("Expected argument 'configuration' to be a dict")
        pulumi.set(__self__, "configuration", configuration)
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

    @property
    @pulumi.getter
    def configuration(self) -> 'outputs.GetAuthorizationsConfigurationResult':
        return pulumi.get(self, "configuration")

    @property
    @pulumi.getter
    def description(self) -> str:
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def filters(self) -> Optional[Sequence['outputs.GetAuthorizationsFilterResult']]:
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


class AwaitableGetAuthorizationsResult(GetAuthorizationsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetAuthorizationsResult(
            configuration=self.configuration,
            description=self.description,
            filters=self.filters,
            id=self.id,
            name=self.name)


def get_authorizations(configuration: Optional[pulumi.InputType['GetAuthorizationsConfigurationArgs']] = None,
                       description: Optional[str] = None,
                       filters: Optional[Sequence[pulumi.InputType['GetAuthorizationsFilterArgs']]] = None,
                       name: Optional[str] = None,
                       opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetAuthorizationsResult:
    """
    Use this data source to access information about an existing resource.
    """
    __args__ = dict()
    __args__['configuration'] = configuration
    __args__['description'] = description
    __args__['filters'] = filters
    __args__['name'] = name
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('onelogin:api/getAuthorizations:getAuthorizations', __args__, opts=opts, typ=GetAuthorizationsResult).value

    return AwaitableGetAuthorizationsResult(
        configuration=__ret__.configuration,
        description=__ret__.description,
        filters=__ret__.filters,
        id=__ret__.id,
        name=__ret__.name)


@_utilities.lift_output_func(get_authorizations)
def get_authorizations_output(configuration: Optional[pulumi.Input[Optional[pulumi.InputType['GetAuthorizationsConfigurationArgs']]]] = None,
                              description: Optional[pulumi.Input[Optional[str]]] = None,
                              filters: Optional[pulumi.Input[Optional[Sequence[pulumi.InputType['GetAuthorizationsFilterArgs']]]]] = None,
                              name: Optional[pulumi.Input[Optional[str]]] = None,
                              opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetAuthorizationsResult]:
    """
    Use this data source to access information about an existing resource.
    """
    ...
