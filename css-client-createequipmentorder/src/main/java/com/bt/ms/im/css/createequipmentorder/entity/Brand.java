
package com.bt.ms.im.css.createequipmentorder.entity;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Brand.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Brand">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OUK"/>
 *     &lt;enumeration value="TMUK"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Brand", namespace = "http://www.ee.co.uk/common/datatype/DataTypes/v1.0")
@XmlEnum
public enum Brand {

    OUK,
    TMUK;

    public String value() {
        return name();
    }

    public static Brand fromValue(String v) {
        return valueOf(v);
    }

}
