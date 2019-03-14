package sdnu.wry.demo;
import java.util.Arrays;
import java.util.Scanner;
public class Homework {
	public static void main(String[] args) {
		System.out.println("请输入ISBN前九位数字：");
		Scanner input = new Scanner(System.in);
		String ISBN_9 = input.nextLine();
		String[] ISBN_10_array = ISBN_9.split("");
		//计算校验位
		int sum=0;
		for(int i=0;i<9;i++){
			sum+=Integer.parseInt(ISBN_10_array[i])*(i+1);
		}
		sum=sum%11;
		//校验位赋值
		System.out.print(ISBN_9);
		if(sum==10){
			System.out.print('X');
		} else {
			System.out.print(sum);
		}
	}
}
