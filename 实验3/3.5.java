package sdnu.wry.demo;
import java.util.Scanner;
public class Homework {
	public static void main(String[] args) {
	System.out.println("请输入一个代表今天周日期的数字：");
	Scanner input = new Scanner(System.in);
	int num = input.nextInt();
	System.out.println("请输入日期间隔：");
	int gap = input.nextInt();
	int future_day = (gap+num)%7;
	System.out.println("今天是星期"+num+"，"+gap+"天后是星期"+future_day);
	}
}
