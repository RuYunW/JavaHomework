package sndu.wry;

public class LinearEquation {
    private Point a,b;
    private Point c,d;

    public void setA(Point a) {
        this.a = a;
    }

    public void setB(Point b) {
        this.b = b;
    }

    public void setC(Point c) {
        this.c = c;
    }

    public void setD(Point d) {
        this.d = d;
    }

    public Point getA() {
        return a;
    }

    public Point getB() {
        return b;
    }

    public Point getC() {
        return c;
    }

    public Point getD() {
        return d;
    }

    Point getCrossPoint(){
        Point point = new Point();
        double k1 = (getA().getY()-getB().getY())/(getA().getX()-getB().getX());
        double k2 = (getC().getY()-getD().getY())/(getC().getX()-getD().getX());
//      x=(k1*x0-k2*x2+y2-y0)/(k1-k2);
        point.setX((k1*getA().getX()-k2*getC().getX()+getC().getY()-getA().getY())/(k1-k2));
        point.setY(getA().getY()+(point.getX()-getA().getX())*k1);

//      y=y0+(x-x0)*k1;
        return point;
    }
}
