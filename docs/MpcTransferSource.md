

# MpcTransferSource

The information about the transaction source types `Org-Controlled` and `User-Controlled`. Refer to [Transaction sources and destinations](/v2/guides/sources-and-destinations) for details.  If you specify both the `address` or `included_utxos` properties, the specified included UTXOs must belong to the address.  Switch between the tabs to display the properties for different transaction sources. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**sourceType** | **WalletSubtype** |  |  |
|**walletId** | **UUID** | The wallet ID. |  |
|**address** | **String** | The wallet address. |  [optional] |
|**includedUtxos** | [**List&lt;TransactionUtxo&gt;**](TransactionUtxo.md) |  |  [optional] |
|**excludedUtxos** | [**List&lt;TransactionUtxo&gt;**](TransactionUtxo.md) |  |  [optional] |



