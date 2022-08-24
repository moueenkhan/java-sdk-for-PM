
# Regular Payment Req Body

## Structure

`RegularPaymentReqBody`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Bank` | [`Bank`](../../doc/models/bank.md) | Required | - | Bank getBank() | setBank(Bank bank) |
| `Merchant` | [`Merchant`](../../doc/models/merchant.md) | Required | - | Merchant getMerchant() | setMerchant(Merchant merchant) |
| `Transaction` | [`Transaction`](../../doc/models/transaction.md) | Required | - | Transaction getTransaction() | setTransaction(Transaction transaction) |

## Example (as JSON)

```json
{
  "bank": {
    "payerId": "0215551234",
    "bankId": "ASB",
    "payerIdType": "MOBILE"
  },
  "merchant": {
    "merchantIdCode": "301234567",
    "merchantUrl": "https://www.widgets.co.nz/",
    "callbackUrl": "https://www.widgets.co.nz/callback?order=145"
  },
  "transaction": {
    "amount": 1000,
    "transactionType": "REGULAR",
    "currency": "NZD",
    "description": "Widgets",
    "orderId": "145",
    "userAgent": "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_2) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/47.0.2526.106 Safari/537.36",
    "userIpAddress": "192.168.0.1"
  }
}
```

