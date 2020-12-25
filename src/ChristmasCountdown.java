//Countdown seconds to Christmas

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class ChristmasCountdown {
    public static void main(String[] args) throws ParseException {
christmasCountdown();
    }

    public static void christmasCountdown() throws ParseException {
        DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
        Date now = new Date();
        Date christmas = df.parse("12/25/2020 12:00:00");

        long diffInMills = Math.abs(christmas.getTime() - now.getTime());

        long diff = TimeUnit.DAYS.convert(diffInMills, TimeUnit.MILLISECONDS);
        System.out.println(diff);


        System.out.println("There are " + (diff) + "left until Christmas");
    }
}
