package sdnu.wry.demo;
import java.text.DecimalFormat;
import java.util.*;

public class Homework{
    public static void main(String[] args){
//        int[] random = new int[10];
        ArrayList random_list = new ArrayList();
        System.out.println("随机生成10个数字：");
        //精度限制2位
        DecimalFormat df = new DecimalFormat("#.00");
        for(int i=0;i<10;i++){
            random_list.add(Double.valueOf(df.format(Math.random()*10)));
        }
        System.out.println(random_list);

        System.out.println("排序后结果如下：");
        Collections.sort(random_list);
        System.out.println(random_list);

    }
}
