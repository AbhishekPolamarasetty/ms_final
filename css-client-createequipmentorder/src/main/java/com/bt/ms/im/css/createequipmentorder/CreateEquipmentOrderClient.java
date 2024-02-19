package com.bt.ms.im.css.createequipmentorder;

import java.io.IOException;
import java.util.Arrays;

import javax.xml.bind.JAXBElement;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.oxm.XmlMappingException;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.SoapFaultClientException;
import org.springframework.ws.soap.client.core.SoapActionCallback;

//import com.bt.ms.im.css.createequipmentorder.entity.CssException;
import com.bt.ms.im.css.createequipmentorder.entity.Fault;
import com.bt.ms.im.css.createequipmentorder.entity.ObjectFactory;
import com.bt.ms.im.css.createequipmentorder.entity.CreateEquipmentOrderRequest;
import com.bt.ms.im.css.createequipmentorder.entity.CreateEquipmentOrderResponse;

@EnableConfigurationProperties(CreateEquipmentOrderProperties.class)
public class CreateEquipmentOrderClient extends WebServiceGatewaySupport {
	
	Logger log = LoggerFactory.getLogger(CreateEquipmentOrderClient.class);
	private CreateEquipmentOrderProperties properties;

	public CreateEquipmentOrderClient(CreateEquipmentOrderProperties createEquipmentOrderProperties) {
		super();
		this.properties = createEquipmentOrderProperties;
	}

	public CreateEquipmentOrderResponse createEquipmentOrder(
			CreateEquipmentOrderRequest message) {
		CreateEquipmentOrderRequest request = new CreateEquipmentOrderRequest();
		request.setMessage(message.getMessage());

		try {
		@SuppressWarnings("unchecked")
		JAXBElement<CreateEquipmentOrderResponse> response = (JAXBElement<CreateEquipmentOrderResponse>) getWebServiceTemplate()
				.marshalSendAndReceive(this.properties.getService().getPath(),
						new ObjectFactory().createCreateEquipmentOrder(request),
						new SoapActionCallback(this.properties.getService().getCreateEquipmentOrderSoapAction()));

		return response.getValue();
		} catch (SoapFaultClientException soapFaultException) {

			Fault fault = processFault(soapFaultException);

			/* throw new CssException(soapFaultException, fault); */
			throw new IllegalArgumentException();
		}
	}
	
	/**
	 * @param soapFaultException
	 * @return
	 */
	private Fault processFault(SoapFaultClientException soapFaultException) {

		Fault faultDetail = null;
		try {
			faultDetail = (Fault) getWebServiceTemplate().getUnmarshaller().unmarshal(
					soapFaultException.getSoapFault().getFaultDetail().getDetailEntries().next().getSource());
		
		} catch (XmlMappingException | IOException e) {
			StackTraceElement[] st = e.getStackTrace();
			log.error("Exception cathced at CreateEquipmentOrderClient :: occured on:: {}", Arrays.toString(st));
		}
		return faultDetail;
	}
}
