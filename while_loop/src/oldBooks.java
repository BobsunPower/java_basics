import java.util.Scanner;

public class oldBooks {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String wantedBook = scan.nextLine();
        String currentBook = scan.nextLine();
        int checkedBooks = 0;
        while (!currentBook.equals(wantedBook))
        {if (currentBook.equals("No More Books"))
        {System.out.println("The book you search is not here!"); System.out.printf("You checked %d books.", checkedBooks);return;}
            checkedBooks++; currentBook = scan.nextLine();}
        System.out.printf("You checked %d books and found it.", checkedBooks);
    }
}