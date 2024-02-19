package com.bt.ms.im.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.stereotype.Component;

import com.bt.ms.im.entity.ProductOrderCreateRequest;
import com.bt.ms.im.exception.StandardError;
import com.bt.ms.im.exception.handler.standardexception.BadRequestException;

@Component
public class RequestValidator {

	public void validateTrackingHeader(String apIGWTrackingHeader) {
		if (apIGWTrackingHeader == null) {
			StandardError errormsg = StandardError.ERR400_25;
			throw new BadRequestException(errormsg);
		}
		String regex = "^[a-z0-9-.:_]{1,256}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(apIGWTrackingHeader);
		boolean dncak = matcher.matches();

		if (!dncak) {
			StandardError errormsg = StandardError.ERR400_26;

			throw new BadRequestException(errormsg);
		}
	}

}
