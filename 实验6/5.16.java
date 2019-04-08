package sdnu.wry.demo;
import java.util.Scanner;
public class Homework {
	public static void main(String[] args) {
		System.out.println("请输入一个整数：");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for(int i=1;i<=num;i++){
			if(num%i==0 && i!=1){
				System.out.print(i+" ");
				num=num/i;
				i=1;
			}
		}
	}
}
