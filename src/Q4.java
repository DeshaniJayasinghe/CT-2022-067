import java.util.Calendar;
import java.util.GregorianCalendar;

public class Q4 {
    public static void main(String[] args) {
        GregorianCalendar cal = new GregorianCalendar();

        int day = cal.get(Calendar.DAY_OF_MONTH);
        int month = cal.get(Calendar.MONTH);
        int year = cal.get(Calendar.YEAR);

        String[] months = {"January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"};

        System.out.println(day + " " + months[month] + " " + year);
    }
}
