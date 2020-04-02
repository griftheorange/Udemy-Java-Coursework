public class SpeedConverter {
    public static long toMilesPerHour(double kilometersPerHour){
        double factor = 1.609;
        if(kilometersPerHour > 0){
            return Math.round(kilometersPerHour/factor);
        }
        return -1L;
    }

    public static void printConversion(double kilometersPerHour){
        long miles = toMilesPerHour(kilometersPerHour);
        if(miles > 0){
            System.out.println(String.format("%1$s km/hr = %2$s mi/h", kilometersPerHour, miles));
        } else {
            System.out.println("Invalid Value");
        }
    }
}
