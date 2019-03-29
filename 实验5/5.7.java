、package sdnu.wry.demo;
、
、import java.util.Scanner;
、
、public class Homework {
、	public static void main(String[] args) {
、		long begin_money = 10000;
、		long money = begin_money;
、		for(int i=0;i<10;i++){
、			money *= 1.05;
、		}
、		System.out.println("十年后学费为：$"+money);
、		long sum=0;
、		for(int i=0;i<4;i++){
、			money*=1.05;
、			sum+=money;
、		}
、		System.out.println("十年后四年学费为：$"+sum);
、	}
、}
