r[![Actions Status](https://github.com/pulumi/pulumi-onelogin/workflows/master/badge.svg)](https://github.com/pulumi/pulumi-onelogin/actions)
[![Slack](http://www.pulumi.com/images/docs/badges/slack.svg)](https://slack.pulumi.com)
[![NPM version](https://badge.fury.io/js/%40pulumi%2Fonelogin.svg)](https://www.npmjs.com/package/@pulumi/onelogin)
[![Python version](https://badge.fury.io/py/pulumi-onelogin.svg)](https://pypi.org/project/pulumi-onelogin)
[![NuGet version](https://badge.fury.io/nu/pulumi.onelogin.svg)](https://badge.fury.io/nu/pulumi.onelogin)
[![PkgGoDev](https://pkg.go.dev/badge/github.com/pulumi/pulumi-onelogin/sdk/go/onelogin)](https://pkg.go.dev/github.com/pulumi/pulumi-onelogin/sdk/go/onelogin)
[![License](https://img.shields.io/npm/l/%40pulumi%2Fpulumi.svg)](https://github.com/pulumi/pulumi-onelogin/blob/master/LICENSE)

# OneLogin Resource Provider

>[!NOTE] As of v0.6.9, this provider is DEPRECATED and will no longer be maintained by Pulumi.
> We recommend using the [Local Provider](https://www.pulumi.com/blog/any-terraform-provider/) version of this package,
> which can be generated from the RKE Terraform provider as follows:
> `pulumi package add terraform-provider registry.opentofu.org/onelogin/onelogin <version>`
> and follow the instructions.

OneLogin Resource Provider for Pulumi lets you manage [OneLogin](https://onelogin.com) resources.
To use this package, please [install the Pulumi CLI first](https://pulumi.io/).
This provider is bridge to [github.com/onelogin/terraform-provider-onelogin](https://github.com/onelogin/terraform-provider-onelogin).

## Installing

This package is available in many languages in the standard packaging formats.

### Node.js (Java/TypeScript)

To use from JavaScript or TypeScript in Node.js, install using either `npm`:

    $ npm install @pulumi/onelogin

or `yarn`:

    $ yarn add @pulumi/onelogin

### Python

To use from Python, install using `pip`:

    $ pip install pulumi_onelogin

### Go

To use from Go, use `go get` to grab the latest version of the library

    $ go get github.com/pulumi/pulumi-onelogin/sdk/go/...

## Configuration

You'll need admin access to a OneLogin account where you can create API credentials.
Create a set of API credentials with manage all permission.
The following environment variables used to configure the `onelogin` provider:

- `ONELOGIN_CLIENT_ID` - your client id
- `ONELOGIN_CLIENT_SECRET` - your client secret
- `ONELOGIN_OAPI_URL` - the api url for your region

## Reference

For detailed reference documentation, please visit [the API docs][1].

[1]: https://www.pulumi.com/docs/reference/pkg/onelogin/
