import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = input.nextLine();

        int count = text.length();

        char firstChar = text.charAt(0);

        char lastChar = text.charAt(count - 1);

        System.out.println(count);
        System.out.println(firstChar);
        System.out.println(lastChar);
    }
}
