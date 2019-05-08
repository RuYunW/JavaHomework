package sdnu.wry.demo;
import java.util.*;

public class Homework{
    public static void main(String[] args){
//        int[] random = new int[10];
        ArrayList random_list = new ArrayList();
        System.out.println("随机生成10个数字：");
        for(int i=0;i<10;i++){
            random_list.add((int)(Math.random()*54+1));
        }
        System.out.println(random_list);

        ArrayList except_list = new ArrayList();
        System.out.println("\n去除下面5个数字：");
        for(int i=0;i<5;i++){
            except_list.add((int)(Math.random()*54+1));
        }
        System.out.println(except_list);
        System.out.println("结果为：");
        random_list.removeAll(except_list);
        System.out.println(random_list);
    }
}
