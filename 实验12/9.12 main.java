package sndu.wry;

public class Main {
    public static void main(String[] args) {
        System.out.println("��������ĸ���");
        LinearEquation linearEquation = new LinearEquation();
        linearEquation.setA(new Point((int)(Math.random()*10),(int)(Math.random()*10)));
        linearEquation.setB(new Point((int)(Math.random()*10),(int)(Math.random()*10)));
        linearEquation.setC(new Point((int)(Math.random()*10),(int)(Math.random()*10)));
        linearEquation.setD(new Point((int)(Math.random()*10),(int)(Math.random()*10)));
        System.out.println("A("+linearEquation.getA().getX()+","+linearEquation.getA().getY()+")");
        System.out.println("B("+linearEquation.getB().getX()+","+linearEquation.getB().getY()+")");
        System.out.println("C("+linearEquation.getC().getX()+","+linearEquation.getC().getY()+")");
        System.out.println("D("+linearEquation.getD().getX()+","+linearEquation.getD().getY()+")");

        System.out.println("����Ϊ��("+linearEquation.getCrossPoint().getX()+","+linearEquation.getCrossPoint().getY()+")");
    }

}
