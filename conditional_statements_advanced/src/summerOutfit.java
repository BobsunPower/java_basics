import java.util.Scanner;

public class summerOutfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int temperature = Integer.parseInt(scanner.nextLine());
        String dayPart = scanner.nextLine();
        String clothes = "";
        String shoes = "";
        switch (dayPart) {
            case "Morning":
                if (temperature >= 10 && temperature <= 18) {
                    clothes = "Sweatshirt";
                    shoes = "Sneakers";
                } else if (temperature > 18 && temperature <= 24) {
                    clothes = "Shirt";
                    shoes = "Moccasins";
                } else if (temperature >= 25) {
                    clothes = "T-Shirt";
                    shoes = "Sandals";
                } break;
            case "Afternoon":
                if (temperature >= 10 && temperature <= 18) {
                    clothes = "Shirt";
                    shoes = "Moccasins";
                } else if (temperature > 18 && temperature <= 24) {
                    clothes = "T-Shirt";
                    shoes = "Sandals";
                } else if (temperature >= 25) {
                    clothes = "Swim Suit";
                    shoes = "Barefoot";
                } break;
            case "Evening":
                if (temperature >= 10 && temperature <= 18) {
                    clothes = "Shirt";
                    shoes = "Moccasins";
                } else if (temperature > 18 && temperature <= 24) {
                    clothes = "Shirt";
                    shoes = "Moccasins";
                } else if (temperature >= 25) {
                    clothes = "Shirt";
                    shoes = "Moccasins";
                } break;
        }
        System.out.printf("It's %d degrees, get your %s and %s.", temperature, clothes, shoes);
    }
}