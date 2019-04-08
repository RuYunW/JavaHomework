package sdnu.wry.demo;
import java.util.Scanner;
public class Homework {
	public static void main(String[] args) {
		System.out.println("请输入两个正整数：");
		Scanner sc = new Scanner(System.in);
		int a,b;
		a = sc.nextInt();
		b = sc.nextInt();
		int d = Math.min(a,b);
		for(int i = d;i>0;i--){
			if(a%i==0 && b%i==0){
				System.out.println(a+"和"+b+"的最大公约数为："+i);
				break;
			}
		}
	}
}
