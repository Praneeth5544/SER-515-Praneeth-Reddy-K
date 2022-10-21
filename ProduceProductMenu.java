import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ProduceProductMenu implements ProductMenu {

	public void showMenu() {
		try{
			//File reader to read the content of file
		FileReader fr = new FileReader("C:\\Users\\hp\\Desktop\\SER 515\\Assignment-2-Ind\\SER-515-Praneeth-Reddy-K\\TextFiles\\ProductInfo.txt");
		BufferedReader br=new BufferedReader(fr);
		String st;
		ArrayList<String> ProduceItemList= new ArrayList<String>();
        while ((st = br.readLine()) != null)
		{
			// Tokenizer to separate the words as tokens with a delimitor :
			// Adding all Produce Items into ProduceItemList
		StringTokenizer s =new StringTokenizer(st,":");
		   while(s.hasMoreTokens())
		   {
			String Item=s.nextToken();
			String Value=s.nextToken();
			if(Item.equals("Produce"))
			ProduceItemList.add(Value);
		   }      
		}
		//Displaying the Produce Items List
		System.out.println("Produce Items List");
		for(int i=0;i<ProduceItemList.size();i++)
		{
			System.out.println("Produce :"+ProduceItemList.get(i));
		}

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

	public void showRadioButton() {

	}

	public void showLabels() {

	}

	public void showViewButton() {

	}

	public void showComboxes() {

	}

}
