package sdnu.wry.demo;
import java.util.Arrays;
import java.util.Scanner;
public class Homework {
	public static void main(String[] args) {
		int [] lottery = new int[3];
		for(int i=0;i<3;i++){
			//随机产生0~9整数
			lottery[i]=(int)(Math.random()*10);
		}
		System.out.println(Arrays.toString(lottery));
		System.out.println("请输入一个3位数:");
		Scanner input = new Scanner(System.in);
		String guess = input.nextLine();

		int[] guess_int_array = new int[3];
		for(int i=0;i<3;i++){
			guess_int_array[i]=Integer.parseInt(guess.split("")[i]);
		}
		int order=0;
		int count=0;
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				if(guess_int_array[j]==lottery[i]){
					if(i==j){
						order++;
					}
					count++;
					break;
				}
			}
		}
		if(order==3){
			System.out.println("奖金$10000");
		}
		else if(count>=3){
			System.out.println("奖金$3000");
		}
		else if(count>=1){
			System.out.println("奖金$1000");
		}
		else {
			System.out.println("对不起，您未中奖");
		}
	}
}
