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
    'Endpoints',
]

@pulumi.output_type
class Endpoints(dict):
    def __init__(__self__, *,
                 apps: Optional[str] = None,
                 apps_rules: Optional[str] = None,
                 auth_servers: Optional[str] = None,
                 privileges: Optional[str] = None,
                 risk_rules: Optional[str] = None,
                 roles: Optional[str] = None,
                 users: Optional[str] = None,
                 users_v1: Optional[str] = None):
        Endpoints._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            apps=apps,
            apps_rules=apps_rules,
            auth_servers=auth_servers,
            privileges=privileges,
            risk_rules=risk_rules,
            roles=roles,
            users=users,
            users_v1=users_v1,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             apps: Optional[str] = None,
             apps_rules: Optional[str] = None,
             auth_servers: Optional[str] = None,
             privileges: Optional[str] = None,
             risk_rules: Optional[str] = None,
             roles: Optional[str] = None,
             users: Optional[str] = None,
             users_v1: Optional[str] = None,
             opts: Optional[pulumi.ResourceOptions]=None):
        if apps is not None:
            _setter("apps", apps)
        if apps_rules is not None:
            _setter("apps_rules", apps_rules)
        if auth_servers is not None:
            _setter("auth_servers", auth_servers)
        if privileges is not None:
            _setter("privileges", privileges)
        if risk_rules is not None:
            _setter("risk_rules", risk_rules)
        if roles is not None:
            _setter("roles", roles)
        if users is not None:
            _setter("users", users)
        if users_v1 is not None:
            _setter("users_v1", users_v1)

    @property
    @pulumi.getter
    def apps(self) -> Optional[str]:
        return pulumi.get(self, "apps")

    @property
    @pulumi.getter(name="appsRules")
    def apps_rules(self) -> Optional[str]:
        return pulumi.get(self, "apps_rules")

    @property
    @pulumi.getter(name="authServers")
    def auth_servers(self) -> Optional[str]:
        return pulumi.get(self, "auth_servers")

    @property
    @pulumi.getter
    def privileges(self) -> Optional[str]:
        return pulumi.get(self, "privileges")

    @property
    @pulumi.getter(name="riskRules")
    def risk_rules(self) -> Optional[str]:
        return pulumi.get(self, "risk_rules")

    @property
    @pulumi.getter
    def roles(self) -> Optional[str]:
        return pulumi.get(self, "roles")

    @property
    @pulumi.getter
    def users(self) -> Optional[str]:
        return pulumi.get(self, "users")

    @property
    @pulumi.getter(name="usersV1")
    def users_v1(self) -> Optional[str]:
        return pulumi.get(self, "users_v1")


