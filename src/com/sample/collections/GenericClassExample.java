package com.sample.collections;

public class GenericClassExample<T> {

	
/*	private Object obj;

	public Object getObj() {
		return obj;
	}

	public void setObj(Object obj) {
		this.obj = obj;
	}
	
	public static void main(String[] args) {
		GenericClassExample  generic = new GenericClassExample();
		generic.setObj("Pramati");
	String str =(String) generic.getObj();
	}*/
	private T t;
	
	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}

	public static void main(String[] args) {
		GenericClassExample<String> generic = new GenericClassExample<String>();
		generic.setT("Pramati");
		
		GenericClassExample  generic1 = new GenericClassExample();
		generic1.setT("Pramati1");
		generic1.setT(20);
	}
}
