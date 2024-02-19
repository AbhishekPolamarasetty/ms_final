package com.bt.ms.im.entity;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * RootException
 */
@Validated

public class RootException   {
  @JsonProperty("source")
  private String source = null;

  @JsonProperty("reasonCode")
  private String reasonCode = null;

  @JsonProperty("reasonText")
  private String reasonText = null;

  public RootException source(String source) {
    this.source = source;
    return this;
  }

  /**
   * Get source
   * @return source
  **/
  @ApiModelProperty(value = "")


  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public RootException reasonCode(String reasonCode) {
    this.reasonCode = reasonCode;
    return this;
  }

  /**
   * Get reasonCode
   * @return reasonCode
  **/
  @ApiModelProperty(value = "")


  public String getReasonCode() {
    return reasonCode;
  }

  public void setReasonCode(String reasonCode) {
    this.reasonCode = reasonCode;
  }

  public RootException reasonText(String reasonText) {
    this.reasonText = reasonText;
    return this;
  }

  /**
   * Get reasonText
   * @return reasonText
  **/
  @ApiModelProperty(value = "")


  public String getReasonText() {
    return reasonText;
  }

  public void setReasonText(String reasonText) {
    this.reasonText = reasonText;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RootException rootException = (RootException) o;
    return Objects.equals(this.source, rootException.source) &&
        Objects.equals(this.reasonCode, rootException.reasonCode) &&
        Objects.equals(this.reasonText, rootException.reasonText);
  }

  @Override
  public int hashCode() {
    return Objects.hash(source, reasonCode, reasonText);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RootException {\n");
    
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    reasonCode: ").append(toIndentedString(reasonCode)).append("\n");
    sb.append("    reasonText: ").append(toIndentedString(reasonText)).append("\n");
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

