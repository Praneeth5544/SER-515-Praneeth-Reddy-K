import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
public class App {

    public void MoreItems()
    {
            ProduceProductMenu ppm =new ProduceProductMenu();
            MeatProductMenu mpm = new MeatProductMenu();
            Scanner sc = new Scanner(System.in);
            System.out.println("Bridge Pattern Implemented");
            System.out.println("--------------------------");
            System.out.println("Enter: 1. MeatProductMenu 2. ProduceProductMenu");
            int opt=sc.nextInt();
            if(opt==1)
            {
                mpm.showMenu(); 
            }
            else
            {
                ppm.showMenu();
            }
    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        // ProduceProductMenu ppm =new ProduceProductMenu();
        // MeatProductMenu mpm = new MeatProductMenu();
        Facade fp= new Facade();
        // Person p =new Person();
        // Seller s= new Seller();
        if(fp.login())
        {
            System.out.println("Bridge Pattern Implemented");
            System.out.println("--------------------------");
            App p = new App();
            p.MoreItems();
            // System.out.println("Enter: 1. MeatProductMenu 2. ProduceProductMenu");
            // int opt=sc.nextInt();
            // if(opt==1)
            // {
            //     mpm.showMenu(); 
            // }
            // else
            // {
            //     ppm.showMenu();
            // }

       // p.showMenu();
        //s.showMenu();
        }


    }
}
