package sdnu.wry.demo;
import java.math.BigInteger;
import java.util.*;

public class Homework{
    public static void main(String[] args) {
        int [][]matrix = new int[5][5];
        //�������5*5��0-1���󲢴�ӡ
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                matrix[i][j] = (int)(Math.random()+0.5);
                System.out.print(matrix[i][j]+"\t");
            }
            System.out.println();
        }
        maxSubMatrix(matrix);
    }
    public static void maxSubMatrix(int[][] matrix){
        int index_i=0,index_j=0;
        int maxSize = 1;
        int max_dim=1;
        int dim_i=0,dim_j=0;
        int []count = new int[5];
        boolean[][]flag = new boolean[5][5];
        for(int row=0;row<5;row++){
            for(int col=0;col<5;col++){
                for(int dim=5-Math.max(row,col);dim>0;dim--){
                    if(sumIndex(matrix,row,col,dim)==0||sumIndex(matrix,row,col,dim)==(dim*dim)){//���ȫΪ0��ȫΪ1
                        max_dim = dim;
                        dim_i = row;dim_j=col;
                        break;//�ҵ���ǰ�ڵ�������������Сѭ��
                    }
                }
                if(max_dim>maxSize){//����ȼ�¼ֵ������¼�¼
                    maxSize=max_dim;
                    index_i = dim_i;
                    index_j = dim_j;
                }

            }

        }
        System.out.println("���ֵ������ʼ��ַ��("+index_i+","+index_j+"),��СΪ��"+maxSize);
    }

    public static int sumIndex(int[][]matrix,int i,int j,int dim){
        int sum=0;
        for(int p = 0;p<dim;p++){
            for(int q=0;q<dim;q++){
                sum+=matrix[i+p][j+q];
            }
        }
        return sum;
    }
}
