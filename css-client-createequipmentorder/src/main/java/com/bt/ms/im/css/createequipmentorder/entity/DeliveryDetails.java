
package com.bt.ms.im.css.createequipmentorder.entity;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Represents the delivery details for this order
 * 
 * <p>Java class for DeliveryDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeliveryDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="deliveryContact">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="companyName" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="35"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="faoName">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="35"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;choice minOccurs="0">
 *                     &lt;element name="followMyParcel">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="contactMobileNumber" type="{http://www.ee.co.uk/common/datatype/DataTypes/v1.0}Msisdn"/>
 *                             &lt;/sequence>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="contactTelNo" type="{http://www.ee.co.uk/common/datatype/DataTypes/v1.0}TelephonyId"/>
 *                   &lt;/choice>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="address" type="{http://www.ee.co.uk/generic_es/erp/sap/service/EquipmentOrder/EquipmentOrderRequest/v2.0}Address" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeliveryDetails", propOrder = {
    "deliveryContact",
    "address"
})
public class DeliveryDetails
    implements Serializable
{

    @XmlElement(required = true)
    protected DeliveryDetails.DeliveryContact deliveryContact;
    protected Address address;

    /**
     * Gets the value of the deliveryContact property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryDetails.DeliveryContact }
     *     
     */
    public DeliveryDetails.DeliveryContact getDeliveryContact() {
        return deliveryContact;
    }

    /**
     * Sets the value of the deliveryContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryDetails.DeliveryContact }
     *     
     */
    public void setDeliveryContact(DeliveryDetails.DeliveryContact value) {
        this.deliveryContact = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setAddress(Address value) {
        this.address = value;
    }

    public DeliveryDetails withDeliveryContact(DeliveryDetails.DeliveryContact value) {
        setDeliveryContact(value);
        return this;
    }

    public DeliveryDetails withAddress(Address value) {
        setAddress(value);
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
     *         &lt;element name="companyName" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="35"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="faoName">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="35"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;choice minOccurs="0">
     *           &lt;element name="followMyParcel">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   &lt;sequence>
     *                     &lt;element name="contactMobileNumber" type="{http://www.ee.co.uk/common/datatype/DataTypes/v1.0}Msisdn"/>
     *                   &lt;/sequence>
     *                 &lt;/restriction>
     *               &lt;/complexContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *           &lt;element name="contactTelNo" type="{http://www.ee.co.uk/common/datatype/DataTypes/v1.0}TelephonyId"/>
     *         &lt;/choice>
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
        "companyName",
        "faoName",
        "contactTelNo",
        "followMyParcel"
    })
    public static class DeliveryContact
        implements Serializable
    {

        protected String companyName;
        @XmlElement(required = true)
        protected String faoName;
        protected String contactTelNo;
        protected DeliveryDetails.DeliveryContact.FollowMyParcel followMyParcel;

        /**
         * Gets the value of the companyName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCompanyName() {
            return companyName;
        }

        /**
         * Sets the value of the companyName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCompanyName(String value) {
            this.companyName = value;
        }

        /**
         * Gets the value of the faoName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFaoName() {
            return faoName;
        }

        /**
         * Sets the value of the faoName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFaoName(String value) {
            this.faoName = value;
        }

        /**
         * Gets the value of the contactTelNo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getContactTelNo() {
            return contactTelNo;
        }

        /**
         * Sets the value of the contactTelNo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setContactTelNo(String value) {
            this.contactTelNo = value;
        }

        /**
         * Gets the value of the followMyParcel property.
         * 
         * @return
         *     possible object is
         *     {@link DeliveryDetails.DeliveryContact.FollowMyParcel }
         *     
         */
        public DeliveryDetails.DeliveryContact.FollowMyParcel getFollowMyParcel() {
            return followMyParcel;
        }

        /**
         * Sets the value of the followMyParcel property.
         * 
         * @param value
         *     allowed object is
         *     {@link DeliveryDetails.DeliveryContact.FollowMyParcel }
         *     
         */
        public void setFollowMyParcel(DeliveryDetails.DeliveryContact.FollowMyParcel value) {
            this.followMyParcel = value;
        }

        public DeliveryDetails.DeliveryContact withCompanyName(String value) {
            setCompanyName(value);
            return this;
        }

        public DeliveryDetails.DeliveryContact withFaoName(String value) {
            setFaoName(value);
            return this;
        }

        public DeliveryDetails.DeliveryContact withContactTelNo(String value) {
            setContactTelNo(value);
            return this;
        }

        public DeliveryDetails.DeliveryContact withFollowMyParcel(DeliveryDetails.DeliveryContact.FollowMyParcel value) {
            setFollowMyParcel(value);
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
         *         &lt;element name="contactMobileNumber" type="{http://www.ee.co.uk/common/datatype/DataTypes/v1.0}Msisdn"/>
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
            "contactMobileNumber"
        })
        public static class FollowMyParcel
            implements Serializable
        {

            @XmlElement(required = true)
            protected String contactMobileNumber;

            /**
             * Gets the value of the contactMobileNumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getContactMobileNumber() {
                return contactMobileNumber;
            }

            /**
             * Sets the value of the contactMobileNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setContactMobileNumber(String value) {
                this.contactMobileNumber = value;
            }

            public DeliveryDetails.DeliveryContact.FollowMyParcel withContactMobileNumber(String value) {
                setContactMobileNumber(value);
                return this;
            }

        }

    }

}
