package com.roi.java_validation;

public class ValidationUtil {

	public static <T> boolean isNull(T value) {
		return value == null;
	}

	public static <T> boolean isEmpty(T value) {
		return "".equals(value);
	}

	public static <T> boolean isNotNullAndEmpty(T value) {
		return !(isNull(value) || isEmpty(value));
	}

}
