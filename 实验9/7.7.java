package sdnu.wry.demo;
import javax.swing.*;
import java.util.*;

public class Homework{
    public static void main(String[] args){
//        System.out.println("������1��100�������:");
//        Scanner sc = new Scanner(System.in);
//        String input = sc.nextLine();

//        String [] input_array = input.split(" ");
        String [] array = new String[100];
        for(int i=0;i<array.length;i++){
            array[i] = ""+(int)(Math.random()*10);
        }
        Map<String,Integer> map = new HashMap<>();

        for(String str:array){
            Integer num = map.get(str);
            map.put(str,num==null?1:num+1);//���֮ǰû�У����¼��룬����У���+1
        }
        Set set = map.entrySet();
        Iterator it = set.iterator();
        while (it.hasNext()){
            Map.Entry<String,Integer> entry = (Map.Entry<String, Integer>)it.next();
//            if(entry.getValue()==1){
                System.out.println(entry.getKey()+"����"+entry.getValue()+"��");
//            }


        }

    }
}
