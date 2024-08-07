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
 * TransactionTokeApproval
 */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen", 
    comments = "Generator version: 7.6.0"
)
public class TransactionTokeApproval {
  public static final String SERIALIZED_NAME_TOKEN_ID = "token_id";
  @SerializedName(SERIALIZED_NAME_TOKEN_ID)
  private String tokenId;

  public static final String SERIALIZED_NAME_CHAIN_ID = "chain_id";
  @SerializedName(SERIALIZED_NAME_CHAIN_ID)
  private String chainId;

  public static final String SERIALIZED_NAME_ASSET_ID = "asset_id";
  @SerializedName(SERIALIZED_NAME_ASSET_ID)
  private String assetId;

  public static final String SERIALIZED_NAME_SYMBOL = "symbol";
  @SerializedName(SERIALIZED_NAME_SYMBOL)
  private String symbol;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DECIMAL = "decimal";
  @SerializedName(SERIALIZED_NAME_DECIMAL)
  private Integer decimal;

  public static final String SERIALIZED_NAME_ICON_URL = "icon_url";
  @SerializedName(SERIALIZED_NAME_ICON_URL)
  private String iconUrl;

  public static final String SERIALIZED_NAME_TOKEN_ADDRESS = "token_address";
  @SerializedName(SERIALIZED_NAME_TOKEN_ADDRESS)
  private String tokenAddress;

  public static final String SERIALIZED_NAME_FEE_TOKEN_ID = "fee_token_id";
  @SerializedName(SERIALIZED_NAME_FEE_TOKEN_ID)
  private String feeTokenId;

  public static final String SERIALIZED_NAME_CAN_DEPOSIT = "can_deposit";
  @SerializedName(SERIALIZED_NAME_CAN_DEPOSIT)
  private Boolean canDeposit;

  public static final String SERIALIZED_NAME_CAN_WITHDRAW = "can_withdraw";
  @SerializedName(SERIALIZED_NAME_CAN_WITHDRAW)
  private Boolean canWithdraw;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Float amount;

  public static final String SERIALIZED_NAME_SPENDER = "spender";
  @SerializedName(SERIALIZED_NAME_SPENDER)
  private String spender;

  public TransactionTokeApproval() {
  }

  public TransactionTokeApproval tokenId(String tokenId) {
    this.tokenId = tokenId;
    return this;
  }

   /**
   * The token ID, which is the unique identifier of a token. You can retrieve the IDs of all the tokens you can use by calling [List enabled tokens](/v2/api-references/wallets/list-enabled-tokens).
   * @return tokenId
  **/
  @javax.annotation.Nonnull
  public String getTokenId() {
    return tokenId;
  }

  public void setTokenId(String tokenId) {
    this.tokenId = tokenId;
  }


  public TransactionTokeApproval chainId(String chainId) {
    this.chainId = chainId;
    return this;
  }

   /**
   * The ID of the chain on which the token operates.
   * @return chainId
  **/
  @javax.annotation.Nonnull
  public String getChainId() {
    return chainId;
  }

  public void setChainId(String chainId) {
    this.chainId = chainId;
  }


  public TransactionTokeApproval assetId(String assetId) {
    this.assetId = assetId;
    return this;
  }

   /**
   * (This concept applies to Exchange Wallets only) The asset ID. An asset ID is the unique identifier of the asset held within your linked exchange account.
   * @return assetId
  **/
  @javax.annotation.Nullable
  public String getAssetId() {
    return assetId;
  }

  public void setAssetId(String assetId) {
    this.assetId = assetId;
  }


  public TransactionTokeApproval symbol(String symbol) {
    this.symbol = symbol;
    return this;
  }

   /**
   * The token symbol, which is the abbreviated name of a token.
   * @return symbol
  **/
  @javax.annotation.Nullable
  public String getSymbol() {
    return symbol;
  }

  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }


  public TransactionTokeApproval name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The token name, which is the full name of a token.
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public TransactionTokeApproval decimal(Integer decimal) {
    this.decimal = decimal;
    return this;
  }

   /**
   * The token decimal.
   * @return decimal
  **/
  @javax.annotation.Nullable
  public Integer getDecimal() {
    return decimal;
  }

  public void setDecimal(Integer decimal) {
    this.decimal = decimal;
  }


  public TransactionTokeApproval iconUrl(String iconUrl) {
    this.iconUrl = iconUrl;
    return this;
  }

   /**
   * The URL of the token icon.
   * @return iconUrl
  **/
  @javax.annotation.Nullable
  public String getIconUrl() {
    return iconUrl;
  }

  public void setIconUrl(String iconUrl) {
    this.iconUrl = iconUrl;
  }


  public TransactionTokeApproval tokenAddress(String tokenAddress) {
    this.tokenAddress = tokenAddress;
    return this;
  }

   /**
   * The token address, if applicable.
   * @return tokenAddress
  **/
  @javax.annotation.Nullable
  public String getTokenAddress() {
    return tokenAddress;
  }

  public void setTokenAddress(String tokenAddress) {
    this.tokenAddress = tokenAddress;
  }


  public TransactionTokeApproval feeTokenId(String feeTokenId) {
    this.feeTokenId = feeTokenId;
    return this;
  }

   /**
   * The fee token ID. A fee token is the token with which you pay transaction fees.
   * @return feeTokenId
  **/
  @javax.annotation.Nullable
  public String getFeeTokenId() {
    return feeTokenId;
  }

  public void setFeeTokenId(String feeTokenId) {
    this.feeTokenId = feeTokenId;
  }


  public TransactionTokeApproval canDeposit(Boolean canDeposit) {
    this.canDeposit = canDeposit;
    return this;
  }

   /**
   * Whether deposits are enabled for this token.
   * @return canDeposit
  **/
  @javax.annotation.Nullable
  public Boolean getCanDeposit() {
    return canDeposit;
  }

  public void setCanDeposit(Boolean canDeposit) {
    this.canDeposit = canDeposit;
  }


  public TransactionTokeApproval canWithdraw(Boolean canWithdraw) {
    this.canWithdraw = canWithdraw;
    return this;
  }

   /**
   * Whether withdrawals are enabled for this token.
   * @return canWithdraw
  **/
  @javax.annotation.Nullable
  public Boolean getCanWithdraw() {
    return canWithdraw;
  }

  public void setCanWithdraw(Boolean canWithdraw) {
    this.canWithdraw = canWithdraw;
  }


  public TransactionTokeApproval amount(Float amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Transaction value (Note that this is an absolute value. If you trade 1.5 BTC, then the value is 1.5) 
   * @return amount
  **/
  @javax.annotation.Nullable
  public Float getAmount() {
    return amount;
  }

  public void setAmount(Float amount) {
    this.amount = amount;
  }


  public TransactionTokeApproval spender(String spender) {
    this.spender = spender;
    return this;
  }

   /**
   * Spender address
   * @return spender
  **/
  @javax.annotation.Nullable
  public String getSpender() {
    return spender;
  }

  public void setSpender(String spender) {
    this.spender = spender;
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
   * @return the TransactionTokeApproval instance itself
   */
  public TransactionTokeApproval putAdditionalProperty(String key, Object value) {
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
    TransactionTokeApproval transactionTokeApproval = (TransactionTokeApproval) o;
    return Objects.equals(this.tokenId, transactionTokeApproval.tokenId) &&
        Objects.equals(this.chainId, transactionTokeApproval.chainId) &&
        Objects.equals(this.assetId, transactionTokeApproval.assetId) &&
        Objects.equals(this.symbol, transactionTokeApproval.symbol) &&
        Objects.equals(this.name, transactionTokeApproval.name) &&
        Objects.equals(this.decimal, transactionTokeApproval.decimal) &&
        Objects.equals(this.iconUrl, transactionTokeApproval.iconUrl) &&
        Objects.equals(this.tokenAddress, transactionTokeApproval.tokenAddress) &&
        Objects.equals(this.feeTokenId, transactionTokeApproval.feeTokenId) &&
        Objects.equals(this.canDeposit, transactionTokeApproval.canDeposit) &&
        Objects.equals(this.canWithdraw, transactionTokeApproval.canWithdraw) &&
        Objects.equals(this.amount, transactionTokeApproval.amount) &&
        Objects.equals(this.spender, transactionTokeApproval.spender)&&
        Objects.equals(this.additionalProperties, transactionTokeApproval.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tokenId, chainId, assetId, symbol, name, decimal, iconUrl, tokenAddress, feeTokenId, canDeposit, canWithdraw, amount, spender, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionTokeApproval {\n");
    sb.append("    tokenId: ").append(toIndentedString(tokenId)).append("\n");
    sb.append("    chainId: ").append(toIndentedString(chainId)).append("\n");
    sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    decimal: ").append(toIndentedString(decimal)).append("\n");
    sb.append("    iconUrl: ").append(toIndentedString(iconUrl)).append("\n");
    sb.append("    tokenAddress: ").append(toIndentedString(tokenAddress)).append("\n");
    sb.append("    feeTokenId: ").append(toIndentedString(feeTokenId)).append("\n");
    sb.append("    canDeposit: ").append(toIndentedString(canDeposit)).append("\n");
    sb.append("    canWithdraw: ").append(toIndentedString(canWithdraw)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    spender: ").append(toIndentedString(spender)).append("\n");
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
    openapiFields.add("token_id");
    openapiFields.add("chain_id");
    openapiFields.add("asset_id");
    openapiFields.add("symbol");
    openapiFields.add("name");
    openapiFields.add("decimal");
    openapiFields.add("icon_url");
    openapiFields.add("token_address");
    openapiFields.add("fee_token_id");
    openapiFields.add("can_deposit");
    openapiFields.add("can_withdraw");
    openapiFields.add("amount");
    openapiFields.add("spender");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("token_id");
    openapiRequiredFields.add("chain_id");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to TransactionTokeApproval
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TransactionTokeApproval.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TransactionTokeApproval is not found in the empty JSON string", TransactionTokeApproval.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TransactionTokeApproval.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("token_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `token_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("token_id").toString()));
      }
      if (!jsonObj.get("chain_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `chain_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("chain_id").toString()));
      }
      if ((jsonObj.get("asset_id") != null && !jsonObj.get("asset_id").isJsonNull()) && !jsonObj.get("asset_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `asset_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("asset_id").toString()));
      }
      if ((jsonObj.get("symbol") != null && !jsonObj.get("symbol").isJsonNull()) && !jsonObj.get("symbol").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `symbol` to be a primitive type in the JSON string but got `%s`", jsonObj.get("symbol").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("icon_url") != null && !jsonObj.get("icon_url").isJsonNull()) && !jsonObj.get("icon_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `icon_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("icon_url").toString()));
      }
      if ((jsonObj.get("token_address") != null && !jsonObj.get("token_address").isJsonNull()) && !jsonObj.get("token_address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `token_address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("token_address").toString()));
      }
      if ((jsonObj.get("fee_token_id") != null && !jsonObj.get("fee_token_id").isJsonNull()) && !jsonObj.get("fee_token_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fee_token_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fee_token_id").toString()));
      }
      if ((jsonObj.get("spender") != null && !jsonObj.get("spender").isJsonNull()) && !jsonObj.get("spender").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `spender` to be a primitive type in the JSON string but got `%s`", jsonObj.get("spender").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TransactionTokeApproval.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TransactionTokeApproval' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TransactionTokeApproval> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TransactionTokeApproval.class));

       return (TypeAdapter<T>) new TypeAdapter<TransactionTokeApproval>() {
           @Override
           public void write(JsonWriter out, TransactionTokeApproval value) throws IOException {
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
           public TransactionTokeApproval read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             TransactionTokeApproval instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of TransactionTokeApproval given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TransactionTokeApproval
  * @throws IOException if the JSON string is invalid with respect to TransactionTokeApproval
  */
  public static TransactionTokeApproval fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TransactionTokeApproval.class);
  }

 /**
  * Convert an instance of TransactionTokeApproval to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

