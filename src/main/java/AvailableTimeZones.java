import java.util.TimeZone;

public class AvailableTimeZones {
    public static void main(String[] args) {

        // Get all available time zone IDs
        String[] timeZone = TimeZone.getAvailableIDs();

        System.out.println("Available Time Zones are ");
        for(String zone : timeZone){
            System.out.println(zone);
        }
    }
}
