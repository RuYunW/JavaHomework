package sdnu.wry.demo;
public class Homework {
	public static void main(String[] args) {
		String [] plate_number = new String[7];
		for(int i=0;i<plate_number.length;i++){
			if(i<=2){
				plate_number [i] = String.valueOf((char)('A'+(int)(Math.random()*26)));
			}
			else {
				plate_number[i] = String.valueOf((int)(Math.random()*10));
			}
		}
		System.out.println("³µÅÆºÅÎª£º");
		for(int i=0;i<plate_number.length;i++){
			System.out.print(plate_number[i]);
		}
	}
}
