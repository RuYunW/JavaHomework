package sdnu.wry.demo;
public class Homework {
	public static void main(String[] args) {
		int sum = 0;
		for(int i=1;i<=10000;i++){
			if(isPrime(i)){
				sum++;
			}
		}
		System.out.println("一共有"+sum+"个素数");
	}
	public static boolean isPrime(int number){
		if(number<=3){
			return number>1;
		}
		if(number%6!=1 && number%6!=5){
			return false;
		}
		int sqrt = (int)Math.sqrt(number);
		for(int i =5;i<=sqrt;i+=6){
			if(number%i==0||number%(i+2)==0){
				return false;
			}
		}
		return true;

	}

}
