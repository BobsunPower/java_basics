import java.util.Scanner;

public class minNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num = scanner.nextLine();
        int mnm = Integer.MAX_VALUE;
        while (!num.equals("Stop"))
        {int cnt = Integer.parseInt(num);
            if (cnt < mnm) {mnm = cnt;}
            num = scanner.nextLine();}
        System.out.println(mnm);
    }
}