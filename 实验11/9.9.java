package sdnu.wry.demo;

public class test_ReguUrPolygon {
        public static void main(String[] args) {
            // TODO Auto-generated method stub
            RegularPolygon p1=new RegularPolygon(6,4);
            System.out.println("The Perimeter of p1 is: "+p1.getPerimeter());
            System.out.println("The area of p1 is: "+p1.getArea());
            RegularPolygon p2=new RegularPolygon(10,4,5.6,7.8);
            System.out.println("The Perimeter of p2 is: "+p2.getPerimeter());
            System.out.println("The area of p2 is: "+p2.getArea());
        }

    }

    class RegularPolygon{
        int n=3;
        double side=1;
        double x=0;
        double y=0;
        RegularPolygon(){

        }
        RegularPolygon(int nn,int sside){
            n=nn;
            side=sside;
            x=0;
            y=0;
        }
        RegularPolygon(int nn,double sside,double xx,double yy){
            n=nn;
            side=sside;
            x=xx;
            y=yy;
        }
        public void setN(int nn) {
            n=nn;
        }
        public void setside(int sside) {
            side=sside;
        }
        public void setx(int xx) {
            x=xx;
        }
        public void sety(int yy) {
            y=yy;
        }
        double getPerimeter() {
            return n*side;
        }
        double  getArea() {
            return  ((n*side*side)/(4*Math.tan(3.14/n)));
        }
    }


