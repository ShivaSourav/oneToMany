package com.OneToMany_example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.OneToMany_example.demo.Repository.CustomerRepository;
import com.OneToMany_example.demo.model.CustomerOrder;

@RestController

public class classController {

	
	@Autowired
	private CustomerRepository cr ;
	@PostMapping(value="/save")
	private String saveEmp(@RequestBody CustomerOrder c)
	{
		cr.save(c);
		return "inserted successfully";
	}
}
