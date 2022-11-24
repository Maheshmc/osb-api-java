package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.Context;
import io.swagger.model.ServiceInstancePreviousValues;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ServiceInstanceUpdateRequestBody
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-11-24T08:23:13.017778+05:30[Asia/Kolkata]")


public class ServiceInstanceUpdateRequestBody   {
  @JsonProperty("context")
  private Context context = null;

  @JsonProperty("service_id")
  private String serviceId = null;

  @JsonProperty("plan_id")
  private String planId = null;

  @JsonProperty("parameters")
  private Object parameters = null;

  @JsonProperty("previous_values")
  private ServiceInstancePreviousValues previousValues = null;

  public ServiceInstanceUpdateRequestBody context(Context context) {
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

  public ServiceInstanceUpdateRequestBody serviceId(String serviceId) {
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

  public ServiceInstanceUpdateRequestBody planId(String planId) {
    this.planId = planId;
    return this;
  }

  /**
   * Get planId
   * @return planId
   **/
  @Schema(description = "")
  
    public String getPlanId() {
    return planId;
  }

  public void setPlanId(String planId) {
    this.planId = planId;
  }

  public ServiceInstanceUpdateRequestBody parameters(Object parameters) {
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

  public ServiceInstanceUpdateRequestBody previousValues(ServiceInstancePreviousValues previousValues) {
    this.previousValues = previousValues;
    return this;
  }

  /**
   * Get previousValues
   * @return previousValues
   **/
  @Schema(description = "")
  
    @Valid
    public ServiceInstancePreviousValues getPreviousValues() {
    return previousValues;
  }

  public void setPreviousValues(ServiceInstancePreviousValues previousValues) {
    this.previousValues = previousValues;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceInstanceUpdateRequestBody serviceInstanceUpdateRequestBody = (ServiceInstanceUpdateRequestBody) o;
    return Objects.equals(this.context, serviceInstanceUpdateRequestBody.context) &&
        Objects.equals(this.serviceId, serviceInstanceUpdateRequestBody.serviceId) &&
        Objects.equals(this.planId, serviceInstanceUpdateRequestBody.planId) &&
        Objects.equals(this.parameters, serviceInstanceUpdateRequestBody.parameters) &&
        Objects.equals(this.previousValues, serviceInstanceUpdateRequestBody.previousValues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(context, serviceId, planId, parameters, previousValues);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceInstanceUpdateRequestBody {\n");
    
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    serviceId: ").append(toIndentedString(serviceId)).append("\n");
    sb.append("    planId: ").append(toIndentedString(planId)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    previousValues: ").append(toIndentedString(previousValues)).append("\n");
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
