package com.bt.ms.im.entity.productorder;

import java.util.Objects;

import javax.validation.constraints.NotNull;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Extra information about a given entity
 */
@ApiModel(description = "Extra information about a given entity")
@Validated

public class Note   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("author")
  private String author = null;

  @JsonProperty("text")
  private String text = null;

  @JsonProperty("@baseType")
  private String baseType = null;

  @JsonProperty("@type")
  private String type = null;

  public Note id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Identifier of the note within its containing entity (may or may not be globally unique, depending on provider implementation)
   * @return id
  **/
  @ApiModelProperty(value = "Identifier of the note within its containing entity (may or may not be globally unique, depending on provider implementation)")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Note author(String author) {
    this.author = author;
    return this;
  }

  /**
   * Ordering Contact Name
   * @return author
  **/
  @ApiModelProperty(value = "Ordering Contact Name")


  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public Note text(String text) {
    this.text = text;
    return this;
  }

  /**
   * This is instruction for the order(Deliver/Invoive/Special instructions),e.g : \"EMM user : Ricky | EMM order reference: 414270245104581803 | EMM user: Hannah Helps | Equipment account: 349501\"
   * @return text
  **/
  @ApiModelProperty(required = true, value = "This is instruction for the order(Deliver/Invoive/Special instructions),e.g : \"EMM user : Ricky | EMM order reference: 414270245104581803 | EMM user: Hannah Helps | Equipment account: 349501\"")
  @NotNull


  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public Note baseType(String baseType) {
    this.baseType = baseType;
    return this;
  }

  /**
   * Note
   * @return baseType
  **/
  @ApiModelProperty(value = "Note")


  public String getBaseType() {
    return baseType;
  }

  public void setBaseType(String baseType) {
    this.baseType = baseType;
  }

  public Note type(String type) {
    this.type = type;
    return this;
  }

  /**
   * btDeliveryInstruction/btInvoiceInstruction/btSpecialInstruction
   * @return type
  **/
  @ApiModelProperty(value = "btDeliveryInstruction/btInvoiceInstruction/btSpecialInstruction")


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
    Note note = (Note) o;
    return Objects.equals(this.id, note.id) &&
        Objects.equals(this.author, note.author) &&
        Objects.equals(this.text, note.text) &&
        Objects.equals(this.baseType, note.baseType) &&
        Objects.equals(this.type, note.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, author, text, baseType, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Note {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
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

