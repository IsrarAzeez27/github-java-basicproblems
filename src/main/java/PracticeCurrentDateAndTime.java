import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

public class PracticeCurrentDateAndTime {
    public static void main(String[] args) {

        SimpleDateFormat cdt = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS");

        cdt.setCalendar(Calendar.getInstance(TimeZone.getTimeZone("IST")));

        System.out.println("Now : " + cdt.format(System.currentTimeMillis()));
    }
}
