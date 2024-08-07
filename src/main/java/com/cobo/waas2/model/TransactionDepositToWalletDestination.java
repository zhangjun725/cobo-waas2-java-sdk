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
import com.cobo.waas2.model.ExchangeId;
import com.cobo.waas2.model.TransactionDestinationType;
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
 * Information about the transaction destination type &#x60;DepositToWallet&#x60;. 
 */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen", 
    comments = "Generator version: 7.6.0"
)
public class TransactionDepositToWalletDestination {
  public static final String SERIALIZED_NAME_DESTINATION_TYPE = "destination_type";
  @SerializedName(SERIALIZED_NAME_DESTINATION_TYPE)
  private TransactionDestinationType destinationType;

  public static final String SERIALIZED_NAME_WALLET_ID = "wallet_id";
  @SerializedName(SERIALIZED_NAME_WALLET_ID)
  private UUID walletId;

  public static final String SERIALIZED_NAME_WALLET_TYPE = "wallet_type";
  @SerializedName(SERIALIZED_NAME_WALLET_TYPE)
  private WalletType walletType;

  public static final String SERIALIZED_NAME_WALLET_SUBTYPE = "wallet_subtype";
  @SerializedName(SERIALIZED_NAME_WALLET_SUBTYPE)
  private WalletSubtype walletSubtype;

  public static final String SERIALIZED_NAME_SUB_WALLET_ID = "sub_wallet_id";
  @SerializedName(SERIALIZED_NAME_SUB_WALLET_ID)
  private String subWalletId;

  public static final String SERIALIZED_NAME_EXCHANGE_ID = "exchange_id";
  @SerializedName(SERIALIZED_NAME_EXCHANGE_ID)
  private ExchangeId exchangeId;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private String amount;

  public TransactionDepositToWalletDestination() {
  }

  public TransactionDepositToWalletDestination destinationType(TransactionDestinationType destinationType) {
    this.destinationType = destinationType;
    return this;
  }

   /**
   * Get destinationType
   * @return destinationType
  **/
  @javax.annotation.Nonnull
  public TransactionDestinationType getDestinationType() {
    return destinationType;
  }

  public void setDestinationType(TransactionDestinationType destinationType) {
    this.destinationType = destinationType;
  }


  public TransactionDepositToWalletDestination walletId(UUID walletId) {
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


  public TransactionDepositToWalletDestination walletType(WalletType walletType) {
    this.walletType = walletType;
    return this;
  }

   /**
   * Get walletType
   * @return walletType
  **/
  @javax.annotation.Nonnull
  public WalletType getWalletType() {
    return walletType;
  }

  public void setWalletType(WalletType walletType) {
    this.walletType = walletType;
  }


  public TransactionDepositToWalletDestination walletSubtype(WalletSubtype walletSubtype) {
    this.walletSubtype = walletSubtype;
    return this;
  }

   /**
   * Get walletSubtype
   * @return walletSubtype
  **/
  @javax.annotation.Nonnull
  public WalletSubtype getWalletSubtype() {
    return walletSubtype;
  }

  public void setWalletSubtype(WalletSubtype walletSubtype) {
    this.walletSubtype = walletSubtype;
  }


  public TransactionDepositToWalletDestination subWalletId(String subWalletId) {
    this.subWalletId = subWalletId;
    return this;
  }

   /**
   * The exchange trading account or the sub-wallet ID.
   * @return subWalletId
  **/
  @javax.annotation.Nullable
  public String getSubWalletId() {
    return subWalletId;
  }

  public void setSubWalletId(String subWalletId) {
    this.subWalletId = subWalletId;
  }


  public TransactionDepositToWalletDestination exchangeId(ExchangeId exchangeId) {
    this.exchangeId = exchangeId;
    return this;
  }

   /**
   * Get exchangeId
   * @return exchangeId
  **/
  @javax.annotation.Nullable
  public ExchangeId getExchangeId() {
    return exchangeId;
  }

  public void setExchangeId(ExchangeId exchangeId) {
    this.exchangeId = exchangeId;
  }


  public TransactionDepositToWalletDestination amount(String amount) {
    this.amount = amount;
    return this;
  }

   /**
   * The quantity of the token in the transaction. For example, if you trade 1.5 ETH, then the value is &#x60;1.5&#x60;. 
   * @return amount
  **/
  @javax.annotation.Nonnull
  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
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
   * @return the TransactionDepositToWalletDestination instance itself
   */
  public TransactionDepositToWalletDestination putAdditionalProperty(String key, Object value) {
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
    TransactionDepositToWalletDestination transactionDepositToWalletDestination = (TransactionDepositToWalletDestination) o;
    return Objects.equals(this.destinationType, transactionDepositToWalletDestination.destinationType) &&
        Objects.equals(this.walletId, transactionDepositToWalletDestination.walletId) &&
        Objects.equals(this.walletType, transactionDepositToWalletDestination.walletType) &&
        Objects.equals(this.walletSubtype, transactionDepositToWalletDestination.walletSubtype) &&
        Objects.equals(this.subWalletId, transactionDepositToWalletDestination.subWalletId) &&
        Objects.equals(this.exchangeId, transactionDepositToWalletDestination.exchangeId) &&
        Objects.equals(this.amount, transactionDepositToWalletDestination.amount)&&
        Objects.equals(this.additionalProperties, transactionDepositToWalletDestination.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(destinationType, walletId, walletType, walletSubtype, subWalletId, exchangeId, amount, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionDepositToWalletDestination {\n");
    sb.append("    destinationType: ").append(toIndentedString(destinationType)).append("\n");
    sb.append("    walletId: ").append(toIndentedString(walletId)).append("\n");
    sb.append("    walletType: ").append(toIndentedString(walletType)).append("\n");
    sb.append("    walletSubtype: ").append(toIndentedString(walletSubtype)).append("\n");
    sb.append("    subWalletId: ").append(toIndentedString(subWalletId)).append("\n");
    sb.append("    exchangeId: ").append(toIndentedString(exchangeId)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
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
    openapiFields.add("destination_type");
    openapiFields.add("wallet_id");
    openapiFields.add("wallet_type");
    openapiFields.add("wallet_subtype");
    openapiFields.add("sub_wallet_id");
    openapiFields.add("exchange_id");
    openapiFields.add("amount");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("destination_type");
    openapiRequiredFields.add("wallet_id");
    openapiRequiredFields.add("wallet_type");
    openapiRequiredFields.add("wallet_subtype");
    openapiRequiredFields.add("amount");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to TransactionDepositToWalletDestination
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TransactionDepositToWalletDestination.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TransactionDepositToWalletDestination is not found in the empty JSON string", TransactionDepositToWalletDestination.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TransactionDepositToWalletDestination.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `destination_type`
      TransactionDestinationType.validateJsonElement(jsonObj.get("destination_type"));
      if (!jsonObj.get("wallet_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `wallet_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("wallet_id").toString()));
      }
      // validate the required field `wallet_type`
      WalletType.validateJsonElement(jsonObj.get("wallet_type"));
      // validate the required field `wallet_subtype`
      WalletSubtype.validateJsonElement(jsonObj.get("wallet_subtype"));
      if ((jsonObj.get("sub_wallet_id") != null && !jsonObj.get("sub_wallet_id").isJsonNull()) && !jsonObj.get("sub_wallet_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sub_wallet_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sub_wallet_id").toString()));
      }
      // validate the optional field `exchange_id`
      if (jsonObj.get("exchange_id") != null && !jsonObj.get("exchange_id").isJsonNull()) {
        ExchangeId.validateJsonElement(jsonObj.get("exchange_id"));
      }
      if (!jsonObj.get("amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("amount").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TransactionDepositToWalletDestination.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TransactionDepositToWalletDestination' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TransactionDepositToWalletDestination> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TransactionDepositToWalletDestination.class));

       return (TypeAdapter<T>) new TypeAdapter<TransactionDepositToWalletDestination>() {
           @Override
           public void write(JsonWriter out, TransactionDepositToWalletDestination value) throws IOException {
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
           public TransactionDepositToWalletDestination read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             TransactionDepositToWalletDestination instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of TransactionDepositToWalletDestination given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TransactionDepositToWalletDestination
  * @throws IOException if the JSON string is invalid with respect to TransactionDepositToWalletDestination
  */
  public static TransactionDepositToWalletDestination fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TransactionDepositToWalletDestination.class);
  }

 /**
  * Convert an instance of TransactionDepositToWalletDestination to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

