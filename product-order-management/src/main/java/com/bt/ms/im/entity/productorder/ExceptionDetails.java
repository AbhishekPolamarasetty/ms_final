package com.bt.ms.im.entity.productorder;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Used when an API throws an Error, typically with a HTTP error response-code (3xx, 4xx, 5xx)
 */
@ApiModel(description = "Used when an API throws an Error, typically with a HTTP error response-code (3xx, 4xx, 5xx)")
@Validated

public class ExceptionDetails   {
  @JsonProperty("code")
  private String code = null;

  @JsonProperty("message")
  private String message = null;

  @JsonProperty("invalid")
  @Valid
  private List<String> invalid = null;

  @JsonProperty("missing")
  @Valid
  private List<String> missing = null;

  @JsonProperty("@baseType")
  private String baseType = null;

  @JsonProperty("@schemaLocation")
  private String schemaLocation = null;

  @JsonProperty("@type")
  private String type = null;

  public ExceptionDetails code(String code) {
    this.code = code;
    return this;
  }

  /**
   * Application relevant detail, defined in the API or a common list.
   * @return code
  **/
  @ApiModelProperty(required = true, value = "Application relevant detail, defined in the API or a common list.")
  @NotNull


  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public ExceptionDetails message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Explanation of the message for the error which can be shown to a client user.
   * @return message
  **/
  @ApiModelProperty(required = true, value = "Explanation of the message for the error which can be shown to a client user.")
  @NotNull


  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public ExceptionDetails invalid(List<String> invalid) {
    this.invalid = invalid;
    return this;
  }

  public ExceptionDetails addInvalidItem(String invalidItem) {
    if (this.invalid == null) {
      this.invalid = new ArrayList<>();
    }
    this.invalid.add(invalidItem);
    return this;
  }

  /**
   * An array containing parameters which are deemed as invalid
   * @return invalid
  **/
  @ApiModelProperty(value = "An array containing parameters which are deemed as invalid")


  public List<String> getInvalid() {
    return invalid;
  }

  public void setInvalid(List<String> invalid) {
    this.invalid = invalid;
  }

  public ExceptionDetails missing(List<String> missing) {
    this.missing = missing;
    return this;
  }

  public ExceptionDetails addMissingItem(String missingItem) {
    if (this.missing == null) {
      this.missing = new ArrayList<>();
    }
    this.missing.add(missingItem);
    return this;
  }

  /**
   * An array containing parameters which are deemed as missing/empty
   * @return missing
  **/
  @ApiModelProperty(value = "An array containing parameters which are deemed as missing/empty")


  public List<String> getMissing() {
    return missing;
  }

  public void setMissing(List<String> missing) {
    this.missing = missing;
  }

  public ExceptionDetails baseType(String baseType) {
    this.baseType = baseType;
    return this;
  }

  /**
   * When sub-classing, this defines the super-class.
   * @return baseType
  **/
  @ApiModelProperty(value = "When sub-classing, this defines the super-class.")


  public String getBaseType() {
    return baseType;
  }

  public void setBaseType(String baseType) {
    this.baseType = baseType;
  }

  public ExceptionDetails schemaLocation(String schemaLocation) {
    this.schemaLocation = schemaLocation;
    return this;
  }

  /**
   * A URI to a JSON-Schema file that defines additional attributes and relationships
   * @return schemaLocation
  **/
  @ApiModelProperty(value = "A URI to a JSON-Schema file that defines additional attributes and relationships")


  public String getSchemaLocation() {
    return schemaLocation;
  }

  public void setSchemaLocation(String schemaLocation) {
    this.schemaLocation = schemaLocation;
  }

  public ExceptionDetails type(String type) {
    this.type = type;
    return this;
  }

  /**
   * When sub-classing, this defines the sub-class entity name.
   * @return type
  **/
  @ApiModelProperty(value = "When sub-classing, this defines the sub-class entity name.")


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExceptionDetails ExceptionDetails = (ExceptionDetails) o;
    return Objects.equals(this.code, ExceptionDetails.code) &&
        Objects.equals(this.message, ExceptionDetails.message) &&
        Objects.equals(this.invalid, ExceptionDetails.invalid) &&
        Objects.equals(this.missing, ExceptionDetails.missing) &&
        Objects.equals(this.baseType, ExceptionDetails.baseType) &&
        Objects.equals(this.schemaLocation, ExceptionDetails.schemaLocation) &&
        Objects.equals(this.type, ExceptionDetails.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, message, invalid, missing, baseType, schemaLocation, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExceptionDetails {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    invalid: ").append(toIndentedString(invalid)).append("\n");
    sb.append("    missing: ").append(toIndentedString(missing)).append("\n");
    sb.append("    baseType: ").append(toIndentedString(baseType)).append("\n");
    sb.append("    schemaLocation: ").append(toIndentedString(schemaLocation)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

