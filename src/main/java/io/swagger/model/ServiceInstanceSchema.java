package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.ServiceInstanceSchemaCreate;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ServiceInstanceSchema
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-11-24T08:23:13.017778+05:30[Asia/Kolkata]")


public class ServiceInstanceSchema   {
  @JsonProperty("create")
  private ServiceInstanceSchemaCreate create = null;

  @JsonProperty("update")
  private ServiceInstanceSchemaCreate update = null;

  public ServiceInstanceSchema create(ServiceInstanceSchemaCreate create) {
    this.create = create;
    return this;
  }

  /**
   * Get create
   * @return create
   **/
  @Schema(description = "")
  
    @Valid
    public ServiceInstanceSchemaCreate getCreate() {
    return create;
  }

  public void setCreate(ServiceInstanceSchemaCreate create) {
    this.create = create;
  }

  public ServiceInstanceSchema update(ServiceInstanceSchemaCreate update) {
    this.update = update;
    return this;
  }

  /**
   * Get update
   * @return update
   **/
  @Schema(description = "")
  
    @Valid
    public ServiceInstanceSchemaCreate getUpdate() {
    return update;
  }

  public void setUpdate(ServiceInstanceSchemaCreate update) {
    this.update = update;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceInstanceSchema serviceInstanceSchema = (ServiceInstanceSchema) o;
    return Objects.equals(this.create, serviceInstanceSchema.create) &&
        Objects.equals(this.update, serviceInstanceSchema.update);
  }

  @Override
  public int hashCode() {
    return Objects.hash(create, update);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceInstanceSchema {\n");
    
    sb.append("    create: ").append(toIndentedString(create)).append("\n");
    sb.append("    update: ").append(toIndentedString(update)).append("\n");
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
