package sdnu.wry.demo;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("������ÿ�´���Ľ�");
		double money = input.nextDouble();//number  of money saving per month
		System.out.println("��������������");
		int m=input.nextInt();//number month of  money saving
		double sumMoney=0;
		for ( int i = 0 ; i < m ; i++ ){
			sumMoney=(money+sumMoney)*(1+0.00417);
		}
		System.out.println(m+"���º��˻��ϵ�Ǯ��Ϊ"+sumMoney);

    }
}
