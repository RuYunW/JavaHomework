package sdnu.wry.demo;
import java.util.Scanner;
public class Homework {
	public static void main(String[] args) {
		int h;//һ�������е�ĳһ��
		int q;//����
		int m;//�·�
		int y;//��
		int j;//������
		int k;//�����͵ĵڼ���
		Scanner input = new Scanner(System.in);
		System.out.println("�������꣺");
		y=input.nextInt();
		System.out.println("�������£�");
		m=input.nextInt();
		if(m<=2){
			m=m+12;
			y=y-1;
		}
		System.out.println("��������");
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
