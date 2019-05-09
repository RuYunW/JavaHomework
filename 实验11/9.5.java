package sdnu.wry.demo;
import java.math.BigInteger;
import java.text.SimpleDateFormat;
import java.util.*;

public class Homework{
    public static void main(String[] args) {
      GregorianCalendar gregorianCalendar = new GregorianCalendar();
      SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
      System.out.println(sdf.format(gregorianCalendar.getTime()));
      gregorianCalendar.setTimeInMillis(1234567898765L);
      System.out.println(sdf.format(gregorianCalendar.getTime()));

    }
}
