package sdnu.wry.demo;
public class Homework {
	public static void main(String[] args) {
	    int point1,point2;
		int result = 0;

		for(int round=1;;round++){
			point1 = (int)(Math.random()*6+1);
			point2 = (int)(Math.random()*6+1);
			result = game(point1,point2,round,result);
			if(result==0){
				System.out.println(point1+"+"+point2+"="+(point1+point2));
				System.out.print("lose");
				break;
			}
			else if(result==13){
				System.out.println(point1+"+"+point2+"="+(point1+point2));
				System.out.print("win");
				break;
			}
			else {
				System.out.println(point1+"+"+point2+"="+(point1+point2));
			}
		}

    }

    public static int game(int point1,int point2,int round,int last_result){
	    int sum = point1+point2;
	    if(round==1){
	        if(sum==2||sum==3||sum==12){
	            return 0;//输了
            }
	        else if(sum==7||sum==11) {
                return 13;//赢了
            }
	        else {
	            return sum;//进行下一轮游戏
            }
        }
	    else if(round>=2){
	        if(sum==7){
	            return 0;
            }
	        else if(sum==last_result){
	            return 13;
            }
	        else{
	            return sum;
            }
        }
	    return sum;
    }
}

