package com.bt.ms.im.entity.productorder;

import java.util.Objects;
import org.springframework.validation.annotation.Validated;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Structured textual way of describing how to find a Property in an urban area (country properties are often defined differently). Note : Address corresponds to SID UrbanPropertyAddress
 */
@ApiModel(description = "Structured textual way of describing how to find a Property in an urban area (country properties are often defined differently). Note : Address corresponds to SID UrbanPropertyAddress")
@Validated

public class GeographicAddress   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("city")
  private String city = null;

  @JsonProperty("locality")
  private String locality = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("btSubBuildingName")
  private String btSubBuildingName = null;

  @JsonProperty("btBuildingNumber")
  private String btBuildingNumber = null;

  @JsonProperty("btDeptName")
  private String btDeptName = null;

  @JsonProperty("postcode")
  private String postcode = null;

  @JsonProperty("country")
  private String country = null;

  @JsonProperty("streetName")
  private String streetName = null;

  @JsonProperty("street2")
  private String street2 = null;

  public GeographicAddress id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier of the place
   * @return id
  **/
  @ApiModelProperty(value = "Unique identifier of the place")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public GeographicAddress city(String city) {
    this.city = city;
    return this;
  }

  /**
   * City that the address is in
   * @return city
  **/
  @ApiModelProperty(value = "City that the address is in")


  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public GeographicAddress locality(String locality) {
    this.locality = locality;
    return this;
  }

  /**
   * An area of defined or undefined boundaries within a local authority or other legislatively defined area, usually rural or semi rural in nature. [ANZLIC-STREET], or a suburb, a bounded locality within a city, town or shire principally of urban character [ANZLICSTREET]
   * @return locality
  **/
  @ApiModelProperty(value = "An area of defined or undefined boundaries within a local authority or other legislatively defined area, usually rural or semi rural in nature. [ANZLIC-STREET], or a suburb, a bounded locality within a city, town or shire principally of urban character [ANZLICSTREET]")


  public String getLocality() {
    return locality;
  }

  public void setLocality(String locality) {
    this.locality = locality;
  }

  public GeographicAddress name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Building Name A user-friendly name for the place, such as [Paris Store], [London Store], [Main Home]
   * @return name
  **/
  @ApiModelProperty(value = "Building Name A user-friendly name for the place, such as [Paris Store], [London Store], [Main Home]")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public GeographicAddress btSubBuildingName(String btSubBuildingName) {
    this.btSubBuildingName = btSubBuildingName;
    return this;
  }

  /**
   * When a Sub Building is present, either Building Name or Building Number data must be present
   * @return btSubBuildingName
  **/
  @ApiModelProperty(value = "When a Sub Building is present, either Building Name or Building Number data must be present")


  public String getBtSubBuildingName() {
    return btSubBuildingName;
  }

  public void setBtSubBuildingName(String btSubBuildingName) {
    this.btSubBuildingName = btSubBuildingName;
  }

  public GeographicAddress btBuildingNumber(String btBuildingNumber) {
    this.btBuildingNumber = btBuildingNumber;
    return this;
  }

  /**
   * Building Number, identifies the premises on a thoroughfare or dependent thoroughfare (e.g. �22�)
   * @return btBuildingNumber
  **/
  @ApiModelProperty(value = "Building Number, identifies the premises on a thoroughfare or dependent thoroughfare (e.g. �22�)")


  public String getBtBuildingNumber() {
    return btBuildingNumber;
  }

  public void setBtBuildingNumber(String btBuildingNumber) {
    this.btBuildingNumber = btBuildingNumber;
  }

  public GeographicAddress btDeptName(String btDeptName) {
    this.btDeptName = btDeptName;
    return this;
  }

  /**
   * Department Name (e.g. EUROSAT DISTRIBUTION (MIDLANDS) LTD), appears on 2nd address line if present 
   * @return btDeptName
  **/
  @ApiModelProperty(value = "Department Name (e.g. EUROSAT DISTRIBUTION (MIDLANDS) LTD), appears on 2nd address line if present ")


  public String getBtDeptName() {
    return btDeptName;
  }

  public void setBtDeptName(String btDeptName) {
    this.btDeptName = btDeptName;
  }

  public GeographicAddress postcode(String postcode) {
    this.postcode = postcode;
    return this;
  }

  /**
   * descriptor for a postal delivery area, used to speed and simplify the delivery of mail (also know as zipcode)
   * @return postcode
  **/
  @ApiModelProperty(value = "descriptor for a postal delivery area, used to speed and simplify the delivery of mail (also know as zipcode)")


  public String getPostcode() {
    return postcode;
  }

  public void setPostcode(String postcode) {
    this.postcode = postcode;
  }

  public GeographicAddress country(String country) {
    this.country = country;
    return this;
  }

  /**
   * Country
   * @return country
  **/
  @ApiModelProperty(value = "Country")


  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public GeographicAddress streetName(String streetName) {
    this.streetName = streetName;
    return this;
  }

  /**
   * Street1, Name of the street or other street type
   * @return streetName
  **/
  @ApiModelProperty(value = "Street1, Name of the street or other street type")


  public String getStreetName() {
    return streetName;
  }

  public void setStreetName(String streetName) {
    this.streetName = streetName;
  }

  public GeographicAddress street2(String street2) {
    this.street2 = street2;
    return this;
  }

  /**
   * Street2, Number identifying a specific property on a public street
   * @return street2
  **/
  @ApiModelProperty(value = "Street2, Number identifying a specific property on a public street")


  public String getStreet2() {
    return street2;
  }

  public void setStreet2(String street2) {
    this.street2 = street2;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeographicAddress geographicAddress = (GeographicAddress) o;
    return Objects.equals(this.id, geographicAddress.id) &&
        Objects.equals(this.city, geographicAddress.city) &&
        Objects.equals(this.locality, geographicAddress.locality) &&
        Objects.equals(this.name, geographicAddress.name) &&
        Objects.equals(this.btSubBuildingName, geographicAddress.btSubBuildingName) &&
        Objects.equals(this.btBuildingNumber, geographicAddress.btBuildingNumber) &&
        Objects.equals(this.btDeptName, geographicAddress.btDeptName) &&
        Objects.equals(this.postcode, geographicAddress.postcode) &&
        Objects.equals(this.country, geographicAddress.country) &&
        Objects.equals(this.streetName, geographicAddress.streetName) &&
        Objects.equals(this.street2, geographicAddress.street2);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, city, locality, name, btSubBuildingName, btBuildingNumber, btDeptName, postcode, country, streetName, street2);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeographicAddress {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    locality: ").append(toIndentedString(locality)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    btSubBuildingName: ").append(toIndentedString(btSubBuildingName)).append("\n");
    sb.append("    btBuildingNumber: ").append(toIndentedString(btBuildingNumber)).append("\n");
    sb.append("    btDeptName: ").append(toIndentedString(btDeptName)).append("\n");
    sb.append("    postcode: ").append(toIndentedString(postcode)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    streetName: ").append(toIndentedString(streetName)).append("\n");
    sb.append("    street2: ").append(toIndentedString(street2)).append("\n");
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

