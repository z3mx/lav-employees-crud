package com.lavsystems.mongo.crud.service;

import java.util.Map;

import com.lavsystems.mongo.crud.model.GetAllResponse;

/**
 * Employee Interface.
 * 
 * @author lantonio
 *
 */
public interface EmployeeService {

	/**
	 * Method will help in its implementation build a list of all employees.
	 * 
	 * @param headers {@link Map}
	 * 
	 * @return {@link GetAllResponse} will retrun a list of employees.
	 */
	GetAllResponse getAll(Map<String, String> headers);
}
