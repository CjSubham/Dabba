package org.payment.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Payment")
public class PaymentModel {
	@Id
	@Column(name="OrderId")
	private String orderId;
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Transaction_No")//generate
	private String transactionNo;
	@Column(name="Status")
	private String status;
	@Column(name="Payment_Method")
	private String paymentMethod;
	
	//Default COnstructor
	public PaymentModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	//Parametrized Constructor

	public PaymentModel(String orderId, String transactionNo, String status, String paymentMethod) {
		super();
		this.orderId = orderId;
		this.transactionNo = transactionNo;
		this.status = status;
		this.paymentMethod = paymentMethod;
	}
	
	//Getter And Setter Method

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getTransactionNo() {
		return transactionNo;
	}

	public void setTransactionNo(String transactionNo) {
		this.transactionNo = transactionNo;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
		
	
}
