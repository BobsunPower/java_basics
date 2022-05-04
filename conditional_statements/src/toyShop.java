import java.util.Scanner;

public class toyShop {
    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);
        double holiday = Double.parseDouble(scan.nextLine());
        int qtyPuzzle = Integer.parseInt(scan.nextLine());
        int qtyDoll = Integer.parseInt(scan.nextLine());
        int qtyBear = Integer.parseInt(scan.nextLine());
        int qtyMinion = Integer.parseInt(scan.nextLine());
        int qtyTruck = Integer.parseInt(scan.nextLine());
        int qtyToys = qtyPuzzle + qtyDoll + qtyBear + qtyMinion + qtyTruck;
        double toysPrice = (qtyPuzzle * 2.6) + (qtyDoll * 3) + (qtyBear * 4.1) + (qtyMinion * 8.2) + (qtyTruck * 2);
        if (qtyToys >= 50) {
            toysPrice *= 0.75;
        }
        toysPrice *= 0.9;
        double total = Math.abs(toysPrice - holiday);
        if (toysPrice >= holiday) {
            System.out.printf("Yes! %.2f lv left.", total);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", total);
        }
    }
}