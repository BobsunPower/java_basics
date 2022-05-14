import java.util.Scanner;

public class depositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double deposit = Double.parseDouble(scanner.nextLine());
        int term = Integer.parseInt(scanner.nextLine());
        double interest = Double.parseDouble(scanner.nextLine());
        System.out.println(deposit + (deposit * (interest / 100) / 12 * term));
    }
}