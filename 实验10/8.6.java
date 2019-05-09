package sdnu.wry.demo;
import java.util.*;

public class Homework{
    public static void main(String[] args) {
        int[][] a = new int[3][3];
        int[][] b = new int[3][3];

        System.out.println("�����������");
        //������ɾ���a,b
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                a[i][j]=(int)(Math.random()*9+1);
                b[i][j]=(int)(Math.random()*9+1);
            }
        }

        System.out.println("����aΪ��");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("����bΪ��");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(b[i][j]+"\t");
            }
            System.out.println();
        }

        //��ӡ�������
        System.out.println("��˺���Ϊ��");
        int[][]c=multiplyMatrix(a,b);
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(c[i][j]+"\t");
            }
            System.out.println();
        }
        
    }
    //�������
    public static int[][] multiplyMatrix (int[][] a,int[][] b){
        int[][] c=new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                c[i][j]=a[i][0]*b[0][j]+a[i][1]*b[1][j]+a[i][2]*b[2][j];
            }
        }
        return c;
    }
}
