import java.util.Scanner;

public class equalSumsEvenOddPosition {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int start = Integer.parseInt(scan.nextLine());
        int end = Integer.parseInt(scan.nextLine());
        for (int i = start; i <= end; i++) {String num = "" + i; int even = 0; int odd = 0;
            for (int j = 0; j < num.length(); j++) {int digit = Integer.parseInt("" + num.charAt(j));
                if (j % 2 == 0) {even += digit; }
                else {odd += digit;}}
            if (even == odd) {System.out.print(num + " ");}}}
}