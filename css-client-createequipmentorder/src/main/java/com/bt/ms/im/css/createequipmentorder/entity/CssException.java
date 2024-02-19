///**
// * 
// */
//package com.bt.ms.im.css.createequipmentorder.entity;
//
//import org.springframework.ws.soap.client.SoapFaultClientException;
//
//import com.bt.ms.im.baseclientexception.BaseClientException;
//import com.bt.ms.im.css.createequipmentorder.entity.Fault;
//
//import lombok.Getter;
//import lombok.Setter;
//
///**
// * @author Shwetha G S
// *
// */
//
//@Getter
//@Setter
//public class CssException extends BaseClientException {
//
//	/**
//	 * 
//	 */
//	private static final long serialVersionUID = 5073790962251139920L;
//	private String faultCode;
//	private String faultString;
//	private String faultActor;
//	
//	private Class<?> detailExceptionType;
//	private String detailCode;
//	private String detailFaultDescription;
//	private String detailSourceSystem;
//	
//	
//	public CssException(String faultCode, String faultString) {
//		super();
//		this.faultCode = faultCode;
//		this.faultString = faultString;
//	}
//	
//	/**
//	 * This class serves as a wrapper class for handling the SoapFaultClientException from BTSEL
//	 * @param soapFaultException
//	 * @param faultDetail
//	 */
//	public CssException(SoapFaultClientException soapFaultException, Fault faultDetail) {
//
//		this.faultCode = soapFaultException.getFaultCode().toString();
//		this.faultString = soapFaultException.getFaultStringOrReason();
//		this.faultActor = soapFaultException.getSoapFault().getFaultActorOrRole();
//		
//		if(null != faultDetail) {
//			this.detailExceptionType = faultDetail.getClass();
//			this.detailCode = faultDetail.getCode();
//			this.detailFaultDescription = faultDetail.getFaultDescription();
//			this.detailSourceSystem = faultDetail.getSourceSystem();
//			super.setReasonCode(this.detailCode);
//			super.setReasonText(this.detailFaultDescription);
//			super.setSourceSystem("CSS");
//		} else {
//			super.setReasonCode(this.faultCode);
//			super.setReasonText(this.faultString);
//			super.setSourceSystem("CSS");
//		}
//	
//	}
//	
//}
