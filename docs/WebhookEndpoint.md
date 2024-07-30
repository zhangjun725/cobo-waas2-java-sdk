

# WebhookEndpoint

The information about a webhook endpoint.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**url** | **String** | The webhook endpoint URL. |  |
|**subscribedEvents** | **List&lt;WebhookEventType&gt;** | The event types subscribed by a webhook endpoint. |  |
|**createdTimestamp** | **Long** | The time when the endpoint was registered, in Unix timestamp format, measured in seconds. |  |
|**endpointId** | **UUID** | The webhook endpoint ID. |  [optional] |
|**status** | **WebhookEndpointStatus** |  |  |
|**description** | **String** | The description of the webhook endpoint. |  [optional] |



