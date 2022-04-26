import java.util.Objects;
import java.util.Scanner;

public class passwordGuess {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        String pwd = scanner.nextLine();
        if (Objects.equals(pwd, "s3cr3t!P@ssw0rd")) {
            System.out.println("Welcome");
        } else {
            System.out.println("Wrong password!");
        }
    }
}
