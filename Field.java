package com.roi.java_validation;

import java.util.List;

public class Field {

	private Object obj;
	private List<Validation> validations;

	public Object getObj() {
		return obj;
	}

	public void setObj(Object obj) {
		this.obj = obj;
	}

	public List<Validation> getValidations() {
		return validations;
	}

	public void setValidations(List<Validation> validations) {
		this.validations = validations;
	}

}
