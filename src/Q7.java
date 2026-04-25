import javax.swing.JFrame;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Q7 {
    public static void main(String[] args) {

        Date now = new Date();

        SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm:ss a");
        String currentTime = timeFormat.format(now);

        JFrame frame = new JFrame();
        frame.setSize(400, 200);
        frame.setTitle(currentTime);
        frame.setVisible(true);
    }
}