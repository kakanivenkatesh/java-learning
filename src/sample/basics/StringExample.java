package sample.basics;

public class StringExample {
	
	public static void main(String[] args) {
		String str = "Pramati Technologies pvt ltd.";
		
		System.out.println(str.charAt(3));
		System.out.println(str.length());
		System.out.println(str.concat("from hyd"));
		System.out.println(str.equalsIgnoreCase("pramati technologies pvt ltd."));
		System.out.println(str.substring(3));
		System.out.println(str.toLowerCase());
		System.out.println(str.replace("Technologies", "Tech"));
		
	}

}
