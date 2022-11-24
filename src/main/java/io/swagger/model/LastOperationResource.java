package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * LastOperationResource
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-11-24T08:23:13.017778+05:30[Asia/Kolkata]")


public class LastOperationResource   {
  /**
   * Gets or Sets state
   */
  public enum StateEnum {
    IN_PROGRESS("in progress"),
    
    SUCCEEDED("succeeded"),
    
    FAILED("failed");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StateEnum fromValue(String text) {
      for (StateEnum b : StateEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("state")
  private StateEnum state = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("instance_usable")
  private Boolean instanceUsable = null;

  @JsonProperty("update_repeatable")
  private Boolean updateRepeatable = null;

  public LastOperationResource state(StateEnum state) {
    this.state = state;
    return this;
  }

  /**
   * Get state
   * @return state
   **/
  @Schema(required = true, description = "")
      @NotNull

    public StateEnum getState() {
    return state;
  }

  public void setState(StateEnum state) {
    this.state = state;
  }

  public LastOperationResource description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
   **/
  @Schema(description = "")
  
    public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public LastOperationResource instanceUsable(Boolean instanceUsable) {
    this.instanceUsable = instanceUsable;
    return this;
  }

  /**
   * Get instanceUsable
   * @return instanceUsable
   **/
  @Schema(description = "")
  
    public Boolean isInstanceUsable() {
    return instanceUsable;
  }

  public void setInstanceUsable(Boolean instanceUsable) {
    this.instanceUsable = instanceUsable;
  }

  public LastOperationResource updateRepeatable(Boolean updateRepeatable) {
    this.updateRepeatable = updateRepeatable;
    return this;
  }

  /**
   * Get updateRepeatable
   * @return updateRepeatable
   **/
  @Schema(description = "")
  
    public Boolean isUpdateRepeatable() {
    return updateRepeatable;
  }

  public void setUpdateRepeatable(Boolean updateRepeatable) {
    this.updateRepeatable = updateRepeatable;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LastOperationResource lastOperationResource = (LastOperationResource) o;
    return Objects.equals(this.state, lastOperationResource.state) &&
        Objects.equals(this.description, lastOperationResource.description) &&
        Objects.equals(this.instanceUsable, lastOperationResource.instanceUsable) &&
        Objects.equals(this.updateRepeatable, lastOperationResource.updateRepeatable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(state, description, instanceUsable, updateRepeatable);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LastOperationResource {\n");
    
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    instanceUsable: ").append(toIndentedString(instanceUsable)).append("\n");
    sb.append("    updateRepeatable: ").append(toIndentedString(updateRepeatable)).append("\n");
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
