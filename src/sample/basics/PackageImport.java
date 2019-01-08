package sample.basics;

import java.text.SimpleDateFormat;
import java.util.Date;

public class PackageImport {

	public static void main(String[] args) {
		SimpleDateFormat sampelDate = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		System.out.println("Time :"+sampelDate.format(new Date().getTime()));

	}

}
