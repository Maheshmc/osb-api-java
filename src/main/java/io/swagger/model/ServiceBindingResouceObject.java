package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ServiceBindingResouceObject
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-11-24T18:54:52.557+05:30[Asia/Kolkata]")


public class ServiceBindingResouceObject   {
  @JsonProperty("app_guid")
  private String appGuid = null;

  @JsonProperty("route")
  private String route = null;

  public ServiceBindingResouceObject appGuid(String appGuid) {
    this.appGuid = appGuid;
    return this;
  }

  /**
   * Get appGuid
   * @return appGuid
   **/
  @Schema(description = "")
  
    public String getAppGuid() {
    return appGuid;
  }

  public void setAppGuid(String appGuid) {
    this.appGuid = appGuid;
  }

  public ServiceBindingResouceObject route(String route) {
    this.route = route;
    return this;
  }

  /**
   * Get route
   * @return route
   **/
  @Schema(description = "")
  
    public String getRoute() {
    return route;
  }

  public void setRoute(String route) {
    this.route = route;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceBindingResouceObject serviceBindingResouceObject = (ServiceBindingResouceObject) o;
    return Objects.equals(this.appGuid, serviceBindingResouceObject.appGuid) &&
        Objects.equals(this.route, serviceBindingResouceObject.route);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appGuid, route);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceBindingResouceObject {\n");
    
    sb.append("    appGuid: ").append(toIndentedString(appGuid)).append("\n");
    sb.append("    route: ").append(toIndentedString(route)).append("\n");
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
