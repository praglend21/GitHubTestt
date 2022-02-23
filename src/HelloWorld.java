import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner scanuel = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scanuel.next();
        System.out.println("Hello " + name);
    }
}
