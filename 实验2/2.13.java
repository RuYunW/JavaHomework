package sdnu.wry.demo;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入每月存入的金额：");
		double money = input.nextDouble();//number  of money saving per month
		System.out.println("请输入存款月数：");
		int m=input.nextInt();//number month of  money saving
		double sumMoney=0;
		for ( int i = 0 ; i < m ; i++ ){
			sumMoney=(money+sumMoney)*(1+0.00417);
		}
		System.out.println(m+"个月后，账户上的钱数为"+sumMoney);
	}
}
