import java.util.Scanner;

public class readText {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {String txt = scanner.nextLine();
            if (txt.equals("Stop")) {break;}
            System.out.println(txt);}
    }
}