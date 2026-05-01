import javax.swing.*;
import java.util.Scanner;

public class Q2 {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("Enter first name: ");
        String firstName = input.next();

        System.out.println("Enter last name: ");
        String lastName = input.next();


        String fullname = firstName + " " + lastName;


        JFrame myWindow = new JFrame();
        myWindow.setSize(800, 600);
        myWindow.setTitle(fullname);
        myWindow.setVisible(true);
    }
}