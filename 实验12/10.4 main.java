package sndu.wry;
public class Main {
    public static void main(String[] args) {
        MyPoint p0 = new MyPoint();
        MyPoint p1 = new MyPoint(10,30.5);
        System.out.println("MyPoint调用："+p1.distance(p0));
        System.out.println("传值调用："+p1.distance(0,0));
    }
}
