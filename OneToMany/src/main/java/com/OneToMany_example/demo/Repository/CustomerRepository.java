package com.OneToMany_example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.OneToMany_example.demo.model.CustomerOrder;

public interface CustomerRepository extends JpaRepository<CustomerOrder, Integer> {

}
