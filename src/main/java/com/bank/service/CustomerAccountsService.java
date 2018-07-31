package com.bank.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.bank.model.Customer;
import com.bank.model.Customers;

@Service
public class CustomerAccountsService {

	
	public Customers getCustomers(){
		Customers customers = createCustomers();
		return customers;
	}
	
	private Customers createCustomers(){
		Customers customers = new Customers();
		List<Customer> customerList = new ArrayList<Customer>();
		
		Customer c1 = new Customer();
		c1.setCandidateId(1);
		c1.setFirstName("John");
		c1.setMiddleName("K");
		c1.setLastName("David");
		customerList.add(c1);
		
		Customer c2 = new Customer();
		c2.setCandidateId(2);
		c2.setFirstName("Dave");
		c2.setMiddleName("J");
		c2.setLastName("Miller");
		customerList.add(c2);
		
		customers.setCustomers(customerList);
		return customers;
	}
}
