

# PoolDetails


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The unique protocol id. |  |
|**chainId** | **String** | The unique chain id. |  |
|**protocol** | **String** | The name of the protocol. |  |
|**protocolIconUrl** | **String** | The URL of the protocol&#39;s icon. |  |
|**supportedWalletTypes** | **List&lt;WalletType&gt;** | The list of available wallet types. |  |
|**supportedWalletSubtypes** | **List&lt;WalletSubtype&gt;** | The list of available wallet types. |  |
|**tokenId** | **String** | The unique token id. |  |
|**estApr** | **Float** | The estimated APR. |  |
|**poolType** | **StakingPoolType** |  |  [optional] |
|**minAmount** | **String** | The minimum amount to stake. |  [optional] |
|**maxAmount** | **String** | The maximum amount to stake. |  [optional] |
|**minStakePeriod** | **Integer** | The minimum staking period in days. |  [optional] |
|**maxStakePeriod** | **Integer** | The maximum staking period in days. |  [optional] |
|**minStakeBlocks** | **Long** | The minimum staking blocks. |  [optional] |
|**maxStakeBlocks** | **Long** | The maximum staking blocks. |  [optional] |
|**validatorsInfo** | [**List&lt;PoolDetailsAllOfValidatorsInfo&gt;**](PoolDetailsAllOfValidatorsInfo.md) | The list of validators. |  |



