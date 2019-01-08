package sample.basics;

public class ComparingStringAndObjects {

	
	String companyName= new String("Pramati Tech");
	String officeName= new String("Pramati Tech");
	Object obj1 = new Object();
	Object obj2 = new Object();

void sampleExecute(){
	System.out.println("Comparing two strings with == operator: " + companyName==officeName);

	System.out.println("Comparing two strings with .equals: " +companyName.equals(officeName));

	System.out.println("Comparing two different Objects with == operator: " + (obj1==obj2));

	System.out.println("Comparing two different Objects with equals() method: " + obj1.equals(obj2));

	obj1=obj2;
	System.out.println("Comparing two reference pointing to same Object with == operator: " + (obj1==obj2));
}
public static void main(String[] args) {
	new ComparingStringAndObjects().sampleExecute();
}

}
