package sdnu.wry.demo;
public class Homework {
	public static void main(String[] args) {
//		int count=0;
		System.out.print("p\t2^p-1\n");
		for(int p = 0;p<=31;p++){
			if(isPrime(Mason(p))){
				System.out.print(p+"\t"+Mason(p)+"\n");
			}
		}
    }
    //ÅÐ¶ÏÊÇ·ñÃ·É­Êý£¬¼´2^p-1
    public static long Mason(int p){
		return (long)(Math.pow(2,p)-1);
	}
    //ÅÐ¶Ï×ªÖÃ
    public static boolean isReverse(long num){
	    String num_str = num+"";
	    StringBuffer buffer = new StringBuffer(num_str);
	    String num_rev_str = buffer.reverse().toString();
	    int num_rev_int = Integer.parseInt(num_rev_str);
	    return num_rev_int==num;
    }
    //×ªÖÃ
    public static long Reverse(long num){
	    String num_str = num+"";
	    StringBuffer buffer = new StringBuffer(num_str);
	    String num_rev_str = buffer.reverse().toString();
	    int num_rev_int = Integer.parseInt(num_rev_str);
	    return num_rev_int;
    }
	//ÅÐ¶ÏÊÇËØÊý
    public static boolean isPrime(long num){
	    if(num<=3){
	        return num>1;
        }
	    if(num%6!=1 && num%6!=5){
	        return false;
        }
	    int sqrt = (int)Math.sqrt(num);
	    for (int i = 5;i<=sqrt;i+=6){
	    	if(num%i==0 || num%(i+2)==0){
	    		return false;
			}
        }
	    return true;
    }
}
