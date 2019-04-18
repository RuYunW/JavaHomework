package sdnu.wry.demo;
public class Homework {
	public static void main(String[] args) {
		int count=0;
		for(long i = 1;;i++){
			if(isPrime(i) && isReverse(i)){
				System.out.print(i+"\t");
				count++;
				if(count%10==0){
					System.out.print('\n');
				}
			}
			
			if(count>=100){
				break;
			}
		}

    }
    public static boolean isReverse(long num){
	    String num_str = num+"";
	    StringBuffer buffer = new StringBuffer(num_str);
	    String num_rev_str = buffer.reverse().toString();
	    int num_rev_int = Integer.parseInt(num_rev_str);
	    return num_rev_int==num;
    }

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
