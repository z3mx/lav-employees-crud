package com.lavsystems.mongo.crud.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * Employee Model Class.
 * 
 * @author lantonio
 *
 */
@Getter
@Setter
@Builder
public class Employees {

	/**
	 * Name attribute of this object.
	 */
	private String name;
	
	/**
	 * Age attribute of this object.
	 */
	private int age;
	
	/**
	 * Salary attribute of this object.
	 */
	private double salary;
}
