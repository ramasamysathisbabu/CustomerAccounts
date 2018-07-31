package com.bank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bank.model.Customers;
import com.bank.service.CustomerAccountsService;

@RestController
public class CustomerAccountsController {

	@Autowired
	private CustomerAccountsService customerAccountsService;
	
	@GetMapping(value="/customers")
	public Customers getCustomers(){
		return customerAccountsService.getCustomers();
	}
	
}
