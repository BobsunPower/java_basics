import java.util.Scanner;

public class examPreparation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int limit = Integer.parseInt(scan.nextLine());
        int badGrades = 0; int grades = 0; double tot = 0;
        String task = ""; String input = scan.nextLine();
        while (!input.equals("Enough")) {double score = Double.parseDouble(scan.nextLine());
            if (score <= 4) {badGrades++;
                if (badGrades == limit) {System.out.printf("You need a break, %d poor grades.", badGrades); return;
                }else {task = input; grades++; tot += score;}
            } else {task = input; grades++; tot += score;}
            input = scan.nextLine();}
        System.out.printf("Average score: %.2f%n", tot / grades);
        System.out.printf("Number of problems: %d%n", grades);
        System.out.printf("Last problem: %s", task);
    }
}