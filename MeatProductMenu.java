import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class MeatProductMenu implements ProductMenu {

	public void showMenu() {
		try{
			Scanner sc= new Scanner(System.in);
			Person p= new Person();
			//File reader to read the content of file
		FileReader fr = new FileReader("C:\\Users\\hp\\Desktop\\SER 515\\Assignment-2-Ind\\SER-515-Praneeth-Reddy-K\\TextFiles\\ProductInfo.txt");
		BufferedReader br=new BufferedReader(fr);
		String st;
		ArrayList<String> MeatItemList= new ArrayList<String>();
        while ((st = br.readLine()) != null)
		{
			// Tokenizer to separate the words as tokens with a delimitor :
			// Adding all Produce Items into ProduceItemList
		StringTokenizer s =new StringTokenizer(st,":");
		   while(s.hasMoreTokens())
		   {
			String Item=s.nextToken();
			String Value=s.nextToken();
			if(Item.equals("Meat"))
			MeatItemList.add(Value);
		   }      
		}
		//Displaying the Produce Items List
		System.out.println("Factory Pattern Implemented");
		System.out.println("------------------------");
		System.out.println("Select Items From List");
		System.out.println("-----------------------");
		System.out.println("Meat Items List");
		for(int i=0;i<MeatItemList.size();i++)
		{
			System.out.println((i+1)+" Meat :"+MeatItemList.get(i));
			
		}
		int item=sc.nextInt();
			p.showMenu();

		}
		catch (FileNotFoundException e) 
		{
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

	public void showComboxes() {

	}

}
