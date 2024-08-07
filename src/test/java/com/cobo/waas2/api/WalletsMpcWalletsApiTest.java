/*
 * Cobo Wallet as a Service 2.0
 *
 * The version of the OpenAPI document: 1.1.0
 * Contact: support@cobo.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.cobo.waas2.api;

import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.CreateKeyShareHolderGroupRequest;
import com.cobo.waas2.model.CreateMpcProjectRequest;
import com.cobo.waas2.model.CreateMpcVaultRequest;
import com.cobo.waas2.model.CreateTssRequestRequest;
import com.cobo.waas2.model.DeleteKeyShareHolderGroupById201Response;
import com.cobo.waas2.model.ErrorResponse;
import com.cobo.waas2.model.KeyShareHolder;
import com.cobo.waas2.model.KeyShareHolderGroup;
import com.cobo.waas2.model.KeyShareHolderGroupType;
import com.cobo.waas2.model.ListKeyShareHolderGroups200Response;
import com.cobo.waas2.model.ListMpcProjects200Response;
import com.cobo.waas2.model.ListMpcVaults200Response;
import com.cobo.waas2.model.ListTssRequests200Response;
import com.cobo.waas2.model.MPCProject;
import com.cobo.waas2.model.MPCVault;
import com.cobo.waas2.model.MPCVaultType;
import com.cobo.waas2.model.TSSRequest;
import java.util.UUID;
import com.cobo.waas2.model.UpdateKeyShareHolderGroupByIdRequest;
import com.cobo.waas2.model.UpdateMpcProjectByIdRequest;
import com.cobo.waas2.model.UpdateMpcVaultByIdRequest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for WalletsMpcWalletsApi
 */
@Disabled
public class WalletsMpcWalletsApiTest {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // set custom base url
    {
        defaultClient.setBasePath("https://api.sandbox.cobo.com/v2");
        defaultClient.setPrivKey("<YOUR_API_PRIVATE_KEY_IN_HEX>");
    }
    private final WalletsMpcWalletsApi api = new WalletsMpcWalletsApi();

    /**
     * Cancel TSS request
     *
     * This operation cancels a TSS request. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void cancelTssRequestByIdTest() throws ApiException {
        UUID vaultId = null;
        String tssRequestId = null;
        TSSRequest response = api.cancelTssRequestById(vaultId, tssRequestId);
        // TODO: test validations
    }

    /**
     * Create key share holder group
     *
     * This operation creates a key share holder group for a specified vault. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createKeyShareHolderGroupTest() throws ApiException {
        UUID vaultId = null;
        CreateKeyShareHolderGroupRequest createKeyShareHolderGroupRequest = null;
        KeyShareHolderGroup response = api.createKeyShareHolderGroup(vaultId, createKeyShareHolderGroupRequest);
        // TODO: test validations
    }

    /**
     * Create project
     *
     * This operation creates a project.  &lt;Info&gt;This operation applies to MPC Wallets (User-Controlled Wallets) only.&lt;/Info&gt; 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createMpcProjectTest() throws ApiException {
        CreateMpcProjectRequest createMpcProjectRequest = null;
        MPCProject response = api.createMpcProject(createMpcProjectRequest);
        // TODO: test validations
    }

    /**
     * Create vault
     *
     * This operation creates a vault. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createMpcVaultTest() throws ApiException {
        CreateMpcVaultRequest createMpcVaultRequest = null;
        MPCVault response = api.createMpcVault(createMpcVaultRequest);
        // TODO: test validations
    }

    /**
     * Create TSS request
     *
     * This operation creates a TSS request under a specified vault. You can use this operation to perform actions such as key generation and recovery. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createTssRequestTest() throws ApiException {
        UUID vaultId = null;
        CreateTssRequestRequest createTssRequestRequest = null;
        TSSRequest response = api.createTssRequest(vaultId, createTssRequestRequest);
        // TODO: test validations
    }

    /**
     * Delete key share holder group
     *
     * This operation deletes a specified key share holder group.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteKeyShareHolderGroupByIdTest() throws ApiException {
        UUID vaultId = null;
        String keyShareHolderGroupId = null;
        DeleteKeyShareHolderGroupById201Response response = api.deleteKeyShareHolderGroupById(vaultId, keyShareHolderGroupId);
        // TODO: test validations
    }

    /**
     * Get key share holder group information
     *
     * This operation retrieves detailed information about a specified key share holder group. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getKeyShareHolderGroupByIdTest() throws ApiException {
        UUID vaultId = null;
        String keyShareHolderGroupId = null;
        KeyShareHolderGroup response = api.getKeyShareHolderGroupById(vaultId, keyShareHolderGroupId);
        // TODO: test validations
    }

    /**
     * Get project information
     *
     * This operation retrieves detailed information about a project. &lt;Info&gt;This operation applies to MPC Wallets (User-Controlled Wallets) only.&lt;/Info&gt; 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getMpcProjectByIdTest() throws ApiException {
        UUID projectId = null;
        MPCProject response = api.getMpcProjectById(projectId);
        // TODO: test validations
    }

    /**
     * Get vault information
     *
     * This operation retrieves detailed information about a vault. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getMpcVaultByIdTest() throws ApiException {
        UUID vaultId = null;
        MPCVault response = api.getMpcVaultById(vaultId);
        // TODO: test validations
    }

    /**
     * Get TSS request
     *
     * This operation retrieves detailed information about a TSS request. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getTssRequestByIdTest() throws ApiException {
        UUID vaultId = null;
        String tssRequestId = null;
        TSSRequest response = api.getTssRequestById(vaultId, tssRequestId);
        // TODO: test validations
    }

    /**
     * List all Cobo key share holders
     *
     * This operation retrieves a list of all Cobo key share holders and their information.   &lt;Info&gt;When using this operation, &#x60;type&#x60; will only return &#x60;Cobo&#x60; and will never return &#x60;Mobile&#x60; or &#x60;API&#x60;.&lt;/Info&gt; 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listCoboKeyHoldersTest() throws ApiException {
        List<KeyShareHolder> response = api.listCoboKeyHolders();
        // TODO: test validations
    }

    /**
     * List all key share holder groups
     *
     * This operation retrieves all key share holder groups under a specified vault. You can filter the result by group type. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listKeyShareHolderGroupsTest() throws ApiException {
        UUID vaultId = null;
        KeyShareHolderGroupType keyShareHolderGroupType = null;
        Integer limit = null;
        String before = null;
        String after = null;
        ListKeyShareHolderGroups200Response response = api.listKeyShareHolderGroups(vaultId, keyShareHolderGroupType, limit, before, after);
        // TODO: test validations
    }

    /**
     * List all projects
     *
     * This operation retrieves a list of all projects.  &lt;Info&gt;This operation applies to MPC Wallets (User-Controlled Wallets) only.&lt;/Info&gt; 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listMpcProjectsTest() throws ApiException {
        Integer limit = null;
        String before = null;
        String after = null;
        ListMpcProjects200Response response = api.listMpcProjects(limit, before, after);
        // TODO: test validations
    }

    /**
     * List all vaults
     *
     * This operation retrieves a list of all vaults. You can filter the result by project ID.  **Notes for query parameters**: 1. &#x60;project_id&#x60; is required when &#x60;vault_type&#x60; is set to &#x60;User-Controlled&#x60;. 2. &#x60;project_id&#x60; must be left blank when &#x60;vault_type&#x60; is set to &#x60;Org-Controlled&#x60;. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listMpcVaultsTest() throws ApiException {
        MPCVaultType vaultType = null;
        UUID projectId = null;
        Integer limit = null;
        String before = null;
        String after = null;
        ListMpcVaults200Response response = api.listMpcVaults(vaultType, projectId, limit, before, after);
        // TODO: test validations
    }

    /**
     * List TSS requests
     *
     * This operation retrieves a list of TSS requests and their details. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listTssRequestsTest() throws ApiException {
        UUID vaultId = null;
        String keyShareHolderGroupId = null;
        Integer limit = null;
        String before = null;
        String after = null;
        ListTssRequests200Response response = api.listTssRequests(vaultId, keyShareHolderGroupId, limit, before, after);
        // TODO: test validations
    }

    /**
     * Update key share holder group
     *
     * This operation updates a specified active [Signing Group](https://manuals.cobo.com/en/portal/mpc-wallets/ocw/create-key-share-groups). For example, you can use this operation to upgrade a Signing Group to the [Main Group](https://manuals.cobo.com/en/portal/mpc-wallets/ocw/create-key-share-groups). 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateKeyShareHolderGroupByIdTest() throws ApiException {
        UUID vaultId = null;
        String keyShareHolderGroupId = null;
        UpdateKeyShareHolderGroupByIdRequest updateKeyShareHolderGroupByIdRequest = null;
        KeyShareHolderGroup response = api.updateKeyShareHolderGroupById(vaultId, keyShareHolderGroupId, updateKeyShareHolderGroupByIdRequest);
        // TODO: test validations
    }

    /**
     * Update project name
     *
     * This operation updates a project&#39;s name.  &lt;Info&gt;This operation applies to MPC Wallets (User-Controlled Wallets) only.&lt;/Info&gt; 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateMpcProjectByIdTest() throws ApiException {
        UUID projectId = null;
        UpdateMpcProjectByIdRequest updateMpcProjectByIdRequest = null;
        MPCProject response = api.updateMpcProjectById(projectId, updateMpcProjectByIdRequest);
        // TODO: test validations
    }

    /**
     * Update vault name
     *
     * This operation updates a vault&#39;s name. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateMpcVaultByIdTest() throws ApiException {
        UUID vaultId = null;
        UpdateMpcVaultByIdRequest updateMpcVaultByIdRequest = null;
        MPCVault response = api.updateMpcVaultById(vaultId, updateMpcVaultByIdRequest);
        // TODO: test validations
    }

}
