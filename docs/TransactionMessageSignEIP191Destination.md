

# TransactionMessageSignEIP191Destination

Information about the transaction destination, which varies depending on whether you are the initiator or the receiver of the transaction.   - As the initiator, you will see detailed information about the transaction destination, and the `destination` will be displayed as one of the following types: `EVM_Contract`, `EVM_EIP_191_Signature`, `EVM_EIP_712_Signature`, `DepositToAddress`, or `DepositToWallet`. `DepositToWallet` indicates the destination is an Exchange Wallet, while `DepositToAddress` indicates the destination is a wallet of other wallet types or an external address. - As the receiver, you will see the `destination` as the type `Address` or `ExchangeWallet`. `Address` indicates the destination is a wallet of other wallet types than Exchange Wallets or an external address. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**destinationType** | **TransactionDestinationType** |  |  |
|**message** | **String** | The raw data of the message to be signed, encoded in Base64 format. |  |



