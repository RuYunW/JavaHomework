package sdnu.wry.demo;
import java.util.Scanner;
public class Homework {
    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	System.out.println("请输入分钟整数，这个数字将被转化为年和天数：");
    	int minutes = input.nextInt();
    	float hours = (float)minutes/60;
    	float days = hours/24;
    	float years = days/365;
    	
    	System.out.println(minutes+"分钟大约是"+(int)years+"年"+(int)(days-(int)years*365)+"天");
	}
}
