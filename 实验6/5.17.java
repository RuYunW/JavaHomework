package sdnu.wry.demo;
import java.util.Scanner;
public class Homework {
	public static void main(String[] args) {
		System.out.println("������һ��1~15֮���������");
		Scanner sc =  new Scanner(System.in);
		int num = sc.nextInt();
		for (int i = 1;i<=num;i++){
				for(int j = 1;j<=num-i;j++){
					System.out.print("   ");
				}
				for(int j = i;j>0;j--){
				System.out.print(j+"  ");
				}
				for(int j = 2;j<=i;j++){
					System.out.print(j+"  ");
				}

			System.out.println("");

		}
	}
}
