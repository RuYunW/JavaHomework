package sdnu.wry.demo;
import java.util.Date;
import java.text.SimpleDateFormat;
public class Homework {
	public static void main(String[] args) {
	    Date date = new Date();
	    date.getTime() ;
	    SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//�������ڸ�ʽ
		System.out.println(df.format(new Date()));// new Date()Ϊ��ȡ��ǰϵͳʱ��
    }
}
