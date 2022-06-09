import java.util.Scanner;

public class graduation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        double tot = 0;
        int fail = 0;
        for (int i = 1; i <= 12; i++) {double grade = Double.parseDouble(scan.nextLine());
            if (grade < 4) {fail++;}
            if (fail > 1) {System.out.printf("%s has been excluded at %d grade", name, i-1);return;}
            tot += grade;}
        System.out.printf("%s graduated. Average grade: %.2f", name, tot / 12);
    }
}