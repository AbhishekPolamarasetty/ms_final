
package com.bt.ms.im.css.createequipmentorder.entity;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResponseMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResponseMessage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="notifications" type="{http://www.ee.co.uk/common/message/Notifications/v1.0}Notifications" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseMessage", namespace = "http://www.ee.co.uk/common/message/ResponseMessage/v1.0", propOrder = {
    "notifications"
})
@XmlSeeAlso({
    com.bt.ms.im.css.createequipmentorder.entity.CreateEquipmentOrderResponse.Message.class
})
public class ResponseMessage
    implements Serializable
{

    protected Notifications notifications;

    /**
     * Gets the value of the notifications property.
     * 
     * @return
     *     possible object is
     *     {@link Notifications }
     *     
     */
    public Notifications getNotifications() {
        return notifications;
    }

    /**
     * Sets the value of the notifications property.
     * 
     * @param value
     *     allowed object is
     *     {@link Notifications }
     *     
     */
    public void setNotifications(Notifications value) {
        this.notifications = value;
    }

    public ResponseMessage withNotifications(Notifications value) {
        setNotifications(value);
        return this;
    }

}
