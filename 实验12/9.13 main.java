package sndu.wry;

public class Main {
    public static void main(String[] args) {
       double [][] a = new double[3][4];
       System.out.println("随机生成如下数组");
       for (int i = 0;i<3;i++){
           for(int j=0;j<4;j++){
               a[i][j] = Math.random();
               System.out.printf("%.2f\t",a[i][j]);
           }
           System.out.print("\n");
       }
       System.out.printf("数组最大值：%.2f,位置为:(%d,%d)\n",Location.locateLargest(a).maxValue,Location.locateLargest(a).row,Location.locateLargest(a).column);
    }
}
