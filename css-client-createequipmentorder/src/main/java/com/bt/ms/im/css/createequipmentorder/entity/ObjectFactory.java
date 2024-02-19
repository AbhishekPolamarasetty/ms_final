
package com.bt.ms.im.css.createequipmentorder.entity;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.bt.ms.im.css.order.entity package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {
	private final static QName _CreateEquipmentOrder_QNAME = new QName("http://www.ee.co.uk/generic_es/erp/sap/service/EquipmentOrder/EquipmentOrderRequest/v2.0", "createEquipmentOrder");
    private final static QName _CreateEquipmentOrderResponse_QNAME = new QName("http://www.ee.co.uk/generic_es/erp/sap/service/EquipmentOrder/EquipmentOrderResponse/v2.0", "createEquipmentOrderResponse");


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.bt.ms.im.css.order.entity
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CreateEquipmentOrderRequest.Message.OrderDetails }
     * 
     */
    public CreateEquipmentOrderRequest.Message.OrderDetails createCreateEquipmentOrderMessageOrderDetails() {
        return new CreateEquipmentOrderRequest.Message.OrderDetails();
    }

    /**
     * Create an instance of {@link Address }
     * 
     */
    public Address createAddress() {
        return new Address();
    }

    /**
     * Create an instance of {@link InvoiceDetails }
     * 
     */
    public InvoiceDetails createInvoiceDetails() {
        return new InvoiceDetails();
    }

    /**
     * Create an instance of {@link TechnicalException }
     * 
     */
    public TechnicalException createTechnicalException() {
        return new TechnicalException();
    }

    /**
     * Create an instance of {@link CreateEquipmentOrderResponse.Message }
     * 
     */
    public CreateEquipmentOrderResponse.Message createCreateEquipmentOrderResponseMessage() {
        return new CreateEquipmentOrderResponse.Message();
    }

    /**
     * Create an instance of {@link Notifications }
     * 
     */
    public Notifications createNotifications() {
        return new Notifications();
    }

    /**
     * Create an instance of {@link Fault }
     * 
     */
    public Fault createFault() {
        return new Fault();
    }

    /**
     * Create an instance of {@link CreateEquipmentOrderRequest }
     * 
     */
    public CreateEquipmentOrderRequest createCreateEquipmentOrder() {
        return new CreateEquipmentOrderRequest();
    }

    /**
     * Create an instance of {@link ResponseMessage }
     * 
     */
    public ResponseMessage createResponseMessage() {
        return new ResponseMessage();
    }

    /**
     * Create an instance of {@link Notifications.Notification }
     * 
     */
    public Notifications.Notification createNotificationsNotification() {
        return new Notifications.Notification();
    }

    /**
     * Create an instance of {@link DeliveryDetails.DeliveryContact }
     * 
     */
    public DeliveryDetails.DeliveryContact createDeliveryDetailsDeliveryContact() {
        return new DeliveryDetails.DeliveryContact();
    }

    /**
     * Create an instance of {@link OrderItemType }
     * 
     */
    public OrderItemType createOrderItemType() {
        return new OrderItemType();
    }

    /**
     * Create an instance of {@link CreateEquipmentOrderRequest.Message.OrderDetails.PremiumDelivery }
     * 
     */
    public CreateEquipmentOrderRequest.Message.OrderDetails.PremiumDelivery createCreateEquipmentOrderMessageOrderDetailsPremiumDelivery() {
        return new CreateEquipmentOrderRequest.Message.OrderDetails.PremiumDelivery();
    }

    /**
     * Create an instance of {@link Request }
     * 
     */
    public Request createRequest() {
        return new Request();
    }

    /**
     * Create an instance of {@link CreateEquipmentOrderResponse }
     * 
     */
    public CreateEquipmentOrderResponse createCreateEquipmentOrderResponse() {
        return new CreateEquipmentOrderResponse();
    }

    /**
     * Create an instance of {@link DeliveryDetails.DeliveryContact.FollowMyParcel }
     * 
     */
    public DeliveryDetails.DeliveryContact.FollowMyParcel createDeliveryDetailsDeliveryContactFollowMyParcel() {
        return new DeliveryDetails.DeliveryContact.FollowMyParcel();
    }

    /**
     * Create an instance of {@link CreateEquipmentOrderRequest.Message.CustomerDetails }
     * 
     */
    public CreateEquipmentOrderRequest.Message.CustomerDetails createCreateEquipmentOrderMessageCustomerDetails() {
        return new CreateEquipmentOrderRequest.Message.CustomerDetails();
    }

    /**
     * Create an instance of {@link DeliveryDetails }
     * 
     */
    public DeliveryDetails createDeliveryDetails() {
        return new DeliveryDetails();
    }

    /**
     * Create an instance of {@link BusinessException }
     * 
     */
    public BusinessException createBusinessException() {
        return new BusinessException();
    }

    /**
     * Create an instance of {@link OrderItemType.DeviceOrSim.Products }
     * 
     */
    public OrderItemType.DeviceOrSim.Products createOrderItemTypeDeviceOrSimProducts() {
        return new OrderItemType.DeviceOrSim.Products();
    }

    /**
     * Create an instance of {@link OrderItemType.DeviceOrSim }
     * 
     */
    public OrderItemType.DeviceOrSim createOrderItemTypeDeviceOrSim() {
        return new OrderItemType.DeviceOrSim();
    }

    /**
     * Create an instance of {@link CreateEquipmentOrderRequest.Message.CustomerDetails.BookingReference }
     * 
     */
    public CreateEquipmentOrderRequest.Message.CustomerDetails.BookingReference createCreateEquipmentOrderMessageCustomerDetailsBookingReference() {
        return new CreateEquipmentOrderRequest.Message.CustomerDetails.BookingReference();
    }

    /**
     * Create an instance of {@link AdditionalData }
     * 
     */
    public AdditionalData createAdditionalData() {
        return new AdditionalData();
    }

    /**
     * Create an instance of {@link OrderItemType.DeviceOrSim.UserDetails }
     * 
     */
    public OrderItemType.DeviceOrSim.UserDetails createOrderItemTypeDeviceOrSimUserDetails() {
        return new OrderItemType.DeviceOrSim.UserDetails();
    }

    /**
     * Create an instance of {@link Response }
     * 
     */
    public Response createResponse() {
        return new Response();
    }

    /**
     * Create an instance of {@link CreateEquipmentOrderRequest.Message }
     * 
     */
    public CreateEquipmentOrderRequest.Message createCreateEquipmentOrderMessage() {
        return new CreateEquipmentOrderRequest.Message();
    }

    /**
     * Create an instance of {@link AdditionalData.TextLine }
     * 
     */
    public AdditionalData.TextLine createAdditionalDataTextLine() {
        return new AdditionalData.TextLine();
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateEquipmentOrderRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateEquipmentOrderRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.ee.co.uk/generic_es/erp/sap/service/EquipmentOrder/EquipmentOrderRequest/v2.0", name = "createEquipmentOrder")
    public JAXBElement<CreateEquipmentOrderRequest> createCreateEquipmentOrder(CreateEquipmentOrderRequest value) {
        return new JAXBElement<CreateEquipmentOrderRequest>(_CreateEquipmentOrder_QNAME, CreateEquipmentOrderRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateEquipmentOrderResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateEquipmentOrderResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.ee.co.uk/generic_es/erp/sap/service/EquipmentOrder/EquipmentOrderResponse/v2.0", name = "createEquipmentOrderResponse")
    public JAXBElement<CreateEquipmentOrderResponse> createCreateEquipmentOrderResponse(CreateEquipmentOrderResponse value) {
        return new JAXBElement<CreateEquipmentOrderResponse>(_CreateEquipmentOrderResponse_QNAME, CreateEquipmentOrderResponse.class, null, value);
    }


}
