package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.Context;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ServiceInstanceProvisionRequestBody
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-11-24T08:23:13.017778+05:30[Asia/Kolkata]")


public class ServiceInstanceProvisionRequestBody   {
  @JsonProperty("service_id")
  private String serviceId = null;

  @JsonProperty("plan_id")
  private String planId = null;

  @JsonProperty("context")
  private Context context = null;

  @JsonProperty("organization_guid")
  private String organizationGuid = null;

  @JsonProperty("space_guid")
  private String spaceGuid = null;

  @JsonProperty("parameters")
  private Object parameters = null;

  public ServiceInstanceProvisionRequestBody serviceId(String serviceId) {
    this.serviceId = serviceId;
    return this;
  }

  /**
   * Get serviceId
   * @return serviceId
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getServiceId() {
    return serviceId;
  }

  public void setServiceId(String serviceId) {
    this.serviceId = serviceId;
  }

  public ServiceInstanceProvisionRequestBody planId(String planId) {
    this.planId = planId;
    return this;
  }

  /**
   * Get planId
   * @return planId
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getPlanId() {
    return planId;
  }

  public void setPlanId(String planId) {
    this.planId = planId;
  }

  public ServiceInstanceProvisionRequestBody context(Context context) {
    this.context = context;
    return this;
  }

  /**
   * Get context
   * @return context
   **/
  @Schema(description = "")
  
    @Valid
    public Context getContext() {
    return context;
  }

  public void setContext(Context context) {
    this.context = context;
  }

  public ServiceInstanceProvisionRequestBody organizationGuid(String organizationGuid) {
    this.organizationGuid = organizationGuid;
    return this;
  }

  /**
   * Get organizationGuid
   * @return organizationGuid
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getOrganizationGuid() {
    return organizationGuid;
  }

  public void setOrganizationGuid(String organizationGuid) {
    this.organizationGuid = organizationGuid;
  }

  public ServiceInstanceProvisionRequestBody spaceGuid(String spaceGuid) {
    this.spaceGuid = spaceGuid;
    return this;
  }

  /**
   * Get spaceGuid
   * @return spaceGuid
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getSpaceGuid() {
    return spaceGuid;
  }

  public void setSpaceGuid(String spaceGuid) {
    this.spaceGuid = spaceGuid;
  }

  public ServiceInstanceProvisionRequestBody parameters(Object parameters) {
    this.parameters = parameters;
    return this;
  }

  /**
   * Get parameters
   * @return parameters
   **/
  @Schema(description = "")
  
    public Object getParameters() {
    return parameters;
  }

  public void setParameters(Object parameters) {
    this.parameters = parameters;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceInstanceProvisionRequestBody serviceInstanceProvisionRequestBody = (ServiceInstanceProvisionRequestBody) o;
    return Objects.equals(this.serviceId, serviceInstanceProvisionRequestBody.serviceId) &&
        Objects.equals(this.planId, serviceInstanceProvisionRequestBody.planId) &&
        Objects.equals(this.context, serviceInstanceProvisionRequestBody.context) &&
        Objects.equals(this.organizationGuid, serviceInstanceProvisionRequestBody.organizationGuid) &&
        Objects.equals(this.spaceGuid, serviceInstanceProvisionRequestBody.spaceGuid) &&
        Objects.equals(this.parameters, serviceInstanceProvisionRequestBody.parameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceId, planId, context, organizationGuid, spaceGuid, parameters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceInstanceProvisionRequestBody {\n");
    
    sb.append("    serviceId: ").append(toIndentedString(serviceId)).append("\n");
    sb.append("    planId: ").append(toIndentedString(planId)).append("\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    organizationGuid: ").append(toIndentedString(organizationGuid)).append("\n");
    sb.append("    spaceGuid: ").append(toIndentedString(spaceGuid)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
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
