package utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class common {

    public static String getCurrentDate() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy");
        String date = simpleDateFormat.format(new Date());
        return date;
    }
}
