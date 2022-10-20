import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Facade fp= new Facade();
        ProduceProductMenu ppm =new ProduceProductMenu();
        if(fp.login())
        ppm.showMenu();

    }
}
