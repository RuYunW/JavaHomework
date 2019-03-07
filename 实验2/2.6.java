package sdnu.wry.demo;
import java.util.Scanner;
public class Homework {
    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	System.out.println("请输入一个0——1000的整数：");
    	int num = input.nextInt();//接收输入
    	String ss = ""+num;//将int转换为string
    	String[] str_num = ss.split("");//将每一位分离，存入string[]

    	int sum=0;
    	for(int i=0;i<ss.length();i++){
			sum+=Integer.parseInt(str_num[i]);//将string每一位转换成int相加
		}
    	System.out.println(num+"各个位相加结果为："+sum);
	}
}
