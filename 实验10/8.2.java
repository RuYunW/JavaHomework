package sdnu.wry.demo;
import java.text.DecimalFormat;
import java.util.*;

public class Homework{
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.00");
        double[][] num = new double[4][4];

        //随机生成数组并打印
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                num[i][j]=(Double.valueOf(df.format(Math.random()*2)));
                System.out.print(num[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.printf("主对角求和为：%.2f",sumMajorDiagonal(num));




	}
	public static double sumMajorDiagonal(double[][]num){
        double sum=0;
        for(int i=0;i<4;i++){
            sum+=num[i][i];
        }
        return sum;
    }

}
