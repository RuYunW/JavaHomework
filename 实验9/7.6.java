package sdnu.wry.demo;
import java.util.*;

public class Homework{
    public static void main(String[] args){

    	int count=0;
    	for(int i=0;count<=50;i++){

    		if(isPrime(i)){
    			System.out.print(i+" ");
    			count++;
    			if(count%10==0){
    				System.out.println();
				}
			}

		}
    }


    public static boolean isPrime(int number){
    	if(number<=3){
    		return number>1;
    	}
    	if(number%6!=1 && number%6!=5){
    		return false;
    	}
    	int sqrt = (int)Math.sqrt(number);
    	for(int i =5;i<=sqrt;i+=6){
    		if(number%i==0||number%(i+2)==0){
    			return false;
    		}
    	}
    	return true;
    }

}
