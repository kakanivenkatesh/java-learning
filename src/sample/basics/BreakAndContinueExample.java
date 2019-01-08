package sample.basics;

public class BreakAndContinueExample {

	public static void main(String[] args) {
		int[] count ={10, 20, 30, 40, 50};
		
		//enhanced for loop
		for (int number : count) {
			if(number==40){
				break;
			}
			System.out.println(" break :"+number);
		}
		for (int number : count) {
		if(number==40){
		continue;
		}
		System.out.println("continue  :"+number);
		}
	}
}