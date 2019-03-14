package sdnu.wry.demo;
import java.util.Scanner;
public class Homework {
	public static void main(String[] args) {
		int h;//一个星期中的某一天
		int q;//日期
		int m;//月份
		int y;//年
		int j;//世纪数
		int k;//该世纪的第几年
		Scanner input = new Scanner(System.in);
		System.out.println("请输入年：");
		y=input.nextInt();
		System.out.println("请输入月：");
		m=input.nextInt();
		if(m<=2){
			m=m+12;
			y=y-1;
		}
		System.out.println("请输入日");
		q=input.nextInt();

		j=Math.abs(y/100);
		k=y%100;
		h=(q+26*(m+1)/10+k+k/4+j/4+5*j)%7;

		String week;
		switch (h){
			case 0:week="Saturday";break;
			case 1:week="Sunday";break;
			case 2:week="Monday";break;
			case 3:week="Tuesday";break;
			case 4:week="Wednesday";break;
			case 5:week="Thurday";break;
			case 6:week="Friday";break;
			default:week="error";break;
		}
		System.out.println("Today is "+week);
	}
}
