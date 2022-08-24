
# Transaction

## Structure

`Transaction`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Amount` | `int` | Required | - | int getAmount() | setAmount(int amount) |
| `TransactionType` | `String` | Required | - | String getTransactionType() | setTransactionType(String transactionType) |
| `Currency` | `String` | Required | - | String getCurrency() | setCurrency(String currency) |
| `Description` | `String` | Required | - | String getDescription() | setDescription(String description) |
| `OrderId` | `String` | Required | - | String getOrderId() | setOrderId(String orderId) |
| `UserAgent` | `String` | Required | - | String getUserAgent() | setUserAgent(String userAgent) |
| `UserIpAddress` | `String` | Required | - | String getUserIpAddress() | setUserIpAddress(String userIpAddress) |

## Example (as JSON)

```json
{
  "amount": 1000,
  "transactionType": "REGULAR",
  "currency": "NZD",
  "description": "Widgets",
  "orderId": "145",
  "userAgent": "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_2) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/47.0.2526.106 Safari/537.36",
  "userIpAddress": "192.168.0.1"
}
```

