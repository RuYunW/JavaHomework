package sdnu.wry.demo;
import java.util.*;

public class Homework{
    public static void main(String[] args){
//        int[] random = new int[10];
        ArrayList random_list = new ArrayList();
        System.out.println("�������10�����֣�");
        for(int i=0;i<10;i++){
            random_list.add((int)(Math.random()*54+1));
        }
        System.out.println(random_list);

        ArrayList except_list = new ArrayList();
        System.out.println("\nȥ������5�����֣�");
        for(int i=0;i<5;i++){
            except_list.add((int)(Math.random()*54+1));
        }
        System.out.println(except_list);
        System.out.println("���Ϊ��");
        random_list.removeAll(except_list);
        System.out.println(random_list);
    }
}
