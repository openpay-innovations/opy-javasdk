/*
 * Integration API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.plugint.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.plugint.client.model.IntegrationApiModelsCommandsOnlineJourneyDetails;
import com.plugint.client.model.IntegrationApiModelsCommandsOrderOrigin;
import com.plugint.client.model.IntegrationApiModelsCommandsPosAppJourneyDetails;
import com.plugint.client.model.IntegrationApiModelsCommandsPosWebJourneyDetails;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * The details of the customer journey integration being used for this call
 */
@Schema(description = "The details of the customer journey integration being used for this call")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-24T06:53:25.443Z[GMT]")
public class IntegrationApiModelsCommandsCustomerJourney {
  @SerializedName("origin")
  private IntegrationApiModelsCommandsOrderOrigin origin = null;

  @SerializedName("online")
  private IntegrationApiModelsCommandsOnlineJourneyDetails online = null;

  @SerializedName("posApp")
  private IntegrationApiModelsCommandsPosAppJourneyDetails posApp = null;

  @SerializedName("posWeb")
  private IntegrationApiModelsCommandsPosWebJourneyDetails posWeb = null;

  public IntegrationApiModelsCommandsCustomerJourney origin(IntegrationApiModelsCommandsOrderOrigin origin) {
    this.origin = origin;
    return this;
  }

   /**
   * Get origin
   * @return origin
  **/
  @Schema(required = true, description = "")
  public IntegrationApiModelsCommandsOrderOrigin getOrigin() {
    return origin;
  }

  public void setOrigin(IntegrationApiModelsCommandsOrderOrigin origin) {
    this.origin = origin;
  }

  public IntegrationApiModelsCommandsCustomerJourney online(IntegrationApiModelsCommandsOnlineJourneyDetails online) {
    this.online = online;
    return this;
  }

   /**
   * Get online
   * @return online
  **/
  @Schema(description = "")
  public IntegrationApiModelsCommandsOnlineJourneyDetails getOnline() {
    return online;
  }

  public void setOnline(IntegrationApiModelsCommandsOnlineJourneyDetails online) {
    this.online = online;
  }

  public IntegrationApiModelsCommandsCustomerJourney posApp(IntegrationApiModelsCommandsPosAppJourneyDetails posApp) {
    this.posApp = posApp;
    return this;
  }

   /**
   * Get posApp
   * @return posApp
  **/
  @Schema(description = "")
  public IntegrationApiModelsCommandsPosAppJourneyDetails getPosApp() {
    return posApp;
  }

  public void setPosApp(IntegrationApiModelsCommandsPosAppJourneyDetails posApp) {
    this.posApp = posApp;
  }

  public IntegrationApiModelsCommandsCustomerJourney posWeb(IntegrationApiModelsCommandsPosWebJourneyDetails posWeb) {
    this.posWeb = posWeb;
    return this;
  }

   /**
   * Get posWeb
   * @return posWeb
  **/
  @Schema(description = "")
  public IntegrationApiModelsCommandsPosWebJourneyDetails getPosWeb() {
    return posWeb;
  }

  public void setPosWeb(IntegrationApiModelsCommandsPosWebJourneyDetails posWeb) {
    this.posWeb = posWeb;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IntegrationApiModelsCommandsCustomerJourney integrationApiModelsCommandsCustomerJourney = (IntegrationApiModelsCommandsCustomerJourney) o;
    return Objects.equals(this.origin, integrationApiModelsCommandsCustomerJourney.origin) &&
        Objects.equals(this.online, integrationApiModelsCommandsCustomerJourney.online) &&
        Objects.equals(this.posApp, integrationApiModelsCommandsCustomerJourney.posApp) &&
        Objects.equals(this.posWeb, integrationApiModelsCommandsCustomerJourney.posWeb);
  }

  @Override
  public int hashCode() {
    return Objects.hash(origin, online, posApp, posWeb);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntegrationApiModelsCommandsCustomerJourney {\n");
    
    sb.append("    origin: ").append(toIndentedString(origin)).append("\n");
    sb.append("    online: ").append(toIndentedString(online)).append("\n");
    sb.append("    posApp: ").append(toIndentedString(posApp)).append("\n");
    sb.append("    posWeb: ").append(toIndentedString(posWeb)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}