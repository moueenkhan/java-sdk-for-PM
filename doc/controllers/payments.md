# Payments

```java
PaymentsController paymentsController = client.getPaymentsController();
```

## Class Name

`PaymentsController`

## Methods

* [Create a Regular Payment](../../doc/controllers/payments.md#create-a-regular-payment)
* [Get Autopay Details](../../doc/controllers/payments.md#get-autopay-details)
* [Create a Refund](../../doc/controllers/payments.md#create-a-refund)
* [Retrieve Multiple Payments](../../doc/controllers/payments.md#retrieve-multiple-payments)


# Create a Regular Payment

```java
CompletableFuture<RegularPaymentResponse> createARegularPaymentAsync(
    final String accept,
    final String contentType,
    final String authorization,
    final RegularPaymentReqBody regularPaymentBody)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `accept` | `String` | Header, Required | - |
| `contentType` | `String` | Header, Required | - |
| `authorization` | `String` | Header, Required | - |
| `regularPaymentBody` | [`RegularPaymentReqBody`](../../doc/models/regular-payment-req-body.md) | Body, Required | - |

## Response Type

[`RegularPaymentResponse`](../../doc/models/regular-payment-response.md)

## Example Usage

```java
String accept = "application/vnd.paymark_api+json";
String contentType = "application/vnd.paymark_api+json";
String authorization = "Bearer kARcGkNy4mArFN1HZQ2INAJ5mFDw";
RegularPaymentReqBody regularPaymentBody = new RegularPaymentReqBody();
regularPaymentBody.setBank(new Bank());
regularPaymentBody.getBank().setPayerId("0215551234");
regularPaymentBody.getBank().setBankId("ASB");
regularPaymentBody.getBank().setPayerIdType("MOBILE");
regularPaymentBody.setMerchant(new Merchant());
regularPaymentBody.getMerchant().setMerchantIdCode("301234567");
regularPaymentBody.getMerchant().setMerchantUrl("https://www.widgets.co.nz/");
regularPaymentBody.getMerchant().setCallbackUrl("https://www.widgets.co.nz/callback?order=145");
regularPaymentBody.setTransaction(new Transaction());
regularPaymentBody.getTransaction().setAmount(1000);
regularPaymentBody.getTransaction().setTransactionType("REGULAR");
regularPaymentBody.getTransaction().setCurrency("NZD");
regularPaymentBody.getTransaction().setDescription("Widgets");
regularPaymentBody.getTransaction().setOrderId("145");
regularPaymentBody.getTransaction().setUserAgent("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_2) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/47.0.2526.106 Safari/537.36");
regularPaymentBody.getTransaction().setUserIpAddress("192.168.0.1");

paymentsController.createARegularPaymentAsync(accept, contentType, authorization, regularPaymentBody).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Get Autopay Details

```java
CompletableFuture<Void> getAutopayDetailsAsync(
    final String accept,
    final String contentType,
    final String authorization,
    final String id)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `accept` | `String` | Header, Required | - |
| `contentType` | `String` | Header, Required | - |
| `authorization` | `String` | Header, Required | - |
| `id` | `String` | Template, Required | - |

## Response Type

`void`

## Example Usage

```java
String accept = "application/vnd.paymark_api+json";
String contentType = "application/vnd.paymark_api+json";
String authorization = "Bearer kARcGkNy4mArFN1HZQ2INAJ5mFDw";
String id = "381a08c8-9189-4995-b07b-6c3821f70e35";

paymentsController.getAutopayDetailsAsync(accept, contentType, authorization, id).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Create a Refund

```java
CompletableFuture<Void> createARefundAsync(
    final String accept,
    final String contentType,
    final String authorization,
    final RefundReqBody refundReqBody)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `accept` | `String` | Header, Required | - |
| `contentType` | `String` | Header, Required | - |
| `authorization` | `String` | Header, Required | - |
| `refundReqBody` | [`RefundReqBody`](../../doc/models/refund-req-body.md) | Body, Required | - |

## Response Type

`void`

## Example Usage

```java
String accept = "application/vnd.paymark_api+json";
String contentType = "application/vnd.paymark_api+json";
String authorization = "Bearer kARcGkNy4mArFN1HZQ2INAJ5mFDw";
RefundReqBody refundReqBody = new RefundReqBody();
refundReqBody.setMerchant(new Merchant2());
refundReqBody.getMerchant().setMerchantIdCode("301234567");
refundReqBody.setTransaction(new Transaction2());
refundReqBody.getTransaction().setRefundAmount(1000);
refundReqBody.getTransaction().setRefundReason("Defective goods");
refundReqBody.getTransaction().setRefundId("R145");
refundReqBody.getTransaction().setOriginalPaymentId("381a08c8-9189-4995-b07b-6c3821f70e35");
refundReqBody.getTransaction().setUserAgent("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_2) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/47.0.2526.106 Safari/537.36");
refundReqBody.getTransaction().setUserIpAddress("192.168.0.1");

paymentsController.createARefundAsync(accept, contentType, authorization, refundReqBody).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Retrieve Multiple Payments

```java
CompletableFuture<DynamicResponse> retrieveMultiplePaymentsAsync(
    final int orderId,
    final int merchantIdCode,
    final int payerId,
    final LocalDateTime fromCreationTime,
    final LocalDateTime toCreationTime,
    final LocalDateTime fromActualSettlementDate,
    final LocalDateTime toActualSettlementDate,
    final String status,
    final String offset,
    final int limit,
    final String accept,
    final String contentType,
    final String authorization)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `orderId` | `int` | Query, Required | - |
| `merchantIdCode` | `int` | Query, Required | - |
| `payerId` | `int` | Query, Required | - |
| `fromCreationTime` | `LocalDateTime` | Query, Required | - |
| `toCreationTime` | `LocalDateTime` | Query, Required | - |
| `fromActualSettlementDate` | `LocalDateTime` | Query, Required | - |
| `toActualSettlementDate` | `LocalDateTime` | Query, Required | - |
| `status` | `String` | Query, Required | - |
| `offset` | `String` | Query, Required | - |
| `limit` | `int` | Query, Required | - |
| `accept` | `String` | Header, Required | - |
| `contentType` | `String` | Header, Required | - |
| `authorization` | `String` | Header, Required | - |

## Server

`Server.`

## Response Type

`DynamicResponse`

## Example Usage

```java
int orderId = 165;
int merchantIdCode = 301234567;
int payerId = 37147292;
LocalDateTime fromCreationTime = LocalDateTime.parse("2016-03-13T12:52:32.123Z", DateTimeFormatter.ISO_DATE_TIME);
LocalDateTime toCreationTime = LocalDateTime.parse("2016-03-13T12:52:32.123Z", DateTimeFormatter.ISO_DATE_TIME);
LocalDateTime fromActualSettlementDate = LocalDateTime.parse("2016-03-13T12:52:32.123Z", DateTimeFormatter.ISO_DATE_TIME);
LocalDateTime toActualSettlementDate = LocalDateTime.parse("2016-03-13T12:52:32.123Z", DateTimeFormatter.ISO_DATE_TIME);
String status = "AUTHORISED";
String offset = "0fe3085c-1f8a-4830-b587-f778d0f5340a";
int limit = 2;
String accept = "application/vnd.paymark_api+json";
String contentType = "application/vnd.paymark_api+json";
String authorization = "Bearer 2qYLkfqqeDb77GkYcgW1eAaNpGvY";

paymentsController.retrieveMultiplePaymentsAsync(orderId, merchantIdCode, payerId, fromCreationTime, toCreationTime, fromActualSettlementDate, toActualSettlementDate, status, offset, limit, accept, contentType, authorization).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

