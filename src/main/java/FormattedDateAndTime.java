import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

public class FormattedDateAndTime {
    public static void main(String[] args) {

        SimpleDateFormat s = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS");

        s.setCalendar(Calendar.getInstance(TimeZone.getTimeZone("IST")));
        System.out.println("Now " + s.format(System.currentTimeMillis()));
    }
}
