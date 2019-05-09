package sdnu.wry.demo;
import java.util.*;

public class Homework{
    public static void main(String[] args) {
        int [] x = {0,1,-1,2,-2,-3,-4,5};
        int [] y = {0,1,-1,2,-2,-3,-4,5};

        double [][] distance = new double[8][8];
        for(int i=0;i<8;i++){
            for(int j=i+1;j<8;j++){
                distance[i][j] = Math.sqrt(Math.pow((x[i]-x[j]),2)+Math.pow((y[i]-y[j]),2));
                System.out.printf("%.2f\t",distance[i][j]);
            }
            System.out.println();
        }

        double min = distance[0][1];
        List min_index = new ArrayList();
        List min_x = new ArrayList();
        List min_y = new ArrayList();
//        int min_index_x = 0,min_index_y = 0;
        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                if(distance[i][j]<=min&&distance[i][j]!=0){
                    min=distance[i][j];
//                    min_index_x=i;
//                    min_index_y=j;
                }
            }
        }

        for(int i =0;i<8;i++){
            for(int j=0;j<8;j++){
                if(distance[i][j]==min){
                    min_x.add(i);
                    min_y.add(j);
                }
            }
        }
        for(int i=0;i<min_x.size();i++){
            System.out.println("点("+x[(int)min_x.get(i)]+","+y[(int)min_x.get(i)]+")与点("+x[(int)min_y.get(i)]+","+y[(int)min_y.get(i)]+")");
        };
        System.out.println("最短距离为"+min);
    }

}
