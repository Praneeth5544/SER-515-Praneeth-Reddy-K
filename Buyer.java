import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Buyer extends Person {

	public void showMenu() {
		try{
			//File reader to read the content of file
		FileReader fr = new FileReader("C:\\Users\\hp\\Desktop\\SER 515\\Assignment-2-Ind\\SER-515-Praneeth-Reddy-K\\TextFiles\\UserProduct.txt");
		BufferedReader br=new BufferedReader(fr);
		String st;
		String slr;
		ArrayList<String> BuyerItemList= new ArrayList<String>();
        while ((st = br.readLine()) != null)
		{
			// Tokenizer to separate the words as tokens with a delimitor :
			// Adding all Seller Items into SellerItemList
		StringTokenizer s =new StringTokenizer(st,":");
		   while(s.hasMoreTokens())
		   {
			String Item=s.nextToken();
			String Value=s.nextToken();
			if(Item.equals("nana"))
			BuyerItemList.add(Value);
		   }      
		}
		//Displaying the Seller Items List
		System.out.println("Seller Items List");
		for(int i=0;i<BuyerItemList.size();i++)
		{
			System.out.println("nana :"+BuyerItemList.get(i));
		}

		}
	public ProductMenu CreateProductMenu() {
		return null;
	}

}
