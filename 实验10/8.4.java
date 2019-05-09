package sdnu.wry.demo;
import java.util.*;

public class Homework{
    public static void main(String[] args) {
        int[][] num = new int[7][7];

        System.out.println("随机生成数组");
        //随机生成数组并打印
        for(int i=0;i<7;i++){
            for(int j=0;j<7;j++){
                num[i][j]=(int)(Math.random()*9+1);
                System.out.print(num[i][j]+"\t");
            }
            System.out.println();
        }

        int[] sumTime = sortRow(num);//每行总工时数

        System.out.println();
        int max=sumTime[0],max_index=0;
        for(int i=0;i<7;i++){
            //找数组最大值
            for(int j=0;j<7;j++){
                if(max<sumTime[j]){
                    max=sumTime[j];
                    max_index=j;
                }
            }
            printRow(num,max_index);
            System.out.println("总工时："+sumTime[max_index]);
            sumTime[max_index]=0;
            max=0;max_index=0;
        }
	}

	//打印指定行
	public static void printRow(int[][]num,int row){
        for(int i=0;i<7;i++){
            System.out.print(num[row][i]+"\t");
        }
    }

	//返回一个总工时数组
	public static int[] sortRow(int[][]num){
       int [] sumTime = new int[7];
       for(int i=0;i<7;i++){
           sumTime[i]=sumRow(num,i);
       }
       return sumTime;
    }

    //计算每行总工时数
    public static int sumRow(int [][]num,int row){
        int sum=0;
        for(int i=0;i<7;i++){
            sum+=num[row][i];
        }
        return sum;
    }
}
