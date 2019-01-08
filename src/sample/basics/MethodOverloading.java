package sample.basics;

public class MethodOverloading {
	
	public void displySum(int x, int y){
		System.out.println("calling from 1st method : "+(x+y));
		
	}
	public int displySum(int x, int y, int z){
		return x+y+z;
	}
	public double displySum(double x, double y){
		return x+y;
	}

}
