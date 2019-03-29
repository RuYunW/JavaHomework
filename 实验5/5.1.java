package sdnu.wry.demo;
import java.util.Scanner;
public class Homework { 
	public static void main(String[] args) { 
		System.out.println("可输入任意个整数，计算正负数量，以0为结束标志");
		Scanner input = new Scanner(System.in);
		int pos=0,neg = 0;
		int num = input.nextInt();
		while (num!=0){ 
			if(num>0){ 
				pos++;
			}else { 
				neg++; 
			}
			num=input.nextInt(); 
		}
		System.out.println("正数有"+pos+"个，负数有"+neg+"个"); 
	}
}
