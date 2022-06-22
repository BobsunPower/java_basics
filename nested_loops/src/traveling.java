import java.util.Scanner;

public class traveling {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String place = scan.nextLine();
        while (!place.equals("End")) {
            double money = Double.parseDouble(scan.nextLine());
            while (money > 0) {money -= Double.parseDouble(scan.nextLine());}
            System.out.printf("Going to %s!%n", place); place = scan.nextLine();
        }
    }
}