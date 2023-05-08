package com.onerivet.exception;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.onerivet.model.entity.Response_Api;

@SuppressWarnings("serial")
@RestControllerAdvice
public class GlobalException extends RuntimeException{
	
	@ExceptionHandler(ResourceNotFound.class)
	public Response_Api resourceNotFoundHandler(ResourceNotFound ex) {
		
		String message = ex.getMessage();
		LocalDateTime now = LocalDateTime.now();
		Response_Api responseapi = new Response_Api(message,now);
		
		return responseapi;
	}

}
