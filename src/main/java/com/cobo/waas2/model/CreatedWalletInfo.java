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


package com.cobo.waas2.model;

import java.util.Objects;
import com.cobo.waas2.model.CustodialWalletInfo;
import com.cobo.waas2.model.ExchangeId;
import com.cobo.waas2.model.ExchangeWalletInfo;
import com.cobo.waas2.model.MPCWalletInfo;
import com.cobo.waas2.model.WalletSubtype;
import com.cobo.waas2.model.WalletType;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.UUID;



import java.io.IOException;
import java.lang.reflect.Type;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.JsonPrimitive;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonArray;
import com.google.gson.JsonParseException;

import com.cobo.waas2.JSON;

@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen", 
    comments = "Generator version: 7.6.0"
)
public class CreatedWalletInfo extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(CreatedWalletInfo.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!CreatedWalletInfo.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'CreatedWalletInfo' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<CustodialWalletInfo> adapterCustodialWalletInfo = gson.getDelegateAdapter(this, TypeToken.get(CustodialWalletInfo.class));
            final TypeAdapter<MPCWalletInfo> adapterMPCWalletInfo = gson.getDelegateAdapter(this, TypeToken.get(MPCWalletInfo.class));
            final TypeAdapter<ExchangeWalletInfo> adapterExchangeWalletInfo = gson.getDelegateAdapter(this, TypeToken.get(ExchangeWalletInfo.class));

            return (TypeAdapter<T>) new TypeAdapter<CreatedWalletInfo>() {
                @Override
                public void write(JsonWriter out, CreatedWalletInfo value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `CustodialWalletInfo`
                    if (value.getActualInstance() instanceof CustodialWalletInfo) {
                        JsonElement element = adapterCustodialWalletInfo.toJsonTree((CustodialWalletInfo)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `MPCWalletInfo`
                    if (value.getActualInstance() instanceof MPCWalletInfo) {
                        JsonElement element = adapterMPCWalletInfo.toJsonTree((MPCWalletInfo)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `ExchangeWalletInfo`
                    if (value.getActualInstance() instanceof ExchangeWalletInfo) {
                        JsonElement element = adapterExchangeWalletInfo.toJsonTree((ExchangeWalletInfo)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: CustodialWalletInfo, ExchangeWalletInfo, MPCWalletInfo");
                }

                @Override
                public CreatedWalletInfo read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    JsonObject jsonObject = jsonElement.getAsJsonObject();

                    // use discriminator value for faster oneOf lookup
                    CreatedWalletInfo newCreatedWalletInfo = new CreatedWalletInfo();
                    if (jsonObject.get("wallet_type") == null) {
                        log.log(Level.WARNING, "Failed to lookup discriminator value for CreatedWalletInfo as `wallet_type` was not found in the payload or the payload is empty.");
                    } else  {
                        // look up the discriminator value in the field `wallet_type`
                        switch (jsonObject.get("wallet_type").getAsString()) {
                            case "Custodial":
                                deserialized = adapterCustodialWalletInfo.fromJsonTree(jsonObject);
                                newCreatedWalletInfo.setActualInstance(deserialized);
                                return newCreatedWalletInfo;
                            case "Exchange":
                                deserialized = adapterExchangeWalletInfo.fromJsonTree(jsonObject);
                                newCreatedWalletInfo.setActualInstance(deserialized);
                                return newCreatedWalletInfo;
                            case "MPC":
                                deserialized = adapterMPCWalletInfo.fromJsonTree(jsonObject);
                                newCreatedWalletInfo.setActualInstance(deserialized);
                                return newCreatedWalletInfo;
                            case "CustodialWalletInfo":
                                deserialized = adapterCustodialWalletInfo.fromJsonTree(jsonObject);
                                newCreatedWalletInfo.setActualInstance(deserialized);
                                return newCreatedWalletInfo;
                            case "ExchangeWalletInfo":
                                deserialized = adapterExchangeWalletInfo.fromJsonTree(jsonObject);
                                newCreatedWalletInfo.setActualInstance(deserialized);
                                return newCreatedWalletInfo;
                            case "MPCWalletInfo":
                                deserialized = adapterMPCWalletInfo.fromJsonTree(jsonObject);
                                newCreatedWalletInfo.setActualInstance(deserialized);
                                return newCreatedWalletInfo;
                            default:
                                log.log(Level.WARNING, String.format("Failed to lookup discriminator value `%s` for CreatedWalletInfo. Possible values: Custodial Exchange MPC CustodialWalletInfo ExchangeWalletInfo MPCWalletInfo", jsonObject.get("wallet_type").getAsString()));
                        }
                    }

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize CustodialWalletInfo
                    try {
                        // validate the JSON object to see if any exception is thrown
                        CustodialWalletInfo.validateJsonElement(jsonElement);
                        actualAdapter = adapterCustodialWalletInfo;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'CustodialWalletInfo'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for CustodialWalletInfo failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'CustodialWalletInfo'", e);
                    }
                    // deserialize MPCWalletInfo
                    try {
                        // validate the JSON object to see if any exception is thrown
                        MPCWalletInfo.validateJsonElement(jsonElement);
                        actualAdapter = adapterMPCWalletInfo;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'MPCWalletInfo'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for MPCWalletInfo failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'MPCWalletInfo'", e);
                    }
                    // deserialize ExchangeWalletInfo
                    try {
                        // validate the JSON object to see if any exception is thrown
                        ExchangeWalletInfo.validateJsonElement(jsonElement);
                        actualAdapter = adapterExchangeWalletInfo;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'ExchangeWalletInfo'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for ExchangeWalletInfo failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'ExchangeWalletInfo'", e);
                    }

                    if (match == 1) {
                        CreatedWalletInfo ret = new CreatedWalletInfo();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for CreatedWalletInfo: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public CreatedWalletInfo() {
        super("oneOf", Boolean.FALSE);
    }

    public CreatedWalletInfo(CustodialWalletInfo o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public CreatedWalletInfo(ExchangeWalletInfo o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public CreatedWalletInfo(MPCWalletInfo o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("CustodialWalletInfo", CustodialWalletInfo.class);
        schemas.put("MPCWalletInfo", MPCWalletInfo.class);
        schemas.put("ExchangeWalletInfo", ExchangeWalletInfo.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return CreatedWalletInfo.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * CustodialWalletInfo, ExchangeWalletInfo, MPCWalletInfo
     *
     * It could be an instance of the 'oneOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof CustodialWalletInfo) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof MPCWalletInfo) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof ExchangeWalletInfo) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be CustodialWalletInfo, ExchangeWalletInfo, MPCWalletInfo");
    }

    /**
     * Get the actual instance, which can be the following:
     * CustodialWalletInfo, ExchangeWalletInfo, MPCWalletInfo
     *
     * @return The actual instance (CustodialWalletInfo, ExchangeWalletInfo, MPCWalletInfo)
     */
    @SuppressWarnings("unchecked")
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `CustodialWalletInfo`. If the actual instance is not `CustodialWalletInfo`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `CustodialWalletInfo`
     * @throws ClassCastException if the instance is not `CustodialWalletInfo`
     */
    public CustodialWalletInfo getCustodialWalletInfo() throws ClassCastException {
        return (CustodialWalletInfo)super.getActualInstance();
    }
    /**
     * Get the actual instance of `MPCWalletInfo`. If the actual instance is not `MPCWalletInfo`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `MPCWalletInfo`
     * @throws ClassCastException if the instance is not `MPCWalletInfo`
     */
    public MPCWalletInfo getMPCWalletInfo() throws ClassCastException {
        return (MPCWalletInfo)super.getActualInstance();
    }
    /**
     * Get the actual instance of `ExchangeWalletInfo`. If the actual instance is not `ExchangeWalletInfo`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ExchangeWalletInfo`
     * @throws ClassCastException if the instance is not `ExchangeWalletInfo`
     */
    public ExchangeWalletInfo getExchangeWalletInfo() throws ClassCastException {
        return (ExchangeWalletInfo)super.getActualInstance();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to CreatedWalletInfo
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        // validate oneOf schemas one by one
        int validCount = 0;
        ArrayList<String> errorMessages = new ArrayList<>();
        // validate the json string with CustodialWalletInfo
        try {
            CustodialWalletInfo.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for CustodialWalletInfo failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with MPCWalletInfo
        try {
            MPCWalletInfo.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for MPCWalletInfo failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with ExchangeWalletInfo
        try {
            ExchangeWalletInfo.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for ExchangeWalletInfo failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        if (validCount != 1) {
            // throw new IOException(String.format("The JSON string is invalid for CreatedWalletInfo with oneOf schemas: CustodialWalletInfo, ExchangeWalletInfo, MPCWalletInfo. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonElement.toString()));
        }
    }

    /**
     * Create an instance of CreatedWalletInfo given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of CreatedWalletInfo
     * @throws IOException if the JSON string is invalid with respect to CreatedWalletInfo
     */
    public static CreatedWalletInfo fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, CreatedWalletInfo.class);
    }

    /**
     * Convert an instance of CreatedWalletInfo to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

