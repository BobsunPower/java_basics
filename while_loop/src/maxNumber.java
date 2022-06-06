import java.util.Scanner;

public class maxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num = scanner.nextLine();
        int mxm = Integer.MIN_VALUE;
        while (!num.equals("Stop"))
        {int cnt = Integer.parseInt(num);
            if (cnt > mxm) {mxm = cnt;}
            num = scanner.nextLine();}
        System.out.println(mxm);
    }
}