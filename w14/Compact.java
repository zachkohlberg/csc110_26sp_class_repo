// compact source files import classes on-demand from
// far more packages than standard java files
void main() {
    // scanner is imported on-demand in compact source
    // files, so we don't need to specify the package
    Scanner input = new Scanner(System.in);
    String text = input.nextLine();
    System.out.println("You typed: \"" + text + "\"");
}
