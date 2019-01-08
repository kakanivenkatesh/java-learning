package sample.basics;

import java.util.Iterator;

public class LoopConstructsExample {
	
	public static void main(String[] args) {
		int[] value = {4,5,6};
		int count =4;

		//from for loop
		for (int i = 0; i < value.length; i++) {
			System.out.println("From for loop :"+value[i]);
			
		}
		
		//enahnced for loop
		for (int val : value) {
			System.out.println("From enhanced for loop :"+val);
		}
		
		//While loop
		
		while (count<10) {
			System.out.println("From While loop :"+ count);
			count++;						
		}
		count =1;
		//do while 
		do {
	
			System.out.println("from do-while : "+count);
			count++;
		}
		while (count<=6);
	}
	  
	 
	 

}
