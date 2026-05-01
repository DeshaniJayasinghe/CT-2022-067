import java.util.Calendar;
import java.util.GregorianCalendar;

public class Q5 {
    public static void main(String[] args) {
        GregorianCalendar cal = new GregorianCalendar();

        String[] days = {"", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        String[] months = {"January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"};

        String dayName = days[cal.get(Calendar.DAY_OF_WEEK)];
        String monthName = months[cal.get(Calendar.MONTH)];
        int day = cal.get(Calendar.DAY_OF_MONTH);
        int year = cal.get(Calendar.YEAR);

        System.out.println(dayName + ", " + monthName + " " + day + ", " + year);
    }
}