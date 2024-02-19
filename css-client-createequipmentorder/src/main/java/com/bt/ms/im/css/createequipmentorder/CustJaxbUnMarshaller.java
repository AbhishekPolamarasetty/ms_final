package com.bt.ms.im.css.createequipmentorder;

import javax.xml.transform.Source;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.DirectFieldAccessor;
import org.springframework.oxm.XmlMappingException;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.oxm.mime.MimeContainer;
import org.springframework.ws.soap.client.SoapFaultClientException;
import org.springframework.ws.soap.saaj.SaajSoapMessage;

public class CustJaxbUnMarshaller extends Jaxb2Marshaller {

	private final Logger LOGGER = LoggerFactory
            .getLogger(CustJaxbUnMarshaller.class);
    @Override
    public Object unmarshal(Source source) throws XmlMappingException {
    	LOGGER.debug("Inside Custom JaxbWrapper unmarshal");
        return super.unmarshal(source, null);
    }
    @Override
    public Object unmarshal(Source source, MimeContainer mimeContainer)
            throws XmlMappingException {
        LOGGER.debug("Inside Custom JaxbWrapper unmarshal");
        Object mimeMessage = new DirectFieldAccessor(mimeContainer).getPropertyValue("mimeMessage");
        Object unmarshalObject = null;
        if (mimeMessage instanceof SaajSoapMessage) {
            SaajSoapMessage soapMessage = (SaajSoapMessage) mimeMessage;
            String faultReason = soapMessage.getFaultReason();
             if (faultReason != null) {
                throw new SoapFaultClientException(soapMessage);
            } else {
                unmarshalObject = super.unmarshal(source, mimeContainer);
            }
        }
        return unmarshalObject;
    }
}

