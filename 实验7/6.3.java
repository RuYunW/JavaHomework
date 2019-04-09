package sdnu.wry.demo;
import java.util.Scanner;
public class Homework {
	public static void main(String[] args) {
		int n = 2324;
		if(isPalindrome(n)){
			System.out.println(n+"是回文数");
		}else {
			System.out.println(n+"不是回文数");
		}
	}

	//返回回文数
	public static int reverse(int number){
		String num_str = number+"";
		StringBuffer buffer = new StringBuffer(num_str);
		String num_rev_str = (buffer.reverse()).toString();
		int num_rev_int = Integer.parseInt(num_rev_str);
		return num_rev_int;
	}

	public static boolean isPalindrome(int number){
		if(number==reverse(number)){
			return true;
		}else {
			return false;
		}
	}
}
