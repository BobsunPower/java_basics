import java.util.Scanner;

public class animalType {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        String animal = scanner.nextLine();
        String specie;
        switch(animal) {
            case "dog":
                specie = "mammal"; break;
            case "crocodile":case "tortoise": case "snake":
                specie = "reptile"; break;
            default: specie = "unknown";
        }
        System.out.printf(specie);
    }
}