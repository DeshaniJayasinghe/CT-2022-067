import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string with an '!': ");
        String text = input.nextLine();


        int exIndex = text.indexOf('!');

        String before = text.substring(0, exIndex);

        String after = text.substring(exIndex + 1);

        System.out.println(before.trim());
        System.out.println(after.trim());
    }
}
