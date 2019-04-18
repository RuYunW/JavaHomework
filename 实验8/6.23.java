package sdnu.wry.demo;
public class Homework {
	public static void main(String[] args) {
		String str = "Welcome to Java";
		System.out.println(str+"中e出现"+count(str,'e')+"次");

	}
	public static int count(String str,char a){
		int count = 0;
		String [] str_arr = str.split("");
		for(int i = 0;i<str_arr.length;i++){
			if(str_arr[i].charAt(0)==a){
				count++;
			}
		}
		return count;
	}
}
