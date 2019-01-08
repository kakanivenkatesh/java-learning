package com.sample.basics;

public class EncapsulationImpl {

	public static void main(String[] args) {
		Encapsulation encap = new Encapsulation();
		encap.setId(12172);
		System.out.println("Encap :"+ encap.getId());
		
		System.out.println(encap.getEmployeeCode(12181));
		System.out.println(encap.getEmployeeCode(13014, "Uday"));
		System.out.println(Encapsulation.getEmployeeCode());
		Encapsulation encap_p = new Encapsulation("Pramati");

	}

}
