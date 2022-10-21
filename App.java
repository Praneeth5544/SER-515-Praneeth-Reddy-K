import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        ProduceProductMenu ppm =new ProduceProductMenu();
        MeatProductMenu mpm = new MeatProductMenu();
        Facade fp= new Facade();
        Person p =new Person();
        Seller s= new Seller();
        if(fp.login())
        {
        ppm.showMenu();
        mpm.showMenu();
        p.showMenu();
        s.showMenu();
        }


    }
}
