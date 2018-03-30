package com.ocularminds.kubernete.customer.data;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ocularminds.kubernete.customer.model.Customer;

public interface CustomerRepository extends MongoRepository<Customer, String> {

	public Customer findByPesel(String pesel);
	public Customer findById(String id);
	
}
