package sdnu.wry.demo;
import java.util.*;

public class Homework{
    public static void main(String[] args){
        int [][] put = new int[8][8];
        int [][] effects = new int[8][8];
        for(int row=0;row<8;){//深度优先遍历，层数，行数
            for(int col=0;col<8 && row<8;){//列数
                if(effects[row][col]!=1){//如果当前格不被forbidden
                    put[row][col]=1;//放置棋子
                    System.out.println("放置棋子"+row+","+col);
                    //赋值其影响
                    for(int i=0;i<8;i++){
                        effects[row][i]=1;//行禁止
                    }
                    for(int i=0;i<8;i++){
                        effects[i][col]=1;//列禁止
                    }
                    for(int i=row,j=col;Math.max(i,j)<8;i++,j++){
                        effects[i][j]=1;//捺禁止
                    }
                    for(int i=row,j=col;(i<8 && j>=0);i++,j--){
                        effects[i][j]=1;//撇禁止
                    }
                    row++;
                    col=0;
                }
                else {//当前格被禁止
                    if(col==7){//如果到头
                        row--;//回退到上一行
                        for(int k=0;k<8;k++){//找到上层棋子，记录其位值，并撤回该棋子
                            if(put[row][k]==1){
                                col=k;
                                put[row][k]=0;//撤回该棋子
                                System.out.println("撤回"+row+","+col);
                            }
                        }
                        //撤回该棋子的影响
                        for(int i=0;i<8;i++){
                            effects[row][i]=0;//行允许
                        }
                        for(int i=0;i<8;i++){
                            effects[i][col]=0;//列允许
                        }
                        for(int i=row,j=col;Math.max(i,j)<8;i++,j++){
                            effects[i][j]=0;//捺允许
                        }
                        for(int i=row,j=col;(i<8 && j>=0);i++,j--){
                            effects[i][j]=0;//撇允许
                        }
                        col++;//上一行的下一格开始继续遍历判断
                    }
                    else{//如果没到头，继续遍历下一格
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
