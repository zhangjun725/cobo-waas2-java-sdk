/*
 * Cobo Wallet as a Service 2.0
 *
 * Contact: help@cobo.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.cobo.waas2.api;

import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.ErrorResponse;
import com.cobo.waas2.model.GetToken200Response;
import com.cobo.waas2.model.GetToken4XXResponse;
import com.cobo.waas2.model.RefreshToken200Response;
import com.cobo.waas2.model.RefreshTokenRequest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for OAuthApi
 */
@Disabled
public class OAuthApiTest {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // set custom base url
    {
        defaultClient.setBasePath("https://api.sandbox.cobo.com/v2");
        defaultClient.setPrivKey("<YOUR_API_PRIVATE_KEY_IN_HEX>");
    }
    private final OAuthApi api = new OAuthApi();

    /**
     * Get access token
     *
     * &lt;Note&gt;This operation is only applicable to Cobo Portal App developers. To call this operation, you need to use the OAuth authentication method that requires an app key.&lt;/Note&gt; This operation allows Cobo Portal Apps to get an access token and a refresh token with a specified App ID, Organization ID, and grant type.   Access tokens allow the app to signal to the WaaS service that it has received permission to access specific resources of the app user&#39;s [organization](https://manuals.cobo.com/en/portal/organization/introduction). Once the app has been granted permission by the organization&#39;s admin, it can use this operation to obtain both an access token and a refresh token.  For security purposes, access tokens expire after a certain period. Once they expire, the app needs to call [Refresh token](/v2/api-references/oauth/refresh-access-token) to get a new access token and a new refresh token. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getTokenTest() throws ApiException {
        String clientId = null;
        String orgId = null;
        String grantType = null;
        GetToken200Response response = api.getToken(clientId, orgId, grantType);
        // TODO: test validations
    }

    /**
     * Refresh access token
     *
     * &lt;Note&gt;This operation is only applicable to Cobo Portal Apps developers. To call this operation, you need to use the OAuth authentication method that requires an app key.&lt;/Note&gt; This operation allows Cobo Portal Apps to obtain a new access token with a specified App ID, grant type and a refresh token.   For security purposes, access tokens expire after a certain period. Once they expire, the app needs to call this operation to get a new access token and a new refresh token. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void refreshTokenTest() throws ApiException {
        RefreshTokenRequest refreshTokenRequest = null;
        RefreshToken200Response response = api.refreshToken(refreshTokenRequest);
        // TODO: test validations
    }

}
