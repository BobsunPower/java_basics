import java.util.Scanner;

public class sumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int seq = Integer.parseInt(scanner.nextLine());
        int vlu = 0;
        for (int i = 0; i < seq; i++)
        {int num = Integer.parseInt(scanner.nextLine());vlu += num;}
        System.out.println(vlu);
    }
}