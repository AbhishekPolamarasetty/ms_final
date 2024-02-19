
package com.bt.ms.im.css.createequipmentorder.entity;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ee.co.uk/common/message/Fault/v1.0}Fault">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "businessException", namespace = "http://www.ee.co.uk/common/message/BusinessException/v1.0")
public class BusinessException
    extends Fault
    implements Serializable
{


    @Override
    public BusinessException withCode(String value) {
        setCode(value);
        return this;
    }

    @Override
    public BusinessException withFaultDescription(String value) {
        setFaultDescription(value);
        return this;
    }

    @Override
    public BusinessException withSourceSystem(String value) {
        setSourceSystem(value);
        return this;
    }

}
