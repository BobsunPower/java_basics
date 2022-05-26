import java.util.Scanner;

public class leftAndRightSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int seq = Integer.parseInt(scanner.nextLine());
        int left = 0; int right = 0;
        for (int i = 0; i < seq; i++) {int cnt = Integer.parseInt(scanner.nextLine());
            left = left + cnt;}
        for (int i = 0; i < seq; i++) {int currentNum = Integer.parseInt(scanner.nextLine());
            right = right + currentNum;}
        if (left == right) {System.out.printf("Yes, sum = %d", left);}
        else {System.out.printf("No, diff = %d", Math.abs(left - right));}
    }
}