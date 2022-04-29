import java.util.Scanner;

public class sumSeconds {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        int time = Integer.parseInt(scanner.nextLine()) + Integer.parseInt(scanner.nextLine()) + Integer.parseInt(scanner.nextLine());
        int minutes = time / 60;
        int seconds = time % 60;
        if (seconds < 10) {
            System.out.printf("%d:0%d", minutes, seconds);
        } else {
            System.out.printf("%d:%d", minutes, seconds);
        }
    }
}