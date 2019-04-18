package sdnu.wry.demo;
public class Homework {
	public static void main(String[] args) {
	    for(int i = 1;i<=100;i++){
	        System.out.print(RandomCharacter('A','Z'));
	        if(i%10==0){
	            System.out.println("");
            }
        }
	    for(int i = 1;i<=100;i++){
	        System.out.print(RandomCharacter('0','9'));
	        if(i%10==0){
	            System.out.println("");
            }
        }


    }
    public static char RandomCharacter(char start,char end){
	    char a = (char)(Math.random()*((int)end-(int)start+1)+(int)start);
	    return a;
    }
}

