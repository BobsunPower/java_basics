import java.util.Scanner;

public class foodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double chickenMenu = 10.35 * Double.parseDouble(scanner.nextLine());
        double fishMenu = 12.4 * Double.parseDouble(scanner.nextLine());
        double vegMenu = 8.15 * Double.parseDouble(scanner.nextLine());
        double total = (chickenMenu + fishMenu + vegMenu) * 1.2 + 2.5;
        System.out.println(total);
    }
}