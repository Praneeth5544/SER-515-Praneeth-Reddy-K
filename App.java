import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        ProduceProductMenu ppm =new ProduceProductMenu();
        MeatProductMenu mpm = new MeatProductMenu();
        if(fp.login())
        {
        ppm.showMenu();
        mpm.showMenu();
        }


    }
}
