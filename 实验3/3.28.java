package sdnu.wry.demo;
import java.util.Scanner;
public class Homework {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("请输入第一个矩形中点坐标、宽度和高度：");
		float [] matrix_1 = new float[4];
		for(int i=0;i<4;i++){
			matrix_1[i]=input.nextFloat();
		}

		System.out.println("请输入第二个矩形中点坐标、宽度和高度：");
		float [] matrix_2 = new float[4];
		for(int i=0;i<4;i++){
			matrix_2[i]=input.nextFloat();
		}

		if(Math.abs(matrix_1[0]-matrix_2[0])>(matrix_1[2]/2+matrix_2[2]/2)||Math.abs(matrix_1[1]-matrix_2[1])>(matrix_1[3]/2+matrix_2[3]/2)){
			System.out.println("两矩形不相交");
		}
		else if(Math.abs(matrix_1[0]-matrix_2[0])<(matrix_1[2]/2+matrix_2[2]/2)||Math.abs(matrix_1[1]-matrix_2[1])<(matrix_1[3]/2+matrix_2[3]/2)){

			if((Math.abs(matrix_1[0]-matrix_2[0])+Math.min(matrix_1[2]/2,matrix_2[2]/2))<Math.max(matrix_1[2]/2,matrix_2[2]/2)||(Math.abs(matrix_1[1]-matrix_2[1])+Math.min(matrix_1[3]/2,matrix_2[3]/2))<Math.max(matrix_1[3]/2,matrix_2[3]/2)){
				System.out.println("两矩形包含");
			}
			else{
				System.out.println("两矩形相交");
			}
		}
	}
}
