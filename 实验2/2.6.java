package sdnu.wry.demo;
import java.util.Scanner;
public class Homework {
    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	System.out.println("������һ��0����1000��������");
    	int num = input.nextInt();//��������
    	String ss = ""+num;//��intת��Ϊstring
    	String[] str_num = ss.split("");//��ÿһλ���룬����string[]

    	int sum=0;
    	for(int i=0;i<ss.length();i++){
			sum+=Integer.parseInt(str_num[i]);//��stringÿһλת����int���
		}
    	System.out.println(num+"����λ��ӽ��Ϊ��"+sum);
	}
}
