package com.bt.ms.im.entity;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.validation.annotation.Validated;

import com.bt.ms.im.entity.productorder.BillingAccountRef;
import com.bt.ms.im.entity.productorder.Note;
import com.bt.ms.im.entity.productorder.OrderPrice;
import com.bt.ms.im.entity.productorder.ProductOrderItem;
import com.bt.ms.im.entity.productorder.RelatedChannel;
import com.bt.ms.im.entity.productorder.RelatedParty;
import com.bt.ms.im.entity.productorder.RelatedPlaceRefOrValue;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * ProductOrderCreateRequest
 * 
 * @author Shwetha G S
 */
@Validated

public class ProductOrderCreateRequest extends BaseHttpRequest {
	private String trackingHeader;
	private String e2eData;

	public String getTrackingHeader() {
		return trackingHeader;
	}

	public void setTrackingHeader(String trackingHeader) {
		this.trackingHeader = trackingHeader;
	}

	public String getE2eData() {
		return e2eData;
	}

	public void setE2eData(String e2eData) {
		this.e2eData = e2eData;
	}

	@NotNull
	@JsonProperty("btMobileOrderId")
	private String btMobileOrderId = null;

	@NotNull
	@JsonProperty("btMobileOrderType")
	private String btMobileOrderType = null;

	@JsonProperty("description")
	private String description = null;

	@NotNull
	@JsonProperty("externalId")
	private String externalId = null;

	@JsonProperty("requestedCompletionDate")
	private OffsetDateTime requestedCompletionDate = null;

	@JsonProperty("btDeliveryMethod")
	private String btDeliveryMethod = null;

	@JsonProperty("@baseType")
	private String baseType = null;

	@JsonProperty("@type")
	private String type = null;

	@JsonProperty("billingAccount")
	private BillingAccountRef billingAccount = null;

	@JsonProperty("channel")
	private List<RelatedChannel> channel = null;

	@JsonProperty("note")
	private List<Note> note = null;

	@JsonProperty("orderTotalPrice")
	private List<OrderPrice> orderTotalPrice = null;

	@JsonProperty("place")
	private List<RelatedPlaceRefOrValue> place = null;

	@JsonProperty("productOrderItem")
	@Size(min = 1)
	private List<ProductOrderItem> productOrderItem = new ArrayList<>();

	@JsonProperty("relatedParty")
	private List<RelatedParty> relatedParty = null;

	public ProductOrderCreateRequest btMobileOrderId(String btMobileOrderId) {
		this.btMobileOrderId = btMobileOrderId;
		return this;
	}

	/**
	 * Order Id,Order reference used at online shop
	 * 
	 * @return btMobileOrderId
	 **/
	@ApiModelProperty(value = "Order Id,Order reference used at online shop")

	public String getBtMobileOrderId() {
		return btMobileOrderId;
	}

	public void setBtMobileOrderId(String btMobileOrderId) {
		this.btMobileOrderId = btMobileOrderId;
	}

	public ProductOrderCreateRequest btMobileOrderType(String btMobileOrderType) {
		this.btMobileOrderType = btMobileOrderType;
		return this;
	}

	/**
	 * Represents the Order Type, which can identify standard (ZS01) or hot-staged
	 * (ZHOT) orders
	 * 
	 * @return btMobileOrderType
	 **/
	@ApiModelProperty(value = "Represents the Order Type, which can identify standard (ZS01) or hot-staged (ZHOT) orders")

	public String getBtMobileOrderType() {
		return btMobileOrderType;
	}

	public void setBtMobileOrderType(String btMobileOrderType) {
		this.btMobileOrderType = btMobileOrderType;
	}

	public ProductOrderCreateRequest description(String description) {
		this.description = description;
		return this;
	}

	/**
	 * Description of the product order - Digital Mobile Manager Order
	 * 
	 * @return description
	 **/
	@ApiModelProperty(value = "Description of the product order - Digital Mobile Manager Order")

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public ProductOrderCreateRequest externalId(String externalId) {
		this.externalId = externalId;
		return this;
	}

	/**
	 * PO Number given by the consumer and only understandable by him (to facilitate
	 * his searches afterwards)
	 * 
	 * @return externalId
	 **/
	@ApiModelProperty(value = "PO Number given by the consumer and only understandable by him (to facilitate his searches afterwards)")

	public String getExternalId() {
		return externalId;
	}

	public void setExternalId(String externalId) {
		this.externalId = externalId;
	}

	public ProductOrderCreateRequest requestedCompletionDate(OffsetDateTime requestedCompletionDate) {
		this.requestedCompletionDate = requestedCompletionDate;
		return this;
	}

	/**
	 * Requested delivery date from the requestor perspective
	 * 
	 * @return requestedCompletionDate
	 **/
	@ApiModelProperty(value = "Requested delivery date from the requestor perspective")

	@Valid
	public OffsetDateTime getRequestedCompletionDate() {
		return requestedCompletionDate;
	}

	public void setRequestedCompletionDate(OffsetDateTime requestedCompletionDate) {
		this.requestedCompletionDate = requestedCompletionDate;
	}

	public ProductOrderCreateRequest btDeliveryMethod(String btDeliveryMethod) {
		this.btDeliveryMethod = btDeliveryMethod;
		return this;
	}

	/**
	 * DeliveryMethod
	 * 
	 * @return btDeliveryMethod
	 **/
	@ApiModelProperty(value = "DeliveryMethod")

	public String getBtDeliveryMethod() {
		return btDeliveryMethod;
	}

	public void setBtDeliveryMethod(String btDeliveryMethod) {
		this.btDeliveryMethod = btDeliveryMethod;
	}

	public ProductOrderCreateRequest baseType(String baseType) {
		this.baseType = baseType;
		return this;
	}

	/**
	 * ProductOrder
	 * 
	 * @return baseType
	 **/
	@ApiModelProperty(value = "ProductOrder")

	public String getBaseType() {
		return baseType;
	}

	public void setBaseType(String baseType) {
		this.baseType = baseType;
	}

	public ProductOrderCreateRequest type(String type) {
		this.type = type;
		return this;
	}

	/**
	 * btMobileProductOrder
	 * 
	 * @return type
	 **/
	@ApiModelProperty(value = "btMobileProductOrder")

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public ProductOrderCreateRequest billingAccount(BillingAccountRef billingAccount) {
		this.billingAccount = billingAccount;
		return this;
	}

	/**
	 * Get billingAccount
	 * 
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

	public ProductOrderCreateRequest channel(List<RelatedChannel> channel) {
		this.channel = channel;
		return this;
	}

	public ProductOrderCreateRequest addChannelItem(RelatedChannel channelItem) {
		if (this.channel == null) {
			this.channel = new ArrayList<>();
		}
		this.channel.add(channelItem);
		return this;
	}

	/**
	 * Get channel
	 * 
	 * @return channel
	 **/
	@ApiModelProperty(value = "")

	@Valid

	public List<RelatedChannel> getChannel() {
		return channel;
	}

	public void setChannel(List<RelatedChannel> channel) {
		this.channel = channel;
	}

	public ProductOrderCreateRequest note(List<Note> note) {
		this.note = note;
		return this;
	}

	public ProductOrderCreateRequest addNoteItem(Note noteItem) {
		if (this.note == null) {
			this.note = new ArrayList<>();
		}
		this.note.add(noteItem);
		return this;
	}

	/**
	 * Get note
	 * 
	 * @return note
	 **/
	@ApiModelProperty(value = "")

	@Valid

	public List<Note> getNote() {
		return note;
	}

	public void setNote(List<Note> note) {
		this.note = note;
	}

	public ProductOrderCreateRequest orderTotalPrice(List<OrderPrice> orderTotalPrice) {
		this.orderTotalPrice = orderTotalPrice;
		return this;
	}

	public ProductOrderCreateRequest addOrderTotalPriceItem(OrderPrice orderTotalPriceItem) {
		if (this.orderTotalPrice == null) {
			this.orderTotalPrice = new ArrayList<>();
		}
		this.orderTotalPrice.add(orderTotalPriceItem);
		return this;
	}

	/**
	 * Get orderTotalPrice
	 * 
	 * @return orderTotalPrice
	 **/
	@ApiModelProperty(value = "")

	@Valid

	public List<OrderPrice> getOrderTotalPrice() {
		return orderTotalPrice;
	}

	public void setOrderTotalPrice(List<OrderPrice> orderTotalPrice) {
		this.orderTotalPrice = orderTotalPrice;
	}

	public ProductOrderCreateRequest place(List<RelatedPlaceRefOrValue> place) {
		this.place = place;
		return this;
	}

	public ProductOrderCreateRequest addPlaceItem(RelatedPlaceRefOrValue placeItem) {
		if (this.place == null) {
			this.place = new ArrayList<>();
		}
		this.place.add(placeItem);
		return this;
	}

	/**
	 * Get place
	 * 
	 * @return place
	 **/
	@ApiModelProperty(value = "")

	@Valid

	public List<RelatedPlaceRefOrValue> getPlace() {
		return place;
	}

	public void setPlace(List<RelatedPlaceRefOrValue> place) {
		this.place = place;
	}

	public ProductOrderCreateRequest productOrderItem(List<ProductOrderItem> productOrderItem) {
		this.productOrderItem = productOrderItem;
		return this;
	}

	public ProductOrderCreateRequest addProductOrderItemItem(ProductOrderItem productOrderItemItem) {
		this.productOrderItem.add(productOrderItemItem);
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

	public ProductOrderCreateRequest relatedParty(List<RelatedParty> relatedParty) {
		this.relatedParty = relatedParty;
		return this;
	}

	public ProductOrderCreateRequest addRelatedPartyItem(RelatedParty relatedPartyItem) {
		if (this.relatedParty == null) {
			this.relatedParty = new ArrayList<>();
		}
		this.relatedParty.add(relatedPartyItem);
		return this;
	}

	/**
	 * Get relatedParty
	 * 
	 * @return relatedParty
	 **/
	@ApiModelProperty(value = "")

	@Valid

	public List<RelatedParty> getRelatedParty() {
		return relatedParty;
	}

	public void setRelatedParty(List<RelatedParty> relatedParty) {
		this.relatedParty = relatedParty;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ProductOrderCreateRequest ProductOrderCreateRequest = (ProductOrderCreateRequest) o;
		return Objects.equals(this.btMobileOrderId, ProductOrderCreateRequest.btMobileOrderId)
				&& Objects.equals(this.btMobileOrderType, ProductOrderCreateRequest.btMobileOrderType)
				&& Objects.equals(this.description, ProductOrderCreateRequest.description)
				&& Objects.equals(this.externalId, ProductOrderCreateRequest.externalId)
				&& Objects.equals(this.requestedCompletionDate, ProductOrderCreateRequest.requestedCompletionDate)
				&& Objects.equals(this.btDeliveryMethod, ProductOrderCreateRequest.btDeliveryMethod)
				&& Objects.equals(this.baseType, ProductOrderCreateRequest.baseType)
				&& Objects.equals(this.type, ProductOrderCreateRequest.type)
				&& Objects.equals(this.billingAccount, ProductOrderCreateRequest.billingAccount)
				&& Objects.equals(this.channel, ProductOrderCreateRequest.channel)
				&& Objects.equals(this.note, ProductOrderCreateRequest.note)
				&& Objects.equals(this.orderTotalPrice, ProductOrderCreateRequest.orderTotalPrice)
				&& Objects.equals(this.place, ProductOrderCreateRequest.place)
				&& Objects.equals(this.productOrderItem, ProductOrderCreateRequest.productOrderItem)
				&& Objects.equals(this.relatedParty, ProductOrderCreateRequest.relatedParty);
	}

	@Override
	public int hashCode() {
		return Objects.hash(btMobileOrderId, btMobileOrderType, description, externalId, requestedCompletionDate,
				btDeliveryMethod, baseType, type, billingAccount, channel, note, orderTotalPrice, place,
				productOrderItem, relatedParty);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ProductOrderCreateRequest {\n");

		sb.append("    btMobileOrderId: ").append(toIndentedString(btMobileOrderId)).append("\n");
		sb.append("    btMobileOrderType: ").append(toIndentedString(btMobileOrderType)).append("\n");
		sb.append("    description: ").append(toIndentedString(description)).append("\n");
		sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
		sb.append("    requestedCompletionDate: ").append(toIndentedString(requestedCompletionDate)).append("\n");
		sb.append("    btDeliveryMethod: ").append(toIndentedString(btDeliveryMethod)).append("\n");
		sb.append("    baseType: ").append(toIndentedString(baseType)).append("\n");
		sb.append("    type: ").append(toIndentedString(type)).append("\n");
		sb.append("    billingAccount: ").append(toIndentedString(billingAccount)).append("\n");
		sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
		sb.append("    note: ").append(toIndentedString(note)).append("\n");
		sb.append("    orderTotalPrice: ").append(toIndentedString(orderTotalPrice)).append("\n");
		sb.append("    place: ").append(toIndentedString(place)).append("\n");
		sb.append("    productOrderItem: ").append(toIndentedString(productOrderItem)).append("\n");
		sb.append("    relatedParty: ").append(toIndentedString(relatedParty)).append("\n");
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
