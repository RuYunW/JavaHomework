package sdnu.wry.demo;
import java.util.Scanner;
public class Homework {
    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	System.out.println("���������������������ֽ���ת��Ϊ���������");
    	int minutes = input.nextInt();
    	float hours = (float)minutes/60;
    	float days = hours/24;
    	float years = days/365;
    	
    	System.out.println(minutes+"���Ӵ�Լ��"+(int)years+"��"+(int)(days-(int)years*365)+"��");
	}
}
