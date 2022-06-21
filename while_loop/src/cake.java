import java.util.Scanner;

public class cake {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int width = Integer.parseInt(scan.nextLine());
        int length = Integer.parseInt(scan.nextLine());
        int pieces = length * width;
        String data = scan.nextLine();
        while (!data.equals("STOP")) {
            int takenPieces = Integer.parseInt(data);
            if (pieces < takenPieces) {System.out.printf("No more cake left! You need %d pieces more.", takenPieces - pieces); return;}
            else {pieces -= takenPieces;}
            data = scan.nextLine();}
        System.out.printf("%d pieces are left.", pieces);
    }
}