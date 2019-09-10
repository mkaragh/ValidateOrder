package org.dxc.ngoi.order.validateorder;

import java.util.List;

import org.dxc.ngoi.order.validateorder.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.apache.commons.lang3.StringUtils;

import com.hp.sales.om.orders.Biztalk1;
import com.hp.sales.om.orders.CustomerReference;

@RestController
@RequestMapping("/order")
public class ValidateOrderController {

	@Autowired
	private CustomerRepository customerRepository;

	@PostMapping("/validate")
	public ValidateOrderResponse validate(@RequestBody ValidateOrderRequest validateOrderRequest) {
		// some empty namespace coming in GSXML needs to be removed
		String updatedGSXML = validateOrderRequest.getInputDoc().replaceAll("xmlns=\\\"\\\"", "");

		Biztalk1 gsxml = XmlObjectUtil.getGSXMLObjFromXML(updatedGSXML);

		ValidateOrderResponse validateOrderResponse = new ValidateOrderResponse();

		// logic to validate gsxml starts here

		// logic to validate gsxml ends here
		
		if(isValidCustomer(gsxml))
		{
			validateOrderResponse.setOutputDoc(XmlObjectUtil.getXMLStringFromGSXMLObj(gsxml));
			validateOrderResponse.setStatusCode("200");
			validateOrderResponse.setStatusDesc("Order validated successfuly");
			return validateOrderResponse;
		}
		else {
			
			 validateOrderResponse.setStatusDesc("Customer Not Found");
			 validateOrderResponse.setStatusCode("511");
			 return validateOrderResponse;
		}
	}

	public boolean isValidCustomer(Biztalk1 gsxml){
		
		List<CustomerReference> customerReferences = gsxml.getBody().getPurchaseOrder().getCustomerReference();
		String customerId;
		
		for(CustomerReference customerReference:customerReferences){
			
			if (customerReference.getBuyerID().getIDType().equals("SLD")){
								
				customerId = customerReference.getBuyerID().getCustIDCode();
				if(StringUtils.isNotEmpty(customerId)){
			
					boolean customerExists = customerRepository.existsById(Integer.parseInt(customerId));
					if(customerExists) {						
						return true;
					}
					else {
						return false;
					}	
				}
			}
		}	
		return false;
	}

}
