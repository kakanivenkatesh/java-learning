package sample.basics;

public class MethodOverriddingAndOverLoading {

	public static void main(String[] args) {
		Organization org = new Organization();
		Organization orgimpl = new OrgImpl();
		org.companyName();  //from parent class
		orgimpl.companyName(); //from child class
		
		MethodOverloading moverload = new MethodOverloading();
		moverload.displySum(20, 30);
		System.out.println("From 2nd method :"+moverload.displySum(20, 30, 10));
		System.out.println("From 2rd method :"+moverload.displySum(12.1, 12.345));
		
	}
}
