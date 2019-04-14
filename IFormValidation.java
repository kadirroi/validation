package com.roi.java_validation;

import java.util.List;

public interface IFormValidation {

	IFormValidation addToValidation(Object obj, List<Validation> validations);

	List<String> validate();
}
