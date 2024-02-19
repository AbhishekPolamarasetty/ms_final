package com.bt.ms.im.entity.productorder;

import java.util.Objects;

import javax.validation.constraints.NotNull;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Related channel to another entity. May be online web, mobile app, social ,etc.
 */
@ApiModel(description = "Related channel to another entity. May be online web, mobile app, social ,etc.")
@Validated

public class RelatedChannel   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("name")
  @NotNull(message="Channel name idenetifier should be either CSS or MDS/CMP Ordering System")
  private String name = null;

  public RelatedChannel id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier of a related entity.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "Unique identifier of a related entity.")
  @NotNull


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public RelatedChannel name(String name) {
    this.name = name;
    return this;
  }

  /**
   * CSS/MDS; Ordering System.
   * @return name
  **/
  @ApiModelProperty(value = "CSS/MDS; Ordering System.")
  
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RelatedChannel relatedChannel = (RelatedChannel) o;
    return Objects.equals(this.id, relatedChannel.id) &&
        Objects.equals(this.name, relatedChannel.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RelatedChannel {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

