import java.util.Scanner;

public class yardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double price = Double.parseDouble(scanner.nextLine()) * 7.61;
        double discount = price * 0.18;
        System.out.printf("The final price is: %.2f lv.%n", price - discount);
        System.out.printf("The discount is: %.2f lv.", discount);
    }
}