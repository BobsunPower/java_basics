import java.util.Scanner;

public class cleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double age = Integer.parseInt(scanner.nextLine());
        double washingMachine = Double.parseDouble(scanner.nextLine());
        double money = Double.parseDouble(scanner.nextLine()) * (Math.floor(age / 2) + (age % 2));
        for (int i = 1; i <= age; i++) {if (i % 2 == 0) {money += i * 5 - 1;}}
        double dif = Math.abs(money - washingMachine);
        if (money >= washingMachine) {System.out.printf("Yes! %.2f", dif);}
        else {System.out.printf("No! %.2f", dif);}
    }
}