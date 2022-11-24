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
 * ServiceInstanceAsyncOperation
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-11-24T18:54:52.557+05:30[Asia/Kolkata]")


public class ServiceInstanceAsyncOperation   {
  @JsonProperty("dashboard_url")
  private String dashboardUrl = null;

  @JsonProperty("operation")
  private String operation = null;

  @JsonProperty("metadata")
  private ServiceInstanceMetadata metadata = null;

  public ServiceInstanceAsyncOperation dashboardUrl(String dashboardUrl) {
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

  public ServiceInstanceAsyncOperation operation(String operation) {
    this.operation = operation;
    return this;
  }

  /**
   * Get operation
   * @return operation
   **/
  @Schema(description = "")
  
    public String getOperation() {
    return operation;
  }

  public void setOperation(String operation) {
    this.operation = operation;
  }

  public ServiceInstanceAsyncOperation metadata(ServiceInstanceMetadata metadata) {
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
    ServiceInstanceAsyncOperation serviceInstanceAsyncOperation = (ServiceInstanceAsyncOperation) o;
    return Objects.equals(this.dashboardUrl, serviceInstanceAsyncOperation.dashboardUrl) &&
        Objects.equals(this.operation, serviceInstanceAsyncOperation.operation) &&
        Objects.equals(this.metadata, serviceInstanceAsyncOperation.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dashboardUrl, operation, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceInstanceAsyncOperation {\n");
    
    sb.append("    dashboardUrl: ").append(toIndentedString(dashboardUrl)).append("\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
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
