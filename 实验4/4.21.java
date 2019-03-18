package sdnu.wry.demo;
import java.util.Scanner;
public class Homework {
	public static void main(String[] args) {
		System.out.println("请输入社保账号：");
		Scanner input = new Scanner(System.in);
		String account = input.nextLine();
		String [] accountArray = account.split("");
		if(accountArray.length!=11){
			System.out.println("输入不合法!");
		}else {
			for(int i=0;i<accountArray.length;i++){
				if(i==3||i==6){
					if(accountArray[i].equals("-")){
					}
					else {
						System.out.println("输入不合法！");
						break;
					}
				}
				else {
					if(Integer.parseInt(accountArray[i])<0||Integer.parseInt(accountArray[i])>9){
						System.out.println("输入不合法！");
						break;
					}
				}
				if(i==accountArray.length-1){
					System.out.println("输入合法！");
				}
			}
		}
	}
}
