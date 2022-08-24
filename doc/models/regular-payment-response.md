
# Regular Payment Response

## Structure

`RegularPaymentResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Links` | [`List<Link>`](../../doc/models/link.md) | Required | - | List<Link> getLinks() | setLinks(List<Link> links) |
| `Id` | `String` | Required | - | String getId() | setId(String id) |
| `Status` | `String` | Required | - | String getStatus() | setStatus(String status) |
| `Bank` | [`Bank`](../../doc/models/bank.md) | Required | - | Bank getBank() | setBank(Bank bank) |
| `Merchant` | [`Merchant1`](../../doc/models/merchant-1.md) | Required | - | Merchant1 getMerchant() | setMerchant(Merchant1 merchant) |
| `Transaction` | [`Transaction1`](../../doc/models/transaction-1.md) | Required | - | Transaction1 getTransaction() | setTransaction(Transaction1 transaction) |
| `CreationTime` | `String` | Required | - | String getCreationTime() | setCreationTime(String creationTime) |
| `ModificationTime` | `String` | Required | - | String getModificationTime() | setModificationTime(String modificationTime) |

## Example (as JSON)

```json
{
  "links": [
    {
      "href": "https://apitest.paymark.nz/transaction/oepayment/381a08c8-9189-4995-b07b-6c3821f70e35",
      "rel": "self"
    }
  ],
  "id": "381a08c8-9189-4995-b07b-6c3821f70e35",
  "status": "SUBMITTED",
  "bank": {
    "payerId": "0215551234",
    "bankId": "ASB",
    "payerIdType": "MOBILE"
  },
  "merchant": {
    "merchantIdCode": "301234567",
    "callbackUrl": "https://www.widgets.co.nz/callback?order=145"
  },
  "transaction": {
    "amount": 1000,
    "transactionType": "REGULAR",
    "currency": "NZD",
    "description": "Widgets",
    "orderId": "145"
  },
  "creationTime": "01/01/2016 11:59:59",
  "modificationTime": "01/01/2016 12:01:13"
}
```

