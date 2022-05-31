import java.util.Scanner;

public class password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String usr = scanner.nextLine(); String pwd = scanner.nextLine();
        while (true) {String tryPwd = scanner.nextLine();
            if (tryPwd.equals(pwd)) {System.out.printf("Welcome %s!", usr); break;}}}
}