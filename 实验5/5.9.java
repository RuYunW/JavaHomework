package sdnu.wry.demo;
import java.util.Scanner;
public class Homework {
	public static void main(String[] args) {
		System.out.println("请输入学生个数:");
		Scanner input = new Scanner(System.in);
		int num;
		num = input.nextInt();
		String[] name = new String[num];
		float[] grade = new float[num];
		System.out.println("请输入姓名、成绩，并用空格隔开:");
		for(int i = 0;i<num;i++){
			System.out.println("请输入第"+i+"名学生信息：");
			name[i] = input.next();
			grade[i] = input.nextFloat();
		}
		int max_index=0,sec_index=0;
		float max = grade[0],sec=0;
		for(int i = 0;i<num;i++){
			if(max<grade[i]){
				max = grade[i];
				max_index=i;
			}
			if(grade[i]>sec&&grade[i]<max){
				sec_index=i;
				sec = grade[i];
			}
		}
		System.out.println("第一名："+name[max_index]+",成绩为"+grade[max_index]);
		System.out.println("第二名："+name[sec_index]+",成绩为"+grade[sec_index]);

	}
}
