package sample.basics;

public class SuperKeyWordChildClass  extends SuperKeyWordParentClass{
	String name = "Pramati";
	
	public SuperKeyWordChildClass(String name, int count) {
		System.out.println("parameterized constructor");
		System.out.println("Company Name: "+name+" Count :"+count);
	}
	
	public SuperKeyWordChildClass() {
		this("Pramati Technologies",1400);
		System.out.println("child class constructor");
		
	}
	
	public void getMessage(){
		System.out.println("from get message");
		System.out.println("name  :"+name);
		System.out.println("super.name  :"+super.name);
		this.getMessage("Pramati-Hyd");
	}
	
	public void getMessage(String name){
		System.out.println("from parameterized get message : "+name);
	}
	
	public static void main(String[] args) {
		SuperKeyWordChildClass subClass = new SuperKeyWordChildClass();
		subClass.getMessage();
	}
	
}
