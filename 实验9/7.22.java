package sdnu.wry.demo;
import java.util.*;

public class Homework{
    public static void main(String[] args){
        int [][] put = new int[8][8];
        int [][] effects = new int[8][8];
        for(int row=0;row<8;){//������ȱ���������������
            for(int col=0;col<8 && row<8;){//����
                if(effects[row][col]!=1){//�����ǰ�񲻱�forbidden
                    put[row][col]=1;//��������
                    System.out.println("��������"+row+","+col);
                    //��ֵ��Ӱ��
                    for(int i=0;i<8;i++){
                        effects[row][i]=1;//�н�ֹ
                    }
                    for(int i=0;i<8;i++){
                        effects[i][col]=1;//�н�ֹ
                    }
                    for(int i=row,j=col;Math.max(i,j)<8;i++,j++){
                        effects[i][j]=1;//���ֹ
                    }
                    for(int i=row,j=col;(i<8 && j>=0);i++,j--){
                        effects[i][j]=1;//Ʋ��ֹ
                    }
                    row++;
                    col=0;
                }
                else {//��ǰ�񱻽�ֹ
                    if(col==7){//�����ͷ
                        row--;//���˵���һ��
                        for(int k=0;k<8;k++){//�ҵ��ϲ����ӣ���¼��λֵ�������ظ�����
                            if(put[row][k]==1){
                                col=k;
                                put[row][k]=0;//���ظ�����
                                System.out.println("����"+row+","+col);
                            }
                        }
                        //���ظ����ӵ�Ӱ��
                        for(int i=0;i<8;i++){
                            effects[row][i]=0;//������
                        }
                        for(int i=0;i<8;i++){
                            effects[i][col]=0;//������
                        }
                        for(int i=row,j=col;Math.max(i,j)<8;i++,j++){
                            effects[i][j]=0;//������
                        }
                        for(int i=row,j=col;(i<8 && j>=0);i++,j--){
                            effects[i][j]=0;//Ʋ����
                        }
                        col++;//��һ�е���һ��ʼ���������ж�
                    }
                    else{//���û��ͷ������������һ��
                        col++;
                    }
                }
            }
        }

        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                System.out.print(put[i][j]+" ");
            }
            System.out.println();
        }
    }
}
