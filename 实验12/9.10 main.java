package sndu.wry;

public class Main {
    public static void main(String[] args) {
    QuadraticEquation quadraticEquation = new QuadraticEquation(Math.random(),Math.random(),Math.random());
    System.out.println("������ɲ�������");
    System.out.println("a="+quadraticEquation.getA()+",b="+quadraticEquation.getB()+",c="+quadraticEquation.getC());
    if(quadraticEquation.getDiscriminant()>0){
        System.out.println("�б�ʽ����0����������ʵ������");
        System.out.println(quadraticEquation.getRoot1());
        System.out.println(quadraticEquation.getRoot2());
    }
    else  if(quadraticEquation.getDiscriminant()==0){
        System.out.println("�б�ʽ����0�������������ʵ����");
        System.out.println(quadraticEquation.getRoot1());
    }
    else {
        System.out.println("�б�ʽС���㣬������ʵ����");
    }


    }

}
