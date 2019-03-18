package sdnu.wry.demo;
import java.util.Scanner;
public class Homework {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入员工姓名：");
		String name = input.nextLine();
		System.out.println("请输入工作时间：");
		Float work_hour = input.nextFloat();
		System.out.println("请输入每小时酬金：");
		Float wages_per_hour = input.nextFloat();
		System.out.println("请输入联邦所得税税率：%");
		Float tax_rate_of_unity = input.nextFloat();
		System.out.println("请输入州所得税税率：%");
		Float tax_rate_of_state = input.nextFloat();
		System.out.println("-------------工资明细--------------");
		System.out.println("员工姓名\t："+name);
		System.out.println("工作时长\t:"+work_hour);
		System.out.println("小时酬金\t:"+wages_per_hour);
		Float pre_tex_wages = wages_per_hour*work_hour;
		System.out.println("税前工资\t:"+pre_tex_wages);
		Float tax_of_unity = pre_tex_wages*tax_rate_of_unity/100;
		System.out.println("个人所得税:");
		System.out.println("\t联邦扣税("+tax_rate_of_unity+"%)\t:"+tax_of_unity);
		Float tax_of_state = pre_tex_wages*tax_rate_of_state/100;
		System.out.println("\t州扣税("+tax_rate_of_state+"%)\t:"+tax_of_state);
		Float tax = tax_of_unity+tax_of_state;
		System.out.println("\t总扣税\t:"+tax);
		System.out.println("实发工资\t:"+(pre_tex_wages-tax));
	}
}
