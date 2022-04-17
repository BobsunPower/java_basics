import java.util.Scanner;

public class greetingByName {
    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hello, " + scan.nextLine() + "!");
    }
}