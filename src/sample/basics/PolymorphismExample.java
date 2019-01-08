package sample.basics;


import java.util.ArrayList;
import java.util.List;

public class PolymorphismExample {

	public static void main(String[] args) {
		List<Pet> pets = new ArrayList<Pet>();
		
		pets.add(new Dog());
		pets.add(new Cat());
		
		//enhanced for loop
		for (Pet pet : pets) {
			pet.makeSound();
			//pet.getPetsInfo();   //As it's private type Pet is not visible
		}


	}

}
