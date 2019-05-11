package sndu.wry;

import java.util.ArrayList;
import java.util.List;

public class StackOfIntegers {
    private List<Integer> element = new ArrayList<>();

    public List findElement(int num){
        for(int i=2;;i++){
            if(num%i==0){
                this.element.add(i);
                num=num/i;
                i=1;
            }
            if(num==1){
                break;
            }
        }
        return this.element;
    }
}
