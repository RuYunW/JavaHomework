package sdnu.wry.demo;
import java.util.Scanner;
public class Homework { 
	public static void main(String[] args) { 
		System.out.println("���������������������������������0Ϊ������־");
		Scanner input = new Scanner(System.in);
		int pos=0,neg = 0;
		int num = input.nextInt();
		while (num!=0){ 
			if(num>0){ 
				pos++;
			}else { 
				neg++; 
			}
			num=input.nextInt(); 
		}
		System.out.println("������"+pos+"����������"+neg+"��"); 
	}
}
