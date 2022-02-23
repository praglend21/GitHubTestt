import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner scanuel = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scanuel.nextLine();
        Scanner scanly = new Scanner(name);
        String finalname = "";
        while(scanly.hasNext()){
            finalname += scanly.next();
            finalname += " ";
        }
        System.out.println("Hello " + finalname);
    }
}
