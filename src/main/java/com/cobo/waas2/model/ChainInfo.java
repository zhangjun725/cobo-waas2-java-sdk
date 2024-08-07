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
 * The chain information.
 */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen", 
    comments = "Generator version: 7.6.0"
)
public class ChainInfo {
  public static final String SERIALIZED_NAME_CHAIN_ID = "chain_id";
  @SerializedName(SERIALIZED_NAME_CHAIN_ID)
  private String chainId;

  public static final String SERIALIZED_NAME_SYMBOL = "symbol";
  @SerializedName(SERIALIZED_NAME_SYMBOL)
  private String symbol;

  public static final String SERIALIZED_NAME_ICON_URL = "icon_url";
  @SerializedName(SERIALIZED_NAME_ICON_URL)
  private String iconUrl;

  public static final String SERIALIZED_NAME_EXPLORER_TX_URL = "explorer_tx_url";
  @SerializedName(SERIALIZED_NAME_EXPLORER_TX_URL)
  private String explorerTxUrl;

  public static final String SERIALIZED_NAME_EXPLORER_ADDRESS_URL = "explorer_address_url";
  @SerializedName(SERIALIZED_NAME_EXPLORER_ADDRESS_URL)
  private String explorerAddressUrl;

  public static final String SERIALIZED_NAME_REQUIRE_MEMO = "require_memo";
  @SerializedName(SERIALIZED_NAME_REQUIRE_MEMO)
  private Boolean requireMemo;

  public ChainInfo() {
  }

  public ChainInfo chainId(String chainId) {
    this.chainId = chainId;
    return this;
  }

   /**
   * The chain ID, which is the unique identifier of a blockchain. You can retrieve the IDs of all the chains you can use by calling [List enabled chains](/v2/api-references/wallets/list-enabled-chains).
   * @return chainId
  **/
  @javax.annotation.Nonnull
  public String getChainId() {
    return chainId;
  }

  public void setChainId(String chainId) {
    this.chainId = chainId;
  }


  public ChainInfo symbol(String symbol) {
    this.symbol = symbol;
    return this;
  }

   /**
   * The chain symbol, which is the abbreviated name of a chain.
   * @return symbol
  **/
  @javax.annotation.Nullable
  public String getSymbol() {
    return symbol;
  }

  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }


  public ChainInfo iconUrl(String iconUrl) {
    this.iconUrl = iconUrl;
    return this;
  }

   /**
   * The URL of the chain icon.
   * @return iconUrl
  **/
  @javax.annotation.Nullable
  public String getIconUrl() {
    return iconUrl;
  }

  public void setIconUrl(String iconUrl) {
    this.iconUrl = iconUrl;
  }


  public ChainInfo explorerTxUrl(String explorerTxUrl) {
    this.explorerTxUrl = explorerTxUrl;
    return this;
  }

   /**
   * The transaction URL pattern on the blockchain explorer. You can use it to concatenate the transaction URLs.
   * @return explorerTxUrl
  **/
  @javax.annotation.Nullable
  public String getExplorerTxUrl() {
    return explorerTxUrl;
  }

  public void setExplorerTxUrl(String explorerTxUrl) {
    this.explorerTxUrl = explorerTxUrl;
  }


  public ChainInfo explorerAddressUrl(String explorerAddressUrl) {
    this.explorerAddressUrl = explorerAddressUrl;
    return this;
  }

   /**
   * The address URL pattern on the blockchain explorer. You can use it to concatenate the address URLs.
   * @return explorerAddressUrl
  **/
  @javax.annotation.Nullable
  public String getExplorerAddressUrl() {
    return explorerAddressUrl;
  }

  public void setExplorerAddressUrl(String explorerAddressUrl) {
    this.explorerAddressUrl = explorerAddressUrl;
  }


  public ChainInfo requireMemo(Boolean requireMemo) {
    this.requireMemo = requireMemo;
    return this;
  }

   /**
   * Whether the chain requires a memo.
   * @return requireMemo
  **/
  @javax.annotation.Nullable
  public Boolean getRequireMemo() {
    return requireMemo;
  }

  public void setRequireMemo(Boolean requireMemo) {
    this.requireMemo = requireMemo;
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
   * @return the ChainInfo instance itself
   */
  public ChainInfo putAdditionalProperty(String key, Object value) {
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
    ChainInfo chainInfo = (ChainInfo) o;
    return Objects.equals(this.chainId, chainInfo.chainId) &&
        Objects.equals(this.symbol, chainInfo.symbol) &&
        Objects.equals(this.iconUrl, chainInfo.iconUrl) &&
        Objects.equals(this.explorerTxUrl, chainInfo.explorerTxUrl) &&
        Objects.equals(this.explorerAddressUrl, chainInfo.explorerAddressUrl) &&
        Objects.equals(this.requireMemo, chainInfo.requireMemo)&&
        Objects.equals(this.additionalProperties, chainInfo.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chainId, symbol, iconUrl, explorerTxUrl, explorerAddressUrl, requireMemo, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChainInfo {\n");
    sb.append("    chainId: ").append(toIndentedString(chainId)).append("\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    iconUrl: ").append(toIndentedString(iconUrl)).append("\n");
    sb.append("    explorerTxUrl: ").append(toIndentedString(explorerTxUrl)).append("\n");
    sb.append("    explorerAddressUrl: ").append(toIndentedString(explorerAddressUrl)).append("\n");
    sb.append("    requireMemo: ").append(toIndentedString(requireMemo)).append("\n");
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
    openapiFields.add("chain_id");
    openapiFields.add("symbol");
    openapiFields.add("icon_url");
    openapiFields.add("explorer_tx_url");
    openapiFields.add("explorer_address_url");
    openapiFields.add("require_memo");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("chain_id");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ChainInfo
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ChainInfo.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ChainInfo is not found in the empty JSON string", ChainInfo.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ChainInfo.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("chain_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `chain_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("chain_id").toString()));
      }
      if ((jsonObj.get("symbol") != null && !jsonObj.get("symbol").isJsonNull()) && !jsonObj.get("symbol").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `symbol` to be a primitive type in the JSON string but got `%s`", jsonObj.get("symbol").toString()));
      }
      if ((jsonObj.get("icon_url") != null && !jsonObj.get("icon_url").isJsonNull()) && !jsonObj.get("icon_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `icon_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("icon_url").toString()));
      }
      if ((jsonObj.get("explorer_tx_url") != null && !jsonObj.get("explorer_tx_url").isJsonNull()) && !jsonObj.get("explorer_tx_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `explorer_tx_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("explorer_tx_url").toString()));
      }
      if ((jsonObj.get("explorer_address_url") != null && !jsonObj.get("explorer_address_url").isJsonNull()) && !jsonObj.get("explorer_address_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `explorer_address_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("explorer_address_url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ChainInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ChainInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ChainInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ChainInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<ChainInfo>() {
           @Override
           public void write(JsonWriter out, ChainInfo value) throws IOException {
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
           public ChainInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             ChainInfo instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ChainInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ChainInfo
  * @throws IOException if the JSON string is invalid with respect to ChainInfo
  */
  public static ChainInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ChainInfo.class);
  }

 /**
  * Convert an instance of ChainInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

