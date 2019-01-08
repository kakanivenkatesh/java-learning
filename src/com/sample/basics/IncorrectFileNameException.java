package com.sample.basics;

public class IncorrectFileNameException extends Exception {

	public IncorrectFileNameException(String errorMessage, Throwable error){
	super(errorMessage, error);
}

}
