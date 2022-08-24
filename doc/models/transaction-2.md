
# Transaction 2

## Structure

`Transaction2`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `RefundAmount` | `int` | Required | - | int getRefundAmount() | setRefundAmount(int refundAmount) |
| `RefundReason` | `String` | Required | - | String getRefundReason() | setRefundReason(String refundReason) |
| `RefundId` | `String` | Required | - | String getRefundId() | setRefundId(String refundId) |
| `OriginalPaymentId` | `String` | Required | - | String getOriginalPaymentId() | setOriginalPaymentId(String originalPaymentId) |
| `UserAgent` | `String` | Required | - | String getUserAgent() | setUserAgent(String userAgent) |
| `UserIpAddress` | `String` | Required | - | String getUserIpAddress() | setUserIpAddress(String userIpAddress) |

## Example (as JSON)

```json
{
  "refundAmount": 1000,
  "refundReason": "Defective goods",
  "refundId": "R145",
  "originalPaymentId": "381a08c8-9189-4995-b07b-6c3821f70e35",
  "userAgent": "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_2) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/47.0.2526.106 Safari/537.36",
  "userIpAddress": "192.168.0.1"
}
```

