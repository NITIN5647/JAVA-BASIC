import java.util.*;
public class Arrayff {
    public static void bubblesort(int numbers[]){
    for(int turn=0;turn<numbers.length-1;turn++){
        for(int j=0;j<numbers.length-1-turn;j++){
          if(numbers[j]>numbers[j+1]){
           int temp=numbers[j+1];
           numbers[j+1]=numbers[j];
           numbers[j]=temp;

          }  

        }
    }
} 
        public static void printnumbers(int numbers[]){
            for(int i=0;i<numbers.length;i++){
               System.out.print( numbers[i]); 

            }
       
            System.out.println( );
               
        }  
        
        

    public static void main(String args[]){
        int numbers[]={1,2,3,4,5,6};
        bubblesort(numbers);
        printnumbers(numbers);
    }

        

     

    
    



    
}
