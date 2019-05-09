package sdnu.wry.demo;
import java.math.BigInteger;
import java.util.*;

public class Homework{
    public static void main(String[] args) {
        Point [] points1 = {
                new Point(1,1),
                new Point(2,2),
                new Point(3,3),
                new Point(4,4),
                new Point(5,5)
        };
        Point [] points2 = {
                new Point(3.4,2),
                new Point(6.5,9.5),
                new Point(2.3,2.3),
                new Point(5.5,5),
                new Point(-5,4)
        };
        for(int i=0;i<points1.length;i++){
            System.out.print("("+points1[i].getX()+","+points1[i].getY()+")\t");
        }
        System.out.println(sameLine(points1));
        for(int i=0;i<points2.length;i++){
            System.out.print("("+points2[i].getX()+","+points2[i].getY()+")\t");
        }
        System.out.println(sameLine(points2));
    }
    public static boolean sameLine(Point[] points){
//        double k = (points[0].getY()-points[1].getY())/(points[0].getX()-points[1].getX());
//        double [] k = new double[points.length-1];
        List<Double> list = new ArrayList<>();
        double k=0,count=0;
        Map map = new HashMap();
        for(int i=0;i<points.length-1;i++){
            k = (points[i].getY()-points[i+1].getY())/(points[i].getX()-points[i+1].getX());
            if(map.get(k)==null){
                map.put(k,1);
            }
            else{
                map.put(k,(int)map.get(k)+1);
            }
        }
        return map.size()==1;
    }
}
