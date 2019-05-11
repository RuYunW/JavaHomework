package sndu.wry;

public class Main {
    public static void main(String[] args) {
    QuadraticEquation quadraticEquation = new QuadraticEquation(Math.random(),Math.random(),Math.random());
    System.out.println("随机生成参数如下");
    System.out.println("a="+quadraticEquation.getA()+",b="+quadraticEquation.getB()+",c="+quadraticEquation.getC());
    if(quadraticEquation.getDiscriminant()>0){
        System.out.println("判别式大于0，方程有两实数根：");
        System.out.println(quadraticEquation.getRoot1());
        System.out.println(quadraticEquation.getRoot2());
    }
    else  if(quadraticEquation.getDiscriminant()==0){
        System.out.println("判别式等于0，方程有两相等实数根");
        System.out.println(quadraticEquation.getRoot1());
    }
    else {
        System.out.println("判别式小于零，方程无实数根");
    }


    }

}
