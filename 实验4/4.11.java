package sdnu.wry.demo;
import java.util.Scanner;
public class Homework {
	public static void main(String[] args) {
		System.out.println("������0~15��һ��������");
		Scanner input = new Scanner(System.in);
		int oct = input.nextInt();
		if(oct>15){
			System.out.println("���벻�Ϸ�");
		}else {
			System.out.println("ʮ������"+oct+"ת��Ϊ16������"+Integer.toHexString(oct));
		}
	}
}
