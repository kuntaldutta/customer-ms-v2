/**
 * 
 */
package com.example.customer.model.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.customer.model.Customer;

/**
 * @author kuntdutt
 *
 */
public interface CustomerRepository extends CrudRepository<Customer, Integer> {

}
