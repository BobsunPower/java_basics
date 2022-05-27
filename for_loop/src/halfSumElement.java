import java.util.Scanner;

public class halfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int seq = Integer.parseInt(scanner.nextLine());
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < seq; i++) {int cnt = Integer.parseInt(scanner.nextLine());
            sum += cnt;
            if (cnt > max) {max = cnt;}        }
        sum -= max;
        if (max == sum) {System.out.printf("Yes\nSum = %d", max);}
        else {System.out.printf("No\nDiff = %d", Math.abs(max - sum));}
    }
}