
# Authentication Response

## Structure

`AuthenticationResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `IssuedAt` | `String` | Required | - | String getIssuedAt() | setIssuedAt(String issuedAt) |
| `ApplicationName` | `String` | Required | - | String getApplicationName() | setApplicationName(String applicationName) |
| `Scope` | `String` | Required | - | String getScope() | setScope(String scope) |
| `Status` | `String` | Required | - | String getStatus() | setStatus(String status) |
| `ExpiresIn` | `String` | Required | - | String getExpiresIn() | setExpiresIn(String expiresIn) |
| `TokenType` | `String` | Required | - | String getTokenType() | setTokenType(String tokenType) |
| `ClientId` | `String` | Required | - | String getClientId() | setClientId(String clientId) |
| `AccessToken` | `String` | Required | - | String getAccessToken() | setAccessToken(String accessToken) |

## Example (as JSON)

```json
{
  "issued_at": "1464126466974",
  "application_name": "111111-2c4e-42cc-b613-fe974111111a",
  "scope": null,
  "status": "approved",
  "expires_in": "3599",
  "token_type": "BearerToken",
  "client_id": "axxxxxxxxxxx",
  "access_token": "bxxxxxxx"
}
```

