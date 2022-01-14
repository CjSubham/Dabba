package org.payment.controller;

import java.util.List;

import org.payment.model.PaymentModel;
import org.payment.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PaymentController {
	
	
		@Autowired
		private PaymentRepository paymentRepository;
		//get information
		@GetMapping("payment")//database name
		public List<PaymentModel> getPaymentModel(){
			return this.paymentRepository.findAll();
		}
		//Save Payment Information
		@PostMapping("payment")//database name
		public PaymentModel createPaymentModel(@RequestBody PaymentModel paymentmodel) {
			return this.paymentRepository.save(paymentmodel);
		}
		
		
		
		
		/*
		 * Scanner s=new Scanner(System.in); // This calls in inputs 
		
		
		
		System.out.println("Choose your payment method");
		System.out.println("--------------------------");
		System.out.println("Press 1 for Paytm");
		System.out.println("Press 2 for Phonepe");
		System.out.println("Press 3 for Netbanking");
		System.out.println("Choose your payment method");
		System.out.println("--------------------------");
		int payment = s.nextInt();
		//Condition Statement
		if(payment == 1) {
			System.out.println("Welcome to Paytm");
			System.out.println("--------------------------");
			System.out.println("Enter your card Number");
			long carddetails = s.nextLong();
			
			System.out.println("Enter you card expiry date");
			String date = s.next();
			System.out.println("Enter you cvv");
			int cvv = s.nextInt();
			System.out.println("Thank You Your Payment has been received!");
		}
		else if(payment == 2) {
			System.out.println("Welcome To Phone Pe");
			System.out.println("--------------------------");
			System.out.println("Enter your card Number");
			long carddetails = s.nextLong();
			System.out.println("Enter you card expiry date");
			String date = s.next();
			System.out.println("Enter you cvv");
			int cvv = s.nextInt();
			System.out.println("Thank You Your Payment has been received!");
		}
		else if(payment == 3) {
			System.out.println("Welcome To Internet Banking");
			System.out.println("--------------------------");
			System.out.println("Enter your Account No");
			long carddetails = s.nextLong();
			System.out.println("Enter registered mobile number");
			String date = s.next();
			
			System.out.println("Thank You Your Payment has been received!");
		}
		else {
			System.out.println("Wrong choice");
		}
		
		 */
}


