
# Merchant

## Structure

`Merchant`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `MerchantIdCode` | `String` | Required | - | String getMerchantIdCode() | setMerchantIdCode(String merchantIdCode) |
| `MerchantUrl` | `String` | Required | - | String getMerchantUrl() | setMerchantUrl(String merchantUrl) |
| `CallbackUrl` | `String` | Required | - | String getCallbackUrl() | setCallbackUrl(String callbackUrl) |

## Example (as JSON)

```json
{
  "merchantIdCode": "301234567",
  "merchantUrl": "https://www.widgets.co.nz/",
  "callbackUrl": "https://www.widgets.co.nz/callback?order=145"
}
```

