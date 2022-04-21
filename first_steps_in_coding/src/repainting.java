import java.util.Scanner;

public class repainting {
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);
        double nylonPrice = 1.5;
        double paintPrice = 14.5;
        double separatorPrice = 5;
        double bagsPrice = 0.4;
        int nylonQuantity = Integer.parseInt(scanner.nextLine()) + 2;
        double paintQuantity = Double.parseDouble((scanner.nextLine())) * 1.1;
        int separatorQuantity = Integer.parseInt(scanner.nextLine());
        int laborHours = Integer.parseInt(scanner.nextLine());
        double stockPrice = (nylonQuantity * nylonPrice) + (paintQuantity * paintPrice) + (separatorQuantity * separatorPrice) + bagsPrice;
        double laborPrice = stockPrice * 0.3;
        double total = laborHours * laborPrice + stockPrice;
        System.out.println(total);
    }
}
