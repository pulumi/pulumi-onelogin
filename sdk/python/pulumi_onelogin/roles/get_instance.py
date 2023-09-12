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
    def __init__(__self__, admins=None, apps=None, id=None, name=None, users=None):
        if admins and not isinstance(admins, list):
            raise TypeError("Expected argument 'admins' to be a list")
        pulumi.set(__self__, "admins", admins)
        if apps and not isinstance(apps, list):
            raise TypeError("Expected argument 'apps' to be a list")
        pulumi.set(__self__, "apps", apps)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if users and not isinstance(users, list):
            raise TypeError("Expected argument 'users' to be a list")
        pulumi.set(__self__, "users", users)

    @property
    @pulumi.getter
    def admins(self) -> Sequence[int]:
        return pulumi.get(self, "admins")

    @property
    @pulumi.getter
    def apps(self) -> Sequence[int]:
        return pulumi.get(self, "apps")

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
    def users(self) -> Sequence[int]:
        return pulumi.get(self, "users")


class AwaitableGetInstanceResult(GetInstanceResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetInstanceResult(
            admins=self.admins,
            apps=self.apps,
            id=self.id,
            name=self.name,
            users=self.users)


def get_instance(admins: Optional[Sequence[int]] = None,
                 apps: Optional[Sequence[int]] = None,
                 id: Optional[str] = None,
                 name: Optional[str] = None,
                 users: Optional[Sequence[int]] = None,
                 opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetInstanceResult:
    """
    Use this data source to access information about an existing resource.
    """
    __args__ = dict()
    __args__['admins'] = admins
    __args__['apps'] = apps
    __args__['id'] = id
    __args__['name'] = name
    __args__['users'] = users
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('onelogin:roles/getInstance:getInstance', __args__, opts=opts, typ=GetInstanceResult).value

    return AwaitableGetInstanceResult(
        admins=pulumi.get(__ret__, 'admins'),
        apps=pulumi.get(__ret__, 'apps'),
        id=pulumi.get(__ret__, 'id'),
        name=pulumi.get(__ret__, 'name'),
        users=pulumi.get(__ret__, 'users'))


@_utilities.lift_output_func(get_instance)
def get_instance_output(admins: Optional[pulumi.Input[Optional[Sequence[int]]]] = None,
                        apps: Optional[pulumi.Input[Optional[Sequence[int]]]] = None,
                        id: Optional[pulumi.Input[str]] = None,
                        name: Optional[pulumi.Input[Optional[str]]] = None,
                        users: Optional[pulumi.Input[Optional[Sequence[int]]]] = None,
                        opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetInstanceResult]:
    """
    Use this data source to access information about an existing resource.
    """
    ...
