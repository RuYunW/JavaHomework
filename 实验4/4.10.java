package sdnu.wry.demo;
import java.util.Scanner;
public class Homework {
	public static void main(String[] args) {
		String set1 =
				"1 3 5 7 "+
				"9 11 13 15 "+
				"17 19 21 13 "+
				"25 27 29 31";
		String set2 =
				"2 3 6 7 "+
				"10 11 14 15 "+
				"18 19 22 23 "+
				"26 27 30 31";
		String set3 =
				"4 5 6 7 "+
				"12 13 14 15 "+
				"20 21 22 23 "+
				"28 29 30 31";
		String set4 =
				"8 9 10 11 "+
				"12 13 14 15 "+
				"24 25 26 27 "+
				"28 29 30 31";
		String set5 =
				"16 17 18 19 "+
				"20 21 22 23 "+
				"24 25 26 27 "+
				"28 29 30 31";

		char answer;
		int day = 0;
		Scanner input = new Scanner(System.in);
		for(int i=0;i<5;i++){
			System.out.println("你的生日在集合"+(i+1)+"吗？");
			switch (i){
				case 0:System.out.println(set1);break;
				case 1:System.out.println(set2);break;
				case 2:System.out.println(set3);break;
				case 3:System.out.println(set4);break;
				case 4:System.out.println(set5);break;
			}
			System.out.println("Y/N?");
			answer = input.next().charAt(0);
			if(answer=='Y'){
				day+=Math.pow(2,i);
			}
		}

		System.out.println("生日是"+day);
	}
}
