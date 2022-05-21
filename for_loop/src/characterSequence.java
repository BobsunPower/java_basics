import java.util.Scanner;

public class characterSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String txt = scanner.nextLine();
        for (int i = 0; i < txt.length(); i++) {char sbl = txt.charAt(i); System.out.println(sbl);}
    }
}