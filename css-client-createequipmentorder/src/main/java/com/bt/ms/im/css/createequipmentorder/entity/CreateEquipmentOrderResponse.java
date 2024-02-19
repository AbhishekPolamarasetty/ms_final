
package com.bt.ms.im.css.createequipmentorder.entity;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for createEquipmentOrderResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="createEquipmentOrderResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ee.co.uk/common/message/Response/v1.0}Response">
 *       &lt;sequence>
 *         &lt;element name="message">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.ee.co.uk/common/message/ResponseMessage/v1.0}ResponseMessage">
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="orderReference" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
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
@XmlType(name = "createEquipmentOrderResponse", namespace = "http://www.ee.co.uk/generic_es/erp/sap/service/EquipmentOrder/EquipmentOrderResponse/v2.0", propOrder = {
    "message",
    "orderReference"
})
@XmlRootElement(name = "createEquipmentOrderResponse", namespace = "http://www.ee.co.uk/generic_es/erp/sap/service/EquipmentOrder/EquipmentOrderResponse/v2.0")
public class CreateEquipmentOrderResponse
    extends Response
    implements Serializable
{

    @XmlElement(required = true)
    protected CreateEquipmentOrderResponse.Message message;
    protected String orderReference;

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link CreateEquipmentOrderResponse.Message }
     *     
     */
    public CreateEquipmentOrderResponse.Message getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateEquipmentOrderResponse.Message }
     *     
     */
    public void setMessage(CreateEquipmentOrderResponse.Message value) {
        this.message = value;
    }

    /**
     * Gets the value of the orderReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderReference() {
        return orderReference;
    }

    /**
     * Sets the value of the orderReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderReference(String value) {
        this.orderReference = value;
    }

    public CreateEquipmentOrderResponse withMessage(CreateEquipmentOrderResponse.Message value) {
        setMessage(value);
        return this;
    }

    public CreateEquipmentOrderResponse withOrderReference(String value) {
        setOrderReference(value);
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
     *     &lt;extension base="{http://www.ee.co.uk/common/message/ResponseMessage/v1.0}ResponseMessage">
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Message
        extends ResponseMessage
        implements Serializable
    {


        @Override
        public CreateEquipmentOrderResponse.Message withNotifications(Notifications value) {
            setNotifications(value);
            return this;
        }

    }

}
