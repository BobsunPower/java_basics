import java.util.Scanner;

public class operationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fst = Integer.parseInt(scanner.nextLine());
        double sec = Integer.parseInt(scanner.nextLine());
        String sign = scanner.nextLine();
        double res = 0;
        String evenOrOdd = "odd";
        switch(sign) {
            case "+": res = fst + sec; break;
            case "-": res = fst - sec; break;
            case "*": res = fst * sec; break;
            case "/": res = fst / sec; break;
            case "%": res = fst % sec; break;
        }
        if (res % 2 == 0) {evenOrOdd = "even";}
        if (sec == 0 && (sign.equals("/") || sign.equals("%"))) {System.out.printf("Cannot divide %d by zero", fst);}
        else if (sign.equals("/")) {System.out.printf("%d %s %.0f = %.2f", fst, sign, sec, res);}
        else if (sign.equals("%")) {System.out.printf("%d %s %.0f = %.0f", fst, sign, sec, res);}
        else {System.out.printf("%d %s %.0f = %.0f - %s", fst, sign, sec, res, evenOrOdd);}
    }
}