package com.bank;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.client.RestTemplate;

import com.bank.model.Customers;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class CustomerAccountsApplicationTests {

	RestTemplate restTemplate;

	@Before
	public void setUp() {
		restTemplate = new RestTemplate();
	}

	@Test
	public void testGetEmployees() {
		ResponseEntity<Customers> responseEntity = restTemplate.exchange("http://localhost:8080/customers", HttpMethod.GET, null,
				new ParameterizedTypeReference<Customers>() {
				});
		
		assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
		Customers customers = responseEntity.getBody();
		customers.getCustomers().stream().forEach(c -> System.out.println(c.getFirstName()));
	}
}
