package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ServiceBindingMetadata
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-11-24T18:54:52.557+05:30[Asia/Kolkata]")


public class ServiceBindingMetadata   {
  @JsonProperty("expires_at")
  private String expiresAt = null;

  @JsonProperty("renew_before")
  private String renewBefore = null;

  public ServiceBindingMetadata expiresAt(String expiresAt) {
    this.expiresAt = expiresAt;
    return this;
  }

  /**
   * Get expiresAt
   * @return expiresAt
   **/
  @Schema(description = "")
  
    public String getExpiresAt() {
    return expiresAt;
  }

  public void setExpiresAt(String expiresAt) {
    this.expiresAt = expiresAt;
  }

  public ServiceBindingMetadata renewBefore(String renewBefore) {
    this.renewBefore = renewBefore;
    return this;
  }

  /**
   * Get renewBefore
   * @return renewBefore
   **/
  @Schema(description = "")
  
    public String getRenewBefore() {
    return renewBefore;
  }

  public void setRenewBefore(String renewBefore) {
    this.renewBefore = renewBefore;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceBindingMetadata serviceBindingMetadata = (ServiceBindingMetadata) o;
    return Objects.equals(this.expiresAt, serviceBindingMetadata.expiresAt) &&
        Objects.equals(this.renewBefore, serviceBindingMetadata.renewBefore);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expiresAt, renewBefore);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceBindingMetadata {\n");
    
    sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
    sb.append("    renewBefore: ").append(toIndentedString(renewBefore)).append("\n");
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
