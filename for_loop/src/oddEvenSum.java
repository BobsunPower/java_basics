import java.util.Scanner;

public class oddEvenSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int seq = Integer.parseInt(scanner.nextLine());
        int odd = 0; int even = 0;
        for (int i = 1; i <= seq; i++){int cnt = Integer.parseInt(scanner.nextLine());
            if (i % 2 != 0){odd = odd + cnt;} else {even = even + cnt;}}
        if (even == odd){System.out.printf("Yes%nSum = %d", even);}
        else {System.out.printf("No%nDiff = %d", Math.abs(even - odd));}
    }
}