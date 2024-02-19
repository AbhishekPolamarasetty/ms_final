package com.bt.ms.im.entity.productorder;

import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * This resource is used to manage address
 */
@ApiModel(description = "This resource is used to manage address")
@Validated

public class AddressRef   {
  @JsonProperty("provideAlternative")
  private Boolean provideAlternative = null;

  @JsonProperty("geographicAddress")
  private GeographicAddress geographicAddress = null;

  @JsonProperty("@type")
  private String type = null;

  public AddressRef provideAlternative(Boolean provideAlternative) {
    this.provideAlternative = provideAlternative;
    return this;
  }

  /**
   * Indicator provided by the requester to specify if alternate addresses must be provided in case of partial or fail result.
   * @return provideAlternative
  **/
  @ApiModelProperty(required = true, value = "Indicator provided by the requester to specify if alternate addresses must be provided in case of partial or fail result.")
  @NotNull


  public Boolean isProvideAlternative() {
    return provideAlternative;
  }

  public void setProvideAlternative(Boolean provideAlternative) {
    this.provideAlternative = provideAlternative;
  }

  public AddressRef geographicAddress(GeographicAddress geographicAddress) {
    this.geographicAddress = geographicAddress;
    return this;
  }

  /**
   * adress
   * @return geographicAddress
  **/
  @ApiModelProperty(required = true, value = "adress")
  @NotNull

  @Valid

  public GeographicAddress getGeographicAddress() {
    return geographicAddress;
  }

  public void setGeographicAddress(GeographicAddress geographicAddress) {
    this.geographicAddress = geographicAddress;
  }

  public AddressRef type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Address
   * @return type
  **/
  @ApiModelProperty(value = "Address")


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
    AddressRef addressRef = (AddressRef) o;
    return Objects.equals(this.provideAlternative, addressRef.provideAlternative) &&
        Objects.equals(this.geographicAddress, addressRef.geographicAddress) &&
        Objects.equals(this.type, addressRef.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(provideAlternative, geographicAddress, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddressRef {\n");
    
    sb.append("    provideAlternative: ").append(toIndentedString(provideAlternative)).append("\n");
    sb.append("    geographicAddress: ").append(toIndentedString(geographicAddress)).append("\n");
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

