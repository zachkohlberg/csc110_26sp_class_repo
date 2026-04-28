// we can also use the "import" keyword to import classes from
// packages so we don't need to keep typing the package name
import java.util.Scanner;

// standard java files just import on-demand from the
// java.lang package
public class Standard {
    public static void main(String[] args) {
        // scanner is not imported on-demand in normal
        // java files, so this is an error! (unless we have an
        // import statement)
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();
        System.out.println("You typed: \"" + text + "\"");

        // we can include the package name to fix the error
        // java.util.Scanner input = new java.util.Scanner(System.in);
        // String text = input.nextLine();
        // System.out.println("You typed: \"" + text + "\"");

    }
}
