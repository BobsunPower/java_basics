import java.util.Scanner;
public class invalidNumber {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        if ((num < 100 || num > 200) && num != 0) {
            System.out.println("invalid");
        }
    }
}