package org.dxc.ngoi.order.validateorder;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
@RestController
public class ValidateOrderExceptionHandler extends ResponseEntityExceptionHandler {
	
	 @ExceptionHandler(Exception.class)
	 public final ResponseEntity<ValidateOrderResponse> handleCustomerNotFoundException(Exception ex, WebRequest request) {
		 ValidateOrderResponse validateOrderResponse = new ValidateOrderResponse();
		 validateOrderResponse.setStatusDesc(ex.getMessage());
		 validateOrderResponse.setStatusCode("512");
		 return new ResponseEntity<>(validateOrderResponse, HttpStatus.INTERNAL_SERVER_ERROR);
	 }
}

