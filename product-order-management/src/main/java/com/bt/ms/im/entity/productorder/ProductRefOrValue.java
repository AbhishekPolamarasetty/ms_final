package com.bt.ms.im.entity.productorder;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * A product to be created defined by value or existing defined by reference. The polymorphic attributes @type, @schemaLocation &amp; @referredType are related to the product entity and not the RelatedProductRefOrValue class itself
 */
@ApiModel(description = "A product to be created defined by value or existing defined by reference. The polymorphic attributes @type, @schemaLocation & @referredType are related to the product entity and not the RelatedProductRefOrValue class itself")
@Validated

public class ProductRefOrValue   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("billingAccount")
  private BillingAccountRef billingAccount = null;

  @JsonProperty("productCharacteristic")
  @Valid
  private List<Characteristic> productCharacteristic = null;

  @JsonProperty("@baseType")
  private String baseType = null;

  @JsonProperty("@type")
  private String type = null;

  public ProductRefOrValue id(String id) {
    this.id = id;
    return this;
  }

  /**
   * ArticleID/Product Code
   * @return id
  **/
  @ApiModelProperty(value = "ArticleID/Product Code")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ProductRefOrValue description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Is the description of the product. It could be copied from the description of the Product Offering.
   * @return description
  **/
  @ApiModelProperty(value = "Is the description of the product. It could be copied from the description of the Product Offering.")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ProductRefOrValue billingAccount(BillingAccountRef billingAccount) {
    this.billingAccount = billingAccount;
    return this;
  }

  /**
   * Get billingAccount
   * @return billingAccount
  **/
  @ApiModelProperty(value = "")

  @Valid

  public BillingAccountRef getBillingAccount() {
    return billingAccount;
  }

  public void setBillingAccount(BillingAccountRef billingAccount) {
    this.billingAccount = billingAccount;
  }

  public ProductRefOrValue productCharacteristic(List<Characteristic> productCharacteristic) {
    this.productCharacteristic = productCharacteristic;
    return this;
  }

  public ProductRefOrValue addProductCharacteristicItem(Characteristic productCharacteristicItem) {
    if (this.productCharacteristic == null) {
      this.productCharacteristic = new ArrayList<>();
    }
    this.productCharacteristic.add(productCharacteristicItem);
    return this;
  }

  /**
   * Get productCharacteristic
   * @return productCharacteristic
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<Characteristic> getProductCharacteristic() {
    return productCharacteristic;
  }

  public void setProductCharacteristic(List<Characteristic> productCharacteristic) {
    this.productCharacteristic = productCharacteristic;
  }

  public ProductRefOrValue baseType(String baseType) {
    this.baseType = baseType;
    return this;
  }

  /**
   * Product
   * @return baseType
  **/
  @ApiModelProperty(value = "Product")


  public String getBaseType() {
    return baseType;
  }

  public void setBaseType(String baseType) {
    this.baseType = baseType;
  }

  public ProductRefOrValue type(String type) {
    this.type = type;
    return this;
  }

  /**
   * btProduct
   * @return type
  **/
  @ApiModelProperty(value = "btProduct")


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
    ProductRefOrValue productRefOrValue = (ProductRefOrValue) o;
    return Objects.equals(this.id, productRefOrValue.id) &&
        Objects.equals(this.description, productRefOrValue.description) &&
        Objects.equals(this.billingAccount, productRefOrValue.billingAccount) &&
        Objects.equals(this.productCharacteristic, productRefOrValue.productCharacteristic) &&
        Objects.equals(this.baseType, productRefOrValue.baseType) &&
        Objects.equals(this.type, productRefOrValue.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, description, billingAccount, productCharacteristic, baseType, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductRefOrValue {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    billingAccount: ").append(toIndentedString(billingAccount)).append("\n");
    sb.append("    productCharacteristic: ").append(toIndentedString(productCharacteristic)).append("\n");
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

