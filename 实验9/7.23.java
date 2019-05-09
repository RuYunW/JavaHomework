package sdnu.wry.demo;
import java.util.*;

public class Homework{
    public static void main(String[] args) {
		Boolean[] L = new Boolean[100];//柜子
		//全置false
		for(int i=0;i<100;i++){
			L[i]=false;
		}

		for(int i=1;i<=100;i++){//学生遍历
			for(int j=1;j<=100;j++){//柜子遍历
				if(j%i==0){
					L[j-1]=change(L[j-1]);
				}
			}
		}

		for(int i=0;i<100;i++){
			if(i%10==0){
				System.out.print("\n");
			}
			if(L[i]){
				System.out.print("开 ");
			}
			else{
				System.out.print("关 ");
			}

		}

	}
	public static boolean change(boolean a){
    	return a==true?false:true;
	}

}
