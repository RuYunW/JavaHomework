package sndu.wry;

public class Point {
    private double x,y;
    Point(double x,double y){
        this.x = x;
        this.y = y;
    }
    Point(){

    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}
