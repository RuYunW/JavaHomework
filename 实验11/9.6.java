package sdnu.wry.demo;
import java.math.BigInteger;
import java.text.SimpleDateFormat;
import java.util.*;

import static java.lang.Thread.sleep;

public class Homework{
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();

        try {
            Thread.sleep((long)(Math.random()*10000));
        } catch (Exception e) {
            e.printStackTrace();
        }
        stopWatch.stop();
        System.out.println("Á÷ÊÅ"+stopWatch.getElapsedTime());

    }
}
