package sample.basics;

public class Animals implements Mammal{

	@Override
	public void eat() {
		System.out.println("eating");
		
	}

	@Override
	public void walk() {
		
		System.out.println("walking");
	}

	@Override
	public void sleep() {
		System.out.println("sleeping");
		
	}

}
