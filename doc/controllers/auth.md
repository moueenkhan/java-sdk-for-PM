# Auth

```java
AuthController authController = client.getAuthController();
```

## Class Name

`AuthController`


# Create Authenticate

```java
CompletableFuture<AuthenticationResponse> createAuthenticateAsync(
    final String contentType,
    final String authorization,
    final String grantType)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `contentType` | `String` | Header, Required | - |
| `authorization` | `String` | Header, Required | - |
| `grantType` | `String` | Form, Required | - |

## Response Type

[`AuthenticationResponse`](../../doc/models/authentication-response.md)

## Example Usage

```java
String contentType = "application/x-www-form-urlencoded";
String authorization = "Basic dUhucXY2a3pveTJZQWM5NTdHRGhhbm5LUzZUVmltRzM6QkVBTGZhTVFuSnRsWEc4aQ==";
String grantType = "client_credentials";

authController.createAuthenticateAsync(contentType, authorization, grantType).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

