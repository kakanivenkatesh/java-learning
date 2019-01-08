package sample.basics;

public class ArraysExample {
	
public static void main(String[] args) {
	
	int[] days = new int[7];
	int [] days2 = {1,2,3,4,5,6,7};  //one dimensional array
	
	int [][] multi = new int [2][3];
	int [][] multi2 = { { 1, 2 }, { 3, 4, 5 } }; //two dimensional array

	double[] num = new double[3];
	num[0]=10.2;
	num[1]=11.2;
	num[2]=12.2;
	for (double d : num) {
		System.out.println(d);
	}

	for (int i = 0; i < multi2.length; i++) {
		for (int j = 0; j < multi2[i].length; j++) {
			System.out.print(multi2[i][j]);
		}
		System.out.println("");
	}
	}
}
