package sample.basics;

public class Operators {

	
public static void main(String[] args) {
	int y = 5;
	int b = y*=5;
	System.out.println(b);
	
	Operators op1 = new Operators();
	Operators op2 = new Operators();
	Operators op3 = op1;
	
	String companyname ="pramati";
	String company_name = "Pramati";
	System.out.println(op1.equals(op2));
	System.out.println(op3.equals(op1));
	System.out.println(company_name.equals(companyname));
	System.out.println(company_name.equals(companyname.toLowerCase()));
	System.out.println(b%4);
	System.out.println("XOR :"+ ((12<14)^(9>3)));

}
}
/*class EnumEqual{
	enum Color {RED, Green}
	public static void main(String[] args) {
		Color c1 = Color.Green;
		Color c2 = Color.RED;
		
		if(c1==c2){
			System.out.println("from ==");
		}
		if(c1.equals(c2)){
			System.out.println("from equals");
		}
		
	}
}*/



