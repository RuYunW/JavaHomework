package sdnu.wry.demo;
import java.util.Scanner;
public class Homework {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("������Ա��������");
		String name = input.nextLine();
		System.out.println("�����빤��ʱ�䣺");
		Float work_hour = input.nextFloat();
		System.out.println("������ÿСʱ���");
		Float wages_per_hour = input.nextFloat();
		System.out.println("��������������˰˰�ʣ�%");
		Float tax_rate_of_unity = input.nextFloat();
		System.out.println("������������˰˰�ʣ�%");
		Float tax_rate_of_state = input.nextFloat();
		System.out.println("-------------������ϸ--------------");
		System.out.println("Ա������\t��"+name);
		System.out.println("����ʱ��\t:"+work_hour);
		System.out.println("Сʱ���\t:"+wages_per_hour);
		Float pre_tex_wages = wages_per_hour*work_hour;
		System.out.println("˰ǰ����\t:"+pre_tex_wages);
		Float tax_of_unity = pre_tex_wages*tax_rate_of_unity/100;
		System.out.println("��������˰:");
		System.out.println("\t�����˰("+tax_rate_of_unity+"%)\t:"+tax_of_unity);
		Float tax_of_state = pre_tex_wages*tax_rate_of_state/100;
		System.out.println("\t�ݿ�˰("+tax_rate_of_state+"%)\t:"+tax_of_state);
		Float tax = tax_of_unity+tax_of_state;
		System.out.println("\t�ܿ�˰\t:"+tax);
		System.out.println("ʵ������\t:"+(pre_tex_wages-tax));
	}
}
