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
 * An identified part of the order. A product order is decomposed into one or more order items.
 */
@ApiModel(description = "An identified part of the order. A product order is decomposed into one or more order items.")
@Validated

public class ProductOrderItem   {
  @JsonProperty("@baseType")
  private String baseType = null;

  @JsonProperty("@type")
  private String type = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("quantity")
  private Integer quantity = null;

  @JsonProperty("action")
  private String action = null;

  @JsonProperty("itemPrice")
  @Valid
  private List<OrderPrice> itemPrice = null;

  @JsonProperty("itemTotalPrice")
  @Valid
  private List<OrderPrice> itemTotalPrice = null;

  @JsonProperty("product")
  private ProductRefOrValue product = null;

  public ProductOrderItem baseType(String baseType) {
    this.baseType = baseType;
    return this;
  }

  /**
   * ProductOrderItem
   * @return baseType
  **/
  @ApiModelProperty(value = "ProductOrderItem")


  public String getBaseType() {
    return baseType;
  }

  public void setBaseType(String baseType) {
    this.baseType = baseType;
  }

  public ProductOrderItem type(String type) {
    this.type = type;
    return this;
  }

  /**
   * btProductOrderItem
   * @return type
  **/
  @ApiModelProperty(value = "btProductOrderItem")


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public ProductOrderItem id(String id) {
    this.id = id;
    return this;
  }

  /**
   * onlineOrderItemNumber/rowid Identifier of the line item (generally it is a sequence number 01, 02, 03, ...)
   * @return id
  **/
  @ApiModelProperty(required = true, value = "onlineOrderItemNumber/rowid Identifier of the line item (generally it is a sequence number 01, 02, 03, ...)")
  @NotNull


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ProductOrderItem quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

  /**
   * Quantity ordered
   * @return quantity
  **/
  @ApiModelProperty(value = "Quantity ordered")


  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public ProductOrderItem action(String action) {
    this.action = action;
    return this;
  }

  /**
   * The action to be carried out on the Product. Can be: add, modify, delete, noChange
   * @return action
  **/
  @ApiModelProperty(required = true, value = "The action to be carried out on the Product. Can be: add, modify, delete, noChange")
  @NotNull


  public String getAction() {
    return action;
  }

  public void setAction(String action) {
    this.action = action;
  }

  public ProductOrderItem itemPrice(List<OrderPrice> itemPrice) {
    this.itemPrice = itemPrice;
    return this;
  }

  public ProductOrderItem addItemPriceItem(OrderPrice itemPriceItem) {
    if (this.itemPrice == null) {
      this.itemPrice = new ArrayList<>();
    }
    this.itemPrice.add(itemPriceItem);
    return this;
  }

  /**
   * Get itemPrice
   * @return itemPrice
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<OrderPrice> getItemPrice() {
    return itemPrice;
  }

  public void setItemPrice(List<OrderPrice> itemPrice) {
    this.itemPrice = itemPrice;
  }

  public ProductOrderItem itemTotalPrice(List<OrderPrice> itemTotalPrice) {
    this.itemTotalPrice = itemTotalPrice;
    return this;
  }

  public ProductOrderItem addItemTotalPriceItem(OrderPrice itemTotalPriceItem) {
    if (this.itemTotalPrice == null) {
      this.itemTotalPrice = new ArrayList<>();
    }
    this.itemTotalPrice.add(itemTotalPriceItem);
    return this;
  }

  /**
   * Get itemTotalPrice
   * @return itemTotalPrice
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<OrderPrice> getItemTotalPrice() {
    return itemTotalPrice;
  }

  public void setItemTotalPrice(List<OrderPrice> itemTotalPrice) {
    this.itemTotalPrice = itemTotalPrice;
  }

  public ProductOrderItem product(ProductRefOrValue product) {
    this.product = product;
    return this;
  }

  /**
   * Get product
   * @return product
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ProductRefOrValue getProduct() {
    return product;
  }

  public void setProduct(ProductRefOrValue product) {
    this.product = product;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductOrderItem productOrderItem = (ProductOrderItem) o;
    return Objects.equals(this.baseType, productOrderItem.baseType) &&
        Objects.equals(this.type, productOrderItem.type) &&
        Objects.equals(this.id, productOrderItem.id) &&
        Objects.equals(this.quantity, productOrderItem.quantity) &&
        Objects.equals(this.action, productOrderItem.action) &&
        Objects.equals(this.itemPrice, productOrderItem.itemPrice) &&
        Objects.equals(this.itemTotalPrice, productOrderItem.itemTotalPrice) &&
        Objects.equals(this.product, productOrderItem.product);
  }

  @Override
  public int hashCode() {
    return Objects.hash(baseType, type, id, quantity, action, itemPrice, itemTotalPrice, product);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductOrderItem {\n");
    
    sb.append("    baseType: ").append(toIndentedString(baseType)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    itemPrice: ").append(toIndentedString(itemPrice)).append("\n");
    sb.append("    itemTotalPrice: ").append(toIndentedString(itemTotalPrice)).append("\n");
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
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

