package com.sample.basics;

public class WrapperClassExample {

	public static void main(String[] args) {
		int i = 23;
		double d = 22.3;
		long l = 12345678;
		float f = 1.2f;
		char c = 'A';
		boolean bool = true;
		
		System.out.println("Primitives :");
		System.out.println("i :"+i+" d:"+d+" l:"+l+" f:"+f+" c:"+c+" bool:"+bool );
		//wrapper
		
		Integer ival = new Integer(i);
		Boolean bval = new Boolean(bool);
		Double dval = new Double(d);
		Float fval = new Float(f);
		Character cval = new Character(c);
		System.out.println("Wrapper:");
		System.out.println("ival :"+ival+" dval:"+dval+" fval:"+fval+" cval:"+cval+" bool:"+bval );
	}
}
