package sdnu.wry.demo;
import java.math.BigInteger;
import java.util.*;

public class Homework{
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(4,40);
        System.out.println("矩形长"+r1.getWidth()+"高"+r1.getHeight()+",面积"+r1.getArea()+",周长"+r1.getPerimeter());
        Rectangle r2 = new Rectangle(3.5,35.9);
        System.out.println("矩形长"+r2.getWidth()+"高"+r2.getHeight()+",面积"+r2.getArea()+",周长"+r2.getPerimeter());
    }
}
