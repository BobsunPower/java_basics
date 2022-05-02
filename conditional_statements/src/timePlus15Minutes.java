import java.util.Scanner;

public class timePlus15Minutes {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine()) + 15;
        if (minutes > 59) {
            hours++;
            minutes %= 60;
        }
        if (hours > 23) {
            hours = 0;
        }
        if (minutes < 10) {
            System.out.printf("%d:%02d", hours, minutes);
        } else {
            System.out.printf("%d:%d", hours, minutes);
        }
    }
}