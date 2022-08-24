
# Transaction 1

## Structure

`Transaction1`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Amount` | `int` | Required | - | int getAmount() | setAmount(int amount) |
| `TransactionType` | `String` | Required | - | String getTransactionType() | setTransactionType(String transactionType) |
| `Currency` | `String` | Required | - | String getCurrency() | setCurrency(String currency) |
| `Description` | `String` | Required | - | String getDescription() | setDescription(String description) |
| `OrderId` | `String` | Required | - | String getOrderId() | setOrderId(String orderId) |

## Example (as JSON)

```json
{
  "amount": 1000,
  "transactionType": "REGULAR",
  "currency": "NZD",
  "description": "Widgets",
  "orderId": "145"
}
```

