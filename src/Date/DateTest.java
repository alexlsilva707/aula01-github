package Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class DateTest {
    public static void main(String[] args) throws ParseException{

        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));

        Date d1 = new Date();
        Date d2 = new Date(System.currentTimeMillis());

        Date d3 = sdf1.parse("04/05/1999");
        Date d4 = sdf2.parse("04/05/1999 04:30:12");

        Date d5 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));

        System.out.println(sdf1.format(d1));
        System.out.println(sdf1.format(d2));
        System.out.println(sdf2.format(d3));
        System.out.println(sdf2.format(d4));
        System.out.println(sdf2.format(d5));
        System.out.println(sdf2.format(d5));
        System.out.println(sdf3.format(d5));

        //Calendar

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));

        System.out.println("\nCalendar\n"+sdf.format(d));

        Calendar cal = Calendar.getInstance();
        cal.setTime(d);
        cal.add(Calendar.HOUR_OF_DAY,4);


        d = cal.getTime();
        System.out.println(sdf.format(d));
        int minutes = cal.get(Calendar.MINUTE);
        int month = (cal.get(Calendar.MONTH))+1;

        System.out.println("minutos: " + minutes);
        System.out.println("mes: " + month);

    }
}
