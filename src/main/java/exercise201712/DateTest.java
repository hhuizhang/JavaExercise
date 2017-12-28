package exercise201712;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by catherine on 17/12/19.
 */
public class DateTest {
    public static String dateToStamp(String s) throws ParseException{
        String res;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = simpleDateFormat.parse(s);
        long ts = date.getTime();
        res = String.valueOf(ts);
        System.out.println(res);
        return  res;

    }

    public static String stampToDate(String s) throws ParseException{
        String res;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        long ts = new Long(s);
        Date date = new Date(ts);
        res = simpleDateFormat.format(date);
        System.out.println(res);
        return  res;
    }

    public static void main(String [] args) throws Exception{
        String dateTime = "2017-12-19 17:59:33";
        String stampTime;
        String dateTime2;
        String stampTime2 = "1513671410209";


        stampTime = DateTest.dateToStamp(dateTime);
        dateTime2 = DateTest.stampToDate(stampTime2);

    }
}
