package sample.basics;

public class AbstractAndInterfaceExample {
	public static void main(String[] args) {
		AbstractCalssExample impl = new AbstarctImpl();
		impl.getBusinessUnit();
		impl.getCount();
		((AbstarctImpl) impl).getMessage();
		impl.getName();
	}

}
