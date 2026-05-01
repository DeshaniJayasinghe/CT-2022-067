import javax.swing.JFrame;

public class Q13 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        frame.setSize(500, 300);
        frame.setTitle("Centered Frame");


        frame.setLocationRelativeTo(null);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setVisible(true);
    }
}
