import java.util.Scanner;

public class fishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println((Double.parseDouble(scanner.nextLine()) * Double.parseDouble(scanner.nextLine()) * Double.parseDouble(scanner.nextLine())) * 0.001 * (1 - (Double.parseDouble(scanner.nextLine()) / 100)));
    }
}