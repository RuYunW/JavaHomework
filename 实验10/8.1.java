package sdnu.wry.demo;
import java.util.*;

public class Homework{
    public static void main(String[] args) {
		int [][] num = new int[3][4];
		//��ʼ���������Ԫ�ظ�ֵ
    	for(int i=0;i<3;i++){
    		for(int j=0;j<4;j++){
    			num[i][j]=(int)(Math.random()*10+1);
			}
		}
    	//��ӡ����
    	for(int i=0;i<3;i++){
    		for(int j=0;j<4;j++){
    			System.out.print(num[i][j]+"\t");
			}
    		System.out.print("\n");
		}

    	for(int i=0;i<4;i++){
    		System.out.println("��"+(i+1)+"�������Ϊ��"+sumColumn(num,i));
		}

    }

    public static int sumColumn(int[][] num,int columnIndex){
    	int sum=0;
    	for(int row=0;row<3;row++){
    		sum+=num[row][columnIndex];

		}
    	return sum;
	}

}
