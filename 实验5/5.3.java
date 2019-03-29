package sdnu.wry.demo;

import java.util.Scanner;

public class Homework {
	public static void main(String[] args) {
		int kg;
		float pond;
		System.out.printf("%-10s","千克");
		System.out.printf("\t");
		System.out.printf("%s","磅");
		System.out.printf("\n");

		for(int i=1;i<=199;i++){
			kg = i;
			pond = kg*2.2f;
			System.out.printf("%-10d",kg);
			System.out.printf("\t");
			System.out.printf("%.1f",pond);
			System.out.printf("\n");
		}
	}
}
