package com.black.gsk.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.reactive.error.ErrorAttributes;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.context.request.WebRequest;

import com.black.gsk.ErrorJson;

@RestController
public class CustomErrorController implements ErrorController{
	
	private static final String path = "/error";
	
	@Value("${debug}")
	private boolean debug;
	@Autowired
	private org.springframework.boot.web.servlet.error.ErrorAttributes errorAttributes;
	
	//@Autowired
	//private org.springframework.boot.web.servlet.error.ErrorAttributes errorAttributes;
	
	
	@RequestMapping(value=path)
	ErrorJson error(HttpServletRequest request, HttpServletResponse response) {
		return new ErrorJson(response.getStatus(),getErrorAttributes(request,debug));
	}
	
	
	private Map<String, Object> getErrorAttributes(HttpServletRequest request, boolean includeStackTrace) {
		RequestAttributes requestAttributes = new ServletRequestAttributes(request);
		Map<String,Object> errorRs = errorAttributes.getErrorAttributes(requestAttributes, includeStackTrace);
		return errorRs;
	}


	@Override
	public String getErrorPath() {
		// TODO Auto-generated method stub
		return path;
	}

}
