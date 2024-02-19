package com.bt.ms.im.entity.productorder;

import java.util.Objects;

import javax.validation.constraints.NotNull;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * BillingAccount reference. A BillingAccount is a detailed description of a bill structure.
 */
@ApiModel(description = "BillingAccount reference. A BillingAccount is a detailed description of a bill structure.")
@Validated

public class BillingAccountRef   {
  @NotNull
  private String id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("@baseType")
  private String baseType = null;

  @JsonProperty("@type")
  private String type = null;

  public BillingAccountRef id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier of the billing account
   * @return id
  **/
  @ApiModelProperty(required = true, value = "Unique identifier of the billing account")

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public BillingAccountRef name(String name) {
    this.name = name;
    return this;
  }

  /**
   * SAP/MDS Equipment Account Number
   * @return name
  **/
  @ApiModelProperty(value = "SAP/MDS Equipment Account Number")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public BillingAccountRef baseType(String baseType) {
    this.baseType = baseType;
    return this;
  }

  /**
   * BillingAccount
   * @return baseType
  **/
  @ApiModelProperty(value = "BillingAccount")


  public String getBaseType() {
    return baseType;
  }

  public void setBaseType(String baseType) {
    this.baseType = baseType;
  }

  public BillingAccountRef type(String type) {
    this.type = type;
    return this;
  }

  /**
   * btEquipmentAccount or BtAirtimeAccount:for product ref
   * @return type
  **/
  @ApiModelProperty(value = "btEquipmentAccount or BtAirtimeAccount:for product ref")


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
    BillingAccountRef billingAccountRef = (BillingAccountRef) o;
    return Objects.equals(this.id, billingAccountRef.id) &&
        Objects.equals(this.name, billingAccountRef.name) &&
        Objects.equals(this.baseType, billingAccountRef.baseType) &&
        Objects.equals(this.type, billingAccountRef.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, baseType, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BillingAccountRef {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    baseType: ").append(toIndentedString(baseType)).append("\n");
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

