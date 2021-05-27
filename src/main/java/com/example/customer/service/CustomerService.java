/**
 * 
 */
package com.example.customer.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.customer.model.Customer;
import com.example.customer.model.repository.CustomerRepository;

/**
 * @author kuntdutt
 *
 */
@Service
public class CustomerService {

	@Autowired
	private CustomerRepository customerRepository;

	public List<Customer> getAllCustomers() {
		List<Customer> customers = new ArrayList<>();
		customerRepository.findAll().forEach(customer -> customers.add(customer));
		return customers;

	}

	public Customer getCustomerById(int id) {
		return customerRepository.findById(id).get();
	}

	public void saveOrUpdateCustomer(Customer customer) {
		customerRepository.save(customer);
	}

	public void deleteById(int id) {
		customerRepository.deleteById(id);
	}

}
