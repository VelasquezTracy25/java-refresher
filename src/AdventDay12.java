// Check if the given string is a correct time representation of the 24 hour clock
//

public class AdventDay12 {
    public static void main(String[] args) {
    System.out.println(isValidTime("13:58"));
    System.out.println(isValidTime("25:51"));
    System.out.println(isValidTime("02:76"));
    }

    public static boolean isValidTime(String string) {
        String[] splitTime = string.split(":", 2);
        int hour = Integer.parseInt(splitTime[0]);
        int minute = Integer.parseInt(splitTime[1]);

        if (hour <= 24 && minute < 60) {
            return true;
        }
        return false;
    }

}