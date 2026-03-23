import java.util.*;
public class arraylargest {
    public static int getlargest(int numbers[]){
        int largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<numbers.length;i++ ){
            if(largest<numbers[i]){
                largest=numbers[i];
            }
            if{(smallest>numbers[i]){
                smallest=numbers[i];

            }
        }
        System.out.println("the smallest value is:" + smallest);

        return largest;




    }
    public static void main(String[] args) {
        int numbers[]={12,34,56,78,90};
        System.out.println("the largest value is:" + getlargest(numbers) );

        
    }

    
}
}
