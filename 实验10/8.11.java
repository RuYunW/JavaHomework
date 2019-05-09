package sdnu.wry.demo;
import java.math.BigInteger;
import java.util.*;

public class Homework{
    public static void main(String[] args) {
        System.out.println("随机生成如下数字：");
        long coin = (int)(Math.random()*512);
        System.out.println(coin);
        BigInteger coin_bi = new BigInteger(String.valueOf(coin));
        String coin_bin_str = bin(coin_bi);
        String add = "";
        if(coin_bin_str.length()<9){
            for(int i =0;i<9-coin_bin_str.length();i++){
                add+="0";
            }
            coin_bin_str = add+coin_bin_str;
        }
        System.out.println(coin_bin_str);

        for(int i=0;i<9;i++){
            if(i%3==0){
                System.out.println();
            }
            System.out.print((coin_bin_str.charAt(i)=='1'?"T":"H")+"\t");
        }
    }
    public static String bin(BigInteger coin){
        return coin.toString(2);
    }
}
