package sdnu.wry.demo;

import java.util.Scanner;

public class Homework {
	public static void main(String[] args) {
		int time = 10;
		int a,b,result,wrong=0;
		Scanner input = new Scanner(System.in);
		long beginTime = System.currentTimeMillis();
		for(int i=0;i<time;i++){
			a = (int)(Math.random()*15+1);
			b = (int)(Math.random()*15+1);
			System.out.print(a+"+"+b+"=");
			result = input.nextInt();
			if(result!=a+b){
				wrong++;
			}
		}
		long endTime = System.currentTimeMillis();
		System.out.println("错误个数为："+wrong);
		System.out.println("用时:"+(endTime-beginTime)+"ms");
	}
}
