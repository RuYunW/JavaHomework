package sdnu.wry.demo;
import java.util.Scanner;
public class Homework {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入驾驶距离：");
		float distance = input.nextFloat();
		System.out.println("请输入汽车燃油性能（mile/gallon）：");
		float miles_per_gallon = input.nextFloat();
		System.out.println("请输入价格（yuan/gallon）：");
		float price_per_gallon = input.nextFloat();

		float cost = distance*(1/miles_per_gallon)*price_per_gallon;
		System.out.println("旅程费用为："+cost+"yuan");
	}
}
