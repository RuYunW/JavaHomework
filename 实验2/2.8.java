package sdnu.wry.demo;
import java.util.*;
import java.text.SimpleDateFormat;
public class Homework {
    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	System.out.println("�����������GMT��ʱ��ƫ������");
    	int delta = input.nextInt();//���ʱ��ƫ����

		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//�������ڸ�ʽ
		System.out.println(df.format(new Date()));// new Date()Ϊ��ȡ��ǰϵͳʱ��

		Calendar c = Calendar.getInstance();
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH)+1;
		int day = c.get(Calendar.DATE);
		int hour = c.get(Calendar.HOUR_OF_DAY);
		int minute = c.get(Calendar.MINUTE);
		int second = c.get(Calendar.SECOND);

		System.out.println("��ǰʱ��Ϊ��"+year+"-"+month+"-"+day+" "+hour+":"+minute+":"+second);

		//Խ�紦��
		if((hour+delta)<0){
			hour=hour+24+delta;
			day-=1;
		}
		else if((hour+delta)>24){
			hour=hour-24+delta;
			day+=1;
		}
		else {
			hour+=delta;
		}
		System.out.println("ʱ��ƫ�ƺ�ʱ��Ϊ��"+year+"-"+month+"-"+day+" "+hour+":"+minute+":"+second);
	}
}