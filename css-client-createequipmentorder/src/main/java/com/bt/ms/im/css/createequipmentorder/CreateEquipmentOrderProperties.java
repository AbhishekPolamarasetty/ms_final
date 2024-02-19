package com.bt.ms.im.css.createequipmentorder;


import javax.validation.Valid;
import javax.validation.constraints.NotBlank;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.annotation.Validated;

@Validated
@Configuration
@ConfigurationProperties("css.createequipmentorder")
public class CreateEquipmentOrderProperties {

	private static final int DEFAULT_READ_TIMEOUT_SECONDS = 10;

	private static final int DEFAULT_CONNECTION_TIMEOUT_SECONDS = 5;

	@Valid
	private Service service;

	public static class Service {

		@NotBlank
		private String path;

		private String createEquipmentOrderSoapAction = "http://www.ee.co.uk/generic_es/erp/sap/service/EquipmentOrder/v2.0/EquipmentOrder/createEquipmentOrderRequest";
		  private int readTimeoutSeconds = DEFAULT_READ_TIMEOUT_SECONDS;

		    private int connectionTimeoutSeconds = DEFAULT_CONNECTION_TIMEOUT_SECONDS;
		public String getPath() {
			return path;
		}

		public void setPath(String path) {
			this.path = path;
		}

		public String getCreateEquipmentOrderSoapAction() {
			return createEquipmentOrderSoapAction;
		}

		public void setCreateEquipmentOrderSoapAction(String createEquipmentOrderSoapAction) {
			this.createEquipmentOrderSoapAction = createEquipmentOrderSoapAction;
		}

		public int getReadTimeoutSeconds() {
			return readTimeoutSeconds;
		}

		public void setReadTimeoutSeconds(int readTimeoutSeconds) {
			this.readTimeoutSeconds = readTimeoutSeconds;
		}

		public int getConnectionTimeoutSeconds() {
			return connectionTimeoutSeconds;
		}

		public void setConnectionTimeoutSeconds(int connectionTimeoutSeconds) {
			this.connectionTimeoutSeconds = connectionTimeoutSeconds;
		}

		/*
		 * private int readTimeoutSeconds = DEFAULT_READ_TIMEOUT_SECONDS;
		 * 
		 * private int connectionTimeoutSeconds = DEFAULT_CONNECTION_TIMEOUT_SECONDS;
		 */
	}

	public Service getService() {
		return service;
	}

	public void setService(Service service) {
		this.service = service;
	}
}
