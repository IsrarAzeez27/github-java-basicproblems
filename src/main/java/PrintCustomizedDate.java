import java.text.SimpleDateFormat;
import java.util.Date;

public class PrintCustomizedDate {
    public static void main(String[] args) {

        Date d = new Date();
        SimpleDateFormat s = new SimpleDateFormat("M/d/yyyy");
        // Print name customized way
        System.out.println("Customized way - " + s.format(d));

        SimpleDateFormat s1 = new SimpleDateFormat("M/d/yyyy hh:mm:ss");
        // Print name customized way
        System.out.println("Customized way - "+s1.format(d));

        // Print Date conventional way
        System.out.println("Conventional way - "+d);
    }
}
