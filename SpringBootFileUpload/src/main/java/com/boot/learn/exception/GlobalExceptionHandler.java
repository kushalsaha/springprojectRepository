package com.boot.learn.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.multipart.MultipartException;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(MultipartException.class)
	public String handleError1(MultipartException e, RedirectAttributes redirectAttributes) {

		redirectAttributes.addFlashAttribute("message", e.getCause().getMessage());
		return "redirect:app/upload";

	}

	@ExceptionHandler(Exception.class)
	public ResponseEntity<ExceptionResponse> handleError(Exception e) {
		ExceptionResponse errorResponse = new ExceptionResponse();
		errorResponse.setErrorCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
		errorResponse.setErrorMessage(e.getMessage());

		return new ResponseEntity<ExceptionResponse>(errorResponse, HttpStatus.INTERNAL_SERVER_ERROR);
	}

}
