package sample.basics;

public class SwitchStatement {
	
	
	public void apiRequest(String req){
		switch (req) {
		case "Add":
			System.out.println("Add");
			break;
		case "Delete":
			System.out.println("delete");
			break;
		case "Edit":
			System.out.println("edit");
			break;
		default:
			System.out.println("not a vallid one");
			break;
		}
	}

	public static void main(String[] args) {
		new SwitchStatement().apiRequest("Delete");

	}

}
