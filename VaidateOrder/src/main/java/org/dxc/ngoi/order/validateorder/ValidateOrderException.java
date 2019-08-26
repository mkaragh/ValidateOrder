package org.dxc.ngoi.order.validateorder;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ValidateOrderException extends RuntimeException {
	
	public ValidateOrderException(String message) {
		super(message);
	}
}
