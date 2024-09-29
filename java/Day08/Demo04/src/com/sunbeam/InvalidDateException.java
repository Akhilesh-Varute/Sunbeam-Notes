package com.sunbeam;

//unchecked exception
public class InvalidDateException extends RuntimeException {

	private String fieldName;
	private int fieldValue;
	
	public InvalidDateException() {
	}
	
	public InvalidDateException(String fieldName, int fieldValue) {
		this.fieldName = fieldName;
		this.fieldValue = fieldValue;
	}

	@Override
	public String toString() {
		return "InvalidDateException [fieldName=" + fieldName + ", fieldValue=" + fieldValue + "]";
	}
	
	
	
	
}
