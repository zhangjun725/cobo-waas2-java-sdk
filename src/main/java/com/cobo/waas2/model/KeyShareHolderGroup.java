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
import com.cobo.waas2.model.KeyShareHolder;
import com.cobo.waas2.model.KeyShareHolderGroupStatus;
import com.cobo.waas2.model.KeyShareHolderGroupType;
import com.cobo.waas2.model.TSSGroups;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
 * The data for key share holder group information.
 */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen", 
    comments = "Generator version: 7.6.0"
)
public class KeyShareHolderGroup {
  public static final String SERIALIZED_NAME_KEY_SHARE_HOLDER_GROUP_ID = "key_share_holder_group_id";
  @SerializedName(SERIALIZED_NAME_KEY_SHARE_HOLDER_GROUP_ID)
  private String keyShareHolderGroupId;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private KeyShareHolderGroupType type;

  public static final String SERIALIZED_NAME_TSS_KEY_SHARE_GROUPS = "tss_key_share_groups";
  @SerializedName(SERIALIZED_NAME_TSS_KEY_SHARE_GROUPS)
  private List<TSSGroups> tssKeyShareGroups = new ArrayList<>();

  public static final String SERIALIZED_NAME_KEY_SHARE_HOLDERS = "key_share_holders";
  @SerializedName(SERIALIZED_NAME_KEY_SHARE_HOLDERS)
  private List<KeyShareHolder> keyShareHolders = new ArrayList<>();

  public static final String SERIALIZED_NAME_PARTICIPANTS = "participants";
  @SerializedName(SERIALIZED_NAME_PARTICIPANTS)
  private Integer participants;

  public static final String SERIALIZED_NAME_THRESHOLD = "threshold";
  @SerializedName(SERIALIZED_NAME_THRESHOLD)
  private Integer threshold;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private KeyShareHolderGroupStatus status;

  public static final String SERIALIZED_NAME_CREATED_TIMESTAMP = "created_timestamp";
  @SerializedName(SERIALIZED_NAME_CREATED_TIMESTAMP)
  private Long createdTimestamp;

  public KeyShareHolderGroup() {
  }

  public KeyShareHolderGroup keyShareHolderGroupId(String keyShareHolderGroupId) {
    this.keyShareHolderGroupId = keyShareHolderGroupId;
    return this;
  }

   /**
   * The key share holder group ID.
   * @return keyShareHolderGroupId
  **/
  @javax.annotation.Nullable
  public String getKeyShareHolderGroupId() {
    return keyShareHolderGroupId;
  }

  public void setKeyShareHolderGroupId(String keyShareHolderGroupId) {
    this.keyShareHolderGroupId = keyShareHolderGroupId;
  }


  public KeyShareHolderGroup type(KeyShareHolderGroupType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  public KeyShareHolderGroupType getType() {
    return type;
  }

  public void setType(KeyShareHolderGroupType type) {
    this.type = type;
  }


  public KeyShareHolderGroup tssKeyShareGroups(List<TSSGroups> tssKeyShareGroups) {
    this.tssKeyShareGroups = tssKeyShareGroups;
    return this;
  }

  public KeyShareHolderGroup addTssKeyShareGroupsItem(TSSGroups tssKeyShareGroupsItem) {
    if (this.tssKeyShareGroups == null) {
      this.tssKeyShareGroups = new ArrayList<>();
    }
    this.tssKeyShareGroups.add(tssKeyShareGroupsItem);
    return this;
  }

   /**
   * Get tssKeyShareGroups
   * @return tssKeyShareGroups
  **/
  @javax.annotation.Nullable
  public List<TSSGroups> getTssKeyShareGroups() {
    return tssKeyShareGroups;
  }

  public void setTssKeyShareGroups(List<TSSGroups> tssKeyShareGroups) {
    this.tssKeyShareGroups = tssKeyShareGroups;
  }


  public KeyShareHolderGroup keyShareHolders(List<KeyShareHolder> keyShareHolders) {
    this.keyShareHolders = keyShareHolders;
    return this;
  }

  public KeyShareHolderGroup addKeyShareHoldersItem(KeyShareHolder keyShareHoldersItem) {
    if (this.keyShareHolders == null) {
      this.keyShareHolders = new ArrayList<>();
    }
    this.keyShareHolders.add(keyShareHoldersItem);
    return this;
  }

   /**
   * Get keyShareHolders
   * @return keyShareHolders
  **/
  @javax.annotation.Nullable
  public List<KeyShareHolder> getKeyShareHolders() {
    return keyShareHolders;
  }

  public void setKeyShareHolders(List<KeyShareHolder> keyShareHolders) {
    this.keyShareHolders = keyShareHolders;
  }


  public KeyShareHolderGroup participants(Integer participants) {
    this.participants = participants;
    return this;
  }

   /**
   * The number of key share holders in this key share holder group.
   * @return participants
  **/
  @javax.annotation.Nullable
  public Integer getParticipants() {
    return participants;
  }

  public void setParticipants(Integer participants) {
    this.participants = participants;
  }


  public KeyShareHolderGroup threshold(Integer threshold) {
    this.threshold = threshold;
    return this;
  }

   /**
   * The number of key share holders required to approve each operation in this key share holder group.
   * @return threshold
  **/
  @javax.annotation.Nullable
  public Integer getThreshold() {
    return threshold;
  }

  public void setThreshold(Integer threshold) {
    this.threshold = threshold;
  }


  public KeyShareHolderGroup status(KeyShareHolderGroupStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  public KeyShareHolderGroupStatus getStatus() {
    return status;
  }

  public void setStatus(KeyShareHolderGroupStatus status) {
    this.status = status;
  }


  public KeyShareHolderGroup createdTimestamp(Long createdTimestamp) {
    this.createdTimestamp = createdTimestamp;
    return this;
  }

   /**
   * The key share holder group&#39;s creation time in Unix timestamp format, measured in milliseconds.
   * @return createdTimestamp
  **/
  @javax.annotation.Nullable
  public Long getCreatedTimestamp() {
    return createdTimestamp;
  }

  public void setCreatedTimestamp(Long createdTimestamp) {
    this.createdTimestamp = createdTimestamp;
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
   * @return the KeyShareHolderGroup instance itself
   */
  public KeyShareHolderGroup putAdditionalProperty(String key, Object value) {
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
    KeyShareHolderGroup keyShareHolderGroup = (KeyShareHolderGroup) o;
    return Objects.equals(this.keyShareHolderGroupId, keyShareHolderGroup.keyShareHolderGroupId) &&
        Objects.equals(this.type, keyShareHolderGroup.type) &&
        Objects.equals(this.tssKeyShareGroups, keyShareHolderGroup.tssKeyShareGroups) &&
        Objects.equals(this.keyShareHolders, keyShareHolderGroup.keyShareHolders) &&
        Objects.equals(this.participants, keyShareHolderGroup.participants) &&
        Objects.equals(this.threshold, keyShareHolderGroup.threshold) &&
        Objects.equals(this.status, keyShareHolderGroup.status) &&
        Objects.equals(this.createdTimestamp, keyShareHolderGroup.createdTimestamp)&&
        Objects.equals(this.additionalProperties, keyShareHolderGroup.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(keyShareHolderGroupId, type, tssKeyShareGroups, keyShareHolders, participants, threshold, status, createdTimestamp, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeyShareHolderGroup {\n");
    sb.append("    keyShareHolderGroupId: ").append(toIndentedString(keyShareHolderGroupId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    tssKeyShareGroups: ").append(toIndentedString(tssKeyShareGroups)).append("\n");
    sb.append("    keyShareHolders: ").append(toIndentedString(keyShareHolders)).append("\n");
    sb.append("    participants: ").append(toIndentedString(participants)).append("\n");
    sb.append("    threshold: ").append(toIndentedString(threshold)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    createdTimestamp: ").append(toIndentedString(createdTimestamp)).append("\n");
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
    openapiFields.add("key_share_holder_group_id");
    openapiFields.add("type");
    openapiFields.add("tss_key_share_groups");
    openapiFields.add("key_share_holders");
    openapiFields.add("participants");
    openapiFields.add("threshold");
    openapiFields.add("status");
    openapiFields.add("created_timestamp");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to KeyShareHolderGroup
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!KeyShareHolderGroup.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in KeyShareHolderGroup is not found in the empty JSON string", KeyShareHolderGroup.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("key_share_holder_group_id") != null && !jsonObj.get("key_share_holder_group_id").isJsonNull()) && !jsonObj.get("key_share_holder_group_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `key_share_holder_group_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("key_share_holder_group_id").toString()));
      }
      // validate the optional field `type`
      if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) {
        KeyShareHolderGroupType.validateJsonElement(jsonObj.get("type"));
      }
      if (jsonObj.get("tss_key_share_groups") != null && !jsonObj.get("tss_key_share_groups").isJsonNull()) {
        JsonArray jsonArraytssKeyShareGroups = jsonObj.getAsJsonArray("tss_key_share_groups");
        if (jsonArraytssKeyShareGroups != null) {
          // ensure the json data is an array
          if (!jsonObj.get("tss_key_share_groups").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `tss_key_share_groups` to be an array in the JSON string but got `%s`", jsonObj.get("tss_key_share_groups").toString()));
          }

          // validate the optional field `tss_key_share_groups` (array)
          for (int i = 0; i < jsonArraytssKeyShareGroups.size(); i++) {
            TSSGroups.validateJsonElement(jsonArraytssKeyShareGroups.get(i));
          };
        }
      }
      if (jsonObj.get("key_share_holders") != null && !jsonObj.get("key_share_holders").isJsonNull()) {
        JsonArray jsonArraykeyShareHolders = jsonObj.getAsJsonArray("key_share_holders");
        if (jsonArraykeyShareHolders != null) {
          // ensure the json data is an array
          if (!jsonObj.get("key_share_holders").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `key_share_holders` to be an array in the JSON string but got `%s`", jsonObj.get("key_share_holders").toString()));
          }

          // validate the optional field `key_share_holders` (array)
          for (int i = 0; i < jsonArraykeyShareHolders.size(); i++) {
            KeyShareHolder.validateJsonElement(jsonArraykeyShareHolders.get(i));
          };
        }
      }
      // validate the optional field `status`
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) {
        KeyShareHolderGroupStatus.validateJsonElement(jsonObj.get("status"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!KeyShareHolderGroup.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'KeyShareHolderGroup' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<KeyShareHolderGroup> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(KeyShareHolderGroup.class));

       return (TypeAdapter<T>) new TypeAdapter<KeyShareHolderGroup>() {
           @Override
           public void write(JsonWriter out, KeyShareHolderGroup value) throws IOException {
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
           public KeyShareHolderGroup read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             KeyShareHolderGroup instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of KeyShareHolderGroup given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of KeyShareHolderGroup
  * @throws IOException if the JSON string is invalid with respect to KeyShareHolderGroup
  */
  public static KeyShareHolderGroup fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, KeyShareHolderGroup.class);
  }

 /**
  * Convert an instance of KeyShareHolderGroup to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

