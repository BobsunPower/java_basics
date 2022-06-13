import java.util.Scanner;

public class vacation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double cost = Double.parseDouble(scan.nextLine());
        double savings = Double.parseDouble(scan.nextLine());
        int days = 0; int count = 0;
        while (savings < cost && count < 5) {String input = scan.nextLine(); double sum = Double.parseDouble(scan.nextLine());
            if (input.equals("spend")) {count++;
                if (sum >= savings) {savings = 0;}
                else {savings -= sum;}}
            if (input.equals("save")) {savings += sum; count = 0;}
            days++;}
        if (count == 5) {System.out.printf("You can't save the money.\n %d", days);
        } else {System.out.printf("You saved the money for %d days.", days);}
    }
}