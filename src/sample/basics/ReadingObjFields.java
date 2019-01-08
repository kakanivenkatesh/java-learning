package sample.basics;

public class ReadingObjFields {
	
	public static void main(String[] args) {
		PersionInfo info = new PersionInfo();
		info.setLocation("hyderabad");
		info.setName("Venkatesh Kakani");
		info.setNumber(456);
		System.out.println("Name:"+info.getName());
		System.out.println("Location:"+info.getLocation());
		System.out.println("Number:"+info.getNumber());
	}

}
