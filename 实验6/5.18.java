package sdnu.wry.demo;
import java.util.Scanner;
public class Homework {
	public static void main(String[] args) {
		int num = 6;
		//图案1
		for(int i=1;i<=num;i++){
			for(int j = 1;j<=i;j++){
				System.out.print(j+" ");
			}
			System.out.print('\n');
		}

		//图案2
		System.out.print('\n');
		for(int i=num;i>=1;i--){
			for(int j = 1;j<=i;j++){
				System.out.print(j+" ");
			}
			System.out.print('\n');
		}

		//图案3
		System.out.print('\n');
		for(int i=1;i<=num;i++){
			for(int j =num;j>=i;j--){
				System.out.print("  ");
			}
			for(int j = i;j>0;j--){
				System.out.print(j+" ");
			}
			System.out.print('\n');
		}

		//图案4
		System.out.print('\n');
		for(int i=num;i>=1;i--){
			for(int j =num;j>i;j--){
				System.out.print("  ");
			}
			for(int j = 1;j<=i;j++){
				System.out.print(j+" ");
			}
			System.out.print('\n');
		}
	}
}
