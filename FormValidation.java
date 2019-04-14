package com.roi.java_validation;

import java.util.ArrayList;
import java.util.List;

public class FormValidation implements IFormValidation {

	private List<Field> fields;

	public IFormValidation addToValidation(Object obj, List<Validation> validations) {

		if (fields == null) {
			fields = new ArrayList<Field>();
		}
		Field field = new Field();
		field.setObj(obj);
		field.setValidations(validations);
		fields.add(field);
		return this;
	}

	public List<String> validate() {

		List<String> messages = new ArrayList<String>();

		for (Field field : fields) {

			if (ValidationUtil.isNull(field.getObj())) {
				for (Validation validation : field.getValidations()) {

					if (Request.REQUIRED.equals(validation.getRequest())) {

						messages.add(validation.getActionExceptionMessage());

					}

				}

			}

			if (field.getObj() instanceof String) {

				String value = (String) field.getObj();

				for (Validation validation : field.getValidations()) {

					if (Request.REQUIRED.equals(validation.getRequest())) {
						if (ValidationUtil.isNotNullAndEmpty(value)) {

						} else {

							messages.add(validation.getActionExceptionMessage());
						}
					}

				}

			}

		}

		return messages;
	}

}
