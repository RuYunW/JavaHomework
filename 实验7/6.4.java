package sdnu.wry.demo;
public class Homework {
	public static void main(String[] args) {
		int n = 1234;
		System.out.println("原数为"+n);
		System.out.println("回文数为："+reverse(n));
	}

	//返回回文数
	public static int reverse(int number){
		String num_str = number+"";
		StringBuffer buffer = new StringBuffer(num_str);
		String num_rev_str = (buffer.reverse()).toString();
		int num_rev_int = Integer.parseInt(num_rev_str);
		return num_rev_int;
	}
}
