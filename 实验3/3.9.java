package sdnu.wry.demo;
import java.util.Arrays;
import java.util.Scanner;
public class Homework {
	public static void main(String[] args) {
		System.out.println("������ISBNǰ��λ���֣�");
		Scanner input = new Scanner(System.in);
		String ISBN_9 = input.nextLine();
		String[] ISBN_10_array = ISBN_9.split("");
		//����У��λ
		int sum=0;
		for(int i=0;i<9;i++){
			sum+=Integer.parseInt(ISBN_10_array[i])*(i+1);
		}
		sum=sum%11;
		//У��λ��ֵ
		System.out.print(ISBN_9);
		if(sum==10){
			System.out.print('X');
		} else {
			System.out.print(sum);
		}
	}
}
