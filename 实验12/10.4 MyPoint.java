package sndu.wry;

public class MyPoint {
    private double x,y;

    MyPoint(){
        this.x = 0;
        this.y = 0;
    }
    MyPoint(double x,double y){
        this.x = x;
        this.y = y;
    }

    double distance(MyPoint t){
        return Math.sqrt(Math.pow((t.getX()-this.x),2)+Math.pow((t.getY()-this.y),2));
    }

    double distance(double x,double y){
        return Math.sqrt(Math.pow((x-this.x),2)+Math.pow((y-this.y),2));
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }


}
