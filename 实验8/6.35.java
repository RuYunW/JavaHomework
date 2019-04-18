package sdnu.wry.demo;
public class Homework {
	public static void main(String[] args) {
	   System.out.println(5.5+"边长的五边形面积为"+area(5.5));
    }
    public static double area(double side){
		return (5*side*side)/(4*Math.tan(Math.PI/5));
	}
}

