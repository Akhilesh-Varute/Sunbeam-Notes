package com.sunbeam;

//checked exception
public class InvalidTimeException extends Exception {
	private String fieldName;
	private int fieldValue;
	
	public InvalidTimeException() {
	}
	
	public InvalidTimeException(String fieldName, int fieldValue) {
		this.fieldName = fieldName;
		this.fieldValue = fieldValue;
	}

	public InvalidTimeException(String fieldName, int fieldValue, String message) {
		super(message);
		this.fieldName = fieldName;
		this.fieldValue = fieldValue;
	}

	@Override
	public String toString() {
		return "InvalidTimeException [fieldName=" + fieldName + ", fieldValue=" + fieldValue + "]"+super.getMessage();
	}
	
	
	

}
