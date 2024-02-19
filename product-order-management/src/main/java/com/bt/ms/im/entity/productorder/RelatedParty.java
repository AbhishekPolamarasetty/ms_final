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
 * Individual represents a single human being (a man, woman or child). The individual can be a customer, an employee or any other person that the organization needs to store information about.
 */
@ApiModel(description = "Individual represents a single human being (a man, woman or child). The individual can be a customer, an employee or any other person that the organization needs to store information about.")
@Validated

public class RelatedParty   {
  @JsonProperty("@referredType")
  private String referredType = null;

  @JsonProperty("@type")
  private String type = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("orgName")
  private String orgName = null;

  @JsonProperty("title")
  private String title = null;

  @JsonProperty("givenName")
  private String givenName = null;

  @JsonProperty("middleName")
  private String middleName = null;

  @JsonProperty("familyName")
  private String familyName = null;

  @JsonProperty("contactMedium")
  @Valid
  private List<ContactMedium> contactMedium = null;

  public RelatedParty referredType(String referredType) {
    this.referredType = referredType;
    return this;
  }

  /**
   * Customer, Individual, Individual,
   * @return referredType
  **/
  @ApiModelProperty(value = "Customer, Individual,")


  public String getReferredType() {
    return referredType;
  }

  public void setReferredType(String referredType) {
    this.referredType = referredType;
  }

  public RelatedParty type(String type) {
    this.type = type;
    return this;
  }

  /**
   * btCustomer, btCustomerContact btInvoiceCustomerContact, btDeliveryCustomerContact,
   * @return type
  **/
  @ApiModelProperty(value = "btCustomer, btCustomerContact btInvoiceCustomerContact, btDeliveryCustomerContact,")


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public RelatedParty id(String id) {
    this.id = id;
    return this;
  }

  /**
   * system generated sequence
   * @return id
  **/
  @ApiModelProperty(required = true, value = "system generated sequence")
  @NotNull


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public RelatedParty orgName(String orgName) {
    this.orgName = orgName;
    return this;
  }

  /**
   * Company Name/Organization Name
   * @return orgName
  **/
  @ApiModelProperty(value = "Company Name/Organization Name")


  public String getOrgName() {
    return orgName;
  }

  public void setOrgName(String orgName) {
    this.orgName = orgName;
  }

  public RelatedParty title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Useful for titles (aristocratic, social,...) Pr, Dr, Sir, ...
   * @return title
  **/
  @ApiModelProperty(value = "Useful for titles (aristocratic, social,...) Pr, Dr, Sir, ...")


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public RelatedParty givenName(String givenName) {
    this.givenName = givenName;
    return this;
  }

  /**
   * First name
   * @return givenName
  **/
  @ApiModelProperty(required = true, value = "First name")
  
  public String getGivenName() {
    return givenName;
  }

  public void setGivenName(String givenName) {
    this.givenName = givenName;
  }

  public RelatedParty middleName(String middleName) {
    this.middleName = middleName;
    return this;
  }

  /**
   * Middles name or initial
   * @return middleName
  **/
  @ApiModelProperty(value = "Middles name or initial")


  public String getMiddleName() {
    return middleName;
  }

  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }

  public RelatedParty familyName(String familyName) {
    this.familyName = familyName;
    return this;
  }

  /**
   * Contains the non-chosen or inherited name. Also known as last name in the Western context
   * @return familyName
  **/
  @ApiModelProperty(required = true, value = "Contains the non-chosen or inherited name. Also known as last name in the Western context")
  
  public String getFamilyName() {
    return familyName;
  }

  public void setFamilyName(String familyName) {
    this.familyName = familyName;
  }

  public RelatedParty contactMedium(List<ContactMedium> contactMedium) {
    this.contactMedium = contactMedium;
    return this;
  }

  public RelatedParty addContactMediumItem(ContactMedium contactMediumItem) {
    if (this.contactMedium == null) {
      this.contactMedium = new ArrayList<>();
    }
    this.contactMedium.add(contactMediumItem);
    return this;
  }

  /**
   * Get contactMedium
   * @return contactMedium
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<ContactMedium> getContactMedium() {
    return contactMedium;
  }

  public void setContactMedium(List<ContactMedium> contactMedium) {
    this.contactMedium = contactMedium;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RelatedParty relatedParty = (RelatedParty) o;
    return Objects.equals(this.referredType, relatedParty.referredType) &&
        Objects.equals(this.type, relatedParty.type) &&
        Objects.equals(this.id, relatedParty.id) &&
        Objects.equals(this.orgName, relatedParty.orgName) &&
        Objects.equals(this.title, relatedParty.title) &&
        Objects.equals(this.givenName, relatedParty.givenName) &&
        Objects.equals(this.middleName, relatedParty.middleName) &&
        Objects.equals(this.familyName, relatedParty.familyName) &&
        Objects.equals(this.contactMedium, relatedParty.contactMedium);
  }

  @Override
  public int hashCode() {
    return Objects.hash(referredType, type, id, orgName, title, givenName, middleName, familyName, contactMedium);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RelatedParty {\n");
    
    sb.append("    referredType: ").append(toIndentedString(referredType)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    orgName: ").append(toIndentedString(orgName)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    givenName: ").append(toIndentedString(givenName)).append("\n");
    sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
    sb.append("    familyName: ").append(toIndentedString(familyName)).append("\n");
    sb.append("    contactMedium: ").append(toIndentedString(contactMedium)).append("\n");
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

