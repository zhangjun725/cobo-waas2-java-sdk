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
 * The UTXO information.
 */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen", 
    comments = "Generator version: 7.6.0"
)
public class UTXO {
  public static final String SERIALIZED_NAME_TX_HASH = "tx_hash";
  @SerializedName(SERIALIZED_NAME_TX_HASH)
  private String txHash;

  public static final String SERIALIZED_NAME_VOUT_N = "vout_n";
  @SerializedName(SERIALIZED_NAME_VOUT_N)
  private Integer voutN;

  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private String address;

  public static final String SERIALIZED_NAME_TOKEN_ID = "token_id";
  @SerializedName(SERIALIZED_NAME_TOKEN_ID)
  private String tokenId;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;

  public static final String SERIALIZED_NAME_IS_COINBASE = "is_coinbase";
  @SerializedName(SERIALIZED_NAME_IS_COINBASE)
  private Boolean isCoinbase;

  public static final String SERIALIZED_NAME_IS_LOCKED = "is_locked";
  @SerializedName(SERIALIZED_NAME_IS_LOCKED)
  private Boolean isLocked;

  public static final String SERIALIZED_NAME_CONFIRMED_NUMBER = "confirmed_number";
  @SerializedName(SERIALIZED_NAME_CONFIRMED_NUMBER)
  private Integer confirmedNumber;

  public UTXO() {
  }

  public UTXO txHash(String txHash) {
    this.txHash = txHash;
    return this;
  }

   /**
   * The transaction hash of the UTXO.
   * @return txHash
  **/
  @javax.annotation.Nullable
  public String getTxHash() {
    return txHash;
  }

  public void setTxHash(String txHash) {
    this.txHash = txHash;
  }


  public UTXO voutN(Integer voutN) {
    this.voutN = voutN;
    return this;
  }

   /**
   * The output index of the UTXO.
   * @return voutN
  **/
  @javax.annotation.Nullable
  public Integer getVoutN() {
    return voutN;
  }

  public void setVoutN(Integer voutN) {
    this.voutN = voutN;
  }


  public UTXO address(String address) {
    this.address = address;
    return this;
  }

   /**
   * The address of the UTXO.
   * @return address
  **/
  @javax.annotation.Nullable
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }


  public UTXO tokenId(String tokenId) {
    this.tokenId = tokenId;
    return this;
  }

   /**
   * The token ID, which is the unique identifier of a token.
   * @return tokenId
  **/
  @javax.annotation.Nullable
  public String getTokenId() {
    return tokenId;
  }

  public void setTokenId(String tokenId) {
    this.tokenId = tokenId;
  }


  public UTXO value(String value) {
    this.value = value;
    return this;
  }

   /**
   * The value of the UTXO.
   * @return value
  **/
  @javax.annotation.Nullable
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


  public UTXO isCoinbase(Boolean isCoinbase) {
    this.isCoinbase = isCoinbase;
    return this;
  }

   /**
   * Whether the UTXO comes from a coinbase transaction.
   * @return isCoinbase
  **/
  @javax.annotation.Nullable
  public Boolean getIsCoinbase() {
    return isCoinbase;
  }

  public void setIsCoinbase(Boolean isCoinbase) {
    this.isCoinbase = isCoinbase;
  }


  public UTXO isLocked(Boolean isLocked) {
    this.isLocked = isLocked;
    return this;
  }

   /**
   * Whether the UTXO is locked.
   * @return isLocked
  **/
  @javax.annotation.Nullable
  public Boolean getIsLocked() {
    return isLocked;
  }

  public void setIsLocked(Boolean isLocked) {
    this.isLocked = isLocked;
  }


  public UTXO confirmedNumber(Integer confirmedNumber) {
    this.confirmedNumber = confirmedNumber;
    return this;
  }

   /**
   * The number of confirmations for the UTXO.
   * @return confirmedNumber
  **/
  @javax.annotation.Nullable
  public Integer getConfirmedNumber() {
    return confirmedNumber;
  }

  public void setConfirmedNumber(Integer confirmedNumber) {
    this.confirmedNumber = confirmedNumber;
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
   * @return the UTXO instance itself
   */
  public UTXO putAdditionalProperty(String key, Object value) {
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
    UTXO UTXO = (UTXO) o;
    return Objects.equals(this.txHash, UTXO.txHash) &&
        Objects.equals(this.voutN, UTXO.voutN) &&
        Objects.equals(this.address, UTXO.address) &&
        Objects.equals(this.tokenId, UTXO.tokenId) &&
        Objects.equals(this.value, UTXO.value) &&
        Objects.equals(this.isCoinbase, UTXO.isCoinbase) &&
        Objects.equals(this.isLocked, UTXO.isLocked) &&
        Objects.equals(this.confirmedNumber, UTXO.confirmedNumber)&&
        Objects.equals(this.additionalProperties, UTXO.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(txHash, voutN, address, tokenId, value, isCoinbase, isLocked, confirmedNumber, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UTXO {\n");
    sb.append("    txHash: ").append(toIndentedString(txHash)).append("\n");
    sb.append("    voutN: ").append(toIndentedString(voutN)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    tokenId: ").append(toIndentedString(tokenId)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    isCoinbase: ").append(toIndentedString(isCoinbase)).append("\n");
    sb.append("    isLocked: ").append(toIndentedString(isLocked)).append("\n");
    sb.append("    confirmedNumber: ").append(toIndentedString(confirmedNumber)).append("\n");
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
    openapiFields.add("tx_hash");
    openapiFields.add("vout_n");
    openapiFields.add("address");
    openapiFields.add("token_id");
    openapiFields.add("value");
    openapiFields.add("is_coinbase");
    openapiFields.add("is_locked");
    openapiFields.add("confirmed_number");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to UTXO
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UTXO.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UTXO is not found in the empty JSON string", UTXO.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("tx_hash") != null && !jsonObj.get("tx_hash").isJsonNull()) && !jsonObj.get("tx_hash").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tx_hash` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tx_hash").toString()));
      }
      if ((jsonObj.get("address") != null && !jsonObj.get("address").isJsonNull()) && !jsonObj.get("address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("address").toString()));
      }
      if ((jsonObj.get("token_id") != null && !jsonObj.get("token_id").isJsonNull()) && !jsonObj.get("token_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `token_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("token_id").toString()));
      }
      if ((jsonObj.get("value") != null && !jsonObj.get("value").isJsonNull()) && !jsonObj.get("value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("value").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UTXO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UTXO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UTXO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UTXO.class));

       return (TypeAdapter<T>) new TypeAdapter<UTXO>() {
           @Override
           public void write(JsonWriter out, UTXO value) throws IOException {
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
           public UTXO read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             UTXO instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of UTXO given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UTXO
  * @throws IOException if the JSON string is invalid with respect to UTXO
  */
  public static UTXO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UTXO.class);
  }

 /**
  * Convert an instance of UTXO to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

