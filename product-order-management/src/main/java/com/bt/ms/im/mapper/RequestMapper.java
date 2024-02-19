package com.bt.ms.im.mapper;

import java.util.List;

//import javax.xml.bind.JAXBElement;

import org.springframework.stereotype.Component;

import com.bt.ms.im.css.createequipmentorder.entity.Address;
import com.bt.ms.im.css.createequipmentorder.entity.CreateEquipmentOrderRequest;
import com.bt.ms.im.css.createequipmentorder.entity.CreateEquipmentOrderRequest.Message;
import com.bt.ms.im.css.createequipmentorder.entity.CreateEquipmentOrderRequest.Message.CustomerDetails;
import com.bt.ms.im.css.createequipmentorder.entity.CreateEquipmentOrderRequest.Message.OrderDetails;
import com.bt.ms.im.css.createequipmentorder.entity.CreateEquipmentOrderRequest.Message.OrderDetails.PremiumDelivery;
//import com.bt.ms.im.css.createequipmentorder.entity.CreateEquipmentOrderResponse;
import com.bt.ms.im.css.createequipmentorder.entity.DeliveryDetails;
import com.bt.ms.im.css.createequipmentorder.entity.DeliveryDetails.DeliveryContact;
import com.bt.ms.im.css.createequipmentorder.entity.InvoiceDetails;
//import com.bt.ms.im.css.createequipmentorder.entity.ObjectFactory;
import com.bt.ms.im.entity.ProductOrderCreateRequest;
import com.bt.ms.im.entity.productorder.AddressRef;
import com.bt.ms.im.entity.productorder.Characteristic;
import com.bt.ms.im.entity.productorder.ContactMedium;
import com.bt.ms.im.entity.productorder.GeographicAddress;
import com.bt.ms.im.entity.productorder.MediumCharacteristic;
import com.bt.ms.im.entity.productorder.Money;
import com.bt.ms.im.entity.productorder.OrderPrice;
import com.bt.ms.im.entity.productorder.Price;
import com.bt.ms.im.entity.productorder.ProductOrderItem;
import com.bt.ms.im.entity.productorder.ProductRefOrValue;
import com.bt.ms.im.entity.productorder.RelatedParty;
import com.bt.ms.im.entity.productorder.RelatedPlaceRefOrValue;

import lombok.extern.slf4j.Slf4j;


@Slf4j
@Component
public class RequestMapper {
	public CreateEquipmentOrderRequest postRequestToCss(ProductOrderCreateRequest request) {
		CreateEquipmentOrderRequest createEquipmentOrderRequest = new CreateEquipmentOrderRequest();
		Message mssgObj = new Message();
		createEquipmentOrderRequest.setMessage(mssgObj);
		CustomerDetails cdetails = new CustomerDetails();
		OrderDetails odetails = new OrderDetails();
		mssgObj.setCustomerDetails(cdetails);
		mssgObj.setOrderDetails(odetails);
		DeliveryDetails ddetails = new DeliveryDetails();
		cdetails.setDeliveryDetails(ddetails);
		DeliveryContact dcontact = new DeliveryContact();
		ddetails.setDeliveryContact(dcontact);
		Address addres = new Address();
		ddetails.setAddress(addres);
		InvoiceDetails idetails = new InvoiceDetails();
		cdetails.setInvoiceDetails(idetails);
		idetails.setAddress(addres);
		PremiumDelivery pdelivery = new PremiumDelivery();
		odetails.setPremiumDelivery(pdelivery);
		if (request.getBillingAccount() != null) {
			String billingId = request.getBillingAccount().getId();
			createEquipmentOrderRequest.getMessage().getCustomerDetails().setEquipmentAccountNumber(billingId);
			log.info(createEquipmentOrderRequest.getMessage().getCustomerDetails().getEquipmentAccountNumber());

		}
		if (request.getExternalId() != null) {
			String externalId = request.getExternalId();
			createEquipmentOrderRequest.getMessage().getCustomerDetails().setPoNumber(externalId);
			log.info(createEquipmentOrderRequest.getMessage().getCustomerDetails().getPoNumber());
		}
		if (request.getRelatedParty() != null) {
			List<RelatedParty> relatedPartyList = request.getRelatedParty();
			for (RelatedParty relatedParty : relatedPartyList) {
				String type = relatedParty.getType();
				String orgName = relatedParty.getOrgName();
				String title = relatedParty.getTitle();
				String givenName = relatedParty.getGivenName();
				String middleName = relatedParty.getMiddleName();
				String familyName = relatedParty.getFamilyName();
				String foaName = title + " " + givenName + " " + middleName + " " + familyName;
				if ("btCustomer".equals(type)) {
					createEquipmentOrderRequest.getMessage().getCustomerDetails().getDeliveryDetails()
							.getDeliveryContact().setCompanyName(orgName);
					log.info(createEquipmentOrderRequest.getMessage().getCustomerDetails().getDeliveryDetails()
							.getDeliveryContact().getCompanyName());
				}
				if ("btCustomerContact".equals(type)) {
					createEquipmentOrderRequest.getMessage().getCustomerDetails().getDeliveryDetails()
							.getDeliveryContact().setFaoName(foaName);
					log.info(createEquipmentOrderRequest.getMessage().getCustomerDetails().getDeliveryDetails()
							.getDeliveryContact().getFaoName());
				}
			}

		}
		if (request.getRelatedParty() != null) {
			List<RelatedParty> relatedPartyList = request.getRelatedParty();
			for (RelatedParty relatedParty : relatedPartyList) {
				String type = relatedParty.getType();
				if ("btCustomerContact".equals(type)) {
					List<ContactMedium> contactmediumList = relatedParty.getContactMedium();
					for (ContactMedium contactMedium : contactmediumList) {
						MediumCharacteristic characteristic = contactMedium.getCharacteristic();
						String phoneNumber = characteristic.getPhoneNumber();
						createEquipmentOrderRequest.getMessage().getCustomerDetails().getDeliveryDetails()
								.getDeliveryContact().setContactTelNo(phoneNumber);
						log.info(createEquipmentOrderRequest.getMessage().getCustomerDetails().getDeliveryDetails()
								.getDeliveryContact().getContactTelNo());
					}
				}

			}
		}
		if (request.getPlace() != null ) {
			List<RelatedPlaceRefOrValue> placeList = request.getPlace();
			for (RelatedPlaceRefOrValue place : placeList) {
				String type = place.getType();
				AddressRef address = place.getAddress();
				GeographicAddress geography = address.getGeographicAddress();
				String locality = geography.getLocality();
					createEquipmentOrderRequest.getMessage().getCustomerDetails().getDeliveryDetails().getAddress().setTown(locality);
					log.info(createEquipmentOrderRequest.getMessage().getCustomerDetails().getDeliveryDetails().getAddress().getTown());
			}
		}
		if (request.getBtMobileOrderId() != null) {
			String mobileOrderId = request.getBtMobileOrderId();
			createEquipmentOrderRequest.getMessage().getOrderDetails().setOnlineOrderNumber(mobileOrderId);
			log.info(createEquipmentOrderRequest.getMessage().getOrderDetails().getOnlineOrderNumber());
		}
		if (request.getBtMobileOrderType()!= null) {
			String mobileOrderType = request.getBtMobileOrderType();
			createEquipmentOrderRequest.getMessage().getOrderDetails().setOrderType(mobileOrderType);
			log.info(createEquipmentOrderRequest.getMessage().getOrderDetails().getOrderType());
		}
		if (request.getProductOrderItem()!= null) {
			List<ProductOrderItem> productOrderItemList = request.getProductOrderItem();
			for (ProductOrderItem productOrderItem :  productOrderItemList) {
				String id = productOrderItem.getId();
				Integer quantity = productOrderItem.getQuantity();
				createEquipmentOrderRequest.getMessage().getOrderDetails().getPremiumDelivery().setOnlineOrderItemNumber(id);
				createEquipmentOrderRequest.getMessage().getOrderDetails().getPremiumDelivery().setQuantity(quantity);
				ProductRefOrValue product = productOrderItem.getProduct();
				List<Characteristic> charsList = product.getProductCharacteristic();
				for (Characteristic chars : charsList ) {
					String name = chars.getName();
					String value = chars.getValue();
					if ("btBillingCostCentre".equals(name));{
						createEquipmentOrderRequest.getMessage().getOrderDetails().getPremiumDelivery().setCostCentre(value);
					}
				}
				String id1 = product.getId();
				createEquipmentOrderRequest.getMessage().getOrderDetails().getPremiumDelivery().setArticleId(id1);	
			}
		}
		
		return createEquipmentOrderRequest ;
	}

}