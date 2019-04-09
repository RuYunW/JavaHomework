package sdnu.wry.demo;
public class Homework {
	public static void main(String[] args) {
		for(int i = 2000;i<=2020;i++){
			System.out.println(i+"年天数为："+numberOfDaysInAYear(i));
		}
	}
	public static int numberOfDaysInAYear(int year){
		if(year%4==0&&year%100!=0){
			return 366;
		}
		else if(year%40==0){
			return 366;
		}
		else {
			return 365;
		}
	}
}
