package sdnu.wry.demo;
import java.util.Scanner;
public class Homework {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("�������ʻ���룺");
		float distance = input.nextFloat();
		System.out.println("����������ȼ�����ܣ�mile/gallon����");
		float miles_per_gallon = input.nextFloat();
		System.out.println("������۸�yuan/gallon����");
		float price_per_gallon = input.nextFloat();

		float cost = distance*(1/miles_per_gallon)*price_per_gallon;
		System.out.println("�ó̷���Ϊ��"+cost+"yuan");
	}
}
