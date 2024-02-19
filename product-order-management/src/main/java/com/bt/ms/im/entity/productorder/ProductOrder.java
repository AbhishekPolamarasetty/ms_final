package com.bt.ms.im.entity.productorder;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.validation.annotation.Validated;

import com.bt.ms.im.entity.BaseResponse;
import com.bt.ms.im.entity.ResponseBean.ResponseStatus;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * A Product Order is a type of order which can be used to place an order
 * between a customer and a service provider or between a service provider and a
 * partner and vice versa,
 */
@ApiModel(description = "A Product Order is a type of order which  can  be used to place an order between a customer and a service provider or between a service provider and a partner and vice versa,")
@Validated
@Getter
@Setter
public class ProductOrder extends BaseResponse {
	private ResponseStatus status;
	private int statusCode;
	private String orderNumber;
	private String btOrderId;

	public String getBtOrderId() {
		return btOrderId;
	}

	public void setBtOrderId(String btOrderId) {
		this.btOrderId = btOrderId;
	}

	public ResponseStatus getStatus() {
		return status;
	}

	public void setStatus(ResponseStatus status) {
		this.status = status;
	}

	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	
	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}
	
	@JsonProperty("productOrderItem")
	@Valid
	private List<ProductOrderItem> productOrderItem = new ArrayList<>();

	public ProductOrder productOrderItem(List<ProductOrderItem> productOrderItem) {
		this.productOrderItem = productOrderItem;
		return this;
	}

	public ProductOrder addProductOrderItem(ProductOrderItem productOrderItem) {
		this.productOrderItem.add(productOrderItem);
		return this;
	}

	/**
	 * Get productOrderItem
	 * 
	 * @return productOrderItem
	 **/
	@ApiModelProperty(required = true, value = "")
	@NotNull

	@Valid
	@Size(min = 1)
	public List<ProductOrderItem> getProductOrderItem() {
		return productOrderItem;
	}

	public void setProductOrderItem(List<ProductOrderItem> productOrderItem) {
		this.productOrderItem = productOrderItem;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null || getClass() != obj.getClass()) {
			return false;
		}
		
		ProductOrder productOrder = (ProductOrder) obj;
		if (status != productOrder.status)
			return false;
		if (statusCode != productOrder.statusCode)
			return false;
		
		if (orderNumber != productOrder.orderNumber)
			return false;
		if (btOrderId != productOrder.btOrderId)
			return false;
		
		return Objects.equals(this.productOrderItem, productOrder.productOrderItem);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + statusCode;
		result = prime * result + ((orderNumber == null) ? 0 : orderNumber.hashCode());
		result = prime * result + ((btOrderId == null) ? 0 : btOrderId.hashCode());
		
		return Objects.hash(productOrderItem) + result;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ProductOrder {\n");
		sb.append("DigitalMobileOrderServiceResponse [status=" + status + ", statusCode=" + statusCode +  ", orderNumber=" + orderNumber + ", btOrderId=" + btOrderId +"]\n");
		sb.append("}");
		return sb.toString();
	}
}
