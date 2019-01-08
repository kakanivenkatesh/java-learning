package com.sample.basics;

interface Eatable{  
	 void eat();  
	} 

public class InnerCalssesExample {
	static int count = 20;
	int val =10;
	//static inner class
	static class InnerClass{
		void getMsg(){
			System.out.println("count from static inner class: "+count);
		}
	}

	void getMsg(){
		//Local Inner class
		class LocalInnerClass{
			void getMsg(){
				System.out.println("value from static inner class: "+val);
			}
			
		}
		LocalInnerClass innerClass = new LocalInnerClass();
		innerClass.getMsg();
	}
	public static void main(String[] args) {
		InnerCalssesExample.InnerClass staticInner = new InnerCalssesExample.InnerClass();
		staticInner.getMsg();
		new InnerCalssesExample().getMsg();
		
		//anonymous inner class

		Eatable e=new Eatable(){  
			  public void eat()
			  {
			  System.out.println("nice fruits");
			  }  
			 };  
			 e.eat();
		
	}
}
