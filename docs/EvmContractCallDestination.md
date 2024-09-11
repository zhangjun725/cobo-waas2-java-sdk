

# EvmContractCallDestination

The information about the transaction destination. Refer to [Transaction sources and destinations](/v2/guides/sources-and-destinations) for details.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**destinationType** | **ContractCallDestinationType** |  |  |
|**address** | **String** | The destination address. |  |
|**value** | **String** | The transfer amount. For example, if you trade 1.5 ETH, then the value is &#x60;1.5&#x60;.  |  [optional] |
|**calldata** | **byte[]** | The data that is used to invoke a specific function or method within the specified contract at the destination address.  |  |



