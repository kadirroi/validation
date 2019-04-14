package com.roi.java_validation;

import java.util.Arrays;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		String a = "";
		String b = null;
		List<String> result = new FormValidation()
				.addToValidation(a, Arrays.asList(new Validation(Request.REQUIRED, "a boş olamaz")))
				.addToValidation(b, Arrays.asList(new Validation(Request.REQUIRED, "b boş olamaz"))).validate();

		System.out.println(result);

	}
}
