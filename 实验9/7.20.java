package sdnu.wry.demo;
import java.text.DecimalFormat;
import java.util.*;

public class Homework{
    public static void main(String[] args){
//        int[] random = new int[10];
        ArrayList random_list = new ArrayList();
        System.out.println("�������10�����֣�");
        //��������2λ
        DecimalFormat df = new DecimalFormat("#.00");
        for(int i=0;i<10;i++){
            random_list.add(Double.valueOf(df.format(Math.random()*10)));
        }
        System.out.println(random_list);

        System.out.println("����������£�");
        Collections.sort(random_list);
        System.out.println(random_list);

    }
}
