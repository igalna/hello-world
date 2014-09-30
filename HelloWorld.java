import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("Your name is " + askName());
    }
    public static String askName() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter your name > ");
        return keyboard.nextLine();
    }
    
}