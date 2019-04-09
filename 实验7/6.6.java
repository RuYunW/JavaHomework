package sdnu.wry.demo;
public class Homework {
	public static void main(String[] args) {
	    displayPattern(6);
	}
	public static void displayPattern(int n){
		for(int i = 1;i<=n;i++){
		    for(int j = n-i;j>=0;j--){
		    	System.out.print("\t");
			}
			for(int j = i;j>=1;j--){
				System.out.print(j+"\t");

			}
			System.out.print("\n");
		}
	}
}
