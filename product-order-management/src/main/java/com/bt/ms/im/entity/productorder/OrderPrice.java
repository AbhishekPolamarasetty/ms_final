package com.bt.ms.im.entity.productorder;

import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * An amount, usually of money, that represents the actual price paid by the Customer for this item or this order
 */
@ApiModel(description = "An amount, usually of money, that represents the actual price paid by the Customer for this item or this order")
@Validated

public class OrderPrice   {
  @JsonProperty("description")
  private String description = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("price")
  private Price price = null;

  public OrderPrice description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Order Total Price.
   * @return description
  **/
  @ApiModelProperty(value = "Order Total Price.")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public OrderPrice name(String name) {
    this.name = name;
    return this;
  }

  /**
   * This is the Total Price for all the order items.
   * @return name
  **/
  @ApiModelProperty(value = "This is the Total Price for all the order items.")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public OrderPrice price(Price price) {
    this.price = price;
    return this;
  }

  /**
   * a structure used to define price amount
   * @return price
  **/
  @ApiModelProperty(value = "a structure used to define price amount")

  @Valid

  public Price getPrice() {
    return price;
  }

  public void setPrice(Price price) {
    this.price = price;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderPrice orderPrice = (OrderPrice) o;
    return Objects.equals(this.description, orderPrice.description) &&
        Objects.equals(this.name, orderPrice.name) &&
        Objects.equals(this.price, orderPrice.price);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, name, price);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderPrice {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
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

