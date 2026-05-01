import javax.swing.JFrame;
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Frame Width (W): ");
        int w = input.nextInt();

        System.out.print("Enter Frame Height (H): ");
        int h = input.nextInt();

        input.nextLine();

        System.out.print("Enter Frame Title: ");
        String title = input.nextLine();


        JFrame frame = new JFrame();
        frame.setSize(w, h);
        frame.setTitle(title);
        frame.setVisible(true);
    }
}