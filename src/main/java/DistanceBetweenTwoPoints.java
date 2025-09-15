import java.util.Scanner;

public class DistanceBetweenTwoPoints {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input latitude cooridinate 1 : ");
        double lat1 = sc.nextDouble();
        System.out.println("Input latitude cooridinate 1 : ");
        double long1 = sc.nextDouble();

        System.out.println("Input latitude cooridinate 2 : ");
        double lat2 = sc.nextDouble();
        System.out.println("Input latitude cooridinate 2 : ");
        double long2 = sc.nextDouble();

        System.out.print("The distance between those points is: " + distance_Between_LatLong(lat1, long1, lat2, long2) + " km\n");
    }

    public static double distance_Between_LatLong(double lat1, double long1, double lat2, double long2){
        //convert latitude tp radians
        lat1 = Math.toRadians(lat1);
        long1 = Math.toRadians(long1);
        lat2 = Math.toRadians(lat2);
        long2 = Math.toRadians(long2);

        // Earth's mean radius in kilometers
        double earthRadius = 6371.01;

        // Calculate the distance using the haversine formula
        return earthRadius * Math.acos(Math.sin(lat1) * Math.sin(lat2) + Math.cos(lat1) * Math.cos(lat2) * Math.cos(long1 - long2));
    }
}
