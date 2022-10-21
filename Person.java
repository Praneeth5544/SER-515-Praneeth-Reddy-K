import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Person {

	public void showMenu() {
   try{
		App a = new App();
		Scanner sc1 = new Scanner(System.in);
	FileReader fr = new FileReader("C:\\Users\\hp\\Desktop\\SER 515\\Assignment-2-Ind\\SER-515-Praneeth-Reddy-K\\TextFiles\\UserProduct.txt");
	BufferedReader br=new BufferedReader(fr);
	String st;
	System.out.println("ghgjvc");
		System.out.println("Person Cart Menu List");
	    System.out.println("Factory Pattern Implemented");
	    System.out.println("-------------------------------");
	while ((st = br.readLine()) != null)
	{
		// Tokenizer to separate the words as tokens with a delimitor :
		// Adding all Produce Items into ProduceItemList
	   StringTokenizer s =new StringTokenizer(st,":");
	   while(s.hasMoreTokens())
	   {
           System.out.println(s.nextToken()+":"+s.nextToken());
	   }
	}
	System.out.println("Do you want to add more Items(Y/N)");
		String opt=sc1.next();
		if(opt.equals("Y"))
		{
			a.MoreItems();
		}
}
	catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
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
