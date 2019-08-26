package org.dxc.ngoi.order.validateorder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CUSTOMER")
public class Customer {
	
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)	
	@Column(name = "CUSTOMER_ID") 
	private Integer customerId;
	
	@Column(name = "CUSTOMER_NAME") 
	private String customerName;
	
	@Column(name = "REGION")
	private String region;
	
	@Column(name = "ORDERSOURCE")
	private String orderSource;
	
	@Column(name = "ORDERDESTINATION")
	private String orderDestination;	
	
	@Column(name = "DOCUMENT_TYPE")
	private String documentType;	
	
	@Column(name = "CREATED_DATE")
	private String createdDate;
	

}
