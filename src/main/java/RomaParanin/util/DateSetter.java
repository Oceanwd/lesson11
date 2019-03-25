package RomaParanin.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateSetter {
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy : HH-mm");

    private static DateSetter dateSetterInstance;

    public static DateSetter getDateSetterInstance(){
        if(dateSetterInstance == null){
            dateSetterInstance = new DateSetter();
        }
        return dateSetterInstance;
    }

    public static String getDate(){
        LocalDateTime time = LocalDateTime.now();
        return time.format(formatter);
    }
}
