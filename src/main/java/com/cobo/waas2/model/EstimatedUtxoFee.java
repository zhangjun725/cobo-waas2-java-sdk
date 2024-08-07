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
import com.cobo.waas2.model.EstimatedUtxoFeeSlow;
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
 * The estimated transaction fee for UTXO-based chains.
 */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen", 
    comments = "Generator version: 7.6.0"
)
public class EstimatedUtxoFee {
  public static final String SERIALIZED_NAME_FEE_TYPE = "fee_type";
  @SerializedName(SERIALIZED_NAME_FEE_TYPE)
  private FeeType feeType = FeeType.EVM_EIP_1559;

  public static final String SERIALIZED_NAME_TOKEN_ID = "token_id";
  @SerializedName(SERIALIZED_NAME_TOKEN_ID)
  private String tokenId;

  public static final String SERIALIZED_NAME_SLOW = "slow";
  @SerializedName(SERIALIZED_NAME_SLOW)
  private EstimatedUtxoFeeSlow slow;

  public static final String SERIALIZED_NAME_RECOMMENDED = "recommended";
  @SerializedName(SERIALIZED_NAME_RECOMMENDED)
  private EstimatedUtxoFeeSlow recommended;

  public static final String SERIALIZED_NAME_FAST = "fast";
  @SerializedName(SERIALIZED_NAME_FAST)
  private EstimatedUtxoFeeSlow fast;

  public EstimatedUtxoFee() {
  }

  public EstimatedUtxoFee feeType(FeeType feeType) {
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


  public EstimatedUtxoFee tokenId(String tokenId) {
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


  public EstimatedUtxoFee slow(EstimatedUtxoFeeSlow slow) {
    this.slow = slow;
    return this;
  }

   /**
   * Get slow
   * @return slow
  **/
  @javax.annotation.Nullable
  public EstimatedUtxoFeeSlow getSlow() {
    return slow;
  }

  public void setSlow(EstimatedUtxoFeeSlow slow) {
    this.slow = slow;
  }


  public EstimatedUtxoFee recommended(EstimatedUtxoFeeSlow recommended) {
    this.recommended = recommended;
    return this;
  }

   /**
   * Get recommended
   * @return recommended
  **/
  @javax.annotation.Nonnull
  public EstimatedUtxoFeeSlow getRecommended() {
    return recommended;
  }

  public void setRecommended(EstimatedUtxoFeeSlow recommended) {
    this.recommended = recommended;
  }


  public EstimatedUtxoFee fast(EstimatedUtxoFeeSlow fast) {
    this.fast = fast;
    return this;
  }

   /**
   * Get fast
   * @return fast
  **/
  @javax.annotation.Nullable
  public EstimatedUtxoFeeSlow getFast() {
    return fast;
  }

  public void setFast(EstimatedUtxoFeeSlow fast) {
    this.fast = fast;
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
   * @return the EstimatedUtxoFee instance itself
   */
  public EstimatedUtxoFee putAdditionalProperty(String key, Object value) {
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
    EstimatedUtxoFee estimatedUtxoFee = (EstimatedUtxoFee) o;
    return Objects.equals(this.feeType, estimatedUtxoFee.feeType) &&
        Objects.equals(this.tokenId, estimatedUtxoFee.tokenId) &&
        Objects.equals(this.slow, estimatedUtxoFee.slow) &&
        Objects.equals(this.recommended, estimatedUtxoFee.recommended) &&
        Objects.equals(this.fast, estimatedUtxoFee.fast)&&
        Objects.equals(this.additionalProperties, estimatedUtxoFee.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(feeType, tokenId, slow, recommended, fast, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EstimatedUtxoFee {\n");
    sb.append("    feeType: ").append(toIndentedString(feeType)).append("\n");
    sb.append("    tokenId: ").append(toIndentedString(tokenId)).append("\n");
    sb.append("    slow: ").append(toIndentedString(slow)).append("\n");
    sb.append("    recommended: ").append(toIndentedString(recommended)).append("\n");
    sb.append("    fast: ").append(toIndentedString(fast)).append("\n");
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
    openapiFields.add("fee_type");
    openapiFields.add("token_id");
    openapiFields.add("slow");
    openapiFields.add("recommended");
    openapiFields.add("fast");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("fee_type");
    openapiRequiredFields.add("token_id");
    openapiRequiredFields.add("recommended");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to EstimatedUtxoFee
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EstimatedUtxoFee.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EstimatedUtxoFee is not found in the empty JSON string", EstimatedUtxoFee.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : EstimatedUtxoFee.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `fee_type`
      FeeType.validateJsonElement(jsonObj.get("fee_type"));
      if (!jsonObj.get("token_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `token_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("token_id").toString()));
      }
      // validate the optional field `slow`
      if (jsonObj.get("slow") != null && !jsonObj.get("slow").isJsonNull()) {
        EstimatedUtxoFeeSlow.validateJsonElement(jsonObj.get("slow"));
      }
      // validate the required field `recommended`
      EstimatedUtxoFeeSlow.validateJsonElement(jsonObj.get("recommended"));
      // validate the optional field `fast`
      if (jsonObj.get("fast") != null && !jsonObj.get("fast").isJsonNull()) {
        EstimatedUtxoFeeSlow.validateJsonElement(jsonObj.get("fast"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EstimatedUtxoFee.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EstimatedUtxoFee' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EstimatedUtxoFee> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EstimatedUtxoFee.class));

       return (TypeAdapter<T>) new TypeAdapter<EstimatedUtxoFee>() {
           @Override
           public void write(JsonWriter out, EstimatedUtxoFee value) throws IOException {
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
           public EstimatedUtxoFee read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             EstimatedUtxoFee instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of EstimatedUtxoFee given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EstimatedUtxoFee
  * @throws IOException if the JSON string is invalid with respect to EstimatedUtxoFee
  */
  public static EstimatedUtxoFee fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EstimatedUtxoFee.class);
  }

 /**
  * Convert an instance of EstimatedUtxoFee to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

