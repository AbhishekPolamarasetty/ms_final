package com.bt.ms.im.entity.productorder;

import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Indicates the contact medium that could be used to contact the party.
 */
@ApiModel(description = "Indicates the contact medium that could be used to contact the party.")
@Validated

public class ContactMedium   {
  @JsonProperty("characteristic")
  private MediumCharacteristic characteristic = null;

  public ContactMedium characteristic(MediumCharacteristic characteristic) {
    this.characteristic = characteristic;
    return this;
  }

  /**
   * Any additional characteristic(s) of this contact medium
   * @return characteristic
  **/
  @ApiModelProperty(value = "Any additional characteristic(s) of this contact medium")

  @Valid

  public MediumCharacteristic getCharacteristic() {
    return characteristic;
  }

  public void setCharacteristic(MediumCharacteristic characteristic) {
    this.characteristic = characteristic;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContactMedium contactMedium = (ContactMedium) o;
    return Objects.equals(this.characteristic, contactMedium.characteristic);
  }

  @Override
  public int hashCode() {
    return Objects.hash(characteristic);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactMedium {\n");
    
    sb.append("    characteristic: ").append(toIndentedString(characteristic)).append("\n");
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

