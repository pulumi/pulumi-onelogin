# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

from . import _utilities
import typing
# Export this package's modules as members:
from .app import *
from .app_role_attachments import *
from .app_rules import *
from .auth_servers import *
from .get_user import *
from .oidc_apps import *
from .privileges import *
from .provider import *
from .role import *
from .saml_apps import *
from .smart_hook import *
from .smarthook_environment_variables import *
from .user import *
from .user_mappings import *
from ._inputs import *
from . import outputs

# Make subpackages available:
if typing.TYPE_CHECKING:
    import pulumi_onelogin.apps as __apps
    apps = __apps
    import pulumi_onelogin.config as __config
    config = __config
    import pulumi_onelogin.users as __users
    users = __users
else:
    apps = _utilities.lazy_import('pulumi_onelogin.apps')
    config = _utilities.lazy_import('pulumi_onelogin.config')
    users = _utilities.lazy_import('pulumi_onelogin.users')

_utilities.register(
    resource_modules="""
[
 {
  "pkg": "onelogin",
  "mod": "apps/rules",
  "fqn": "pulumi_onelogin.apps",
  "classes": {
   "onelogin:apps/rules:Rules": "Rules"
  }
 },
 {
  "pkg": "onelogin",
  "mod": "index/app",
  "fqn": "pulumi_onelogin",
  "classes": {
   "onelogin:index/app:App": "App"
  }
 },
 {
  "pkg": "onelogin",
  "mod": "index/appRoleAttachments",
  "fqn": "pulumi_onelogin",
  "classes": {
   "onelogin:index/appRoleAttachments:AppRoleAttachments": "AppRoleAttachments"
  }
 },
 {
  "pkg": "onelogin",
  "mod": "index/appRules",
  "fqn": "pulumi_onelogin",
  "classes": {
   "onelogin:index/appRules:AppRules": "AppRules"
  }
 },
 {
  "pkg": "onelogin",
  "mod": "index/authServers",
  "fqn": "pulumi_onelogin",
  "classes": {
   "onelogin:index/authServers:AuthServers": "AuthServers"
  }
 },
 {
  "pkg": "onelogin",
  "mod": "index/oidcApps",
  "fqn": "pulumi_onelogin",
  "classes": {
   "onelogin:index/oidcApps:OidcApps": "OidcApps"
  }
 },
 {
  "pkg": "onelogin",
  "mod": "index/privileges",
  "fqn": "pulumi_onelogin",
  "classes": {
   "onelogin:index/privileges:Privileges": "Privileges"
  }
 },
 {
  "pkg": "onelogin",
  "mod": "index/role",
  "fqn": "pulumi_onelogin",
  "classes": {
   "onelogin:index/role:Role": "Role"
  }
 },
 {
  "pkg": "onelogin",
  "mod": "index/samlApps",
  "fqn": "pulumi_onelogin",
  "classes": {
   "onelogin:index/samlApps:SamlApps": "SamlApps"
  }
 },
 {
  "pkg": "onelogin",
  "mod": "index/smartHook",
  "fqn": "pulumi_onelogin",
  "classes": {
   "onelogin:index/smartHook:SmartHook": "SmartHook"
  }
 },
 {
  "pkg": "onelogin",
  "mod": "index/smarthookEnvironmentVariables",
  "fqn": "pulumi_onelogin",
  "classes": {
   "onelogin:index/smarthookEnvironmentVariables:SmarthookEnvironmentVariables": "SmarthookEnvironmentVariables"
  }
 },
 {
  "pkg": "onelogin",
  "mod": "index/user",
  "fqn": "pulumi_onelogin",
  "classes": {
   "onelogin:index/user:User": "User"
  }
 },
 {
  "pkg": "onelogin",
  "mod": "index/userMappings",
  "fqn": "pulumi_onelogin",
  "classes": {
   "onelogin:index/userMappings:UserMappings": "UserMappings"
  }
 }
]
""",
    resource_packages="""
[
 {
  "pkg": "onelogin",
  "token": "pulumi:providers:onelogin",
  "fqn": "pulumi_onelogin",
  "class": "Provider"
 }
]
"""
)
