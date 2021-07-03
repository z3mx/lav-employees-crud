package com.lavsystems.mongo.crud.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.lavsystems.mongo.crud.model.Employees;
import com.lavsystems.mongo.crud.model.GetAllResponse;
import com.lavsystems.mongo.crud.service.EmployeeService;

import lombok.extern.slf4j.Slf4j;

/**
 * This is an implementation of {@link EmployeeService}.
 * 
 * @author lantonio
 *
 */
@Slf4j
@Service
public class EmployeeServiceImpl implements EmployeeService {

	/**
	 * 
	 */
	@Override
	public GetAllResponse getAll(Map<String, String> headers) {
		log.debug("GETTING FROM DATABASE...");
		
		//////here you can replace with a jdbc Repository to get from Database all the data.
		
		List<Employees> list = new ArrayList<>();
		list.add(Employees.builder().name("Hector").age(32).salary(70000).build());
		list.add(Employees.builder().name("Dominic").age(32).salary(90000).build());
		list.add(Employees.builder().name("Paul").age(32).salary(60000).build());
		
		return GetAllResponse.builder()
				.employees(list).build();
	}

}
