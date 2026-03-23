import java.util.*;
public class arraysmallest {
    public static int getsmallest(int numbers[]){
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<numbers.length;i++){
            if (smallest>numbers[i]){
                smallest=numbers[i];

                
            }   


        }
        return smallest;

    }
    public static void main(String[] args) {
        int numbers[]={1,2,3,4,6};
        System.out.println("the smalest value is:" + getsmallest(numbers));



          
        
    }



    
}




