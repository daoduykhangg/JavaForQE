package PartIIOOP.Lesson58;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class Test {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());

        System.out.println(TimeUnit.HOURS.toSeconds(1));
        Date d = new Date(System.currentTimeMillis());
        System.out.println(d.getDate() + "/" + (d.getMonth() + 1) + "/" + (d.getYear() + 1900));

        Locale lc = new Locale("vi", "VN");
        Calendar c = Calendar.getInstance(lc);
        System.out.println(c.get(Calendar.DATE) + "/" + (c.get(Calendar.MONTH) + 1) + "/" + c.get(Calendar.YEAR));

        DateFormat df = new SimpleDateFormat("dd-MM-YYYY HH:mm:ss");
        System.out.println(df.format(d));
    }
}
