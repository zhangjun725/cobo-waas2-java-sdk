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
import com.cobo.waas2.model.TransactionResultType;
import com.cobo.waas2.model.TransactionSignatureResult;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;



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
public class TransactionResult extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(TransactionResult.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!TransactionResult.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'TransactionResult' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<TransactionSignatureResult> adapterTransactionSignatureResult = gson.getDelegateAdapter(this, TypeToken.get(TransactionSignatureResult.class));

            return (TypeAdapter<T>) new TypeAdapter<TransactionResult>() {
                @Override
                public void write(JsonWriter out, TransactionResult value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `TransactionSignatureResult`
                    if (value.getActualInstance() instanceof TransactionSignatureResult) {
                        JsonElement element = adapterTransactionSignatureResult.toJsonTree((TransactionSignatureResult)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: TransactionSignatureResult");
                }

                @Override
                public TransactionResult read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    JsonObject jsonObject = jsonElement.getAsJsonObject();

                    // use discriminator value for faster oneOf lookup
                    TransactionResult newTransactionResult = new TransactionResult();
                    if (jsonObject.get("result_type") == null) {
                        log.log(Level.WARNING, "Failed to lookup discriminator value for TransactionResult as `result_type` was not found in the payload or the payload is empty.");
                    } else  {
                        // look up the discriminator value in the field `result_type`
                        switch (jsonObject.get("result_type").getAsString()) {
                            case "Signature":
                                deserialized = adapterTransactionSignatureResult.fromJsonTree(jsonObject);
                                newTransactionResult.setActualInstance(deserialized);
                                return newTransactionResult;
                            case "TransactionSignatureResult":
                                deserialized = adapterTransactionSignatureResult.fromJsonTree(jsonObject);
                                newTransactionResult.setActualInstance(deserialized);
                                return newTransactionResult;
                            default:
                                log.log(Level.WARNING, String.format("Failed to lookup discriminator value `%s` for TransactionResult. Possible values: Signature TransactionSignatureResult", jsonObject.get("result_type").getAsString()));
                        }
                    }

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize TransactionSignatureResult
                    try {
                        // validate the JSON object to see if any exception is thrown
                        TransactionSignatureResult.validateJsonElement(jsonElement);
                        actualAdapter = adapterTransactionSignatureResult;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'TransactionSignatureResult'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for TransactionSignatureResult failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'TransactionSignatureResult'", e);
                    }

                    if (match == 1) {
                        TransactionResult ret = new TransactionResult();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for TransactionResult: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public TransactionResult() {
        super("oneOf", Boolean.FALSE);
    }

    public TransactionResult(TransactionSignatureResult o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("TransactionSignatureResult", TransactionSignatureResult.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return TransactionResult.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * TransactionSignatureResult
     *
     * It could be an instance of the 'oneOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof TransactionSignatureResult) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be TransactionSignatureResult");
    }

    /**
     * Get the actual instance, which can be the following:
     * TransactionSignatureResult
     *
     * @return The actual instance (TransactionSignatureResult)
     */
    @SuppressWarnings("unchecked")
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `TransactionSignatureResult`. If the actual instance is not `TransactionSignatureResult`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `TransactionSignatureResult`
     * @throws ClassCastException if the instance is not `TransactionSignatureResult`
     */
    public TransactionSignatureResult getTransactionSignatureResult() throws ClassCastException {
        return (TransactionSignatureResult)super.getActualInstance();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to TransactionResult
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        // validate oneOf schemas one by one
        int validCount = 0;
        ArrayList<String> errorMessages = new ArrayList<>();
        // validate the json string with TransactionSignatureResult
        try {
            TransactionSignatureResult.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for TransactionSignatureResult failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        if (validCount != 1) {
            // throw new IOException(String.format("The JSON string is invalid for TransactionResult with oneOf schemas: TransactionSignatureResult. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonElement.toString()));
        }
    }

    /**
     * Create an instance of TransactionResult given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of TransactionResult
     * @throws IOException if the JSON string is invalid with respect to TransactionResult
     */
    public static TransactionResult fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, TransactionResult.class);
    }

    /**
     * Convert an instance of TransactionResult to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

