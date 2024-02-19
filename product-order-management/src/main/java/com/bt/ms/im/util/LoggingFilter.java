package com.bt.ms.im.util;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.util.ContentCachingResponseWrapper;

/**
 * Filter to help logging interceptor
 * @author Suman Mandal
 * 
 */
@Component
public class LoggingFilter implements Filter {
	
	@Value("${spring.service.start.url:/ms/}")
	private String startUrl;

	private static final Logger LOGGER = LoggerFactory.getLogger(LoggingFilter.class);

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		LOGGER.info("########## Initiating LoggingFilter ##########");
	}

	@Override
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
			throws IOException, ServletException {

		HttpServletRequest request = (HttpServletRequest) servletRequest;
		String uri = request.getRequestURI();
		if (uri.contains(startUrl)) {

			HttpServletResponse response = (HttpServletResponse) servletResponse;
			HttpServletRequest requestWrapper = new ResettableRequestServletWrapper(request);
			HttpServletResponse responseWrapper = new ContentCachingResponseWrapper(response);

			filterChain.doFilter(requestWrapper, responseWrapper);
		} else {
			filterChain.doFilter(servletRequest, servletResponse);
		}

	}

	@Override
	public void destroy() {
	}
}
