package sdnu.wry.demo;
import javax.swing.*;
import java.util.*;

public class Homework{
    public static void main(String[] args){
        System.out.println("�������10������");
        ArrayList arrayList = new ArrayList();
//        String [] array = new String[10];
        for(int i=0;i<10;i++){
            arrayList.add(""+(int)(Math.random()*10));
            System.out.print(arrayList.get(i)+" ");
        }
//         System.out.println(arrayList);
        System.out.println("\nת�ú�");
        Collections.reverse(arrayList);
        for(int i=0;i<arrayList.size();i++){
            System.out.print(arrayList.get(i)+" ");
        }



    }
}
