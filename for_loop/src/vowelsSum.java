import java.util.Scanner;

public class vowelsSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String txt = scanner.nextLine();
        int vlu = 0;
        for (int i = 0; i < txt.length(); i++) {
            char sbl = txt.charAt(i);
            if (sbl == 'a') {vlu += 1;}
            else if (sbl == 'e') {vlu += 2;}
            else if (sbl == 'i') {vlu += 3;}
            else if (sbl == 'o') {vlu += 4;}
            else if (sbl == 'u') {vlu += 5;
            }
        }
        System.out.println(vlu);
    }
}