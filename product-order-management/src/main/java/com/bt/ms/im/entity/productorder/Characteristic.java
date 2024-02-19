package com.bt.ms.im.entity.productorder;

import java.util.Objects;

import javax.validation.constraints.NotNull;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Describes a given characteristic of an object or entity through a name/value pair.
 */
@ApiModel(description = "Describes a given characteristic of an object or entity through a name/value pair.")
@Validated
@Getter
@Setter
public class Characteristic   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("value")
  private String value = null;
  
  @JsonProperty("btMsisdn")
  private String msisdn = null;

  public Characteristic name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the characteristic(btBillingCostCentre,btPeriodicBilling, btIntervalBilling, btActivationType, btDepRequired, btHotStaging, btUserName, btMsisdn)
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name of the characteristic(btBillingCostCentre,btPeriodicBilling, btIntervalBilling, btActivationType, btDepRequired, btHotStaging, btUserName, btMsisdn)")
  @NotNull


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Characteristic value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Data type of the value of the characteristic
   * @return value
  **/
  @ApiModelProperty(value = "Data type of the value of the characteristic")


  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Characteristic characteristic = (Characteristic) o;
    return Objects.equals(this.name, characteristic.name) &&
        Objects.equals(this.msisdn, characteristic.msisdn) && Objects.equals(this.value, characteristic.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, value, msisdn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Characteristic {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    msisdn: ").append(toIndentedString(msisdn)).append("\n");
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

