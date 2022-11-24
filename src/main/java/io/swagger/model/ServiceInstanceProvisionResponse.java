package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.ServiceInstanceMetadata;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ServiceInstanceProvisionResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-11-24T08:23:13.017778+05:30[Asia/Kolkata]")


public class ServiceInstanceProvisionResponse   {
  @JsonProperty("dashboard_url")
  private String dashboardUrl = null;

  @JsonProperty("metadata")
  private ServiceInstanceMetadata metadata = null;

  public ServiceInstanceProvisionResponse dashboardUrl(String dashboardUrl) {
    this.dashboardUrl = dashboardUrl;
    return this;
  }

  /**
   * Get dashboardUrl
   * @return dashboardUrl
   **/
  @Schema(description = "")
  
    public String getDashboardUrl() {
    return dashboardUrl;
  }

  public void setDashboardUrl(String dashboardUrl) {
    this.dashboardUrl = dashboardUrl;
  }

  public ServiceInstanceProvisionResponse metadata(ServiceInstanceMetadata metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * Get metadata
   * @return metadata
   **/
  @Schema(description = "")
  
    @Valid
    public ServiceInstanceMetadata getMetadata() {
    return metadata;
  }

  public void setMetadata(ServiceInstanceMetadata metadata) {
    this.metadata = metadata;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceInstanceProvisionResponse serviceInstanceProvisionResponse = (ServiceInstanceProvisionResponse) o;
    return Objects.equals(this.dashboardUrl, serviceInstanceProvisionResponse.dashboardUrl) &&
        Objects.equals(this.metadata, serviceInstanceProvisionResponse.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dashboardUrl, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceInstanceProvisionResponse {\n");
    
    sb.append("    dashboardUrl: ").append(toIndentedString(dashboardUrl)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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
