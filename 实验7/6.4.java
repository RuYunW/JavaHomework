package sdnu.wry.demo;
public class Homework {
	public static void main(String[] args) {
		int n = 1234;
		System.out.println("ԭ��Ϊ"+n);
		System.out.println("������Ϊ��"+reverse(n));
	}

	//���ػ�����
	public static int reverse(int number){
		String num_str = number+"";
		StringBuffer buffer = new StringBuffer(num_str);
		String num_rev_str = (buffer.reverse()).toString();
		int num_rev_int = Integer.parseInt(num_rev_str);
		return num_rev_int;
	}
}
