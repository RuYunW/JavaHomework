package sndu.wry;
public class Main {
    public static void main(String[] args) {
        MyPoint p0 = new MyPoint();
        MyPoint p1 = new MyPoint(10,30.5);
        System.out.println("MyPoint���ã�"+p1.distance(p0));
        System.out.println("��ֵ���ã�"+p1.distance(0,0));
    }
}
