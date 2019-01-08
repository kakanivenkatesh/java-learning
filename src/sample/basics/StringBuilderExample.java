package sample.basics;

public class StringBuilderExample {
	
	public static void main(String[] args) {
		StringBuilder builder = new StringBuilder("Pramati Tech : ");
		System.out.println(builder);
		builder.append("It's Product based");
		System.out.println(builder);
		builder.insert(13, "Pvt Ltd");
		System.out.println(builder);
	}
}
