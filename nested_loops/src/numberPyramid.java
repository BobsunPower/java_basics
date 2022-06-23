import java.util.Scanner;

public class numberPyramid {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine()); int num = 1;
        for (int rows = 1; rows <= n; rows++)
        {for (int columns = 1; columns <= rows; columns++)
        {if (num > n) {break;}
                System.out.print(num + " "); num++;}
            System.out.println();
            if (num > n) {break;}}}
}
