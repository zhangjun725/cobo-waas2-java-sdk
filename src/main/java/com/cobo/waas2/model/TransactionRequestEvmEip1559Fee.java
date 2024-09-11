/*
 * Cobo Wallet as a Service 2.0
 *
 * Contact: help@cobo.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.cobo.waas2.model;

import java.util.Objects;
import com.cobo.waas2.model.FeeType;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.cobo.waas2.JSON;

/**
 * The preset properties to limit transaction fee.  In the EIP-1559 fee model, the transaction fee is calculated by multiplying the gas price and the gas units used by the transaction. This can be expressed as: Transaction fee &#x3D; gas price * gas units used.   You can specify the maximum gas fee per gas unit, maximum priority fee per gas unit, and the gas limit to limit the gas price, priority fee per gas unit, gas units used in the transaction.   Switch between the tabs to display the properties for different transaction fee models. 
 */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen", 
    comments = "Generator version: 7.6.0"
)
public class TransactionRequestEvmEip1559Fee {
  public static final String SERIALIZED_NAME_MAX_FEE_PER_GAS = "max_fee_per_gas";
  @SerializedName(SERIALIZED_NAME_MAX_FEE_PER_GAS)
  private String maxFeePerGas;

  public static final String SERIALIZED_NAME_MAX_PRIORITY_FEE_PER_GAS = "max_priority_fee_per_gas";
  @SerializedName(SERIALIZED_NAME_MAX_PRIORITY_FEE_PER_GAS)
  private String maxPriorityFeePerGas;

  public static final String SERIALIZED_NAME_FEE_TYPE = "fee_type";
  @SerializedName(SERIALIZED_NAME_FEE_TYPE)
  private FeeType feeType = FeeType.EVM_EIP_1559;

  public static final String SERIALIZED_NAME_TOKEN_ID = "token_id";
  @SerializedName(SERIALIZED_NAME_TOKEN_ID)
  private String tokenId;

  public static final String SERIALIZED_NAME_GAS_LIMIT = "gas_limit";
  @SerializedName(SERIALIZED_NAME_GAS_LIMIT)
  private String gasLimit = "21000";

  public TransactionRequestEvmEip1559Fee() {
  }

  public TransactionRequestEvmEip1559Fee maxFeePerGas(String maxFeePerGas) {
    this.maxFeePerGas = maxFeePerGas;
    return this;
  }

   /**
   * The maximum gas fee per gas unit used on the chain, in wei.
   * @return maxFeePerGas
  **/
  @javax.annotation.Nonnull
  public String getMaxFeePerGas() {
    return maxFeePerGas;
  }

  public void setMaxFeePerGas(String maxFeePerGas) {
    this.maxFeePerGas = maxFeePerGas;
  }


  public TransactionRequestEvmEip1559Fee maxPriorityFeePerGas(String maxPriorityFeePerGas) {
    this.maxPriorityFeePerGas = maxPriorityFeePerGas;
    return this;
  }

   /**
   * The maximum priority fee per gas unit used, in wei. The maximum priority fee represents the highest amount of miner tips that you are willing to pay for your transaction.
   * @return maxPriorityFeePerGas
  **/
  @javax.annotation.Nonnull
  public String getMaxPriorityFeePerGas() {
    return maxPriorityFeePerGas;
  }

  public void setMaxPriorityFeePerGas(String maxPriorityFeePerGas) {
    this.maxPriorityFeePerGas = maxPriorityFeePerGas;
  }


  public TransactionRequestEvmEip1559Fee feeType(FeeType feeType) {
    this.feeType = feeType;
    return this;
  }

   /**
   * Get feeType
   * @return feeType
  **/
  @javax.annotation.Nonnull
  public FeeType getFeeType() {
    return feeType;
  }

  public void setFeeType(FeeType feeType) {
    this.feeType = feeType;
  }


  public TransactionRequestEvmEip1559Fee tokenId(String tokenId) {
    this.tokenId = tokenId;
    return this;
  }

   /**
   * The token ID of the transaction fee.
   * @return tokenId
  **/
  @javax.annotation.Nonnull
  public String getTokenId() {
    return tokenId;
  }

  public void setTokenId(String tokenId) {
    this.tokenId = tokenId;
  }


  public TransactionRequestEvmEip1559Fee gasLimit(String gasLimit) {
    this.gasLimit = gasLimit;
    return this;
  }

   /**
   * The gas limit. It represents the maximum number of gas units that you are willing to pay for the execution of a transaction or Ethereum Virtual Machine (EVM) operation. The gas unit cost of each operation varies.
   * @return gasLimit
  **/
  @javax.annotation.Nullable
  public String getGasLimit() {
    return gasLimit;
  }

  public void setGasLimit(String gasLimit) {
    this.gasLimit = gasLimit;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the TransactionRequestEvmEip1559Fee instance itself
   */
  public TransactionRequestEvmEip1559Fee putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionRequestEvmEip1559Fee transactionRequestEvmEip1559Fee = (TransactionRequestEvmEip1559Fee) o;
    return Objects.equals(this.maxFeePerGas, transactionRequestEvmEip1559Fee.maxFeePerGas) &&
        Objects.equals(this.maxPriorityFeePerGas, transactionRequestEvmEip1559Fee.maxPriorityFeePerGas) &&
        Objects.equals(this.feeType, transactionRequestEvmEip1559Fee.feeType) &&
        Objects.equals(this.tokenId, transactionRequestEvmEip1559Fee.tokenId) &&
        Objects.equals(this.gasLimit, transactionRequestEvmEip1559Fee.gasLimit)&&
        Objects.equals(this.additionalProperties, transactionRequestEvmEip1559Fee.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxFeePerGas, maxPriorityFeePerGas, feeType, tokenId, gasLimit, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionRequestEvmEip1559Fee {\n");
    sb.append("    maxFeePerGas: ").append(toIndentedString(maxFeePerGas)).append("\n");
    sb.append("    maxPriorityFeePerGas: ").append(toIndentedString(maxPriorityFeePerGas)).append("\n");
    sb.append("    feeType: ").append(toIndentedString(feeType)).append("\n");
    sb.append("    tokenId: ").append(toIndentedString(tokenId)).append("\n");
    sb.append("    gasLimit: ").append(toIndentedString(gasLimit)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("max_fee_per_gas");
    openapiFields.add("max_priority_fee_per_gas");
    openapiFields.add("fee_type");
    openapiFields.add("token_id");
    openapiFields.add("gas_limit");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("max_fee_per_gas");
    openapiRequiredFields.add("max_priority_fee_per_gas");
    openapiRequiredFields.add("fee_type");
    openapiRequiredFields.add("token_id");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to TransactionRequestEvmEip1559Fee
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TransactionRequestEvmEip1559Fee.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TransactionRequestEvmEip1559Fee is not found in the empty JSON string", TransactionRequestEvmEip1559Fee.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TransactionRequestEvmEip1559Fee.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("max_fee_per_gas").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `max_fee_per_gas` to be a primitive type in the JSON string but got `%s`", jsonObj.get("max_fee_per_gas").toString()));
      }
      if (!jsonObj.get("max_priority_fee_per_gas").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `max_priority_fee_per_gas` to be a primitive type in the JSON string but got `%s`", jsonObj.get("max_priority_fee_per_gas").toString()));
      }
      // validate the required field `fee_type`
      FeeType.validateJsonElement(jsonObj.get("fee_type"));
      if (!jsonObj.get("token_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `token_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("token_id").toString()));
      }
      if ((jsonObj.get("gas_limit") != null && !jsonObj.get("gas_limit").isJsonNull()) && !jsonObj.get("gas_limit").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gas_limit` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gas_limit").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TransactionRequestEvmEip1559Fee.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TransactionRequestEvmEip1559Fee' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TransactionRequestEvmEip1559Fee> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TransactionRequestEvmEip1559Fee.class));

       return (TypeAdapter<T>) new TypeAdapter<TransactionRequestEvmEip1559Fee>() {
           @Override
           public void write(JsonWriter out, TransactionRequestEvmEip1559Fee value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additional properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   JsonElement jsonElement = gson.toJsonTree(entry.getValue());
                   if (jsonElement.isJsonArray()) {
                     obj.add(entry.getKey(), jsonElement.getAsJsonArray());
                   } else {
                     obj.add(entry.getKey(), jsonElement.getAsJsonObject());
                   }
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public TransactionRequestEvmEip1559Fee read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             TransactionRequestEvmEip1559Fee instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TransactionRequestEvmEip1559Fee given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TransactionRequestEvmEip1559Fee
  * @throws IOException if the JSON string is invalid with respect to TransactionRequestEvmEip1559Fee
  */
  public static TransactionRequestEvmEip1559Fee fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TransactionRequestEvmEip1559Fee.class);
  }

 /**
  * Convert an instance of TransactionRequestEvmEip1559Fee to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

