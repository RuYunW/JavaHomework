package sdnu.wry.demo;
import java.math.BigInteger;
import java.text.SimpleDateFormat;
import java.util.*;

public class Homework{
    public static void main(String[] args) {
       Random random = new Random(1000);
       for(int i=0;i<50;i++){
           if(i%10==0){
               System.out.println();
           }
           System.out.print(random.nextInt(100)+"\t");
       }
 }
}
