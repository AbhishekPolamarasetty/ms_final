package com.bt.ms.im.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bt.ms.im.config.AppConstants;
import com.bt.ms.im.css.createequipmentorder.entity.CreateEquipmentOrderRequest;
import com.bt.ms.im.css.createequipmentorder.entity.CreateEquipmentOrderResponse;
import com.bt.ms.im.entity.ProductOrderCreateRequest;
import com.bt.ms.im.entity.ResponseBean;
import com.bt.ms.im.entity.productorder.ProductOrder;
import com.bt.ms.im.mapper.RequestMapper;

@Service
public class EqipmentOrderService {

//	@Autowired
//	RequestMapper repo;

	@Autowired
	AppConstants app;

	@Autowired
	RequestMapper mapper;

	public ResponseBean<CreateEquipmentOrderRequest> updateequipmentorder(ProductOrderCreateRequest request) {
		ProductOrder finalResponse;
		CreateEquipmentOrderRequest createEquipmentOrderMapperRequest = mapper.postRequestToCss(request);

//		ResponseBean<CreateEquipmentOrderResponse> createEquipmentOrderResponse = repo.createEquipmentOrder(createEquipmentOrderMapperRequest);
		
		return ResponseBean.of(createEquipmentOrderMapperRequest);
	}
}
