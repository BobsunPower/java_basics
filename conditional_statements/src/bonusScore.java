import java.util.Scanner;

public class bonusScore {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        int score = Integer.parseInt(scanner.nextLine());
        double bonus;
        if (score <= 100) {
            bonus = 5;
        } else if (score <= 1000) {
            bonus = score * 0.2;
        } else {
            bonus = score * 0.1;
        }
        if (score % 2 == 0) {
            bonus += 1;
        } else if (score % 10 == 5) {
            bonus += 2;
        }
        System.out.printf(bonus + "\n" + (score + bonus));
    }
}