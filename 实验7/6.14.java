package sdnu.wry.demo;
public class Homework {
	public static void main(String[] args) {
	    double m=1;
	    for(int i = 2;i<=1000;i++){
	    	if(i%2==0){
	    		m-=unit(i);
			}
	    	else {
	    		m+=unit(i);
			}
	    	if(i%100==1){
	    		System.out.printf("%d\t\t\t%.4f\n",i,(4*m));
			}
		}
	    System.out.printf("pie=%.4f",(4*m));
	}
	public static double unit(int n){
		return 1.0/(2*n-1);
	}

}
