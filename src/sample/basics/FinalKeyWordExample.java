package sample.basics;

public class FinalKeyWordExample {
	static final int count=100;
	
	void getCount(){
		System.out.println("count: "+count);
	}
	
	public static void main(String[] args) {
		System.out.println(FinalKeyWordExample.count);
		new FinalKeyWordExample().getCount();
	}
}
