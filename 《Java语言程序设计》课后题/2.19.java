package sdnu.wry.demo;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入x1,y1,x2,y2,并用空格隔开");
		String temp = input.nextLine();
		String[] ss=temp.split(" ");
		double x1=Double.parseDouble(ss[0]);
		double y1=Double.parseDouble(ss[1]);
		double x2=Double.parseDouble(ss[2]);
		double y2=Double.parseDouble(ss[3]);

		double distance = Math.pow(Math.pow(x2-x1,2)+Math.pow(y2-y1,2),0.5);
		System.out.println(x1+" "+x2+" "+y1+" "+y2);
		System.out.println(distance);
		
    }
}
