package com.sample.designpatterns;

public class ImmutableTest{
	public static void main(String[] args) {
		ImmutableExample immutable = new ImmutableExample("Venki", 12268);
		System.out.println(immutable.getEmpID());
		System.out.println(immutable.getname());
		
	}
}
