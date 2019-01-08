package com.sample.basics;

public class PrimitiveAndObjectReference {

	public static void main(String[] args) {
	
	PrimitiveAndObjectReference ref = new PrimitiveAndObjectReference();
	int count = 12;
	
	ref.getCount(count);
	System.out.println("get count :"+ count +"   //original value not changed");
	
	StringBuilder sb = new StringBuilder("Msg from ouside");
	System.out.println("from sb :"+sb);
	ref.getMesg(sb);
	System.out.println("from sb :"+sb +"   //original value got effected");
	}
	
	void getCount(int val){
		val = 10;
		System.out.println("from primitive :"+ val);
	}
	

	void getMesg(StringBuilder sb){
			sb.append(" got changed");
	}
	
}
