package sdnu.wry.demo;
import java.math.BigInteger;
import java.text.SimpleDateFormat;
import java.util.*;

public class Homework{
    public static void main(String[] args) {
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        System.out.println(sdf.format(new Date(d.getTime()+10000)));
        System.out.println(sdf.format(new Date(d.getTime()+100000)));
        System.out.println(sdf.format(new Date(d.getTime()+1000000)));
        System.out.println(sdf.format(new Date(d.getTime()+10000000)));
        System.out.println(sdf.format(new Date(d.getTime()+100000000)));
        System.out.println(sdf.format(new Date(d.getTime()+1000000000)));
//        System.out.println(date);
 }
}
