package sdnu.wry.demo;
public class Homework {
	public static void main(String[] args) {
	    long millis = 555550000;
	    System.out.println(millis+"����Ϊ"+converMillis(millis));
    }
    public static String converMillis(long millis){
	    long h,min,s;
	    h = millis/(1000*60*60);
	    min = (millis-h*3600000)/(1000*60);
	    s = (millis-h*3600000-min*60000)/(1000);
	    return h+"Сʱ"+min+"����"+s+"��";
    }
}
