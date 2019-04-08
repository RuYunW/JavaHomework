package sdnu.wry.demo;
public class Homework {
	public static void main(String[] args) {
		System.out.println("默认输出2019年日历");
		int begin_day=2;
		for(int i = 1;i<=12;i++){
			begin_day = PrintMonth(i,begin_day);
		}
	}

	private static int PrintMonth(int month,int begin_day){
		int[] month_list = {31,28,31,30,31,30,31,31,30,31,30,31};
		System.out.println("\t\t"+"2019 "+month+"\t\t");
		System.out.println("----------------------------");
		System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat");
		for(int i =0;i<begin_day;i++){
			System.out.print("\t");
		}
		int i = 1;
		for(i = 1;i<=month_list[month-1];i++){
			System.out.print(i+"\t");
//			System.out.print((i+week_num-1)%7+"\t");
			if((i+begin_day)%7==0){
				System.out.print("\n");
			}
		}
		System.out.print("\n\n");
		return (i+begin_day-1)%7;
	}
}
