package sdnu.wry.demo;
import java.util.Scanner;
public class Homework {
	public static void main(String[] args) {
	System.out.println("������һ��������������ڵ����֣�");
	Scanner input = new Scanner(System.in);
	int num = input.nextInt();
	System.out.println("���������ڼ����");
	int gap = input.nextInt();
	int future_day = (gap+num)%7;
	System.out.println("����������"+num+"��"+gap+"���������"+future_day);
	}
}
