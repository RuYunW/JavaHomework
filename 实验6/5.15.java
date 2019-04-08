package sdnu.wry.demo;
import java.util.Scanner;
public class Homework {
	public static void main(String[] args) {
		char a = '!',b='~';
		for(int i = (int)a;i<(int)b;i++){
			System.out.print((char)i+" ");
			if((i+1-(int)a)%10==0){
				System.out.println("");
			}
		}
	}
}
