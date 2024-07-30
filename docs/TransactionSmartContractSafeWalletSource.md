

# TransactionSmartContractSafeWalletSource

Information about the transaction source, which varies depending on whether you are the initiator or the receiver of the transaction.   - As the initiator, you will see detailed information about the transaction source, and the `source` will be displayed as one of the following wallet sub-types: `Asset`, `Org-Controlled`, `User-Controlled`, `Safe{Wallet}`, `Main`, or `Sub`. - As the receiver, you will see the `source` as either `DepositFromAddress`, `DepositFromWallet`, or `DepositFromLoop`. If the transaction is from the Loop transfer network, the source will be `DepositFromLoop`. Otherwise, it will be either `DepositFromWallet` (indicating an Exchange Wallet) or `DepositFromAddress` (indicating other wallet type than an Exchange Wallet or an external address). 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**sourceType** | **TransactionSourceType** |  |  |
|**walletId** | **UUID** | The wallet ID. |  |
|**address** | **String** | The wallet address. |  |
|**delegate** | [**CoboSafeDelegate**](CoboSafeDelegate.md) |  |  |



