
package com.bt.ms.im.css.createequipmentorder.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Represents the request object type for Equipment Order Service.
 * 
 * <p>Java class for createEquipmentOrderRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="createEquipmentOrderRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ee.co.uk/common/message/Request/v1.0}Request">
 *       &lt;sequence>
 *         &lt;element name="message">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="customerDetails">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="equipmentAccountNumber">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="17"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="poNumber">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="35"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="deliveryDetails" type="{http://www.ee.co.uk/generic_es/erp/sap/service/EquipmentOrder/EquipmentOrderRequest/v2.0}DeliveryDetails"/>
 *                             &lt;element name="invoiceDetails" type="{http://www.ee.co.uk/generic_es/erp/sap/service/EquipmentOrder/EquipmentOrderRequest/v2.0}InvoiceDetails" minOccurs="0"/>
 *                             &lt;element name="bookingReference">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="customer" use="required">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                           &lt;maxLength value="20"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                     &lt;attribute name="courier" use="required">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                           &lt;maxLength value="20"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="raisedBy" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="50"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="orderDetails">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="onlineOrderNumber">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="40"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="orderType">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="4"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="item" type="{http://www.ee.co.uk/generic_es/erp/sap/service/EquipmentOrder/EquipmentOrderRequest/v2.0}OrderItemType" maxOccurs="unbounded"/>
 *                             &lt;element name="premiumDelivery" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;group ref="{http://www.ee.co.uk/generic_es/erp/sap/service/EquipmentOrder/EquipmentOrderRequest/v2.0}OrderItem"/>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="deliveryInstructions" type="{http://www.ee.co.uk/generic_es/erp/sap/service/EquipmentOrder/EquipmentOrderRequest/v2.0}AdditionalData" minOccurs="0"/>
 *                             &lt;element name="billingText" type="{http://www.ee.co.uk/generic_es/erp/sap/service/EquipmentOrder/EquipmentOrderRequest/v2.0}AdditionalData" minOccurs="0"/>
 *                             &lt;element name="applyDeliveryBlock" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createEquipmentOrderRequest", propOrder = {
    "message"
})
@XmlRootElement(name = "createEquipmentOrder")
public class CreateEquipmentOrderRequest
    extends Request
    implements Serializable
{

    @XmlElement(required = true)
    protected CreateEquipmentOrderRequest.Message message;

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link CreateEquipmentOrderRequest.Message }
     *     
     */
    public CreateEquipmentOrderRequest.Message getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateEquipmentOrderRequest.Message }
     *     
     */
    public void setMessage(CreateEquipmentOrderRequest.Message value) {
        this.message = value;
    }

    public CreateEquipmentOrderRequest withMessage(CreateEquipmentOrderRequest.Message value) {
        setMessage(value);
        return this;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="customerDetails">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="equipmentAccountNumber">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="17"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="poNumber">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="35"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="deliveryDetails" type="{http://www.ee.co.uk/generic_es/erp/sap/service/EquipmentOrder/EquipmentOrderRequest/v2.0}DeliveryDetails"/>
     *                   &lt;element name="invoiceDetails" type="{http://www.ee.co.uk/generic_es/erp/sap/service/EquipmentOrder/EquipmentOrderRequest/v2.0}InvoiceDetails" minOccurs="0"/>
     *                   &lt;element name="bookingReference">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="customer" use="required">
     *                             &lt;simpleType>
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                 &lt;maxLength value="20"/>
     *                               &lt;/restriction>
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                           &lt;attribute name="courier" use="required">
     *                             &lt;simpleType>
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                 &lt;maxLength value="20"/>
     *                               &lt;/restriction>
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="raisedBy" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="50"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="orderDetails">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="onlineOrderNumber">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="40"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="orderType">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="4"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="item" type="{http://www.ee.co.uk/generic_es/erp/sap/service/EquipmentOrder/EquipmentOrderRequest/v2.0}OrderItemType" maxOccurs="unbounded"/>
     *                   &lt;element name="premiumDelivery" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;group ref="{http://www.ee.co.uk/generic_es/erp/sap/service/EquipmentOrder/EquipmentOrderRequest/v2.0}OrderItem"/>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="deliveryInstructions" type="{http://www.ee.co.uk/generic_es/erp/sap/service/EquipmentOrder/EquipmentOrderRequest/v2.0}AdditionalData" minOccurs="0"/>
     *                   &lt;element name="billingText" type="{http://www.ee.co.uk/generic_es/erp/sap/service/EquipmentOrder/EquipmentOrderRequest/v2.0}AdditionalData" minOccurs="0"/>
     *                   &lt;element name="applyDeliveryBlock" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "customerDetails",
        "orderDetails"
    })
    public static class Message
        implements Serializable
    {

        @XmlElement(required = true)
        protected CreateEquipmentOrderRequest.Message.CustomerDetails customerDetails;
        @XmlElement(required = true)
        protected CreateEquipmentOrderRequest.Message.OrderDetails orderDetails;

        /**
         * Gets the value of the customerDetails property.
         * 
         * @return
         *     possible object is
         *     {@link CreateEquipmentOrderRequest.Message.CustomerDetails }
         *     
         */
        public CreateEquipmentOrderRequest.Message.CustomerDetails getCustomerDetails() {
            return customerDetails;
        }

        /**
         * Sets the value of the customerDetails property.
         * 
         * @param value
         *     allowed object is
         *     {@link CreateEquipmentOrderRequest.Message.CustomerDetails }
         *     
         */
        public void setCustomerDetails(CreateEquipmentOrderRequest.Message.CustomerDetails value) {
            this.customerDetails = value;
        }

        /**
         * Gets the value of the orderDetails property.
         * 
         * @return
         *     possible object is
         *     {@link CreateEquipmentOrderRequest.Message.OrderDetails }
         *     
         */
        public CreateEquipmentOrderRequest.Message.OrderDetails getOrderDetails() {
            return orderDetails;
        }

        /**
         * Sets the value of the orderDetails property.
         * 
         * @param value
         *     allowed object is
         *     {@link CreateEquipmentOrderRequest.Message.OrderDetails }
         *     
         */
        public void setOrderDetails(CreateEquipmentOrderRequest.Message.OrderDetails value) {
            this.orderDetails = value;
        }

        public CreateEquipmentOrderRequest.Message withCustomerDetails(CreateEquipmentOrderRequest.Message.CustomerDetails value) {
            setCustomerDetails(value);
            return this;
        }

        public CreateEquipmentOrderRequest.Message withOrderDetails(CreateEquipmentOrderRequest.Message.OrderDetails value) {
            setOrderDetails(value);
            return this;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="equipmentAccountNumber">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="17"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="poNumber">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="35"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="deliveryDetails" type="{http://www.ee.co.uk/generic_es/erp/sap/service/EquipmentOrder/EquipmentOrderRequest/v2.0}DeliveryDetails"/>
         *         &lt;element name="invoiceDetails" type="{http://www.ee.co.uk/generic_es/erp/sap/service/EquipmentOrder/EquipmentOrderRequest/v2.0}InvoiceDetails" minOccurs="0"/>
         *         &lt;element name="bookingReference">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="customer" use="required">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                       &lt;maxLength value="20"/>
         *                     &lt;/restriction>
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *                 &lt;attribute name="courier" use="required">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                       &lt;maxLength value="20"/>
         *                     &lt;/restriction>
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="raisedBy" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="50"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "equipmentAccountNumber",
            "poNumber",
            "deliveryDetails",
            "invoiceDetails",
            "bookingReference",
            "raisedBy"
        })
        public static class CustomerDetails
            implements Serializable
        {

            @XmlElement(required = true)
            protected String equipmentAccountNumber;
            @XmlElement(required = true)
            protected String poNumber;
            @XmlElement(required = true)
            protected DeliveryDetails deliveryDetails;
            protected InvoiceDetails invoiceDetails;
            @XmlElement(required = true)
            protected CreateEquipmentOrderRequest.Message.CustomerDetails.BookingReference bookingReference;
            protected String raisedBy;

            /**
             * Gets the value of the equipmentAccountNumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEquipmentAccountNumber() {
                return equipmentAccountNumber;
            }

            /**
             * Sets the value of the equipmentAccountNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEquipmentAccountNumber(String value) {
                this.equipmentAccountNumber = value;
            }

            /**
             * Gets the value of the poNumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPoNumber() {
                return poNumber;
            }

            /**
             * Sets the value of the poNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPoNumber(String value) {
                this.poNumber = value;
            }

            /**
             * Gets the value of the deliveryDetails property.
             * 
             * @return
             *     possible object is
             *     {@link DeliveryDetails }
             *     
             */
            public DeliveryDetails getDeliveryDetails() {
                return deliveryDetails;
            }

            /**
             * Sets the value of the deliveryDetails property.
             * 
             * @param value
             *     allowed object is
             *     {@link DeliveryDetails }
             *     
             */
            public void setDeliveryDetails(DeliveryDetails value) {
                this.deliveryDetails = value;
            }

            /**
             * Gets the value of the invoiceDetails property.
             * 
             * @return
             *     possible object is
             *     {@link InvoiceDetails }
             *     
             */
            public InvoiceDetails getInvoiceDetails() {
                return invoiceDetails;
            }

            /**
             * Sets the value of the invoiceDetails property.
             * 
             * @param value
             *     allowed object is
             *     {@link InvoiceDetails }
             *     
             */
            public void setInvoiceDetails(InvoiceDetails value) {
                this.invoiceDetails = value;
            }

            /**
             * Gets the value of the bookingReference property.
             * 
             * @return
             *     possible object is
             *     {@link CreateEquipmentOrderRequest.Message.CustomerDetails.BookingReference }
             *     
             */
            public CreateEquipmentOrderRequest.Message.CustomerDetails.BookingReference getBookingReference() {
                return bookingReference;
            }

            /**
             * Sets the value of the bookingReference property.
             * 
             * @param value
             *     allowed object is
             *     {@link CreateEquipmentOrderRequest.Message.CustomerDetails.BookingReference }
             *     
             */
            public void setBookingReference(CreateEquipmentOrderRequest.Message.CustomerDetails.BookingReference value) {
                this.bookingReference = value;
            }

            /**
             * Gets the value of the raisedBy property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRaisedBy() {
                return raisedBy;
            }

            /**
             * Sets the value of the raisedBy property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRaisedBy(String value) {
                this.raisedBy = value;
            }

            public CreateEquipmentOrderRequest.Message.CustomerDetails withEquipmentAccountNumber(String value) {
                setEquipmentAccountNumber(value);
                return this;
            }

            public CreateEquipmentOrderRequest.Message.CustomerDetails withPoNumber(String value) {
                setPoNumber(value);
                return this;
            }

            public CreateEquipmentOrderRequest.Message.CustomerDetails withDeliveryDetails(DeliveryDetails value) {
                setDeliveryDetails(value);
                return this;
            }

            public CreateEquipmentOrderRequest.Message.CustomerDetails withInvoiceDetails(InvoiceDetails value) {
                setInvoiceDetails(value);
                return this;
            }

            public CreateEquipmentOrderRequest.Message.CustomerDetails withBookingReference(CreateEquipmentOrderRequest.Message.CustomerDetails.BookingReference value) {
                setBookingReference(value);
                return this;
            }

            public CreateEquipmentOrderRequest.Message.CustomerDetails withRaisedBy(String value) {
                setRaisedBy(value);
                return this;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;attribute name="customer" use="required">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *             &lt;maxLength value="20"/>
             *           &lt;/restriction>
             *         &lt;/simpleType>
             *       &lt;/attribute>
             *       &lt;attribute name="courier" use="required">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *             &lt;maxLength value="20"/>
             *           &lt;/restriction>
             *         &lt;/simpleType>
             *       &lt;/attribute>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class BookingReference
                implements Serializable
            {

                @XmlAttribute(required = true)
                protected String customer;
                @XmlAttribute(required = true)
                protected String courier;

                /**
                 * Gets the value of the customer property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCustomer() {
                    return customer;
                }

                /**
                 * Sets the value of the customer property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCustomer(String value) {
                    this.customer = value;
                }

                /**
                 * Gets the value of the courier property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCourier() {
                    return courier;
                }

                /**
                 * Sets the value of the courier property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCourier(String value) {
                    this.courier = value;
                }

                public CreateEquipmentOrderRequest.Message.CustomerDetails.BookingReference withCustomer(String value) {
                    setCustomer(value);
                    return this;
                }

                public CreateEquipmentOrderRequest.Message.CustomerDetails.BookingReference withCourier(String value) {
                    setCourier(value);
                    return this;
                }

            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="onlineOrderNumber">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="40"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="orderType">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="4"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="item" type="{http://www.ee.co.uk/generic_es/erp/sap/service/EquipmentOrder/EquipmentOrderRequest/v2.0}OrderItemType" maxOccurs="unbounded"/>
         *         &lt;element name="premiumDelivery" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;group ref="{http://www.ee.co.uk/generic_es/erp/sap/service/EquipmentOrder/EquipmentOrderRequest/v2.0}OrderItem"/>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="deliveryInstructions" type="{http://www.ee.co.uk/generic_es/erp/sap/service/EquipmentOrder/EquipmentOrderRequest/v2.0}AdditionalData" minOccurs="0"/>
         *         &lt;element name="billingText" type="{http://www.ee.co.uk/generic_es/erp/sap/service/EquipmentOrder/EquipmentOrderRequest/v2.0}AdditionalData" minOccurs="0"/>
         *         &lt;element name="applyDeliveryBlock" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "onlineOrderNumber",
            "orderType",
            "items",
            "premiumDelivery",
            "deliveryInstructions",
            "billingText",
            "applyDeliveryBlock"
        })
        public static class OrderDetails
            implements Serializable
        {

            @XmlElement(required = true)
            protected String onlineOrderNumber;
            @XmlElement(required = true)
            protected String orderType;
            @XmlElement(name = "item", required = true)
            protected List<OrderItemType> items;
            protected CreateEquipmentOrderRequest.Message.OrderDetails.PremiumDelivery premiumDelivery;
            protected AdditionalData deliveryInstructions;
            protected AdditionalData billingText;
            protected Boolean applyDeliveryBlock;

            /**
             * Gets the value of the onlineOrderNumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOnlineOrderNumber() {
                return onlineOrderNumber;
            }

            /**
             * Sets the value of the onlineOrderNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOnlineOrderNumber(String value) {
                this.onlineOrderNumber = value;
            }

            /**
             * Gets the value of the orderType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOrderType() {
                return orderType;
            }

            /**
             * Sets the value of the orderType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOrderType(String value) {
                this.orderType = value;
            }

            /**
             * Gets the value of the items property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the items property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getItems().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link OrderItemType }
             * 
             * 
             */
            public List<OrderItemType> getItems() {
                if (items == null) {
                    items = new ArrayList<OrderItemType>();
                }
                return this.items;
            }

            /**
             * Gets the value of the premiumDelivery property.
             * 
             * @return
             *     possible object is
             *     {@link CreateEquipmentOrderRequest.Message.OrderDetails.PremiumDelivery }
             *     
             */
            public CreateEquipmentOrderRequest.Message.OrderDetails.PremiumDelivery getPremiumDelivery() {
                return premiumDelivery;
            }

            /**
             * Sets the value of the premiumDelivery property.
             * 
             * @param value
             *     allowed object is
             *     {@link CreateEquipmentOrderRequest.Message.OrderDetails.PremiumDelivery }
             *     
             */
            public void setPremiumDelivery(CreateEquipmentOrderRequest.Message.OrderDetails.PremiumDelivery value) {
                this.premiumDelivery = value;
            }

            /**
             * Gets the value of the deliveryInstructions property.
             * 
             * @return
             *     possible object is
             *     {@link AdditionalData }
             *     
             */
            public AdditionalData getDeliveryInstructions() {
                return deliveryInstructions;
            }

            /**
             * Sets the value of the deliveryInstructions property.
             * 
             * @param value
             *     allowed object is
             *     {@link AdditionalData }
             *     
             */
            public void setDeliveryInstructions(AdditionalData value) {
                this.deliveryInstructions = value;
            }

            /**
             * Gets the value of the billingText property.
             * 
             * @return
             *     possible object is
             *     {@link AdditionalData }
             *     
             */
            public AdditionalData getBillingText() {
                return billingText;
            }

            /**
             * Sets the value of the billingText property.
             * 
             * @param value
             *     allowed object is
             *     {@link AdditionalData }
             *     
             */
            public void setBillingText(AdditionalData value) {
                this.billingText = value;
            }

            /**
             * Gets the value of the applyDeliveryBlock property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean getApplyDeliveryBlock() {
                return applyDeliveryBlock;
            }

            /**
             * Sets the value of the applyDeliveryBlock property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setApplyDeliveryBlock(Boolean value) {
                this.applyDeliveryBlock = value;
            }

            public CreateEquipmentOrderRequest.Message.OrderDetails withOnlineOrderNumber(String value) {
                setOnlineOrderNumber(value);
                return this;
            }

            public CreateEquipmentOrderRequest.Message.OrderDetails withOrderType(String value) {
                setOrderType(value);
                return this;
            }

            public CreateEquipmentOrderRequest.Message.OrderDetails withItems(OrderItemType... values) {
                if (values!= null) {
                    for (OrderItemType value: values) {
                        getItems().add(value);
                    }
                }
                return this;
            }

            public CreateEquipmentOrderRequest.Message.OrderDetails withItems(Collection<OrderItemType> values) {
                if (values!= null) {
                    getItems().addAll(values);
                }
                return this;
            }

            public CreateEquipmentOrderRequest.Message.OrderDetails withPremiumDelivery(CreateEquipmentOrderRequest.Message.OrderDetails.PremiumDelivery value) {
                setPremiumDelivery(value);
                return this;
            }

            public CreateEquipmentOrderRequest.Message.OrderDetails withDeliveryInstructions(AdditionalData value) {
                setDeliveryInstructions(value);
                return this;
            }

            public CreateEquipmentOrderRequest.Message.OrderDetails withBillingText(AdditionalData value) {
                setBillingText(value);
                return this;
            }

            public CreateEquipmentOrderRequest.Message.OrderDetails withApplyDeliveryBlock(Boolean value) {
                setApplyDeliveryBlock(value);
                return this;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;group ref="{http://www.ee.co.uk/generic_es/erp/sap/service/EquipmentOrder/EquipmentOrderRequest/v2.0}OrderItem"/>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "onlineOrderItemNumber",
                "onlineOrderParentItemNumber",
                "articleId",
                "quantity",
                "costCentre"
            })
            public static class PremiumDelivery
                implements Serializable
            {

                @XmlElement(required = true)
                protected String onlineOrderItemNumber;
                protected String onlineOrderParentItemNumber;
                @XmlElement(required = true)
                protected String articleId;
                protected Integer quantity;
                @XmlElement(required = true)
                protected String costCentre;

                /**
                 * Gets the value of the onlineOrderItemNumber property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getOnlineOrderItemNumber() {
                    return onlineOrderItemNumber;
                }

                /**
                 * Sets the value of the onlineOrderItemNumber property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setOnlineOrderItemNumber(String value) {
                    this.onlineOrderItemNumber = value;
                }

                /**
                 * Gets the value of the onlineOrderParentItemNumber property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getOnlineOrderParentItemNumber() {
                    return onlineOrderParentItemNumber;
                }

                /**
                 * Sets the value of the onlineOrderParentItemNumber property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setOnlineOrderParentItemNumber(String value) {
                    this.onlineOrderParentItemNumber = value;
                }

                /**
                 * Gets the value of the articleId property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getArticleId() {
                    return articleId;
                }

                /**
                 * Sets the value of the articleId property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setArticleId(String value) {
                    this.articleId = value;
                }

                /**
                 * Gets the value of the quantity property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getQuantity() {
                    return quantity;
                }

                /**
                 * Sets the value of the quantity property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setQuantity(Integer value) {
                    this.quantity = value;
                }

                /**
                 * Gets the value of the costCentre property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCostCentre() {
                    return costCentre;
                }

                /**
                 * Sets the value of the costCentre property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCostCentre(String value) {
                    this.costCentre = value;
                }

                public CreateEquipmentOrderRequest.Message.OrderDetails.PremiumDelivery withOnlineOrderItemNumber(String value) {
                    setOnlineOrderItemNumber(value);
                    return this;
                }

                public CreateEquipmentOrderRequest.Message.OrderDetails.PremiumDelivery withOnlineOrderParentItemNumber(String value) {
                    setOnlineOrderParentItemNumber(value);
                    return this;
                }

                public CreateEquipmentOrderRequest.Message.OrderDetails.PremiumDelivery withArticleId(String value) {
                    setArticleId(value);
                    return this;
                }

                public CreateEquipmentOrderRequest.Message.OrderDetails.PremiumDelivery withQuantity(Integer value) {
                    setQuantity(value);
                    return this;
                }

                public CreateEquipmentOrderRequest.Message.OrderDetails.PremiumDelivery withCostCentre(String value) {
                    setCostCentre(value);
                    return this;
                }

            }

        }

    }

}
