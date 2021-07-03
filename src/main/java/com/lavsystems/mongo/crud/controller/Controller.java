package com.lavsystems.mongo.crud.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lavsystems.mongo.crud.model.GetAllResponse;
import com.lavsystems.mongo.crud.service.EmployeeService;

import lombok.extern.slf4j.Slf4j;

/**
 * This clas will be the controller from our application crud.
 * 
 * @author lantonio
 *
 */
@Slf4j
@RestController
@RequestMapping(value = "{employee-crud.basepath}")
public class Controller {

	/**
	 * Instance of {@link EmployeeService}.
	 */
	@Autowired
	public EmployeeService service;
	
	/**
	 * This method will retrieve all the employees in database.
	 * 
	 * @param headers {@link Map}
	 * 
	 * @return {@link ResponseEntity} with {@link GetAllResponse} as object and 200 OK.
	 */
	@GetMapping(value = "${employee-crud.enpoints.get-all}")
	public ResponseEntity<GetAllResponse> getEmployees(@RequestHeader Map<String, String> headers) {
		log.debug("::::::::::::: START -> GET ALL EMPLOYEES ::::::::::::::::::");
		log.debug("HEADERS RECEIVED ON THIS CALL {}", headers);
		
		GetAllResponse response = service.getAll(headers);
		
		log.debug("::::::::::::: FINISH -> GET ALL EMPLOYEES ::::::::::::::::::");
		return new ResponseEntity<GetAllResponse>(response ,HttpStatus.OK);
	}
}
