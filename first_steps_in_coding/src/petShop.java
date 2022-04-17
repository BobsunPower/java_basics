import java.util.Scanner;

public class petShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = (Integer.parseInt(scanner.nextLine()) * 2.5) + (Integer.parseInt((scanner.nextLine())) * 4);
        System.out.printf("%.2f lv.", total);
    }
}