package sdnu.wry.demo;
import java.util.Scanner;
public class Homework {
	public static void main(String[] args) {
		double e = 1;
		int n=1;
		double item = 1;
		while (item>1e-6){
			e+=item;
			n++;
			item = 1.0/fact(n);
		}
		System.out.print(e);
	}

	private static double fact(double i){
		double sum = 1;
		for(int m = 1;m<=i;m++){
			sum*=m;
		}
		return sum;
	}
}
