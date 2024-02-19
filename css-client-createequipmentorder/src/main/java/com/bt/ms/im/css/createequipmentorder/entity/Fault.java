
package com.bt.ms.im.css.createequipmentorder.entity;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * An abstract base type extended by BusinessException and TechnicalException.
 * 
 * <p>Java class for Fault complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Fault">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="faultDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sourceSystem" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Fault", namespace = "http://www.ee.co.uk/common/message/Fault/v1.0", propOrder = {
    "code",
    "faultDescription",
    "sourceSystem"
})
@XmlSeeAlso({
    TechnicalException.class,
    BusinessException.class
})
public class Fault
    implements Serializable
{

    @XmlElement(namespace = "http://www.ee.co.uk/common/message/Fault/v1.0", required = true)
    protected String code;
    @XmlElement(namespace = "http://www.ee.co.uk/common/message/Fault/v1.0", required = true)
    protected String faultDescription;
    @XmlElement(namespace = "http://www.ee.co.uk/common/message/Fault/v1.0", required = true)
    protected String sourceSystem;

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the faultDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaultDescription() {
        return faultDescription;
    }

    /**
     * Sets the value of the faultDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaultDescription(String value) {
        this.faultDescription = value;
    }

    /**
     * Gets the value of the sourceSystem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceSystem() {
        return sourceSystem;
    }

    /**
     * Sets the value of the sourceSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceSystem(String value) {
        this.sourceSystem = value;
    }

    public Fault withCode(String value) {
        setCode(value);
        return this;
    }

    public Fault withFaultDescription(String value) {
        setFaultDescription(value);
        return this;
    }

    public Fault withSourceSystem(String value) {
        setSourceSystem(value);
        return this;
    }

}
