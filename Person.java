import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Person {

	public void showMenu() {
	
		File Menu = new File("C:\\Users\\hp\\Desktop\\SER 515\\Assignment-2-Ind\\SER-515-Praneeth-Reddy-K\\TextFiles\\UserProduct.txt");
		System.out.println("Person Cart Menu List");
		try (Scanner sc = new Scanner(Menu)) {
			while (sc.hasNextLine())
			System.out.println(sc.nextLine());
		}
	  catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

	public void showAddButton() {

	}

	public void showViewButton() {

	}

	public void showRadioButton() {

	}

	public void showLabels() {

	}

	public ProductMenu CreateProductMenu() {
		return null;
	}

}
