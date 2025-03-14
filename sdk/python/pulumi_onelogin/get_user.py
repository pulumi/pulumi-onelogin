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
from . import _utilities

__all__ = [
    'GetUserResult',
    'AwaitableGetUserResult',
    'get_user',
    'get_user_output',
]

@pulumi.output_type
class GetUserResult:
    """
    A collection of values returned by getUser.
    """
    def __init__(__self__, comment=None, company=None, custom_attributes=None, department=None, directory_id=None, distinguished_name=None, email=None, external_id=None, firstname=None, group_id=None, id=None, lastname=None, manager_ad_id=None, manager_user_id=None, member_of=None, phone=None, samaccountname=None, state=None, status=None, title=None, trusted_idp_id=None, user_id=None, username=None, userprincipalname=None):
        if comment and not isinstance(comment, str):
            raise TypeError("Expected argument 'comment' to be a str")
        pulumi.set(__self__, "comment", comment)
        if company and not isinstance(company, str):
            raise TypeError("Expected argument 'company' to be a str")
        pulumi.set(__self__, "company", company)
        if custom_attributes and not isinstance(custom_attributes, dict):
            raise TypeError("Expected argument 'custom_attributes' to be a dict")
        pulumi.set(__self__, "custom_attributes", custom_attributes)
        if department and not isinstance(department, str):
            raise TypeError("Expected argument 'department' to be a str")
        pulumi.set(__self__, "department", department)
        if directory_id and not isinstance(directory_id, int):
            raise TypeError("Expected argument 'directory_id' to be a int")
        pulumi.set(__self__, "directory_id", directory_id)
        if distinguished_name and not isinstance(distinguished_name, str):
            raise TypeError("Expected argument 'distinguished_name' to be a str")
        pulumi.set(__self__, "distinguished_name", distinguished_name)
        if email and not isinstance(email, str):
            raise TypeError("Expected argument 'email' to be a str")
        pulumi.set(__self__, "email", email)
        if external_id and not isinstance(external_id, int):
            raise TypeError("Expected argument 'external_id' to be a int")
        pulumi.set(__self__, "external_id", external_id)
        if firstname and not isinstance(firstname, str):
            raise TypeError("Expected argument 'firstname' to be a str")
        pulumi.set(__self__, "firstname", firstname)
        if group_id and not isinstance(group_id, int):
            raise TypeError("Expected argument 'group_id' to be a int")
        pulumi.set(__self__, "group_id", group_id)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if lastname and not isinstance(lastname, str):
            raise TypeError("Expected argument 'lastname' to be a str")
        pulumi.set(__self__, "lastname", lastname)
        if manager_ad_id and not isinstance(manager_ad_id, int):
            raise TypeError("Expected argument 'manager_ad_id' to be a int")
        pulumi.set(__self__, "manager_ad_id", manager_ad_id)
        if manager_user_id and not isinstance(manager_user_id, int):
            raise TypeError("Expected argument 'manager_user_id' to be a int")
        pulumi.set(__self__, "manager_user_id", manager_user_id)
        if member_of and not isinstance(member_of, str):
            raise TypeError("Expected argument 'member_of' to be a str")
        pulumi.set(__self__, "member_of", member_of)
        if phone and not isinstance(phone, str):
            raise TypeError("Expected argument 'phone' to be a str")
        pulumi.set(__self__, "phone", phone)
        if samaccountname and not isinstance(samaccountname, str):
            raise TypeError("Expected argument 'samaccountname' to be a str")
        pulumi.set(__self__, "samaccountname", samaccountname)
        if state and not isinstance(state, int):
            raise TypeError("Expected argument 'state' to be a int")
        pulumi.set(__self__, "state", state)
        if status and not isinstance(status, int):
            raise TypeError("Expected argument 'status' to be a int")
        pulumi.set(__self__, "status", status)
        if title and not isinstance(title, str):
            raise TypeError("Expected argument 'title' to be a str")
        pulumi.set(__self__, "title", title)
        if trusted_idp_id and not isinstance(trusted_idp_id, int):
            raise TypeError("Expected argument 'trusted_idp_id' to be a int")
        pulumi.set(__self__, "trusted_idp_id", trusted_idp_id)
        if user_id and not isinstance(user_id, str):
            raise TypeError("Expected argument 'user_id' to be a str")
        pulumi.set(__self__, "user_id", user_id)
        if username and not isinstance(username, str):
            raise TypeError("Expected argument 'username' to be a str")
        pulumi.set(__self__, "username", username)
        if userprincipalname and not isinstance(userprincipalname, str):
            raise TypeError("Expected argument 'userprincipalname' to be a str")
        pulumi.set(__self__, "userprincipalname", userprincipalname)

    @property
    @pulumi.getter
    def comment(self) -> str:
        return pulumi.get(self, "comment")

    @property
    @pulumi.getter
    def company(self) -> str:
        return pulumi.get(self, "company")

    @property
    @pulumi.getter(name="customAttributes")
    def custom_attributes(self) -> Mapping[str, str]:
        return pulumi.get(self, "custom_attributes")

    @property
    @pulumi.getter
    def department(self) -> str:
        return pulumi.get(self, "department")

    @property
    @pulumi.getter(name="directoryId")
    def directory_id(self) -> int:
        return pulumi.get(self, "directory_id")

    @property
    @pulumi.getter(name="distinguishedName")
    def distinguished_name(self) -> str:
        return pulumi.get(self, "distinguished_name")

    @property
    @pulumi.getter
    def email(self) -> str:
        return pulumi.get(self, "email")

    @property
    @pulumi.getter(name="externalId")
    def external_id(self) -> int:
        return pulumi.get(self, "external_id")

    @property
    @pulumi.getter
    def firstname(self) -> str:
        return pulumi.get(self, "firstname")

    @property
    @pulumi.getter(name="groupId")
    def group_id(self) -> int:
        return pulumi.get(self, "group_id")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def lastname(self) -> str:
        return pulumi.get(self, "lastname")

    @property
    @pulumi.getter(name="managerAdId")
    def manager_ad_id(self) -> int:
        return pulumi.get(self, "manager_ad_id")

    @property
    @pulumi.getter(name="managerUserId")
    def manager_user_id(self) -> int:
        return pulumi.get(self, "manager_user_id")

    @property
    @pulumi.getter(name="memberOf")
    def member_of(self) -> str:
        return pulumi.get(self, "member_of")

    @property
    @pulumi.getter
    def phone(self) -> str:
        return pulumi.get(self, "phone")

    @property
    @pulumi.getter
    def samaccountname(self) -> str:
        return pulumi.get(self, "samaccountname")

    @property
    @pulumi.getter
    def state(self) -> int:
        return pulumi.get(self, "state")

    @property
    @pulumi.getter
    def status(self) -> int:
        return pulumi.get(self, "status")

    @property
    @pulumi.getter
    def title(self) -> str:
        return pulumi.get(self, "title")

    @property
    @pulumi.getter(name="trustedIdpId")
    def trusted_idp_id(self) -> int:
        return pulumi.get(self, "trusted_idp_id")

    @property
    @pulumi.getter(name="userId")
    def user_id(self) -> Optional[str]:
        return pulumi.get(self, "user_id")

    @property
    @pulumi.getter
    def username(self) -> str:
        return pulumi.get(self, "username")

    @property
    @pulumi.getter
    def userprincipalname(self) -> str:
        return pulumi.get(self, "userprincipalname")


class AwaitableGetUserResult(GetUserResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetUserResult(
            comment=self.comment,
            company=self.company,
            custom_attributes=self.custom_attributes,
            department=self.department,
            directory_id=self.directory_id,
            distinguished_name=self.distinguished_name,
            email=self.email,
            external_id=self.external_id,
            firstname=self.firstname,
            group_id=self.group_id,
            id=self.id,
            lastname=self.lastname,
            manager_ad_id=self.manager_ad_id,
            manager_user_id=self.manager_user_id,
            member_of=self.member_of,
            phone=self.phone,
            samaccountname=self.samaccountname,
            state=self.state,
            status=self.status,
            title=self.title,
            trusted_idp_id=self.trusted_idp_id,
            user_id=self.user_id,
            username=self.username,
            userprincipalname=self.userprincipalname)


def get_user(external_id: Optional[int] = None,
             user_id: Optional[str] = None,
             username: Optional[str] = None,
             opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetUserResult:
    """
    Use this data source to access information about an existing resource.
    """
    __args__ = dict()
    __args__['externalId'] = external_id
    __args__['userId'] = user_id
    __args__['username'] = username
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('onelogin:index/getUser:getUser', __args__, opts=opts, typ=GetUserResult).value

    return AwaitableGetUserResult(
        comment=pulumi.get(__ret__, 'comment'),
        company=pulumi.get(__ret__, 'company'),
        custom_attributes=pulumi.get(__ret__, 'custom_attributes'),
        department=pulumi.get(__ret__, 'department'),
        directory_id=pulumi.get(__ret__, 'directory_id'),
        distinguished_name=pulumi.get(__ret__, 'distinguished_name'),
        email=pulumi.get(__ret__, 'email'),
        external_id=pulumi.get(__ret__, 'external_id'),
        firstname=pulumi.get(__ret__, 'firstname'),
        group_id=pulumi.get(__ret__, 'group_id'),
        id=pulumi.get(__ret__, 'id'),
        lastname=pulumi.get(__ret__, 'lastname'),
        manager_ad_id=pulumi.get(__ret__, 'manager_ad_id'),
        manager_user_id=pulumi.get(__ret__, 'manager_user_id'),
        member_of=pulumi.get(__ret__, 'member_of'),
        phone=pulumi.get(__ret__, 'phone'),
        samaccountname=pulumi.get(__ret__, 'samaccountname'),
        state=pulumi.get(__ret__, 'state'),
        status=pulumi.get(__ret__, 'status'),
        title=pulumi.get(__ret__, 'title'),
        trusted_idp_id=pulumi.get(__ret__, 'trusted_idp_id'),
        user_id=pulumi.get(__ret__, 'user_id'),
        username=pulumi.get(__ret__, 'username'),
        userprincipalname=pulumi.get(__ret__, 'userprincipalname'))
def get_user_output(external_id: Optional[pulumi.Input[Optional[int]]] = None,
                    user_id: Optional[pulumi.Input[Optional[str]]] = None,
                    username: Optional[pulumi.Input[Optional[str]]] = None,
                    opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetUserResult]:
    """
    Use this data source to access information about an existing resource.
    """
    __args__ = dict()
    __args__['externalId'] = external_id
    __args__['userId'] = user_id
    __args__['username'] = username
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('onelogin:index/getUser:getUser', __args__, opts=opts, typ=GetUserResult)
    return __ret__.apply(lambda __response__: GetUserResult(
        comment=pulumi.get(__response__, 'comment'),
        company=pulumi.get(__response__, 'company'),
        custom_attributes=pulumi.get(__response__, 'custom_attributes'),
        department=pulumi.get(__response__, 'department'),
        directory_id=pulumi.get(__response__, 'directory_id'),
        distinguished_name=pulumi.get(__response__, 'distinguished_name'),
        email=pulumi.get(__response__, 'email'),
        external_id=pulumi.get(__response__, 'external_id'),
        firstname=pulumi.get(__response__, 'firstname'),
        group_id=pulumi.get(__response__, 'group_id'),
        id=pulumi.get(__response__, 'id'),
        lastname=pulumi.get(__response__, 'lastname'),
        manager_ad_id=pulumi.get(__response__, 'manager_ad_id'),
        manager_user_id=pulumi.get(__response__, 'manager_user_id'),
        member_of=pulumi.get(__response__, 'member_of'),
        phone=pulumi.get(__response__, 'phone'),
        samaccountname=pulumi.get(__response__, 'samaccountname'),
        state=pulumi.get(__response__, 'state'),
        status=pulumi.get(__response__, 'status'),
        title=pulumi.get(__response__, 'title'),
        trusted_idp_id=pulumi.get(__response__, 'trusted_idp_id'),
        user_id=pulumi.get(__response__, 'user_id'),
        username=pulumi.get(__response__, 'username'),
        userprincipalname=pulumi.get(__response__, 'userprincipalname')))
