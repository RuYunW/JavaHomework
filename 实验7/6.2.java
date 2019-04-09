package sdnu.wry.demo;
import java.util.Scanner;
public class Homework {
	public static void main(String[] args) {
		System.out.println("请输入一个整数");
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		System.out.println(n+"各位数相加为："+sumDigits(n));
	}
	public static int sumDigits(long n){
		String n_str = n+"";
		String [] n_narry = n_str.split("");
		int sum = 0;
		for(int i = 0;i<n_narry.length;i++){
			sum+=Integer.parseInt(n_narry[i]);
		}
		return sum;
	}
}
