package sdnu.wry.demo;
public class Homework {
	public static void main(String[] args) {
		double x0=1,y0=1,x1=2,y1=2,x2=3,y2=3;
		if(leftOfTheLine(x0,y0,x1,y2,x2,y2)){
			System.out.println("���ߵ����");
		}
		else if(onTheSameLine(x0,y0,x1,y1,x2,y2)){
			System.out.println("������");
		}
		else if(onTheLineSegment(x0,y0,x1,y1,x2,y2)){
			System.out.println("���ߵ��ӳ�����");
		}
		else{
			System.out.println("���ߵ��ұ�");
		}

	}

	public static boolean leftOfTheLine(double x0,double y0,double x1,double y1,double x2,double y2){
		return (((x1-x0)*(y2-y0)-(x2-x0)*(y1-y0))>0);
	}

	public static boolean onTheSameLine(double x0,double y0,double x1,double y1,double x2,double y2){

		if(((x0<=x2)&&(x2<=x1))||(x0>=x2)&&(x2>=x1)){
			return ((x1-x0)*(y2-y0)-(x2-x0)*(y1-y0))==0;
		}
		return false;
	}

	public static boolean onTheLineSegment(double x0,double y0,double x1,double y1,double x2,double y2){

		if(!(((x0<=x2)&&(x2<=x1))||(x0>=x2)&&(x2>=x1))){
			return ((x1-x0)*(y2-y0)-(x2-x0)*(y1-y0))==0;
		}
		return false;
	}

}

