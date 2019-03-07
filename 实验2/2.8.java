package sdnu.wry.demo;
import java.util.*;
import java.text.SimpleDateFormat;
public class Homework {
    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	System.out.println("请输入相对于GMT的时区偏移量：");
    	int delta = input.nextInt();//相对时区偏移量

		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
		System.out.println(df.format(new Date()));// new Date()为获取当前系统时间

		Calendar c = Calendar.getInstance();
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH)+1;
		int day = c.get(Calendar.DATE);
		int hour = c.get(Calendar.HOUR_OF_DAY);
		int minute = c.get(Calendar.MINUTE);
		int second = c.get(Calendar.SECOND);

		System.out.println("当前时间为："+year+"-"+month+"-"+day+" "+hour+":"+minute+":"+second);

		//越界处理
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
		System.out.println("时区偏移后时间为："+year+"-"+month+"-"+day+" "+hour+":"+minute+":"+second);
	}
}