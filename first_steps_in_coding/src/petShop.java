import java.util.Scanner;

public class petShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dogs = Integer.parseInt(scanner.nextLine());
        int cats = Integer.parseInt((scanner.nextLine()));
        double dogFood = 2.50;
        double catFood = 4;
        double total = (dogs * dogFood) + (cats * catFood);
        System.out.printf("%.2f lv.", total);
    }
}