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
 * ServiceBindingSchema
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-11-24T18:54:52.557+05:30[Asia/Kolkata]")


public class ServiceBindingSchema   {
  @JsonProperty("create")
  private ServiceInstanceSchemaCreate create = null;

  public ServiceBindingSchema create(ServiceInstanceSchemaCreate create) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceBindingSchema serviceBindingSchema = (ServiceBindingSchema) o;
    return Objects.equals(this.create, serviceBindingSchema.create);
  }

  @Override
  public int hashCode() {
    return Objects.hash(create);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceBindingSchema {\n");
    
    sb.append("    create: ").append(toIndentedString(create)).append("\n");
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
