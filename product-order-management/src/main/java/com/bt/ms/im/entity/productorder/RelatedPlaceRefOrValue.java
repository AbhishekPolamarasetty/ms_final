package com.bt.ms.im.entity.productorder;

import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Related Entity reference. A related place defines a place described by reference or by value linked to a specific entity. The polymorphic attributes @type, @schemaLocation &amp; @referredType are related to the place entity and not the RelatedPlaceRefOrValue class itself
 */
@ApiModel(description = "Related Entity reference. A related place defines a place described by reference or by value linked to a specific entity. The polymorphic attributes @type, @schemaLocation & @referredType are related to the place entity and not the RelatedPlaceRefOrValue class itself")
@Validated

public class RelatedPlaceRefOrValue   {
	
  @JsonProperty("address")
  private AddressRef address = null;

  @JsonProperty("btAddressId")
  private String addressId = null;

  @JsonProperty("btHierarchyLevel")
  private String hierarchyLevel = null;

  @JsonProperty("@baseType")
  private String baseType = null;

  @JsonProperty("@type")
  private String type = null;

  public RelatedPlaceRefOrValue address(AddressRef address) {
    this.address = address;
    return this;
  }

  /**
   * Get address
   * @return address
  **/
  @ApiModelProperty(value = "")

  @Valid

  public AddressRef getAddress() {
    return address;
  }

  public void setAddress(AddressRef address) {
    this.address = address;
  }

  public RelatedPlaceRefOrValue name(String addressId) {
    this.addressId = addressId;
    return this;
  }

  /**
   * DeliveryAddress, InvoiceAddress A user-friendly name for the place, such as [Paris Store], [London Store], [Main Home]
   * @return name
  **/
  @ApiModelProperty(value = "DeliveryAddress, InvoiceAddress A user-friendly name for the place, such as [Paris Store], [London Store], [Main Home]")


  public String getAddressId() {
    return addressId;
  }

  public void setAddressId(String addressId) {
    this.addressId = addressId;
  }

  public RelatedPlaceRefOrValue hierarchyLevel(String hierarchyLevel) {
    this.hierarchyLevel = hierarchyLevel;
    return this;
  }

  /**
   * DeliveryAddress, InvoiceAddress
   * @return role
  **/
  @ApiModelProperty(required = true, value = "DeliveryAddress, InvoiceAddress")
  public String getHierarchyLevel() {
    return hierarchyLevel;
  }

  public void setHeirarchyLevel(String hierarchyLevel) {
    this.hierarchyLevel = hierarchyLevel;
  }

  public RelatedPlaceRefOrValue baseType(String baseType) {
    this.baseType = baseType;
    return this;
  }

  /**
   * Place
   * @return baseType
  **/
  @ApiModelProperty(value = "Place")


  public String getBaseType() {
    return baseType;
  }

  public void setBaseType(String baseType) {
    this.baseType = baseType;
  }

  public RelatedPlaceRefOrValue type(String type) {
    this.type = type;
    return this;
  }

  /**
   * btDeliveryAddress/btInvoiceAddress
   * @return type
  **/
  @ApiModelProperty(value = "btDeliveryAddress/btInvoiceAddress")


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
    RelatedPlaceRefOrValue relatedPlaceRefOrValue = (RelatedPlaceRefOrValue) o;
    return Objects.equals(this.address, relatedPlaceRefOrValue.address) &&
        Objects.equals(this.addressId, relatedPlaceRefOrValue.addressId) &&
        Objects.equals(this.hierarchyLevel, relatedPlaceRefOrValue.hierarchyLevel) &&
        Objects.equals(this.baseType, relatedPlaceRefOrValue.baseType) &&
        Objects.equals(this.type, relatedPlaceRefOrValue.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, addressId, hierarchyLevel, baseType, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RelatedPlaceRefOrValue {\n");
    
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    addressId: ").append(toIndentedString(addressId)).append("\n");
    sb.append("    heirarchyLevel: ").append(toIndentedString(hierarchyLevel)).append("\n");
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

