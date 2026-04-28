import java.util.Scanner;

public class IOExample {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        System.out.println("What is your favorite color?");
        String color = stdin.nextLine();

        System.out.println("What is your favorite number?");
        String number = stdin.nextLine();

        System.out.println("Favorite color: " + color);
        System.out.println("Favorite number: " + number);
    }
}
