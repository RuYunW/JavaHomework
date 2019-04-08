package sdnu.wry.demo;
import java.util.Scanner;
public class Homework {
	public static void main(String[] args) {
		double sum = 0;
		for(int i = 1;i<=97;i++){
			sum+=(double)i/(double)(i+2);
		}
		System.out.print(sum);
	}
}
