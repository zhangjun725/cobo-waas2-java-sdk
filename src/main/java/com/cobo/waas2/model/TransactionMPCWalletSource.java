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
import com.cobo.waas2.model.TransactionSourceType;
import com.cobo.waas2.model.TransactionUtxo;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

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
 * Information about the transaction source type &#x60;Org-Controlled&#x60; and &#x60;User-Controlled&#x60;. Refer to [Transaction sources and destinations](/v2/guides/sources-and-destinations) for details.  Switch between the tabs to display the properties for different transaction sources. 
 */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen", 
    comments = "Generator version: 7.6.0"
)
public class TransactionMPCWalletSource {
  public static final String SERIALIZED_NAME_SOURCE_TYPE = "source_type";
  @SerializedName(SERIALIZED_NAME_SOURCE_TYPE)
  private TransactionSourceType sourceType;

  public static final String SERIALIZED_NAME_WALLET_ID = "wallet_id";
  @SerializedName(SERIALIZED_NAME_WALLET_ID)
  private UUID walletId;

  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private String address;

  public static final String SERIALIZED_NAME_INCLUDED_UTXOS = "included_utxos";
  @SerializedName(SERIALIZED_NAME_INCLUDED_UTXOS)
  private List<TransactionUtxo> includedUtxos = new ArrayList<>();

  public static final String SERIALIZED_NAME_EXCLUDED_UTXOS = "excluded_utxos";
  @SerializedName(SERIALIZED_NAME_EXCLUDED_UTXOS)
  private List<TransactionUtxo> excludedUtxos = new ArrayList<>();

  public static final String SERIALIZED_NAME_SIGNER_KEY_SHARE_HOLDER_GROUP_ID = "signer_key_share_holder_group_id";
  @SerializedName(SERIALIZED_NAME_SIGNER_KEY_SHARE_HOLDER_GROUP_ID)
  private String signerKeyShareHolderGroupId;

  public TransactionMPCWalletSource() {
  }

  public TransactionMPCWalletSource sourceType(TransactionSourceType sourceType) {
    this.sourceType = sourceType;
    return this;
  }

   /**
   * Get sourceType
   * @return sourceType
  **/
  @javax.annotation.Nonnull
  public TransactionSourceType getSourceType() {
    return sourceType;
  }

  public void setSourceType(TransactionSourceType sourceType) {
    this.sourceType = sourceType;
  }


  public TransactionMPCWalletSource walletId(UUID walletId) {
    this.walletId = walletId;
    return this;
  }

   /**
   * The wallet ID.
   * @return walletId
  **/
  @javax.annotation.Nonnull
  public UUID getWalletId() {
    return walletId;
  }

  public void setWalletId(UUID walletId) {
    this.walletId = walletId;
  }


  public TransactionMPCWalletSource address(String address) {
    this.address = address;
    return this;
  }

   /**
   * The wallet address.
   * @return address
  **/
  @javax.annotation.Nullable
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }


  public TransactionMPCWalletSource includedUtxos(List<TransactionUtxo> includedUtxos) {
    this.includedUtxos = includedUtxos;
    return this;
  }

  public TransactionMPCWalletSource addIncludedUtxosItem(TransactionUtxo includedUtxosItem) {
    if (this.includedUtxos == null) {
      this.includedUtxos = new ArrayList<>();
    }
    this.includedUtxos.add(includedUtxosItem);
    return this;
  }

   /**
   * Get includedUtxos
   * @return includedUtxos
  **/
  @javax.annotation.Nullable
  public List<TransactionUtxo> getIncludedUtxos() {
    return includedUtxos;
  }

  public void setIncludedUtxos(List<TransactionUtxo> includedUtxos) {
    this.includedUtxos = includedUtxos;
  }


  public TransactionMPCWalletSource excludedUtxos(List<TransactionUtxo> excludedUtxos) {
    this.excludedUtxos = excludedUtxos;
    return this;
  }

  public TransactionMPCWalletSource addExcludedUtxosItem(TransactionUtxo excludedUtxosItem) {
    if (this.excludedUtxos == null) {
      this.excludedUtxos = new ArrayList<>();
    }
    this.excludedUtxos.add(excludedUtxosItem);
    return this;
  }

   /**
   * Get excludedUtxos
   * @return excludedUtxos
  **/
  @javax.annotation.Nullable
  public List<TransactionUtxo> getExcludedUtxos() {
    return excludedUtxos;
  }

  public void setExcludedUtxos(List<TransactionUtxo> excludedUtxos) {
    this.excludedUtxos = excludedUtxos;
  }


  public TransactionMPCWalletSource signerKeyShareHolderGroupId(String signerKeyShareHolderGroupId) {
    this.signerKeyShareHolderGroupId = signerKeyShareHolderGroupId;
    return this;
  }

   /**
   * The ID of the key share holder group that is selected to sign the transaction.
   * @return signerKeyShareHolderGroupId
  **/
  @javax.annotation.Nullable
  public String getSignerKeyShareHolderGroupId() {
    return signerKeyShareHolderGroupId;
  }

  public void setSignerKeyShareHolderGroupId(String signerKeyShareHolderGroupId) {
    this.signerKeyShareHolderGroupId = signerKeyShareHolderGroupId;
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
   * @return the TransactionMPCWalletSource instance itself
   */
  public TransactionMPCWalletSource putAdditionalProperty(String key, Object value) {
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
    TransactionMPCWalletSource transactionMPCWalletSource = (TransactionMPCWalletSource) o;
    return Objects.equals(this.sourceType, transactionMPCWalletSource.sourceType) &&
        Objects.equals(this.walletId, transactionMPCWalletSource.walletId) &&
        Objects.equals(this.address, transactionMPCWalletSource.address) &&
        Objects.equals(this.includedUtxos, transactionMPCWalletSource.includedUtxos) &&
        Objects.equals(this.excludedUtxos, transactionMPCWalletSource.excludedUtxos) &&
        Objects.equals(this.signerKeyShareHolderGroupId, transactionMPCWalletSource.signerKeyShareHolderGroupId)&&
        Objects.equals(this.additionalProperties, transactionMPCWalletSource.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceType, walletId, address, includedUtxos, excludedUtxos, signerKeyShareHolderGroupId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionMPCWalletSource {\n");
    sb.append("    sourceType: ").append(toIndentedString(sourceType)).append("\n");
    sb.append("    walletId: ").append(toIndentedString(walletId)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    includedUtxos: ").append(toIndentedString(includedUtxos)).append("\n");
    sb.append("    excludedUtxos: ").append(toIndentedString(excludedUtxos)).append("\n");
    sb.append("    signerKeyShareHolderGroupId: ").append(toIndentedString(signerKeyShareHolderGroupId)).append("\n");
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
    openapiFields.add("source_type");
    openapiFields.add("wallet_id");
    openapiFields.add("address");
    openapiFields.add("included_utxos");
    openapiFields.add("excluded_utxos");
    openapiFields.add("signer_key_share_holder_group_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("source_type");
    openapiRequiredFields.add("wallet_id");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to TransactionMPCWalletSource
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TransactionMPCWalletSource.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TransactionMPCWalletSource is not found in the empty JSON string", TransactionMPCWalletSource.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TransactionMPCWalletSource.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `source_type`
      TransactionSourceType.validateJsonElement(jsonObj.get("source_type"));
      if (!jsonObj.get("wallet_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `wallet_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("wallet_id").toString()));
      }
      if ((jsonObj.get("address") != null && !jsonObj.get("address").isJsonNull()) && !jsonObj.get("address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("address").toString()));
      }
      if (jsonObj.get("included_utxos") != null && !jsonObj.get("included_utxos").isJsonNull()) {
        JsonArray jsonArrayincludedUtxos = jsonObj.getAsJsonArray("included_utxos");
        if (jsonArrayincludedUtxos != null) {
          // ensure the json data is an array
          if (!jsonObj.get("included_utxos").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `included_utxos` to be an array in the JSON string but got `%s`", jsonObj.get("included_utxos").toString()));
          }

          // validate the optional field `included_utxos` (array)
          for (int i = 0; i < jsonArrayincludedUtxos.size(); i++) {
            TransactionUtxo.validateJsonElement(jsonArrayincludedUtxos.get(i));
          };
        }
      }
      if (jsonObj.get("excluded_utxos") != null && !jsonObj.get("excluded_utxos").isJsonNull()) {
        JsonArray jsonArrayexcludedUtxos = jsonObj.getAsJsonArray("excluded_utxos");
        if (jsonArrayexcludedUtxos != null) {
          // ensure the json data is an array
          if (!jsonObj.get("excluded_utxos").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `excluded_utxos` to be an array in the JSON string but got `%s`", jsonObj.get("excluded_utxos").toString()));
          }

          // validate the optional field `excluded_utxos` (array)
          for (int i = 0; i < jsonArrayexcludedUtxos.size(); i++) {
            TransactionUtxo.validateJsonElement(jsonArrayexcludedUtxos.get(i));
          };
        }
      }
      if ((jsonObj.get("signer_key_share_holder_group_id") != null && !jsonObj.get("signer_key_share_holder_group_id").isJsonNull()) && !jsonObj.get("signer_key_share_holder_group_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `signer_key_share_holder_group_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("signer_key_share_holder_group_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TransactionMPCWalletSource.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TransactionMPCWalletSource' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TransactionMPCWalletSource> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TransactionMPCWalletSource.class));

       return (TypeAdapter<T>) new TypeAdapter<TransactionMPCWalletSource>() {
           @Override
           public void write(JsonWriter out, TransactionMPCWalletSource value) throws IOException {
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
           public TransactionMPCWalletSource read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             TransactionMPCWalletSource instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of TransactionMPCWalletSource given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TransactionMPCWalletSource
  * @throws IOException if the JSON string is invalid with respect to TransactionMPCWalletSource
  */
  public static TransactionMPCWalletSource fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TransactionMPCWalletSource.class);
  }

 /**
  * Convert an instance of TransactionMPCWalletSource to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

