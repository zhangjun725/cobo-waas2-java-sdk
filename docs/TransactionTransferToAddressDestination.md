

# TransactionTransferToAddressDestination

Information about the transaction destination, which varies depending on whether you are the initiator or the receiver of the transaction.   - As the initiator, you will see detailed information about the transaction destination, and the `destination` will be displayed as one of the following types: `EVM_Contract`, `EVM_EIP_191_Signature`, `EVM_EIP_712_Signature`, `DepositToAddress`, or `DepositToWallet`. `DepositToWallet` indicates the destination is an Exchange Wallet, while `DepositToAddress` indicates the destination is a wallet of other wallet types or an external address. - As the receiver, you will see the `destination` as the type `Address` or `ExchangeWallet`. `Address` indicates the destination is a wallet of other wallet types than Exchange Wallets or an external address. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**destinationType** | **TransactionDestinationType** |  |  |
|**accountOutput** | [**TransactionTransferToAddressDestinationAccountOutput**](TransactionTransferToAddressDestinationAccountOutput.md) |  |  [optional] |
|**utxoOutputs** | [**List&lt;TransactionTransferToAddressDestinationUtxoOutputsInner&gt;**](TransactionTransferToAddressDestinationUtxoOutputsInner.md) |  |  [optional] |
|**changeAddress** | **String** | The address used to receive the remaining funds or change from the transaction. |  [optional] |
|**forceInternal** | **Boolean** | Whether the transaction request must be executed as a Loop transfer. For more information about Loop, see [Loop&#39;s website](https://loop.top/).   - &#x60;true&#x60;: The transaction request must be executed as a Loop transfer.   - &#x60;false&#x60;: The transaction request may not be executed as a Loop transfer.  |  [optional] |
|**forceExternal** | **Boolean** | Whether the transaction request must not be executed as a Loop transfer. For more information about Loop, see [Loop&#39;s website](https://loop.top/).   - &#x60;true&#x60;: The transaction request must not be executed as a Loop transfer.   - &#x60;false&#x60;: The transaction request can be executed as a Loop transfer.  |  [optional] |



