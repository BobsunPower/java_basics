import java.util.Scanner;

public class histogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int seq = Integer.parseInt(scanner.nextLine());
        double under200 = 0; double under400 = 0; double under600 = 0; double under800 = 0; double above799 = 0;
        for (int i = 1; i <= seq; i++) {int num = Integer.parseInt(scanner.nextLine());
            if (num < 200) {under200++;}
            else if (num < 400) {under400++;}
            else if (num < 600) {under600++;}
            else if (num < 800) {under800++;}
            else {above799++;}}
        System.out.printf("%.2f%%\n%.2f%%\n%.2f%%\n%.2f%%\n%.2f%%", under200 / seq * 100, under400 / seq * 100, under600 / seq * 100, under800 / seq * 100, above799 / seq * 100);
    }
}