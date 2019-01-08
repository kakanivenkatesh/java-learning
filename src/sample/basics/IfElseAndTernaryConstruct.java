package sample.basics;

public class IfElseAndTernaryConstruct {
	
	public void eligibilityCheck(int age){
		if(age>=18){
			System.out.println("you are eligible to vote");
		}
		System.out.println("you are eligible to vote");
		
	}
	public void eligibility(int marks){
		if(marks<35){
			System.out.println("failed");
		}
		else if(marks>=35 && marks <65){
			System.out.println("D");
		}
		else if(marks>=65 && marks <75){
			System.out.println("C");
		}
		else if(marks>=75){
			System.out.println("B ");
		}
		else
		System.out.println("no entry found");
		
	}
	
	public void ternary(int val){
			
	String eligibility= (val>10)? "it's true":"it's false";
	System.out.println("from ternary :"+eligibility);
		
		
	}

	public static void main(String[] args) {
		IfElseAndTernaryConstruct ope= new IfElseAndTernaryConstruct();
		ope.eligibility(60);
		ope.eligibilityCheck(34);
		ope.ternary(21);
		

	}

}
