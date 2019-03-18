package sdnu.wry.demo;
import java.util.Scanner;
public class Homework {
	public static void main(String[] args) {
		System.out.println("请输入0~15间一个整数：");
		Scanner input = new Scanner(System.in);
		int oct = input.nextInt();
		if(oct>15){
			System.out.println("输入不合法");
		}else {
			System.out.println("十进制数"+oct+"转换为16进制是"+Integer.toHexString(oct));
		}
	}
}
