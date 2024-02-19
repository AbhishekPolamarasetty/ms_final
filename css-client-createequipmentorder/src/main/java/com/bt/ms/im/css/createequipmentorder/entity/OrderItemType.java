
package com.bt.ms.im.css.createequipmentorder.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Represents the line item being ordered which could be a device, SIM, accessory or service material (like premium delivery)
 * 
 * <p>Java class for OrderItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.ee.co.uk/generic_es/erp/sap/service/EquipmentOrder/EquipmentOrderRequest/v2.0}OrderItem"/>
 *         &lt;element name="price" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="deviceOrSim" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;choice>
 *                     &lt;element name="accountRef">
 *                       &lt;simpleType>
 *                         &lt;restriction base="{http://www.ee.co.uk/common/datatype/DataTypes/v1.0}AccountNumber">
 *                           &lt;maxLength value="20"/>
 *                         &lt;/restriction>
 *                       &lt;/simpleType>
 *                     &lt;/element>
 *                     &lt;element name="accountRefWithConnectionCode">
 *                       &lt;simpleType>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;/restriction>
 *                       &lt;/simpleType>
 *                     &lt;/element>
 *                   &lt;/choice>
 *                   &lt;element name="userDetails" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="userName" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="30"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="msisdn" type="{http://www.ee.co.uk/common/datatype/DataTypes/v1.0}Msisdn" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="products" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="pricePlanCode" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="20"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="addonProductCode" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="20"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
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
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderItemType", propOrder = {
    "onlineOrderItemNumber",
    "onlineOrderParentItemNumber",
    "articleId",
    "quantity",
    "costCentre",
    "price",
    "deviceOrSim"
})
public class OrderItemType
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
    protected double price;
    protected OrderItemType.DeviceOrSim deviceOrSim;

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

    /**
     * Gets the value of the price property.
     * 
     */
    public double getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     */
    public void setPrice(double value) {
        this.price = value;
    }

    /**
     * Gets the value of the deviceOrSim property.
     * 
     * @return
     *     possible object is
     *     {@link OrderItemType.DeviceOrSim }
     *     
     */
    public OrderItemType.DeviceOrSim getDeviceOrSim() {
        return deviceOrSim;
    }

    /**
     * Sets the value of the deviceOrSim property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderItemType.DeviceOrSim }
     *     
     */
    public void setDeviceOrSim(OrderItemType.DeviceOrSim value) {
        this.deviceOrSim = value;
    }

    public OrderItemType withOnlineOrderItemNumber(String value) {
        setOnlineOrderItemNumber(value);
        return this;
    }

    public OrderItemType withOnlineOrderParentItemNumber(String value) {
        setOnlineOrderParentItemNumber(value);
        return this;
    }

    public OrderItemType withArticleId(String value) {
        setArticleId(value);
        return this;
    }

    public OrderItemType withQuantity(Integer value) {
        setQuantity(value);
        return this;
    }

    public OrderItemType withCostCentre(String value) {
        setCostCentre(value);
        return this;
    }

    public OrderItemType withPrice(double value) {
        setPrice(value);
        return this;
    }

    public OrderItemType withDeviceOrSim(OrderItemType.DeviceOrSim value) {
        setDeviceOrSim(value);
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
     *         &lt;choice>
     *           &lt;element name="accountRef">
     *             &lt;simpleType>
     *               &lt;restriction base="{http://www.ee.co.uk/common/datatype/DataTypes/v1.0}AccountNumber">
     *                 &lt;maxLength value="20"/>
     *               &lt;/restriction>
     *             &lt;/simpleType>
     *           &lt;/element>
     *           &lt;element name="accountRefWithConnectionCode">
     *             &lt;simpleType>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;/restriction>
     *             &lt;/simpleType>
     *           &lt;/element>
     *         &lt;/choice>
     *         &lt;element name="userDetails" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="userName" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="30"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="msisdn" type="{http://www.ee.co.uk/common/datatype/DataTypes/v1.0}Msisdn" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="products" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="pricePlanCode" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="20"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="addonProductCode" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="20"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
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
        "accountRefWithConnectionCode",
        "accountRef",
        "userDetails",
        "products"
    })
    public static class DeviceOrSim
        implements Serializable
    {

        protected String accountRefWithConnectionCode;
        protected String accountRef;
        protected List<OrderItemType.DeviceOrSim.UserDetails> userDetails;
        protected OrderItemType.DeviceOrSim.Products products;

        /**
         * Gets the value of the accountRefWithConnectionCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAccountRefWithConnectionCode() {
            return accountRefWithConnectionCode;
        }

        /**
         * Sets the value of the accountRefWithConnectionCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAccountRefWithConnectionCode(String value) {
            this.accountRefWithConnectionCode = value;
        }

        /**
         * Gets the value of the accountRef property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAccountRef() {
            return accountRef;
        }

        /**
         * Sets the value of the accountRef property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAccountRef(String value) {
            this.accountRef = value;
        }

        /**
         * Gets the value of the userDetails property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the userDetails property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getUserDetails().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link OrderItemType.DeviceOrSim.UserDetails }
         * 
         * 
         */
        public List<OrderItemType.DeviceOrSim.UserDetails> getUserDetails() {
            if (userDetails == null) {
                userDetails = new ArrayList<OrderItemType.DeviceOrSim.UserDetails>();
            }
            return this.userDetails;
        }

        /**
         * Gets the value of the products property.
         * 
         * @return
         *     possible object is
         *     {@link OrderItemType.DeviceOrSim.Products }
         *     
         */
        public OrderItemType.DeviceOrSim.Products getProducts() {
            return products;
        }

        /**
         * Sets the value of the products property.
         * 
         * @param value
         *     allowed object is
         *     {@link OrderItemType.DeviceOrSim.Products }
         *     
         */
        public void setProducts(OrderItemType.DeviceOrSim.Products value) {
            this.products = value;
        }

        public OrderItemType.DeviceOrSim withAccountRefWithConnectionCode(String value) {
            setAccountRefWithConnectionCode(value);
            return this;
        }

        public OrderItemType.DeviceOrSim withAccountRef(String value) {
            setAccountRef(value);
            return this;
        }

        public OrderItemType.DeviceOrSim withUserDetails(OrderItemType.DeviceOrSim.UserDetails... values) {
            if (values!= null) {
                for (OrderItemType.DeviceOrSim.UserDetails value: values) {
                    getUserDetails().add(value);
                }
            }
            return this;
        }

        public OrderItemType.DeviceOrSim withUserDetails(Collection<OrderItemType.DeviceOrSim.UserDetails> values) {
            if (values!= null) {
                getUserDetails().addAll(values);
            }
            return this;
        }

        public OrderItemType.DeviceOrSim withProducts(OrderItemType.DeviceOrSim.Products value) {
            setProducts(value);
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
         *         &lt;element name="pricePlanCode" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="20"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="addonProductCode" maxOccurs="unbounded" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="20"/>
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
            "pricePlanCode",
            "addonProductCodes"
        })
        public static class Products
            implements Serializable
        {

            protected String pricePlanCode;
            @XmlElement(name = "addonProductCode")
            protected List<String> addonProductCodes;

            /**
             * Gets the value of the pricePlanCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPricePlanCode() {
                return pricePlanCode;
            }

            /**
             * Sets the value of the pricePlanCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPricePlanCode(String value) {
                this.pricePlanCode = value;
            }

            /**
             * Gets the value of the addonProductCodes property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the addonProductCodes property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getAddonProductCodes().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * 
             * 
             */
            public List<String> getAddonProductCodes() {
                if (addonProductCodes == null) {
                    addonProductCodes = new ArrayList<String>();
                }
                return this.addonProductCodes;
            }

            public OrderItemType.DeviceOrSim.Products withPricePlanCode(String value) {
                setPricePlanCode(value);
                return this;
            }

            public OrderItemType.DeviceOrSim.Products withAddonProductCodes(String... values) {
                if (values!= null) {
                    for (String value: values) {
                        getAddonProductCodes().add(value);
                    }
                }
                return this;
            }

            public OrderItemType.DeviceOrSim.Products withAddonProductCodes(Collection<String> values) {
                if (values!= null) {
                    getAddonProductCodes().addAll(values);
                }
                return this;
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
         *         &lt;element name="userName" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="30"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="msisdn" type="{http://www.ee.co.uk/common/datatype/DataTypes/v1.0}Msisdn" minOccurs="0"/>
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
            "userName",
            "msisdn"
        })
        public static class UserDetails
            implements Serializable
        {

            protected String userName;
            protected String msisdn;

            /**
             * Gets the value of the userName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUserName() {
                return userName;
            }

            /**
             * Sets the value of the userName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUserName(String value) {
                this.userName = value;
            }

            /**
             * Gets the value of the msisdn property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMsisdn() {
                return msisdn;
            }

            /**
             * Sets the value of the msisdn property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMsisdn(String value) {
                this.msisdn = value;
            }

            public OrderItemType.DeviceOrSim.UserDetails withUserName(String value) {
                setUserName(value);
                return this;
            }

            public OrderItemType.DeviceOrSim.UserDetails withMsisdn(String value) {
                setMsisdn(value);
                return this;
            }

        }

    }

}
