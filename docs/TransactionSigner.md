

# TransactionSigner

The signer data for transaction.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**signer** | **String** | The signer name of the transaction. |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | The signing status. |  [optional] |
|**failedReason** | **String** | Failed reason of signing process. |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| PENDING | &quot;Pending&quot; |
| SIGNED | &quot;Signed&quot; |
| TIMEOUT | &quot;Timeout&quot; |
| REJECTED | &quot;Rejected&quot; |



