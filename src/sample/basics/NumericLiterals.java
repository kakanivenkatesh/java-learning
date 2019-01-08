package sample.basics;

public class NumericLiterals {

	int x =1_000_000;
	int y = 1_2_3_4_5;
	
	//decimal
	int decimal =123;
	//Binary literals
	int a1 = 0B010110;
	int a2 = 0b0101010;
	//OCtal Literals
	int nine =011;
	int eight=010;
	
	//Hexadecimal
	int hexa1=0Xbadcaf;
	Long hexa1ong=0X0123badcafl;
	
	float f = 23.13f;
	char letter = '\u004e';  //Unicode
	public void totalVal(){
		System.out.println("SUM : "+(x+y));
		System.out.println("Binary literals :("+a1+"+"+a2+")="+(a1+a2));
		System.out.println("Binary literals :("+nine+"+"+eight+")="+(nine+eight));
		System.out.println("Hexa: "+hexa1);
		float f = 23.6f;
		int i = (int)f;
		System.out.println("Integer value :"+i);
	}
	public static void main(String[] args) {
		
		new NumericLiterals().totalVal(); 	
	}
}
