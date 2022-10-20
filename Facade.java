import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;
public class Facade {

	private int userType;

	private Product theSelectedProduct;

	private int nProductCategory;

	private ClassProductList theProductList;

	private Person thePerson;

	public boolean login() throws IOException {
		Scanner sc = new Scanner(System.in);
		Boolean loginvalid= false;
		System.out.println("Select Login");
		System.out.println("1.Buyer Login ");
		System.out.println("2.Seller Login");
		int opt=sc.nextInt();
		if(opt==1)
		{
		FileReader fr = new FileReader("C:\\Users\\hp\\Desktop\\SER 515\\Assignment-2-Ind\\SER-515-Praneeth-Reddy-K\\TextFiles\\BuyerInfo.txt");
		BufferedReader br=new BufferedReader(fr);
		
        // Declaring loop variable
        String st;
		System.out.println("Enter Username");
		String buyerUserName = sc.next();
		ArrayList<String> buyerArrayList= new ArrayList<String>();
		ArrayList<String> passwordArrayList= new ArrayList<String>();

        while ((st = br.readLine()) != null)
		{
		StringTokenizer s =new StringTokenizer(st,":");
		   while(s.hasMoreTokens())
		   {
			buyerArrayList.add(s.nextToken());
			passwordArrayList.add(s.nextToken());
		   }      
		}
		for(int i=0;i<buyerArrayList.size();i++)
		{   
			if(buyerUserName.equals(buyerArrayList.get(i)))
			{
				System.out.println("Enter Password");
				String buyerPassword= sc.next();
		        if(buyerPassword.equals(passwordArrayList.get(i)))
				{
					loginvalid= true;
					System.out.println("Login Successfull");
					break;
				}
				System.out.println("Invalid Password");
				break;
			}
			else
			{
			if(i==buyerArrayList.size()-1)
			System.out.println("Invalid Username");
			}
		}
		return loginvalid;
	}
	else if(opt==2)
	{
		FileReader fr = new FileReader("C:\\Users\\hp\\Desktop\\SER 515\\Assignment-2-Ind\\SER-515-Praneeth-Reddy-K\\TextFiles\\SellerInfo.txt");
		BufferedReader br=new BufferedReader(fr);
		//Boolean loginvalid= true;
        // Declaring loop variable
        String st;
		System.out.println("Enter Username");
		String buyerUserName = sc.next();
		ArrayList<String> buyerArrayList= new ArrayList<String>();
		ArrayList<String> passwordArrayList= new ArrayList<String>();

        while ((st = br.readLine()) != null)
		{
		StringTokenizer s =new StringTokenizer(st,":");
		   while(s.hasMoreTokens())
		   {
			buyerArrayList.add(s.nextToken());
			passwordArrayList.add(s.nextToken());
		   }      
		}
		for(int i=0;i<buyerArrayList.size();i++)
		{   
			if(buyerUserName.equals(buyerArrayList.get(i)))
			{
				System.out.println("Enter Password");
				String buyerPassword= sc.next();
		        if(buyerPassword.equals(passwordArrayList.get(i)))
				{
					loginvalid= true;
					System.out.println("Login Successfull");
					break;
				}
				System.out.println("Invalid Password");
				break;
			}
			else
			{
			if(i==buyerArrayList.size()-1)
			System.out.println("Invalid Username entered");
			}
		}
		return loginvalid;
	}
	else
	{
		System.out.println("Invalid Option entered. Do you want to select again(Y/N)");
		String opt2=sc.next();
		if(opt2.equals("Y"))
		login();
		else
		System.out.println("Program excited");
        return loginvalid;
	}
	}

	public void addTrading() {

	}

	public void viewTrading() {

	}

	public void decideBidding() {

	}

	public void discussBidding() {

	}

	public void submitBidding() {

	}

	public void remind() {

	}

	public void createUser(UserInfoItem userinfoitem) {

	}

	public void createProductList() {

	}

	public void AttachProductToUser() {

	}

	public void SelectProduct() {

	}

	public void productOperation() {

	}

}
