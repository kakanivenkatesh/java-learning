package sample.basics;

public class UpcastingAndDownCasting {

	public static void main(String[] args) {
		
		ClassABC a1 = new ClassABC();
		Animals animal = (Animals)a1;  //upcasting
		a1.eat();
		animal.eat();
		
		Animals animal2 = new ClassXYZ();
		
		if (animal2 instanceof ClassXYZ){
		ClassXYZ xyz = (ClassXYZ)animal2;
		xyz.fromClassXYZ();
		}

	}

}
