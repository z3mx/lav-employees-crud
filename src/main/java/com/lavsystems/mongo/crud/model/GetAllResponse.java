package com.lavsystems.mongo.crud.model;

import java.util.List;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * This class is to handle getAAll API.
 * 
 * @author lantonio
 *
 */
@Getter
@Setter
@Builder
public class GetAllResponse {

	/**
	 * {@link List} employyees.
	 */
	private List<Employees> employees;
}
