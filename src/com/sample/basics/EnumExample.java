package com.sample.basics;

enum ResumeStatus {
	SUCESS, IN_PROGRESS, NEW
}
public class EnumExample {
	
	public static void main(String[] args) {
		ResumeStatus status = ResumeStatus.IN_PROGRESS;
		System.out.println(status);
	}

}
