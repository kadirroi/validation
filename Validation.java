package com.roi.java_validation;

enum Request {

	REQUIRED, // calls constructor with value 3
	MIN, // calls constructor with value 2
	MAX, // calls constructor with value 1
	; // semicolon needed when fields / methods follow
}

public class Validation {

	private Request validationRequest;
	private final int argInt;
	private final int arg2Int;
	private final String argString;
	private final String arg2String;
	private final String actionExceptionMessage;

	public Validation(Request validationRequest, String actionExceptionMessage) {
		this(validationRequest, 0, 0, "", "", actionExceptionMessage);
	}

	public Validation(Request validationRequest, String argString, String actionExceptionMessage) {
		this(validationRequest, 0, 0, argString, "", actionExceptionMessage);
	}

	public Validation(Request validationRequest, int argInt, String actionExceptionMessage) {
		this(validationRequest, argInt, 0, "", "", actionExceptionMessage);
	}

	public Validation(Request validationRequest, int argInt, int arg2Int, String argString, String arg2String,
			String actionExceptionMessage) {

		this.validationRequest = validationRequest;
		this.argInt = argInt;
		this.arg2Int = arg2Int;
		this.argString = argString;
		this.arg2String = arg2String;
		this.actionExceptionMessage = actionExceptionMessage;
	}

	public Request getRequest() {
		return validationRequest;
	}

	public void setRequest(Request validationRequest) {
		this.validationRequest = validationRequest;
	}

	public int getArgInt() {
		return argInt;
	}

	public int getArg2Int() {
		return arg2Int;
	}

	public String getArgString() {
		return argString;
	}

	public String getArg2String() {
		return arg2String;
	}

	public String getActionExceptionMessage() {
		return actionExceptionMessage;
	}
}
